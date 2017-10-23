package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        if(mPaint == null){
            mPaint = new Paint();
        }

        int width = 50;
        int margin = 30;
        int totalHeight = 500;

        canvas.translate(100,600);

        mPaint.setColor(Color.WHITE);
        canvas.drawLine(0, 0, 0, -400, mPaint);
        canvas.drawLine(0, 0, 600, 0, mPaint);

        mPaint.setColor(Color.GREEN);

        int left = margin;
        int right = width + left;
        // gingerbread 0.01
        canvas.drawRect(left, -totalHeight * 0.01f, right, 0, mPaint);
        
        left = right + margin;
        right = width + left;
        // ice 0.01
        canvas.drawRect(left, -totalHeight * 0.01f, right, 0, mPaint);
        
        left = right + margin;
        right = width + left;
        // jelly bean 0.1
        canvas.drawRect(left, -totalHeight * 0.1f, right, 0, mPaint);
        
        left = right + margin;
        right = width + left;
        // kitkat 0.19
        canvas.drawRect(left, -totalHeight * 0.19f, right, 0, mPaint);
        
        left = right + margin;
        right = width + left;
        // L 0.32
        canvas.drawRect(left, -totalHeight * 0.32f, right, 0, mPaint);
        
        left = right + margin;
        right = width + left;
        // M 0.31
        canvas.drawRect(left, -totalHeight * 0.31f, right, 0, mPaint);
        
        left = right + margin;
        right = width + left;
        // N 0.07
        canvas.drawRect(left, -totalHeight * 0.07f, right, 0, mPaint);
    }
}
