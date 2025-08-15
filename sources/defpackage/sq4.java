package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: sq4  reason: default package */
public class sq4 implements iqf {
    public mq4 X = null;
    public final qq4 Y;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public rq4 o;

    public sq4(la6 la6) {
        this.Y = qq4.c ? new qq4() : qq4.b;
        if (la6 != null) {
            j(la6);
        }
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.Y.a(z ? pq4.B0 : pq4.C0);
            this.c = z;
            c();
        }
    }

    public final void b() {
        if (!this.a) {
            pq4 pq4 = pq4.Z;
            this.Y.a(pq4);
            this.a = true;
            mq4 mq4 = this.X;
            if (mq4 != null) {
                k0 k0Var = (k0) mq4;
                if (k0Var.h != null) {
                    f46.I();
                    if (ta5.a.i(2)) {
                        ta5.f(k0.x, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j, k0Var.m ? "request already submitted" : "request needs submit");
                    }
                    k0Var.a.a(pq4);
                    k0Var.h.getClass();
                    k0Var.b.g(k0Var);
                    k0Var.l = true;
                    if (!k0Var.m) {
                        k0Var.r();
                    }
                    f46.I();
                }
            }
        }
    }

    public final void c() {
        if (!this.b || !this.c) {
            d();
        } else {
            b();
        }
    }

    public final void d() {
        if (this.a) {
            qq4 qq4 = this.Y;
            pq4 pq4 = pq4.s0;
            qq4.a(pq4);
            boolean z = false;
            this.a = false;
            if (f()) {
                k0 k0Var = (k0) this.X;
                k0Var.getClass();
                f46.I();
                if (ta5.a.i(2)) {
                    ta5.e(k0.x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j);
                }
                k0Var.a.a(pq4);
                k0Var.l = false;
                bg4 bg4 = k0Var.b;
                bg4.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (bg4.b) {
                        try {
                            if (!((ArrayList) bg4.o).contains(k0Var)) {
                                ((ArrayList) bg4.o).add(k0Var);
                                if (((ArrayList) bg4.o).size() == 1) {
                                    z = true;
                                }
                                if (z) {
                                    ((Handler) bg4.c).post((re) bg4.Y);
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                } else {
                    k0Var.n();
                }
                f46.I();
            }
        }
    }

    public final umc e() {
        rq4 rq4 = this.o;
        if (rq4 == null) {
            return null;
        }
        return ((la6) rq4).d;
    }

    public final boolean f() {
        mq4 mq4 = this.X;
        return mq4 != null && ((k0) mq4).h == this.o;
    }

    public final void g() {
        this.Y.a(pq4.z0);
        this.b = true;
        c();
    }

    public final void h() {
        this.Y.a(pq4.A0);
        this.b = false;
        c();
    }

    public final void i(mq4 mq4) {
        boolean z = this.a;
        if (z) {
            d();
        }
        boolean f = f();
        qq4 qq4 = this.Y;
        if (f) {
            qq4.a(pq4.o);
            ((d2b) this.X).w((rq4) null);
        }
        this.X = mq4;
        if (mq4 != null) {
            qq4.a(pq4.c);
            ((d2b) this.X).w(this.o);
        } else {
            qq4.a(pq4.X);
        }
        if (z) {
            b();
        }
    }

    public final void j(rq4 rq4) {
        this.Y.a(pq4.a);
        boolean f = f();
        umc e = e();
        if (e instanceof hqf) {
            e.Y = null;
        }
        rq4.getClass();
        this.o = rq4;
        umc umc = ((la6) rq4).d;
        a(umc == null || umc.isVisible());
        umc e2 = e();
        if (e2 instanceof hqf) {
            e2.Y = this;
        }
        if (f) {
            ((d2b) this.X).w(rq4);
        }
    }

    public final void onDraw() {
        if (!this.a) {
            ta5.j(qq4.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.X)), toString());
            this.b = true;
            this.c = true;
            c();
        }
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.d("controllerAttached", this.a);
        r0.d("holderAttached", this.b);
        r0.d("drawableVisible", this.c);
        r0.e(this.Y.a.toString(), "events");
        return r0.toString();
    }
}
