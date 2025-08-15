package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: i2e  reason: default package */
public final class i2e extends FrameLayout {
    public final ey1 a;
    public f4e b;
    public z2e c;

    public i2e(Context context) {
        super(context, (AttributeSet) null);
        ey1 ey1 = new ey1(context);
        this.a = ey1;
        setClipToPadding(false);
        addView((OneMeDraweeView) ey1.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(z2e z2e) {
        z2e z2e2 = this.c;
        boolean z = true;
        if (z2e2 != null && z2e2.s0 == z2e.s0 && z2e2.t0 == z2e.t0) {
            z = false;
        }
        this.c = z2e;
        f4e f4e = this.b;
        if (f4e != null) {
            f4e.b(z2e);
        }
        String str = z2e.o;
        ey1 ey1 = this.a;
        ey1.getClass();
        wv6 b2 = wv6.b(str);
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) ey1.b;
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.o(b2, (wv6) null);
        oneMeDraweeView.setVisibility(0);
        if (z) {
            requestLayout();
        }
    }

    public final f4e getSizeConfigurator() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        f4e f4e = this.b;
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
        this.b = f4e;
    }
}
