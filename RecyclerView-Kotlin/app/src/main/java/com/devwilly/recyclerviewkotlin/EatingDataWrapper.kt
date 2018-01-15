package com.devwilly.recyclerviewkotlin

import android.content.Context
import com.devwilly.recyclerviewkotlin.wrapper.FoodWrapper
import com.devwilly.recyclerviewkotlin.wrapper.FruitWrapper
import com.devwilly.recyclerviewkotlin.wrapper.IEatingWrapper

/**
 * Created by Willy on 15/01/2018.
 */
class EatingDataWrapper(context: Context) {

    private val mContext: Context = context

    fun getFoodItemList(): ArrayList<IEatingWrapper> {
        val list: ArrayList<IEatingWrapper> = ArrayList()

        val riceName = getString(R.string.rice_name)
        val riceDescription = getString(R.string.rice_description)
        val ricePrice = getString(R.string.rice_money)

        val steakName = getString(R.string.steak_name)
        val steakDescription = getString(R.string.steak_description)
        val steakPrice = getString(R.string.steak_money)

        val risottoName = getString(R.string.risotto_name)
        val risottoDescription = getString(R.string.risotto_description)
        val risottoPrice = getString(R.string.risotto_money)

        val pigBloodCakeName = getString(R.string.pig_blood_cake_name)
        val pigBloodCakeDescription = getString(R.string.pig_blood_cake_description)
        val pigBloodCakePrice = getString(R.string.pig_blood_cake_money)

        val oysterOmeletName = getString(R.string.oyster_omelet_name)
        val oysterOmeletDescription = getString(R.string.oyster_omelet_description)
        val oysterOmeletCakePrice = getString(R.string.oyster_omelet_money)

        val chickenFilletName = getString(R.string.chicken_fillet_name)
        val chickenFilletDescription = getString(R.string.chicken_fillet_description)
        val chickenFilletPrice = getString(R.string.chicken_fillet_money)

        list.add(FoodWrapper(riceName, riceDescription, ricePrice))
        list.add(FoodWrapper(steakName, steakDescription, steakPrice))
        list.add(FoodWrapper(risottoName, risottoDescription, risottoPrice))
        list.add(FoodWrapper(pigBloodCakeName, pigBloodCakeDescription, pigBloodCakePrice))
        list.add(FoodWrapper(oysterOmeletName, oysterOmeletDescription, oysterOmeletCakePrice))
        list.add(FoodWrapper(chickenFilletName, chickenFilletDescription, chickenFilletPrice))

        return list
    }

    fun getFruitItemList(): ArrayList<IEatingWrapper> {
        val list: ArrayList<IEatingWrapper> = ArrayList()

        val appleName = getString(R.string.apple_name)
        val appleDescription = getString(R.string.apple_description)
        val applePrice = getString(R.string.apple_money)

        val bananaName = getString(R.string.banana_name)
        val bananaDescription = getString(R.string.banana_description)
        val bananaPrice = getString(R.string.banana_money)

        val waterMelonName = getString(R.string.water_melon_name)
        val waterMelonDescription = getString(R.string.water_melon_description)
        val waterMelonPrice = getString(R.string.water_melon_money)

        val avocadoName = getString(R.string.avocado_name)
        val avocadoDescription = getString(R.string.avocado_description)
        val avocadoPrice = getString(R.string.avocado_money)

        val cherryName = getString(R.string.cherry_name)
        val cherryDescription = getString(R.string.cherry_description)
        val cherryPrice = getString(R.string.cherry_money)

        val coconutName = getString(R.string.coconut_name)
        val coconutDescription = getString(R.string.cherry_description)
        val coconutPrice = getString(R.string.cherry_money)

        list.add(FruitWrapper(appleName, appleDescription, applePrice))
        list.add(FruitWrapper(bananaName, bananaDescription, bananaPrice))
        list.add(FruitWrapper(waterMelonName, waterMelonDescription, waterMelonPrice))
        list.add(FruitWrapper(avocadoName, avocadoDescription, avocadoPrice))
        list.add(FruitWrapper(cherryName, cherryDescription, cherryPrice))
        list.add(FruitWrapper(coconutName, coconutDescription, coconutPrice))

        return list
    }

    private fun getString(resId: Int): String {
        return mContext.resources.getString(resId)
    }
}