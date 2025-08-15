package defpackage;

import java.io.IOException;

/* renamed from: fp6  reason: default package */
public final class fp6 extends mne {
    public final /* synthetic */ cc1 e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ ded g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp6(String str, cc1 cc1, ded ded) {
        super(str, true);
        this.e = cc1;
        this.g = ded;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, mec] */
    public final long a() {
        int i;
        long a;
        rp6[] rp6Arr;
        cc1 cc1 = this.e;
        boolean z = this.f;
        ded ded = this.g;
        ? obj = new Object();
        synchronized (((kp6) cc1.c).J0) {
            synchronized (((kp6) cc1.c)) {
                try {
                    ded ded2 = ((kp6) cc1.c).D0;
                    if (!z) {
                        ded ded3 = new ded();
                        for (int i2 = 0; i2 < 10; i2++) {
                            if (((1 << i2) & ded2.a) != 0) {
                                ded3.b(i2, ded2.b[i2]);
                            }
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & ded.a) != 0) {
                                ded3.b(i3, ded.b[i3]);
                            }
                        }
                        ded = ded3;
                    }
                    obj.a = ded;
                    a = ((long) ded.a()) - ((long) ded2.a());
                    if (a != 0) {
                        if (!((kp6) cc1.c).c.isEmpty()) {
                            Object[] array = ((kp6) cc1.c).c.values().toArray(new rp6[0]);
                            if (array != null) {
                                rp6Arr = (rp6[]) array;
                                kp6 kp6 = (kp6) cc1.c;
                                kp6.D0 = (ded) obj.a;
                                kp6.v0.c(new dp6(((kp6) cc1.c).o + " onSettings", cc1, (mec) obj), 0);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    rp6Arr = null;
                    kp6 kp62 = (kp6) cc1.c;
                    kp62.D0 = (ded) obj.a;
                    kp62.v0.c(new dp6(((kp6) cc1.c).o + " onSettings", cc1, (mec) obj), 0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ((kp6) cc1.c).J0.a((ded) obj.a);
            } catch (IOException e2) {
                ((kp6) cc1.c).a(2, 2, e2);
            }
        }
        rp6[] rp6Arr2 = rp6Arr;
        if (rp6Arr2 == null) {
            return -1;
        }
        for (rp6 rp6 : rp6Arr2) {
            synchronized (rp6) {
                rp6.d += a;
                if (a > 0) {
                    rp6.notifyAll();
                }
            }
        }
        return -1;
    }
}
