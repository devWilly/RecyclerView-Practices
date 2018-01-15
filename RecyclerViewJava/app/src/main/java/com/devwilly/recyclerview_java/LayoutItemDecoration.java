package com.devwilly.recyclerview_java;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;


/**
 * Created by Willy on 15/01/2018.
 */

public class LayoutItemDecoration extends RecyclerView.ItemDecoration {

    private Context mContext;

    public LayoutItemDecoration(Context context) {
        this.mContext = context;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int leftMargin = getDimensionPixelSize(R.dimen.rv_left_margin);
        int topMargin;
        int rightMargin = getDimensionPixelSize(R.dimen.rv_right_margin);
        int bottomMargin = 0;

        int position = parent.getChildLayoutPosition(view);
        int itemCount = parent.getAdapter().getItemCount();

        if (position == 0) { // first item
            topMargin = getDimensionPixelSize(R.dimen.rv_first_item_top_margin);
        } else if (itemCount - 1 == position) { // last item
            topMargin = getDimensionPixelSize(R.dimen.rv_top_margin);
            bottomMargin = getDimensionPixelSize(R.dimen.rv_last_item_bottom_margin);
        } else { // another item
            topMargin = getDimensionPixelSize(R.dimen.rv_top_margin);
        }
        outRect.set(leftMargin, topMargin, rightMargin, bottomMargin);
    }

    private int getDimensionPixelSize(int resId) {
        return mContext.getResources().getDimensionPixelSize(resId);
    }
}
