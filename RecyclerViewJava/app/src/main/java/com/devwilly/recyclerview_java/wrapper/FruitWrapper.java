package com.devwilly.recyclerview_java.wrapper;

/**
 * Created by Willy on 15/01/2018.
 */

public class FruitWrapper implements IEatingType {

    private String mName;
    private String mPrice;

    public FruitWrapper(String name, String price) {
        this.mName = name;
        this.mPrice = price;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getPrice() {
        return mPrice;
    }

    @Override
    public int getItemType() {
        return IEatingType.FRUIT;
    }
}
