package com.devwilly.recyclerviewkotlin.wrapper

/**
 * Created by Willy on 15/01/2018.
 */
class FoodWrapper : IEatingWrapper {

    private lateinit var mName: String
    private lateinit var mDescription: String
    private lateinit var mPrice: String

    fun FoodWrapper(name: String, description: String, price: String) {
        this.mName = name
        this.mDescription = description
        this.mPrice = price
    }
    override fun getName(): String {
        return mName
    }

    override fun getDescription(): String {
        return mDescription
    }

    override fun getPrice(): String {
        return mPrice
    }

    override fun getItemType(): Int {
        return IEatingWrapper.FOOD
    }
}