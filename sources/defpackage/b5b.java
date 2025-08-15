package defpackage;

import android.util.Pair;
import java.util.HashMap;

/* renamed from: b5b  reason: default package */
public final class b5b extends mue {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final dod f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final mue[] k;
    public final Object[] l;
    public final HashMap m;

    public b5b(mue[] mueArr, Object[] objArr, dod dod) {
        this.f = dod;
        this.e = dod.b.length;
        int length = mueArr.length;
        this.k = mueArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = mueArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length2) {
            mue mue = mueArr[i2];
            this.k[i5] = mue;
            this.j[i5] = i3;
            this.i[i5] = i4;
            i3 += mue.p();
            i4 += this.k[i5].i();
            this.m.put(objArr[i5], Integer.valueOf(i5));
            i2++;
            i5++;
        }
        this.g = i3;
        this.h = i4;
    }

    public final int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        int i2 = 0;
        if (z) {
            int[] iArr = this.f.b;
            i2 = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            mue[] mueArr = this.k;
            if (mueArr[i2].q()) {
                i2 = r(i2, z);
            } else {
                return mueArr[i2].a(z) + this.j[i2];
            }
        } while (i2 != -1);
        return -1;
    }

    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b = this.k[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.i[intValue] + b;
    }

    public final int c(boolean z) {
        int i2;
        int i3 = this.e;
        if (i3 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f.b;
            i2 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i2 = i3 - 1;
        }
        do {
            mue[] mueArr = this.k;
            if (mueArr[i2].q()) {
                i2 = s(i2, z);
            } else {
                return mueArr[i2].c(z) + this.j[i2];
            }
        } while (i2 != -1);
        return -1;
    }

    public final int e(int i2, int i3, boolean z) {
        int[] iArr = this.j;
        int i4 = 0;
        int e2 = oaf.e(iArr, i2 + 1, false, false);
        int i5 = iArr[e2];
        mue[] mueArr = this.k;
        mue mue = mueArr[e2];
        int i6 = i2 - i5;
        if (i3 != 2) {
            i4 = i3;
        }
        int e3 = mue.e(i6, i4, z);
        if (e3 != -1) {
            return i5 + e3;
        }
        int r = r(e2, z);
        while (r != -1 && mueArr[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return mueArr[r].a(z) + iArr[r];
        } else if (i3 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    public final hue g(int i2, hue hue, boolean z) {
        int[] iArr = this.i;
        int e2 = oaf.e(iArr, i2 + 1, false, false);
        int i3 = this.j[e2];
        this.k[e2].g(i2 - iArr[e2], hue, z);
        hue.c += i3;
        if (z) {
            Object obj = this.l[e2];
            Object obj2 = hue.b;
            obj2.getClass();
            hue.b = Pair.create(obj, obj2);
        }
        return hue;
    }

    public final hue h(Object obj, hue hue) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i2 = this.j[intValue];
        this.k[intValue].h(obj3, hue);
        hue.c += i2;
        hue.b = obj;
        return hue;
    }

    public final int i() {
        return this.h;
    }

    public final int l(int i2, int i3, boolean z) {
        int[] iArr = this.j;
        int i4 = 0;
        int e2 = oaf.e(iArr, i2 + 1, false, false);
        int i5 = iArr[e2];
        mue[] mueArr = this.k;
        mue mue = mueArr[e2];
        int i6 = i2 - i5;
        if (i3 != 2) {
            i4 = i3;
        }
        int l2 = mue.l(i6, i4, z);
        if (l2 != -1) {
            return i5 + l2;
        }
        int s = s(e2, z);
        while (s != -1 && mueArr[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return mueArr[s].c(z) + iArr[s];
        } else if (i3 == 2) {
            return c(z);
        } else {
            return -1;
        }
    }

    public final Object m(int i2) {
        int[] iArr = this.i;
        int e2 = oaf.e(iArr, i2 + 1, false, false);
        return Pair.create(this.l[e2], this.k[e2].m(i2 - iArr[e2]));
    }

    public final kue n(int i2, kue kue, long j2) {
        int[] iArr = this.j;
        int e2 = oaf.e(iArr, i2 + 1, false, false);
        int i3 = iArr[e2];
        int i4 = this.i[e2];
        this.k[e2].n(i2 - i3, kue, j2);
        Object obj = this.l[e2];
        if (!kue.q.equals(kue.a)) {
            obj = Pair.create(obj, kue.a);
        }
        kue.a = obj;
        kue.n += i4;
        kue.o += i4;
        return kue;
    }

    public final int p() {
        return this.g;
    }

    public final int r(int i2, boolean z) {
        if (z) {
            dod dod = this.f;
            int i3 = dod.c[i2] + 1;
            int[] iArr = dod.b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        } else if (i2 < this.e - 1) {
            return i2 + 1;
        } else {
            return -1;
        }
    }

    public final int s(int i2, boolean z) {
        if (z) {
            dod dod = this.f;
            int i3 = dod.c[i2] - 1;
            if (i3 >= 0) {
                return dod.b[i3];
            }
            return -1;
        } else if (i2 > 0) {
            return i2 - 1;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b5b(java.util.Collection r7, defpackage.dod r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            mue[] r0 = new defpackage.mue[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        L_0x000c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0022
            java.lang.Object r4 = r1.next()
            kk8 r4 = (defpackage.kk8) r4
            int r5 = r3 + 1
            mue r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto L_0x000c
        L_0x0022:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L_0x002c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r7.next()
            kk8 r3 = (defpackage.kk8) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L_0x002c
        L_0x0042:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5b.<init>(java.util.Collection, dod):void");
    }
}
