package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: id3  reason: default package */
public final class id3 extends xtc {
    public volatile boolean X;
    public final ml7 a;
    public final hc3 b;
    public final ml7 c;
    public final kd3 o;

    /* JADX WARNING: type inference failed for: r3v1, types: [zl4, ml7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [zl4, hc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [ml7, java.lang.Object] */
    public id3(kd3 kd3) {
        this.o = kd3;
        ? obj = new Object();
        this.a = obj;
        ? obj2 = new Object();
        this.b = obj2;
        ? obj3 = new Object();
        this.c = obj3;
        obj3.a(obj);
        obj3.a(obj2);
    }

    public final zl4 b(Runnable runnable) {
        if (this.X) {
            return iz4.a;
        }
        return this.o.e(runnable, 0, TimeUnit.MILLISECONDS, this.a);
    }

    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.X) {
            return iz4.a;
        }
        return this.o.e(runnable, j, timeUnit, this.b);
    }

    public final void g() {
        if (!this.X) {
            this.X = true;
            this.c.g();
        }
    }

    public final boolean h() {
        return this.X;
    }
}
