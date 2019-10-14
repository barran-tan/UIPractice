package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice01LinearGradientView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    
    private LinearGradient gradientClamp, gradientMirror, gradientRepeat;

    public Practice01LinearGradientView(Context context) {
        super(context);
        init();
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    {
        // 用 Paint.setShader(shader) 设置一个 LinearGradient
        // LinearGradient 的参数：坐标：(100, 100) 到 (500, 500) ；颜色：#E91E63 到 #2196F3
    }
    
    private void init() {
        int startColor = Color.parseColor("#E91E63");
        int endColor = Color.parseColor("#2196F3");
        gradientClamp = new LinearGradient(100, 100, 500, 500, startColor, endColor,
                Shader.TileMode.CLAMP);

        gradientMirror = new LinearGradient(600, 100, 1000, 500, startColor, endColor,
                Shader.TileMode.MIRROR);
        
        gradientRepeat = new LinearGradient(1100, 100, 1500, 500, startColor, endColor,
                Shader.TileMode.REPEAT);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setShader(gradientClamp);
        canvas.drawCircle(300, 300, 200, paint);

        paint.setShader(gradientMirror);
        canvas.drawCircle(800, 300, 200, paint);

        paint.setShader(gradientRepeat);
        canvas.drawCircle(1300, 300, 200, paint);
    }
}
