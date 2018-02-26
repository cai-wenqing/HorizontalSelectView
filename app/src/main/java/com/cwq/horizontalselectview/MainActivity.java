package com.cwq.horizontalselectview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cwq.horizontalselectview.widge.HorizontalSelectedView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private HorizontalSelectedView horizontalSelectedView;
    private TextView tv_msg;
    private Button btn_left, btn_get, btn_right;

    private String[] strings = {"990", "991", "992", "993", "994", "99", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalSelectedView = findViewById(R.id.selectView);
        tv_msg = findViewById(R.id.tv_msg);
        btn_left = findViewById(R.id.btn_left);
        btn_get = findViewById(R.id.btn_gettext);
        btn_right = findViewById(R.id.btn_right);

        btn_left.setOnClickListener(this);
        btn_get.setOnClickListener(this);
        btn_right.setOnClickListener(this);

        horizontalSelectedView.setData(Arrays.asList(strings));
        horizontalSelectedView.setOnScrollListener(new HorizontalSelectedView.OnScrollListener() {
            @Override
            public void onScroll(int position) {
                tv_msg.setText(strings[position]);
            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_left:
                horizontalSelectedView.setStepLeft();
                break;
            case R.id.btn_gettext:
                tv_msg.setText(strings[horizontalSelectedView.getSelectPosition()]);
                break;
            case R.id.btn_right:
                horizontalSelectedView.setStepRight();
                break;
        }
    }
}
