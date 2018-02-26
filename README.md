## HorizontalSelectView
横向滑动选择器

## 效果图

![](https://github.com/WernerZeiss/HorizontalSelectView/blob/master/screenshot/GIF.gif)

## 使用

* 布局中声明

```
<com.cwq.horizontalselectview.widge.HorizontalSelectedView
        android:id="@+id/selectView"
        android:layout_width="match_parent"
        android:layout_height="50dp" />     
```

* 代码中设置数据

```
horizontalSelectedView.setData(Arrays.asList(strings));
```

## 方法属性

方法名 | 说明
----|------
setData(List(String) list)|设置数据
setOnScrollListener(OnScrollListener listener)|设置监听
setStepLeft()|向左移动一个单位
setStepRight()|向右移动一个单位
getSelectPosition()|获取选中的位置
