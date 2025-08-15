package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: iw7  reason: default package */
public final class iw7 extends FrameLayout {
    public final ey1 a;
    public final dw7 b;
    public boolean c;
    public boolean o;
    public f4e s0;

    /* JADX WARNING: type inference failed for: r2v0, types: [dw7, android.view.View, one.me.rlottie.RLottieImageView] */
    public iw7(Context context) {
        super(context, (AttributeSet) null);
        ey1 ey1 = new ey1(context);
        this.a = ey1;
        ? rLottieImageView = new RLottieImageView(context, (AttributeSet) null);
        rLottieImageView.setId(tga.b);
        rLottieImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = rLottieImageView;
        addView((OneMeDraweeView) ey1.b);
        addView(rLottieImageView);
    }

    public final void a(z2e z2e, int i) {
        f4e f4e = this.s0;
        if (f4e != null) {
            f4e.b(z2e);
        }
        String str = z2e.X;
        ey1 ey1 = this.a;
        boolean z = true;
        dw7 dw7 = this.b;
        if (str == null || str.length() == 0) {
            dw7.c();
            dw7.setVisibility(8);
            ((OneMeDraweeView) ey1.b).setVisibility(0);
        } else {
            dw7.setAutoRepeat(true);
            dw7.setOnFirstFrameListener(new z16(15, this));
            dw7.setFailureListener(new kp7(4));
            dw7.setVisibility(0);
            this.c = true;
            boolean f = dw7.f(i, i, str);
            this.c = false;
            if (!f || this.o) {
                z = false;
            }
            this.o = false;
        }
        if (z) {
            ey1.getClass();
            wv6 b2 = wv6.b(z2e.o);
            OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) ey1.b;
            int i2 = OneMeDraweeView.B0;
            oneMeDraweeView.o(b2, (wv6) null);
            oneMeDraweeView.setVisibility(0);
        }
    }

    public final void b(gw7 gw7) {
        if (gw7.a == null) {
            gw7.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = gw7.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final f4e getSizeConfigurator() {
        return this.s0;
    }

    public final void onMeasure(int i, int i2) {
        f4e f4e = this.s0;
        jt a2 = f4e != null ? f4e.a(i, i2) : null;
        if (a2 != null) {
            i = a2.b;
        }
        if (a2 != null) {
            i2 = a2.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(f4e f4e) {
        this.s0 = f4e;
    }
}
