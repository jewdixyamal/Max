package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.animated.gif.GifImage;

/* renamed from: pn0  reason: default package */
public final class pn0 implements vf {
    public final boolean X;
    public final xn0 Y;
    public final l84 Z;
    public final s2b a;
    public final wn0 b;
    public final gg c;
    public final te o;
    public final Bitmap.Config s0 = Bitmap.Config.ARGB_8888;
    public final Paint t0 = new Paint(6);
    public Rect u0;
    public int v0;
    public int w0;

    public pn0(s2b s2b, wn0 wn0, re6 re6, te teVar, boolean z, xn0 xn0, l84 l84) {
        this.a = s2b;
        this.b = wn0;
        this.c = re6;
        this.o = teVar;
        this.X = z;
        this.Y = xn0;
        this.Z = l84;
        new Path();
        new Matrix();
        c();
    }

    public final void B(ColorFilter colorFilter) {
        this.t0.setColorFilter(colorFilter);
    }

    public final int G() {
        return this.c.G();
    }

    public final int M(int i) {
        return this.c.M(i);
    }

    public final int V() {
        return this.w0;
    }

    public final void Z(Rect rect) {
        this.u0 = rect;
        te teVar = this.o;
        ue ueVar = (ue) teVar.c;
        if (!ue.a((GifImage) ueVar.e, rect).equals((Rect) ueVar.f)) {
            boolean z = ueVar.b;
            ueVar = new ue((oz7) ueVar.c, (a8g) ueVar.d, rect, z);
        }
        if (ueVar != ((ue) teVar.c)) {
            teVar.c = ueVar;
            teVar.o = new w36(ueVar, teVar.a, (fd7) teVar.X);
        }
        c();
    }

    public final boolean a(int i, o43 o43, Canvas canvas, int i2) {
        if (o43 == null || !o43.n0(o43)) {
            return false;
        }
        Bitmap bitmap = (Bitmap) o43.e0();
        Rect rect = this.u0;
        Paint paint = this.t0;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.X) {
            return true;
        }
        this.b.c(i, o43);
        return true;
    }

    public final int a0() {
        return this.v0;
    }

    public final boolean b(Canvas canvas, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        o43 o43 = null;
        try {
            boolean z4 = false;
            int i3 = 1;
            if (this.X) {
                xn0 xn0 = this.Y;
                o43 j = xn0 != null ? xn0.j(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (j != null) {
                    try {
                        if (j.m0()) {
                            Bitmap bitmap = (Bitmap) j.e0();
                            Rect rect = this.u0;
                            Paint paint = this.t0;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            o43.S(j);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        o43 = j;
                        o43.S(o43);
                        throw th;
                    }
                }
                if (xn0 != null) {
                    xn0.l(canvas.getWidth(), canvas.getHeight());
                }
                o43.S(j);
                return false;
            }
            wn0 wn0 = this.b;
            if (i2 != 0) {
                te teVar = this.o;
                if (i2 == 1) {
                    o43 = wn0.e();
                    if (o43 != null) {
                        if (o43.m0()) {
                            z2 = teVar.d((Bitmap) o43.e0(), i);
                            if (!z2) {
                                o43.S(o43);
                            }
                            if (z2 && a(i, o43, canvas, 1)) {
                                z4 = true;
                            }
                            z = z4;
                            i3 = 2;
                        }
                    }
                    z2 = false;
                    z4 = true;
                    z = z4;
                    i3 = 2;
                } else if (i2 == 2) {
                    o43 = this.a.c(this.v0, this.w0, this.s0);
                    if (o43 != null) {
                        if (o43.m0()) {
                            z3 = teVar.d((Bitmap) o43.e0(), i);
                            if (!z3) {
                                o43.S(o43);
                            }
                            if (z3 && a(i, o43, canvas, 2)) {
                                z4 = true;
                            }
                            z = z4;
                            i3 = 3;
                        }
                    }
                    z3 = false;
                    z4 = true;
                    z = z4;
                    i3 = 3;
                } else if (i2 != 3) {
                    return false;
                } else {
                    o43 = wn0.b();
                    z = a(i, o43, canvas, 3);
                    i3 = -1;
                }
            } else {
                o43 = wn0.f(i);
                z = a(i, o43, canvas, 0);
            }
            o43.S(o43);
            return (z || i3 == -1) ? z : b(canvas, i, i3);
        } catch (RuntimeException e) {
            ta5.i(pn0.class, "Failed to create frame bitmap", e);
            return false;
        } catch (Throwable th2) {
            th = th2;
            o43.S(o43);
            throw th;
        }
    }

    public final void b0(av1 av1) {
    }

    public final void c() {
        te teVar = this.o;
        int k = ((GifImage) ((ue) teVar.c).e).k();
        this.v0 = k;
        int i = -1;
        if (k == -1) {
            Rect rect = this.u0;
            this.v0 = rect != null ? rect.width() : -1;
        }
        int h = ((GifImage) ((ue) teVar.c).e).h();
        this.w0 = h;
        if (h == -1) {
            Rect rect2 = this.u0;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.w0 = i;
        }
    }

    public final boolean c0(Drawable drawable, Canvas canvas, int i) {
        l84 l84;
        xn0 xn0;
        boolean b2 = b(canvas, i, 0);
        if (!(this.X || (l84 = this.Z) == null || (xn0 = this.Y) == null)) {
            xn0.i(l84, this.b, this, i, (k56) null);
        }
        return b2;
    }

    public final void clear() {
        if (this.X) {
            xn0 xn0 = this.Y;
            if (xn0 != null) {
                xn0.k();
                return;
            }
            return;
        }
        this.b.clear();
    }

    public final int g0() {
        return this.c.g0();
    }

    public final void p(int i) {
        this.t0.setAlpha(i);
    }

    public final int x() {
        return this.c.x();
    }
}
