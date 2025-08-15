package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: jn5  reason: default package */
public final class jn5 extends FrameLayout {
    public int a;
    public int b;
    public float c;
    public float o;
    public final WindowManager.LayoutParams s0 = new WindowManager.LayoutParams(-1, -1, 0, 0, 2038, 16779016, -3);
    public final SimpleDraweeView t0;
    public in5 u0;
    public ValueAnimator v0;

    public jn5(Context context) {
        super(context);
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.s0.layoutInDisplayCutoutMode = 1;
        }
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.t0 = simpleDraweeView;
        addView(simpleDraweeView, new FrameLayout.LayoutParams(0, 0));
    }

    public final void a(int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.v0 = ofFloat;
        ofFloat.setDuration(300);
        this.v0.setInterpolator(((y8a) vl.b()).c().a.n());
        this.v0.setStartDelay((long) 0);
        this.v0.addUpdateListener(new hn5(this, i3, i4, i, i2));
        this.v0.addListener(new h6(5, (Object) this));
        this.v0.start();
    }

    public final void b(Uri uri, int i, int i2, int i3, int i4) {
        e2b a2 = s36.a.get();
        a2.e = wv6.a(uri);
        a2.l = this.t0.getController();
        this.t0.setController(a2.a());
        float f = (float) i;
        this.c = f;
        float f2 = (float) i2;
        this.o = f2;
        this.a = i3;
        this.b = i4;
        this.t0.setLayoutParams(new FrameLayout.LayoutParams(this.a, this.b));
        this.t0.setTranslationX(f);
        this.t0.setTranslationY(f2);
        invalidate();
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.s0;
    }

    public void setListener(in5 in5) {
        this.u0 = in5;
    }
}
