package com.devwilly.recyclerviewkotlin.viewholders

import android.view.View
import android.widget.TextView
import com.devwilly.recyclerviewkotlin.R
import com.devwilly.recyclerviewkotlin.wrapper.FruitWrapper
import com.devwilly.recyclerviewkotlin.wrapper.IEatingWrapper

/**
 * Created by Willy on 15/01/2018.
 */
class FruitViewHolder(itemView: View) : BaseViewHolder<IEatingWrapper>(itemView) {

    private val mFruitName: TextView
    private val mFruitDescription: TextView
    private val mFruitPrice: TextView

    init {
        mFruitName = itemView.findViewById(R.id.fruit_name)
        mFruitDescription = itemView.findViewById(R.id.fruit_description)
        mFruitPrice = itemView.findViewById(R.id.fruit_price)

    }

    override fun bindView(t: IEatingWrapper) {
        mFruitName.text = t.getName()
        mFruitDescription.text = t.getDescription()
        mFruitPrice.text = t.getPrice()
    }
}