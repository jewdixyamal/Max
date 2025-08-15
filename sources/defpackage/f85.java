package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f85  reason: default package */
public final class f85 implements Handler.Callback, wd8 {
    public final ArrayList A0;
    public final rhe B0;
    public final g75 C0;
    public final fe8 D0;
    public final vk8 E0;
    public final cc4 F0;
    public w1d G0;
    public z2b H0;
    public a85 I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public int O0;
    public boolean P0 = false;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public d85 U0;
    public long V0;
    public int W0;
    public final l0f X;
    public boolean X0;
    public final ec4 Y;
    public ExoPlaybackException Y0;
    public final gg0 Z;
    public long Z0;
    public final uj0[] a;
    public final Set b;
    public final uj0[] c;
    public final gz7 o;
    public final aie s0;
    public final HandlerThread t0;
    public final Looper u0;
    public final jue v0;
    public final gue w0;
    public final long x0;
    public final boolean y0;
    public final dk z0;

    public f85(uj0[] uj0Arr, gz7 gz7, l0f l0f, ec4 ec4, gg0 gg0, int i, h74 h74, w1d w1d, cc4 cc4, boolean z, Looper looper, rhe rhe, g75 g75, i4b i4b) {
        this.C0 = g75;
        this.a = uj0Arr;
        this.o = gz7;
        this.X = l0f;
        this.Y = ec4;
        this.Z = gg0;
        this.O0 = i;
        this.G0 = w1d;
        this.F0 = cc4;
        this.K0 = z;
        this.B0 = rhe;
        this.Z0 = -9223372036854775807L;
        this.x0 = ec4.h;
        this.y0 = ec4.i;
        z2b h = z2b.h(l0f);
        this.H0 = h;
        this.I0 = new a85(h);
        this.c = new uj0[uj0Arr.length];
        for (int i2 = 0; i2 < uj0Arr.length; i2++) {
            uj0 uj0 = uj0Arr[i2];
            uj0.o = i2;
            uj0.X = i4b;
            this.c[i2] = uj0;
        }
        this.z0 = new dk(this, rhe);
        this.A0 = new ArrayList();
        this.b = ngg.B();
        this.v0 = new jue();
        this.w0 = new gue();
        gz7.a = this;
        gz7.b = gg0;
        this.X0 = true;
        Handler handler = new Handler(looper);
        this.D0 = new fe8(h74, handler);
        this.E0 = new vk8(this, h74, handler, i4b);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.t0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.u0 = looper2;
        this.s0 = rhe.a(looper2, this);
    }

