package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: kwd  reason: default package */
public final class kwd {
    public static final au4 p = new au4(1);
    public static final au4 q = new au4(2);
    public static final au4 r = new au4(3);
    public static final au4 s = new au4(4);
    public static final au4 t = new au4(5);
    public static final au4 u = new au4(6);
    public static final au4 v = new au4(7);
    public static final au4 w = new au4(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final ju0 e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public final float j;
    public final ArrayList k;
    public final ArrayList l;
    public lwd m;
    public float n;
    public boolean o;

    public kwd(Object obj, ju0 ju0) {
        this(obj, ju0, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static fg d() {
        ThreadLocal threadLocal = fg.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new fg(new ph4(3)));
        }
        return (fg) threadLocal.get();
    }

    public final void a(float f2) {
        if (this.f) {
            this.n = f2;
            return;
        }
        if (this.m == null) {
            this.m = new lwd(f2);
        }
        this.m.i = (double) f2;
        g();
    }

    public final void b() {
        if (d().a()) {
            if (this.f) {
                c(true);
            }
            float f2 = this.n;
            if (f2 != Float.MAX_VALUE) {
                lwd lwd = this.m;
                if (lwd == null) {
                    this.m = new lwd(f2);
                } else {
                    lwd.i = (double) f2;
                }
                this.n = Float.MAX_VALUE;
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        int i2 = 0;
        this.f = false;
        fg d2 = d();
        d2.a.remove(this);
        ArrayList arrayList2 = d2.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, (Object) null);
            d2.f = true;
        }
        this.i = 0;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                ((kf) arrayList.get(i2)).a(this.b, z);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f2) {
        this.e.G(this.d, f2);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            } else if (arrayList.get(i2) == null) {
                i2++;
            } else {
                ((u1f) arrayList.get(i2)).getClass();
                throw null;
            }
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        } else if (this.f) {
            this.o = true;
        }
    }

    public final void g() {
        lwd lwd = this.m;
        if (lwd != null) {
            double d2 = (double) ((float) lwd.i);
            if (d2 > ((double) this.g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d2 >= ((double) this.h)) {
                double abs = Math.abs((double) (this.j * 0.75f));
                lwd.d = abs;
                lwd.e = abs * 62.5d;
                if (d().a()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.u(this.d);
                        }
                        float f2 = this.b;
                        if (f2 > this.g || f2 < this.h) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        fg d3 = d();
                        ArrayList arrayList = d3.b;
                        if (arrayList.size() == 0) {
                            ph4 ph4 = d3.e;
                            ph4.getClass();
                            ((Choreographer) ph4.a).postFrameCallback(new eg(0, d3.d));
                            if (Build.VERSION.SDK_INT >= 33) {
                                d3.g = ValueAnimator.getDurationScale();
                                if (d3.h == null) {
                                    d3.h = new y7g(d3);
                                }
                                y7g y7g = d3.h;
                                if (((dg) y7g.b) == null) {
                                    dg dgVar = new dg(y7g);
                                    y7g.b = dgVar;
                                    boolean unused = ValueAnimator.registerDurationScaleChangeListener(dgVar);
                                }
                            }
                        }
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public kwd(Object obj, ju0 ju0, float f2) {
        this(obj, ju0, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
        this.m = new lwd(f2);
    }

    public kwd(Object obj, ju0 ju0, int i2) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = ju0;
        if (ju0 == t || ju0 == u || ju0 == v) {
            this.j = 0.1f;
        } else if (ju0 == w) {
            this.j = 0.00390625f;
        } else if (ju0 == r || ju0 == s) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }
}
