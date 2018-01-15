package com.devwilly.recyclerview_java.wrapper;

/**
 * Created by Willy on 15/01/2018.
 */

public class FoodWrapper implements IEattingType {

    enum FoodCookingMethod {
        SAUTE, STEW, BROIL, BAKE, FRY, DEEPFRY
    }

    private String mName;
    private String mPrice;
    private FoodCookingMethod mCookingMethod;

    public FoodWrapper(String name, String price, FoodCookingMethod cookingMethod) {
        this.mName = name;
        this.mPrice = price;
        this.mCookingMethod = cookingMethod;
    }

    public FoodCookingMethod getCookingMethod() {
        return mCookingMethod;
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
        return IEattingType.FOOD;
    }
}
