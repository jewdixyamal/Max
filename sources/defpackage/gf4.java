package defpackage;

import android.opengl.GLES30;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: gf4  reason: default package */
public final /* synthetic */ class gf4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gf4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                kf4 kf4 = (kf4) this.c;
                long j = this.b;
                synchronized (kf4) {
                    while (kf4.i.f() < kf4.i.b && kf4.j.f() <= j) {
                        try {
                            er0 er0 = kf4.i;
                            ArrayDeque arrayDeque = (ArrayDeque) er0.e;
                            fm9.k(!arrayDeque.isEmpty());
                            ((ArrayDeque) er0.d).add((hd6) arrayDeque.remove());
                            kf4.j.h();
                            GLES30.glDeleteSync(kf4.k.h());
                            mr0.f();
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    kf4.b();
                }
                return;
            case 1:
                rf4 rf4 = (rf4) this.c;
                rk5 rk5 = rf4.i;
                if (rk5.p == null) {
                    fm9.k(!rk5.r);
                    ConcurrentLinkedQueue concurrentLinkedQueue = rk5.l;
                    Pair pair = (Pair) concurrentLinkedQueue.remove();
                    long longValue = ((Long) pair.second).longValue();
                    rk5.k(rf4.b, (hd6) pair.first, longValue, this.b);
                    if (concurrentLinkedQueue.isEmpty() && rk5.x) {
                        of4 of4 = rk5.A;
                        of4.getClass();
                        of4.a();
                        rk5.x = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                rk5 rk52 = (rk5) this.c;
                fm9.k(rk52.p != null);
                while (true) {
                    er0 er02 = rk52.m;
                    if (er02.f() < er02.b) {
                        uy uyVar = rk52.n;
                        if (uyVar.f() <= this.b) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) er02.e;
                            fm9.k(!arrayDeque2.isEmpty());
                            ((ArrayDeque) er02.d).add((hd6) arrayDeque2.remove());
                            uyVar.h();
                            GLES30.glDeleteSync(rk52.o.h());
                            mr0.f();
                            rk52.y.h();
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
        }
    }
}
