package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hsd  reason: default package */
public final class hsd extends AtomicInteger implements zl4 {
    public final erd a;
    public final b66 b;
    public final isd[] c;
    public Object[] o;

    public hsd(int i, b66 b66, erd erd) {
        super(i);
        this.a = erd;
        this.b = b66;
        isd[] isdArr = new isd[i];
        for (int i2 = 0; i2 < i; i2++) {
            isdArr[i2] = new isd(this, i2);
        }
        this.c = isdArr;
        this.o = new Object[i];
    }

    public final void a(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            isd[] isdArr = this.c;
            int length = isdArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                isd isd = isdArr[i2];
                isd.getClass();
                dm4.a(isd);
            }
            while (true) {
                i++;
                if (i < length) {
                    isd isd2 = isdArr[i];
                    isd2.getClass();
                    dm4.a(isd2);
                } else {
                    this.o = null;
                    this.a.onError(th);
                    return;
                }
            }
        } else {
            j47.Z(th);
        }
    }

    public final void g() {
        if (getAndSet(0) > 0) {
            for (isd isd : this.c) {
                isd.getClass();
                dm4.a(isd);
            }
            this.o = null;
        }
    }

    public final boolean h() {
        return get() <= 0;
    }
}
