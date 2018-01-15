package com.devwilly.recyclerviewkotlin.wrapper

/**
 * Created by Willy on 15/01/2018.
 */

interface IEatingWrapper {

    companion object {
        val FRUIT = 0
        val FOOD = 1
    }

    fun getName(): String

    fun getDescription(): String

    fun getPrice(): String

    fun getItemType(): Int
}