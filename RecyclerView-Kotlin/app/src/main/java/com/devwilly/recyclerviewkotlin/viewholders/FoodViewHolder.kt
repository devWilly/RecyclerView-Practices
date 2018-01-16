package com.devwilly.recyclerviewkotlin.viewholders

import android.view.View
import android.widget.TextView
import com.devwilly.recyclerviewkotlin.R
import com.devwilly.recyclerviewkotlin.RecyclerViewAdapter
import com.devwilly.recyclerviewkotlin.wrapper.IEatingWrapper

/**
 * Created by Willy on 15/01/2018.
 */
class FoodViewHolder(itemView: View, listener: RecyclerViewAdapter.OnItemClickListener?) : BaseViewHolder<IEatingWrapper>(itemView) {

    private val mListener = listener
    private val mFoodName = itemView.findViewById<TextView>(R.id.food_name)
    private val mFoodDescription = itemView.findViewById<TextView>(R.id.food_description)
    private val mFoodPrice = itemView.findViewById<TextView>(R.id.food_price)

    override fun bindView(t: IEatingWrapper) {
        mFoodName.text = t.getName()
        mFoodDescription.text = t.getDescription()
        mFoodPrice.text = t.getPrice()

        itemView.setOnClickListener { mListener?.onFoodItemClick(t.getName()) }
    }
}