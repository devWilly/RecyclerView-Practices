package com.devwilly.recyclerviewkotlin

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by Willy on 15/01/2018.
 */
class LayoutItemDecoration(context: Context) : RecyclerView.ItemDecoration() {

    private val mContext: Context = context

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        val leftMargin = getDimensionPixelSize(R.dimen.rv_left_margin)
        val topMargin: Int
        val rightMargin = getDimensionPixelSize(R.dimen.rv_right_margin)
        var bottomMargin = 0

        val position = parent?.getChildLayoutPosition(view)
        val itemCount = parent?.adapter?.itemCount

        if (position == 0) { // first item
            topMargin = getDimensionPixelSize(R.dimen.rv_first_item_top_margin)
        } else if (itemCount?.minus(1) == position) { // last item
            topMargin = getDimensionPixelSize(R.dimen.rv_top_margin)
            bottomMargin = getDimensionPixelSize(R.dimen.rv_last_item_bottom_margin)
        } else {
            topMargin = getDimensionPixelSize(R.dimen.rv_top_margin)
        }

        outRect?.set(leftMargin, topMargin, rightMargin, bottomMargin)
    }

    private fun getDimensionPixelSize(resId: Int): Int {
        return mContext.resources.getDimensionPixelSize(resId)
    }
}