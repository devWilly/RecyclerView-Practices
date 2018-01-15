package com.devwilly.recyclerview_java.viewholders;

import com.devwilly.recyclerview_java.R;
import com.devwilly.recyclerview_java.wrapper.FoodWrapper;

import android.view.View;
import android.widget.TextView;


/**
 * Created by Willy on 15/01/2018.
 */

public class FoodViewHolder extends BaseViewHolder<FoodWrapper> {

    private TextView mFoodName;
    private TextView mFoodDescription;
    private TextView mFoodPrice;

    public FoodViewHolder(View itemView) {
        super(itemView);
        mFoodName = itemView.findViewById(R.id.food_name);
        mFoodDescription = itemView.findViewById(R.id.food_description);
        mFoodPrice = itemView.findViewById(R.id.food_price);
    }

    @Override
    public void bindView(FoodWrapper wrapper) {
        mFoodName.setText(wrapper.getName());
        mFoodDescription.setText(wrapper.getDescription());
        mFoodPrice.setText(wrapper.getPrice());
    }
}
