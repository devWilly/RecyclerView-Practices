package com.devwilly.recyclerview_java.viewholders;

import com.devwilly.recyclerview_java.R;
import com.devwilly.recyclerview_java.wrapper.FruitWrapper;
import com.devwilly.recyclerview_java.wrapper.IEatingType;

import android.view.View;
import android.widget.TextView;


/**
 * Created by Willy on 15/01/2018.
 */

public class FruitViewHolder extends BaseViewHolder<FruitWrapper> {

    private TextView mFruitName;
    private TextView mFruitDescription;
    private TextView mFruitPrice;

    public FruitViewHolder(View itemView) {
        super(itemView);
        mFruitName = itemView.findViewById(R.id.fruit_name);
        mFruitDescription = itemView.findViewById(R.id.fruit_description);
        mFruitPrice = itemView.findViewById(R.id.fruit_price);
    }

    @Override
    public void bindView(FruitWrapper wrapper) {
        mFruitName.setText(wrapper.getName());
        mFruitDescription.setText(wrapper.getDescription());
        mFruitPrice.setText(wrapper.getPrice());
    }
}
