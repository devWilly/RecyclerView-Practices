package com.devwilly.recyclerview_java;

import com.devwilly.recyclerview_java.viewholders.BaseViewHolder;
import com.devwilly.recyclerview_java.viewholders.FoodViewHolder;
import com.devwilly.recyclerview_java.viewholders.FruitViewHolder;
import com.devwilly.recyclerview_java.viewholders.UnknownViewHolder;
import com.devwilly.recyclerview_java.wrapper.IEatingWrapper;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * Created by Willy on 15/01/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    public interface OnItemClickListener {
        void onFoodItemClick(String itemName);
    }

    private ArrayList<IEatingWrapper> mItemList = new ArrayList<>();
    private OnItemClickListener mOnItemClickListener;

    public RecyclerViewAdapter(ArrayList<IEatingWrapper> itemList) {
        this.mItemList = itemList;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case IEatingWrapper.FRUIT:
                view = inflater.inflate(R.layout.fruit_item_view, parent, false);
                return new FruitViewHolder(view);
            case IEatingWrapper.FOOD:
                view = inflater.inflate(R.layout.food_item_view, parent, false);
                return new FoodViewHolder(view, mOnItemClickListener);
            default:
                view = inflater.inflate(R.layout.unknown_item_view, parent, false);
                return new UnknownViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindView(mItemList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mItemList.get(position).getItemType();
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
