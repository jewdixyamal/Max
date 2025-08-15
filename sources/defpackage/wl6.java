package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wl6  reason: default package */
public final class wl6 {
    public final zl6 a;
    public final r24 b;
    public final r24 c;
    public final o9g d;
    public final Uri[] e;
    public final oy5[] f;
    public final hb4 g;
    public final qze h;
    public final List i;
    public final bkg j = new bkg(13);
    public final i4b k;
    public boolean l;
    public byte[] m = maf.f;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public m85 q;
    public long r = -9223372036854775807L;
    public boolean s;

    /* JADX WARNING: type inference failed for: r3v1, types: [ek0, m85, tl6] */
    public wl6(zl6 zl6, hb4 hb4, Uri[] uriArr, oy5[] oy5Arr, gaa gaa, y0f y0f, o9g o9g, List list, i4b i4b) {
        this.a = zl6;
        this.g = hb4;
        this.e = uriArr;
        this.f = oy5Arr;
        this.d = o9g;
        this.i = list;
        this.k = i4b;
        r24 a2 = ((p24) gaa.a).a();
        this.b = a2;
        if (y0f != null) {
            a2.N(y0f);
        }
        this.c = ((p24) gaa.a).a();
        this.h = new qze("", oy5Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((oy5Arr[i2].X & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        qze qze = this.h;
        int[] c0 = s5c.c0(arrayList);
        ? ek0 = new ek0(qze, c0);
        ek0.g = ek0.q(qze.c[c0[0]]);
        this.q = ek0;
    }

    public final h78[] a(cm6 cm6, long j2) {
        int i2;
        List list;
        cm6 cm62 = cm6;
        int a2 = cm62 == null ? -1 : this.h.a(cm62.o);
        int length = this.q.length();
        h78[] h78Arr = new h78[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int f2 = this.q.f(i3);
            Uri uri = this.e[f2];
            hb4 hb4 = this.g;
            if (!hb4.d(uri)) {
                h78Arr[i3] = h78.O;
                i2 = i3;
            } else {
                pm6 a3 = hb4.a(uri, z);
                a3.getClass();
                long j3 = a3.h - hb4.Z;
                boolean z2 = f2 != a2 ? true : z;
                long j4 = j3;
                i2 = i3;
                pm6 pm6 = a3;
                Pair c2 = c(cm6, z2, a3, j3, j2);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i4 = (int) (longValue - pm6.k);
                if (i4 >= 0) {
                    zw6 zw6 = pm6.r;
                    if (zw6.size() >= i4) {
                        ArrayList arrayList = new ArrayList();
                        if (i4 < zw6.size()) {
                            if (intValue != -1) {
                                km6 km6 = (km6) zw6.get(i4);
                                if (intValue == 0) {
                                    arrayList.add(km6);
                                } else if (intValue < km6.x0.size()) {
                                    zw6 zw62 = km6.x0;
                                    arrayList.addAll(zw62.subList(intValue, zw62.size()));
                                }
                                i4++;
                            }
                            arrayList.addAll(zw6.subList(i4, zw6.size()));
                            intValue = 0;
                        }
                        if (pm6.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            zw6 zw63 = pm6.s;
                            if (intValue < zw63.size()) {
                                arrayList.addAll(zw63.subList(intValue, zw63.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        h78Arr[i2] = new rl6(j4, list);
                    }
                }
                ls5 ls5 = zw6.b;
                list = ffc.X;
                h78Arr[i2] = new rl6(j4, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return h78Arr;
    }

    public final int b(cm6 cm6) {
        if (cm6.z0 == -1) {
            return 1;
        }
        pm6 a2 = this.g.a(this.e[this.h.a(cm6.o)], false);
        a2.getClass();
        int i2 = (int) (cm6.u0 - a2.k);
        if (i2 < 0) {
            return 1;
        }
        zw6 zw6 = a2.r;
        zw6 zw62 = i2 < zw6.size() ? ((km6) zw6.get(i2)).x0 : a2.s;
        int size = zw62.size();
        int i3 = cm6.z0;
        if (i3 >= size) {
            return 2;
        }
        gm6 gm6 = (gm6) zw62.get(i3);
        if (gm6.x0) {
            return 0;
        }
        return maf.a(Uri.parse(kq0.D(a2.a, gm6.a)), cm6.b.a) ? 1 : 2;
    }

    public final Pair c(cm6 cm6, boolean z, pm6 pm6, long j2, long j3) {
        boolean z2 = true;
        int i2 = -1;
        if (cm6 == null || z) {
            long j4 = pm6.u + j2;
            if (cm6 != null && !this.p) {
                j3 = cm6.Z;
            }
            boolean z3 = pm6.o;
            long j5 = pm6.k;
            zw6 zw6 = pm6.r;
            if (!z3 && j3 >= j4) {
                return new Pair(Long.valueOf(j5 + ((long) zw6.size())), -1);
            }
            long j6 = j3 - j2;
            Long valueOf = Long.valueOf(j6);
            int i3 = 0;
            if (this.g.Y && cm6 != null) {
                z2 = false;
            }
            int e2 = maf.e(valueOf, zw6, z2);
            long j7 = ((long) e2) + j5;
            if (e2 >= 0) {
                km6 km6 = (km6) zw6.get(e2);
                int i4 = (j6 > (km6.X + km6.c) ? 1 : (j6 == (km6.X + km6.c) ? 0 : -1));
                zw6 zw62 = pm6.s;
                zw6 zw63 = i4 < 0 ? km6.x0 : zw62;
                while (true) {
                    if (i3 >= zw63.size()) {
                        break;
                    }
                    gm6 gm6 = (gm6) zw63.get(i3);
                    if (j6 >= gm6.X + gm6.c) {
                        i3++;
                    } else if (gm6.w0) {
                        j7 += zw63 == zw62 ? 1 : 0;
                        i2 = i3;
                    }
                }
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i2));
        }
        boolean z4 = cm6.S0;
        long j8 = cm6.u0;
        int i5 = cm6.z0;
        if (!z4) {
            return new Pair(Long.valueOf(j8), Integer.valueOf(i5));
        }
        if (i5 == -1) {
            j8 = cm6.b();
        }
        Long valueOf2 = Long.valueOf(j8);
        if (i5 != -1) {
            i2 = i5 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i2));
    }

    public final pl6 d(Uri uri, int i2) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        bkg bkg = this.j;
        byte[] bArr = (byte[]) ((i56) bkg.b).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((i56) bkg.b).put(uri2, bArr);
            return null;
        }
        z24 z24 = new z24(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        oy5 oy5 = this.f[i2];
        int k2 = this.q.k();
        Object m2 = this.q.m();
        byte[] bArr3 = this.m;
        h13 h13 = new h13(this.c, z24, 3, oy5, k2, m2, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = maf.f;
        }
        h13.u0 = bArr3;
        return h13;
    }
}
