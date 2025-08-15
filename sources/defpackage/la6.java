package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.List;

/* renamed from: la6  reason: default package */
public final class la6 implements rq4 {
    public final ColorDrawable a;
    public final Resources b;
    public wnc c;
    public final umc d;
    public final ya5 e;
    public final g06 f;

    /* JADX WARNING: type inference failed for: r0v6, types: [umc, g06] */
    public la6(ma6 ma6) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        f46.I();
        this.b = ma6.a;
        this.c = ma6.p;
        g06 g06 = new g06(colorDrawable);
        this.f = g06;
        List list = ma6.n;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (ma6.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(i2 + 6)];
        drawableArr[0] = a(ma6.m, (rsc) null);
        drawableArr[1] = a(ma6.d, ma6.e);
        rsc rsc = ma6.l;
        g06.setColorFilter((ColorFilter) null);
        drawableArr[2] = c9g.e(g06, rsc);
        drawableArr[3] = a(ma6.j, ma6.k);
        drawableArr[4] = a(ma6.f, ma6.g);
        drawableArr[5] = a(ma6.h, ma6.i);
        if (i2 > 0) {
            List<Drawable> list2 = ma6.n;
            if (list2 != null) {
                i = 0;
                for (Drawable a2 : list2) {
                    drawableArr[i + 6] = a(a2, (rsc) null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = ma6.o;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = a(stateListDrawable, (rsc) null);
            }
        }
        ya5 ya5 = new ya5(drawableArr);
        this.e = ya5;
        ya5.w0 = ma6.b;
        if (ya5.v0 == 1) {
            ya5.v0 = 0;
        }
        ? g062 = new g06(c9g.d(ya5, this.c));
        g062.X = null;
        this.d = g062;
        g062.mutate();
        g();
        f46.I();
    }

    public final Drawable a(Drawable drawable, rsc rsc) {
        return c9g.e(c9g.c(drawable, this.c, this.b), rsc);
    }

    public final void b(int i) {
        if (i >= 0) {
            ya5 ya5 = this.e;
            ya5.v0 = 0;
            ya5.B0[i] = true;
            ya5.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            ya5 ya5 = this.e;
            ya5.v0 = 0;
            ya5.B0[i] = false;
            ya5.invalidateSelf();
        }
    }

    public final dq4 e(int i) {
        ya5 ya5 = this.e;
        ya5.getClass();
        boolean z = false;
        od2.j(Boolean.valueOf(i >= 0));
        dq4[] dq4Arr = ya5.o;
        if (i < dq4Arr.length) {
            z = true;
        }
        od2.j(Boolean.valueOf(z));
        if (dq4Arr[i] == null) {
            dq4Arr[i] = new is(ya5, i);
        }
        dq4 dq4 = dq4Arr[i];
        dq4.j();
        return dq4.j() instanceof psc ? (psc) dq4.j() : dq4;
    }

    public final psc f(int i) {
        dq4 e2 = e(i);
        if (e2 instanceof psc) {
            return (psc) e2;
        }
        Drawable e3 = c9g.e(e2.f(c9g.a), ssc.r);
        e2.f(e3);
        od2.o(e3, "Parent has no child drawable!");
        return (psc) e3;
    }

    public final void g() {
        ya5 ya5 = this.e;
        if (ya5 != null) {
            ya5.C0++;
            ya5.v0 = 0;
            Arrays.fill(ya5.B0, true);
            ya5.invalidateSelf();
            c();
            b(1);
            ya5.e();
            ya5.c();
        }
    }

    public final void h(rsc rsc) {
        rsc.getClass();
        psc f2 = f(2);
        if (!j47.B(f2.X, rsc)) {
            f2.X = rsc;
            f2.Y = null;
            f2.p();
            f2.invalidateSelf();
        }
    }

    public final void i(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.b((Drawable) null, i);
            return;
        }
        e(i).f(c9g.c(drawable, this.c, this.b));
    }

    public final void j(Drawable drawable, float f2, boolean z) {
        Drawable c2 = c9g.c(drawable, this.c, this.b);
        c2.mutate();
        this.f.o(c2);
        ya5 ya5 = this.e;
        ya5.C0++;
        c();
        b(2);
        l(f2);
        if (z) {
            ya5.e();
        }
        ya5.c();
    }

