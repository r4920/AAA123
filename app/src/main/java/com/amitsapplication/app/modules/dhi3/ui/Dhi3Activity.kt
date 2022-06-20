package com.amitsapplication.app.modules.dhi3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.base.BaseActivity
import com.amitsapplication.app.databinding.ActivityDhi3Binding
import com.amitsapplication.app.modules.dhi3.`data`.model.Group31RowModel
import com.amitsapplication.app.modules.dhi3.`data`.viewmodel.Dhi3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Dhi3Activity : BaseActivity<ActivityDhi3Binding>(R.layout.activity_dhi_3) {
  private val viewModel: Dhi3VM by viewModels<Dhi3VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val group31Adapter = Group31Adapter(viewModel.group31List.value?:mutableListOf())
    binding.recyclerGroup31.adapter = group31Adapter
    group31Adapter.setOnItemClickListener(
    object : Group31Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Group31RowModel) {
        onClickRecyclerGroup31(view, position, item)
      }
    }
    )
    viewModel.group31List.observe(this) {
      group31Adapter.updateData(it)
    }
    binding.dhi3VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGroup31(
    view: View,
    position: Int,
    item: Group31RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DHI3ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
