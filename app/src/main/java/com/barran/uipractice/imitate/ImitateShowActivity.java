package com.barran.uipractice.imitate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.barran.uipractice.R;

/**
 * 仿写view展示界面
 *
 * Created by tanwei on 2017/10/24.
 */

public class ImitateShowActivity extends AppCompatActivity {

    private SparseArray<View> viewArray;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imitate_show);

        ViewPager pager = (ViewPager) findViewById(
                com.hencoder.hencoderpracticedraw1.R.id.pager);
        TabLayout tabLayout = (TabLayout) findViewById(
                com.hencoder.hencoderpracticedraw1.R.id.tabLayout);
        tabLayout.setupWithViewPager(pager);

        viewArray = new SparseArray<>();
        viewArray.put(0, getTestUpView());

        pager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return viewArray.size();
            }
            
            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = viewArray.get(position);
                container.addView(view);
                return view;
            }
            
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(viewArray.get(position));
            }
            
            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return viewArray.get(position).getClass().getSimpleName();
            }
        });

    }

    private View getTestUpView() {
        View view = LayoutInflater.from(this).inflate(R.layout.layout_test_up_view, null);
        
        final UpView upView = (UpView) view.findViewById(R.id.layout_test_up_view);
        upView.setCount(789);
        final EditText editText = (EditText) view
                .findViewById(R.id.layout_test_up_view_edit);
        view.findViewById(R.id.layout_test_up_view_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Editable text = editText.getText();
                        if (!TextUtils.isEmpty(text)) {
                            int value = Integer.parseInt(text.toString());
                            upView.setCount(value);
                        }
                    }
                });

        return view;
    }
}
