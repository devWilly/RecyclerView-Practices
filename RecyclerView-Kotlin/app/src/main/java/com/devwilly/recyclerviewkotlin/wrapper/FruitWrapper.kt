package com.devwilly.recyclerviewkotlin.wrapper

/**
 * Created by Willy on 15/01/2018.
 */
class FruitWrapper(
        private val name: String,
        private val description: String,
        private val price: String) : IEatingWrapper {

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun getPrice(): String {
        return price
    }

    override fun getItemType(): Int {
        return IEatingWrapper.FRUIT
    }
}