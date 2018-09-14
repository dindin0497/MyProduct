package com.my.myproduct

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.my.myproduct.databinding.DialogChooseQuantityBinding


class ChooseQuantityDialog : DialogFragment() {

    // data binding
    lateinit var mBinding: DialogChooseQuantityBinding

    var mOnItemClickListener: AdapterView.OnItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
        Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i))

        (activity as IMainActivity).setQuantity(Integer.parseInt(adapterView.getItemAtPosition(i) as String))
        dialog.dismiss()
    }

    var mCloseDialogListener: View.OnClickListener = View.OnClickListener { dialog.dismiss() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = DialogChooseQuantityBinding.inflate(inflater)
        mBinding.listView.setOnItemClickListener(mOnItemClickListener)
        mBinding.closeDialog.setOnClickListener(mCloseDialogListener)

        return mBinding.getRoot()
    }

    companion object {

        private val TAG = "ChooseQuantityDialog"
    }
}


























