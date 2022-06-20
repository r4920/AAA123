package com.amitsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.base.BaseActivity
import com.amitsapplication.app.databinding.ActivityAppNavigationBinding
import com.amitsapplication.app.modules.abc.ui.AbcActivity
import com.amitsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.amitsapplication.app.modules.dhi2.ui.Dhi2Activity
import com.amitsapplication.app.modules.dhi3.ui.Dhi3Activity
import com.amitsapplication.app.modules.dhi4.ui.Dhi4Activity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearABC.setOnClickListener {
      val destIntent = AbcActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear4.setOnClickListener {
      val destIntent = Dhi4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear2.setOnClickListener {
      val destIntent = Dhi2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear3.setOnClickListener {
      val destIntent = Dhi3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
