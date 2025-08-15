package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* renamed from: d76  reason: default package */
public final /* synthetic */ class d76 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ d76(lq1 lq1, bm7 bm7, long j) {
        this.c = lq1;
        this.o = bm7;
        this.b = j;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, m20] */
    public final Object call() {
        m20 m20;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((lq1) this.c).d(new TimeoutException("Future[" + ((bm7) this.o) + "] is not done within " + this.b + " ms.")));
            default:
                vlc vlc = (vlc) this.c;
                t19 d = vlc.d();
                long j = this.b;
                ru8 c2 = d.c(j);
                int i = 0;
                if (c2 == null) {
                    return 0;
                }
                k8g k8g = c2.m;
                if (k8g != null) {
                    m20 = k8g.C();
                } else {
                    ? obj = new Object();
                    obj.a = nz4.a;
                    m20 = obj;
                }
                int i2 = 1;
                int b2 = m20.b() + (m20.b != null ? 1 : 0);
                ((qj3) this.o).accept(m20);
                if (m20.b == null) {
                    i2 = 0;
                }
                int b3 = m20.b() + i2;
                if (b2 > 0 || b3 > 0) {
                    k8g c3 = m20.c();
                    i = vlc.d().m(new b6f(j, c3, iz7.c(c3)));
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ d76(vlc vlc, long j, qj3 qj3) {
        this.c = vlc;
        this.b = j;
        this.o = qj3;
    }
}
