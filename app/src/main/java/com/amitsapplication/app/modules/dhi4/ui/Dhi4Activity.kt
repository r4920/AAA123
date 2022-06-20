package com.amitsapplication.app.modules.dhi4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.base.BaseActivity
import com.amitsapplication.app.databinding.ActivityDhi4Binding
import com.amitsapplication.app.modules.dhi4.`data`.viewmodel.Dhi4VM
import kotlin.String
import kotlin.Unit

class Dhi4Activity : BaseActivity<ActivityDhi4Binding>(R.layout.activity_dhi_4) {
  private val viewModel: Dhi4VM by viewModels<Dhi4VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi4VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDownload.setOnClickListener {
      // TODO please, add your navigation code here
    }
  }

  companion object {
    const val TAG: String = "DHI4ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
