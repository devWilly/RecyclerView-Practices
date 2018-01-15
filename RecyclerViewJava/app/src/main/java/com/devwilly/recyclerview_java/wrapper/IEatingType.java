package com.devwilly.recyclerview_java.wrapper;

/**
 * Created by Willy on 15/01/2018.
 */

public interface IEatingType {
    int FRUIT = 0;
    int FOOD = 1;

    String getName();

    String getDescription();

    String getPrice();

    int getItemType();
}
