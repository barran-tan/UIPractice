package com.barran.uipractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.barran.uipractice.imitate.ImitateShowActivity;

/**
 * 整合所有测试项目的入口
 *
 * Created by tanwei on 2017/10/21.
 */

public class EntryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (view.getId()) {
                    case R.id.entry_btn_draw1:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw1.MainActivity.class);
                        break;

                    case R.id.entry_btn_draw2:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw2.MainActivity.class);
                        break;
                    
                    case R.id.entry_btn_draw3:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw3.MainActivity.class);
                        break;
                    
                    case R.id.entry_btn_draw4:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw4.MainActivity.class);
                        break;
                    
                    case R.id.entry_btn_draw5:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw5.MainActivity.class);
                        break;
                    
                    case R.id.entry_btn_draw6:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw6.MainActivity.class);
                        break;
                    
                    case R.id.entry_btn_draw7:
                        intent.setClass(EntryActivity.this,
                                com.hencoder.hencoderpracticedraw7.MainActivity.class);
                        break;

                    case R.id.entry_btn_imitate:
                        intent.setClass(EntryActivity.this,
                                ImitateShowActivity.class);
                        break;
                }
                
                startActivity(intent);
            }
        };
        findViewById(R.id.entry_btn_draw1).setOnClickListener(listener);
        findViewById(R.id.entry_btn_draw2).setOnClickListener(listener);
        findViewById(R.id.entry_btn_draw3).setOnClickListener(listener);
        findViewById(R.id.entry_btn_draw4).setOnClickListener(listener);
        findViewById(R.id.entry_btn_draw5).setOnClickListener(listener);
        findViewById(R.id.entry_btn_draw6).setOnClickListener(listener);
        findViewById(R.id.entry_btn_draw7).setOnClickListener(listener);
        findViewById(R.id.entry_btn_imitate).setOnClickListener(listener);
    }
}
