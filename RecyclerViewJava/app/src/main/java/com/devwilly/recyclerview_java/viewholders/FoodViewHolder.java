package com.devwilly.recyclerview_java.viewholders;

import com.devwilly.recyclerview_java.R;
import com.devwilly.recyclerview_java.RecyclerViewAdapter;
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
    private RecyclerViewAdapter.OnItemClickListener mListener;

    public FoodViewHolder(View itemView, RecyclerViewAdapter.OnItemClickListener listener) {
        super(itemView);
        this.mListener = listener;

        mFoodName = itemView.findViewById(R.id.food_name);
        mFoodDescription = itemView.findViewById(R.id.food_description);
        mFoodPrice = itemView.findViewById(R.id.food_price);
    }

    @Override
    public void bindView(final FoodWrapper wrapper) {
        mFoodName.setText(wrapper.getName());
        mFoodDescription.setText(wrapper.getDescription());
        mFoodPrice.setText(wrapper.getPrice());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onFoodItemClick(wrapper.getName());
            }
        });
    }
}
