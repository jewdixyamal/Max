package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: krd  reason: default package */
public final class krd implements la5 {
    public int X;
    public pa5 Y;
    public yze Z;
    public final int a;
    public final int b;
    public final String c;
    public int o;

    public krd(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [v1d, java.lang.Object] */
    public final void S(pa5 pa5) {
        this.Y = pa5;
        yze B = pa5.B(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        this.Z = B;
        ny5 ny5 = new ny5();
        ny5.m = ia9.l(this.c);
        B.e(new qy5(ny5));
        this.Y.w();
        this.Y.J(new Object());
        this.X = 1;
    }

    public final void d(long j, long j2) {
        if (j == 0 || this.X == 1) {
            this.X = 1;
            this.o = 0;
        }
    }

    public final int g(na5 na5, lh4 lh4) {
        int i = this.X;
        if (i == 1) {
            yze yze = this.Z;
            yze.getClass();
            int c2 = yze.c(na5, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, true);
            if (c2 == -1) {
                this.X = 2;
                this.Z.a(0, 1, this.o, 0, (wze) null);
                this.o = 0;
            } else {
                this.o += c2;
            }
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final boolean n(na5 na5) {
        int i = this.b;
        int i2 = this.a;
        fm9.k((i2 == -1 || i == -1) ? false : true);
        wpa wpa = new wpa(i);
        ((sa4) na5).q(wpa.a, 0, i, false);
        return wpa.A() == i2;
    }

    public final void release() {
    }
}
