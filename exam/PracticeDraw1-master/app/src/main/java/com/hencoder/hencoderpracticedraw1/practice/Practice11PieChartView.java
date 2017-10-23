package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    
    private RectF mRectF;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width = 500;
        if (mPaint == null) {
            mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            mRectF = new RectF(0, 0, width, width);
        }
        
        canvas.translate(getWidth() / 2 - width / 2, getHeight() / 2 - width / 2);
        
        int totalAngle = 360;
        float startAngle = 0f;
        float sweepAngle;
        float marginAngle = 1;
        
        // gingerbread 0.01
        mPaint.setColor(Color.GREEN);
        sweepAngle = totalAngle * 0.01f;
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
        
        // ice 0.01
        mPaint.setColor(Color.BLUE);
        startAngle = startAngle + sweepAngle + marginAngle;
        sweepAngle = totalAngle * 0.01f;
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
        
        // jelly bean 0.1
        mPaint.setColor(Color.WHITE);
        startAngle = startAngle + sweepAngle + marginAngle;
        sweepAngle = totalAngle * 0.1f;
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
        
        // kitkat 0.19
        mPaint.setColor(Color.BLACK);
        startAngle = startAngle + sweepAngle + marginAngle;
        sweepAngle = totalAngle * 0.19f;
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
        
        // L 0.32
        mPaint.setColor(Color.CYAN);
        startAngle = startAngle + sweepAngle + marginAngle;
        sweepAngle = totalAngle * 0.32f;
        mRectF.offset(-50, 0);
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
        mRectF.offset(50, 0);
        
        // M 0.31
        mPaint.setColor(Color.GRAY);
        startAngle = startAngle + sweepAngle + marginAngle;
        sweepAngle = totalAngle * 0.31f;
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
        
        // N 0.07
        mPaint.setColor(Color.YELLOW);
        startAngle = startAngle + sweepAngle + marginAngle;
        sweepAngle = totalAngle * 0.07f;
        float odd = totalAngle - startAngle - marginAngle;
        if (odd < sweepAngle) {
            sweepAngle = odd;
        }
        canvas.drawArc(mRectF, startAngle, sweepAngle, true, mPaint);
    }
}
