package com.amitsapplication.app.modules.abc.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.base.BaseActivity
import com.amitsapplication.app.databinding.ActivityAbcBinding
import com.amitsapplication.app.modules.abc.`data`.model.SpinnerYourtripsModel
import com.amitsapplication.app.modules.abc.`data`.viewmodel.AbcVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class AbcActivity : BaseActivity<ActivityAbcBinding>(R.layout.activity_abc) {
  private val viewModel: AbcVM by viewModels<AbcVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerYourtripsList.value = mutableListOf(
    SpinnerYourtripsModel("Item1"),
    SpinnerYourtripsModel("Item2"),
    SpinnerYourtripsModel("Item3"),
    SpinnerYourtripsModel("Item4"),
    SpinnerYourtripsModel("Item5")
    )
    val spinnerYourtripsAdapter =
    SpinnerYourtripsAdapter(this,R.layout.spinner_item,viewModel.spinnerYourtripsList.value?:
    mutableListOf())
    binding.spinnerYourtrips.adapter = spinnerYourtripsAdapter
    binding.abcVM = viewModel
    setUpSearchViewViewguideListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewViewguideListener(): Unit {
    binding.searchViewViewguide.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "ABC_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AbcActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
