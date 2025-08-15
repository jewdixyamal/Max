package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: xl6  reason: default package */
public final class xl6 {
    public final am6 a;
    public final t24 b;
    public final t24 c;
    public final mfe d;
    public final Uri[] e;
    public final qy5[] f;
    public final hb4 g;
    public final rze h;
    public final List i;
    public final wmc j = new wmc(10);
    public final j4b k;
    public final long l;
    public boolean m;
    public byte[] n = oaf.f;
    public BehindLiveWindowException o;
    public Uri p;
    public boolean q;
    public n85 r;
    public long s = -9223372036854775807L;
    public boolean t;

    /* JADX WARNING: type inference failed for: r3v1, types: [fk0, n85, ul6] */
    public xl6(am6 am6, hb4 hb4, Uri[] uriArr, qy5[] qy5Arr, w4d w4d, z0f z0f, mfe mfe, long j2, List list, j4b j4b) {
        this.a = am6;
        this.g = hb4;
        this.e = uriArr;
        this.f = qy5Arr;
        this.d = mfe;
        this.l = j2;
        this.i = list;
        this.k = j4b;
        t24 a2 = ((q24) w4d.b).a();
        this.b = a2;
        if (z0f != null) {
            a2.H(z0f);
        }
        this.c = ((q24) w4d.b).a();
        this.h = new rze("", qy5Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((qy5Arr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        rze rze = this.h;
        int[] c0 = s5c.c0(arrayList);
        ? fk0 = new fk0(rze, c0);
        fk0.g = fk0.s(rze.d[c0[0]]);
        this.r = fk0;
    }

    public final i78[] a(dm6 dm6, long j2) {
        int i2;
        List list;
        dm6 dm62 = dm6;
        int d2 = dm62 == null ? -1 : this.h.d(dm62.o);
        int length = this.r.length();
        i78[] i78Arr = new i78[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int f2 = this.r.f(i3);
            Uri uri = this.e[f2];
            hb4 hb4 = this.g;
            if (!hb4.d(uri)) {
                i78Arr[i3] = i78.P;
                i2 = i3;
            } else {
                qm6 b2 = hb4.b(uri, z);
                b2.getClass();
                long j3 = b2.h - hb4.Z;
                boolean z2 = f2 != d2 ? true : z;
                long j4 = j3;
                i2 = i3;
                qm6 qm6 = b2;
                Pair c2 = c(dm6, z2, b2, j3, j2);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i4 = (int) (longValue - qm6.k);
                if (i4 >= 0) {
                    zw6 zw6 = qm6.r;
                    if (zw6.size() >= i4) {
                        ArrayList arrayList = new ArrayList();
                        if (i4 < zw6.size()) {
                            if (intValue != -1) {
                                lm6 lm6 = (lm6) zw6.get(i4);
                                if (intValue == 0) {
                                    arrayList.add(lm6);
                                } else if (intValue < lm6.x0.size()) {
                                    zw6 zw62 = lm6.x0;
                                    arrayList.addAll(zw62.subList(intValue, zw62.size()));
                                }
                                i4++;
                            }
                            arrayList.addAll(zw6.subList(i4, zw6.size()));
                            intValue = 0;
                        }
                        if (qm6.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            zw6 zw63 = qm6.s;
                            if (intValue < zw63.size()) {
                                arrayList.addAll(zw63.subList(intValue, zw63.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        i78Arr[i2] = new sl6(j4, list);
                    }
                }
                ls5 ls5 = zw6.b;
                list = ffc.X;
                i78Arr[i2] = new sl6(j4, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return i78Arr;
    }

    public final int b(dm6 dm6) {
        if (dm6.z0 == -1) {
            return 1;
        }
        qm6 b2 = this.g.b(this.e[this.h.d(dm6.o)], false);
        b2.getClass();
        int i2 = (int) (dm6.u0 - b2.k);
        if (i2 < 0) {
            return 1;
        }
        zw6 zw6 = b2.r;
        zw6 zw62 = i2 < zw6.size() ? ((lm6) zw6.get(i2)).x0 : b2.s;
        int size = zw62.size();
        int i3 = dm6.z0;
        if (i3 >= size) {
            return 2;
        }
        hm6 hm6 = (hm6) zw62.get(i3);
        if (hm6.x0) {
            return 0;
        }
        return oaf.a(Uri.parse(mr0.R(b2.a, hm6.a)), dm6.b.a) ? 1 : 2;
    }

    public final Pair c(dm6 dm6, boolean z, qm6 qm6, long j2, long j3) {
        boolean z2 = true;
        int i2 = -1;
        if (dm6 == null || z) {
            long j4 = qm6.u + j2;
            if (dm6 != null && !this.q) {
                j3 = dm6.Z;
            }
            boolean z3 = qm6.o;
            long j5 = qm6.k;
            zw6 zw6 = qm6.r;
            if (!z3 && j3 >= j4) {
                return new Pair(Long.valueOf(j5 + ((long) zw6.size())), -1);
            }
            long j6 = j3 - j2;
            Long valueOf = Long.valueOf(j6);
            int i3 = 0;
            if (this.g.Y && dm6 != null) {
                z2 = false;
            }
            int d2 = oaf.d(valueOf, zw6, z2);
            long j7 = ((long) d2) + j5;
            if (d2 >= 0) {
                lm6 lm6 = (lm6) zw6.get(d2);
                int i4 = (j6 > (lm6.X + lm6.c) ? 1 : (j6 == (lm6.X + lm6.c) ? 0 : -1));
                zw6 zw62 = qm6.s;
                zw6 zw63 = i4 < 0 ? lm6.x0 : zw62;
                while (true) {
                    if (i3 >= zw63.size()) {
                        break;
                    }
                    hm6 hm6 = (hm6) zw63.get(i3);
                    if (j6 >= hm6.X + hm6.c) {
                        i3++;
                    } else if (hm6.w0) {
                        j7 += zw63 == zw62 ? 1 : 0;
                        i2 = i3;
                    }
                }
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i2));
        }
        boolean z4 = dm6.T0;
        long j8 = dm6.u0;
        int i5 = dm6.z0;
        if (!z4) {
            return new Pair(Long.valueOf(j8), Integer.valueOf(i5));
        }
        if (i5 == -1) {
            j8 = dm6.b();
        }
        Long valueOf2 = Long.valueOf(j8);
        if (i5 != -1) {
            i2 = i5 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i2));
    }

    public final ql6 d(Uri uri, int i2, boolean z) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        wmc wmc = this.j;
        byte[] bArr = (byte[]) ((i56) wmc.a).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((i56) wmc.a).put(uri2, bArr);
            return null;
        }
        a34 a34 = new a34(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        qy5 qy5 = this.f[i2];
        int k2 = this.r.k();
        Object m2 = this.r.m();
        byte[] bArr3 = this.n;
        j13 j13 = new j13(this.c, a34, 3, qy5, k2, m2, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = oaf.f;
        }
        j13.u0 = bArr3;
        return j13;
    }
}
