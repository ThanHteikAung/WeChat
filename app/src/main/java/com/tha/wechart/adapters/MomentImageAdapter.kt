package com.tha.wechart.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tha.wechart.R
import com.tha.wechart.view.viewholders.MomentImageViewHolder

class MomentImageAdapter : BaseRecyclerAdapter<MomentImageViewHolder>() {

    private var mUserMomentImageList = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MomentImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_moment_image_item, parent, false)
        return MomentImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MomentImageViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        mUserMomentImageList.let {
            holder.bindData(mUserMomentImageList[position])
        }

    }

    override fun getItemCount(): Int {
        return mUserMomentImageList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(userMomentImageList: ArrayList<String>) {
        mUserMomentImageList = userMomentImageList
        notifyDataSetChanged()
    }


}