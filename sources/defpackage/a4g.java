package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.media.ffmpeg.WebmFactory;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: a4g  reason: default package */
public final class a4g extends FrameLayout {
    public final ey1 a;
    public final z3g b;
    public boolean c;
    public boolean o;
    public f4e s0;

    public a4g(Context context) {
        super(context, (AttributeSet) null);
        ey1 ey1 = new ey1(context);
        this.a = ey1;
        z3g z3g = new z3g(context);
        z3g.setId(tga.g);
        z3g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = z3g;
        addView((OneMeDraweeView) ey1.b);
        addView(z3g);
    }

    public final void a(z2e z2e, int i) {
        boolean z;
        f4e f4e = this.s0;
        if (f4e != null) {
            f4e.b(z2e);
        }
        String str = z2e.Y;
        ey1 ey1 = this.a;
        boolean z2 = true;
        z3g z3g = this.b;
        if (str == null || str.length() == 0) {
            z3g.c();
            z3g.setVisibility(8);
            ((OneMeDraweeView) ey1.b).setVisibility(0);
        } else {
            z3g.setOnFirstFrameListener(new gte(19, (Object) this));
            z3g.setVisibility(0);
            this.c = true;
            if (str.length() == 0) {
                z3g.c();
            } else {
                String str2 = z3g.a;
                if (str2 == null || !str2.equals(str)) {
                    z3g.b = true;
                    z3g.a = str;
                    AnimatedFileDrawable create = WebmFactory.create(new WebmFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(((WebmFactory.Way.Url.Builder) new WebmFactory.Way.Url.Builder().setUrl(str).setSize(i, i)).setNetworkFetchEnabled(true).build()).build());
                    create.addOnNextFrameRenderedListener(z3g);
                    z3g.setImageDrawable(create);
                } else {
                    z = false;
                    this.c = false;
                    if (!z || this.o) {
                        z2 = false;
                    }
                    this.o = false;
                }
            }
            z = true;
            this.c = false;
            z2 = false;
            this.o = false;
        }
        if (z2) {
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