    public static Pair E(lue lue, d85 d85, boolean z, int i, boolean z2, jue jue, gue gue) {
        Object F;
        lue lue2 = lue;
        d85 d852 = d85;
        gue gue2 = gue;
        lue lue3 = d852.a;
        if (lue.q()) {
            return null;
        }
        lue lue4 = lue3.q() ? lue2 : lue3;
        try {
            Pair j = lue4.j(jue, gue, d852.b, d852.c);
            if (lue.equals(lue4)) {
                return j;
            }
            if (lue.b(j.first) == -1) {
                jue jue2 = jue;
                if (z && (F = F(jue, gue, i, z2, j.first, lue4, lue)) != null) {
                    return lue.j(jue, gue, lue.h(F, gue2).c, -9223372036854775807L);
                }
                return null;
            } else if (!lue4.h(j.first, gue2).Y || lue4.n(gue2.c, jue, 0).z0 != lue4.b(j.first)) {
                return j;
            } else {
                return lue.j(jue, gue, lue.h(j.first, gue2).c, d852.c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object F(jue jue, gue gue, int i, boolean z, Object obj, lue lue, lue lue2) {
        int b2 = lue.b(obj);
        int i2 = lue.i();
        int i3 = b2;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = lue.d(i3, gue, jue, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = lue2.b(lue.m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return lue2.m(i4);
    }

    public static void L(uj0 uj0, long j) {
        uj0.v0 = true;
        if (uj0 instanceof wpe) {
            wpe wpe = (wpe) uj0;
            np8.f(wpe.v0);
            wpe.L0 = j;
        }
    }

    public static boolean q(uj0 uj0) {
        return uj0.Y != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        if (r5.equals(r1.H0.b) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r30 = this;
            r1 = r30
            r2 = 1
            aie r0 = r1.s0
            r3 = 2
            android.os.Handler r0 = r0.a
            r0.removeMessages(r3)
            r3 = 0
            r1.Y0 = r3
            r4 = 0
            r1.M0 = r4
            dk r0 = r1.z0
            r0.c = r4
            java.lang.Object r0 = r0.o
            fh8 r0 = (defpackage.fh8) r0
            boolean r5 = r0.b
            if (r5 == 0) goto L_0x0026
            long r5 = r0.t()
            r0.a(r5)
            r0.b = r4
        L_0x0026:
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.V0 = r5
            uj0[] r5 = r1.a
            int r6 = r5.length
            r7 = r4
        L_0x0031:
            if (r7 >= r6) goto L_0x0041
            r0 = r5[r7]
            r1.b(r0)     // Catch:{ ExoPlaybackException | RuntimeException -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r0 = move-exception
            java.lang.String r8 = "Disable failed."
            defpackage.fm9.c(r8, r0)
        L_0x003f:
            int r7 = r7 + r2
            goto L_0x0031
        L_0x0041:
            if (r31 == 0) goto L_0x0060
            uj0[] r5 = r1.a
            int r6 = r5.length
            r7 = r4
        L_0x0047:
            if (r7 >= r6) goto L_0x0060
            r0 = r5[r7]
            java.util.Set r8 = r1.b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x005e
            r0.y()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.fm9.c(r0, r8)
        L_0x005e:
            int r7 = r7 + r2
            goto L_0x0047
        L_0x0060:
            r1.T0 = r4
            z2b r0 = r1.H0
            xj8 r5 = r0.b
            long r6 = r0.s
            z2b r0 = r1.H0
            xj8 r0 = r0.b
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0090
            z2b r0 = r1.H0
            gue r8 = r1.w0
            xj8 r9 = r0.b
            lue r0 = r0.a
            boolean r10 = r0.q()
            if (r10 != 0) goto L_0x0090
            java.lang.Object r9 = r9.a
            gue r0 = r0.h(r9, r8)
            boolean r0 = r0.Y
            if (r0 == 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            z2b r0 = r1.H0
            long r8 = r0.s
            goto L_0x0094
        L_0x0090:
            z2b r0 = r1.H0
            long r8 = r0.c
        L_0x0094:
            if (r32 == 0) goto L_0x00c0
            r1.U0 = r3
            z2b r0 = r1.H0
            lue r0 = r0.a
            android.util.Pair r0 = r1.h(r0)
            java.lang.Object r5 = r0.first
            xj8 r5 = (defpackage.xj8) r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            z2b r0 = r1.H0
            xj8 r0 = r0.b
            boolean r0 = r5.equals(r0)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x00c0
        L_0x00bb:
            r18 = r5
            r26 = r6
            goto L_0x00c2
        L_0x00c0:
            r2 = r4
            goto L_0x00bb
        L_0x00c2:
            fe8 r0 = r1.D0
            r0.b()
            r1.N0 = r4
            z2b r0 = new z2b
            z2b r5 = r1.H0
            lue r6 = r5.a
            int r12 = r5.e
            if (r34 == 0) goto L_0x00d5
        L_0x00d3:
            r13 = r3
            goto L_0x00d8
        L_0x00d5:
            com.google.android.exoplayer2.ExoPlaybackException r3 = r5.f
            goto L_0x00d3
        L_0x00d8:
            if (r2 == 0) goto L_0x00de
            sze r3 = defpackage.sze.o
        L_0x00dc:
            r15 = r3
            goto L_0x00e1
        L_0x00de:
            sze r3 = r5.h
            goto L_0x00dc
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            l0f r3 = r1.X
        L_0x00e5:
            r16 = r3
            goto L_0x00eb
        L_0x00e8:
            l0f r3 = r5.i
            goto L_0x00e5
        L_0x00eb:
            if (r2 == 0) goto L_0x00f4
            ls5 r2 = defpackage.zw6.b
            ffc r2 = defpackage.ffc.X
        L_0x00f1:
            r17 = r2
            goto L_0x00f7
        L_0x00f4:
            java.util.List r2 = r5.j
            goto L_0x00f1
        L_0x00f7:
            boolean r2 = r5.l
            r19 = r2
            int r2 = r5.m
            r20 = r2
            b3b r2 = r5.n
            r21 = r2
            boolean r2 = r1.S0
            r28 = r2
            r14 = 0
            r24 = 0
            r29 = 0
            r5 = r0
            r7 = r18
            r10 = r26
            r22 = r26
            r5.<init>(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r29)
            r1.H0 = r0
            if (r33 == 0) goto L_0x015d
            vk8 r1 = r1.E0
            java.lang.Object r0 = r1.e
            r2 = r0
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Collection r0 = r2.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x0129:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r3.next()
            r5 = r0
            qk8 r5 = (defpackage.qk8) r5
            dj0 r0 = r5.a     // Catch:{ RuntimeException -> 0x013e }
            zj8 r6 = r5.b     // Catch:{ RuntimeException -> 0x013e }
            r0.l(r6)     // Catch:{ RuntimeException -> 0x013e }
            goto L_0x0144
        L_0x013e:
            r0 = move-exception
            java.lang.String r6 = "Failed to release child source."
            defpackage.fm9.c(r6, r0)
        L_0x0144:
            dj0 r0 = r5.a
            a8g r6 = r5.c
            r0.o(r6)
            dj0 r0 = r5.a
            r0.n(r6)
            goto L_0x0129
        L_0x0151:
            r2.clear()
            java.lang.Object r0 = r1.f
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.clear()
            r1.g = r4
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        ae8 ae8 = this.D0.h;
        this.L0 = ae8 != null && ae8.f.h && this.K0;
    }

    public final void C(long j) {
        fe8 fe8 = this.D0;
        ae8 ae8 = fe8.h;
        long j2 = j + (ae8 == null ? 1000000000000L : ae8.o);
        this.V0 = j2;
        ((fh8) this.z0.o).a(j2);
        for (uj0 uj0 : this.a) {
            if (q(uj0)) {
                long j3 = this.V0;
                uj0.v0 = false;
                uj0.u0 = j3;
                uj0.o(j3, false);
            }
        }
        for (ae8 ae82 = fe8.h; ae82 != null; ae82 = ae82.l) {
            for (m85 m85 : (m85[]) ae82.n.X) {
                if (m85 != null) {
                    m85.n();
                }
            }
        }
    }

    public final void D(lue lue, lue lue2) {
        if (!lue.q() || !lue2.q()) {
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

    public final void G(long j, long j2) {
        aie aie = this.s0;
        aie.a.removeMessages(2);
        aie.a.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void H(boolean z) {
        xj8 xj8 = this.D0.h.f.a;
        long J = J(xj8, this.H0.s, true, false);
        if (J != this.H0.s) {
            z2b z2b = this.H0;
            this.H0 = o(xj8, J, z2b.c, z2b.d, z, 5);
        }
    }

    public final void I(d85 d85) {
        long j;
        long j2;
        boolean z;
        xj8 xj8;
        long j3;
        long j4;
        long j5;
        z2b z2b;
        int i;
        d85 d852 = d85;
        boolean z2 = true;
        this.I0.a(1);
        Pair E = E(this.H0.a, d85, true, this.O0, this.P0, this.v0, this.w0);
        if (E == null) {
            Pair h = h(this.H0.a);
            xj8 = (xj8) h.first;
            long longValue = ((Long) h.second).longValue();
            z = !this.H0.a.q();
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = E.first;
            long longValue2 = ((Long) E.second).longValue();
            long j6 = d852.c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            xj8 m = this.D0.m(this.H0.a, obj, longValue2);
            if (m.a()) {
                this.H0.a.h(m.a, this.w0);
                j = this.w0.e(m.b) == m.c ? this.w0.Z.b : 0;
                j2 = j6;
                xj8 = m;
                z = true;
            } else {
                j = longValue2;
                j2 = j6;
                z = d852.c == -9223372036854775807L;
                xj8 = m;
            }
        }
        try {
            if (this.H0.a.q()) {
                this.U0 = d852;
            } else if (E == null) {
                if (this.H0.e != 1) {
                    V(4);
                }
                A(false, true, false, true);
            } else {
                if (xj8.equals(this.H0.b)) {
                    ae8 ae8 = this.D0.h;
                    long A = (ae8 == null || !ae8.d || j == 0) ? j : ae8.a.A(j, this.G0);
                    if (maf.M(A) == maf.M(this.H0.s) && ((i = z2b.e) == 2 || i == 3)) {
                        long j7 = (z2b = this.H0).s;
                        this.H0 = o(xj8, j7, j2, j7, z, 2);
                        return;
                    }
                    j5 = A;
                } else {
                    j5 = j;
                }
                boolean z3 = this.H0.e == 4;
                fe8 fe8 = this.D0;
                long J = J(xj8, j5, fe8.h != fe8.i, z3);
                if (j == J) {
                    z2 = false;
                }
                boolean z4 = z2 | z;
                try {
                    z2b z2b2 = this.H0;
                    lue lue = z2b2.a;
                    e0(lue, xj8, lue, z2b2.b, j2);
                    z = z4;
                    j4 = J;
                    this.H0 = o(xj8, j4, j2, j4, z, 2);
                } catch (Throwable th) {
                    th = th;
                    z = z4;
                    j3 = J;
                    this.H0 = o(xj8, j3, j2, j3, z, 2);
                    throw th;
                }
            }
            j4 = j;
            this.H0 = o(xj8, j4, j2, j4, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
            this.H0 = o(xj8, j3, j2, j3, z, 2);
            throw th;
        }
    }

    public final long J(xj8 xj8, long j, boolean z, boolean z2) {
        a0();
        this.M0 = false;
        if (z2 || this.H0.e == 3) {
            V(2);
        }
        fe8 fe8 = this.D0;
        ae8 ae8 = fe8.h;
        ae8 ae82 = ae8;
        while (ae82 != null && !xj8.equals(ae82.f.a)) {
            ae82 = ae82.l;
        }
        if (z || ae8 != ae82 || (ae82 != null && ae82.o + j < 0)) {
            uj0[] uj0Arr = this.a;
            for (uj0 b2 : uj0Arr) {
                b(b2);
            }
            if (ae82 != null) {
                while (fe8.h != ae82) {
                    fe8.a();
                }
                fe8.k(ae82);
                ae82.o = 1000000000000L;
                f(new boolean[uj0Arr.length]);
            }
        }
        if (ae82 != null) {
            fe8.k(ae82);
            if (!ae82.d) {
                ae82.f = ae82.f.b(j);
            } else if (ae82.e) {
                yd8 yd8 = ae82.a;
                j = yd8.l(j);
                yd8.s(j - this.x0, this.y0);
            }
            C(j);
            s();
        } else {
            fe8.b();
            C(j);
        }
        k(false);
        this.s0.c(2);
        return j;
    }

    public final void K(r4b r4b) {
        Looper looper = r4b.f;
        if (!looper.getThread().isAlive()) {
            r4b.b(false);
            return;
        }
        aie a2 = this.B0.a(looper, (Handler.Callback) null);
        a2.a.post(new kl4((Object) this, 20, (Object) r4b));
    }

    public final void M(AtomicBoolean atomicBoolean, boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            if (!z) {
                for (uj0 uj0 : this.a) {
                    if (!q(uj0) && this.b.remove(uj0)) {
                        uj0.y();
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

    public final void N(x75 x75) {
        this.I0.a(1);
        int i = x75.c;
        cod cod = x75.b;
        List list = x75.a;
        if (i != -1) {
            this.U0 = new d85(new a5b(list, cod), x75.c, x75.d);
        }
        vk8 vk8 = this.E0;
        ArrayList arrayList = (ArrayList) vk8.b;
        vk8.p(0, arrayList.size());
        l(vk8.a(arrayList.size(), list, cod), false);
    }

    public final void O(boolean z) {
        if (z != this.S0) {
            this.S0 = z;
            z2b z2b = this.H0;
            int i = z2b.e;
            if (z || i == 4 || i == 1) {
                this.H0 = z2b.c(z);
            } else {
                this.s0.c(2);
            }
        }
    }

    public final void P(boolean z) {
        this.K0 = z;
        B();
        if (this.L0) {
            fe8 fe8 = this.D0;
            if (fe8.i != fe8.h) {
                H(true);
                k(false);
            }
        }
    }

    public final void Q(int i, int i2, boolean z, boolean z2) {
        this.I0.a(z2 ? 1 : 0);
        a85 a85 = this.I0;
        a85.a = true;
        a85.f = true;
        a85.g = i2;
        this.H0 = this.H0.d(i, z);
        this.M0 = false;
        for (ae8 ae8 = this.D0.h; ae8 != null; ae8 = ae8.l) {
            for (m85 m85 : (m85[]) ae8.n.X) {
                if (m85 != null) {
                    m85.c(z);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i3 = this.H0.e;
        aie aie = this.s0;
        if (i3 == 3) {
            Y();
            aie.c(2);
        } else if (i3 == 2) {
            aie.c(2);
        }
    }

    public final void R(b3b b3b) {
        dk dkVar = this.z0;
        dkVar.u(b3b);
        b3b d = dkVar.d();
        n(d, d.a, true, true);
    }

    public final void S(int i) {
        this.O0 = i;
        lue lue = this.H0.a;
        fe8 fe8 = this.D0;
        fe8.f = i;
        if (!fe8.n(lue)) {
            H(true);
        }
        k(false);
    }

    public final void T(boolean z) {
        this.P0 = z;
        lue lue = this.H0.a;
        fe8 fe8 = this.D0;
        fe8.g = z;
        if (!fe8.n(lue)) {
            H(true);
        }
        k(false);
    }

    public final void U(cod cod) {
        this.I0.a(1);
        vk8 vk8 = this.E0;
        int size = ((ArrayList) vk8.b).size();
        if (cod.b.length != size) {
            cod = new cod(new Random(cod.a.nextLong())).a(size);
        }
        vk8.l = cod;
        l(vk8.e(), false);
    }

    public final void V(int i) {
        z2b z2b = this.H0;
        if (z2b.e != i) {
            if (i != 2) {
                this.Z0 = -9223372036854775807L;
            }
            this.H0 = z2b.f(i);
        }
    }

    public final boolean W() {
        z2b z2b = this.H0;
        return z2b.l && z2b.m == 0;
    }

    public final boolean X(lue lue, xj8 xj8) {
        if (xj8.a() || lue.q()) {
            return false;
        }
        int i = lue.h(xj8.a, this.w0).c;
        jue jue = this.v0;
        lue.o(i, jue);
        return jue.a() && jue.t0 && jue.Y != -9223372036854775807L;
    }

    public final void Y() {
        this.M0 = false;
        dk dkVar = this.z0;
        dkVar.c = true;
        ((fh8) dkVar.o).b();
        for (uj0 uj0 : this.a) {
            if (q(uj0)) {
                np8.f(uj0.Y == 1);
                uj0.Y = 2;
                uj0.q();
            }
        }
    }

    public final void Z(boolean z, boolean z2) {
        A(z || !this.Q0, false, true, false);
        this.I0.a(z2 ? 1 : 0);
        this.Y.b(true);
        V(1);
    }

    public final void a(x75 x75, int i) {
        this.I0.a(1);
        vk8 vk8 = this.E0;
        if (i == -1) {
            i = ((ArrayList) vk8.b).size();
        }
        l(vk8.a(i, x75.a, x75.b), false);
    }

    public final void a0() {
        int i;
        dk dkVar = this.z0;
        dkVar.c = false;
        fh8 fh8 = (fh8) dkVar.o;
        if (fh8.b) {
            fh8.a(fh8.t());
            fh8.b = false;
        }
        for (uj0 uj0 : this.a) {
            if (q(uj0) && (i = uj0.Y) == 2) {
                np8.f(i == 2);
                uj0.Y = 1;
                uj0.r();
            }
        }
    }

    public final void b(uj0 uj0) {
        if (q(uj0)) {
            dk dkVar = this.z0;
            if (uj0 == ((uj0) dkVar.Y)) {
                dkVar.Z = null;
                dkVar.Y = null;
                dkVar.b = true;
            }
            int i = uj0.Y;
            if (i == 2) {
                np8.f(i == 2);
                uj0.Y = 1;
                uj0.r();
            }
            np8.f(uj0.Y == 1);
            uj0.b.N();
            uj0.Y = 0;
            uj0.Z = null;
            uj0.s0 = null;
            uj0.v0 = false;
            uj0.m();
            this.T0--;
        }
    }

    public final void b0() {
        ae8 ae8 = this.D0.j;
        boolean z = this.N0 || (ae8 != null && ae8.a.a());
        z2b z2b = this.H0;
        if (z != z2b.g) {
            z2b z2b2 = r2;
            z2b z2b3 = new z2b(z2b.a, z2b.b, z2b.c, z2b.d, z2b.e, z2b.f, z, z2b.h, z2b.i, z2b.j, z2b.k, z2b.l, z2b.m, z2b.n, z2b.q, z2b.r, z2b.s, z2b.o, z2b.p);
            this.H0 = z2b2;
        }
    }

    public final void c(i6d i6d) {
        this.s0.a(9, (yd8) i6d).b();
    }

    public final void c0(l0f l0f) {
        m85[] m85Arr = (m85[]) l0f.X;
        ec4 ec4 = this.Y;
        int i = ec4.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                uj0[] uj0Arr = this.a;
                int i4 = 13107200;
                if (i2 < uj0Arr.length) {
                    if (m85Arr[i2] != null) {
                        switch (uj0Arr[i2].a) {
                            case ContentLengthStrategy.CHUNKED /*-2*/:
                                i4 = 0;
                                break;
                            case 0:
                                i4 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i4 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        ec4.j = i;
        ec4.a.c(i);
    }

    public final void d(yd8 yd8) {
        this.s0.a(8, yd8).b();
    }

    public final void d0() {
        float f;
        ae8 ae8 = this.D0.h;
        if (ae8 != null) {
            long n = ae8.d ? ae8.a.n() : -9223372036854775807L;
            if (n != -9223372036854775807L) {
                C(n);
                if (n != this.H0.s) {
                    z2b z2b = this.H0;
                    this.H0 = o(z2b.b, n, z2b.c, n, true, 5);
                }
            } else {
                dk dkVar = this.z0;
                boolean z = ae8 != this.D0.i;
                uj0 uj0 = (uj0) dkVar.Y;
                fh8 fh8 = (fh8) dkVar.o;
                if (uj0 == null || uj0.k() || (!((uj0) dkVar.Y).l() && (z || ((uj0) dkVar.Y).j()))) {
                    dkVar.b = true;
                    if (dkVar.c) {
                        fh8.b();
                    }
                } else {
                    l78 l78 = (l78) dkVar.Z;
                    l78.getClass();
                    long t = l78.t();
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
                    b3b d = l78.d();
                    if (!d.equals((b3b) fh8.Y)) {
                        fh8.u(d);
                        ((f85) dkVar.X).s0.a(16, d).b();
                    }
                }
                long t2 = dkVar.t();
                this.V0 = t2;
                long j = t2 - ae8.o;
                long j2 = this.H0.s;
                if (!this.A0.isEmpty() && !this.H0.b.a()) {
                    if (this.X0) {
                        this.X0 = false;
                    }
                    z2b z2b2 = this.H0;
                    z2b2.a.b(z2b2.b.a);
                    int min = Math.min(this.W0, this.A0.size());
                    if (min > 0) {
                        au1.r(this.A0.get(min - 1));
                    }
                    if (min < this.A0.size()) {
                        au1.r(this.A0.get(min));
                    }
                    this.W0 = min;
                }
                this.H0.s = j;
            }
            this.H0.q = this.D0.j.d();
            z2b z2b3 = this.H0;
            long j3 = z2b3.q;
            ae8 ae82 = this.D0.j;
            z2b3.r = ae82 == null ? 0 : Math.max(0, j3 - (this.V0 - ae82.o));
            z2b z2b4 = this.H0;
            if (z2b4.l && z2b4.e == 3 && X(z2b4.a, z2b4.b)) {
                z2b z2b5 = this.H0;
                if (z2b5.n.a == 1.0f) {
                    cc4 cc4 = this.F0;
                    long g = g(z2b5.a, z2b5.b.a, z2b5.s);
                    long j4 = this.H0.q;
                    ae8 ae83 = this.D0.j;
                    long max = ae83 == null ? 0 : Math.max(0, j4 - (this.V0 - ae83.o));
                    if (cc4.e == -9223372036854775807L) {
                        f = 1.0f;
                    } else {
                        long j5 = g - max;
                        long j6 = cc4.o;
                        if (j6 == -9223372036854775807L) {
                            cc4.o = j5;
                            cc4.p = 0;
                        } else {
                            float f2 = cc4.d;
                            float f3 = 1.0f - f2;
                            long max2 = Math.max(j5, (long) ((((float) j5) * f3) + (((float) j6) * f2)));
                            cc4.o = max2;
                            cc4.p = (long) ((f3 * ((float) Math.abs(j5 - max2))) + (f2 * ((float) cc4.p)));
                        }
                        if (cc4.n == -9223372036854775807L || SystemClock.elapsedRealtime() - cc4.n >= 1000) {
                            cc4.n = SystemClock.elapsedRealtime();
                            long j7 = (cc4.p * 3) + cc4.o;
                            if (cc4.j > j7) {
                                float D = (float) maf.D(1000);
                                cc4.j = pag.y(j7, cc4.g, cc4.j - (((long) ((cc4.m - 1.0f) * D)) + ((long) ((cc4.k - 1.0f) * D))));
                            } else {
                                long k = maf.k(g - ((long) (Math.max(0.0f, cc4.m - 1.0f) / 1.0E-7f)), cc4.j, j7);
                                cc4.j = k;
                                long j8 = cc4.i;
                                if (j8 != -9223372036854775807L && k > j8) {
                                    cc4.j = j8;
                                }
                            }
                            long j9 = g - cc4.j;
                            if (Math.abs(j9) < cc4.b) {
                                cc4.m = 1.0f;
                            } else {
                                cc4.m = maf.i((1.0E-7f * ((float) j9)) + 1.0f, cc4.l, cc4.k);
                            }
                            f = cc4.m;
                        } else {
                            f = cc4.m;
                        }
                    }
                    if (this.z0.d().a != f) {
                        this.z0.u(new b3b(f, this.H0.n.b));
                        n(this.H0.n, this.z0.d().a, false, false);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:326:0x051f, code lost:
        if (r8 >= r4.j) goto L_0x0525;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x02e3 A[EDGE_INSN: B:444:0x02e3->B:173:0x02e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r47 = this;
            r0 = r47
            rhe r1 = r0.B0
            r1.getClass()
            long r11 = android.os.SystemClock.uptimeMillis()
            z2b r1 = r0.H0
            lue r1 = r1.a
            boolean r1 = r1.q()
            r13 = -9223372036854775808
            r15 = 0
            r9 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0024
            vk8 r1 = r0.E0
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x002a
        L_0x0024:
            r16 = r11
            r11 = 1
            r12 = r6
            goto L_0x0373
        L_0x002a:
            fe8 r1 = r0.D0
            long r2 = r0.V0
            ae8 r1 = r1.j
            if (r1 == 0) goto L_0x004b
            ae8 r4 = r1.l
            if (r4 != 0) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = r15
        L_0x0039:
            defpackage.np8.f(r4)
            boolean r4 = r1.d
            if (r4 == 0) goto L_0x004b
            yd8 r4 = r1.a
            r16 = r11
            long r10 = r1.o
            long r2 = r2 - r10
            r4.t(r2)
            goto L_0x004d
        L_0x004b:
            r16 = r11
        L_0x004d:
            fe8 r1 = r0.D0
            ae8 r2 = r1.j
            if (r2 == 0) goto L_0x007b
            de8 r3 = r2.f
            boolean r3 = r3.i
            if (r3 != 0) goto L_0x0115
            boolean r3 = r2.d
            if (r3 == 0) goto L_0x0115
            boolean r3 = r2.e
            if (r3 == 0) goto L_0x006b
            yd8 r2 = r2.a
            long r2 = r2.r()
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0115
        L_0x006b:
            ae8 r2 = r1.j
            de8 r2 = r2.f
            long r2 = r2.e
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0115
            int r1 = r1.k
            r2 = 100
            if (r1 >= r2) goto L_0x0115
        L_0x007b:
            fe8 r1 = r0.D0
            long r2 = r0.V0
            z2b r4 = r0.H0
            ae8 r5 = r1.j
            if (r5 != 0) goto L_0x009c
            lue r2 = r4.a
            xj8 r3 = r4.b
            long r10 = r4.c
            long r4 = r4.s
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r10
            r23 = r4
            de8 r1 = r18.d(r19, r20, r21, r23)
            goto L_0x00a2
        L_0x009c:
            lue r4 = r4.a
            de8 r1 = r1.c(r4, r5, r2)
        L_0x00a2:
            if (r1 == 0) goto L_0x0115
            fe8 r2 = r0.D0
            uj0[] r3 = r0.c
            gz7 r4 = r0.o
            ec4 r5 = r0.Y
            n64 r5 = r5.a
            vk8 r8 = r0.E0
            l0f r10 = r0.X
            ae8 r11 = r2.j
            if (r11 != 0) goto L_0x00be
            r18 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r20 = r18
            goto L_0x00ca
        L_0x00be:
            long r6 = r11.o
            de8 r11 = r11.f
            long r12 = r11.e
            long r6 = r6 + r12
            long r11 = r1.b
            long r6 = r6 - r11
            r20 = r6
        L_0x00ca:
            ae8 r6 = new ae8
            r18 = r6
            r19 = r3
            r22 = r4
            r23 = r5
            r24 = r8
            r25 = r1
            r26 = r10
            r18.<init>(r19, r20, r22, r23, r24, r25, r26)
            ae8 r3 = r2.j
            if (r3 == 0) goto L_0x00ef
            ae8 r4 = r3.l
            if (r6 != r4) goto L_0x00e6
            goto L_0x00f3
        L_0x00e6:
            r3.b()
            r3.l = r6
            r3.c()
            goto L_0x00f3
        L_0x00ef:
            r2.h = r6
            r2.i = r6
        L_0x00f3:
            r2.l = r9
            r2.j = r6
            int r3 = r2.k
            r4 = 1
            int r3 = r3 + r4
            r2.k = r3
            r2.j()
            yd8 r2 = r6.a
            long r3 = r1.b
            r2.J(r0, r3)
            fe8 r2 = r0.D0
            ae8 r2 = r2.h
            if (r2 != r6) goto L_0x0112
            long r1 = r1.b
            r0.C(r1)
        L_0x0112:
            r0.k(r15)
        L_0x0115:
            boolean r1 = r0.N0
            if (r1 == 0) goto L_0x0123
            boolean r1 = r47.p()
            r0.N0 = r1
            r47.b0()
            goto L_0x0126
        L_0x0123:
            r47.s()
        L_0x0126:
            fe8 r1 = r0.D0
            ae8 r2 = r1.i
            if (r2 != 0) goto L_0x0133
        L_0x012c:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x026d
        L_0x0133:
            ae8 r3 = r2.l
            uj0[] r8 = r0.a
            if (r3 == 0) goto L_0x013d
            boolean r3 = r0.L0
            if (r3 == 0) goto L_0x0144
        L_0x013d:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0234
        L_0x0144:
            boolean r3 = r2.d
            if (r3 != 0) goto L_0x0149
            goto L_0x012c
        L_0x0149:
            r3 = r15
        L_0x014a:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x0180
            r4 = r8[r3]
            frc[] r5 = r2.c
            r5 = r5[r3]
            frc r6 = r4.Z
            if (r6 != r5) goto L_0x012c
            if (r5 == 0) goto L_0x017d
            boolean r5 = r4.j()
            if (r5 != 0) goto L_0x017d
            ae8 r5 = r2.l
            de8 r6 = r2.f
            boolean r6 = r6.f
            if (r6 == 0) goto L_0x012c
            boolean r6 = r5.d
            if (r6 == 0) goto L_0x012c
            boolean r6 = r4 instanceof defpackage.wpe
            if (r6 != 0) goto L_0x017d
            boolean r6 = r4 instanceof defpackage.q99
            if (r6 != 0) goto L_0x017d
            long r6 = r4.u0
            long r4 = r5.e()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x012c
        L_0x017d:
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0180:
            ae8 r3 = r2.l
            boolean r4 = r3.d
            if (r4 != 0) goto L_0x0191
            long r4 = r0.V0
            long r6 = r3.e()
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0191
            goto L_0x012c
        L_0x0191:
            l0f r10 = r2.n
            ae8 r3 = r1.i
            if (r3 == 0) goto L_0x019d
            ae8 r3 = r3.l
            if (r3 == 0) goto L_0x019d
            r3 = 1
            goto L_0x019e
        L_0x019d:
            r3 = r15
        L_0x019e:
            defpackage.np8.f(r3)
            ae8 r3 = r1.i
            ae8 r3 = r3.l
            r1.i = r3
            r1.j()
            ae8 r11 = r1.i
            l0f r13 = r11.n
            z2b r1 = r0.H0
            lue r4 = r1.a
            de8 r1 = r11.f
            xj8 r3 = r1.a
            de8 r1 = r2.f
            xj8 r5 = r1.a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r47
            r2 = r4
            r18 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.e0(r2, r3, r4, r5, r6)
            boolean r1 = r11.d
            if (r1 == 0) goto L_0x01ee
            yd8 r1 = r11.a
            long r1 = r1.n()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x01ee
            long r1 = r11.e()
            int r3 = r8.length
            r4 = r15
        L_0x01e0:
            if (r4 >= r3) goto L_0x026d
            r5 = r8[r4]
            frc r6 = r5.Z
            if (r6 == 0) goto L_0x01eb
            L(r5, r1)
        L_0x01eb:
            int r4 = r4 + 1
            goto L_0x01e0
        L_0x01ee:
            r1 = r15
        L_0x01ef:
            int r2 = r8.length
            if (r1 >= r2) goto L_0x026d
            boolean r2 = r10.I(r1)
            r3 = r18
            boolean r4 = r3.I(r1)
            if (r2 == 0) goto L_0x022f
            r2 = r8[r1]
            boolean r2 = r2.v0
            if (r2 != 0) goto L_0x022f
            uj0[] r2 = r0.c
            r2 = r2[r1]
            int r2 = r2.a
            r5 = -2
            if (r2 != r5) goto L_0x020f
            r2 = 1
            goto L_0x0210
        L_0x020f:
            r2 = r15
        L_0x0210:
            java.lang.Object r5 = r10.o
            kgc[] r5 = (defpackage.kgc[]) r5
            r5 = r5[r1]
            java.lang.Object r6 = r3.o
            kgc[] r6 = (defpackage.kgc[]) r6
            r6 = r6[r1]
            if (r4 == 0) goto L_0x0226
            boolean r4 = r6.equals(r5)
            if (r4 == 0) goto L_0x0226
            if (r2 == 0) goto L_0x022f
        L_0x0226:
            r2 = r8[r1]
            long r4 = r11.e()
            L(r2, r4)
        L_0x022f:
            int r1 = r1 + 1
            r18 = r3
            goto L_0x01ef
        L_0x0234:
            de8 r1 = r2.f
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x023e
            boolean r1 = r0.L0
            if (r1 == 0) goto L_0x026d
        L_0x023e:
            r1 = r15
        L_0x023f:
            int r3 = r8.length
            if (r1 >= r3) goto L_0x026d
            r3 = r8[r1]
            frc[] r4 = r2.c
            r4 = r4[r1]
            if (r4 == 0) goto L_0x026a
            frc r5 = r3.Z
            if (r5 != r4) goto L_0x026a
            boolean r4 = r3.j()
            if (r4 == 0) goto L_0x026a
            de8 r4 = r2.f
            long r4 = r4.e
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0266
            r6 = -9223372036854775808
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0266
            long r6 = r2.o
            long r6 = r6 + r4
            goto L_0x0267
        L_0x0266:
            r6 = r12
        L_0x0267:
            L(r3, r6)
        L_0x026a:
            int r1 = r1 + 1
            goto L_0x023f
        L_0x026d:
            fe8 r1 = r0.D0
            ae8 r2 = r1.i
            if (r2 == 0) goto L_0x02ee
            ae8 r1 = r1.h
            if (r1 == r2) goto L_0x02ee
            boolean r1 = r2.g
            if (r1 == 0) goto L_0x027d
            goto L_0x02ee
        L_0x027d:
            l0f r1 = r2.n
            r3 = r15
            r4 = r3
        L_0x0281:
            uj0[] r5 = r0.a
            int r6 = r5.length
            if (r4 >= r6) goto L_0x02e3
            r5 = r5[r4]
            boolean r6 = q(r5)
            if (r6 != 0) goto L_0x028f
            goto L_0x02e0
        L_0x028f:
            frc r6 = r5.Z
            frc[] r7 = r2.c
            r8 = r7[r4]
            if (r6 == r8) goto L_0x0299
            r6 = 1
            goto L_0x029a
        L_0x0299:
            r6 = r15
        L_0x029a:
            boolean r8 = r1.I(r4)
            if (r8 == 0) goto L_0x02a3
            if (r6 != 0) goto L_0x02a3
            goto L_0x02e0
        L_0x02a3:
            boolean r6 = r5.v0
            if (r6 != 0) goto L_0x02d5
            java.lang.Object r6 = r1.X
            m85[] r6 = (defpackage.m85[]) r6
            r6 = r6[r4]
            if (r6 == 0) goto L_0x02b4
            int r8 = r6.length()
            goto L_0x02b5
        L_0x02b4:
            r8 = r15
        L_0x02b5:
            oy5[] r10 = new defpackage.oy5[r8]
            r11 = r15
        L_0x02b8:
            if (r11 >= r8) goto L_0x02c3
            oy5 r18 = r6.d(r11)
            r10[r11] = r18
            int r11 = r11 + 1
            goto L_0x02b8
        L_0x02c3:
            r20 = r7[r4]
            long r21 = r2.e()
            long r6 = r2.o
            r18 = r5
            r19 = r10
            r23 = r6
            r18.x(r19, r20, r21, r23)
            goto L_0x02e0
        L_0x02d5:
            boolean r6 = r5.k()
            if (r6 == 0) goto L_0x02df
            r0.b(r5)
            goto L_0x02e0
        L_0x02df:
            r3 = 1
        L_0x02e0:
            int r4 = r4 + 1
            goto L_0x0281
        L_0x02e3:
            r4 = 1
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x02ee
            int r1 = r5.length
            boolean[] r1 = new boolean[r1]
            r0.f(r1)
        L_0x02ee:
            r14 = r15
        L_0x02ef:
            boolean r1 = r47.W()
            if (r1 != 0) goto L_0x02f7
            goto L_0x0372
        L_0x02f7:
            boolean r1 = r0.L0
            if (r1 == 0) goto L_0x02fd
            goto L_0x0372
        L_0x02fd:
            fe8 r1 = r0.D0
            ae8 r3 = r1.h
            if (r3 != 0) goto L_0x0305
            goto L_0x0372
        L_0x0305:
            ae8 r3 = r3.l
            if (r3 == 0) goto L_0x0372
            long r4 = r0.V0
            long r6 = r3.e()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0372
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0372
            if (r14 == 0) goto L_0x031c
            r47.t()
        L_0x031c:
            ae8 r1 = r1.a()
            r1.getClass()
            z2b r3 = r0.H0
            xj8 r3 = r3.b
            java.lang.Object r3 = r3.a
            de8 r4 = r1.f
            xj8 r4 = r4.a
            java.lang.Object r4 = r4.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x034e
            z2b r3 = r0.H0
            xj8 r3 = r3.b
            int r4 = r3.b
            r5 = -1
            if (r4 != r5) goto L_0x034e
            de8 r4 = r1.f
            xj8 r4 = r4.a
            int r6 = r4.b
            if (r6 != r5) goto L_0x034e
            int r3 = r3.e
            int r4 = r4.e
            if (r3 == r4) goto L_0x034e
            r14 = 1
            goto L_0x034f
        L_0x034e:
            r14 = r15
        L_0x034f:
            de8 r1 = r1.f
            xj8 r3 = r1.a
            long r7 = r1.b
            long r5 = r1.c
            r10 = 1
            r11 = r14 ^ 1
            r14 = 0
            r1 = r47
            r2 = r3
            r3 = r7
            r9 = r11
            r11 = r10
            r10 = r14
            z2b r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r0.H0 = r1
            r47.B()
            r47.d0()
            r14 = r11
            r9 = 0
            goto L_0x02ef
        L_0x0372:
            r11 = 1
        L_0x0373:
            z2b r1 = r0.H0
            int r1 = r1.e
            if (r1 == r11) goto L_0x06c3
            r3 = 4
            if (r1 != r3) goto L_0x037e
            goto L_0x06c3
        L_0x037e:
            fe8 r1 = r0.D0
            ae8 r1 = r1.h
            r4 = 10
            if (r1 != 0) goto L_0x038c
            r6 = r16
            r0.G(r6, r4)
            return
        L_0x038c:
            r6 = r16
            java.lang.String r8 = "doSomeWork"
            defpackage.j47.k(r8)
            r47.d0()
            boolean r8 = r1.d
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x0410
            long r16 = android.os.SystemClock.elapsedRealtime()
            long r4 = r16 * r9
            yd8 r8 = r1.a
            z2b r14 = r0.H0
            long r9 = r14.s
            long r2 = r0.x0
            long r9 = r9 - r2
            boolean r2 = r0.y0
            r8.s(r9, r2)
            r2 = r11
            r10 = r2
            r3 = r15
        L_0x03b3:
            uj0[] r8 = r0.a
            int r9 = r8.length
            if (r3 >= r9) goto L_0x0417
            r8 = r8[r3]
            boolean r9 = q(r8)
            if (r9 != 0) goto L_0x03c1
            goto L_0x040c
        L_0x03c1:
            long r14 = r0.V0
            r8.w(r14, r4)
            if (r10 == 0) goto L_0x03d0
            boolean r10 = r8.k()
            if (r10 == 0) goto L_0x03d0
            r10 = r11
            goto L_0x03d1
        L_0x03d0:
            r10 = 0
        L_0x03d1:
            frc[] r14 = r1.c
            r14 = r14[r3]
            frc r15 = r8.Z
            if (r14 == r15) goto L_0x03db
            r14 = r11
            goto L_0x03dc
        L_0x03db:
            r14 = 0
        L_0x03dc:
            if (r14 != 0) goto L_0x03e6
            boolean r15 = r8.j()
            if (r15 == 0) goto L_0x03e6
            r15 = r11
            goto L_0x03e7
        L_0x03e6:
            r15 = 0
        L_0x03e7:
            if (r14 != 0) goto L_0x03fa
            if (r15 != 0) goto L_0x03fa
            boolean r14 = r8.l()
            if (r14 != 0) goto L_0x03fa
            boolean r14 = r8.k()
            if (r14 == 0) goto L_0x03f8
            goto L_0x03fa
        L_0x03f8:
            r14 = 0
            goto L_0x03fb
        L_0x03fa:
            r14 = r11
        L_0x03fb:
            if (r2 == 0) goto L_0x0401
            if (r14 == 0) goto L_0x0401
            r2 = r11
            goto L_0x0402
        L_0x0401:
            r2 = 0
        L_0x0402:
            if (r14 != 0) goto L_0x040c
            frc r8 = r8.Z
            r8.getClass()
            r8.c()
        L_0x040c:
            int r3 = r3 + 1
            r15 = 0
            goto L_0x03b3
        L_0x0410:
            yd8 r2 = r1.a
            r2.k()
            r2 = r11
            r10 = r2
        L_0x0417:
            de8 r3 = r1.f
            long r3 = r3.e
            if (r10 == 0) goto L_0x042f
            boolean r5 = r1.d
            if (r5 == 0) goto L_0x042f
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x042d
            z2b r5 = r0.H0
            long r14 = r5.s
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x042f
        L_0x042d:
            r10 = r11
            goto L_0x0430
        L_0x042f:
            r10 = 0
        L_0x0430:
            if (r10 == 0) goto L_0x0441
            boolean r3 = r0.L0
            if (r3 == 0) goto L_0x0441
            r3 = 0
            r0.L0 = r3
            z2b r4 = r0.H0
            int r4 = r4.m
            r5 = 5
            r0.Q(r4, r5, r3, r3)
        L_0x0441:
            r3 = 3
            if (r10 == 0) goto L_0x0453
            de8 r4 = r1.f
            boolean r4 = r4.i
            if (r4 == 0) goto L_0x0453
            r4 = 4
            r0.V(r4)
            r47.a0()
            goto L_0x059a
        L_0x0453:
            z2b r4 = r0.H0
            int r5 = r4.e
            r8 = 2
            if (r5 != r8) goto L_0x0538
            int r5 = r0.T0
            if (r5 != 0) goto L_0x0465
            boolean r10 = r47.r()
            r4 = r10
            goto L_0x0526
        L_0x0465:
            if (r2 != 0) goto L_0x046a
        L_0x0467:
            r4 = 0
            goto L_0x0526
        L_0x046a:
            boolean r5 = r4.g
            if (r5 != 0) goto L_0x0471
            r4 = r11
            goto L_0x0526
        L_0x0471:
            lue r4 = r4.a
            fe8 r5 = r0.D0
            ae8 r8 = r5.h
            de8 r8 = r8.f
            xj8 r8 = r8.a
            boolean r4 = r0.X(r4, r8)
            if (r4 == 0) goto L_0x0486
            cc4 r4 = r0.F0
            long r9 = r4.j
            goto L_0x0487
        L_0x0486:
            r9 = r12
        L_0x0487:
            ae8 r4 = r5.j
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x04a5
            boolean r5 = r4.e
            if (r5 == 0) goto L_0x049d
            yd8 r5 = r4.a
            long r21 = r5.r()
            r23 = -9223372036854775808
            int r5 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r5 != 0) goto L_0x04a5
        L_0x049d:
            de8 r5 = r4.f
            boolean r5 = r5.i
            if (r5 == 0) goto L_0x04a5
            r5 = r11
            goto L_0x04a6
        L_0x04a5:
            r5 = 0
        L_0x04a6:
            de8 r15 = r4.f
            xj8 r15 = r15.a
            boolean r15 = r15.a()
            if (r15 == 0) goto L_0x04b6
            boolean r4 = r4.d
            if (r4 != 0) goto L_0x04b6
            r4 = r11
            goto L_0x04b7
        L_0x04b6:
            r4 = 0
        L_0x04b7:
            if (r5 != 0) goto L_0x0525
            if (r4 != 0) goto L_0x0525
            z2b r4 = r0.H0
            long r4 = r4.q
            fe8 r15 = r0.D0
            ae8 r15 = r15.j
            r22 = r9
            r8 = 0
            if (r15 != 0) goto L_0x04cb
            r4 = r8
            goto L_0x04d5
        L_0x04cb:
            long r11 = r0.V0
            long r14 = r15.o
            long r11 = r11 - r14
            long r4 = r4 - r11
            long r4 = java.lang.Math.max(r8, r4)
        L_0x04d5:
            dk r11 = r0.z0
            b3b r11 = r11.d()
            float r11 = r11.a
            boolean r12 = r0.M0
            ec4 r14 = r0.Y
            r14.getClass()
            long r4 = defpackage.maf.w(r11, r4)
            if (r12 == 0) goto L_0x04f2
            long r11 = r14.e
        L_0x04ec:
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x04f5
        L_0x04f2:
            long r11 = r14.d
            goto L_0x04ec
        L_0x04f5:
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 == 0) goto L_0x0504
            r24 = 2
            r26 = r14
            long r13 = r22 / r24
            long r11 = java.lang.Math.min(r13, r11)
            goto L_0x0506
        L_0x0504:
            r26 = r14
        L_0x0506:
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0525
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0525
            r4 = r26
            boolean r5 = r4.g
            if (r5 != 0) goto L_0x0467
            n64 r5 = r4.a
            monitor-enter(r5)
            int r8 = r5.e     // Catch:{ all -> 0x0522 }
            int r9 = r5.c     // Catch:{ all -> 0x0522 }
            int r8 = r8 * r9
            monitor-exit(r5)
            int r4 = r4.j
            if (r8 < r4) goto L_0x0467
            goto L_0x0525
        L_0x0522:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0522 }
            throw r0
        L_0x0525:
            r4 = 1
        L_0x0526:
            if (r4 == 0) goto L_0x0538
            r0.V(r3)
            r2 = 0
            r0.Y0 = r2
            boolean r2 = r47.W()
            if (r2 == 0) goto L_0x059a
            r47.Y()
            goto L_0x059a
        L_0x0538:
            z2b r4 = r0.H0
            int r4 = r4.e
            if (r4 != r3) goto L_0x059a
            int r4 = r0.T0
            if (r4 != 0) goto L_0x0549
            boolean r2 = r47.r()
            if (r2 == 0) goto L_0x054b
            goto L_0x059a
        L_0x0549:
            if (r2 != 0) goto L_0x059a
        L_0x054b:
            boolean r2 = r47.W()
            r0.M0 = r2
            r2 = 2
            r0.V(r2)
            boolean r2 = r0.M0
            if (r2 == 0) goto L_0x0597
            fe8 r2 = r0.D0
            ae8 r2 = r2.h
        L_0x055d:
            if (r2 == 0) goto L_0x0576
            l0f r4 = r2.n
            java.lang.Object r4 = r4.X
            m85[] r4 = (defpackage.m85[]) r4
            int r5 = r4.length
            r8 = 0
        L_0x0567:
            if (r8 >= r5) goto L_0x0573
            r9 = r4[r8]
            if (r9 == 0) goto L_0x0570
            r9.o()
        L_0x0570:
            int r8 = r8 + 1
            goto L_0x0567
        L_0x0573:
            ae8 r2 = r2.l
            goto L_0x055d
        L_0x0576:
            cc4 r2 = r0.F0
            long r4 = r2.j
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0584
            goto L_0x0597
        L_0x0584:
            long r11 = r2.c
            long r4 = r4 + r11
            r2.j = r4
            long r11 = r2.i
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0595
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0595
            r2.j = r11
        L_0x0595:
            r2.n = r8
        L_0x0597:
            r47.a0()
        L_0x059a:
            z2b r2 = r0.H0
            int r2 = r2.e
            r4 = 2
            if (r2 != r4) goto L_0x05db
            r2 = 0
        L_0x05a2:
            uj0[] r4 = r0.a
            int r5 = r4.length
            if (r2 >= r5) goto L_0x05c4
            r4 = r4[r2]
            boolean r4 = q(r4)
            if (r4 == 0) goto L_0x05c1
            uj0[] r4 = r0.a
            r4 = r4[r2]
            frc r4 = r4.Z
            frc[] r5 = r1.c
            r5 = r5[r2]
            if (r4 != r5) goto L_0x05c1
            r4.getClass()
            r4.c()
        L_0x05c1:
            int r2 = r2 + 1
            goto L_0x05a2
        L_0x05c4:
            z2b r1 = r0.H0
            boolean r2 = r1.g
            if (r2 != 0) goto L_0x05db
            long r1 = r1.r
            r4 = 500000(0x7a120, double:2.47033E-318)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x05db
            boolean r1 = r47.p()
            if (r1 == 0) goto L_0x05db
            r1 = 1
            goto L_0x05dc
        L_0x05db:
            r1 = 0
        L_0x05dc:
            if (r1 != 0) goto L_0x05e6
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.Z0 = r1
            goto L_0x060f
        L_0x05e6:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r4 = r0.Z0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x05fd
            rhe r1 = r0.B0
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.Z0 = r1
            goto L_0x060f
        L_0x05fd:
            rhe r1 = r0.B0
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.Z0
            long r1 = r1 - r4
            r4 = 4000(0xfa0, double:1.9763E-320)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x06bb
        L_0x060f:
            boolean r1 = r0.S0
            z2b r2 = r0.H0
            boolean r4 = r2.o
            if (r1 == r4) goto L_0x061d
            z2b r1 = r2.c(r1)
            r0.H0 = r1
        L_0x061d:
            boolean r1 = r47.W()
            if (r1 == 0) goto L_0x0629
            z2b r1 = r0.H0
            int r1 = r1.e
            if (r1 == r3) goto L_0x0630
        L_0x0629:
            z2b r1 = r0.H0
            int r1 = r1.e
            r2 = 2
            if (r1 != r2) goto L_0x0645
        L_0x0630:
            boolean r1 = r0.S0
            if (r1 == 0) goto L_0x063b
            boolean r1 = r0.R0
            if (r1 == 0) goto L_0x063b
            r1 = 1
            r10 = 0
            goto L_0x0642
        L_0x063b:
            r1 = 10
            r0.G(r6, r1)
            r1 = 1
            r10 = 1
        L_0x0642:
            r3 = r10 ^ 1
            goto L_0x065b
        L_0x0645:
            int r2 = r0.T0
            if (r2 == 0) goto L_0x0652
            r2 = 4
            if (r1 == r2) goto L_0x0652
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.G(r6, r1)
            goto L_0x065a
        L_0x0652:
            aie r1 = r0.s0
            android.os.Handler r1 = r1.a
            r2 = 2
            r1.removeMessages(r2)
        L_0x065a:
            r3 = 0
        L_0x065b:
            z2b r1 = r0.H0
            boolean r2 = r1.p
            if (r2 == r3) goto L_0x06b4
            z2b r2 = new z2b
            r22 = r2
            lue r4 = r1.a
            r23 = r4
            xj8 r4 = r1.b
            r24 = r4
            long r4 = r1.c
            r25 = r4
            long r4 = r1.d
            r27 = r4
            int r4 = r1.e
            r29 = r4
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f
            r30 = r4
            boolean r4 = r1.g
            r31 = r4
            sze r4 = r1.h
            r32 = r4
            l0f r4 = r1.i
            r33 = r4
            java.util.List r4 = r1.j
            r34 = r4
            xj8 r4 = r1.k
            r35 = r4
            boolean r4 = r1.l
            r36 = r4
            int r4 = r1.m
            r37 = r4
            b3b r4 = r1.n
            r38 = r4
            long r4 = r1.q
            r39 = r4
            long r4 = r1.r
            r41 = r4
            long r4 = r1.s
            r43 = r4
            boolean r1 = r1.o
            r45 = r1
            r46 = r3
            r22.<init>(r23, r24, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)
            r0.H0 = r2
        L_0x06b4:
            r1 = 0
            r0.R0 = r1
            defpackage.j47.A()
            return
        L_0x06bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x06c3:
            aie r0 = r0.s0
            android.os.Handler r0 = r0.a
            r1 = 2
            r0.removeMessages(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.e():void");
    }

    public final void e0(lue lue, xj8 xj8, lue lue2, xj8 xj82, long j) {
        if (!X(lue, xj8)) {
            b3b b3b = xj8.a() ? b3b.o : this.H0.n;
            dk dkVar = this.z0;
            if (!dkVar.d().equals(b3b)) {
                dkVar.u(b3b);
                return;
            }
            return;
        }
        Object obj = xj8.a;
        gue gue = this.w0;
        int i = lue.h(obj, gue).c;
        jue jue = this.v0;
        lue.o(i, jue);
        gb8 gb8 = jue.v0;
        int i2 = maf.a;
        cc4 cc4 = this.F0;
        cc4.getClass();
        cc4.e = maf.D(gb8.a);
        cc4.h = maf.D(gb8.b);
        cc4.i = maf.D(gb8.c);
        float f = gb8.o;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cc4.l = f;
        float f2 = gb8.X;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cc4.k = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cc4.e = -9223372036854775807L;
        }
        cc4.a();
        if (j != -9223372036854775807L) {
            cc4.f = g(lue, obj, j);
            cc4.a();
            return;
        }
        if (!maf.a(!lue2.q() ? lue2.n(lue2.h(xj82.a, gue).c, jue, 0).a : null, jue.a)) {
            cc4.f = -9223372036854775807L;
            cc4.a();
        }
    }

    public final void f(boolean[] zArr) {
        uj0[] uj0Arr;
        Set set;
        int i;
        uj0[] uj0Arr2;
        ae8 ae8;
        fe8 fe8;
        l78 l78;
        fe8 fe82 = this.D0;
        ae8 ae82 = fe82.i;
        l0f l0f = ae82.n;
        int i2 = 0;
        while (true) {
            uj0Arr = this.a;
            int length = uj0Arr.length;
            set = this.b;
            if (i2 >= length) {
                break;
            }
            if (!l0f.I(i2) && set.remove(uj0Arr[i2])) {
                uj0Arr[i2].y();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < uj0Arr.length) {
            if (l0f.I(i3)) {
                boolean z = zArr[i3];
                uj0 uj0 = uj0Arr[i3];
                if (!q(uj0)) {
                    ae8 ae83 = fe82.i;
                    boolean z2 = ae83 == fe82.h;
                    l0f l0f2 = ae83.n;
                    kgc kgc = ((kgc[]) l0f2.o)[i3];
                    m85 m85 = ((m85[]) l0f2.X)[i3];
                    int length2 = m85 != null ? m85.length() : 0;
                    oy5[] oy5Arr = new oy5[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        oy5Arr[i4] = m85.d(i4);
                    }
                    boolean z3 = W() && this.H0.e == 3;
                    boolean z4 = !z && z3;
                    this.T0++;
                    set.add(uj0);
                    frc frc = ae83.c[i3];
                    fe8 = fe82;
                    ae8 = ae82;
                    long j = this.V0;
                    long e = ae83.e();
                    i = i3;
                    uj0Arr2 = uj0Arr;
                    long j2 = ae83.o;
                    np8.f(uj0.Y == 0);
                    uj0.c = kgc;
                    uj0.Y = 1;
                    uj0.n(z4, z2);
                    uj0 uj02 = uj0;
                    uj0.x(oy5Arr, frc, e, j2);
                    uj02.v0 = false;
                    uj02.u0 = j;
                    uj02.o(j, z4);
                    uj02.a(11, new v75(this));
                    dk dkVar = this.z0;
                    dkVar.getClass();
                    l78 h = uj02.h();
                    if (!(h == null || h == (l78 = (l78) dkVar.Z))) {
                        if (l78 == null) {
                            dkVar.Z = h;
                            dkVar.Y = uj02;
                            ((u78) h).u((b3b) ((fh8) dkVar.o).Y);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z3) {
                        np8.f(uj02.Y == 1);
                        uj02.Y = 2;
                        uj02.q();
                    }
                    i3 = i + 1;
                    fe82 = fe8;
                    ae82 = ae8;
                    uj0Arr = uj0Arr2;
                }
            }
            fe8 = fe82;
            ae8 = ae82;
            i = i3;
            uj0Arr2 = uj0Arr;
            i3 = i + 1;
            fe82 = fe8;
            ae82 = ae8;
            uj0Arr = uj0Arr2;
        }
        ae82.g = true;
    }

    public final long g(lue lue, Object obj, long j) {
        gue gue = this.w0;
        int i = lue.h(obj, gue).c;
        jue jue = this.v0;
        lue.o(i, jue);
        if (jue.Y == -9223372036854775807L || !jue.a() || !jue.t0) {
            return -9223372036854775807L;
        }
        return maf.D(maf.t(jue.Z) - jue.Y) - (j + gue.X);
    }

    public final Pair h(lue lue) {
        long j = 0;
        if (lue.q()) {
            return Pair.create(z2b.t, 0L);
        }
        int a2 = lue.a(this.P0);
        lue lue2 = lue;
        Pair j2 = lue2.j(this.v0, this.w0, a2, -9223372036854775807L);
        xj8 m = this.D0.m(lue, j2.first, 0);
        long longValue = ((Long) j2.second).longValue();
        if (m.a()) {
            Object obj = m.a;
            gue gue = this.w0;
            lue.h(obj, gue);
            if (m.c == gue.e(m.b)) {
                j = gue.Z.b;
            }
            longValue = j;
        }
        return Pair.create(m, Long.valueOf(longValue));
    }

    public final boolean handleMessage(Message message) {
        ae8 ae8;
        int i;
        r4b r4b;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((d85) message.obj);
                    break;
                case 4:
                    R((b3b) message.obj);
                    break;
                case 5:
                    this.G0 = (w1d) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((yd8) message.obj);
                    break;
                case 9:
                    i((yd8) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case Protos.Attaches.Attach.PRESENT /*12*/:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    r4b = (r4b) message.obj;
                    r4b.getClass();
                    Looper looper = r4b.f;
                    Looper looper2 = this.u0;
                    aie aie = this.s0;
                    if (looper != looper2) {
                        aie.a(15, r4b).b();
                        break;
                    } else {
                        synchronized (r4b) {
                        }
                        r4b.a.a(r4b.d, r4b.e);
                        r4b.b(true);
                        int i3 = this.H0.e;
                        if (i3 == 3 || i3 == 2) {
                            aie.c(2);
                            break;
                        }
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    K((r4b) message.obj);
                    break;
                case 16:
                    b3b b3b = (b3b) message.obj;
                    n(b3b, b3b.a, true, false);
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    N((x75) message.obj);
                    break;
                case 18:
                    a((x75) message.obj, message.arg1);
                    break;
                case 19:
                    au1.r(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (cod) message.obj);
                    break;
                case 21:
                    U((cod) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    O(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.c == 1 && (ae8 = this.D0.i) != null) {
                e = e.a(ae8.f.a);
            }
            if (!e.t0 || this.Y0 != null) {
                ExoPlaybackException exoPlaybackException = this.Y0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.Y0;
                }
                fm9.c("Playback error", e);
                Z(true, false);
                this.H0 = this.H0.e(e);
            } else {
                fm9.c("Recoverable renderer error", e);
                this.Y0 = e;
                aie aie2 = this.s0;
                yhe a2 = aie2.a(25, e);
                aie2.getClass();
                Message message2 = a2.a;
                message2.getClass();
                aie2.a.sendMessageAtFrontOfQueue(message2);
                a2.a();
            }
        } catch (DrmSession$DrmSessionException e2) {
            j(e2.a, e2);
        } catch (ParserException e3) {
            boolean z = e3.a;
            int i4 = e3.b;
            if (i4 == 1) {
                i = z ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i = z ? 3002 : 3004;
                }
                j(i2, e3);
            }
            i2 = i;
            j(i2, e3);
        } catch (DataSourceException e4) {
            j(e4.a, e4);
        } catch (BehindLiveWindowException e5) {
            j(1002, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i2 = 1004;
            }
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, i2);
            fm9.c("Playback error", exoPlaybackException2);
            Z(true, false);
            this.H0 = this.H0.e(exoPlaybackException2);
        } catch (Throwable th) {
            r4b.b(true);
            throw th;
        }
        t();
        return true;
    }

    public final void i(yd8 yd8) {
        ae8 ae8 = this.D0.j;
        if (ae8 != null && ae8.a == yd8) {
            long j = this.V0;
            if (ae8 != null) {
                np8.f(ae8.l == null);
                if (ae8.d) {
                    ae8.a.t(j - ae8.o);
                }
            }
            s();
        }
    }

    public final void j(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        ae8 ae8 = this.D0.h;
        if (ae8 != null) {
            exoPlaybackException = exoPlaybackException.a(ae8.f.a);
        }
        fm9.c("Playback error", exoPlaybackException);
        Z(false, false);
        this.H0 = this.H0.e(exoPlaybackException);
    }

    public final void k(boolean z) {
        ae8 ae8 = this.D0.j;
        xj8 xj8 = ae8 == null ? this.H0.b : ae8.f.a;
        boolean z2 = !this.H0.k.equals(xj8);
        if (z2) {
            this.H0 = this.H0.a(xj8);
        }
        z2b z2b = this.H0;
        z2b.q = ae8 == null ? z2b.s : ae8.d();
        z2b z2b2 = this.H0;
        long j = z2b2.q;
        ae8 ae82 = this.D0.j;
        long j2 = 0;
        if (ae82 != null) {
            j2 = Math.max(0, j - (this.V0 - ae82.o));
        }
        z2b2.r = j2;
        if ((z2 || z) && ae8 != null && ae8.d) {
            c0(ae8.n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: d85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: d85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: jue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: d85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: jue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: jue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: gue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: gue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: d85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: d85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: d85} */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ee, code lost:
        if (r5.d(r6, r9) != 2) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f0, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fe, code lost:
        if (r5.g(r3.b) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02eb A[Catch:{ all -> 0x02f3, all -> 0x02f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0431  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.lue r38, boolean r39) {
        /*
            r37 = this;
            r11 = r37
            r12 = r38
            z2b r0 = r11.H0
            d85 r8 = r11.U0
            fe8 r9 = r11.D0
            int r4 = r11.O0
            boolean r10 = r11.P0
            jue r13 = r11.v0
            gue r14 = r11.w0
            boolean r1 = r38.q()
            r7 = 1
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x003d
            c85 r0 = new c85
            xj8 r19 = defpackage.z2b.t
            r25 = 1
            r26 = 0
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r7 = r0
            r24 = r5
            r8 = -1
            r11 = 4
            goto L_0x023d
        L_0x003d:
            xj8 r1 = r0.b
            java.lang.Object r15 = r1.a
            lue r2 = r0.a
            boolean r20 = r2.q()
            if (r20 != 0) goto L_0x0057
            java.lang.Object r3 = r1.a
            gue r2 = r2.h(r3, r14)
            boolean r2 = r2.Y
            if (r2 == 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r21 = 0
            goto L_0x0059
        L_0x0057:
            r21 = r7
        L_0x0059:
            xj8 r2 = r0.b
            boolean r2 = r2.a()
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
            if (r8 == 0) goto L_0x00c0
            r3 = 1
            r2 = r1
            r1 = r38
            r27 = r2
            r11 = 4
            r2 = r8
            r5 = r10
            r6 = r13
            r7 = r14
            android.util.Pair r1 = E(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x008a
            int r1 = r12.a(r10)
            r3 = r1
            r1 = r22
            r4 = 0
            r5 = 0
            r7 = 1
            goto L_0x00b2
        L_0x008a:
            long r2 = r8.c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x009c
            java.lang.Object r1 = r1.first
            gue r1 = r12.h(r1, r14)
            int r3 = r1.c
            r1 = r22
            r7 = 0
            goto L_0x00a8
        L_0x009c:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = -1
            r7 = 1
        L_0x00a8:
            int r4 = r0.e
            if (r4 != r11) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            r5 = r4
            r4 = r7
            r7 = 0
        L_0x00b2:
            r36 = r4
            r34 = r5
            r35 = r7
            r7 = r27
            r8 = -1
            r24 = 0
            r4 = r3
            goto L_0x0175
        L_0x00c0:
            r27 = r1
            r11 = 4
            lue r1 = r0.a
            boolean r1 = r1.q()
            if (r1 == 0) goto L_0x00df
            int r1 = r12.a(r10)
            r4 = r1
            r1 = r22
            r7 = r27
            r8 = -1
        L_0x00d5:
            r24 = 0
        L_0x00d7:
            r34 = 0
            r35 = 0
        L_0x00db:
            r36 = 0
            goto L_0x0175
        L_0x00df:
            int r1 = r12.b(r15)
            r8 = -1
            if (r1 != r8) goto L_0x010e
            lue r6 = r0.a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r38
            java.lang.Object r1 = F(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00fb
            int r1 = r12.a(r10)
            r7 = 1
            goto L_0x0102
        L_0x00fb:
            gue r1 = r12.h(r1, r14)
            int r1 = r1.c
            r7 = 0
        L_0x0102:
            r4 = r1
            r35 = r7
            r1 = r22
            r7 = r27
            r24 = 0
            r34 = 0
            goto L_0x00db
        L_0x010e:
            int r1 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x011e
            gue r1 = r12.h(r15, r14)
            int r1 = r1.c
            r4 = r1
            r1 = r22
            r7 = r27
            goto L_0x00d5
        L_0x011e:
            if (r21 == 0) goto L_0x016c
            lue r1 = r0.a
            r7 = r27
            java.lang.Object r2 = r7.a
            r1.h(r2, r14)
            lue r1 = r0.a
            int r2 = r14.c
            r5 = 0
            jue r1 = r1.n(r2, r13, r5)
            int r1 = r1.z0
            lue r2 = r0.a
            java.lang.Object r3 = r7.a
            int r2 = r2.b(r3)
            if (r1 != r2) goto L_0x0160
            long r1 = r14.X
            long r19 = r22 + r1
            gue r1 = r12.h(r15, r14)
            int r4 = r1.c
            r1 = r38
            r2 = r13
            r3 = r14
            r24 = r5
            r5 = r19
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0164
        L_0x0160:
            r24 = r5
            r1 = r22
        L_0x0164:
            r4 = r8
            r34 = 0
            r35 = 0
            r36 = 1
            goto L_0x0175
        L_0x016c:
            r7 = r27
            r24 = 0
            r4 = r8
            r1 = r22
            goto L_0x00d7
        L_0x0175:
            if (r4 == r8) goto L_0x0191
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r38
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r32 = r16
            goto L_0x0193
        L_0x0191:
            r32 = r1
        L_0x0193:
            xj8 r3 = r9.m(r12, r15, r1)
            int r4 = r3.e
            if (r4 == r8) goto L_0x01a4
            int r5 = r7.e
            if (r5 == r8) goto L_0x01a2
            if (r4 < r5) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r4 = 0
            goto L_0x01a5
        L_0x01a4:
            r4 = 1
        L_0x01a5:
            java.lang.Object r5 = r7.a
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x01bd
            boolean r5 = r7.a()
            if (r5 != 0) goto L_0x01bd
            boolean r5 = r3.a()
            if (r5 != 0) goto L_0x01bd
            if (r4 == 0) goto L_0x01bd
            r4 = 1
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            gue r5 = r12.h(r15, r14)
            if (r21 != 0) goto L_0x0201
            int r6 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r6 != 0) goto L_0x0201
            java.lang.Object r6 = r7.a
            java.lang.Object r9 = r3.a
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x01d3
            goto L_0x0201
        L_0x01d3:
            boolean r6 = r7.a()
            if (r6 == 0) goto L_0x01f2
            int r6 = r7.b
            boolean r9 = r5.g(r6)
            if (r9 == 0) goto L_0x01f2
            int r9 = r7.c
            int r10 = r5.d(r6, r9)
            if (r10 == r11) goto L_0x0201
            int r5 = r5.d(r6, r9)
            r6 = 2
            if (r5 == r6) goto L_0x0201
        L_0x01f0:
            r5 = 1
            goto L_0x0202
        L_0x01f2:
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x0201
            int r6 = r3.b
            boolean r5 = r5.g(r6)
            if (r5 == 0) goto L_0x0201
            goto L_0x01f0
        L_0x0201:
            r5 = 0
        L_0x0202:
            if (r4 != 0) goto L_0x0206
            if (r5 == 0) goto L_0x0207
        L_0x0206:
            r3 = r7
        L_0x0207:
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0231
            boolean r1 = r3.equals(r7)
            if (r1 == 0) goto L_0x0218
            long r0 = r0.s
            r30 = r0
            goto L_0x0233
        L_0x0218:
            java.lang.Object r0 = r3.a
            r12.h(r0, r14)
            int r0 = r3.c
            int r1 = r3.b
            int r1 = r14.e(r1)
            if (r0 != r1) goto L_0x022c
            r8 r0 = r14.Z
            long r5 = r0.b
            goto L_0x022e
        L_0x022c:
            r5 = r24
        L_0x022e:
            r30 = r5
            goto L_0x0233
        L_0x0231:
            r30 = r1
        L_0x0233:
            c85 r0 = new c85
            r28 = r0
            r29 = r3
            r28.<init>(r29, r30, r32, r34, r35, r36)
            r7 = r0
        L_0x023d:
            java.lang.Object r0 = r7.f
            r9 = r0
            xj8 r9 = (defpackage.xj8) r9
            long r13 = r7.b
            boolean r6 = r7.c
            long r3 = r7.a
            r10 = r11
            r11 = r37
            z2b r0 = r11.H0
            xj8 r0 = r0.b
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0260
            z2b r0 = r11.H0
            long r0 = r0.s
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r15 = 0
            goto L_0x0261
        L_0x0260:
            r15 = 1
        L_0x0261:
            r19 = 3
            boolean r0 = r7.d     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x0282
            z2b r0 = r11.H0     // Catch:{ all -> 0x027f }
            int r0 = r0.e     // Catch:{ all -> 0x027f }
            r2 = 1
            if (r0 == r2) goto L_0x0271
            r11.V(r10)     // Catch:{ all -> 0x0273 }
        L_0x0271:
            r1 = 0
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
        L_0x0274:
            r8 = r2
            r24 = r13
        L_0x0277:
            r10 = 0
            r13 = r3
            goto L_0x03ba
        L_0x027b:
            r11.A(r1, r1, r1, r2)     // Catch:{ all -> 0x0273 }
            goto L_0x0283
        L_0x027f:
            r0 = move-exception
            r2 = 1
            goto L_0x0274
        L_0x0282:
            r2 = 1
        L_0x0283:
            if (r15 != 0) goto L_0x02f7
            fe8 r1 = r11.D0     // Catch:{ all -> 0x0273 }
            long r5 = r11.V0     // Catch:{ all -> 0x0273 }
            ae8 r0 = r1.i     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0294
            r21 = r3
            r26 = r24
        L_0x0291:
            r24 = r13
            goto L_0x02dc
        L_0x0294:
            r21 = r3
            long r2 = r0.o     // Catch:{ all -> 0x02f3 }
            boolean r4 = r0.d     // Catch:{ all -> 0x02f3 }
            if (r4 != 0) goto L_0x029f
            r26 = r2
            goto L_0x0291
        L_0x029f:
            r4 = 0
        L_0x02a0:
            uj0[] r10 = r11.a     // Catch:{ all -> 0x02f3 }
            int r8 = r10.length     // Catch:{ all -> 0x02f3 }
            if (r4 >= r8) goto L_0x02d8
            r8 = r10[r4]     // Catch:{ all -> 0x02f3 }
            boolean r8 = q(r8)     // Catch:{ all -> 0x02f3 }
            if (r8 == 0) goto L_0x02ca
            r8 = r10[r4]     // Catch:{ all -> 0x02f3 }
            frc r10 = r8.Z     // Catch:{ all -> 0x02f3 }
            r24 = r13
            frc[] r13 = r0.c     // Catch:{ all -> 0x02c8 }
            r13 = r13[r4]     // Catch:{ all -> 0x02c8 }
            if (r10 == r13) goto L_0x02ba
            goto L_0x02cc
        L_0x02ba:
            long r13 = r8.u0     // Catch:{ all -> 0x02c8 }
            r26 = -9223372036854775808
            int r8 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r8 != 0) goto L_0x02c3
            goto L_0x02dc
        L_0x02c3:
            long r2 = java.lang.Math.max(r13, r2)     // Catch:{ all -> 0x02c8 }
            goto L_0x02cc
        L_0x02c8:
            r0 = move-exception
            goto L_0x02d2
        L_0x02ca:
            r24 = r13
        L_0x02cc:
            int r4 = r4 + 1
            r13 = r24
            r8 = -1
            goto L_0x02a0
        L_0x02d2:
            r13 = r21
            r8 = 1
            r10 = 0
            goto L_0x03ba
        L_0x02d8:
            r24 = r13
            r26 = r2
        L_0x02dc:
            r8 = 1
            r2 = r38
            r13 = r21
            r3 = r5
            r10 = 0
            r5 = r26
            boolean r0 = r1.o(r2, r3, r5)     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x0336
            r1 = 0
            r11.H(r1)     // Catch:{ all -> 0x02f0 }
            goto L_0x0336
        L_0x02f0:
            r0 = move-exception
            goto L_0x03ba
        L_0x02f3:
            r0 = move-exception
            r24 = r13
            goto L_0x02d2
        L_0x02f7:
            r8 = r2
            r24 = r13
            r10 = 0
            r13 = r3
            boolean r0 = r38.q()     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x0336
            fe8 r0 = r11.D0     // Catch:{ all -> 0x02f0 }
            ae8 r0 = r0.h     // Catch:{ all -> 0x02f0 }
        L_0x0306:
            if (r0 == 0) goto L_0x0322
            de8 r1 = r0.f     // Catch:{ all -> 0x02f0 }
            xj8 r1 = r1.a     // Catch:{ all -> 0x02f0 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x02f0 }
            if (r1 == 0) goto L_0x031f
            fe8 r1 = r11.D0     // Catch:{ all -> 0x02f0 }
            de8 r2 = r0.f     // Catch:{ all -> 0x02f0 }
            de8 r1 = r1.g(r12, r2)     // Catch:{ all -> 0x02f0 }
            r0.f = r1     // Catch:{ all -> 0x02f0 }
            r0.h()     // Catch:{ all -> 0x02f0 }
        L_0x031f:
            ae8 r0 = r0.l     // Catch:{ all -> 0x02f0 }
            goto L_0x0306
        L_0x0322:
            fe8 r0 = r11.D0     // Catch:{ all -> 0x02f0 }
            ae8 r1 = r0.h     // Catch:{ all -> 0x02f0 }
            ae8 r0 = r0.i     // Catch:{ all -> 0x02f0 }
            if (r1 == r0) goto L_0x032c
            r5 = r8
            goto L_0x032d
        L_0x032c:
            r5 = 0
        L_0x032d:
            r1 = r37
            r2 = r9
            r3 = r13
            long r0 = r1.J(r2, r3, r5, r6)     // Catch:{ all -> 0x02f0 }
            r13 = r0
        L_0x0336:
            z2b r0 = r11.H0
            lue r4 = r0.a
            xj8 r5 = r0.b
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0342
            r6 = r13
            goto L_0x0344
        L_0x0342:
            r6 = r16
        L_0x0344:
            r1 = r37
            r2 = r38
            r3 = r9
            r1.e0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x0359
            z2b r0 = r11.H0
            long r0 = r0.c
            int r0 = (r24 > r0 ? 1 : (r24 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0357
            goto L_0x0359
        L_0x0357:
            r13 = r10
            goto L_0x0395
        L_0x0359:
            z2b r0 = r11.H0
            xj8 r1 = r0.b
            java.lang.Object r1 = r1.a
            lue r0 = r0.a
            if (r15 == 0) goto L_0x0377
            if (r39 == 0) goto L_0x0377
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x0377
            gue r2 = r11.w0
            gue r0 = r0.h(r1, r2)
            boolean r0 = r0.Y
            if (r0 != 0) goto L_0x0377
            r0 = r8
            goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            z2b r2 = r11.H0
            long r7 = r2.d
            int r1 = r12.b(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0385
            r19 = 4
        L_0x0385:
            r1 = r37
            r2 = r9
            r3 = r13
            r5 = r24
            r9 = r0
            r13 = r10
            r10 = r19
            z2b r0 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.H0 = r0
        L_0x0395:
            r37.B()
            z2b r0 = r11.H0
            lue r0 = r0.a
            r11.D(r12, r0)
            z2b r0 = r11.H0
            z2b r0 = r0.g(r12)
            r11.H0 = r0
            boolean r0 = r38.q()
            if (r0 != 0) goto L_0x03af
            r11.U0 = r13
        L_0x03af:
            r1 = 0
            r11.k(r1)
            return
        L_0x03b4:
            r0 = move-exception
            r24 = r13
            r8 = 1
            goto L_0x0277
        L_0x03ba:
            z2b r1 = r11.H0
            lue r4 = r1.a
            xj8 r5 = r1.b
            boolean r1 = r7.e
            if (r1 == 0) goto L_0x03c6
            r6 = r13
            goto L_0x03c8
        L_0x03c6:
            r6 = r16
        L_0x03c8:
            r1 = r37
            r2 = r38
            r3 = r9
            r1.e0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x03dd
            z2b r1 = r11.H0
            long r1 = r1.c
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x03db
            goto L_0x03dd
        L_0x03db:
            r13 = r10
            goto L_0x0419
        L_0x03dd:
            z2b r1 = r11.H0
            xj8 r2 = r1.b
            java.lang.Object r2 = r2.a
            lue r1 = r1.a
            if (r15 == 0) goto L_0x03fb
            if (r39 == 0) goto L_0x03fb
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x03fb
            gue r3 = r11.w0
            gue r1 = r1.h(r2, r3)
            boolean r1 = r1.Y
            if (r1 != 0) goto L_0x03fb
            r15 = r8
            goto L_0x03fc
        L_0x03fb:
            r15 = 0
        L_0x03fc:
            z2b r1 = r11.H0
            long r7 = r1.d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0409
            r19 = 4
        L_0x0409:
            r1 = r37
            r2 = r9
            r3 = r13
            r5 = r24
            r9 = r15
            r13 = r10
            r10 = r19
            z2b r1 = r1.o(r2, r3, r5, r7, r9, r10)
            r11.H0 = r1
        L_0x0419:
            r37.B()
            z2b r1 = r11.H0
            lue r1 = r1.a
            r11.D(r12, r1)
            z2b r1 = r11.H0
            z2b r1 = r1.g(r12)
            r11.H0 = r1
            boolean r1 = r38.q()
            if (r1 != 0) goto L_0x0433
            r11.U0 = r13
        L_0x0433:
            r1 = 0
            r11.k(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.l(lue, boolean):void");
    }

    public final void m(yd8 yd8) {
        fe8 fe8 = this.D0;
        ae8 ae8 = fe8.j;
        if (ae8 != null && ae8.a == yd8) {
            float f = this.z0.d().a;
            lue lue = this.H0.a;
            ae8.d = true;
            ae8.m = ae8.a.q();
            l0f g = ae8.g(f, lue);
            de8 de8 = ae8.f;
            long j = de8.b;
            long j2 = de8.e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a2 = ae8.a(g, j, false, new boolean[ae8.i.length]);
            long j3 = ae8.o;
            de8 de82 = ae8.f;
            ae8.o = (de82.b - a2) + j3;
            ae8.f = de82.b(a2);
            c0(ae8.n);
            if (ae8 == fe8.h) {
                C(ae8.f.b);
                f(new boolean[this.a.length]);
                z2b z2b = this.H0;
                xj8 xj8 = z2b.b;
                long j4 = ae8.f.b;
                this.H0 = o(xj8, j4, z2b.c, j4, false, 5);
            }
            s();
        }
    }

    public final void n(b3b b3b, float f, boolean z, boolean z2) {
        int i;
        f85 f85 = this;
        b3b b3b2 = b3b;
        if (z) {
            if (z2) {
                f85.I0.a(1);
            }
            z2b z2b = f85.H0;
            z2b z2b2 = z2b;
            lue lue = z2b.a;
            z2b z2b3 = new z2b(lue, z2b.b, z2b.c, z2b.d, z2b.e, z2b.f, z2b.g, z2b.h, z2b.i, z2b.j, z2b.k, z2b2.l, z2b2.m, b3b, z2b2.q, z2b2.r, z2b2.s, z2b2.o, z2b2.p);
            f85 = this;
            f85.H0 = z2b3;
        }
        b3b b3b3 = b3b;
        float f2 = b3b3.a;
        ae8 ae8 = f85.D0.h;
        while (true) {
            i = 0;
            if (ae8 == null) {
                break;
            }
            m85[] m85Arr = (m85[]) ae8.n.X;
            int length = m85Arr.length;
            while (i < length) {
                m85 m85 = m85Arr[i];
                if (m85 != null) {
                    m85.l(f2);
                }
                i++;
            }
            ae8 = ae8.l;
        }
        uj0[] uj0Arr = f85.a;
        int length2 = uj0Arr.length;
        while (i < length2) {
            uj0 uj0 = uj0Arr[i];
            if (uj0 != null) {
                uj0.z(f, b3b3.a);
            } else {
                float f3 = f;
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: ffc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: ffc} */
    /* JADX WARNING: type inference failed for: r11v5, types: [ww6, pw6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.z2b o(defpackage.xj8 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r20
            r2 = r25
            boolean r3 = r0.X0
            r6 = 0
            if (r3 != 0) goto L_0x0022
            z2b r3 = r0.H0
            long r8 = r3.s
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            z2b r3 = r0.H0
            xj8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r6
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            r0.X0 = r3
            r16.B()
            z2b r3 = r0.H0
            sze r8 = r3.h
            l0f r9 = r3.i
            java.util.List r10 = r3.j
            vk8 r11 = r0.E0
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x0096
            fe8 r3 = r0.D0
            ae8 r3 = r3.h
            if (r3 != 0) goto L_0x003f
            sze r8 = defpackage.sze.o
            goto L_0x0041
        L_0x003f:
            sze r8 = r3.m
        L_0x0041:
            if (r3 != 0) goto L_0x0046
            l0f r9 = r0.X
            goto L_0x0048
        L_0x0046:
            l0f r9 = r3.n
        L_0x0048:
            java.lang.Object r10 = r9.X
            m85[] r10 = (defpackage.m85[]) r10
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
            oy5 r15 = r15.d(r6)
            e99 r15 = r15.u0
            if (r15 != 0) goto L_0x006e
            e99 r15 = new e99
            c99[] r7 = new defpackage.c99[r6]
            r15.<init>((defpackage.c99[]) r7)
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
            de8 r10 = r3.f
            long r11 = r10.c
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            de8 r10 = r10.a(r4)
            r3.f = r10
        L_0x0092:
            r12 = r7
            r10 = r8
            r11 = r9
            goto L_0x00ab
        L_0x0096:
            xj8 r3 = r3.b
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00a8
            sze r3 = defpackage.sze.o
            l0f r7 = r0.X
            ffc r8 = defpackage.ffc.X
            r10 = r3
            r11 = r7
            r12 = r8
            goto L_0x00ab
        L_0x00a8:
            r11 = r9
            r12 = r10
            r10 = r8
        L_0x00ab:
            if (r24 == 0) goto L_0x00c6
            a85 r3 = r0.I0
            boolean r7 = r3.d
            if (r7 == 0) goto L_0x00bf
            int r7 = r3.e
            r8 = 5
            if (r7 == r8) goto L_0x00bf
            if (r2 != r8) goto L_0x00bb
            r6 = 1
        L_0x00bb:
            defpackage.np8.d(r6)
            goto L_0x00c6
        L_0x00bf:
            r6 = 1
            r3.a = r6
            r3.d = r6
            r3.e = r2
        L_0x00c6:
            z2b r2 = r0.H0
            long r6 = r2.q
            fe8 r3 = r0.D0
            ae8 r3 = r3.j
            if (r3 != 0) goto L_0x00d3
            r8 = 0
            goto L_0x00e0
        L_0x00d3:
            long r13 = r0.V0
            long r8 = r3.o
            long r13 = r13 - r8
            long r6 = r6 - r13
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r8 = r6
        L_0x00e0:
            r0 = r2
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            z2b r0 = r0.b(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.o(xj8, long, long, long, boolean, int):z2b");
    }

    public final boolean p() {
        ae8 ae8 = this.D0.j;
        if (ae8 == null) {
            return false;
        }
        return (!ae8.d ? 0 : ae8.a.f()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        ae8 ae8 = this.D0.h;
        long j = ae8.f.e;
        return ae8.d && (j == -9223372036854775807L || this.H0.s < j || !W());
    }

    public final void s() {
        boolean z;
        int i;
        boolean p = p();
        fe8 fe8 = this.D0;
        boolean z2 = true;
        if (!p) {
            z = false;
        } else {
            ae8 ae8 = fe8.j;
            long j = 0;
            long f = !ae8.d ? 0 : ae8.a.f();
            ae8 ae82 = this.D0.j;
            if (ae82 != null) {
                j = Math.max(0, f - (this.V0 - ae82.o));
            }
            if (ae8 != fe8.h) {
                long j2 = ae8.f.b;
            }
            float f2 = this.z0.d().a;
            ec4 ec4 = this.Y;
            n64 n64 = ec4.a;
            synchronized (n64) {
                i = n64.e * n64.c;
            }
            boolean z3 = i >= ec4.j;
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            long j3 = ec4.c;
            long j4 = ec4.b;
            if (i2 > 0) {
                j4 = Math.min(maf.s(f2, j4), j3);
            }
            if (j < Math.max(j4, 500000)) {
                ec4.k = ec4.g || !z3;
            } else if (j >= j3 || z3) {
                ec4.k = false;
            }
            z = ec4.k;
        }
        this.N0 = z;
        if (z) {
            ae8 ae83 = fe8.j;
            long j5 = this.V0;
            if (ae83.l != null) {
                z2 = false;
            }
            np8.f(z2);
            ae83.a.C(j5 - ae83.o);
        }
        b0();
    }

    public final void t() {
        a85 a85 = this.I0;
        z2b z2b = this.H0;
        boolean z = a85.a | (a85.b != z2b);
        a85.a = z;
        a85.b = z2b;
        if (z) {
            t75 t75 = this.C0.a;
            t75.u0.a.post(new kl4((Object) t75, 19, (Object) a85));
            this.I0 = new a85(this.H0);
        }
    }

    public final void u() {
        l(this.E0.e(), true);
    }

    public final void v() {
        this.I0.a(1);
        throw null;
    }

    public final void w() {
        this.I0.a(1);
        int i = 0;
        A(false, false, false, true);
        this.Y.b(false);
        V(this.H0.a.q() ? 4 : 2);
        h84 h84 = (h84) this.Z;
        h84.getClass();
        vk8 vk8 = this.E0;
        np8.f(!vk8.g);
        vk8.m = h84;
        while (true) {
            ArrayList arrayList = (ArrayList) vk8.b;
            if (i < arrayList.size()) {
                sk8 sk8 = (sk8) arrayList.get(i);
                vk8.k(sk8);
                ((HashSet) vk8.f).add(sk8);
                i++;
            } else {
                vk8.g = true;
                this.s0.c(2);
                return;
            }
        }
    }

    public final void x() {
        A(true, false, true, false);
        this.Y.b(true);
        V(1);
        this.t0.quit();
        synchronized (this) {
            this.J0 = true;
            notifyAll();
        }
    }

    public final void y(int i, int i2, cod cod) {
        boolean z = true;
        this.I0.a(1);
        vk8 vk8 = this.E0;
        vk8.getClass();
        if (i < 0 || i > i2 || i2 > ((ArrayList) vk8.b).size()) {
            z = false;
        }
        np8.d(z);
        vk8.l = cod;
        vk8.p(i, i2);
        l(vk8.e(), false);
    }

    public final void z() {
        float f = this.z0.d().a;
        fe8 fe8 = this.D0;
        ae8 ae8 = fe8.h;
        ae8 ae82 = fe8.i;
        ae8 ae83 = ae8;
        boolean z = true;
        while (ae83 != null && ae83.d) {
            l0f g = ae83.g(f, this.H0.a);
            l0f l0f = ae83.n;
            if (l0f != null) {
                int length = ((m85[]) l0f.X).length;
                m85[] m85Arr = (m85[]) g.X;
                if (length == m85Arr.length) {
                    int i = 0;
                    while (i < m85Arr.length) {
                        if (g.F(l0f, i)) {
                            i++;
                        }
                    }
                    if (ae83 == ae82) {
                        z = false;
                    }
                    ae83 = ae83.l;
                }
            }
            if (z) {
                fe8 fe82 = this.D0;
                ae8 ae84 = fe82.h;
                boolean k = fe82.k(ae84);
                boolean[] zArr = new boolean[this.a.length];
                long a2 = ae84.a(g, this.H0.s, k, zArr);
                z2b z2b = this.H0;
                boolean z2 = (z2b.e == 4 || a2 == z2b.s) ? false : true;
                z2b z2b2 = this.H0;
                ae8 ae85 = ae84;
                boolean[] zArr2 = zArr;
                this.H0 = o(z2b2.b, a2, z2b2.c, z2b2.d, z2, 5);
                if (z2) {
                    C(a2);
                }
                boolean[] zArr3 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    uj0[] uj0Arr = this.a;
                    if (i2 >= uj0Arr.length) {
                        break;
                    }
                    uj0 uj0 = uj0Arr[i2];
                    boolean q = q(uj0);
                    zArr3[i2] = q;
                    frc frc = ae85.c[i2];
                    if (q) {
                        if (frc != uj0.Z) {
                            b(uj0);
                        } else if (zArr2[i2]) {
                            long j = this.V0;
                            uj0.v0 = false;
                            uj0.u0 = j;
                            uj0.o(j, false);
                            i2++;
                        }
                    }
                    i2++;
                }
                f(zArr3);
            } else {
                this.D0.k(ae83);
                if (ae83.d) {
                    ae83.a(g, Math.max(ae83.f.b, this.V0 - ae83.o), false, new boolean[ae83.i.length]);
                }
            }
            k(true);
            if (this.H0.e != 4) {
                s();
                d0();
                this.s0.c(2);
                return;
            }
            return;
        }
    }
}
