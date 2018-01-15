package com.devwilly.recyclerviewkotlin.viewholders

import android.view.View
import com.devwilly.recyclerviewkotlin.wrapper.IEatingWrapper

/**
 * Created by Willy on 15/01/2018.
 */
class UnknownViewHolder(itemView: View) : BaseViewHolder<IEatingWrapper>(itemView) {

    override fun bindView(t: IEatingWrapper) {
        //nothing to do
    }
}