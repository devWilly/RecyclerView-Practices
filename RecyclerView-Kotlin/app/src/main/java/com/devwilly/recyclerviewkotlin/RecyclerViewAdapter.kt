package com.devwilly.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devwilly.recyclerviewkotlin.viewholders.BaseViewHolder
import com.devwilly.recyclerviewkotlin.viewholders.FoodViewHolder
import com.devwilly.recyclerviewkotlin.viewholders.FruitViewHolder
import com.devwilly.recyclerviewkotlin.viewholders.UnknownViewHolder
import com.devwilly.recyclerviewkotlin.wrapper.IEatingWrapper

/**
 * Created by Willy on 15/01/2018.
 */
class RecyclerViewAdapter(itemList: ArrayList<IEatingWrapper>) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    private var mItemList = ArrayList<IEatingWrapper>()

    init {
        mItemList = itemList
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<*> {
        val view: View
        val inflater: LayoutInflater = LayoutInflater.from(parent?.context)

        return when (viewType) {
            IEatingWrapper.FRUIT -> {
                view = inflater.inflate(R.layout.fruit_item_view, parent, false)
                FruitViewHolder(view)
            }
            IEatingWrapper.FOOD -> {
                view = inflater.inflate(R.layout.food_item_view, parent, false)
                FoodViewHolder(view)
            }
            else -> {
                view = inflater.inflate(R.layout.unknown_item_view, parent, false)
                UnknownViewHolder(view)
            }
        }


    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is FruitViewHolder -> holder.bindView(mItemList[position])
            is FoodViewHolder -> holder.bindView(mItemList[position])
            is UnknownViewHolder -> holder.bindView(mItemList[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return mItemList[position].getItemType()
    }

    override fun getItemCount(): Int {
        return mItemList.size
    }
}