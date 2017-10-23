package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    
    private Paint mPaint;
    
    public Practice9DrawPathView(Context context) {
        super(context);
    }
    
    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    
    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        if(mPaint == null){
            mPaint = new Paint();
            mPaint.setColor(Color.GREEN);
            mPaint.setStrokeWidth(20);
        }

        canvas.translate(300, 300);
        Path path = new Path();
        path.addArc(0, 0, 200, 200, -225, 225);
        path.arcTo(200, 0, 400, 200, -180, 225, false);
        path.lineTo(200, 342);
        path.close();
        
        canvas.drawPath(path, mPaint);
    }
}
