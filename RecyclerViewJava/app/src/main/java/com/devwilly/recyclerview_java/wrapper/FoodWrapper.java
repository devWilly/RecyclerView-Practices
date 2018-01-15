package com.devwilly.recyclerview_java.wrapper;

/**
 * Created by Willy on 15/01/2018.
 */

public class FoodWrapper implements IEatingType {

    enum FoodCookingMethod {
        SAUTE, STEW, BROIL, BAKE, FRY, DEEPFRY
    }

    private String mName;
    private String mDescription;
    private String mPrice;
    private FoodCookingMethod mCookingMethod;

    public FoodWrapper(String name, String description, String price) {
        this.mName = name;
        this.mDescription = description;
        this.mPrice = price;
    }

    public FoodCookingMethod getCookingMethod() {
        return mCookingMethod;
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
        return IEatingType.FOOD;
    }
}
