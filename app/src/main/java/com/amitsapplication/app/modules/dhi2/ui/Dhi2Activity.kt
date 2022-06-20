package com.amitsapplication.app.modules.dhi2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.base.BaseActivity
import com.amitsapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.amitsapplication.app.databinding.ActivityDhi2Binding
import com.amitsapplication.app.extensions.NoInternetConnection
import com.amitsapplication.app.extensions.hideKeyboard
import com.amitsapplication.app.extensions.showProgressDialog
import com.amitsapplication.app.modules.abc.ui.AbcActivity
import com.amitsapplication.app.modules.dhi2.`data`.viewmodel.Dhi2VM
import com.amitsapplication.app.modules.dhi3.ui.Dhi3Activity
import com.amitsapplication.app.network.models.createlist.CreateListResponse
import com.amitsapplication.app.network.resources.ErrorResponse
import com.amitsapplication.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Dhi2Activity : BaseActivity<ActivityDhi2Binding>(R.layout.activity_dhi_2) {
  private val viewModel: Dhi2VM by viewModels<Dhi2VM>()

  private val REQUEST_CODE_DHI3ACTIVITY: Int = 417

  private val REQUEST_CODE_ABC_ACTIVITY: Int = 944

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi2VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtPhotos.setOnClickListener {
      this@Dhi2Activity.hideKeyboard()
      viewModel.callCreateListApi()
    }
    binding.btnShare.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.btnDownload.setOnClickListener {
        val destIntent = AbcActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_ABC_ACTIVITY)
      }
    }

    override fun addObservers() {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@Dhi2Activity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@Dhi2Activity.showProgressDialog()
        } else  {
          progressDialog?.dismiss()
        }
      }
      viewModel.createListLiveData.observe(this@Dhi2Activity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateList(it)
        } else if(it is ErrorResponse)  {
          onErrorCreateList(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateList(response: SuccessResponse<CreateListResponse>) {
      viewModel.bindCreateListResponse(response.data)
      val destIntent = AbcActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

    private fun onErrorCreateList(exception: Exception) {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
      }
      val destIntent = Dhi3Activity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DHI3ACTIVITY)
    }

    companion object {
      const val TAG: String = "DHI2ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Dhi2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
