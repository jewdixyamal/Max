package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: f9f  reason: default package */
public final class f9f extends Drawable {
    public final sq4 a;
    public final wjc b;
    public m56 c;
    public final n5 d;
    public wv6 e;
    public wv6 f;
    public final int g;
    public String h;

    public f9f(Context context) {
        ma6 ma6 = new ma6(context.getResources());
        ma6.b = 0;
        sq4 sq4 = new sq4(ma6.a());
        umc e2 = sq4.e();
        if (e2 != null) {
            e2.setCallback(new pf(4, this));
        }
        this.a = sq4;
        this.b = new wjc();
        this.d = new n5(4, this);
        this.g = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        d();
    }

    public static wv6 b(wv6 wv6, int i, int i2) {
        xv6 b2 = xv6.b(wv6);
        b2.d = (i <= 0 || i2 <= 0) ? null : new jic(0.0f, i, i2, 12);
        return b2.a();
    }

    public final void a(wv6 wv6, wv6 wv62) {
        int i;
        ide ide;
        sq4 sq4 = this.a;
        if (wv6 == null) {
            sq4.i((mq4) null);
            return;
        }
        boolean isEmpty = getBounds().isEmpty();
        int i2 = this.g;
        if (isEmpty) {
            i = i2;
        } else if (getBounds().width() < getBounds().height()) {
            int width = getBounds().width();
            if (width >= i2) {
                i2 = width;
            }
            i = tu0.G((((float) i2) / ((float) getBounds().width())) * ((float) getBounds().height()));
        } else {
            int height = getBounds().height();
            if (height >= i2) {
                i2 = height;
            }
            int i3 = i2;
            i2 = tu0.G((((float) i2) / ((float) getBounds().height())) * ((float) getBounds().width()));
            i = i3;
        }
        if (wv62 != null) {
            iv6 o = s36.o();
            wv6 b2 = b(wv6, i2, i);
            o.getClass();
            hv6 hv6 = new hv6(o, b2, (Object) null);
            iv6 o2 = s36.o();
            wv6 b3 = b(wv62, i2, i);
            o2.getClass();
            ide = new rz6(y53.M(hv6, new hv6(o2, b3, (Object) null)), false);
        } else {
            iv6 o3 = s36.o();
            wv6 b4 = b(wv6, i2, i);
            o3.getClass();
            ide = new hv6(o3, b4, (Object) null);
        }
        this.b.a(ide);
        if (sq4.X == null) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r3 = defpackage.fp3.d(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.net.Uri r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = r1.h
            boolean r0 = defpackage.tpa.f(r0, r3)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r1.h = r3
            r0 = 0
            if (r3 == 0) goto L_0x001d
            android.net.Uri r3 = defpackage.fp3.d(r3)
            if (r3 == 0) goto L_0x001d
            xv6 r3 = defpackage.xv6.d(r3)
            wv6 r3 = r3.a()
            goto L_0x001e
        L_0x001d:
            r3 = r0
        L_0x001e:
            r1.e = r3
            if (r2 == 0) goto L_0x002a
            xv6 r2 = defpackage.xv6.d(r2)
            wv6 r0 = r2.a()
        L_0x002a:
            r1.f = r0
            wv6 r2 = r1.e
            sq4 r3 = r1.a
            if (r2 != 0) goto L_0x0039
            if (r0 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r3.h()
            goto L_0x003c
        L_0x0039:
            r3.g()
        L_0x003c:
            wv6 r2 = r1.e
            wv6 r3 = r1.f
            r1.a(r2, r3)
            r1.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9f.c(android.net.Uri, java.lang.String):void");
    }

    public final void d() {
        e2b a2 = s36.a.get();
        a2.g = this.b;
        a2.h = this.d;
        sq4 sq4 = this.a;
        a2.l = sq4.X;
        a2.k = true;
        sq4.i(a2.a());
    }

    public final void draw(Canvas canvas) {
        umc e2 = this.a.e();
        if (e2 != null) {
            e2.draw(canvas);
        }
    }

    public final int getOpacity() {
        umc e2 = this.a.e();
        if (e2 != null) {
            return e2.getOpacity();
        }
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        umc e2 = this.a.e();
        if (e2 != null) {
            e2.setBounds(0, 0, rect.width(), rect.height());
        }
        a(this.e, this.f);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        umc e2 = this.a.e();
        if (e2 != null) {
            e2.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        umc e2 = this.a.e();
        if (e2 != null) {
            e2.setColorFilter(colorFilter);
        }
    }

    public f9f(Context context, Uri uri, String str) {
        this(context);
        c(uri, str);
    }
}
