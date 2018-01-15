package com.devwilly.recyclerviewkotlin.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by Willy on 15/01/2018.
 */
abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bindView(t: T)
}