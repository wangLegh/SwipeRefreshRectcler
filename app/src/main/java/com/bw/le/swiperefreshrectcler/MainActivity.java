package com.bw.le.swiperefreshrectcler;

import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.bw.le.swiperefreshrectcler.beans.CategoryBean;
import com.bw.le.swiperefreshrectcler.fragments.ContentListFragment;
import com.bw.le.swiperefreshrectcler.utils.FragmentUtils;

public class MainActivity extends AppCompatActivity {
    private ContentListFragment mContentListFragment;
    private SlidingPaneLayout mSlidingPaneLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mSlidingPaneLayout = (SlidingPaneLayout)findViewById(R.id.sliding_pane_layout);
        mSlidingPaneLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelClosed(View view) {
                Toast.makeText(MainActivity.this, "onPanelClosed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPanelOpened(View viw) {
                Toast.makeText(MainActivity.this, "onPanelOpened", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPanelSlide(View arg0, float arg1) {
                Toast.makeText(MainActivity.this, "onPanelSlide：" + arg1, Toast.LENGTH_SHORT).show();
            }
        });




        CategoryBean categoryBean = new CategoryBean();

        categoryBean.setCategoryId(1);
        categoryBean.setCategoryName("分类");
        categoryBean.setSubclassCount(5);

        mContentListFragment = ContentListFragment.newInstance(categoryBean);
        FragmentUtils.addFragmentToActivity(getSupportFragmentManager(),
                mContentListFragment,
                R.id.fl_fragment_container);

    }
}
