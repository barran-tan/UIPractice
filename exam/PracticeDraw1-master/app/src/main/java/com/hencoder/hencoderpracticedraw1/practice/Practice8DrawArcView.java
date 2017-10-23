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

public class Practice8DrawArcView extends View {

    private Paint mPaint;
    private RectF mRectF;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        int width = 400;
        if (mPaint == null) {
            mPaint = new Paint();
            mPaint.setColor(Color.GREEN);
            mPaint.setStrokeWidth(10);
            mRectF = new RectF(0, 0, width, width);
        }

        canvas.translate(getWidth() / 2 - width / 2, getHeight() / 2 - width / 2);
//        x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度
        canvas.drawArc(mRectF, 0, 135, false, mPaint);
        canvas.drawArc(mRectF, 180, 90, true, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(mRectF, 300, 50, false, mPaint);
    }
}
