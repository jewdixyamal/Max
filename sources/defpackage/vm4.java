package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: vm4  reason: default package */
public final class vm4 extends FrameLayout {
    public tg a;
    public final AppCompatTextView b;
    public final ShapeDrawable c;
    public final bt o;
    public ph4 s0;

    /* JADX WARNING: type inference failed for: r13v0, types: [bt, android.graphics.drawable.AnimationDrawable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm4(Context context, int i) {
        super(context);
        int i2 = i;
        bk4 b2 = bk4.b();
        Resources resources = context.getResources();
        ? animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(resources.getDrawable(gpc.C0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.J0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.K0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.L0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.M0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.N0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.O0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.P0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.Q0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.D0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.E0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.F0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.G0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.H0), 50);
        animationDrawable.addFrame(resources.getDrawable(gpc.I0), 50);
        this.o = animationDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setImageDrawable(this.o);
        int i3 = b2.t;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = b2.i;
        if (i2 == 1) {
            appCompatImageView.setRotationY(180.0f);
        }
        addView(appCompatImageView, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.b.setTextSize(b2.F);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = b2.i;
        addView(this.b, layoutParams2);
        int parseColor = Color.parseColor("#40FFFFFF");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.c = shapeDrawable;
        shapeDrawable.getPaint().setColor(parseColor);
        setBackground(this.c);
        int b3 = fk4.b((int) 180.0f);
        if (i2 == 1) {
            float f = (float) b3;
            setCorners(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
            return;
        }
        float f2 = (float) b3;
        setCorners(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
    }

    private void setCorners(float[] fArr) {
        this.c.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
    }

    public final void a() {
        if (getVisibility() != 8) {
            if (this.a == null) {
                setVisibility(8);
                return;
            }
            ph4 ph4 = this.s0;
            if (ph4 != null) {
                ph4.h();
            }
            this.o.stop();
            this.s0 = this.a.g(this);
        }
    }

    public final void b() {
        if (getVisibility() != 0) {
            if (this.a == null) {
                setVisibility(0);
            } else if (!this.o.isRunning()) {
                ph4 ph4 = this.s0;
                if (ph4 != null) {
                    ph4.h();
                }
                this.o.start();
                this.s0 = this.a.i(this);
            }
        }
    }

    public final void c(int i) {
        if (i == 0) {
            this.b.setText("");
        } else {
            this.b.setText(getResources().getString(jpc.z2, new Object[]{Integer.valueOf(i)}));
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.stop();
        ph4 ph4 = this.s0;
        if (ph4 != null) {
            ph4.h();
        }
    }

    public void setAnimations(tg tgVar) {
        this.a = tgVar;
    }
}
