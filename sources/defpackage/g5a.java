package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: g5a  reason: default package */
public final class g5a extends Drawable {
    public final Context a;
    public final m5a b;
    public final String c;
    public final sq4 d;
    public int e;
    public final wjc f;
    public final n5 g;
    public String h;
    public wv6 i;
    public final int j;

    public /* synthetic */ g5a(Context context) {
        this(context, j5a.a);
    }

    public final void a(wv6 wv6) {
        int i2;
        sq4 sq4 = this.d;
        if (wv6 == null) {
            sq4.i((mq4) null);
        } else {
            boolean isEmpty = getBounds().isEmpty();
            int i3 = this.j;
            if (isEmpty) {
                i2 = i3;
            } else if (getBounds().width() < getBounds().height()) {
                int width = getBounds().width();
                if (width >= i3) {
                    i3 = width;
                }
                i2 = tu0.G((((float) i3) / ((float) getBounds().width())) * ((float) getBounds().height()));
            } else {
                int height = getBounds().height();
                if (height >= i3) {
                    i3 = height;
                }
                int i4 = i3;
                i3 = tu0.G((((float) i3) / ((float) getBounds().height())) * ((float) getBounds().width()));
                i2 = i4;
            }
            vc0 vc0 = h5a.a;
            jic jic = (i3 <= 0 || i2 <= 0) ? null : new jic(0.0f, i3, i2, 12);
            m5a m5a = this.b;
            xv6 d2 = xv6.d(wv6.b);
            d2.g = uv6.b;
            d2.l = h5a.a(m5a);
            if (jic != null) {
                d2.d = jic;
            }
            d2.k = a9b.c;
            wv6 a2 = d2.a();
            iv6 o = s36.o();
            o.getClass();
            hv6 hv6 = new hv6(o, a2, (Object) null);
            wjc wjc = this.f;
            wjc.a(hv6);
            if (sq4.X == null) {
                e2b a3 = s36.a.get();
                a3.g = wjc;
                a3.h = this.g;
                a3.l = sq4.X;
                a3.k = true;
                sq4.i(a3.a());
            }
        }
        invalidateSelf();
    }

    public final void b(uc0 uc0, String str) {
        wv6 wv6;
        m5a m5a = this.b;
        boolean f2 = tpa.f(this.h, str);
        sq4 sq4 = this.d;
        if (!f2) {
            this.h = str;
            if (str == null || str.length() == 0) {
                wv6 = null;
            } else {
                vc0 vc0 = h5a.a;
                wv6 = h5a.b(str, m5a, 4);
            }
            this.i = wv6;
            if (wv6 != null) {
                sq4.g();
            } else {
                sq4.h();
            }
            a(this.i);
            invalidateSelf();
        }
        if (uc0 != null && uc0 != uc0.c && (uc0.a != 0 || uc0.b.length() != 0)) {
            tc0 tc0 = new tc0(m5a, uc0, qp4.u0.b(this.a).i());
            rq4 rq4 = sq4.o;
            rq4.getClass();
            ((la6) rq4).i(tc0, 1);
            this.e = 3;
        } else if (this.e == 3) {
            rq4 rq42 = sq4.o;
            rq42.getClass();
            ((la6) rq42).i((Drawable) null, 1);
            this.e = 1;
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        umc e2 = this.d.e();
        if (e2 != null) {
            Drawable.Callback callback = e2.getCallback();
            e2.setCallback((Drawable.Callback) null);
            e2.draw(canvas);
            e2.setCallback(callback);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5a)) {
            return false;
        }
        g5a g5a = (g5a) obj;
        return tpa.f(this.b, g5a.b) && tpa.f(this.h, g5a.h);
    }

    public final int getAlpha() {
        umc e2 = this.d.e();
        return e2 != null ? e2.getAlpha() : super.getAlpha();
    }

    public final int getIntrinsicHeight() {
        this.d.getClass();
        return -1;
    }

    public final int getIntrinsicWidth() {
        this.d.getClass();
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        umc e2 = this.d.e();
        if (e2 != null) {
            Drawable.Callback callback = e2.getCallback();
            e2.setCallback((Drawable.Callback) null);
            e2.setBounds(0, 0, rect.width(), rect.height());
            e2.setCallback(callback);
        }
        a(this.i);
    }

    public final void setAlpha(int i2) {
        umc e2 = this.d.e();
        if (e2 != null) {
            e2.setAlpha(i2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        umc e2 = this.d.e();
        if (e2 != null) {
            e2.setColorFilter(colorFilter);
        }
    }

    public g5a(Context context, m5a m5a) {
        this.a = context;
        this.b = m5a;
        this.c = g5a.class.getName();
        ma6 ma6 = new ma6(context.getResources());
        ma6.b = 0;
        sq4 sq4 = new sq4(ma6.a());
        umc e2 = sq4.e();
        if (e2 != null) {
            e2.setCallback(new pf(2, this));
        }
        this.d = sq4;
        this.e = 1;
        wjc wjc = new wjc();
        this.f = wjc;
        n5 n5Var = new n5(1, this);
        this.g = n5Var;
        this.j = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        e2b a2 = s36.a.get();
        a2.g = wjc;
        a2.h = n5Var;
        a2.l = sq4.X;
        a2.k = true;
        sq4.i(a2.a());
    }
}
