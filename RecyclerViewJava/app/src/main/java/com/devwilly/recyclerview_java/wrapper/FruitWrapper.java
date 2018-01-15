package com.devwilly.recyclerview_java.wrapper;

/**
 * Created by Willy on 15/01/2018.
 */

public class FruitWrapper implements IEatingWrapper {

    private String mName;
    private String mPrice;
    private String mDescription;

    public FruitWrapper(String name, String description, String price) {
        this.mName = name;
        this.mDescription = description;
        this.mPrice = price;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getDescription() {
        return mDescription;
    }

    @Override
    public String getPrice() {
        return mPrice;
    }

    @Override
    public int getItemType() {
        return IEatingWrapper.FRUIT;
    }
}
