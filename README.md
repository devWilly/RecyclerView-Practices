# RecyclerView-Practices
this sample is basic recyclerview method tutorial

![RecyclerView](https://developer.android.com/training/material/images/RecyclerView.png?hl=zh-tw)

### What’s RecyclerView ?
官方已有相關解釋，我就不再另外說明了，相關內容如下：
參考資源：
* [建立清單和卡片][1]
* [CardView－Support Library And Material Design][2]


### How to use RecyclerView ?
* Add Recyclerview lib to `build.gradle`
```
dependencies {
    ...
    implementation ‘com.android.support:recyclerview-v7:26.1.0’
}
```

* create RecyclerView UI component in xml layout
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.v7.widget.RecyclerView
        android:id="@+id/default_recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#e5e5e5"/>
</android.support.constraint.ConstraintLayout>
```

* implement RecyclerView Adapter & ViewHolders
  * Adapter：存取資料的地方、建立ViewHolder
  * ViewHolder：data bind view
  
```
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

  public BaseViewHolder(View itemView) {
      super(itemView);
  }

  public abstract void bindView(T t);
}
```

* for example: FoodViewHolder
```
public class FoodViewHolder extends BaseViewHolder<FoodWrapper> {

    private TextView mFoodName;
    private TextView mFoodDescription;
    private TextView mFoodPrice;

    public FoodViewHolder(View itemView) {
        super(itemView);
        mFoodName = itemView.findViewById(R.id.food_name);
        mFoodDescription = itemView.findViewById(R.id.food_description);
        mFoodPrice = itemView.findViewById(R.id.food_price);
    }

    @Override
    public void bindView(FoodWrapper wrapper) {
        mFoodName.setText(wrapper.getName());
        mFoodDescription.setText(wrapper.getDescription());
        mFoodPrice.setText(wrapper.getPrice());
    }
}
```

* use `viewType` to create `ViewHolder` in your adapter
  * ArrayList<IEatingWrapper>：資料來源
  * onCreateViewHolder()：針對viewType建立專屬的ViewHolder
  * onBindViewHolder()：data bind view
```
public class RecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private ArrayList<IEatingWrapper> mItemList = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<IEatingWrapper> itemList) {
        this.mItemList = itemList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case IEatingWrapper.FRUIT:
                view = inflater.inflate(R.layout.fruit_item_view, parent, false);
                return new FruitViewHolder(view);
            case IEatingWrapper.FOOD:
                view = inflater.inflate(R.layout.food_item_view, parent, false);
                return new FoodViewHolder(view);
            default:
                view = inflater.inflate(R.layout.unknown_item_view, parent, false);
                return new UnknownViewHolder(view);
        }
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindView(mItemList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mItemList.get(position).getItemType();
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
```

* set data wrapper in your recyclerview adapter
  * setLayoutManager()：選擇RecyclerView想要的樣式
    * [GridLayoutManager][3]
    * [LinearLayoutManager][4]
  * setAdapter()：將資料塞入RecyclerView Adapter中
  
### How to use RecyclerView.ItemDecoration ?
顧名思義就是拿來裝飾RecyclerView Item用的，最常使用的方法是getItemOffsets() ，此方法用於調整每個Item間的間距大小。

<img src="https://cdn-images-1.medium.com/max/660/1*6QF3AOTknYRHoJGjNzqZqA.png" height="576" width="324"> <img src="https://cdn-images-1.medium.com/max/660/1*6QF3AOTknYRHoJGjNzqZqA.png" height="576" width="324">
 * 最簡單的作法是建立一個ItemDecoration Class並`@Override getItemOffsets(…)`
 
 ```
 public class LayoutItemDecoration extends RecyclerView.ItemDecoration {
  
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(10, 10, 10, 10);
    }
}
 ```
 
 ### How to implement RecyclerView item click listener ?
 <img src="https://cdn-images-1.medium.com/max/880/1*2OzsZOmyH_f1f-1v2nd25w.gif">
 RecyclerView 不像 ListView 有 AdapterView.OnItemClickListener 可以實現click event，那RecyclerView click event該如何實作呢？
 
 * 首先建立ItemClickListener 並將listener交給ViewHolder
 * 當點擊item時，將click event往外丟
 * 當外面接收到ViewHolder 丟出來的事件後，就執行該事件要做的事情
 
### License
```
MIT License

Copyright (c) 2018 Willy Chang

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```


[1]: https://developer.android.com/training/material/lists-cards.html?hl=zh-tw
[2]: https://medium.com/@devwilly/cardview-support-library-and-material-design-4ffa09827b35
[3]: https://developer.android.com/reference/android/support/v7/widget/GridLayoutManager.html
[4]: https://developer.android.com/reference/android/support/v7/widget/LinearLayoutManager.html
