package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice16TextPathView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint pathPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path textPath = new Path();
    String text = "Hello HenCoder";

    public Practice16TextPathView(Context context) {
        super(context);
    }

    public Practice16TextPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice16TextPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        setLayerType(LAYER_TYPE_SOFTWARE, null);// 需要关闭硬件加速

        paint.setTextSize(120);

        // 使用 Paint.getTextPath() 来获取文字的 Path

        pathPaint.setStyle(Paint.Style.STROKE);

        // 第4,5个参数表示x，y方向的偏移；或者使用下面的canvas.translate
        paint.getTextPath(text, 0, text.length(), 0, 0, textPath);
//        paint.getTextPath(text, 0, text.length(), 50, 400, textPath);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
        canvas.drawText(text, 50, 200, paint);
        
        canvas.translate(50, 400);// 上面构造
        canvas.drawPath(textPath, pathPaint);
        
        pathPaint.setStyle(Paint.Style.FILL);
        pathPaint.setColor(Color.GREEN);
        canvas.translate(0, 200);
        canvas.drawPath(textPath, pathPaint);
    }
}
