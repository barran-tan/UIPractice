package com.hencoder.hencoderpracticedraw4.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw4.R;

public class Practice06SkewView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point point1 = new Point(200, 200);
    Point point2 = new Point(600, 200);

    public Practice06SkewView(Context context) {
        super(context);
    }

    public Practice06SkewView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice06SkewView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        // 注意：参数分别是在x，y轴上倾斜的角度的tan值
        // 再形象一点，sx表示在x轴上的坐标偏移，向右为正；sy是
        canvas.skew(0, 0.5f);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        canvas.restore();
        
        canvas.save();
        canvas.skew(-0.5f, 0);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();
    }
}
