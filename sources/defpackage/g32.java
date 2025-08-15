package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

/* renamed from: g32  reason: default package */
public final class g32 extends ol implements lme {
    public final String X;
    public final int Y = 4;
    public final String o;

    public g32(long j, String str, String str2) {
        super(j);
        this.o = str;
        this.X = str2;
    }

    public final void e(gle gle) {
        mf9 mf9 = (mf9) gle;
        gi9 c0 = m().c0(Collections.singletonList(mf9.X));
        long[] jArr = c0.b;
        long[] jArr2 = c0.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            cu8 q = p().q(p().f(j2, ((p7b) r()).a.t(), mf9.o));
                            String str = this.X;
                            if (!(str == null || str.length() == 0)) {
                                ((k4a) j()).n(j2, this.X, mf9.c);
                            }
                            m().S(j2, mf9.c, q);
                            l().c(new h32(this.a, j2));
                            return;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final void g(pke pke) {
        l().c(new oi0(this.a, pke));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, kna] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.AbstractCollection, wz, java.util.ArrayList] */
    public final dle i() {
        ju3 ju3 = r1;
        ju3 ju32 = new ju3(2, (Long) null, nz4.a, this.o, (String) null, (String) null, (String) null, (a20) null, (String) null, (String) null, true, this.Y, (fs8) null, (String) null, false, false);
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        ? arrayList = new ArrayList(1);
        arrayList.add(ju3);
        obj.c = arrayList;
        return new tq2(0, 0, obj.a(), (Boolean) null, 0);
    }
}
