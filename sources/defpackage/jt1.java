package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jt1  reason: default package */
public final /* synthetic */ class jt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;
    public final /* synthetic */ lq1 c;

    public /* synthetic */ jt1(nx0 nx0, lq1 lq1, int i) {
        this.a = i;
        this.b = nx0;
        this.c = lq1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                nx0 nx0 = this.b;
                nx0.Y = true;
                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                lq1 lq1 = (lq1) nx0.s0;
                if (lq1 != null) {
                    lq1.d(exc);
                    nx0.s0 = null;
                }
                nx0.s0 = this.c;
                if (nx0.b) {
                    st1 st1 = (st1) nx0.c;
                    st1.getClass();
                    kq0.w(f8.g(new ync(22, st1))).d(new b(27, (Object) nx0), (Executor) nx0.o);
                    nx0.Y = false;
                    return;
                }
                return;
            default:
                nx0 nx02 = this.b;
                nx02.Y = true;
                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                lq1 lq12 = (lq1) nx02.s0;
                if (lq12 != null) {
                    lq12.d(exc2);
                    nx02.s0 = null;
                }
                nx02.s0 = this.c;
                if (nx02.b) {
                    st1 st12 = (st1) nx02.c;
                    st12.getClass();
                    kq0.w(f8.g(new ync(22, st12))).d(new b(27, (Object) nx02), (Executor) nx02.o);
                    nx02.Y = false;
                    return;
                }
                return;
        }
    }
}
