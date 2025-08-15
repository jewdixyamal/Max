package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: tn6  reason: default package */
public final class tn6 implements do7, io7, j6d, pa5, crc {
    public static final Set j1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final mn6 A0;
    public final mn6 B0;
    public final Handler C0;
    public final ArrayList D0;
    public final Map E0;
    public j13 F0;
    public rn6[] G0;
    public int[] H0;
    public final HashSet I0;
    public final SparseIntArray J0;
    public pn6 K0;
    public int L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public qy5 Q0;
    public qy5 R0;
    public boolean S0;
    public tze T0;
    public Set U0;
    public int[] V0;
    public int W0;
    public final n64 X;
    public boolean X0;
    public final qy5 Y;
    public boolean[] Y0;
    public final tr4 Z;
    public boolean[] Z0;
    public final String a;
    public long a1;
    public final int b;
    public long b1;
    public final wmc c;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public long g1;
    public dr4 h1;
    public dm6 i1;
    public final xl6 o;
    public final lr4 s0;
    public final huc t0;
    public final vq7 u0 = new vq7("Loader:HlsSampleStreamWrapper");
    public final jn v0;
    public final int w0;
    public final td x0;
    public final ArrayList y0;
    public final List z0;

    public tn6(String str, int i, wmc wmc, xl6 xl6, Map map, n64 n64, long j, qy5 qy5, tr4 tr4, lr4 lr4, huc huc, jn jnVar, int i2) {
        this.a = str;
        this.b = i;
        this.c = wmc;
        this.o = xl6;
        this.E0 = map;
        this.X = n64;
        this.Y = qy5;
        this.Z = tr4;
        this.s0 = lr4;
        this.t0 = huc;
        this.v0 = jnVar;
        this.w0 = i2;
        td tdVar = new td(10, (byte) 0);
        tdVar.c = null;
        tdVar.b = false;
        tdVar.o = null;
        this.x0 = tdVar;
        this.H0 = new int[0];
        Set set = j1;
        this.I0 = new HashSet(set.size());
        this.J0 = new SparseIntArray(set.size());
        this.G0 = new rn6[0];
        this.Z0 = new boolean[0];
        this.Y0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y0 = arrayList;
        this.z0 = Collections.unmodifiableList(arrayList);
        this.D0 = new ArrayList();
        this.A0 = new mn6(this, 0);
        this.B0 = new mn6(this, 1);
        this.C0 = oaf.o((Handler.Callback) null);
        this.a1 = j;
        this.b1 = j;
    }

    public static sk4 e(int i, int i2) {
        z04.c0("Unmapped track with id " + i + " of type " + i2);
        return new sk4();
    }

