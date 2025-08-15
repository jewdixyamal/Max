package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g85  reason: default package */
public final class g85 implements Handler.Callback, xd8, k0f, uk8, gc4, o4b {
    public static final long f1 = oaf.h0(WorkRequest.MIN_BACKOFF_MILLIS);
    public final ArrayList A0;
    public final she B0;
    public final i75 C0;
    public final ge8 D0;
    public final vk8 E0;
    public final cc4 F0;
    public final long G0;
    public final j4b H0;
    public x1d I0;
    public a3b J0;
    public b85 K0;
    public boolean L0;
    public boolean M0 = false;
    public boolean N0;
    public boolean O0;
    public long P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public int W0;
    public final l0f X;
    public e85 X0;
    public final pn7 Y;
    public long Y0;
    public final hg0 Z;
    public long Z0;
    public final vj0[] a;
    public int a1;
    public final Set b;
    public boolean b1;
    public final vj0[] c;
    public ExoPlaybackException c1;
    public long d1;
    public y65 e1;
    public final hz7 o;
    public final bie s0;
    public final HandlerThread t0;
    public final Looper u0;
    public final kue v0;
    public final hue w0;
    public final long x0;
    public final boolean y0;
    public final dk z0;

    public g85(vj0[] vj0Arr, hz7 hz7, l0f l0f, pn7 pn7, hg0 hg0, int i, boolean z, i74 i74, x1d x1d, cc4 cc4, long j, Looper looper, she she, i75 i75, j4b j4b) {
        vj0[] vj0Arr2 = vj0Arr;
        hz7 hz72 = hz7;
        hg0 hg02 = hg0;
        i74 i742 = i74;
        she she2 = she;
        j4b j4b2 = j4b;
        y65 y65 = y65.a;
        this.C0 = i75;
        this.a = vj0Arr2;
        this.o = hz72;
        this.X = l0f;
        this.Y = pn7;
        this.Z = hg02;
        this.R0 = i;
        this.S0 = z;
        this.I0 = x1d;
        this.F0 = cc4;
        this.G0 = j;
        this.B0 = she2;
        this.H0 = j4b2;
        this.e1 = y65;
        this.d1 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.x0 = pn7.f();
        this.y0 = pn7.a();
        fue fue = mue.a;
        a3b i2 = a3b.i(l0f);
        this.J0 = i2;
        this.K0 = new b85(i2);
        this.c = new vj0[vj0Arr2.length];
        cf4 cf4 = (cf4) hz72;
        cf4.getClass();
        for (int i3 = 0; i3 < vj0Arr2.length; i3++) {
            vj0 vj0 = vj0Arr2[i3];
            vj0.X = i3;
            vj0.Y = j4b2;
            vj0.Z = she2;
            vj0[] vj0Arr3 = this.c;
            vj0.getClass();
            vj0Arr3[i3] = vj0;
            vj0 vj02 = this.c[i3];
            synchronized (vj02.a) {
                vj02.B0 = cf4;
            }
        }
        this.z0 = new dk((gc4) this, she2);
        this.A0 = new ArrayList();
        this.b = ngg.B();
        this.v0 = new kue();
        this.w0 = new hue();
        hz72.a = this;
        hz72.b = hg02;
        this.b1 = true;
        bie a2 = she2.a(looper, (Handler.Callback) null);
        this.D0 = new ge8(i742, a2, new q64(23, (Object) this));
        this.E0 = new vk8((uk8) this, i742, a2, j4b2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.t0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.u0 = looper2;
        this.s0 = she2.a(looper2, this);
    }

    public static Pair F(mue mue, e85 e85, boolean z, int i, boolean z2, kue kue, hue hue) {
        int G;
        mue mue2 = mue;
        e85 e852 = e85;
        hue hue2 = hue;
        mue mue3 = e852.a;
        if (mue.q()) {
            return null;
        }
        mue mue4 = mue3.q() ? mue2 : mue3;
        try {
            Pair j = mue4.j(kue, hue, e852.b, e852.c);
            if (mue.equals(mue4)) {
                return j;
            }
            if (mue.b(j.first) == -1) {
                kue kue2 = kue;
                if (z && (G = G(kue, hue, i, z2, j.first, mue4, mue)) != -1) {
                    return mue.j(kue, hue, G, -9223372036854775807L);
                }
                return null;
            } else if (!mue4.h(j.first, hue2).f || mue4.n(hue2.c, kue, 0).n != mue4.b(j.first)) {
                return j;
            } else {
                return mue.j(kue, hue, mue.h(j.first, hue2).c, e852.c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static int G(kue kue, hue hue, int i, boolean z, Object obj, mue mue, mue mue2) {
        kue kue2 = kue;
        hue hue2 = hue;
        Object obj2 = obj;
        mue mue3 = mue;
        mue mue4 = mue2;
        Object obj3 = mue3.n(mue3.h(obj2, hue2).c, kue, 0).a;
        for (int i2 = 0; i2 < mue2.p(); i2++) {
            if (mue4.n(i2, kue, 0).a.equals(obj3)) {
                return i2;
            }
        }
        int b2 = mue3.b(obj2);
        int i3 = mue.i();
        int i4 = b2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && i5 == -1; i6++) {
            i4 = mue.d(i4, hue, kue, i, z);
            if (i4 == -1) {
                break;
            }
            i5 = mue4.b(mue3.m(i4));
        }
        if (i5 == -1) {
            return -1;
        }
        return mue4.g(i5, hue2, false).c;
    }

    public static void M(vj0 vj0, long j) {
        vj0.y0 = true;
        if (vj0 instanceof xpe) {
            xpe xpe = (xpe) vj0;
            fm9.k(xpe.y0);
            xpe.V0 = j;
        }
    }

    public static boolean q(vj0 vj0) {
        return vj0.s0 != 0;
    }

    public final void A() {
        float f = this.z0.d().a;
        ge8 ge8 = this.D0;
        be8 be8 = ge8.i;
        be8 be82 = ge8.j;
        l0f l0f = null;
        be8 be83 = be8;
        boolean z = true;
        while (be83 != null && be83.d) {
            l0f h = be83.h(f, this.J0.a);
            l0f l0f2 = be83 == this.D0.i ? h : l0f;
            l0f l0f3 = be83.n;
            if (l0f3 != null) {
                int length = ((n85[]) l0f3.X).length;
                n85[] n85Arr = (n85[]) h.X;
                if (length == n85Arr.length) {
                    int i = 0;
                    while (i < n85Arr.length) {
                        if (h.G(l0f3, i)) {
                            i++;
                        }
                    }
                    if (be83 == be82) {
                        z = false;
                    }
                    be83 = be83.l;
                    l0f = l0f2;
                }
            }
            if (z) {
                ge8 ge82 = this.D0;
                be8 be84 = ge82.i;
                boolean l = ge82.l(be84);
                boolean[] zArr = new boolean[this.a.length];
                l0f2.getClass();
                long a2 = be84.a(l0f2, this.J0.s, l, zArr);
                a3b a3b = this.J0;
                boolean z2 = (a3b.e == 4 || a2 == a3b.s) ? false : true;
                a3b a3b2 = this.J0;
                be8 be85 = be84;
                boolean[] zArr2 = zArr;
                this.J0 = o(a3b2.b, a2, a3b2.c, a3b2.d, z2, 5);
                if (z2) {
                    D(a2);
                }
                boolean[] zArr3 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    vj0[] vj0Arr = this.a;
                    if (i2 >= vj0Arr.length) {
                        break;
                    }
                    vj0 vj0 = vj0Arr[i2];
                    boolean q = q(vj0);
                    zArr3[i2] = q;
                    grc grc = be85.c[i2];
                    if (q) {
                        if (grc != vj0.t0) {
                            b(vj0);
                        } else if (zArr2[i2]) {
                            long j = this.Y0;
                            vj0.y0 = false;
                            vj0.w0 = j;
                            vj0.x0 = j;
                            vj0.r(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                d(zArr3, this.Y0);
            } else {
                this.D0.l(be83);
                if (be83.d) {
                    be83.a(h, Math.max(be83.f.b, this.Y0 - be83.o), false, new boolean[be83.i.length]);
                }
            }
            k(true);
            if (this.J0.e != 4) {
                s();
                e0();
                this.s0.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            bie r0 = r1.s0
            r2 = 2
            r0.e(r2)
            r2 = 0
            r1.c1 = r2
            r3 = 0
            r4 = 1
            r1.g0(r3, r4)
            dk r0 = r1.z0
            r0.c = r3
            java.lang.Object r0 = r0.o
            fh8 r0 = (defpackage.fh8) r0
            boolean r5 = r0.b
            if (r5 == 0) goto L_0x0025
            long r5 = r0.t()
            r0.a(r5)
            r0.b = r3
        L_0x0025:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.Y0 = r5
            vj0[] r5 = r1.a
            int r6 = r5.length
            r7 = r3
        L_0x0030:
            if (r7 >= r6) goto L_0x0040
            r0 = r5[r7]
            r1.b(r0)     // Catch:{ ExoPlaybackException | RuntimeException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r0 = move-exception
            java.lang.String r8 = "Disable failed."
            defpackage.z04.v(r8, r0)
        L_0x003e:
            int r7 = r7 + r4
            goto L_0x0030
        L_0x0040:
            if (r34 == 0) goto L_0x005f
            vj0[] r5 = r1.a
            int r6 = r5.length
            r7 = r3
        L_0x0046:
            if (r7 >= r6) goto L_0x005f
            r0 = r5[r7]
            java.util.Set r8 = r1.b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x005d
            r0.B()     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.z04.v(r0, r8)
        L_0x005d:
            int r7 = r7 + r4
            goto L_0x0046
        L_0x005f:
            r1.W0 = r3
            a3b r0 = r1.J0
            yj8 r5 = r0.b
            long r6 = r0.s
            a3b r0 = r1.J0
            yj8 r0 = r0.b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x008f
            a3b r0 = r1.J0
            hue r8 = r1.w0
            yj8 r9 = r0.b
            mue r0 = r0.a
            boolean r10 = r0.q()
            if (r10 != 0) goto L_0x008f
            java.lang.Object r9 = r9.a
            hue r0 = r0.h(r9, r8)
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            a3b r0 = r1.J0
            long r8 = r0.s
            goto L_0x0093
        L_0x008f:
            a3b r0 = r1.J0
            long r8 = r0.c
        L_0x0093:
            if (r35 == 0) goto L_0x00bf
            r1.X0 = r2
            a3b r0 = r1.J0
            mue r0 = r0.a
            android.util.Pair r0 = r1.g(r0)
            java.lang.Object r5 = r0.first
            yj8 r5 = (defpackage.yj8) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            a3b r0 = r1.J0
            yj8 r0 = r0.b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00bf
            r0 = r4
        L_0x00bb:
            r28 = r6
            r9 = r8
            goto L_0x00c1
        L_0x00bf:
            r0 = r3
            goto L_0x00bb
        L_0x00c1:
            ge8 r6 = r1.D0
            r6.b()
            r1.Q0 = r3
            a3b r6 = r1.J0
            mue r6 = r6.a
            if (r36 == 0) goto L_0x0122
            boolean r7 = r6 instanceof defpackage.b5b
            if (r7 == 0) goto L_0x0122
            b5b r6 = (defpackage.b5b) r6
            vk8 r7 = r1.E0
            java.lang.Object r7 = r7.l
            dod r7 = (defpackage.dod) r7
            mue[] r8 = r6.k
            int r11 = r8.length
            mue[] r11 = new defpackage.mue[r11]
            r12 = r3
        L_0x00e0:
            int r13 = r8.length
            if (r12 >= r13) goto L_0x00ee
            z4b r13 = new z4b
            r14 = r8[r12]
            r13.<init>(r14)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x00e0
        L_0x00ee:
            b5b r8 = new b5b
            java.lang.Object[] r6 = r6.l
            r8.<init>(r11, r6, r7)
            int r6 = r5.b
            r7 = -1
            if (r6 == r7) goto L_0x011f
            java.lang.Object r6 = r5.a
            hue r7 = r1.w0
            r8.h(r6, r7)
            hue r6 = r1.w0
            int r6 = r6.c
            kue r7 = r1.v0
            r11 = 0
            r8.n(r6, r7, r11)
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x011f
            yj8 r6 = new yj8
            java.lang.Object r7 = r5.a
            long r11 = r5.d
            r6.<init>(r11, r7)
            r19 = r6
        L_0x011d:
            r7 = r8
            goto L_0x0125
        L_0x011f:
            r19 = r5
            goto L_0x011d
        L_0x0122:
            r19 = r5
            r7 = r6
        L_0x0125:
            a3b r5 = new a3b
            a3b r6 = r1.J0
            int r13 = r6.e
            if (r37 == 0) goto L_0x012f
        L_0x012d:
            r14 = r2
            goto L_0x0132
        L_0x012f:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r6.f
            goto L_0x012d
        L_0x0132:
            if (r0 == 0) goto L_0x0139
            tze r2 = defpackage.tze.d
        L_0x0136:
            r16 = r2
            goto L_0x013c
        L_0x0139:
            tze r2 = r6.h
            goto L_0x0136
        L_0x013c:
            if (r0 == 0) goto L_0x0143
            l0f r2 = r1.X
        L_0x0140:
            r17 = r2
            goto L_0x0146
        L_0x0143:
            l0f r2 = r6.i
            goto L_0x0140
        L_0x0146:
            if (r0 == 0) goto L_0x014f
            ls5 r0 = defpackage.zw6.b
            ffc r0 = defpackage.ffc.X
        L_0x014c:
            r18 = r0
            goto L_0x0152
        L_0x014f:
            java.util.List r0 = r6.j
            goto L_0x014c
        L_0x0152:
            boolean r0 = r6.l
            r20 = r0
            int r0 = r6.m
            r21 = r0
            int r0 = r6.n
            r22 = r0
            c3b r0 = r6.o
            r23 = r0
            r15 = 0
            r26 = 0
            r30 = 0
            r32 = 0
            r6 = r5
            r8 = r19
            r11 = r28
            r24 = r28
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            r1.J0 = r5
            if (r36 == 0) goto L_0x01e1
            ge8 r0 = r1.D0
            java.util.List r2 = r0.o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x019e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r3
        L_0x0187:
            java.util.List r6 = r0.o
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x019c
            java.util.List r6 = r0.o
            java.lang.Object r6 = r6.get(r5)
            be8 r6 = (defpackage.be8) r6
            r6.g()
            int r5 = r5 + r4
            goto L_0x0187
        L_0x019c:
            r0.o = r2
        L_0x019e:
            vk8 r1 = r1.E0
            java.lang.Object r0 = r1.e
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r0 = r2.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x01ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r4.next()
            r5 = r0
            rk8 r5 = (defpackage.rk8) r5
            ej0 r0 = r5.a     // Catch:{ RuntimeException -> 0x01c2 }
            ak8 r6 = r5.b     // Catch:{ RuntimeException -> 0x01c2 }
            r0.p(r6)     // Catch:{ RuntimeException -> 0x01c2 }
            goto L_0x01c8
        L_0x01c2:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            defpackage.z04.v(r6, r0)
        L_0x01c8:
            ej0 r0 = r5.a
            imc r6 = r5.c
            r0.s(r6)
            ej0 r0 = r5.a
            r0.r(r6)
            goto L_0x01ad
        L_0x01d5:
            r2.clear()
            java.lang.Object r0 = r1.f
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r1.g = r3
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        be8 be8 = this.D0.i;
        this.N0 = be8 != null && be8.f.h && this.M0;
    }

    public final void D(long j) {
        ge8 ge8 = this.D0;
        be8 be8 = ge8.i;
        long j2 = j + (be8 == null ? 1000000000000L : be8.o);
        this.Y0 = j2;
        ((fh8) this.z0.o).a(j2);
        for (vj0 vj0 : this.a) {
            if (q(vj0)) {
                long j3 = this.Y0;
                vj0.y0 = false;
                vj0.w0 = j3;
                vj0.x0 = j3;
                vj0.r(j3, false);
            }
        }
        for (be8 be82 = ge8.i; be82 != null; be82 = be82.l) {
            for (n85 n85 : (n85[]) be82.n.X) {
                if (n85 != null) {
                    n85.n();
                }
            }
        }
    }

    public final void E(mue mue, mue mue2) {
        if (!mue.q() || !mue2.q()) {
            ArrayList arrayList = this.A0;
            int size = arrayList.size() - 1;
            if (size < 0) {
                Collections.sort(arrayList);
            } else {
                au1.r(arrayList.get(size));
                throw null;
            }
        }
    }

    public final void H(long j) {
        this.s0.a.sendEmptyMessageAtTime(2, j + ((this.J0.e != 3 || X()) ? f1 : 1000));
    }

    public final void I(boolean z) {
        yj8 yj8 = this.D0.i.f.a;
        long K = K(yj8, this.J0.s, true, false);
        if (K != this.J0.s) {
            a3b a3b = this.J0;
            this.J0 = o(yj8, K, a3b.c, a3b.d, z, 5);
        }
    }

    public final void J(e85 e85) {
        long j;
        long j2;
        boolean z;
        yj8 yj8;
        long j3;
        long j4;
        long j5;
        a3b a3b;
        int i;
        e85 e852 = e85;
        boolean z2 = true;
        this.K0.d(1);
        Pair F = F(this.J0.a, e85, true, this.R0, this.S0, this.v0, this.w0);
        if (F == null) {
            Pair g = g(this.J0.a);
            yj8 = (yj8) g.first;
            long longValue = ((Long) g.second).longValue();
            z = !this.J0.a.q();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = F.first;
            long longValue2 = ((Long) F.second).longValue();
            long j6 = e852.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            yj8 n = this.D0.n(this.J0.a, obj, longValue2);
            if (n.b()) {
                this.J0.a.h(n.a, this.w0);
                j = this.w0.f(n.b) == n.c ? this.w0.g.c : 0;
                j2 = j6;
                yj8 = n;
                z = true;
            } else {
                j = longValue2;
                j2 = j6;
                z = e852.c == -9223372036854775807L;
                yj8 = n;
            }
        }
        try {
            if (this.J0.a.q()) {
                this.X0 = e852;
            } else if (F == null) {
                if (this.J0.e != 1) {
                    W(4);
                }
                B(false, true, false, true);
            } else {
                if (yj8.equals(this.J0.b)) {
                    be8 be8 = this.D0.i;
                    long h = (be8 == null || !be8.d || j == 0) ? j : be8.a.h(j, this.I0);
                    if (oaf.h0(h) == oaf.h0(this.J0.s) && ((i = a3b.e) == 2 || i == 3)) {
                        long j7 = (a3b = this.J0).s;
                        this.J0 = o(yj8, j7, j2, j7, z, 2);
                        return;
                    }
                    j5 = h;
                } else {
                    j5 = j;
                }
                boolean z3 = this.J0.e == 4;
                ge8 ge8 = this.D0;
                long K = K(yj8, j5, ge8.i != ge8.j, z3);
                if (j == K) {
                    z2 = false;
                }
                z |= z2;
                try {
                    a3b a3b2 = this.J0;
                    mue mue = a3b2.a;
                    f0(mue, yj8, mue, a3b2.b, j2, true);
                    j4 = K;
                    this.J0 = o(yj8, j4, j2, j4, z, 2);
                } catch (Throwable th) {
                    th = th;
                    j3 = K;
                    this.J0 = o(yj8, j3, j2, j3, z, 2);
                    throw th;
                }
            }
            j4 = j;
            this.J0 = o(yj8, j4, j2, j4, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
            this.J0 = o(yj8, j3, j2, j3, z, 2);
            throw th;
        }
    }

    public final long K(yj8 yj8, long j, boolean z, boolean z2) {
        b0();
        g0(false, true);
        if (z2 || this.J0.e == 3) {
            W(2);
        }
        ge8 ge8 = this.D0;
        be8 be8 = ge8.i;
        be8 be82 = be8;
        while (be82 != null && !yj8.equals(be82.f.a)) {
            be82 = be82.l;
        }
        if (z || be8 != be82 || (be82 != null && be82.o + j < 0)) {
            vj0[] vj0Arr = this.a;
            for (vj0 b2 : vj0Arr) {
                b(b2);
            }
            if (be82 != null) {
                while (ge8.i != be82) {
                    ge8.a();
                }
                ge8.l(be82);
                be82.o = 1000000000000L;
                d(new boolean[vj0Arr.length], ge8.j.e());
            }
        }
        if (be82 != null) {
            ge8.l(be82);
            if (!be82.d) {
                be82.f = be82.f.b(j);
            } else if (be82.e) {
                zd8 zd8 = be82.a;
                j = zd8.l(j);
                zd8.s(j - this.x0, this.y0);
            }
            D(j);
            s();
        } else {
            ge8.b();
            D(j);
        }
        k(false);
        this.s0.f(2);
        return j;
    }

    public final void L(s4b s4b) {
        Looper looper = s4b.f;
        if (!looper.getThread().isAlive()) {
            z04.c0("Trying to send message on a dead thread.");
            s4b.b(false);
            return;
        }
        this.B0.a(looper, (Handler.Callback) null).d(new kl4((Object) this, 21, (Object) s4b));
    }

    public final void N(AtomicBoolean atomicBoolean, boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
            if (!z) {
                for (vj0 vj0 : this.a) {
                    if (!q(vj0) && this.b.remove(vj0)) {
                        vj0.B();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(y75 y75) {
        this.K0.d(1);
        int i = y75.c;
        dod dod = y75.b;
        List list = y75.a;
        if (i != -1) {
            this.X0 = new e85(new b5b(list, dod), y75.c, y75.d);
        }
        vk8 vk8 = this.E0;
        ArrayList arrayList = (ArrayList) vk8.b;
        vk8.p(0, arrayList.size());
        l(vk8.b(arrayList.size(), list, dod), false);
    }

    public final void P(boolean z) {
        this.M0 = z;
        C();
        if (this.N0) {
            ge8 ge8 = this.D0;
            if (ge8.j != ge8.i) {
                I(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.K0.d(z2 ? 1 : 0);
        this.J0 = this.J0.d(i2, i, z);
        g0(false, false);
        for (be8 be8 = this.D0.i; be8 != null; be8 = be8.l) {
            for (n85 n85 : (n85[]) be8.n.X) {
                if (n85 != null) {
                    n85.c(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.J0.e;
        bie bie = this.s0;
        if (i3 == 3) {
            dk dkVar = this.z0;
            dkVar.c = true;
            ((fh8) dkVar.o).b();
            Z();
            bie.f(2);
        } else if (i3 == 2) {
            bie.f(2);
        }
    }

    public final void R(c3b c3b) {
        this.s0.e(16);
        dk dkVar = this.z0;
        dkVar.f(c3b);
        c3b d = dkVar.d();
        n(d, d.a, true, true);
    }

    public final void S(y65 y65) {
        this.e1 = y65;
        mue mue = this.J0.a;
        ge8 ge8 = this.D0;
        ge8.getClass();
        y65.getClass();
        if (!ge8.o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ge8.o.size(); i++) {
                ((be8) ge8.o.get(i)).g();
            }
            ge8.o = arrayList;
        }
    }

    public final void T(int i) {
        this.R0 = i;
        mue mue = this.J0.a;
        ge8 ge8 = this.D0;
        ge8.g = i;
        if (!ge8.p(mue)) {
            I(true);
        }
        k(false);
    }

    public final void U(boolean z) {
        this.S0 = z;
        mue mue = this.J0.a;
        ge8 ge8 = this.D0;
        ge8.h = z;
        if (!ge8.p(mue)) {
            I(true);
        }
        k(false);
    }

    public final void V(dod dod) {
        this.K0.d(1);
        vk8 vk8 = this.E0;
        int size = ((ArrayList) vk8.b).size();
        if (dod.b.length != size) {
            dod = new dod(new Random(dod.a.nextLong())).a(0, size);
        }
        vk8.l = dod;
        l(vk8.f(), false);
    }

    public final void W(int i) {
        a3b a3b = this.J0;
        if (a3b.e != i) {
            if (i != 2) {
                this.d1 = -9223372036854775807L;
            }
            this.J0 = a3b.g(i);
        }
    }

    public final boolean X() {
        a3b a3b = this.J0;
        return a3b.l && a3b.n == 0;
    }

    public final boolean Y(mue mue, yj8 yj8) {
        if (yj8.b() || mue.q()) {
            return false;
        }
        int i = mue.h(yj8.a, this.w0).c;
        kue kue = this.v0;
        mue.o(i, kue);
        return kue.a() && kue.i && kue.f != -9223372036854775807L;
    }

    public final void Z() {
        be8 be8 = this.D0.i;
        if (be8 != null) {
            l0f l0f = be8.n;
            int i = 0;
            while (true) {
                vj0[] vj0Arr = this.a;
                if (i < vj0Arr.length) {
                    if (l0f.I(i)) {
                        vj0 vj0 = vj0Arr[i];
                        int i2 = vj0.s0;
                        boolean z = true;
                        if (i2 == 1) {
                            if (i2 != 1) {
                                z = false;
                            }
                            fm9.k(z);
                            vj0.s0 = 2;
                            vj0.v();
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(y75 y75, int i) {
        this.K0.d(1);
        vk8 vk8 = this.E0;
        if (i == -1) {
            i = ((ArrayList) vk8.b).size();
        }
        l(vk8.b(i, y75.a, y75.b), false);
    }

    public final void a0(boolean z, boolean z2) {
        B(z || !this.T0, false, true, false);
        this.K0.d(z2 ? 1 : 0);
        this.Y.d(this.H0);
        W(1);
    }

    public final void b(vj0 vj0) {
        if (q(vj0)) {
            dk dkVar = this.z0;
            if (vj0 == ((vj0) dkVar.Y)) {
                dkVar.Z = null;
                dkVar.Y = null;
                dkVar.b = true;
            }
            int i = vj0.s0;
            if (i == 2) {
                fm9.k(i == 2);
                vj0.s0 = 1;
                vj0.w();
            }
            fm9.k(vj0.s0 == 1);
            vj0.c.t();
            vj0.s0 = 0;
            vj0.t0 = null;
            vj0.u0 = null;
            vj0.y0 = false;
            vj0.p();
            this.W0--;
        }
    }

    public final void b0() {
        int i;
        dk dkVar = this.z0;
        dkVar.c = false;
        fh8 fh8 = (fh8) dkVar.o;
        if (fh8.b) {
            fh8.a(fh8.t());
            fh8.b = false;
        }
        for (vj0 vj0 : this.a) {
            if (q(vj0) && (i = vj0.s0) == 2) {
                fm9.k(i == 2);
                vj0.s0 = 1;
                vj0.w();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06d2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0415 A[EDGE_INSN: B:462:0x0415->B:229:0x0415 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r50 = this;
            r10 = r50
            she r0 = r10.B0
            r0.getClass()
            long r11 = android.os.SystemClock.uptimeMillis()
            bie r0 = r10.s0
            r13 = 2
            r0.e(r13)
            a3b r0 = r10.J0
            mue r0 = r0.a
            boolean r0 = r0.q()
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            if (r0 != 0) goto L_0x0027
            vk8 r0 = r10.E0
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            r14 = r9
            r19 = r11
            r1 = 3
            r11 = 1
            r13 = 0
            goto L_0x041e
        L_0x002f:
            ge8 r0 = r10.D0
            long r1 = r10.Y0
            be8 r0 = r0.k
            if (r0 == 0) goto L_0x004d
            be8 r3 = r0.l
            if (r3 != 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            defpackage.fm9.k(r3)
            boolean r3 = r0.d
            if (r3 == 0) goto L_0x004d
            zd8 r3 = r0.a
            long r5 = r0.o
            long r1 = r1 - r5
            r3.t(r1)
        L_0x004d:
            ge8 r0 = r10.D0
            be8 r1 = r0.k
            if (r1 == 0) goto L_0x0073
            ee8 r2 = r1.f
            boolean r2 = r2.i
            if (r2 != 0) goto L_0x0070
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0070
            be8 r1 = r0.k
            ee8 r1 = r1.f
            long r1 = r1.e
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0070
            int r0 = r0.l
            r1 = 100
            if (r0 >= r1) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r7 = 1
            goto L_0x015f
        L_0x0073:
            ge8 r0 = r10.D0
            long r1 = r10.Y0
            a3b r3 = r10.J0
            be8 r4 = r0.k
            if (r4 != 0) goto L_0x0094
            mue r1 = r3.a
            yj8 r2 = r3.b
            long r4 = r3.c
            long r7 = r3.s
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r4
            r21 = r7
            ee8 r0 = r16.e(r17, r18, r19, r21)
            goto L_0x009a
        L_0x0094:
            mue r3 = r3.a
            ee8 r0 = r0.d(r3, r4, r1)
        L_0x009a:
            if (r0 == 0) goto L_0x0070
            ge8 r1 = r10.D0
            be8 r2 = r1.k
            if (r2 != 0) goto L_0x00a8
            r2 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            goto L_0x00b3
        L_0x00a8:
            long r3 = r2.o
            ee8 r2 = r2.f
            long r5 = r2.e
            long r3 = r3 + r5
            long r5 = r0.b
            long r3 = r3 - r5
            r2 = r3
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            java.util.List r5 = r1.o
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x00f6
            java.util.List r5 = r1.o
            java.lang.Object r5 = r5.get(r4)
            be8 r5 = (defpackage.be8) r5
            ee8 r5 = r5.f
            long r6 = r5.e
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x00d2
            long r13 = r0.e
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00ed
        L_0x00d2:
            long r6 = r5.b
            long r13 = r0.b
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00ed
            yj8 r5 = r5.a
            yj8 r6 = r0.a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00ed
            java.util.List r5 = r1.o
            java.lang.Object r4 = r5.remove(r4)
            be8 r4 = (defpackage.be8) r4
            goto L_0x00f7
        L_0x00ed:
            int r4 = r4 + 1
            r13 = 2
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b4
        L_0x00f6:
            r4 = r9
        L_0x00f7:
            if (r4 != 0) goto L_0x0122
            q64 r4 = r1.e
            be8 r5 = new be8
            java.lang.Object r4 = r4.b
            g85 r4 = (defpackage.g85) r4
            pn7 r6 = r4.Y
            n64 r29 = r6.j()
            vj0[] r6 = r4.c
            hz7 r7 = r4.o
            vk8 r8 = r4.E0
            l0f r4 = r4.X
            r24 = r5
            r25 = r6
            r26 = r2
            r28 = r7
            r30 = r8
            r31 = r0
            r32 = r4
            r24.<init>(r25, r26, r28, r29, r30, r31, r32)
            r4 = r5
            goto L_0x0126
        L_0x0122:
            r4.f = r0
            r4.o = r2
        L_0x0126:
            be8 r2 = r1.k
            if (r2 == 0) goto L_0x0138
            be8 r3 = r2.l
            if (r4 != r3) goto L_0x012f
            goto L_0x013c
        L_0x012f:
            r2.b()
            r2.l = r4
            r2.c()
            goto L_0x013c
        L_0x0138:
            r1.i = r4
            r1.j = r4
        L_0x013c:
            r1.m = r9
            r1.k = r4
            int r2 = r1.l
            r7 = 1
            int r2 = r2 + r7
            r1.l = r2
            r1.k()
            zd8 r1 = r4.a
            long r2 = r0.b
            r1.i(r10, r2)
            ge8 r1 = r10.D0
            be8 r1 = r1.i
            if (r1 != r4) goto L_0x015b
            long r0 = r0.b
            r10.D(r0)
        L_0x015b:
            r0 = 0
            r10.k(r0)
        L_0x015f:
            boolean r0 = r10.Q0
            if (r0 == 0) goto L_0x016d
            boolean r0 = r50.p()
            r10.Q0 = r0
            r50.c0()
            goto L_0x0170
        L_0x016d:
            r50.s()
        L_0x0170:
            ge8 r8 = r10.D0
            be8 r0 = r8.j
            if (r0 != 0) goto L_0x017b
        L_0x0176:
            r19 = r11
            r11 = r7
            goto L_0x02ca
        L_0x017b:
            be8 r1 = r0.l
            vj0[] r13 = r10.a
            if (r1 == 0) goto L_0x0185
            boolean r1 = r10.N0
            if (r1 == 0) goto L_0x018a
        L_0x0185:
            r19 = r11
            r11 = r7
            goto L_0x0288
        L_0x018a:
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x018f
            goto L_0x0176
        L_0x018f:
            r1 = 0
        L_0x0190:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x01c6
            r2 = r13[r1]
            grc[] r3 = r0.c
            r3 = r3[r1]
            grc r4 = r2.t0
            if (r4 != r3) goto L_0x0176
            if (r3 == 0) goto L_0x01c3
            boolean r3 = r2.l()
            if (r3 != 0) goto L_0x01c3
            be8 r3 = r0.l
            ee8 r4 = r0.f
            boolean r4 = r4.f
            if (r4 == 0) goto L_0x0176
            boolean r4 = r3.d
            if (r4 == 0) goto L_0x0176
            boolean r4 = r2 instanceof defpackage.xpe
            if (r4 != 0) goto L_0x01c3
            boolean r4 = r2 instanceof defpackage.r99
            if (r4 != 0) goto L_0x01c3
            long r4 = r2.x0
            long r2 = r3.e()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0176
        L_0x01c3:
            int r1 = r1 + 1
            goto L_0x0190
        L_0x01c6:
            be8 r1 = r0.l
            boolean r2 = r1.d
            if (r2 != 0) goto L_0x01d7
            long r2 = r10.Y0
            long r4 = r1.e()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d7
            goto L_0x0176
        L_0x01d7:
            l0f r14 = r0.n
            be8 r1 = r8.j
            defpackage.fm9.l(r1)
            be8 r1 = r1.l
            r8.j = r1
            r8.k()
            be8 r15 = r8.j
            defpackage.fm9.l(r15)
            l0f r5 = r15.n
            a3b r1 = r10.J0
            mue r3 = r1.a
            ee8 r1 = r15.f
            yj8 r2 = r1.a
            ee8 r0 = r0.f
            yj8 r4 = r0.a
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = 0
            r0 = r50
            r1 = r3
            r9 = r5
            r5 = r19
            r19 = r11
            r11 = r7
            r7 = r21
            r0.f0(r1, r2, r3, r4, r5, r7)
            boolean r0 = r15.d
            if (r0 == 0) goto L_0x0246
            zd8 r0 = r15.a
            long r0 = r0.n()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0246
            long r0 = r15.e()
            int r2 = r13.length
            r3 = 0
        L_0x0226:
            if (r3 >= r2) goto L_0x0234
            r4 = r13[r3]
            grc r5 = r4.t0
            if (r5 == 0) goto L_0x0231
            M(r4, r0)
        L_0x0231:
            int r3 = r3 + 1
            goto L_0x0226
        L_0x0234:
            boolean r0 = r15.f()
            if (r0 != 0) goto L_0x02ca
            r8.l(r15)
            r0 = 0
            r10.k(r0)
            r50.s()
            goto L_0x02ca
        L_0x0246:
            r0 = 0
        L_0x0247:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x02ca
            boolean r1 = r14.I(r0)
            boolean r2 = r9.I(r0)
            if (r1 == 0) goto L_0x0285
            r1 = r13[r0]
            boolean r1 = r1.y0
            if (r1 != 0) goto L_0x0285
            vj0[] r1 = r10.c
            r1 = r1[r0]
            int r1 = r1.b
            r3 = -2
            if (r1 != r3) goto L_0x0265
            r7 = r11
            goto L_0x0266
        L_0x0265:
            r7 = 0
        L_0x0266:
            java.lang.Object r1 = r14.o
            lgc[] r1 = (defpackage.lgc[]) r1
            r1 = r1[r0]
            java.lang.Object r3 = r9.o
            lgc[] r3 = (defpackage.lgc[]) r3
            r3 = r3[r0]
            if (r2 == 0) goto L_0x027c
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x027c
            if (r7 == 0) goto L_0x0285
        L_0x027c:
            r1 = r13[r0]
            long r2 = r15.e()
            M(r1, r2)
        L_0x0285:
            int r0 = r0 + 1
            goto L_0x0247
        L_0x0288:
            ee8 r1 = r0.f
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x0292
            boolean r1 = r10.N0
            if (r1 == 0) goto L_0x02ca
        L_0x0292:
            r1 = 0
        L_0x0293:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x02ca
            r2 = r13[r1]
            grc[] r3 = r0.c
            r3 = r3[r1]
            if (r3 == 0) goto L_0x02c7
            grc r4 = r2.t0
            if (r4 != r3) goto L_0x02c7
            boolean r3 = r2.l()
            if (r3 == 0) goto L_0x02c7
            ee8 r3 = r0.f
            long r3 = r3.e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x02bf
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x02bf
            long r5 = r0.o
            long r3 = r3 + r5
            goto L_0x02c4
        L_0x02bf:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02c4:
            M(r2, r3)
        L_0x02c7:
            int r1 = r1 + 1
            goto L_0x0293
        L_0x02ca:
            ge8 r0 = r10.D0
            be8 r1 = r0.j
            if (r1 == 0) goto L_0x02d8
            be8 r0 = r0.i
            if (r0 == r1) goto L_0x02d8
            boolean r0 = r1.g
            if (r0 == 0) goto L_0x02db
        L_0x02d8:
            r8 = 0
            goto L_0x0372
        L_0x02db:
            l0f r0 = r1.n
            r2 = 0
            r7 = 0
        L_0x02df:
            vj0[] r3 = r10.a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x035f
            r3 = r3[r2]
            boolean r4 = q(r3)
            if (r4 != 0) goto L_0x02ed
            goto L_0x033e
        L_0x02ed:
            grc r4 = r3.t0
            grc[] r5 = r1.c
            r6 = r5[r2]
            if (r4 == r6) goto L_0x02f7
            r4 = r11
            goto L_0x02f8
        L_0x02f7:
            r4 = 0
        L_0x02f8:
            boolean r6 = r0.I(r2)
            if (r6 == 0) goto L_0x0301
            if (r4 != 0) goto L_0x0301
            goto L_0x033e
        L_0x0301:
            boolean r4 = r3.y0
            if (r4 != 0) goto L_0x0350
            java.lang.Object r4 = r0.X
            n85[] r4 = (defpackage.n85[]) r4
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0312
            int r6 = r4.length()
            goto L_0x0313
        L_0x0312:
            r6 = 0
        L_0x0313:
            qy5[] r8 = new defpackage.qy5[r6]
            r9 = 0
        L_0x0316:
            if (r9 >= r6) goto L_0x0321
            qy5 r12 = r4.d(r9)
            r8[r9] = r12
            int r9 = r9 + 1
            goto L_0x0316
        L_0x0321:
            r25 = r5[r2]
            long r26 = r1.e()
            long r4 = r1.o
            ee8 r6 = r1.f
            yj8 r6 = r6.a
            r23 = r3
            r24 = r8
            r28 = r4
            r30 = r6
            r23.A(r24, r25, r26, r28, r30)
            boolean r3 = r10.V0
            if (r3 == 0) goto L_0x033e
            if (r3 != 0) goto L_0x0340
        L_0x033e:
            r8 = 0
            goto L_0x035c
        L_0x0340:
            r8 = 0
            r10.V0 = r8
            a3b r3 = r10.J0
            boolean r3 = r3.p
            if (r3 == 0) goto L_0x035c
            bie r3 = r10.s0
            r4 = 2
            r3.f(r4)
            goto L_0x035c
        L_0x0350:
            r8 = 0
            boolean r4 = r3.m()
            if (r4 == 0) goto L_0x035b
            r10.b(r3)
            goto L_0x035c
        L_0x035b:
            r7 = r11
        L_0x035c:
            int r2 = r2 + 1
            goto L_0x02df
        L_0x035f:
            r8 = 0
            r0 = r7 ^ 1
            if (r0 == 0) goto L_0x0372
            int r0 = r3.length
            boolean[] r0 = new boolean[r0]
            ge8 r1 = r10.D0
            be8 r1 = r1.j
            long r1 = r1.e()
            r10.d(r0, r1)
        L_0x0372:
            r7 = r8
        L_0x0373:
            boolean r0 = r50.X()
            if (r0 != 0) goto L_0x037e
        L_0x0379:
            r13 = r8
            r1 = 3
            r14 = 0
            goto L_0x0419
        L_0x037e:
            boolean r0 = r10.N0
            if (r0 == 0) goto L_0x0383
            goto L_0x0379
        L_0x0383:
            ge8 r12 = r10.D0
            be8 r0 = r12.i
            if (r0 != 0) goto L_0x038a
            goto L_0x0379
        L_0x038a:
            be8 r0 = r0.l
            if (r0 == 0) goto L_0x0379
            long r1 = r10.Y0
            long r3 = r0.e()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0379
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0379
            if (r7 == 0) goto L_0x03a1
            r50.t()
        L_0x03a1:
            be8 r0 = r12.a()
            r0.getClass()
            a3b r1 = r10.J0
            yj8 r1 = r1.b
            java.lang.Object r1 = r1.a
            ee8 r2 = r0.f
            yj8 r2 = r2.a
            java.lang.Object r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x03d3
            a3b r1 = r10.J0
            yj8 r1 = r1.b
            int r2 = r1.b
            r3 = -1
            if (r2 != r3) goto L_0x03d3
            ee8 r2 = r0.f
            yj8 r2 = r2.a
            int r4 = r2.b
            if (r4 != r3) goto L_0x03d3
            int r1 = r1.e
            int r2 = r2.e
            if (r1 == r2) goto L_0x03d3
            r7 = r11
            goto L_0x03d4
        L_0x03d3:
            r7 = r8
        L_0x03d4:
            ee8 r0 = r0.f
            yj8 r1 = r0.a
            long r13 = r0.b
            long r4 = r0.c
            r9 = r7 ^ 1
            r15 = 0
            r0 = r50
            r2 = r13
            r6 = r13
            r13 = r8
            r8 = r9
            r14 = 0
            r9 = r15
            a3b r0 = r0.o(r1, r2, r4, r6, r8, r9)
            r10.J0 = r0
            r50.C()
            r50.e0()
            a3b r0 = r10.J0
            int r0 = r0.e
            r1 = 3
            if (r0 != r1) goto L_0x03fd
            r50.Z()
        L_0x03fd:
            be8 r0 = r12.i
            l0f r0 = r0.n
            r8 = r13
        L_0x0402:
            vj0[] r2 = r10.a
            int r3 = r2.length
            if (r8 >= r3) goto L_0x0415
            boolean r3 = r0.I(r8)
            if (r3 == 0) goto L_0x0412
            r2 = r2[r8]
            r2.g()
        L_0x0412:
            int r8 = r8 + 1
            goto L_0x0402
        L_0x0415:
            r7 = r11
            r8 = r13
            goto L_0x0373
        L_0x0419:
            y65 r0 = r10.e1
            r0.getClass()
        L_0x041e:
            a3b r0 = r10.J0
            int r0 = r0.e
            if (r0 == r11) goto L_0x0767
            r2 = 4
            if (r0 != r2) goto L_0x0429
            goto L_0x0767
        L_0x0429:
            ge8 r0 = r10.D0
            be8 r0 = r0.i
            if (r0 != 0) goto L_0x0435
            r3 = r19
            r10.H(r3)
            return
        L_0x0435:
            r3 = r19
            java.lang.String r5 = "doSomeWork"
            android.os.Trace.beginSection(r5)
            r50.e0()
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x04c3
            she r5 = r10.B0
            r5.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = defpackage.oaf.S(r5)
            r10.Z0 = r5
            zd8 r5 = r0.a
            a3b r6 = r10.J0
            long r6 = r6.s
            long r8 = r10.x0
            long r6 = r6 - r8
            boolean r8 = r10.y0
            r5.s(r6, r8)
            r5 = r11
            r7 = r5
            r8 = r13
        L_0x0463:
            vj0[] r6 = r10.a
            int r9 = r6.length
            if (r8 >= r9) goto L_0x04ca
            r6 = r6[r8]
            boolean r9 = q(r6)
            if (r9 != 0) goto L_0x0471
            goto L_0x04be
        L_0x0471:
            long r11 = r10.Y0
            long r14 = r10.Z0
            r6.z(r11, r14)
            if (r7 == 0) goto L_0x0482
            boolean r7 = r6.m()
            if (r7 == 0) goto L_0x0482
            r7 = 1
            goto L_0x0483
        L_0x0482:
            r7 = r13
        L_0x0483:
            grc[] r9 = r0.c
            r9 = r9[r8]
            grc r11 = r6.t0
            if (r9 == r11) goto L_0x048d
            r9 = 1
            goto L_0x048e
        L_0x048d:
            r9 = r13
        L_0x048e:
            if (r9 != 0) goto L_0x0498
            boolean r11 = r6.l()
            if (r11 == 0) goto L_0x0498
            r11 = 1
            goto L_0x0499
        L_0x0498:
            r11 = r13
        L_0x0499:
            if (r9 != 0) goto L_0x04ac
            if (r11 != 0) goto L_0x04ac
            boolean r9 = r6.o()
            if (r9 != 0) goto L_0x04ac
            boolean r9 = r6.m()
            if (r9 == 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            r9 = r13
            goto L_0x04ad
        L_0x04ac:
            r9 = 1
        L_0x04ad:
            if (r5 == 0) goto L_0x04b3
            if (r9 == 0) goto L_0x04b3
            r5 = 1
            goto L_0x04b4
        L_0x04b3:
            r5 = r13
        L_0x04b4:
            if (r9 != 0) goto L_0x04be
            grc r6 = r6.t0
            r6.getClass()
            r6.c()
        L_0x04be:
            int r8 = r8 + 1
            r11 = 1
            r14 = 0
            goto L_0x0463
        L_0x04c3:
            zd8 r5 = r0.a
            r5.k()
            r5 = 1
            r7 = 1
        L_0x04ca:
            ee8 r6 = r0.f
            long r8 = r6.e
            if (r7 == 0) goto L_0x04e7
            boolean r6 = r0.d
            if (r6 == 0) goto L_0x04e7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x04e5
            a3b r6 = r10.J0
            long r6 = r6.s
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x04e7
        L_0x04e5:
            r8 = 1
            goto L_0x04e8
        L_0x04e7:
            r8 = r13
        L_0x04e8:
            if (r8 == 0) goto L_0x04f8
            boolean r6 = r10.N0
            if (r6 == 0) goto L_0x04f8
            r10.N0 = r13
            a3b r6 = r10.J0
            int r6 = r6.n
            r7 = 5
            r10.Q(r6, r7, r13, r13)
        L_0x04f8:
            if (r8 == 0) goto L_0x050b
            ee8 r6 = r0.f
            boolean r6 = r6.i
            if (r6 == 0) goto L_0x050b
            r10.W(r2)
            r50.b0()
            r19 = r3
        L_0x0508:
            r3 = 1
            goto L_0x0651
        L_0x050b:
            a3b r6 = r10.J0
            int r7 = r6.e
            r8 = 2
            if (r7 != r8) goto L_0x05ea
            int r7 = r10.W0
            if (r7 != 0) goto L_0x051e
            boolean r8 = r50.r()
            r19 = r3
            goto L_0x05c5
        L_0x051e:
            if (r5 != 0) goto L_0x0525
            r19 = r3
            r8 = r13
            goto L_0x05c5
        L_0x0525:
            boolean r7 = r6.g
            if (r7 != 0) goto L_0x052e
        L_0x0529:
            r19 = r3
        L_0x052b:
            r8 = 1
            goto L_0x05c5
        L_0x052e:
            ge8 r7 = r10.D0
            be8 r8 = r7.i
            mue r6 = r6.a
            ee8 r9 = r8.f
            yj8 r9 = r9.a
            boolean r6 = r10.Y(r6, r9)
            if (r6 == 0) goto L_0x0545
            cc4 r6 = r10.F0
            long r11 = r6.j
            r34 = r11
            goto L_0x054a
        L_0x0545:
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x054a:
            be8 r6 = r7.k
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x055a
            ee8 r7 = r6.f
            boolean r7 = r7.i
            if (r7 == 0) goto L_0x055a
            r7 = 1
            goto L_0x055b
        L_0x055a:
            r7 = r13
        L_0x055b:
            ee8 r9 = r6.f
            yj8 r9 = r9.a
            boolean r9 = r9.b()
            if (r9 == 0) goto L_0x056b
            boolean r6 = r6.d
            if (r6 != 0) goto L_0x056b
            r6 = 1
            goto L_0x056c
        L_0x056b:
            r6 = r13
        L_0x056c:
            if (r7 != 0) goto L_0x0529
            if (r6 != 0) goto L_0x0529
            on7 r6 = new on7
            a3b r7 = r10.J0
            mue r9 = r7.a
            ee8 r11 = r8.f
            yj8 r11 = r11.a
            long r14 = r10.Y0
            r19 = r3
            long r2 = r8.o
            long r28 = r14 - r2
            long r2 = r7.q
            ge8 r4 = r10.D0
            be8 r4 = r4.k
            r7 = 0
            if (r4 != 0) goto L_0x058f
            r30 = r7
            goto L_0x059b
        L_0x058f:
            long r14 = r10.Y0
            long r12 = r4.o
            long r14 = r14 - r12
            long r2 = r2 - r14
            long r2 = java.lang.Math.max(r7, r2)
            r30 = r2
        L_0x059b:
            dk r2 = r10.z0
            c3b r2 = r2.d()
            float r2 = r2.a
            a3b r3 = r10.J0
            boolean r3 = r3.l
            boolean r3 = r10.O0
            j4b r4 = r10.H0
            r24 = r6
            r25 = r4
            r26 = r9
            r27 = r11
            r32 = r2
            r33 = r3
            r24.<init>(r25, r26, r27, r28, r30, r32, r33, r34)
            pn7 r2 = r10.Y
            boolean r2 = r2.k(r6)
            if (r2 == 0) goto L_0x05c4
            goto L_0x052b
        L_0x05c4:
            r8 = 0
        L_0x05c5:
            if (r8 == 0) goto L_0x05e8
            r10.W(r1)
            r2 = 0
            r10.c1 = r2
            boolean r2 = r50.X()
            if (r2 == 0) goto L_0x0508
            r2 = 0
            r10.g0(r2, r2)
            dk r2 = r10.z0
            r3 = 1
            r2.c = r3
            java.lang.Object r2 = r2.o
            fh8 r2 = (defpackage.fh8) r2
            r2.b()
            r50.Z()
            goto L_0x0651
        L_0x05e8:
            r3 = 1
            goto L_0x05ed
        L_0x05ea:
            r19 = r3
            goto L_0x05e8
        L_0x05ed:
            a3b r2 = r10.J0
            int r2 = r2.e
            if (r2 != r1) goto L_0x0651
            int r2 = r10.W0
            if (r2 != 0) goto L_0x05fe
            boolean r2 = r50.r()
            if (r2 == 0) goto L_0x0600
            goto L_0x0651
        L_0x05fe:
            if (r5 != 0) goto L_0x0651
        L_0x0600:
            boolean r2 = r50.X()
            r4 = 0
            r10.g0(r2, r4)
            r2 = 2
            r10.W(r2)
            boolean r2 = r10.O0
            if (r2 == 0) goto L_0x064e
            ge8 r2 = r10.D0
            be8 r2 = r2.i
        L_0x0614:
            if (r2 == 0) goto L_0x062d
            l0f r4 = r2.n
            java.lang.Object r4 = r4.X
            n85[] r4 = (defpackage.n85[]) r4
            int r5 = r4.length
            r8 = 0
        L_0x061e:
            if (r8 >= r5) goto L_0x062a
            r6 = r4[r8]
            if (r6 == 0) goto L_0x0627
            r6.o()
        L_0x0627:
            int r8 = r8 + 1
            goto L_0x061e
        L_0x062a:
            be8 r2 = r2.l
            goto L_0x0614
        L_0x062d:
            cc4 r2 = r10.F0
            long r4 = r2.j
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x063b
            goto L_0x064e
        L_0x063b:
            long r8 = r2.c
            long r4 = r4 + r8
            r2.j = r4
            long r8 = r2.i
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x064c
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x064c
            r2.j = r8
        L_0x064c:
            r2.n = r6
        L_0x064e:
            r50.b0()
        L_0x0651:
            a3b r2 = r10.J0
            int r2 = r2.e
            r4 = 2
            if (r2 != r4) goto L_0x0692
            r8 = 0
        L_0x0659:
            vj0[] r2 = r10.a
            int r4 = r2.length
            if (r8 >= r4) goto L_0x067b
            r2 = r2[r8]
            boolean r2 = q(r2)
            if (r2 == 0) goto L_0x0678
            vj0[] r2 = r10.a
            r2 = r2[r8]
            grc r2 = r2.t0
            grc[] r4 = r0.c
            r4 = r4[r8]
            if (r2 != r4) goto L_0x0678
            r2.getClass()
            r2.c()
        L_0x0678:
            int r8 = r8 + 1
            goto L_0x0659
        L_0x067b:
            a3b r0 = r10.J0
            boolean r2 = r0.g
            if (r2 != 0) goto L_0x0692
            long r4 = r0.r
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0692
            boolean r0 = r50.p()
            if (r0 == 0) goto L_0x0692
            r8 = r3
            goto L_0x0693
        L_0x0692:
            r8 = 0
        L_0x0693:
            if (r8 != 0) goto L_0x069d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.d1 = r4
            goto L_0x06c6
        L_0x069d:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = r10.d1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x06b4
            she r0 = r10.B0
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r10.d1 = r4
            goto L_0x06c6
        L_0x06b4:
            she r0 = r10.B0
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.d1
            long r4 = r4 - r6
            r6 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x075f
        L_0x06c6:
            boolean r0 = r50.X()
            if (r0 == 0) goto L_0x06d4
            a3b r0 = r10.J0
            int r0 = r0.e
            if (r0 != r1) goto L_0x06d4
            r8 = r3
            goto L_0x06d5
        L_0x06d4:
            r8 = 0
        L_0x06d5:
            boolean r0 = r10.V0
            if (r0 == 0) goto L_0x06e0
            boolean r0 = r10.U0
            if (r0 == 0) goto L_0x06e0
            if (r8 == 0) goto L_0x06e0
            goto L_0x06e1
        L_0x06e0:
            r3 = 0
        L_0x06e1:
            a3b r0 = r10.J0
            boolean r2 = r0.p
            if (r2 == r3) goto L_0x073e
            a3b r2 = new a3b
            r23 = r2
            mue r4 = r0.a
            r24 = r4
            yj8 r4 = r0.b
            r25 = r4
            long r4 = r0.c
            r26 = r4
            long r4 = r0.d
            r28 = r4
            int r4 = r0.e
            r30 = r4
            androidx.media3.exoplayer.ExoPlaybackException r4 = r0.f
            r31 = r4
            boolean r4 = r0.g
            r32 = r4
            tze r4 = r0.h
            r33 = r4
            l0f r4 = r0.i
            r34 = r4
            java.util.List r4 = r0.j
            r35 = r4
            yj8 r4 = r0.k
            r36 = r4
            boolean r4 = r0.l
            r37 = r4
            int r4 = r0.m
            r38 = r4
            int r4 = r0.n
            r39 = r4
            c3b r4 = r0.o
            r40 = r4
            long r4 = r0.q
            r41 = r4
            long r4 = r0.r
            r43 = r4
            long r4 = r0.s
            r45 = r4
            long r4 = r0.t
            r47 = r4
            r49 = r3
            r23.<init>(r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r49)
            r10.J0 = r2
        L_0x073e:
            r0 = 0
            r10.U0 = r0
            if (r3 != 0) goto L_0x075b
            a3b r0 = r10.J0
            int r0 = r0.e
            r2 = 4
            if (r0 != r2) goto L_0x074b
            goto L_0x075b
        L_0x074b:
            if (r8 != 0) goto L_0x0756
            r2 = 2
            if (r0 == r2) goto L_0x0756
            if (r0 != r1) goto L_0x075b
            int r0 = r10.W0
            if (r0 == 0) goto L_0x075b
        L_0x0756:
            r0 = r19
            r10.H(r0)
        L_0x075b:
            android.os.Trace.endSection()
            return
        L_0x075f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0767:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.c():void");
    }

    public final void c0() {
        be8 be8 = this.D0.k;
        boolean z = this.Q0 || (be8 != null && be8.a.a());
        a3b a3b = this.J0;
        if (z != a3b.g) {
            a3b a3b2 = r2;
            a3b a3b3 = new a3b(a3b.a, a3b.b, a3b.c, a3b.d, a3b.e, a3b.f, z, a3b.h, a3b.i, a3b.j, a3b.k, a3b.l, a3b.m, a3b.n, a3b.o, a3b.q, a3b.r, a3b.s, a3b.t, a3b.p);
            this.J0 = a3b2;
        }
    }

    public final void d(boolean[] zArr, long j) {
        vj0[] vj0Arr;
        Set set;
        int i;
        be8 be8;
        l0f l0f;
        ge8 ge8;
        Set set2;
        int i2;
        m78 m78;
        long j2 = j;
        ge8 ge82 = this.D0;
        be8 be82 = ge82.j;
        l0f l0f2 = be82.n;
        int i3 = 0;
        while (true) {
            vj0Arr = this.a;
            int length = vj0Arr.length;
            set = this.b;
            if (i3 >= length) {
                break;
            }
            if (!l0f2.I(i3) && set.remove(vj0Arr[i3])) {
                vj0Arr[i3].B();
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < vj0Arr.length) {
            if (l0f2.I(i4)) {
                boolean z = zArr[i4];
                vj0 vj0 = vj0Arr[i4];
                if (!q(vj0)) {
                    be8 be83 = ge82.j;
                    boolean z2 = be83 == ge82.i;
                    l0f l0f3 = be83.n;
                    lgc lgc = ((lgc[]) l0f3.o)[i4];
                    n85 n85 = ((n85[]) l0f3.X)[i4];
                    if (n85 != null) {
                        ge8 = ge82;
                        i2 = n85.length();
                    } else {
                        ge8 = ge82;
                        i2 = 0;
                    }
                    qy5[] qy5Arr = new qy5[i2];
                    l0f = l0f2;
                    for (int i5 = 0; i5 < i2; i5++) {
                        qy5Arr[i5] = n85.d(i5);
                    }
                    boolean z3 = X() && this.J0.e == 3;
                    boolean z4 = !z && z3;
                    this.W0++;
                    set.add(vj0);
                    grc grc = be83.c[i4];
                    be8 = be82;
                    boolean z5 = z3;
                    long j3 = be83.o;
                    yj8 yj8 = be83.f.a;
                    fm9.k(vj0.s0 == 0);
                    vj0.o = lgc;
                    vj0.s0 = 1;
                    vj0.q(z4, z2);
                    yj8 yj82 = yj8;
                    qy5[] qy5Arr2 = qy5Arr;
                    vj0 vj02 = vj0;
                    boolean z6 = z2;
                    i = i4;
                    long j4 = j3;
                    set2 = set;
                    vj0.A(qy5Arr2, grc, j, j4, yj82);
                    vj02.y0 = false;
                    vj02.w0 = j2;
                    vj02.x0 = j2;
                    vj02.r(j2, z4);
                    vj02.a(11, new w75(this));
                    dk dkVar = this.z0;
                    dkVar.getClass();
                    m78 j5 = vj02.j();
                    if (!(j5 == null || j5 == (m78 = (m78) dkVar.Z))) {
                        if (m78 == null) {
                            dkVar.Z = j5;
                            dkVar.Y = vj02;
                            j5.f((c3b) ((fh8) dkVar.o).Y);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z5 && z6) {
                        fm9.k(vj02.s0 == 1);
                        vj02.s0 = 2;
                        vj02.v();
                    }
                    i4 = i + 1;
                    set = set2;
                    ge82 = ge8;
                    l0f2 = l0f;
                    be82 = be8;
                }
            }
            i = i4;
            ge8 = ge82;
            be8 = be82;
            l0f = l0f2;
            set2 = set;
            i4 = i + 1;
            set = set2;
            ge82 = ge8;
            l0f2 = l0f;
            be82 = be8;
        }
        be82.g = true;
    }

    public final void d0(List list, int i, int i2) {
        boolean z = true;
        this.K0.d(1);
        vk8 vk8 = this.E0;
        vk8.getClass();
        ArrayList arrayList = (ArrayList) vk8.b;
        fm9.f(i >= 0 && i <= i2 && i2 <= arrayList.size());
        if (list.size() != i2 - i) {
            z = false;
        }
        fm9.f(z);
        for (int i3 = i; i3 < i2; i3++) {
            ((tk8) arrayList.get(i3)).a.t((tb8) list.get(i3 - i));
        }
        l(vk8.f(), false);
    }

    public final void e(zd8 zd8) {
        this.s0.a(8, zd8).b();
    }

    public final void e0() {
        be8 be8 = this.D0.i;
        if (be8 != null) {
            long n = be8.d ? be8.a.n() : -9223372036854775807L;
            if (n != -9223372036854775807L) {
                if (!be8.f()) {
                    this.D0.l(be8);
                    k(false);
                    s();
                }
                D(n);
                if (n != this.J0.s) {
                    a3b a3b = this.J0;
                    this.J0 = o(a3b.b, n, a3b.c, n, true, 5);
                }
            } else {
                dk dkVar = this.z0;
                boolean z = be8 != this.D0.j;
                vj0 vj0 = (vj0) dkVar.Y;
                fh8 fh8 = (fh8) dkVar.o;
                if (vj0 == null || vj0.m() || ((z && ((vj0) dkVar.Y).s0 != 2) || (!((vj0) dkVar.Y).o() && (z || ((vj0) dkVar.Y).l())))) {
                    dkVar.b = true;
                    if (dkVar.c) {
                        fh8.b();
                    }
                } else {
                    m78 m78 = (m78) dkVar.Z;
                    m78.getClass();
                    long t = m78.t();
                    if (dkVar.b) {
                        if (t >= fh8.t()) {
                            dkVar.b = false;
                            if (dkVar.c) {
                                fh8.b();
                            }
                        } else if (fh8.b) {
                            fh8.a(fh8.t());
                            fh8.b = false;
                        }
                    }
                    fh8.a(t);
                    c3b d = m78.d();
                    if (!d.equals((c3b) fh8.Y)) {
                        fh8.f(d);
                        ((g85) ((gc4) dkVar.X)).s0.a(16, d).b();
                    }
                }
                long t2 = dkVar.t();
                this.Y0 = t2;
                long j = t2 - be8.o;
                long j2 = this.J0.s;
                if (!this.A0.isEmpty() && !this.J0.b.b()) {
                    if (this.b1) {
                        this.b1 = false;
                    }
                    a3b a3b2 = this.J0;
                    a3b2.a.b(a3b2.b.a);
                    int min = Math.min(this.a1, this.A0.size());
                    if (min > 0) {
                        au1.r(this.A0.get(min - 1));
                    }
                    if (min < this.A0.size()) {
                        au1.r(this.A0.get(min));
                    }
                    this.a1 = min;
                }
                if (this.z0.I()) {
                    boolean z2 = !this.K0.e;
                    a3b a3b3 = this.J0;
                    this.J0 = o(a3b3.b, j, a3b3.c, j, z2, 6);
                } else {
                    a3b a3b4 = this.J0;
                    a3b4.s = j;
                    a3b4.t = SystemClock.elapsedRealtime();
                }
            }
            this.J0.q = this.D0.k.d();
            a3b a3b5 = this.J0;
            long j3 = a3b5.q;
            be8 be82 = this.D0.k;
            a3b5.r = be82 == null ? 0 : Math.max(0, j3 - (this.Y0 - be82.o));
            a3b a3b6 = this.J0;
            if (a3b6.l && a3b6.e == 3 && Y(a3b6.a, a3b6.b)) {
                a3b a3b7 = this.J0;
                float f = 1.0f;
                if (a3b7.o.a == 1.0f) {
                    cc4 cc4 = this.F0;
                    long f2 = f(a3b7.a, a3b7.b.a, a3b7.s);
                    long j4 = this.J0.q;
                    be8 be83 = this.D0.k;
                    long max = be83 == null ? 0 : Math.max(0, j4 - (this.Y0 - be83.o));
                    if (cc4.e != -9223372036854775807L) {
                        long j5 = f2 - max;
                        long j6 = cc4.o;
                        if (j6 == -9223372036854775807L) {
                            cc4.o = j5;
                            cc4.p = 0;
                        } else {
                            float f3 = cc4.d;
                            float f4 = 1.0f - f3;
                            long max2 = Math.max(j5, (long) ((((float) j5) * f4) + (((float) j6) * f3)));
                            cc4.o = max2;
                            cc4.p = (long) ((f4 * ((float) Math.abs(j5 - max2))) + (f3 * ((float) cc4.p)));
                        }
                        if (cc4.n == -9223372036854775807L || SystemClock.elapsedRealtime() - cc4.n >= 1000) {
                            cc4.n = SystemClock.elapsedRealtime();
                            long j7 = (cc4.p * 3) + cc4.o;
                            if (cc4.j > j7) {
                                float S = (float) oaf.S(1000);
                                cc4.j = pag.y(j7, cc4.g, cc4.j - (((long) ((cc4.m - 1.0f) * S)) + ((long) ((cc4.k - 1.0f) * S))));
                            } else {
                                long k = oaf.k(f2 - ((long) (Math.max(0.0f, cc4.m - 1.0f) / 1.0E-7f)), cc4.j, j7);
                                cc4.j = k;
                                long j8 = cc4.i;
                                if (j8 != -9223372036854775807L && k > j8) {
                                    cc4.j = j8;
                                }
                            }
                            long j9 = f2 - cc4.j;
                            if (Math.abs(j9) < cc4.b) {
                                cc4.m = 1.0f;
                            } else {
                                cc4.m = oaf.i((1.0E-7f * ((float) j9)) + 1.0f, cc4.l, cc4.k);
                            }
                            f = cc4.m;
                        } else {
                            f = cc4.m;
                        }
                    }
                    if (this.z0.d().a != f) {
                        c3b c3b = new c3b(f, this.J0.o.b);
                        this.s0.e(16);
                        this.z0.f(c3b);
                        n(this.J0.o, this.z0.d().a, false, false);
                    }
                }
            }
        }
    }

    public final long f(mue mue, Object obj, long j) {
        hue hue = this.w0;
        int i = mue.h(obj, hue).c;
        kue kue = this.v0;
        mue.o(i, kue);
        if (kue.f == -9223372036854775807L || !kue.a() || !kue.i) {
            return -9223372036854775807L;
        }
        return oaf.S(oaf.B(kue.g) - kue.f) - (j + hue.e);
    }

    public final void f0(mue mue, yj8 yj8, mue mue2, yj8 yj82, long j, boolean z) {
        if (!Y(mue, yj8)) {
            c3b c3b = yj8.b() ? c3b.d : this.J0.o;
            dk dkVar = this.z0;
            if (!dkVar.d().equals(c3b)) {
                this.s0.e(16);
                dkVar.f(c3b);
                n(this.J0.o, c3b.a, false, false);
                return;
            }
            return;
        }
        Object obj = yj8.a;
        hue hue = this.w0;
        int i = mue.h(obj, hue).c;
        kue kue = this.v0;
        mue.o(i, kue);
        hb8 hb8 = kue.j;
        cc4 cc4 = this.F0;
        cc4.getClass();
        cc4.e = oaf.S(hb8.a);
        cc4.h = oaf.S(hb8.b);
        cc4.i = oaf.S(hb8.c);
        float f = hb8.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cc4.l = f;
        float f2 = hb8.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cc4.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cc4.e = -9223372036854775807L;
        }
        cc4.a();
        if (j != -9223372036854775807L) {
            cc4.f = f(mue, obj, j);
            cc4.a();
            return;
        }
        if (!oaf.a(!mue2.q() ? mue2.n(mue2.h(yj82.a, hue).c, kue, 0).a : null, kue.a) || z) {
            cc4.f = -9223372036854775807L;
            cc4.a();
        }
    }

    public final Pair g(mue mue) {
        long j = 0;
        if (mue.q()) {
            return Pair.create(a3b.u, 0L);
        }
        int a2 = mue.a(this.S0);
        mue mue2 = mue;
        Pair j2 = mue2.j(this.v0, this.w0, a2, -9223372036854775807L);
        yj8 n = this.D0.n(mue, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (n.b()) {
            Object obj = n.a;
            hue hue = this.w0;
            mue.h(obj, hue);
            if (n.c == hue.f(n.b)) {
                j = hue.g.c;
            }
            longValue = j;
        }
        return Pair.create(n, Long.valueOf(longValue));
    }

    public final void g0(boolean z, boolean z2) {
        long j;
        this.O0 = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.B0.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.P0 = j;
    }

    public final void h(zd8 zd8) {
        be8 be8 = this.D0.k;
        if (be8 != null && be8.a == zd8) {
            long j = this.Y0;
            if (be8 != null) {
                fm9.k(be8.l == null);
                if (be8.d) {
                    be8.a.t(j - be8.o);
                }
            }
            s();
        }
    }

    public final synchronized void h0(lc4 lc4, long j) {
        this.B0.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) lc4.get()).booleanValue() && j > 0) {
            try {
                this.B0.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.B0.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean handleMessage(Message message) {
        int i;
        be8 be8;
        int i2;
        s4b s4b;
        Message message2 = message;
        int i3 = 1000;
        try {
            switch (message2.what) {
                case 1:
                    boolean z = message2.arg1 != 0;
                    int i4 = message2.arg2;
                    Q(i4 >> 4, i4 & 15, z, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    J((e85) message2.obj);
                    break;
                case 4:
                    R((c3b) message2.obj);
                    break;
                case 5:
                    this.I0 = (x1d) message2.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((zd8) message2.obj);
                    break;
                case 9:
                    h((zd8) message2.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message2.arg1);
                    break;
                case Protos.Attaches.Attach.PRESENT /*12*/:
                    U(message2.arg1 != 0);
                    break;
                case 13:
                    N((AtomicBoolean) message2.obj, message2.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    s4b = (s4b) message2.obj;
                    s4b.getClass();
                    Looper looper = s4b.f;
                    Looper looper2 = this.u0;
                    bie bie = this.s0;
                    if (looper != looper2) {
                        bie.a(15, s4b).b();
                        break;
                    } else {
                        synchronized (s4b) {
                        }
                        s4b.a.a(s4b.d, s4b.e);
                        s4b.b(true);
                        int i5 = this.J0.e;
                        if (i5 == 3 || i5 == 2) {
                            bie.f(2);
                            break;
                        }
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    L((s4b) message2.obj);
                    break;
                case 16:
                    c3b c3b = (c3b) message2.obj;
                    n(c3b, c3b.a, true, false);
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    O((y75) message2.obj);
                    break;
                case 18:
                    a((y75) message2.obj, message2.arg1);
                    break;
                case 19:
                    v((z75) message2.obj);
                    break;
                case 20:
                    z(message2.arg1, message2.arg2, (dod) message2.obj);
                    break;
                case 21:
                    V((dod) message2.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message2.arg1 != 0);
                    break;
                case 25:
                    A();
                    I(true);
                    break;
                case 26:
                    A();
                    I(true);
                    break;
                case 27:
                    d0((List) message2.obj, message2.arg1, message2.arg2);
                    break;
                case 28:
                    S((y65) message2.obj);
                    break;
                case 29:
                    w();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            ExoPlaybackException exoPlaybackException = e;
            int i6 = exoPlaybackException.u0;
            ge8 ge8 = this.D0;
            if (i6 == 1 && (be8 = ge8.j) != null) {
                exoPlaybackException = exoPlaybackException.d(be8.f.a);
            }
            if (!exoPlaybackException.A0 || !(this.c1 == null || (i = exoPlaybackException.a) == 5004 || i == 5003)) {
                ExoPlaybackException exoPlaybackException2 = this.c1;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.c1;
                }
                ExoPlaybackException exoPlaybackException3 = exoPlaybackException;
                z04.v("Playback error", exoPlaybackException3);
                if (exoPlaybackException3.u0 == 1 && ge8.i != ge8.j) {
                    while (true) {
                        be8 be82 = ge8.i;
                        if (be82 != ge8.j) {
                            ge8.a();
                        } else {
                            be82.getClass();
                            t();
                            ee8 ee8 = be82.f;
                            yj8 yj8 = ee8.a;
                            long j = ee8.b;
                            this.J0 = o(yj8, j, ee8.c, j, true, 0);
                        }
                    }
                }
                a0(true, false);
                this.J0 = this.J0.e(exoPlaybackException3);
            } else {
                z04.d0("Recoverable renderer error", exoPlaybackException);
                ExoPlaybackException exoPlaybackException4 = this.c1;
                if (exoPlaybackException4 != null) {
                    exoPlaybackException4.addSuppressed(exoPlaybackException);
                    exoPlaybackException = this.c1;
                } else {
                    this.c1 = exoPlaybackException;
                }
                bie bie2 = this.s0;
                zhe a2 = bie2.a(25, exoPlaybackException);
                bie2.getClass();
                Message message3 = a2.a;
                message3.getClass();
                bie2.a.sendMessageAtFrontOfQueue(message3);
                a2.a();
            }
        } catch (DrmSession$DrmSessionException e2) {
            DrmSession$DrmSessionException drmSession$DrmSessionException = e2;
            i(drmSession$DrmSessionException.a, drmSession$DrmSessionException);
        } catch (ParserException e3) {
            ParserException parserException = e3;
            boolean z2 = parserException.a;
            int i7 = parserException.b;
            if (i7 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                i(i3, parserException);
            }
            i3 = i2;
            i(i3, parserException);
        } catch (DataSourceException e4) {
            DataSourceException dataSourceException = e4;
            i(dataSourceException.a, dataSourceException);
        } catch (BehindLiveWindowException e5) {
            i(1002, e5);
        } catch (IOException e6) {
            i(2000, e6);
        } catch (RuntimeException e7) {
            RuntimeException runtimeException = e7;
            if ((runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) {
                i3 = 1004;
            }
            ExoPlaybackException exoPlaybackException5 = new ExoPlaybackException(2, runtimeException, i3);
            z04.v("Playback error", exoPlaybackException5);
            a0(true, false);
            this.J0 = this.J0.e(exoPlaybackException5);
        } catch (Throwable th) {
            Throwable th2 = th;
            s4b.b(true);
            throw th2;
        }
        t();
        return true;
    }

    public final void i(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        be8 be8 = this.D0.i;
        if (be8 != null) {
            exoPlaybackException = exoPlaybackException.d(be8.f.a);
        }
        z04.v("Playback error", exoPlaybackException);
        a0(false, false);
        this.J0 = this.J0.e(exoPlaybackException);
    }

    public final void j(j6d j6d) {
        this.s0.a(9, (zd8) j6d).b();
    }

    public final void k(boolean z) {
        be8 be8 = this.D0.k;
        yj8 yj8 = be8 == null ? this.J0.b : be8.f.a;
        boolean z2 = !this.J0.k.equals(yj8);
        if (z2) {
            this.J0 = this.J0.b(yj8);
        }
        a3b a3b = this.J0;
        a3b.q = be8 == null ? a3b.s : be8.d();
        a3b a3b2 = this.J0;
        long j = a3b2.q;
        be8 be82 = this.D0.k;
        long j2 = 0;
        if (be82 != null) {
            j2 = Math.max(0, j - (this.Y0 - be82.o));
        }
        a3b2.r = j2;
        if ((z2 || z) && be8 != null && be8.d) {
            yj8 yj82 = be8.f.a;
            l0f l0f = be8.n;
            mue mue = this.J0.a;
            this.Y.h(this.H0, this.a, (n85[]) l0f.X);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: kue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: e85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: kue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: kue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: hue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: hue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: e85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: int} */
    /* JADX WARNING: type inference failed for: r25v9 */
    /* JADX WARNING: type inference failed for: r25v18 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r25v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e4, code lost:
        if (r5.e(r6, r8) != 2) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e6, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f5, code lost:
        if (r5.i(r3.b) != false) goto L_0x01e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.mue r40, boolean r41) {
        /*
            r39 = this;
            r11 = r39
            r12 = r40
            a3b r0 = r11.J0
            e85 r8 = r11.X0
            ge8 r9 = r11.D0
            int r4 = r11.R0
            boolean r10 = r11.S0
            kue r13 = r11.v0
            hue r14 = r11.w0
            boolean r1 = r40.q()
            r7 = 1
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            c85 r0 = new c85
            yj8 r19 = defpackage.a3b.u
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r7 = r0
            r24 = r5
            r11 = -1
            r13 = 2
            goto L_0x0234
        L_0x003d:
            yj8 r1 = r0.b
            java.lang.Object r15 = r1.a
            mue r2 = r0.a
            boolean r20 = r2.q()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.a
            hue r2 = r2.h(r3, r14)
            boolean r2 = r2.f
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = r7
        L_0x0059:
            yj8 r2 = r0.b
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x0069
            if (r21 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            long r2 = r0.s
        L_0x0066:
            r22 = r2
            goto L_0x006c
        L_0x0069:
            long r2 = r0.c
            goto L_0x0066
        L_0x006c:
            if (r8 == 0) goto L_0x00c1
            r3 = 1
            r2 = r1
            r1 = r40
            r27 = r2
            r11 = -1
            r2 = r8
            r5 = r10
            r6 = r13
            r7 = r14
            android.util.Pair r1 = F(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r10)
            r3 = r1
            r1 = r22
            r4 = 0
            r5 = 0
            r7 = 1
            goto L_0x00b4
        L_0x008a:
            long r2 = r8.c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            java.lang.Object r1 = r1.first
            hue r1 = r12.h(r1, r14)
            int r2 = r1.c
            r3 = r2
            r1 = r22
            r7 = 0
            goto L_0x00a9
        L_0x009d:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = r11
            r7 = 1
        L_0x00a9:
            int r4 = r0.e
            r5 = 4
            if (r4 != r5) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r5 = r4
            r4 = r7
            r7 = 0
        L_0x00b4:
            r38 = r4
            r36 = r5
            r37 = r7
            r7 = r27
            r24 = 0
            r4 = r3
            goto L_0x0169
        L_0x00c1:
            r27 = r1
            r11 = -1
            mue r1 = r0.a
            boolean r1 = r1.q()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r10)
        L_0x00d0:
            r4 = r1
            r1 = r22
            r7 = r27
            r24 = 0
        L_0x00d7:
            r36 = 0
            r37 = 0
        L_0x00db:
            r38 = 0
            goto L_0x0169
        L_0x00df:
            int r1 = r12.b(r15)
            if (r1 != r11) goto L_0x0107
            mue r6 = r0.a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r40
            int r1 = G(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r11) goto L_0x00fa
            int r1 = r12.a(r10)
            r7 = 1
            goto L_0x00fb
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            r4 = r1
            r37 = r7
            r1 = r22
            r7 = r27
            r24 = 0
            r36 = 0
            goto L_0x00db
        L_0x0107:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0112
            hue r1 = r12.h(r15, r14)
            int r1 = r1.c
            goto L_0x00d0
        L_0x0112:
            if (r21 == 0) goto L_0x0160
            mue r1 = r0.a
            r7 = r27
            java.lang.Object r2 = r7.a
            r1.h(r2, r14)
            mue r1 = r0.a
            int r2 = r14.c
            r5 = 0
            kue r1 = r1.n(r2, r13, r5)
            int r1 = r1.n
            mue r2 = r0.a
            java.lang.Object r3 = r7.a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x0154
            long r1 = r14.e
            long r19 = r22 + r1
            hue r1 = r12.h(r15, r14)
            int r4 = r1.c
            r1 = r40
            r2 = r13
            r3 = r14
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0158
        L_0x0154:
            r24 = r5
            r1 = r22
        L_0x0158:
            r4 = r11
            r36 = 0
            r37 = 0
            r38 = 1
            goto L_0x0169
        L_0x0160:
            r7 = r27
            r24 = 0
            r4 = r11
            r1 = r22
            goto L_0x00d7
        L_0x0169:
            if (r4 == r11) goto L_0x0185
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r40
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r34 = r16
            goto L_0x0187
        L_0x0185:
            r34 = r1
        L_0x0187:
            yj8 r3 = r9.n(r12, r15, r1)
            int r4 = r3.e
            if (r4 == r11) goto L_0x0198
            int r5 = r7.e
            if (r5 == r11) goto L_0x0196
            if (r4 < r5) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            r4 = 0
            goto L_0x0199
        L_0x0198:
            r4 = 1
        L_0x0199:
            java.lang.Object r5 = r7.a
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r7.b()
            if (r5 != 0) goto L_0x01b1
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x01b1
            if (r4 == 0) goto L_0x01b1
            r4 = 1
            goto L_0x01b2
        L_0x01b1:
            r4 = 0
        L_0x01b2:
            hue r5 = r12.h(r15, r14)
            if (r21 != 0) goto L_0x01c6
            int r6 = (r22 > r34 ? 1 : (r22 == r34 ? 0 : -1))
            if (r6 != 0) goto L_0x01c6
            java.lang.Object r6 = r7.a
            java.lang.Object r8 = r3.a
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x01c8
        L_0x01c6:
            r13 = 2
            goto L_0x01f8
        L_0x01c8:
            boolean r6 = r7.b()
            if (r6 == 0) goto L_0x01e8
            int r6 = r7.b
            boolean r8 = r5.i(r6)
            if (r8 == 0) goto L_0x01e8
            int r8 = r7.c
            int r9 = r5.e(r6, r8)
            r10 = 4
            if (r9 == r10) goto L_0x01c6
            int r5 = r5.e(r6, r8)
            r13 = 2
            if (r5 == r13) goto L_0x01f8
        L_0x01e6:
            r5 = 1
            goto L_0x01f9
        L_0x01e8:
            r13 = 2
            boolean r6 = r3.b()
            if (r6 == 0) goto L_0x01f8
            int r6 = r3.b
            boolean r5 = r5.i(r6)
            if (r5 == 0) goto L_0x01f8
            goto L_0x01e6
        L_0x01f8:
            r5 = 0
        L_0x01f9:
            if (r4 != 0) goto L_0x01fd
            if (r5 == 0) goto L_0x01fe
        L_0x01fd:
            r3 = r7
        L_0x01fe:
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0228
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x020f
            long r0 = r0.s
            r32 = r0
            goto L_0x022a
        L_0x020f:
            java.lang.Object r0 = r3.a
            r12.h(r0, r14)
            int r0 = r3.c
            int r1 = r3.b
            int r1 = r14.f(r1)
            if (r0 != r1) goto L_0x0223
            s8 r0 = r14.g
            long r5 = r0.c
            goto L_0x0225
        L_0x0223:
            r5 = r24
        L_0x0225:
            r32 = r5
            goto L_0x022a
        L_0x0228:
            r32 = r1
        L_0x022a:
            c85 r0 = new c85
            r30 = r0
            r31 = r3
            r30.<init>(r31, r32, r34, r36, r37, r38)
            r7 = r0
        L_0x0234:
            java.lang.Object r0 = r7.f
            r9 = r0
            yj8 r9 = (defpackage.yj8) r9
            long r14 = r7.b
            boolean r6 = r7.c
            long r3 = r7.a
            r10 = r11
            r11 = r39
            a3b r0 = r11.J0
            yj8 r0 = r0.b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0258
            a3b r0 = r11.J0
            long r0 = r0.s
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0255
            goto L_0x0258
        L_0x0255:
            r19 = 0
            goto L_0x025a
        L_0x0258:
            r19 = 1
        L_0x025a:
            r20 = 3
            boolean r0 = r7.d     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0281
            a3b r0 = r11.J0     // Catch:{ all -> 0x027d }
            int r0 = r0.e     // Catch:{ all -> 0x027d }
            r5 = 1
            if (r0 == r5) goto L_0x0277
            r2 = 4
            r11.W(r2)     // Catch:{ all -> 0x026d }
        L_0x026b:
            r1 = 0
            goto L_0x0279
        L_0x026d:
            r0 = move-exception
        L_0x026e:
            r10 = r2
            r25 = r3
            r22 = r14
            r13 = 0
            r15 = r5
            goto L_0x03df
        L_0x0277:
            r2 = 4
            goto L_0x026b
        L_0x0279:
            r11.B(r1, r1, r1, r5)     // Catch:{ all -> 0x026d }
            goto L_0x0283
        L_0x027d:
            r0 = move-exception
            r2 = 4
            r5 = 1
            goto L_0x026e
        L_0x0281:
            r2 = 4
            r5 = 1
        L_0x0283:
            vj0[] r0 = r11.a     // Catch:{ all -> 0x026d }
            int r1 = r0.length     // Catch:{ all -> 0x026d }
            r2 = 0
        L_0x0287:
            if (r2 >= r1) goto L_0x02a4
            r5 = r0[r2]     // Catch:{ all -> 0x02a2 }
            mue r8 = r5.A0     // Catch:{ all -> 0x02a2 }
            boolean r8 = defpackage.oaf.a(r8, r12)     // Catch:{ all -> 0x02a2 }
            if (r8 != 0) goto L_0x0295
            r5.A0 = r12     // Catch:{ all -> 0x02a2 }
        L_0x0295:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0287
        L_0x0299:
            r25 = r3
            r22 = r14
            r10 = 4
            r13 = 0
            r15 = 1
            goto L_0x03df
        L_0x02a2:
            r0 = move-exception
            goto L_0x0299
        L_0x02a4:
            if (r19 != 0) goto L_0x031b
            ge8 r1 = r11.D0     // Catch:{ all -> 0x0313 }
            long r5 = r11.Y0     // Catch:{ all -> 0x0313 }
            be8 r0 = r1.j     // Catch:{ all -> 0x030d }
            if (r0 != 0) goto L_0x02b5
            r22 = r14
            r13 = r24
        L_0x02b2:
            r25 = r3
            goto L_0x02f4
        L_0x02b5:
            r22 = r14
            long r13 = r0.o     // Catch:{ all -> 0x0309 }
            boolean r2 = r0.d     // Catch:{ all -> 0x0309 }
            if (r2 != 0) goto L_0x02be
            goto L_0x02b2
        L_0x02be:
            r2 = 0
        L_0x02bf:
            vj0[] r8 = r11.a     // Catch:{ all -> 0x0309 }
            int r15 = r8.length     // Catch:{ all -> 0x0309 }
            if (r2 >= r15) goto L_0x02b2
            r15 = r8[r2]     // Catch:{ all -> 0x0309 }
            boolean r15 = q(r15)     // Catch:{ all -> 0x0309 }
            if (r15 == 0) goto L_0x02d6
            r8 = r8[r2]     // Catch:{ all -> 0x0309 }
            grc r15 = r8.t0     // Catch:{ all -> 0x0309 }
            grc[] r10 = r0.c     // Catch:{ all -> 0x0309 }
            r10 = r10[r2]     // Catch:{ all -> 0x0309 }
            if (r15 == r10) goto L_0x02d9
        L_0x02d6:
            r25 = r3
            goto L_0x02ee
        L_0x02d9:
            r25 = r3
            long r3 = r8.x0     // Catch:{ all -> 0x02ec }
            r28 = -9223372036854775808
            int r8 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r8 != 0) goto L_0x02e6
            r13 = r28
            goto L_0x02f4
        L_0x02e6:
            long r3 = java.lang.Math.max(r3, r13)     // Catch:{ all -> 0x02ec }
            r13 = r3
            goto L_0x02ee
        L_0x02ec:
            r0 = move-exception
            goto L_0x0318
        L_0x02ee:
            int r2 = r2 + 1
            r3 = r25
            r10 = -1
            goto L_0x02bf
        L_0x02f4:
            r10 = 4
            r2 = r40
            r3 = r5
            r15 = 1
            r5 = r13
            boolean r0 = r1.q(r2, r3, r5)     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x035d
            r1 = 0
            r11.I(r1)     // Catch:{ all -> 0x0305 }
            goto L_0x035d
        L_0x0305:
            r0 = move-exception
        L_0x0306:
            r13 = 0
            goto L_0x03df
        L_0x0309:
            r0 = move-exception
            r25 = r3
            goto L_0x0318
        L_0x030d:
            r0 = move-exception
            r25 = r3
            r22 = r14
            goto L_0x0318
        L_0x0313:
            r0 = move-exception
            r25 = r3
            r22 = r14
        L_0x0318:
            r10 = 4
            r15 = 1
            goto L_0x0306
        L_0x031b:
            r25 = r3
            r22 = r14
            r10 = 4
            r15 = 1
            boolean r0 = r40.q()     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x035d
            ge8 r0 = r11.D0     // Catch:{ all -> 0x0305 }
            be8 r0 = r0.i     // Catch:{ all -> 0x0305 }
        L_0x032b:
            if (r0 == 0) goto L_0x0347
            ee8 r1 = r0.f     // Catch:{ all -> 0x0305 }
            yj8 r1 = r1.a     // Catch:{ all -> 0x0305 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0305 }
            if (r1 == 0) goto L_0x0344
            ge8 r1 = r11.D0     // Catch:{ all -> 0x0305 }
            ee8 r2 = r0.f     // Catch:{ all -> 0x0305 }
            ee8 r1 = r1.h(r12, r2)     // Catch:{ all -> 0x0305 }
            r0.f = r1     // Catch:{ all -> 0x0305 }
            r0.i()     // Catch:{ all -> 0x0305 }
        L_0x0344:
            be8 r0 = r0.l     // Catch:{ all -> 0x0305 }
            goto L_0x032b
        L_0x0347:
            ge8 r0 = r11.D0     // Catch:{ all -> 0x0305 }
            be8 r1 = r0.i     // Catch:{ all -> 0x0305 }
            be8 r0 = r0.j     // Catch:{ all -> 0x0305 }
            if (r1 == r0) goto L_0x0351
            r5 = r15
            goto L_0x0352
        L_0x0351:
            r5 = 0
        L_0x0352:
            r1 = r39
            r2 = r9
            r3 = r25
            long r0 = r1.K(r2, r3, r5, r6)     // Catch:{ all -> 0x0305 }
            r25 = r0
        L_0x035d:
            a3b r0 = r11.J0
            mue r4 = r0.a
            yj8 r5 = r0.b
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x036a
            r6 = r25
            goto L_0x036c
        L_0x036a:
            r6 = r16
        L_0x036c:
            r8 = 0
            r1 = r39
            r2 = r40
            r3 = r9
            r13 = 0
            r1.f0(r2, r3, r4, r5, r6, r8)
            if (r19 != 0) goto L_0x0380
            a3b r0 = r11.J0
            long r0 = r0.c
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x03ba
        L_0x0380:
            a3b r0 = r11.J0
            yj8 r1 = r0.b
            java.lang.Object r1 = r1.a
            mue r0 = r0.a
            if (r19 == 0) goto L_0x039d
            if (r41 == 0) goto L_0x039d
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x039d
            hue r2 = r11.w0
            hue r0 = r0.h(r1, r2)
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x039d
            goto L_0x039e
        L_0x039d:
            r15 = 0
        L_0x039e:
            a3b r0 = r11.J0
            long r7 = r0.d
            int r0 = r12.b(r1)
            r1 = -1
            if (r0 != r1) goto L_0x03aa
            goto L_0x03ac
        L_0x03aa:
            r10 = r20
        L_0x03ac:
            r1 = r39
            r2 = r9
            r3 = r25
            r5 = r22
            r9 = r15
            a3b r0 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.J0 = r0
        L_0x03ba:
            r39.C()
            a3b r0 = r11.J0
            mue r0 = r0.a
            r11.E(r12, r0)
            a3b r0 = r11.J0
            a3b r0 = r0.h(r12)
            r11.J0 = r0
            boolean r0 = r40.q()
            if (r0 != 0) goto L_0x03d4
            r11.X0 = r13
        L_0x03d4:
            r1 = 0
            r11.k(r1)
            bie r0 = r11.s0
            r1 = 2
            r0.f(r1)
            return
        L_0x03df:
            a3b r1 = r11.J0
            mue r4 = r1.a
            yj8 r5 = r1.b
            boolean r1 = r7.e
            if (r1 == 0) goto L_0x03ec
            r6 = r25
            goto L_0x03ee
        L_0x03ec:
            r6 = r16
        L_0x03ee:
            r8 = 0
            r1 = r39
            r2 = r40
            r3 = r9
            r1.f0(r2, r3, r4, r5, r6, r8)
            if (r19 != 0) goto L_0x0401
            a3b r1 = r11.J0
            long r1 = r1.c
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x043b
        L_0x0401:
            a3b r1 = r11.J0
            yj8 r2 = r1.b
            java.lang.Object r2 = r2.a
            mue r1 = r1.a
            if (r19 == 0) goto L_0x041e
            if (r41 == 0) goto L_0x041e
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x041e
            hue r3 = r11.w0
            hue r1 = r1.h(r2, r3)
            boolean r1 = r1.f
            if (r1 != 0) goto L_0x041e
            goto L_0x041f
        L_0x041e:
            r15 = 0
        L_0x041f:
            a3b r1 = r11.J0
            long r7 = r1.d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r10 = r20
        L_0x042d:
            r1 = r39
            r2 = r9
            r3 = r25
            r5 = r22
            r9 = r15
            a3b r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.J0 = r1
        L_0x043b:
            r39.C()
            a3b r1 = r11.J0
            mue r1 = r1.a
            r11.E(r12, r1)
            a3b r1 = r11.J0
            a3b r1 = r1.h(r12)
            r11.J0 = r1
            boolean r1 = r40.q()
            if (r1 != 0) goto L_0x0455
            r11.X0 = r13
        L_0x0455:
            r1 = 0
            r11.k(r1)
            bie r1 = r11.s0
            r2 = 2
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.l(mue, boolean):void");
    }

    public final void m(zd8 zd8) {
        ge8 ge8 = this.D0;
        be8 be8 = ge8.k;
        if (be8 != null && be8.a == zd8) {
            float f = this.z0.d().a;
            mue mue = this.J0.a;
            be8.d = true;
            be8.m = be8.a.q();
            l0f h = be8.h(f, mue);
            ee8 ee8 = be8.f;
            long j = ee8.b;
            long j2 = ee8.e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a2 = be8.a(h, j, false, new boolean[be8.i.length]);
            long j3 = be8.o;
            ee8 ee82 = be8.f;
            be8.o = (ee82.b - a2) + j3;
            be8.f = ee82.b(a2);
            l0f l0f = be8.n;
            mue mue2 = this.J0.a;
            pn7 pn7 = this.Y;
            j4b j4b = this.H0;
            vj0[] vj0Arr = this.a;
            pn7.h(j4b, vj0Arr, (n85[]) l0f.X);
            if (be8 == ge8.i) {
                D(be8.f.b);
                d(new boolean[vj0Arr.length], ge8.j.e());
                a3b a3b = this.J0;
                yj8 yj8 = a3b.b;
                long j4 = be8.f.b;
                this.J0 = o(yj8, j4, a3b.c, j4, false, 5);
            }
            s();
        }
    }

    public final void n(c3b c3b, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.K0.d(1);
            }
            this.J0 = this.J0.f(c3b);
        }
        float f2 = c3b.a;
        be8 be8 = this.D0.i;
        while (true) {
            i = 0;
            if (be8 == null) {
                break;
            }
            n85[] n85Arr = (n85[]) be8.n.X;
            int length = n85Arr.length;
            while (i < length) {
                n85 n85 = n85Arr[i];
                if (n85 != null) {
                    n85.l(f2);
                }
                i++;
            }
            be8 = be8.l;
        }
        vj0[] vj0Arr = this.a;
        int length2 = vj0Arr.length;
        while (i < length2) {
            vj0 vj0 = vj0Arr[i];
            if (vj0 != null) {
                vj0.C(f, c3b.a);
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: ffc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: ffc} */
    /* JADX WARNING: type inference failed for: r11v5, types: [ww6, pw6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.a3b o(defpackage.yj8 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r20
            r2 = r25
            boolean r3 = r0.b1
            r6 = 0
            if (r3 != 0) goto L_0x0022
            a3b r3 = r0.J0
            long r8 = r3.s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            a3b r3 = r0.J0
            yj8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r6
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.b1 = r3
            r16.C()
            a3b r3 = r0.J0
            tze r8 = r3.h
            l0f r9 = r3.i
            java.util.List r10 = r3.j
            vk8 r11 = r0.E0
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x00e0
            ge8 r3 = r0.D0
            be8 r3 = r3.i
            if (r3 != 0) goto L_0x003f
            tze r8 = defpackage.tze.d
            goto L_0x0041
        L_0x003f:
            tze r8 = r3.m
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            l0f r9 = r0.X
            goto L_0x0048
        L_0x0046:
            l0f r9 = r3.n
        L_0x0048:
            java.lang.Object r10 = r9.X
            n85[] r10 = (defpackage.n85[]) r10
            ww6 r11 = new ww6
            r12 = 4
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r6
            r14 = r13
        L_0x0055:
            if (r13 >= r12) goto L_0x0077
            r15 = r10[r13]
            if (r15 == 0) goto L_0x0074
            qy5 r15 = r15.d(r6)
            f99 r15 = r15.k
            if (r15 != 0) goto L_0x006e
            f99 r15 = new f99
            d99[] r7 = new defpackage.d99[r6]
            r15.<init>((defpackage.d99[]) r7)
            r11.a(r15)
            goto L_0x0074
        L_0x006e:
            r11.a(r15)
            r7 = 1
            r14 = 1
            goto L_0x0075
        L_0x0074:
            r7 = 1
        L_0x0075:
            int r13 = r13 + r7
            goto L_0x0055
        L_0x0077:
            if (r14 == 0) goto L_0x007e
            ffc r7 = r11.j()
            goto L_0x0082
        L_0x007e:
            ls5 r7 = defpackage.zw6.b
            ffc r7 = defpackage.ffc.X
        L_0x0082:
            if (r3 == 0) goto L_0x0092
            ee8 r10 = r3.f
            long r11 = r10.c
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            ee8 r10 = r10.a(r4)
            r3.f = r10
        L_0x0092:
            ge8 r3 = r0.D0
            be8 r3 = r3.i
            if (r3 == 0) goto L_0x00dc
            l0f r3 = r3.n
            r10 = r6
            r11 = r10
        L_0x009c:
            vj0[] r12 = r0.a
            int r13 = r12.length
            if (r11 >= r13) goto L_0x00bf
            boolean r13 = r3.I(r11)
            if (r13 == 0) goto L_0x00bc
            r12 = r12[r11]
            int r12 = r12.b
            r13 = 1
            if (r12 == r13) goto L_0x00b0
            r3 = r6
            goto L_0x00c0
        L_0x00b0:
            java.lang.Object r12 = r3.o
            lgc[] r12 = (defpackage.lgc[]) r12
            r12 = r12[r11]
            int r12 = r12.a
            if (r12 == 0) goto L_0x00bd
            r10 = r13
            goto L_0x00bd
        L_0x00bc:
            r13 = 1
        L_0x00bd:
            int r11 = r11 + r13
            goto L_0x009c
        L_0x00bf:
            r3 = 1
        L_0x00c0:
            if (r10 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00c6:
            r3 = r6
        L_0x00c7:
            boolean r10 = r0.V0
            if (r3 != r10) goto L_0x00cc
            goto L_0x00dc
        L_0x00cc:
            r0.V0 = r3
            if (r3 != 0) goto L_0x00dc
            a3b r3 = r0.J0
            boolean r3 = r3.p
            if (r3 == 0) goto L_0x00dc
            bie r3 = r0.s0
            r10 = 2
            r3.f(r10)
        L_0x00dc:
            r12 = r7
            r10 = r8
            r11 = r9
            goto L_0x00f5
        L_0x00e0:
            yj8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00f2
            tze r3 = defpackage.tze.d
            l0f r7 = r0.X
            ffc r8 = defpackage.ffc.X
            r10 = r3
            r11 = r7
            r12 = r8
            goto L_0x00f5
        L_0x00f2:
            r11 = r9
            r12 = r10
            r10 = r8
        L_0x00f5:
            if (r24 == 0) goto L_0x0110
            b85 r3 = r0.K0
            boolean r7 = r3.e
            if (r7 == 0) goto L_0x0109
            int r7 = r3.c
            r8 = 5
            if (r7 == r8) goto L_0x0109
            if (r2 != r8) goto L_0x0105
            r6 = 1
        L_0x0105:
            defpackage.fm9.f(r6)
            goto L_0x0110
        L_0x0109:
            r6 = 1
            r3.d = r6
            r3.e = r6
            r3.c = r2
        L_0x0110:
            a3b r2 = r0.J0
            long r6 = r2.q
            ge8 r3 = r0.D0
            be8 r3 = r3.k
            if (r3 != 0) goto L_0x011d
            r8 = 0
            goto L_0x012a
        L_0x011d:
            long r13 = r0.Y0
            long r8 = r3.o
            long r13 = r13 - r8
            long r6 = r6 - r13
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r8 = r6
        L_0x012a:
            r0 = r2
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            a3b r0 = r0.c(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.o(yj8, long, long, long, boolean, int):a3b");
    }

    public final boolean p() {
        be8 be8 = this.D0.k;
        if (be8 == null) {
            return false;
        }
        try {
            zd8 zd8 = be8.a;
            if (!be8.d) {
                zd8.k();
            } else {
                for (grc grc : be8.c) {
                    if (grc != null) {
                        grc.c();
                    }
                }
            }
            return (!be8.d ? 0 : zd8.f()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        be8 be8 = this.D0.i;
        long j = be8.f.e;
        return be8.d && (j == -9223372036854775807L || this.J0.s < j || !X());
    }

    public final void s() {
        boolean z;
        long j;
        long j2;
        boolean z2 = false;
        if (!p()) {
            z = false;
        } else {
            be8 be8 = this.D0.k;
            long f = !be8.d ? 0 : be8.a.f();
            be8 be82 = this.D0.k;
            long max = be82 == null ? 0 : Math.max(0, f - (this.Y0 - be82.o));
            if (be8 == this.D0.i) {
                j2 = this.Y0;
                j = be8.o;
            } else {
                j2 = this.Y0 - be8.o;
                j = be8.f.b;
            }
            long j3 = j2 - j;
            long j4 = Y(this.J0.a, be8.f.a) ? this.F0.j : -9223372036854775807L;
            j4b j4b = this.H0;
            mue mue = this.J0.a;
            yj8 yj8 = be8.f.a;
            float f2 = this.z0.d().a;
            boolean z3 = this.J0.l;
            on7 on7 = r9;
            on7 on72 = new on7(j4b, mue, yj8, j3, max, f2, this.O0, j4);
            z = this.Y.i(on7);
            be8 be83 = this.D0.i;
            if (!z && be83.d && max < 500000 && (this.x0 > 0 || this.y0)) {
                be83.a.s(this.J0.s, false);
                z = this.Y.i(on7);
            }
        }
        this.Q0 = z;
        if (z) {
            be8 be84 = this.D0.k;
            long j5 = this.Y0;
            float f3 = this.z0.d().a;
            long j6 = this.P0;
            fm9.k(be84.l == null);
            zd8 zd8 = be84.a;
            po7 po7 = new po7();
            po7.a = j5 - be84.o;
            fm9.f(f3 > 0.0f || f3 == -3.4028235E38f);
            po7.b = f3;
            if (j6 >= 0 || j6 == -9223372036854775807L) {
                z2 = true;
            }
            fm9.f(z2);
            po7.c = j6;
            zd8.o(new qo7(po7));
        }
        c0();
    }

    public final void t() {
        b85 b85 = this.K0;
        a3b a3b = this.J0;
        boolean z = b85.d | (((a3b) b85.f) != a3b);
        b85.d = z;
        b85.f = a3b;
        if (z) {
            u75 u75 = this.C0.b;
            u75.u0.d(new kl4((Object) u75, 18, (Object) b85));
            this.K0 = new b85(this.J0);
        }
    }

    public final void u() {
        l(this.E0.f(), true);
    }

    public final void v(z75 z75) {
        mue mue;
        this.K0.d(1);
        int i = z75.a;
        vk8 vk8 = this.E0;
        vk8.getClass();
        ArrayList arrayList = (ArrayList) vk8.b;
        int i2 = z75.b;
        int i3 = z75.c;
        fm9.f(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        vk8.l = z75.d;
        if (i == i2 || i == i3) {
            mue = vk8.f();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((tk8) arrayList.get(min)).d;
            oaf.R(arrayList, i, i2, i3);
            while (min <= max) {
                tk8 tk8 = (tk8) arrayList.get(min);
                tk8.d = i4;
                i4 += tk8.a.o.e.p();
                min++;
            }
            mue = vk8.f();
        }
        l(mue, false);
    }

    public final void w() {
        this.K0.d(1);
        int i = 0;
        B(false, false, false, true);
        this.Y.g(this.H0);
        W(this.J0.a.q() ? 4 : 2);
        i84 i84 = (i84) this.Z;
        i84.getClass();
        vk8 vk8 = this.E0;
        fm9.k(!vk8.g);
        vk8.m = i84;
        while (true) {
            ArrayList arrayList = (ArrayList) vk8.b;
            if (i < arrayList.size()) {
                tk8 tk8 = (tk8) arrayList.get(i);
                vk8.l(tk8);
                ((HashSet) vk8.f).add(tk8);
                i++;
            } else {
                vk8.g = true;
                this.s0.f(2);
                return;
            }
        }
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            this.Y.c(this.H0);
            W(1);
            HandlerThread handlerThread = this.t0;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.L0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.t0;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.L0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i = 0; i < this.a.length; i++) {
            vj0 vj0 = this.c[i];
            synchronized (vj0.a) {
                vj0.B0 = null;
            }
            vj0 vj02 = this.a[i];
            fm9.k(vj02.s0 == 0);
            vj02.s();
        }
    }

    public final void z(int i, int i2, dod dod) {
        boolean z = true;
        this.K0.d(1);
        vk8 vk8 = this.E0;
        vk8.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) vk8.b).size()) {
            z = false;
        }
        fm9.f(z);
        vk8.l = dod;
        vk8.p(i, i2);
        l(vk8.f(), false);
    }
}
