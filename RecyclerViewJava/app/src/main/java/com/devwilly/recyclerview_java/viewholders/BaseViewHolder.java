package com.devwilly.recyclerview_java.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by Willy on 15/01/2018.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindView(T t);
}