    public static qy5 p(qy5 qy5, qy5 qy52, boolean z) {
        String str;
        String str2;
        if (qy5 == null) {
            return qy52;
        }
        String str3 = qy52.n;
        int g = ia9.g(str3);
        String str4 = qy5.j;
        if (oaf.u(g, str4) == 1) {
            str2 = oaf.v(g, str4);
            str = ia9.c(str2);
        } else {
            String a2 = ia9.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        ny5 a3 = qy52.a();
        a3.a = qy5.a;
        a3.b = qy5.b;
        a3.c = zw6.j(qy5.c);
        a3.d = qy5.d;
        a3.e = qy5.e;
        a3.f = qy5.f;
        a3.g = z ? qy5.g : -1;
        a3.h = z ? qy5.h : -1;
        a3.i = str2;
        if (g == 2) {
            a3.s = qy5.t;
            a3.t = qy5.u;
            a3.u = qy5.v;
        }
        if (str != null) {
            a3.d(str);
        }
        int i = qy5.B;
        if (i != -1 && g == 1) {
            a3.A = i;
        }
        f99 f99 = qy5.k;
        if (f99 != null) {
            f99 f992 = qy52.k;
            if (f992 != null) {
                f99 = f992.b(f99);
            }
            a3.j = f99;
        }
        return new qy5(a3);
    }

    public static int y(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A() {
        boolean z;
        if (!this.S0 && this.V0 == null && this.N0) {
            rn6[] rn6Arr = this.G0;
            int length = rn6Arr.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                if (rn6Arr[i].q() != null) {
                    i++;
                } else {
                    return;
                }
            }
            tze tze = this.T0;
            if (tze != null) {
                int i2 = tze.a;
                int[] iArr = new int[i2];
                this.V0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        rn6[] rn6Arr2 = this.G0;
                        if (i4 >= rn6Arr2.length) {
                            break;
                        }
                        qy5 q = rn6Arr2[i4].q();
                        fm9.l(q);
                        qy5 qy5 = this.T0.a(i3).d[0];
                        String str = qy5.n;
                        String str2 = q.n;
                        int g = ia9.g(str2);
                        if (g == 3) {
                            if (oaf.a(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || q.G == qy5.G) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else if (g == ia9.g(str)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    this.V0[i3] = i4;
                }
                Iterator it = this.D0.iterator();
                while (it.hasNext()) {
                    ((kn6) it.next()).a();
                }
                return;
            }
            int length2 = this.G0.length;
            int i5 = 0;
            int i6 = -1;
            int i7 = -2;
            while (true) {
                int i8 = 1;
                if (i5 >= length2) {
                    break;
                }
                qy5 q2 = this.G0[i5].q();
                fm9.l(q2);
                String str3 = q2.n;
                if (ia9.k(str3)) {
                    i8 = 2;
                } else if (!ia9.h(str3)) {
                    i8 = ia9.j(str3) ? 3 : -2;
                }
                if (y(i8) > y(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            rze rze = this.o.h;
            int i9 = rze.a;
            this.W0 = -1;
            this.V0 = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.V0[i10] = i10;
            }
            rze[] rzeArr = new rze[length2];
            int i11 = 0;
            while (i11 < length2) {
                qy5 q3 = this.G0[i11].q();
                fm9.l(q3);
                String str4 = this.a;
                qy5 qy52 = this.Y;
                if (i11 == i6) {
                    qy5[] qy5Arr = new qy5[i9];
                    for (int i12 = z2; i12 < i9; i12++) {
                        qy5 qy53 = rze.d[i12];
                        if (i7 == 1 && qy52 != null) {
                            qy53 = qy53.f(qy52);
                        }
                        qy5Arr[i12] = i9 == 1 ? q3.f(qy53) : p(qy53, q3, true);
                    }
                    rzeArr[i11] = new rze(str4, qy5Arr);
                    this.W0 = i11;
                    z = false;
                } else {
                    if (i7 != 2 || !ia9.h(q3.n)) {
                        qy52 = null;
                    }
                    StringBuilder o2 = rh4.o(str4, ":muxed:");
                    o2.append(i11 < i6 ? i11 : i11 - 1);
                    z = false;
                    rzeArr[i11] = new rze(o2.toString(), p(qy52, q3, false));
                }
                i11++;
                z2 = z;
            }
            boolean z3 = z2;
            this.T0 = j(rzeArr);
            fm9.k(this.U0 == null ? true : z3);
            this.U0 = Collections.emptySet();
            this.O0 = true;
            this.c.p();
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [sk4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yze B(int r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.util.Set r2 = j1
            boolean r1 = r2.contains(r1)
            java.util.HashSet r3 = r11.I0
            android.util.SparseIntArray r4 = r11.J0
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0045
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            defpackage.fm9.f(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0056
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r3.add(r1)
            if (r1 == 0) goto L_0x0034
            int[] r1 = r11.H0
            r1[r2] = r12
        L_0x0034:
            int[] r1 = r11.H0
            r1 = r1[r2]
            if (r1 != r12) goto L_0x0040
            rn6[] r1 = r11.G0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0056
        L_0x0040:
            sk4 r1 = e(r12, r13)
            goto L_0x003e
        L_0x0045:
            r1 = r5
        L_0x0046:
            rn6[] r2 = r11.G0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0056
            int[] r7 = r11.H0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0054
            r6 = r2[r1]
            goto L_0x0056
        L_0x0054:
            int r1 = r1 + r0
            goto L_0x0046
        L_0x0056:
            if (r6 != 0) goto L_0x00e8
            boolean r1 = r11.f1
            if (r1 == 0) goto L_0x0061
            sk4 r11 = e(r12, r13)
            return r11
        L_0x0061:
            rn6[] r1 = r11.G0
            int r1 = r1.length
            if (r13 == r0) goto L_0x0069
            r2 = 2
            if (r13 != r2) goto L_0x006a
        L_0x0069:
            r5 = r0
        L_0x006a:
            rn6 r6 = new rn6
            n64 r2 = r11.X
            java.util.Map r7 = r11.E0
            tr4 r8 = r11.Z
            lr4 r9 = r11.s0
            r6.<init>(r2, r8, r9, r7)
            long r7 = r11.a1
            r6.t = r7
            if (r5 == 0) goto L_0x0083
            dr4 r2 = r11.h1
            r6.I = r2
            r6.z = r0
        L_0x0083:
            long r7 = r11.g1
            long r9 = r6.F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x008f
            r6.F = r7
            r6.z = r0
        L_0x008f:
            dm6 r2 = r11.i1
            if (r2 == 0) goto L_0x0098
            int r2 = r2.v0
            long r7 = (long) r2
            r6.C = r7
        L_0x0098:
            r6.f = r11
            int[] r2 = r11.H0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.H0 = r2
            r2[r1] = r12
            rn6[] r12 = r11.G0
            int r2 = defpackage.oaf.a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            rn6[] r0 = (defpackage.rn6[]) r0
            r11.G0 = r0
            boolean[] r12 = r11.Z0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.Z0 = r12
            r12[r1] = r5
            boolean r12 = r11.X0
            r12 = r12 | r5
            r11.X0 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r3.add(r12)
            r4.append(r13, r1)
            int r12 = y(r13)
            int r0 = r11.L0
            int r0 = y(r0)
            if (r12 <= r0) goto L_0x00e0
            r11.M0 = r1
            r11.L0 = r13
        L_0x00e0:
            boolean[] r12 = r11.Y0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.Y0 = r12
        L_0x00e8:
            r12 = 5
            if (r13 != r12) goto L_0x00fb
            pn6 r12 = r11.K0
            if (r12 != 0) goto L_0x00f8
            pn6 r12 = new pn6
            int r13 = r11.w0
            r12.<init>(r6, r13)
            r11.K0 = r12
        L_0x00f8:
            pn6 r11 = r11.K0
            return r11
        L_0x00fb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.B(int, int):yze");
    }

    public final b11 C(go7 go7, long j, long j2, IOException iOException, int i) {
        boolean z;
        b11 b11;
        int i2;
        IOException iOException2 = iOException;
        j13 j13 = (j13) go7;
        boolean z2 = j13 instanceof dm6;
        if (z2 && !((dm6) j13).W0 && (iOException2 instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException2).o) == 410 || i2 == 404)) {
            return vq7.X;
        }
        long j3 = j13.t0.b;
        Uri uri = j13.t0.c;
        yn7 yn7 = new yn7(j2);
        oaf.h0(j13.Z);
        oaf.h0(j13.s0);
        wn7 wn7 = new wn7(i, iOException2);
        xl6 xl6 = this.o;
        ty4 n = dy7.n(xl6.r);
        this.t0.getClass();
        b11 o2 = huc.o(n, wn7);
        boolean z3 = false;
        if (o2 == null || o2.b != 2) {
            z = false;
        } else {
            n85 n85 = xl6.r;
            z = n85.u(n85.p(xl6.h.d(j13.o)), o2.c);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList arrayList = this.y0;
                if (((dm6) arrayList.remove(arrayList.size() - 1)) == j13) {
                    z3 = true;
                }
                fm9.k(z3);
                if (arrayList.isEmpty()) {
                    this.b1 = this.a1;
                } else {
                    ((dm6) mqd.m(arrayList)).V0 = true;
                }
            }
            b11 = vq7.Y;
        } else {
            long q = huc.q(wn7);
            b11 = q != -9223372036854775807L ? new b11(q, 0, 5, false) : vq7.Z;
        }
        b11 b112 = b11;
        boolean z4 = !b112.a();
        this.v0.B(yn7, j13.c, this.b, j13.o, j13.X, j13.Y, j13.Z, j13.s0, iOException, z4);
        if (z4) {
            this.F0 = null;
        }
        if (z) {
            if (!this.O0) {
                po7 po7 = new po7();
                po7.a = this.a1;
                o(new qo7(po7));
            } else {
                this.c.j(this);
            }
        }
        return b112;
    }

    public final void D() {
        this.u0.c();
        xl6 xl6 = this.o;
        BehindLiveWindowException behindLiveWindowException = xl6.o;
        if (behindLiveWindowException == null) {
            Uri uri = xl6.p;
            if (uri != null && xl6.t) {
                gb4 gb4 = (gb4) xl6.g.b.get(uri);
                gb4.b.c();
                IOException iOException = gb4.u0;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw behindLiveWindowException;
    }

    public final void E(rze[] rzeArr, int... iArr) {
        this.T0 = j(rzeArr);
        this.U0 = new HashSet();
        for (int a2 : iArr) {
            this.U0.add(this.T0.a(a2));
        }
        this.W0 = 0;
        Handler handler = this.C0;
        wmc wmc = this.c;
        Objects.requireNonNull(wmc);
        handler.post(new nn6(0, wmc));
        this.O0 = true;
    }

    public final void F() {
        for (rn6 y : this.G0) {
            y.y(this.c1);
        }
        this.c1 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G(long r9, boolean r11) {
        /*
            r8 = this;
            r8.a1 = r9
            boolean r0 = r8.z()
            r1 = 1
            if (r0 == 0) goto L_0x000c
            r8.b1 = r9
            return r1
        L_0x000c:
            xl6 r0 = r8.o
            boolean r0 = r0.q
            r2 = 0
            java.util.ArrayList r3 = r8.y0
            r4 = 0
            if (r0 == 0) goto L_0x002d
            r0 = r4
        L_0x0017:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x002d
            java.lang.Object r5 = r3.get(r0)
            dm6 r5 = (defpackage.dm6) r5
            long r6 = r5.Z
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x002d:
            r5 = r2
        L_0x002e:
            boolean r0 = r8.N0
            if (r0 == 0) goto L_0x0062
            if (r11 != 0) goto L_0x0062
            rn6[] r11 = r8.G0
            int r11 = r11.length
            r0 = r4
        L_0x0038:
            if (r0 >= r11) goto L_0x005e
            rn6[] r6 = r8.G0
            r6 = r6[r0]
            if (r5 == 0) goto L_0x0049
            int r7 = r5.f(r0)
            boolean r6 = r6.z(r7)
            goto L_0x004d
        L_0x0049:
            boolean r6 = r6.A(r9, r4)
        L_0x004d:
            if (r6 != 0) goto L_0x005b
            boolean[] r6 = r8.Z0
            boolean r6 = r6[r0]
            if (r6 != 0) goto L_0x0059
            boolean r6 = r8.X0
            if (r6 != 0) goto L_0x005b
        L_0x0059:
            r11 = r4
            goto L_0x005f
        L_0x005b:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x005e:
            r11 = r1
        L_0x005f:
            if (r11 == 0) goto L_0x0062
            return r4
        L_0x0062:
            r8.b1 = r9
            r8.e1 = r4
            r3.clear()
            vq7 r9 = r8.u0
            boolean r10 = r9.o()
            if (r10 == 0) goto L_0x0086
            boolean r10 = r8.N0
            if (r10 == 0) goto L_0x0082
            rn6[] r8 = r8.G0
            int r10 = r8.length
        L_0x0078:
            if (r4 >= r10) goto L_0x0082
            r11 = r8[r4]
            r11.h()
            int r4 = r4 + 1
            goto L_0x0078
        L_0x0082:
            r9.l()
            goto L_0x008b
        L_0x0086:
            r9.o = r2
            r8.F()
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.G(long, boolean):boolean");
    }

    public final void J(v1d v1d) {
    }

    public final boolean a() {
        return this.u0.o();
    }

    public final void b() {
        for (rn6 rn6 : this.G0) {
            rn6.y(true);
            fr4 fr4 = rn6.h;
            if (fr4 != null) {
                fr4.f(rn6.e);
                rn6.h = null;
                rn6.g = null;
            }
        }
    }

    public final void c() {
        this.C0.post(this.A0);
    }

    public final void d() {
        fm9.k(this.O0);
        this.T0.getClass();
        this.U0.getClass();
    }

    public final long f() {
        if (z()) {
            return this.b1;
        }
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        return x().s0;
    }

    public final tze j(rze[] rzeArr) {
        for (int i = 0; i < rzeArr.length; i++) {
            rze rze = rzeArr[i];
            qy5[] qy5Arr = new qy5[rze.a];
            for (int i2 = 0; i2 < rze.a; i2++) {
                qy5 qy5 = rze.d[i2];
                int d = this.Z.d(qy5);
                ny5 a2 = qy5.a();
                a2.J = d;
                qy5Arr[i2] = a2.a();
            }
            rzeArr[i] = new rze(rze.b, qy5Arr);
        }
        return new tze(rzeArr);
    }

    public final void m(go7 go7, long j, long j2, boolean z) {
        j13 j13 = (j13) go7;
        this.F0 = null;
        long j3 = j13.a;
        Uri uri = j13.t0.c;
        yn7 yn7 = new yn7(j2);
        this.t0.getClass();
        this.v0.x(yn7, j13.c, this.b, j13.o, j13.X, j13.Y, j13.Z, j13.s0);
        if (!z) {
            if (z() || this.P0 == 0) {
                F();
            }
            if (this.P0 > 0) {
                this.c.j(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(defpackage.qo7 r60) {
        /*
            r59 = this;
            r0 = r59
            r1 = 1
            boolean r2 = r0.e1
            r3 = 0
            if (r2 != 0) goto L_0x0016
            vq7 r2 = r0.u0
            boolean r4 = r2.o()
            if (r4 != 0) goto L_0x0016
            boolean r4 = r2.n()
            if (r4 == 0) goto L_0x0019
        L_0x0016:
            r0 = r3
            goto L_0x0583
        L_0x0019:
            boolean r4 = r59.z()
            if (r4 == 0) goto L_0x0035
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.b1
            rn6[] r7 = r0.G0
            int r8 = r7.length
            r9 = r3
        L_0x0029:
            if (r9 >= r8) goto L_0x0033
            r10 = r7[r9]
            long r11 = r0.b1
            r10.t = r11
            int r9 = r9 + r1
            goto L_0x0029
        L_0x0033:
            r14 = r4
            goto L_0x004d
        L_0x0035:
            dm6 r4 = r59.x()
            boolean r5 = r4.T0
            if (r5 == 0) goto L_0x0041
            long r4 = r4.s0
        L_0x003f:
            r5 = r4
            goto L_0x004a
        L_0x0041:
            long r5 = r0.a1
            long r7 = r4.Z
            long r4 = java.lang.Math.max(r5, r7)
            goto L_0x003f
        L_0x004a:
            java.util.List r4 = r0.z0
            goto L_0x0033
        L_0x004d:
            td r4 = r0.x0
            r15 = 0
            r4.c = r15
            r4.b = r3
            r4.o = r15
            boolean r7 = r0.O0
            if (r7 != 0) goto L_0x0064
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r16 = r3
            goto L_0x0066
        L_0x0064:
            r16 = r1
        L_0x0066:
            xl6 r12 = r0.o
            r12.getClass()
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x0073
            r13 = r15
            goto L_0x007a
        L_0x0073:
            java.lang.Object r7 = defpackage.mqd.m(r14)
            dm6 r7 = (defpackage.dm6) r7
            r13 = r7
        L_0x007a:
            if (r13 != 0) goto L_0x0080
            r7 = r60
            r11 = -1
            goto L_0x008b
        L_0x0080:
            rze r7 = r12.h
            qy5 r8 = r13.o
            int r7 = r7.d(r8)
            r11 = r7
            r7 = r60
        L_0x008b:
            long r8 = r7.a
            long r17 = r5 - r8
            r20 = r11
            long r10 = r12.s
            r21 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00a0
            long r10 = r10 - r8
            goto L_0x00a1
        L_0x00a0:
            r10 = r1
        L_0x00a1:
            if (r13 == 0) goto L_0x00ca
            boolean r7 = r12.q
            if (r7 != 0) goto L_0x00ca
            r22 = r4
            long r3 = r13.s0
            long r1 = r13.Z
            long r3 = r3 - r1
            long r1 = r17 - r3
            r23 = r14
            r14 = 0
            long r1 = java.lang.Math.max(r14, r1)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x00c8
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r14, r10)
        L_0x00c6:
            r10 = r1
            goto L_0x00d1
        L_0x00c8:
            r3 = r10
            goto L_0x00c6
        L_0x00ca:
            r22 = r4
            r23 = r14
            r3 = r10
            r10 = r17
        L_0x00d1:
            i78[] r15 = r12.a(r13, r5)
            n85 r7 = r12.r
            r1 = r20
            r2 = -1
            r14 = r12
            r60 = r13
            r12 = r3
            r3 = r14
            r14 = r23
            r4 = 0
            r7.r(r8, r10, r12, r14, r15)
            n85 r7 = r3.r
            int r12 = r7.i()
            if (r1 == r12) goto L_0x00ef
            r13 = 1
            goto L_0x00f0
        L_0x00ef:
            r13 = 0
        L_0x00f0:
            android.net.Uri[] r14 = r3.e
            r15 = r14[r12]
            hb4 r10 = r3.g
            boolean r7 = r10.d(r15)
            if (r7 != 0) goto L_0x0110
            r7 = r22
            r7.o = r15
            boolean r1 = r3.t
            android.net.Uri r2 = r3.p
            boolean r2 = r15.equals(r2)
            r1 = r1 & r2
            r3.t = r1
            r3.p = r15
            r0 = r7
            goto L_0x04c3
        L_0x0110:
            r7 = r22
            r8 = 1
            qm6 r11 = r10.b(r15, r8)
            r11.getClass()
            boolean r8 = r11.c
            r3.q = r8
            boolean r8 = r11.o
            r17 = r5
            long r4 = r11.h
            if (r8 == 0) goto L_0x012d
            r8 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0138
        L_0x012d:
            long r8 = r11.u
            long r8 = r8 + r4
            r19 = r3
            long r2 = r10.Z
            long r2 = r8 - r2
            r8 = r19
        L_0x0138:
            r8.s = r2
            long r2 = r10.Z
            long r2 = r4 - r2
            r9 = r7
            r7 = 0
            r4 = r8
            r5 = r60
            r6 = r13
            r19 = r12
            r12 = r7
            r7 = r11
            r22 = r8
            r12 = r9
            r8 = r2
            r24 = r2
            r3 = r10
            r2 = r11
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r7 = r2.k
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a6
            r10 = r60
            if (r10 == 0) goto L_0x01a4
            if (r13 == 0) goto L_0x01a4
            r15 = r14[r1]
            r2 = 1
            qm6 r13 = r3.b(r15, r2)
            r13.getClass()
            long r4 = r3.Z
            long r6 = r13.h
            long r24 = r6 - r4
            r6 = 0
            r4 = r22
            r5 = r10
            r7 = r13
            r8 = r24
            r2 = r10
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r11 = r1
            r7 = r2
            r2 = r13
            goto L_0x01aa
        L_0x01a4:
            r7 = r10
            goto L_0x01a8
        L_0x01a6:
            r7 = r60
        L_0x01a8:
            r11 = r19
        L_0x01aa:
            if (r11 == r1) goto L_0x01be
            r8 = -1
            if (r1 == r8) goto L_0x01be
            r1 = r14[r1]
            java.util.HashMap r3 = r3.b
            java.lang.Object r1 = r3.get(r1)
            gb4 r1 = (defpackage.gb4) r1
            if (r1 == 0) goto L_0x01be
            r3 = 0
            r1.v0 = r3
        L_0x01be:
            long r8 = r2.k
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d0
            androidx.media3.exoplayer.source.BehindLiveWindowException r1 = new androidx.media3.exoplayer.source.BehindLiveWindowException
            r1.<init>()
            r3 = r22
            r3.o = r1
        L_0x01cd:
            r0 = r12
            goto L_0x04c3
        L_0x01d0:
            r3 = r22
            long r13 = r5 - r8
            int r1 = (int) r13
            zw6 r10 = r2.r
            int r13 = r10.size()
            r17 = 1
            zw6 r14 = r2.s
            if (r1 != r13) goto L_0x01fb
            r13 = -1
            if (r4 == r13) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r4 = 0
        L_0x01e6:
            int r1 = r14.size()
            if (r4 >= r1) goto L_0x01f8
            vl6 r1 = new vl6
            java.lang.Object r13 = r14.get(r4)
            nm6 r13 = (defpackage.nm6) r13
            r1.<init>((defpackage.nm6) r13, (long) r5, (int) r4)
            goto L_0x01f9
        L_0x01f8:
            r1 = 0
        L_0x01f9:
            r0 = r1
            goto L_0x024d
        L_0x01fb:
            java.lang.Object r13 = r10.get(r1)
            lm6 r13 = (defpackage.lm6) r13
            r0 = -1
            if (r4 != r0) goto L_0x020a
            vl6 r1 = new vl6
            r1.<init>((defpackage.nm6) r13, (long) r5, (int) r0)
            goto L_0x01f9
        L_0x020a:
            zw6 r0 = r13.x0
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0220
            vl6 r0 = new vl6
            zw6 r1 = r13.x0
            java.lang.Object r1 = r1.get(r4)
            nm6 r1 = (defpackage.nm6) r1
            r0.<init>((defpackage.nm6) r1, (long) r5, (int) r4)
            goto L_0x024d
        L_0x0220:
            r0 = 1
            int r1 = r1 + r0
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0237
            vl6 r0 = new vl6
            java.lang.Object r1 = r10.get(r1)
            nm6 r1 = (defpackage.nm6) r1
            long r5 = r5 + r17
            r4 = -1
            r0.<init>((defpackage.nm6) r1, (long) r5, (int) r4)
            goto L_0x024d
        L_0x0237:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x024c
            vl6 r0 = new vl6
            r1 = 0
            java.lang.Object r4 = r14.get(r1)
            nm6 r4 = (defpackage.nm6) r4
            long r5 = r5 + r17
            r0.<init>((defpackage.nm6) r4, (long) r5, (int) r1)
            goto L_0x024d
        L_0x024c:
            r0 = 0
        L_0x024d:
            if (r0 != 0) goto L_0x0282
            boolean r0 = r2.o
            if (r0 != 0) goto L_0x0264
            r12.o = r15
            boolean r0 = r3.t
            android.net.Uri r1 = r3.p
            boolean r1 = r15.equals(r1)
            r0 = r0 & r1
            r3.t = r0
            r3.p = r15
            goto L_0x01cd
        L_0x0264:
            if (r16 != 0) goto L_0x026c
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x026e
        L_0x026c:
            r0 = 1
            goto L_0x0284
        L_0x026e:
            vl6 r0 = new vl6
            java.lang.Object r1 = defpackage.mqd.m(r10)
            nm6 r1 = (defpackage.nm6) r1
            int r4 = r10.size()
            long r4 = (long) r4
            long r8 = r8 + r4
            long r8 = r8 - r17
            r4 = -1
            r0.<init>((defpackage.nm6) r1, (long) r8, (int) r4)
        L_0x0282:
            r1 = 0
            goto L_0x0288
        L_0x0284:
            r12.b = r0
            goto L_0x01cd
        L_0x0288:
            r3.t = r1
            r1 = 0
            r3.p = r1
            android.os.SystemClock.elapsedRealtime()
            java.lang.Comparable r1 = r0.d
            nm6 r1 = (defpackage.nm6) r1
            lm6 r4 = r1.b
            java.lang.String r5 = r2.a
            if (r4 == 0) goto L_0x02a5
            java.lang.String r4 = r4.Z
            if (r4 != 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            android.net.Uri r4 = defpackage.mr0.S(r5, r4)
        L_0x02a3:
            r6 = 1
            goto L_0x02a7
        L_0x02a5:
            r4 = 0
            goto L_0x02a3
        L_0x02a7:
            ql6 r8 = r3.d(r4, r11, r6)
            r12.c = r8
            if (r8 == 0) goto L_0x02b1
        L_0x02af:
            goto L_0x01cd
        L_0x02b1:
            java.lang.String r6 = r1.Z
            if (r6 != 0) goto L_0x02b8
            r6 = 0
        L_0x02b6:
            r8 = 0
            goto L_0x02bd
        L_0x02b8:
            android.net.Uri r6 = defpackage.mr0.S(r5, r6)
            goto L_0x02b6
        L_0x02bd:
            ql6 r9 = r3.d(r6, r11, r8)
            r12.c = r9
            if (r9 == 0) goto L_0x02c6
            goto L_0x02af
        L_0x02c6:
            long r8 = r1.X
            if (r7 != 0) goto L_0x02d3
            java.util.concurrent.atomic.AtomicInteger r10 = defpackage.dm6.X0
        L_0x02cc:
            r16 = r8
            r22 = r12
            r57 = 0
            goto L_0x030c
        L_0x02d3:
            android.net.Uri r10 = r7.x0
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x02e0
            boolean r10 = r7.T0
            if (r10 == 0) goto L_0x02e0
            goto L_0x02cc
        L_0x02e0:
            long r13 = r24 + r8
            boolean r10 = r1 instanceof defpackage.hm6
            r22 = r12
            boolean r12 = r2.c
            if (r10 == 0) goto L_0x02fc
            r10 = r1
            hm6 r10 = (defpackage.hm6) r10
            boolean r10 = r10.w0
            if (r10 != 0) goto L_0x02fa
            int r10 = r0.b
            if (r10 != 0) goto L_0x02f8
            if (r12 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r10 = 0
            goto L_0x02fb
        L_0x02fa:
            r10 = 1
        L_0x02fb:
            r12 = r10
        L_0x02fc:
            r16 = r8
            if (r12 == 0) goto L_0x0309
            long r8 = r7.s0
            int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0307
            goto L_0x0309
        L_0x0307:
            r8 = 0
            goto L_0x030a
        L_0x0309:
            r8 = 1
        L_0x030a:
            r57 = r8
        L_0x030c:
            boolean r8 = r0.c
            if (r57 == 0) goto L_0x0316
            if (r8 == 0) goto L_0x0316
            r0 = r22
            goto L_0x04c3
        L_0x0316:
            qy5[] r9 = r3.f
            r30 = r9[r11]
            n85 r9 = r3.r
            int r37 = r9.k()
            n85 r9 = r3.r
            java.lang.Object r38 = r9.m()
            boolean r9 = r3.m
            wmc r10 = r3.j
            if (r6 != 0) goto L_0x0331
            r10.getClass()
            r6 = 0
            goto L_0x033b
        L_0x0331:
            java.lang.Object r11 = r10.a
            i56 r11 = (defpackage.i56) r11
            java.lang.Object r6 = r11.get(r6)
            byte[] r6 = (byte[]) r6
        L_0x033b:
            if (r4 != 0) goto L_0x033f
            r4 = 0
            goto L_0x0349
        L_0x033f:
            java.lang.Object r10 = r10.a
            i56 r10 = (defpackage.i56) r10
            java.lang.Object r4 = r10.get(r4)
            byte[] r4 = (byte[]) r4
        L_0x0349:
            java.util.concurrent.atomic.AtomicInteger r10 = defpackage.dm6.X0
            java.util.Map r45 = java.util.Collections.emptyMap()
            java.lang.String r10 = r1.a
            android.net.Uri r10 = defpackage.mr0.S(r5, r10)
            if (r8 == 0) goto L_0x035c
            r11 = 8
            r51 = r11
            goto L_0x035e
        L_0x035c:
            r51 = 0
        L_0x035e:
            java.lang.String r11 = "The uri must be set."
            defpackage.fm9.m(r10, r11)
            a34 r29 = new a34
            r50 = 0
            r52 = 0
            r41 = 0
            r43 = 1
            r44 = 0
            long r12 = r1.t0
            r14 = r8
            r18 = r9
            long r8 = r1.u0
            r39 = r29
            r40 = r10
            r46 = r12
            r48 = r8
            r39.<init>(r40, r41, r43, r44, r45, r46, r48, r50, r51, r52)
            if (r6 == 0) goto L_0x0386
            r31 = 1
            goto L_0x0388
        L_0x0386:
            r31 = 0
        L_0x0388:
            if (r31 == 0) goto L_0x0394
            java.lang.String r8 = r1.s0
            r8.getClass()
            byte[] r8 = defpackage.dm6.e(r8)
            goto L_0x0395
        L_0x0394:
            r8 = 0
        L_0x0395:
            t24 r9 = r3.b
            if (r6 == 0) goto L_0x03a4
            r8.getClass()
            jc r10 = new jc
            r10.<init>(r9, r6, r8)
            r28 = r10
            goto L_0x03a6
        L_0x03a4:
            r28 = r9
        L_0x03a6:
            lm6 r6 = r1.b
            if (r6 == 0) goto L_0x03fc
            if (r4 == 0) goto L_0x03ae
            r8 = 1
            goto L_0x03af
        L_0x03ae:
            r8 = 0
        L_0x03af:
            if (r8 == 0) goto L_0x03bb
            java.lang.String r10 = r6.s0
            r10.getClass()
            byte[] r10 = defpackage.dm6.e(r10)
            goto L_0x03bc
        L_0x03bb:
            r10 = 0
        L_0x03bc:
            java.lang.String r12 = r6.a
            android.net.Uri r5 = defpackage.mr0.S(r5, r12)
            java.util.Map r45 = java.util.Collections.emptyMap()
            defpackage.fm9.m(r5, r11)
            a34 r11 = new a34
            r51 = 0
            r52 = 0
            r41 = 0
            r43 = 1
            r44 = 0
            long r12 = r6.t0
            r60 = r14
            r19 = r15
            long r14 = r6.u0
            r50 = 0
            r39 = r11
            r40 = r5
            r46 = r12
            r48 = r14
            r39.<init>(r40, r41, r43, r44, r45, r46, r48, r50, r51, r52)
            if (r4 == 0) goto L_0x03f6
            r10.getClass()
            jc r5 = new jc
            r5.<init>(r9, r4, r10)
            r15 = r5
            goto L_0x03f7
        L_0x03f6:
            r15 = r9
        L_0x03f7:
            r34 = r8
            r32 = r15
            goto L_0x0405
        L_0x03fc:
            r60 = r14
            r19 = r15
            r11 = 0
            r32 = 0
            r34 = 0
        L_0x0405:
            long r39 = r24 + r16
            long r4 = r1.c
            long r41 = r39 + r4
            int r2 = r2.j
            int r4 = r1.o
            int r2 = r2 + r4
            if (r7 == 0) goto L_0x045c
            a34 r4 = r7.B0
            if (r11 == r4) goto L_0x042f
            if (r11 == 0) goto L_0x042d
            if (r4 == 0) goto L_0x042d
            android.net.Uri r5 = r11.a
            android.net.Uri r6 = r4.a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x042d
            long r5 = r11.f
            long r8 = r4.f
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r4 = 0
            goto L_0x0430
        L_0x042f:
            r4 = 1
        L_0x0430:
            android.net.Uri r5 = r7.x0
            r15 = r19
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0440
            boolean r5 = r7.T0
            if (r5 == 0) goto L_0x0440
            r5 = 1
            goto L_0x0441
        L_0x0440:
            r5 = 0
        L_0x0441:
            if (r4 == 0) goto L_0x0450
            if (r5 == 0) goto L_0x0450
            boolean r4 = r7.V0
            if (r4 != 0) goto L_0x0450
            int r4 = r7.w0
            if (r4 != r2) goto L_0x0450
            te r4 = r7.O0
            goto L_0x0451
        L_0x0450:
            r4 = 0
        L_0x0451:
            bt6 r5 = r7.J0
            wpa r6 = r7.K0
            r54 = r4
            r55 = r5
        L_0x0459:
            r56 = r6
            goto L_0x0470
        L_0x045c:
            r15 = r19
            bt6 r4 = new bt6
            r5 = 0
            r4.<init>(r5)
            wpa r6 = new wpa
            r7 = 10
            r6.<init>((int) r7)
            r55 = r4
            r54 = r5
            goto L_0x0459
        L_0x0470:
            dm6 r4 = new dm6
            r5 = 1
            r46 = r60 ^ 1
            mfe r5 = r3.d
            java.lang.Object r5 = r5.a
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            java.lang.Object r6 = r5.get(r2)
            tue r6 = (defpackage.tue) r6
            if (r6 != 0) goto L_0x0490
            tue r6 = new tue
            r7 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r6.<init>(r7)
            r5.put(r2, r6)
        L_0x0490:
            r50 = r6
            boolean r5 = r1.v0
            r48 = r5
            long r5 = r3.l
            r51 = r5
            am6 r5 = r3.a
            r27 = r5
            java.util.List r5 = r3.i
            r36 = r5
            long r5 = r0.a
            r43 = r5
            int r0 = r0.b
            r45 = r0
            dr4 r0 = r1.Y
            r53 = r0
            j4b r0 = r3.k
            r58 = r0
            r26 = r4
            r33 = r11
            r35 = r15
            r47 = r2
            r49 = r18
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46, r47, r48, r49, r50, r51, r53, r54, r55, r56, r57, r58)
            r0 = r22
            r0.c = r4
        L_0x04c3:
            boolean r1 = r0.b
            java.lang.Object r2 = r0.c
            j13 r2 = (defpackage.j13) r2
            java.lang.Object r0 = r0.o
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x04dc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r59
            r1.b1 = r3
            r3 = 1
            r1.e1 = r3
            return r3
        L_0x04dc:
            r1 = r59
            r3 = 1
            if (r2 != 0) goto L_0x04f8
            if (r0 == 0) goto L_0x04f6
            wmc r1 = r1.c
            java.lang.Object r1 = r1.a
            fm6 r1 = (defpackage.fm6) r1
            hb4 r1 = r1.b
            java.util.HashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r0)
            gb4 r0 = (defpackage.gb4) r0
            r0.c(r3)
        L_0x04f6:
            r0 = 0
            return r0
        L_0x04f8:
            boolean r0 = r2 instanceof defpackage.dm6
            if (r0 == 0) goto L_0x054f
            r0 = r2
            dm6 r0 = (defpackage.dm6) r0
            r1.i1 = r0
            qy5 r3 = r0.o
            r1.Q0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.b1 = r3
            java.util.ArrayList r3 = r1.y0
            r3.add(r0)
            ww6 r3 = defpackage.zw6.i()
            rn6[] r4 = r1.G0
            int r5 = r4.length
            r6 = 0
        L_0x0519:
            if (r6 >= r5) goto L_0x052c
            r7 = r4[r6]
            int r8 = r7.q
            int r7 = r7.p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x0519
        L_0x052c:
            ffc r3 = r3.j()
            r0.P0 = r1
            r0.U0 = r3
            rn6[] r3 = r1.G0
            int r4 = r3.length
            r5 = 0
        L_0x0538:
            if (r5 >= r4) goto L_0x054f
            r6 = r3[r5]
            r6.getClass()
            int r7 = r0.v0
            long r7 = (long) r7
            r6.C = r7
            boolean r7 = r0.y0
            if (r7 == 0) goto L_0x054c
            r7 = 1
            r6.G = r7
            goto L_0x054d
        L_0x054c:
            r7 = 1
        L_0x054d:
            int r5 = r5 + r7
            goto L_0x0538
        L_0x054f:
            r1.F0 = r2
            huc r0 = r1.t0
            int r3 = r2.c
            int r0 = r0.p(r3)
            r3 = r21
            long r8 = r3.v(r2, r1, r0)
            yn7 r11 = new yn7
            long r5 = r2.a
            a34 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.X
            java.lang.Object r0 = r2.Y
            jn r10 = r1.v0
            int r12 = r2.c
            int r13 = r1.b
            qy5 r14 = r2.o
            long r3 = r2.Z
            long r1 = r2.s0
            r16 = r0
            r17 = r3
            r19 = r1
            r10.F(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0583:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.o(qo7):boolean");
    }

    public final long r() {
        long j;
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.b1;
        }
        long j2 = this.a1;
        dm6 x = x();
        if (!x.T0) {
            ArrayList arrayList = this.y0;
            x = arrayList.size() > 1 ? (dm6) wg0.f(arrayList, 2) : null;
        }
        if (x != null) {
            j2 = Math.max(j2, x.s0);
        }
        if (this.N0) {
            for (rn6 rn6 : this.G0) {
                synchronized (rn6) {
                    j = rn6.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    public final void t(long j) {
        vq7 vq7 = this.u0;
        if (!vq7.n() && !z()) {
            boolean o2 = vq7.o();
            xl6 xl6 = this.o;
            List list = this.z0;
            if (o2) {
                this.F0.getClass();
                if (xl6.o != null ? false : xl6.r.t(j, this.F0, list)) {
                    vq7.l();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && xl6.b((dm6) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                u(size);
            }
            int size2 = (xl6.o != null || xl6.r.length() < 2) ? list.size() : xl6.r.g(j, list);
            if (size2 < this.y0.size()) {
                u(size2);
            }
        }
    }

    public final void u(int i) {
        ArrayList arrayList;
        fm9.k(!this.u0.o());
        int i2 = i;
        loop0:
        while (true) {
            arrayList = this.y0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    dm6 dm6 = (dm6) arrayList.get(i2);
                    int i4 = 0;
                    while (i4 < this.G0.length) {
                        if (this.G0[i4].n() <= dm6.f(i4)) {
                            i4++;
                        }
                    }
                    break loop0;
                } else if (((dm6) arrayList.get(i3)).y0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 != -1) {
            long j = x().s0;
            dm6 dm62 = (dm6) arrayList.get(i2);
            oaf.X(arrayList, i2, arrayList.size());
            for (int i5 = 0; i5 < this.G0.length; i5++) {
                this.G0[i5].j(dm62.f(i5));
            }
            if (arrayList.isEmpty()) {
                this.b1 = this.a1;
            } else {
                ((dm6) mqd.m(arrayList)).V0 = true;
            }
            this.e1 = false;
            int i6 = this.L0;
            long j2 = dm62.Z;
            jn jnVar = this.v0;
            jnVar.getClass();
            jnVar.P(new pc8(1, i6, (Object) null, 3, (Object) null, oaf.h0(j2), oaf.h0(j)));
        }
    }

    public final void v(go7 go7, long j, long j2) {
        j13 j13 = (j13) go7;
        this.F0 = null;
        xl6 xl6 = this.o;
        xl6.getClass();
        if (j13 instanceof ql6) {
            ql6 ql6 = (ql6) j13;
            xl6.n = ql6.u0;
            Uri uri = ql6.b.a;
            byte[] bArr = ql6.w0;
            bArr.getClass();
            wmc wmc = xl6.j;
            wmc.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((i56) wmc.a).put(uri, bArr);
        }
        long j3 = j13.a;
        Uri uri2 = j13.t0.c;
        yn7 yn7 = new yn7(j2);
        this.t0.getClass();
        this.v0.z(yn7, j13.c, this.b, j13.o, j13.X, j13.Y, j13.Z, j13.s0);
        if (!this.O0) {
            po7 po7 = new po7();
            po7.a = this.a1;
            o(new qo7(po7));
            return;
        }
        this.c.j(this);
    }

    public final void w() {
        this.f1 = true;
        this.C0.post(this.B0);
    }

    public final dm6 x() {
        return (dm6) wg0.f(this.y0, 1);
    }

    public final boolean z() {
        return this.b1 != -9223372036854775807L;
    }
}