    public final void k(Drawable drawable) {
        od2.k("The given index does not correspond to an overlay image.", 6 < this.e.c.length);
        i(drawable, 6);
    }

    public final void l(float f2) {
        Drawable a2 = this.e.a(3);
        if (a2 != null) {
            if (f2 >= 0.999f) {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).stop();
                }
                d(3);
            } else {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).start();
                }
                b(3);
            }
            a2.setLevel(Math.round(f2 * 10000.0f));
        }
    }

    public final void m(float f2, boolean z) {
        ya5 ya5 = this.e;
        if (ya5.a(3) != null) {
            ya5.C0++;
            l(f2);
            if (z) {
                ya5.e();
            }
            ya5.c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(defpackage.wnc r8) {
        /*
            r7 = this;
            r0 = 1
            r7.c = r8
            android.graphics.drawable.ColorDrawable r1 = defpackage.c9g.a
            umc r1 = r7.d
            android.graphics.drawable.Drawable r2 = r1.a
            android.graphics.drawable.ColorDrawable r3 = defpackage.c9g.a
            if (r8 == 0) goto L_0x002e
            int r4 = r8.a
            if (r4 != r0) goto L_0x002e
            boolean r4 = r2 instanceof defpackage.snc
            if (r4 == 0) goto L_0x0022
            snc r2 = (defpackage.snc) r2
            defpackage.c9g.b(r2, r8)
            int r8 = r8.d
            r2.z0 = r8
            r2.invalidateSelf()
            goto L_0x003f
        L_0x0022:
            android.graphics.drawable.Drawable r2 = r1.o(r3)
            android.graphics.drawable.Drawable r8 = defpackage.c9g.d(r2, r8)
            r1.o(r8)
            goto L_0x003f
        L_0x002e:
            boolean r8 = r2 instanceof defpackage.snc
            if (r8 == 0) goto L_0x003f
            snc r2 = (defpackage.snc) r2
            android.graphics.drawable.Drawable r8 = r2.o(r3)
            r1.o(r8)
            r8 = 0
            r3.setCallback(r8)
        L_0x003f:
            r8 = 0
            r1 = r8
        L_0x0041:
            ya5 r2 = r7.e
            android.graphics.drawable.Drawable[] r2 = r2.c
            int r2 = r2.length
            if (r1 >= r2) goto L_0x00a3
            dq4 r2 = r7.e(r1)
            wnc r3 = r7.c
        L_0x004e:
            android.graphics.drawable.Drawable r4 = r2.j()
            if (r4 == r2) goto L_0x005d
            boolean r5 = r4 instanceof defpackage.dq4
            if (r5 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r2 = r4
            dq4 r2 = (defpackage.dq4) r2
            goto L_0x004e
        L_0x005d:
            android.graphics.drawable.Drawable r4 = r2.j()
            if (r3 == 0) goto L_0x0083
            int r5 = r3.a
            r6 = 2
            if (r5 != r6) goto L_0x0083
            boolean r5 = r4 instanceof defpackage.nnc
            if (r5 == 0) goto L_0x0072
            nnc r4 = (defpackage.nnc) r4
            defpackage.c9g.b(r4, r3)
            goto L_0x00a1
        L_0x0072:
            if (r4 == 0) goto L_0x00a1
            android.graphics.drawable.ColorDrawable r5 = defpackage.c9g.a
            r2.f(r5)
            android.content.res.Resources r5 = r7.b
            android.graphics.drawable.Drawable r3 = defpackage.c9g.a(r4, r3, r5)
            r2.f(r3)
            goto L_0x00a1
        L_0x0083:
            boolean r2 = r4 instanceof defpackage.nnc
            if (r2 == 0) goto L_0x00a1
            nnc r4 = (defpackage.nnc) r4
            r4.b(r8)
            r4.c()
            r2 = 0
            r4.a(r8, r2)
            r4.i(r2)
            r4.k()
            r4.e(r8)
            int r2 = defpackage.onc.U0
            r4.g()
        L_0x00a1:
            int r1 = r1 + r0
            goto L_0x0041
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la6.n(wnc):void");
    }
}
