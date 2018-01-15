package com.devwilly.recyclerview_java;

import com.devwilly.recyclerview_java.wrapper.FoodWrapper;
import com.devwilly.recyclerview_java.wrapper.FruitWrapper;
import com.devwilly.recyclerview_java.wrapper.IEatingWrapper;

import android.content.Context;

import java.util.ArrayList;


/**
 * Created by Willy on 15/01/2018.
 */

public class EatingDataWrapper {

    private Context mContext;

    public EatingDataWrapper(Context context) {
        this.mContext = context;
    }

    public ArrayList<IEatingWrapper> getFoodItemList() {
        ArrayList<IEatingWrapper> list = new ArrayList<>();

        String riceName = getString(R.string.rice_name);
        String riceDescription = getString(R.string.rice_description);
        String ricePrice = getString(R.string.rice_money);

        String steakName = getString(R.string.steak_name);
        String steakDescription = getString(R.string.steak_description);
        String steakPrice = getString(R.string.steak_money);

        String risottoName = getString(R.string.risotto_name);
        String risottoDescription = getString(R.string.risotto_description);
        String risottoPrice = getString(R.string.risotto_money);

        String pigBloodCakeName = getString(R.string.pig_blood_cake_name);
        String pigBloodCakeDescription = getString(R.string.pig_blood_cake_description);
        String pigBloodCakePrice = getString(R.string.pig_blood_cake_money);

        String oysterOmeletName = getString(R.string.oyster_omelet_name);
        String oysterOmeletDescription = getString(R.string.oyster_omelet_description);
        String oysterOmeletCakePrice = getString(R.string.oyster_omelet_money);

        String chickenFilletName = getString(R.string.chicken_fillet_name);
        String chickenFilletDescription = getString(R.string.chicken_fillet_description);
        String chickenFilletPrice = getString(R.string.chicken_fillet_money);

        list.add(new FoodWrapper(riceName, riceDescription, ricePrice));
        list.add(new FoodWrapper(steakName, steakDescription, steakPrice));
        list.add(new FoodWrapper(risottoName, risottoDescription, risottoPrice));
        list.add(new FoodWrapper(pigBloodCakeName, pigBloodCakeDescription, pigBloodCakePrice));
        list.add(new FoodWrapper(oysterOmeletName, oysterOmeletDescription, oysterOmeletCakePrice));
        list.add(new FoodWrapper(chickenFilletName, chickenFilletDescription, chickenFilletPrice));

        return list;
    }

    public ArrayList<IEatingWrapper> getFruitItemList() {
        ArrayList<IEatingWrapper> list = new ArrayList<>();

        String appleName = getString(R.string.apple_name);
        String appleDescription = getString(R.string.apple_description);
        String applePrice = getString(R.string.apple_money);

        String bananaName = getString(R.string.banana_name);
        String bananaDescription = getString(R.string.banana_description);
        String bananaPrice = getString(R.string.banana_money);

        String waterMelonName = getString(R.string.water_melon_name);
        String waterMelonDescription = getString(R.string.water_melon_description);
        String waterMelonPrice = getString(R.string.water_melon_money);

        String avocadoName = getString(R.string.avocado_name);
        String avocadoDescription = getString(R.string.avocado_description);
        String avocadoPrice = getString(R.string.avocado_money);

        String cherryName = getString(R.string.cherry_name);
        String cherryDescription = getString(R.string.cherry_description);
        String cherryPrice = getString(R.string.cherry_money);

        String coconutName = getString(R.string.coconut_name);
        String coconutDescription = getString(R.string.cherry_description);
        String coconutPrice = getString(R.string.cherry_money);

        list.add(new FruitWrapper(appleName, appleDescription, applePrice));
        list.add(new FruitWrapper(bananaName, bananaDescription, bananaPrice));
        list.add(new FruitWrapper(waterMelonName, waterMelonDescription, waterMelonPrice));
        list.add(new FruitWrapper(avocadoName, avocadoDescription, avocadoPrice));
        list.add(new FruitWrapper(cherryName, cherryDescription, cherryPrice));
        list.add(new FruitWrapper(coconutName, coconutDescription, coconutPrice));

        return list;
    }

    private String getString(int resId) {
        return mContext.getResources().getString(resId);
    }
}
