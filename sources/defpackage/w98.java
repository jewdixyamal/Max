package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: w98  reason: default package */
public class w98 implements z88 {
    public k4b A;
    public final a98 a;
    public final cd6 b;
    public final ga8 c;
    public final Context d;
    public final obd e;
    public final Bundle f;
    public final p98 g;
    public final pm7 h;
    public final va8 i;
    public final xs j;
    public obd k;
    public v98 l;
    public boolean m;
    public m4b n = m4b.F;
    public zw6 o;
    public ffc p;
    public z9d q = z9d.b;
    public k3b r;
    public k3b s;
    public k3b t;
    public Surface u;
    public lsd v = lsd.c;
    public qr6 w;
    public long x;
    public long y;
    public m4b z;

    public w98(Context context, a98 a98, obd obd, Bundle bundle, Looper looper) {
        ffc ffc = ffc.X;
        this.o = ffc;
        this.p = ffc;
        k3b k3b = k3b.b;
        this.r = k3b;
        this.s = k3b;
        this.t = i(k3b, k3b);
        this.h = new pm7(looper, she.a, new k98(this, 6));
        this.a = a98;
        fm9.i(context, "context must not be null");
        fm9.i(obd, "token must not be null");
        this.d = context;
        this.b = new cd6();
        this.c = new ga8(this);
        this.j = new xs(0);
        this.e = obd;
        this.f = bundle;
        this.g = new p98(this);
        Bundle bundle2 = Bundle.EMPTY;
        this.l = obd.a.getType() == 0 ? null : new v98(this, bundle);
        this.i = new va8(this, looper);
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
    }

    public static int P(m4b m4b) {
        int i2 = m4b.c.a.b;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static m4b W(m4b m4b, int i2, List list, long j2, long j3) {
        int i3;
        int i4;
        m4b m4b2 = m4b;
        int i5 = i2;
        mue mue = m4b2.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < mue.p(); i6++) {
            arrayList.add(mue.n(i6, new kue(), 0));
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            kue kue = r9;
            kue kue2 = new kue();
            kue.b(0, (tb8) list.get(i7), (Object) null, 0, 0, 0, true, false, (hb8) null, 0, -9223372036854775807L, -1, -1, 0);
            arrayList.add(i7 + i5, kue2);
        }
        List list2 = list;
        X0(mue, arrayList, arrayList2);
        iue j4 = j(arrayList, arrayList2);
        if (m4b2.j.q()) {
            i4 = 0;
            i3 = 0;
        } else {
            qad qad = m4b2.c;
            i3 = qad.a.b;
            if (i3 >= i5) {
                i3 += list.size();
            }
            i4 = qad.a.e;
            if (i4 >= i5) {
                i4 += list.size();
            }
        }
        return i0(m4b, j4, i3, i4, j2, j3, 5);
    }

    public static void X0(mue mue, ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            kue kue = (kue) arrayList.get(i2);
            int i3 = kue.n;
            int i4 = kue.o;
            if (i3 == -1 || i4 == -1) {
                kue.n = arrayList2.size();
                kue.o = arrayList2.size();
                hue hue = new hue();
                hue.j((Object) null, (Object) null, i2, -9223372036854775807L, 0, s8.g, true);
                arrayList2.add(hue);
            } else {
                kue.n = arrayList2.size();
                kue.o = (i4 - i3) + arrayList2.size();
                while (i3 <= i4) {
                    hue hue2 = new hue();
                    mue.g(i3, hue2, false);
                    hue2.c = i2;
                    arrayList2.add(hue2);
                    i3++;
                }
            }
        }
    }

    public static m4b c0(m4b m4b, int i2, int i3, boolean z2, long j2, long j3) {
        int i4;
        int i5;
        m4b m4b2;
        boolean z3;
        m4b m4b3 = m4b;
        int i6 = i2;
        int i7 = i3;
        mue mue = m4b3.j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        for (int i9 = 0; i9 < mue.p(); i9++) {
            if (i9 < i6 || i9 >= i7) {
                arrayList.add(mue.n(i9, new kue(), 0));
            }
        }
        X0(mue, arrayList, arrayList2);
        iue j4 = j(arrayList, arrayList2);
        int P = P(m4b);
        int i10 = m4b3.c.a.e;
        kue kue = new kue();
        boolean z4 = P >= i6 && P < i7;
        if (j4.q()) {
            i4 = 0;
            i5 = -1;
        } else if (z4) {
            int p2 = mue.p();
            i5 = P;
            while (true) {
                z3 = m4b3.i;
                if (i8 < p2 && (i5 = mue.e(i5, m4b3.h, z3)) != -1) {
                    if (i5 < i6 || i5 >= i7) {
                        break;
                    }
                    i8++;
                } else {
                    i5 = -1;
                }
            }
            if (i5 == -1) {
                i5 = j4.a(z3);
            } else if (i5 >= i7) {
                i5 -= i7 - i6;
            }
            j4.n(i5, kue, 0);
            i4 = kue.n;
        } else if (P >= i7) {
            int i11 = P - (i7 - i6);
            if (i10 != -1) {
                for (int i12 = i6; i12 < i7; i12++) {
                    kue kue2 = new kue();
                    mue.o(i12, kue2);
                    i10 -= (kue2.o - kue2.n) + 1;
                }
            }
            i4 = i10;
            i5 = i11;
        } else {
            i4 = i10;
            i5 = P;
        }
        if (!z4) {
            m4b2 = i0(m4b, j4, i5, i4, j2, j3, 4);
        } else if (i5 == -1) {
            m4b2 = y0(m4b3, j4, qad.k, qad.l, 4);
        } else if (z2) {
            m4b2 = i0(m4b, j4, i5, i4, j2, j3, 4);
        } else {
            kue kue3 = new kue();
            j4.n(i5, kue3, 0);
            long h0 = oaf.h0(kue3.l);
            long h02 = oaf.h0(kue3.m);
            p3b p3b = r16;
            p3b p3b2 = new p3b((Object) null, i5, kue3.c, (Object) null, i4, h0, h0, -1, -1);
            m4b2 = y0(m4b3, j4, p3b2, new qad(p3b, false, SystemClock.elapsedRealtime(), h02, h0, j47.n(h0, h02), 0, -9223372036854775807L, h02, h0), 4);
        }
        int i13 = m4b2.y;
        return (i13 == 1 || i13 == 4 || i6 >= i7 || i7 != mue.p() || P < i6) ? m4b2 : m4b2.f(4, (PlaybackException) null);
    }

    public static k3b i(k3b k3b, k3b k3b2) {
        k3b R = j47.R(k3b, k3b2);
        if (R.a(32)) {
            return R;
        }
        rm5 rm5 = new rm5(1);
        rm5.b(R.a);
        rm5.a(32);
        return new k3b(rm5.e());
    }

    public static m4b i0(m4b m4b, iue iue, int i2, int i3, long j2, long j3, int i4) {
        m4b m4b2 = m4b;
        iue iue2 = iue;
        kue kue = new kue();
        iue2.n(i2, kue, 0);
        tb8 tb8 = kue.c;
        p3b p3b = m4b2.c.a;
        p3b p3b2 = new p3b((Object) null, i2, tb8, (Object) null, i3, j2, j3, p3b.h, p3b.i);
        qad qad = m4b2.c;
        qad qad2 = r2;
        p3b p3b3 = p3b2;
        qad qad3 = new qad(p3b3, qad.b, SystemClock.elapsedRealtime(), qad.d, qad.e, qad.f, qad.g, qad.h, qad.i, qad.j);
        return y0(m4b2, iue2, p3b3, qad2, i4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ww6, pw6] */
    /* JADX WARNING: type inference failed for: r3v0, types: [ww6, pw6] */
    public static iue j(ArrayList arrayList, ArrayList arrayList2) {
        ? pw6 = new pw6(4);
        pw6.e(arrayList);
        ffc j2 = pw6.j();
        ? pw62 = new pw6(4);
        pw62.e(arrayList2);
        ffc j3 = pw62.j();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = i2;
        }
        return new iue(j2, j3, iArr);
    }

    public static m4b y0(m4b m4b, mue mue, p3b p3b, qad qad, int i2) {
        m4b m4b2 = m4b;
        PlaybackException playbackException = m4b2.a;
        p3b p3b2 = m4b2.c.a;
        fm9.k(mue.q() || qad.a.b < mue.p());
        return new m4b(playbackException, m4b2.b, qad, p3b2, p3b, i2, m4b2.g, m4b2.h, m4b2.i, m4b2.l, mue, m4b2.k, m4b2.m, m4b2.n, m4b2.o, m4b2.p, m4b2.q, m4b2.r, m4b2.s, m4b2.t, m4b2.u, m4b2.x, m4b2.y, m4b2.v, m4b2.w, m4b2.z, m4b2.A, m4b2.B, m4b2.C, m4b2.D, m4b2.E);
    }

    public final long A() {
        return this.n.c.i;
    }

    public final void A0(int i2, tb8 tb8) {
        if (T(20)) {
            fm9.f(i2 >= 0);
            G(new ui0((Object) this, i2, (Object) tb8, 7));
            Z0(zw6.n(tb8), i2, i2 + 1);
        }
    }

    public final int B() {
        return this.n.c.a.e;
    }

    public final void B0(int i2, int i3) {
        lsd lsd = this.v;
        if (lsd.a != i2 || lsd.b != i3) {
            this.v = new lsd(i2, i3);
            this.h.f(24, new h75(i2, i3, 2));
        }
    }

    public final jlf C() {
        return this.n.l;
    }

    public final void C0(tb8 tb8) {
        if (T(31)) {
            G(new xd5(this, (Object) tb8, 4));
            d1(Collections.singletonList(tb8), -1, -9223372036854775807L, true);
        }
    }

    public final void D() {
        if (T(6)) {
            G(new k98(this, 3));
            if (R0() != -1) {
                a1(R0(), -9223372036854775807L);
            }
        }
    }

    public final void D0() {
        if (T(26)) {
            G(new k98(this, 10));
            m4b m4b = this.n;
            int i2 = m4b.r + 1;
            int i3 = m4b.q.c;
            if (i3 == 0 || i2 <= i3) {
                this.n = m4b.c(i2, m4b.s);
                j98 j98 = new j98(this, i2, 3);
                pm7 pm7 = this.h;
                pm7.c(30, j98);
                pm7.b();
            }
        }
    }

    public final void E() {
        if (T(4)) {
            G(new k98(this, 2));
            a1(P(this.n), -9223372036854775807L);
        }
    }

    public final boolean E0() {
        return this.n.i;
    }

    public final h30 F() {
        return this.n.o;
    }

    public final j0f F0() {
        return this.n.E;
    }

    public final void G(u98 u98) {
        va8 va8 = this.i;
        if (((w98) va8.c).w != null) {
            Handler handler = (Handler) va8.b;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        o(this.w, u98, true);
    }

    public final long G0() {
        return this.n.c.j;
    }

    public final void H(int i2, boolean z2) {
        if (T(34)) {
            G(new u64(this, z2, i2));
            m4b m4b = this.n;
            if (m4b.s != z2) {
                this.n = m4b.c(m4b.r, z2);
                o98 o98 = new o98(this, z2, 0);
                pm7 pm7 = this.h;
                pm7.c(30, o98);
                pm7.b();
            }
        }
    }

    public final void H0(int i2, long j2, List list) {
        if (T(20)) {
            G(new q98(this, list, i2, j2));
            d1(list, i2, j2, false);
        }
    }

    public final ui4 I() {
        return this.n.q;
    }

    public final void I0(int i2) {
        if (T(25)) {
            G(new j98(this, i2, 7));
            m4b m4b = this.n;
            ui4 ui4 = m4b.q;
            if (m4b.r != i2 && ui4.b <= i2) {
                int i3 = ui4.c;
                if (i3 == 0 || i2 <= i3) {
                    this.n = m4b.c(i2, m4b.s);
                    j98 j98 = new j98(this, i2, 8);
                    pm7 pm7 = this.h;
                    pm7.c(30, j98);
                    pm7.b();
                }
            }
        }
    }

    public final void J() {
        if (T(26)) {
            G(new k98(this, 15));
            m4b m4b = this.n;
            int i2 = m4b.r - 1;
            if (i2 >= m4b.q.b) {
                this.n = m4b.c(i2, m4b.s);
                j98 j98 = new j98(this, i2, 9);
                pm7 pm7 = this.h;
                pm7.c(30, j98);
                pm7.b();
            }
        }
    }

    public final void J0() {
        if (T(9)) {
            G(new k98(this, 8));
            mue mue = this.n.j;
            if (!mue.q() && !n()) {
                if (j0()) {
                    a1(T0(), -9223372036854775807L);
                    return;
                }
                kue n2 = mue.n(P(this.n), new kue(), 0);
                if (n2.i && n2.a()) {
                    a1(P(this.n), -9223372036854775807L);
                }
            }
        }
    }

    public final void K(u98 u98) {
        va8 va8 = this.i;
        if (((w98) va8.c).w != null) {
            Handler handler = (Handler) va8.b;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
        bm7 o2 = o(this.w, u98, true);
        try {
            gf7.v(o2);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2);
        } catch (TimeoutException e3) {
            if (o2 instanceof k6d) {
                int i2 = ((k6d) o2).s0;
                this.j.remove(Integer.valueOf(i2));
                this.b.s(i2, new sad(-1));
            }
            z04.d0("Synchronous command takes too long on the session side.", e3);
        }
    }

    public final void K0() {
        if (T(12)) {
            G(new k98(this, 1));
            b1(this.n.B);
        }
    }

    public final void L(int i2, int i3) {
        if (T(33)) {
            G(new l98(this, i2, i3, 1));
            m4b m4b = this.n;
            ui4 ui4 = m4b.q;
            if (m4b.r != i2 && ui4.b <= i2) {
                int i4 = ui4.c;
                if (i4 == 0 || i2 <= i4) {
                    this.n = m4b.c(i2, m4b.s);
                    j98 j98 = new j98(this, i2, 1);
                    pm7 pm7 = this.h;
                    pm7.c(30, j98);
                    pm7.b();
                }
            }
        }
    }

    public final void L0() {
        if (T(11)) {
            G(new k98(this, 7));
            b1(-this.n.A);
        }
    }

    public final boolean M() {
        return R0() != -1;
    }

    public final void M0(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i2;
        mue mue = this.n.j;
        int p2 = mue.p();
        int min = Math.min(i3, p2);
        int i8 = min - i7;
        int min2 = Math.min(i4, p2 - i8);
        if (i7 < p2 && i7 != min && i7 != min2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < p2; i9++) {
                arrayList.add(mue.n(i9, new kue(), 0));
            }
            oaf.R(arrayList, i7, min, min2);
            X0(mue, arrayList, arrayList2);
            iue j2 = j(arrayList, arrayList2);
            if (!j2.q()) {
                int P = P(this.n);
                if (P >= i7 && P < min) {
                    i6 = (P - i7) + min2;
                } else if (min > P || min2 <= P) {
                    i5 = (min <= P || min2 > P) ? P : i8 + P;
                    kue kue = new kue();
                    j2.n(i5, kue, 0);
                    f1(i0(this.n, j2, i5, kue.n + (this.n.c.a.e - mue.n(P, kue, 0).n), k(), b0(), 5), 0, (Integer) null, (Integer) null, (Integer) null);
                } else {
                    i6 = P - i8;
                }
                i5 = i6;
                kue kue2 = new kue();
                j2.n(i5, kue2, 0);
                f1(i0(this.n, j2, i5, kue2.n + (this.n.c.a.e - mue.n(P, kue2, 0).n), k(), b0(), 5), 0, (Integer) null, (Integer) null, (Integer) null);
            }
        }
    }

    public final void N(int i2) {
        if (T(34)) {
            G(new j98(this, i2, 4));
            m4b m4b = this.n;
            int i3 = m4b.r + 1;
            int i4 = m4b.q.c;
            if (i4 == 0 || i3 <= i4) {
                this.n = m4b.c(i3, m4b.s);
                j98 j98 = new j98(this, i3, 5);
                pm7 pm7 = this.h;
                pm7.c(30, j98);
                pm7.b();
            }
        }
    }

    public final gd8 N0() {
        return this.n.z;
    }

    public final int O() {
        return this.n.c.a.i;
    }

    public final void O0(List list) {
        if (T(20)) {
            G(new xd5(this, (Object) list, 3));
            d1(list, -1, -9223372036854775807L, true);
        }
    }

    public final long P0() {
        return this.n.A;
    }

    public final void Q(j0f j0f) {
        if (T(29)) {
            G(new d74(this, 25, j0f));
            m4b m4b = this.n;
            if (j0f != m4b.E) {
                this.n = m4b.o(j0f);
                k75 k75 = new k75(j0f, 1);
                pm7 pm7 = this.h;
                pm7.c(19, k75);
                pm7.b();
            }
        }
    }

    public final z9d Q0() {
        return this.q;
    }

    public final b11 R(mue mue, int i2, long j2) {
        int i3;
        if (mue.q()) {
            return null;
        }
        kue kue = new kue();
        hue hue = new hue();
        if (i2 == -1 || i2 >= mue.p()) {
            i2 = mue.a(this.n.i);
            j2 = oaf.h0(mue.n(i2, kue, 0).l);
        }
        long S = oaf.S(j2);
        fm9.g(i2, mue.p());
        mue.o(i2, kue);
        if (S == -9223372036854775807L) {
            S = kue.l;
            if (S == -9223372036854775807L) {
                return null;
            }
        }
        int i4 = kue.n;
        mue.g(i4, hue, false);
        do {
            i3 = i4;
            if (i3 >= kue.o || hue.e == S) {
                mue.g(i3, hue, false);
            } else {
                i4 = i3 + 1;
            }
        } while (mue.g(i4, hue, false).e <= S);
        mue.g(i3, hue, false);
        return new b11(S - hue.e, i3, 6, false);
    }

    public final int R0() {
        if (this.n.j.q()) {
            return -1;
        }
        m4b m4b = this.n;
        mue mue = m4b.j;
        int P = P(m4b);
        m4b m4b2 = this.n;
        int i2 = m4b2.h;
        if (i2 == 1) {
            i2 = 0;
        }
        return mue.l(P, i2, m4b2.i);
    }

    public final void S(int i2) {
        if (T(20)) {
            fm9.f(i2 >= 0);
            G(new j98(this, i2, 2));
            Y0(i2, i2 + 1);
        }
    }

    public final bm7 S0(y9d y9d, Bundle bundle) {
        qr6 qr6;
        u00 u00 = new u00((Object) this, (Object) y9d, (Object) bundle, 15);
        fm9.f(y9d.a == 0);
        z9d z9d = this.q;
        z9d.getClass();
        if (!z9d.a.contains(y9d)) {
            z04.c0("Controller isn't allowed to call custom session command:" + y9d.b);
            qr6 = null;
        } else {
            qr6 = this.w;
        }
        return o(qr6, u00, false);
    }

    public final boolean T(int i2) {
        if (this.t.a(i2)) {
            return true;
        }
        ey8.k(i2, "Controller isn't allowed to call command= ");
        return false;
    }

    public final int T0() {
        if (this.n.j.q()) {
            return -1;
        }
        m4b m4b = this.n;
        mue mue = m4b.j;
        int P = P(m4b);
        m4b m4b2 = this.n;
        int i2 = m4b2.h;
        if (i2 == 1) {
            i2 = 0;
        }
        return mue.e(P, i2, m4b2.i);
    }

    public final void U(int i2, int i3) {
        if (T(20)) {
            fm9.f(i2 >= 0 && i3 >= i2);
            G(new l98(this, i2, i3, 0));
            Y0(i2, i3);
        }
    }

    public final void U0(tb8 tb8) {
        if (T(31)) {
            G(new d74(this, 26, tb8));
            d1(Collections.singletonList(tb8), -1, -9223372036854775807L, true);
        }
    }

    public final void V() {
        if (T(7)) {
            G(new k98(this, 4));
            mue mue = this.n.j;
            if (!mue.q() && !n()) {
                boolean M = M();
                kue n2 = mue.n(P(this.n), new kue(), 0);
                if (!n2.i || !n2.a()) {
                    if (!M || k() > this.n.C) {
                        a1(P(this.n), 0);
                    } else {
                        a1(R0(), -9223372036854775807L);
                    }
                } else if (M) {
                    a1(R0(), -9223372036854775807L);
                }
            }
        }
    }

    public final zw6 V0() {
        return this.p;
    }

    public final void W0(m4b m4b, m4b m4b2, Integer num, Integer num2, Integer num3, Integer num4) {
        pm7 pm7 = this.h;
        if (num != null) {
            pm7.c(0, new r98(m4b2, num, 0));
        }
        if (num3 != null) {
            pm7.c(11, new r98(m4b2, num3, 1));
        }
        tb8 s2 = m4b2.s();
        if (num4 != null) {
            pm7.c(1, new d74(s2, 28, num4));
        }
        PlaybackException playbackException = m4b.a;
        PlaybackException playbackException2 = m4b2.a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            pm7.c(10, new t98(0, playbackException2));
            if (playbackException2 != null) {
                pm7.c(10, new t98(1, playbackException2));
            }
        }
        if (!m4b.D.equals(m4b2.D)) {
            pm7.c(2, new s98(m4b2, 17));
        }
        if (!m4b.z.equals(m4b2.z)) {
            pm7.c(14, new s98(m4b2, 18));
        }
        if (m4b.w != m4b2.w) {
            pm7.c(3, new s98(m4b2, 19));
        }
        if (m4b.y != m4b2.y) {
            pm7.c(4, new s98(m4b2, 20));
        }
        if (num2 != null) {
            pm7.c(5, new r98(m4b2, num2, 2));
        }
        if (m4b.x != m4b2.x) {
            pm7.c(6, new s98(m4b2, 0));
        }
        if (m4b.v != m4b2.v) {
            pm7.c(7, new s98(m4b2, 1));
        }
        if (!m4b.g.equals(m4b2.g)) {
            pm7.c(12, new s98(m4b2, 2));
        }
        if (m4b.h != m4b2.h) {
            pm7.c(8, new s98(m4b2, 3));
        }
        if (m4b.i != m4b2.i) {
            pm7.c(9, new s98(m4b2, 4));
        }
        if (!m4b.m.equals(m4b2.m)) {
            pm7.c(15, new s98(m4b2, 5));
        }
        if (m4b.n != m4b2.n) {
            pm7.c(22, new s98(m4b2, 6));
        }
        if (!m4b.o.equals(m4b2.o)) {
            pm7.c(20, new s98(m4b2, 7));
        }
        if (!m4b.p.a.equals(m4b2.p.a)) {
            pm7.c(27, new s98(m4b2, 8));
            pm7.c(27, new s98(m4b2, 9));
        }
        if (!m4b.q.equals(m4b2.q)) {
            pm7.c(29, new s98(m4b2, 10));
        }
        if (!(m4b.r == m4b2.r && m4b.s == m4b2.s)) {
            pm7.c(30, new s98(m4b2, 11));
        }
        if (!m4b.l.equals(m4b2.l)) {
            pm7.c(25, new s98(m4b2, 12));
        }
        if (m4b.A != m4b2.A) {
            pm7.c(16, new s98(m4b2, 13));
        }
        if (m4b.B != m4b2.B) {
            pm7.c(17, new s98(m4b2, 14));
        }
        if (m4b.C != m4b2.C) {
            pm7.c(18, new s98(m4b2, 15));
        }
        if (!m4b.E.equals(m4b2.E)) {
            pm7.c(19, new s98(m4b2, 16));
        }
        pm7.b();
    }

    public final PlaybackException X() {
        return this.n.a;
    }

    public final void Y(boolean z2) {
        if (T(1)) {
            G(new o98(this, z2, 4));
            e1(z2);
        } else if (z2) {
            z04.c0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    public final void Y0(int i2, int i3) {
        int i4 = i2;
        int p2 = this.n.j.p();
        int min = Math.min(i3, p2);
        if (i4 < p2 && i4 != min && p2 != 0) {
            boolean z2 = true;
            boolean z3 = P(this.n) >= i4 && P(this.n) < min;
            m4b c0 = c0(this.n, i2, min, false, k(), b0());
            int i5 = this.n.c.a.b;
            if (i5 < i4 || i5 >= min) {
                z2 = false;
            }
            int i6 = null;
            int i7 = z3 ? 4 : null;
            if (z2) {
                i6 = 3;
            }
            f1(c0, 0, (Integer) null, i7, i6);
        }
    }

    public final void Z(int i2) {
        if (T(10)) {
            fm9.f(i2 >= 0);
            G(new j98(this, i2, 0));
            a1(i2, -9223372036854775807L);
        }
    }

    public final void Z0(List list, int i2, int i3) {
        int p2 = this.n.j.p();
        if (i2 <= p2) {
            if (this.n.j.q()) {
                d1(list, -1, -9223372036854775807L, false);
                return;
            }
            int min = Math.min(i3, p2);
            int i4 = min;
            m4b c0 = c0(W(this.n, i4, list, k(), b0()), i2, i4, true, k(), b0());
            int i5 = this.n.c.a.b;
            boolean z2 = i5 >= i2 && i5 < min;
            f1(c0, (Integer) null, (Integer) null, z2 ? 4 : null, z2 ? 3 : null);
        }
    }

    public final boolean a() {
        return this.n.w;
    }

    public final long a0() {
        return this.n.B;
    }

    public final void a1(int i2, long j2) {
        int i3;
        int i4;
        m4b m4b;
        m4b j3;
        int i5 = i2;
        long j4 = j2;
        mue mue = this.n.j;
        if ((mue.q() || i5 < mue.p()) && !n()) {
            m4b m4b2 = this.n;
            m4b f2 = m4b2.f(m4b2.y == 1 ? 1 : 2, m4b2.a);
            b11 R = R(mue, i5, j4);
            if (R == null) {
                int i6 = (j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1));
                int i7 = i2;
                int i8 = i2;
                p3b p3b = r1;
                i3 = 1;
                p3b p3b2 = new p3b((Object) null, i7, (tb8) null, (Object) null, i8, i6 == 0 ? 0 : j4, i6 == 0 ? 0 : j4, -1, -1);
                m4b m4b3 = this.n;
                mue mue2 = m4b3.j;
                boolean z2 = this.n.c.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                qad qad = this.n.c;
                m4b = y0(m4b3, mue2, p3b, new qad(p3b, z2, elapsedRealtime, qad.d, i6 == 0 ? 0 : j4, 0, 0, qad.h, qad.i, i6 == 0 ? 0 : j4), 1);
                i4 = 0;
            } else {
                i3 = 1;
                qad qad2 = f2.c;
                int i9 = qad2.a.e;
                hue hue = new hue();
                mue.g(i9, hue, false);
                hue hue2 = new hue();
                int i10 = R.b;
                mue.g(i10, hue2, false);
                boolean z3 = i9 != i10;
                long S = oaf.S(k()) - hue.e;
                long j5 = R.c;
                if (z3 || j5 != S) {
                    p3b p3b3 = qad2.a;
                    fm9.k(p3b3.h == -1);
                    boolean z4 = z3;
                    long j6 = j5;
                    p3b p3b4 = new p3b((Object) null, hue.c, p3b3.c, (Object) null, i9, oaf.h0(hue.e + S), oaf.h0(hue.e + S), -1, -1);
                    i4 = 0;
                    mue.g(i10, hue2, false);
                    kue kue = new kue();
                    mue.o(hue2.c, kue);
                    p3b p3b5 = new p3b((Object) null, hue2.c, kue.c, (Object) null, i10, oaf.h0(hue2.e + j6), oaf.h0(hue2.e + j6), -1, -1);
                    m4b h2 = f2.h(p3b4, p3b5, 1);
                    if (z4 || j6 < S) {
                        j3 = h2.j(new qad(p3b5, false, SystemClock.elapsedRealtime(), oaf.h0(kue.m), oaf.h0(hue2.e + j6), j47.n(oaf.h0(hue2.e + j6), oaf.h0(kue.m)), 0, -9223372036854775807L, -9223372036854775807L, oaf.h0(hue2.e + j6)));
                    } else {
                        long max = Math.max(0, oaf.S(h2.c.g) - (j6 - S));
                        long j7 = j6 + max;
                        j3 = h2.j(new qad(p3b5, false, SystemClock.elapsedRealtime(), oaf.h0(kue.m), oaf.h0(j7), j47.n(oaf.h0(j7), oaf.h0(kue.m)), oaf.h0(max), -9223372036854775807L, -9223372036854775807L, oaf.h0(j7)));
                    }
                    f2 = j3;
                } else {
                    i4 = 0;
                }
                m4b = f2;
            }
            boolean q2 = this.n.j.q();
            qad qad3 = m4b.c;
            int i11 = (q2 || qad3.a.b == this.n.c.a.b) ? i4 : i3;
            if (i11 != 0 || qad3.a.f != this.n.c.a.f) {
                f1(m4b, (Integer) null, (Integer) null, Integer.valueOf(i3), i11 != 0 ? 2 : null);
            }
        }
    }

    public final boolean b() {
        return this.n.v;
    }

    public final long b0() {
        qad qad = this.n.c;
        return !qad.b ? k() : qad.a.g;
    }

    public final void b1(long j2) {
        long k2 = k() + j2;
        long c2 = c();
        if (c2 != -9223372036854775807L) {
            k2 = Math.min(k2, c2);
        }
        a1(P(this.n), Math.max(k2, 0));
    }

    public final long c() {
        return this.n.c.d;
    }

    public final void c1(int i2, ew6 ew6) {
        ew6.d(new si1((Object) this, (Object) ew6, i2, 13), nk4.a);
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [or6, java.lang.Object] */
    public final void connect() {
        qr6 qr6;
        obd obd = this.e;
        int type = obd.a.getType();
        nbd nbd = obd.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.l = null;
            Object c2 = nbd.c();
            fm9.l(c2);
            IBinder iBinder = (IBinder) c2;
            int i2 = sj8.i;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof qr6)) {
                ? obj = new Object();
                obj.c = iBinder;
                qr6 = obj;
            } else {
                qr6 = (qr6) queryLocalInterface;
            }
            try {
                qr6.j0(this.c, this.b.i(), new oh3(context.getPackageName(), Process.myPid(), bundle).b());
            } catch (RemoteException e2) {
                z04.d0("Failed to call connection request.", e2);
            }
        } else {
            this.l = new v98(this, bundle);
            int i3 = oaf.a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(nbd.getPackageName(), nbd.d());
            if (!context.bindService(intent, this.l, i3)) {
                z04.c0("bind to " + obd + " failed");
                a98 a98 = this.a;
                Objects.requireNonNull(a98);
                a98.G(new nn6(9, a98));
            }
        }
    }

    public final c3b d() {
        return this.n.g;
    }

    public final void d0(int i2, List list) {
        if (T(20)) {
            fm9.f(i2 >= 0);
            G(new ui0((Object) this, i2, (Object) list, 8));
            h(i2, list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1(java.util.List r66, int r67, long r68, boolean r70) {
        /*
            r65 = this;
            r0 = r65
            r1 = r66
            r2 = r67
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.lang.Integer r28 = java.lang.Integer.valueOf(r6)
            r9 = r6
        L_0x0017:
            int r7 = r66.size()
            if (r9 >= r7) goto L_0x0073
            java.lang.Object r7 = r1.get(r9)
            r24 = r7
            tb8 r24 = (defpackage.tb8) r24
            jx6 r7 = defpackage.gf7.a
            kue r8 = new kue
            r7 = r8
            r8.<init>()
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r8
            r8 = r28
            r30 = r9
            r9 = r24
            r24 = r30
            r25 = r30
            r7.b(r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r22, r24, r25, r26)
            r4.add(r6)
            hue r6 = new hue
            r6.<init>()
            s8 r15 = defpackage.s8.g
            r9 = 0
            r16 = 1
            r8 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r7 = r6
            r10 = r30
            r7.j(r8, r9, r10, r11, r13, r15, r16)
            r5.add(r6)
            int r9 = r30 + 1
            r6 = 0
            goto L_0x0017
        L_0x0073:
            iue r4 = j(r4, r5)
            boolean r5 = r4.q()
            zw6 r6 = r4.e
            if (r5 != 0) goto L_0x008c
            int r5 = r6.size()
            if (r2 >= r5) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x008c:
            r5 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r70 == 0) goto L_0x009f
            m4b r2 = r0.n
            boolean r2 = r2.i
            int r2 = r4.a(r2)
            r10 = r7
        L_0x009d:
            r6 = 0
            goto L_0x00c7
        L_0x009f:
            if (r2 != r5) goto L_0x00c4
            m4b r2 = r0.n
            qad r2 = r2.c
            p3b r2 = r2.a
            int r9 = r2.b
            boolean r10 = r4.q()
            if (r10 != 0) goto L_0x00c0
            int r6 = r6.size()
            if (r9 < r6) goto L_0x00c0
            m4b r2 = r0.n
            boolean r2 = r2.i
            int r2 = r4.a(r2)
            r6 = r3
            r10 = r7
            goto L_0x00c7
        L_0x00c0:
            long r10 = r2.f
            r2 = r9
            goto L_0x009d
        L_0x00c4:
            r10 = r68
            goto L_0x009d
        L_0x00c7:
            b11 r9 = r0.R(r4, r2, r10)
            if (r9 != 0) goto L_0x0121
            p3b r1 = new p3b
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x00d8
            r18 = r8
            goto L_0x00da
        L_0x00d8:
            r18 = r10
        L_0x00da:
            if (r7 != 0) goto L_0x00df
            r20 = r8
            goto L_0x00e1
        L_0x00df:
            r20 = r10
        L_0x00e1:
            r15 = 0
            r16 = 0
            r13 = 0
            r22 = -1
            r23 = -1
            r12 = r1
            r14 = r2
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            qad r12 = new qad
            long r32 = android.os.SystemClock.elapsedRealtime()
            if (r7 != 0) goto L_0x00fb
            r36 = r8
            goto L_0x00fd
        L_0x00fb:
            r36 = r10
        L_0x00fd:
            if (r7 != 0) goto L_0x0102
            r45 = r8
            goto L_0x0104
        L_0x0102:
            r45 = r10
        L_0x0104:
            r41 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r43 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r31 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r38 = 0
            r39 = 0
            r29 = r12
            r30 = r1
            r29.<init>(r30, r31, r32, r34, r36, r38, r39, r41, r43, r45)
            goto L_0x016f
        L_0x0121:
            p3b r7 = new p3b
            java.lang.Object r1 = r1.get(r2)
            r15 = r1
            tb8 r15 = (defpackage.tb8) r15
            long r10 = r9.c
            long r18 = defpackage.oaf.h0(r10)
            long r20 = defpackage.oaf.h0(r10)
            r16 = 0
            int r1 = r9.b
            r13 = 0
            r22 = -1
            r23 = -1
            r12 = r7
            r14 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            qad r12 = new qad
            long r50 = android.os.SystemClock.elapsedRealtime()
            long r54 = defpackage.oaf.h0(r10)
            long r63 = defpackage.oaf.h0(r10)
            r59 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r61 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r49 = 0
            r52 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r56 = 0
            r57 = 0
            r47 = r12
            r48 = r7
            r47.<init>(r48, r49, r50, r52, r54, r56, r57, r59, r61, r63)
            r1 = r7
        L_0x016f:
            m4b r7 = r0.n
            r8 = 4
            m4b r1 = y0(r7, r4, r1, r12, r8)
            int r7 = r1.y
            if (r2 == r5) goto L_0x0188
            if (r7 == r3) goto L_0x0188
            boolean r2 = r4.q()
            if (r2 != 0) goto L_0x0187
            if (r6 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r7 = 2
            goto L_0x0188
        L_0x0187:
            r7 = r8
        L_0x0188:
            m4b r2 = r0.n
            androidx.media3.common.PlaybackException r2 = r2.a
            m4b r1 = r1.f(r7, r2)
            m4b r2 = r0.n
            mue r2 = r2.j
            boolean r2 = r2.q()
            r3 = 0
            if (r2 != 0) goto L_0x01a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x01a1
        L_0x01a0:
            r2 = r3
        L_0x01a1:
            m4b r4 = r0.n
            mue r4 = r4.j
            boolean r4 = r4.q()
            if (r4 == 0) goto L_0x01b3
            mue r4 = r1.j
            boolean r4 = r4.q()
            if (r4 != 0) goto L_0x01b8
        L_0x01b3:
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x01b8:
            r4 = 0
            r66 = r1
            r67 = r28
            r68 = r4
            r69 = r2
            r70 = r3
            r65.f1(r66, r67, r68, r69, r70)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w98.d1(java.util.List, int, long, boolean):void");
    }

    public final float e() {
        return this.n.n;
    }

    public final long e0() {
        return this.n.c.e;
    }

    public final void e1(boolean z2) {
        m4b m4b = this.n;
        int i2 = m4b.x;
        int i3 = i2 == 1 ? 0 : i2;
        if (m4b.t != z2 || i2 != i3) {
            this.x = j47.M(m4b, this.x, this.y, this.a.Y);
            this.y = SystemClock.elapsedRealtime();
            f1(this.n.d(1, i3, z2), (Integer) null, 1, (Integer) null, (Integer) null);
        }
    }

    public final void f(c3b c3b) {
        if (T(13)) {
            G(new d74(this, 27, c3b));
            if (!this.n.g.equals(c3b)) {
                this.n = this.n.e(c3b);
                n98 n98 = new n98(c3b, 1);
                pm7 pm7 = this.h;
                pm7.c(12, n98);
                pm7.b();
            }
        }
    }

    public final void f0() {
        if (T(8)) {
            G(new k98(this, 14));
            if (T0() != -1) {
                a1(T0(), -9223372036854775807L);
            }
        }
    }

    public final void f1(m4b m4b, Integer num, Integer num2, Integer num3, Integer num4) {
        m4b m4b2 = this.n;
        this.n = m4b;
        W0(m4b2, m4b, num, num2, num3, num4);
    }

    public final void g(float f2) {
        if (T(24)) {
            G(new m98(this, f2, 1));
            m4b m4b = this.n;
            if (m4b.n != f2) {
                this.n = m4b.p(f2);
                b75 b75 = new b75(2, f2);
                pm7 pm7 = this.h;
                pm7.c(22, b75);
                pm7.b();
            }
        }
    }

    public final void g0(int i2) {
        if (T(34)) {
            G(new j98(this, i2, 10));
            m4b m4b = this.n;
            int i3 = m4b.r - 1;
            if (i3 >= m4b.q.b) {
                this.n = m4b.c(i3, m4b.s);
                j98 j98 = new j98(this, i3, 11);
                pm7 pm7 = this.h;
                pm7.c(30, j98);
                pm7.b();
            }
        }
    }

    public final int getPlaybackState() {
        return this.n.y;
    }

    public final int getRepeatMode() {
        return this.n.h;
    }

    public final void h(int i2, List list) {
        if (!list.isEmpty()) {
            if (this.n.j.q()) {
                d1(list, -1, -9223372036854775807L, false);
            } else {
                f1(W(this.n, Math.min(i2, this.n.j.p()), list, k(), b0()), 0, (Integer) null, (Integer) null, this.n.j.q() ? 3 : null);
            }
        }
    }

    public final p0f h0() {
        return this.n.D;
    }

    public final boolean isConnected() {
        return this.w != null;
    }

    public final boolean j0() {
        return T0() != -1;
    }

    public final long k() {
        long M = j47.M(this.n, this.x, this.y, this.a.Y);
        this.x = M;
        return M;
    }

    public final gd8 k0() {
        return this.n.m;
    }

    public final int l() {
        return this.n.r;
    }

    public final zz3 l0() {
        return this.n.p;
    }

    public final void m(Surface surface) {
        if (T(27)) {
            if (this.u != null) {
                this.u = null;
            }
            this.u = surface;
            K(new d74(this, 24, surface));
            int i2 = surface == null ? 0 : -1;
            B0(i2, i2);
        }
    }

    public final void m0(h30 h30, boolean z2) {
        if (T(35)) {
            G(new xd5(this, h30, z2, 2));
            if (!this.n.o.equals(h30)) {
                this.n = this.n.a(h30);
                j75 j75 = new j75(h30, 1);
                pm7 pm7 = this.h;
                pm7.c(20, j75);
                pm7.b();
            }
        }
    }

    public final boolean n() {
        return this.n.c.b;
    }

    public final void n0(gd8 gd8) {
        if (T(19)) {
            G(new d74(this, 23, gd8));
            if (!this.n.m.equals(gd8)) {
                this.n = this.n.g(gd8);
                f75 f75 = new f75(gd8, 1);
                pm7 pm7 = this.h;
                pm7.c(15, f75);
                pm7.b();
            }
        }
    }

    public final bm7 o(qr6 qr6, u98 u98, boolean z2) {
        int i2;
        k6d k6d;
        if (qr6 == null) {
            return fm9.F(new sad(-4));
        }
        cd6 cd6 = this.b;
        sad sad = new sad(1);
        synchronized (cd6.o) {
            try {
                i2 = cd6.i();
                k6d = new k6d(i2, sad);
                if (cd6.b) {
                    k6d.n();
                } else {
                    ((us) cd6.X).put(Integer.valueOf(i2), k6d);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.j.add(Integer.valueOf(i2));
        }
        try {
            u98.c(qr6, i2);
        } catch (RemoteException e2) {
            z04.d0("Cannot connect to the service or the session is gone", e2);
            this.j.remove(Integer.valueOf(i2));
            this.b.s(i2, new sad(-100));
        }
        return k6d;
    }

    public final int o0() {
        return this.n.c.a.h;
    }

    public final long p() {
        return this.n.c.h;
    }

    public final int p0() {
        return P(this.n);
    }

    public final void pause() {
        if (T(1)) {
            G(new k98(this, 9));
            e1(false);
        }
    }

    public final void play() {
        if (!T(1)) {
            z04.c0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        G(new k98(this, 11));
        e1(true);
    }

    public final void prepare() {
        int i2 = 2;
        if (T(2)) {
            G(new k98(this, 13));
            m4b m4b = this.n;
            if (m4b.y == 1) {
                if (m4b.j.q()) {
                    i2 = 4;
                }
                f1(m4b.f(i2, (PlaybackException) null), (Integer) null, (Integer) null, (Integer) null, (Integer) null);
            }
        }
    }

    public final long q() {
        return this.n.c.g;
    }

    public final void q0(boolean z2) {
        if (T(26)) {
            G(new o98(this, z2, 2));
            m4b m4b = this.n;
            if (m4b.s != z2) {
                this.n = m4b.c(m4b.r, z2);
                o98 o98 = new o98(this, z2, 3);
                pm7 pm7 = this.h;
                pm7.c(30, o98);
                pm7.b();
            }
        }
    }

    public final void r(int i2, long j2) {
        if (T(10)) {
            fm9.f(i2 >= 0);
            G(new e74((Object) this, i2, j2, 3));
            a1(i2, j2);
        }
    }

    public final void r0(n3b n3b) {
        this.h.e(n3b);
    }

    public final void release() {
        qr6 qr6 = this.w;
        if (!this.m) {
            this.m = true;
            this.k = null;
            va8 va8 = this.i;
            Handler handler = (Handler) va8.b;
            if (handler.hasMessages(1)) {
                try {
                    w98 w98 = (w98) va8.c;
                    w98.w.m0(w98.c);
                } catch (RemoteException unused) {
                    z04.c0("Error in sending flushCommandQueue");
                }
            }
            handler.removeCallbacksAndMessages((Object) null);
            this.w = null;
            if (qr6 != null) {
                int i2 = this.b.i();
                try {
                    qr6.asBinder().unlinkToDeath(this.g, 0);
                    qr6.e0(this.c, i2);
                } catch (RemoteException unused2) {
                }
            }
            this.h.d();
            cd6 cd6 = this.b;
            nn6 nn6 = new nn6(10, this);
            synchronized (cd6.o) {
                try {
                    Handler o2 = oaf.o((Handler.Callback) null);
                    cd6.Y = o2;
                    cd6.c = nn6;
                    if (((us) cd6.X).isEmpty()) {
                        cd6.k();
                    } else {
                        o2.postDelayed(new u3c(13, cd6), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final k3b s() {
        return this.t;
    }

    public final void s0(List list, int i2, int i3) {
        if (T(20)) {
            fm9.f(i2 >= 0 && i2 <= i3);
            G(new r84(this, list, i2, i3));
            Z0(list, i2, i3);
        }
    }

    public final void seekTo(long j2) {
        if (T(5)) {
            G(new lt1((Object) this, j2, 5));
            a1(P(this.n), j2);
        }
    }

    public final void setPlaybackSpeed(float f2) {
        if (T(13)) {
            G(new m98(this, f2, 0));
            c3b c3b = this.n.g;
            if (c3b.a != f2) {
                c3b c3b2 = new c3b(f2, c3b.b);
                this.n = this.n.e(c3b2);
                n98 n98 = new n98(c3b2, 0);
                pm7 pm7 = this.h;
                pm7.c(12, n98);
                pm7.b();
            }
        }
    }

    public final void setRepeatMode(int i2) {
        if (T(15)) {
            G(new j98(this, i2, 6));
            m4b m4b = this.n;
            if (m4b.h != i2) {
                this.n = m4b.i(i2);
                z64 z64 = new z64(i2, 5);
                pm7 pm7 = this.h;
                pm7.c(8, z64);
                pm7.b();
            }
        }
    }

    public final void stop() {
        if (T(3)) {
            G(new k98(this, 12));
            m4b m4b = this.n;
            qad qad = this.n.c;
            p3b p3b = qad.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qad qad2 = this.n.c;
            long j2 = qad2.d;
            long j3 = qad2.a.f;
            qad qad3 = qad;
            int n2 = j47.n(j3, j2);
            qad qad4 = this.n.c;
            qad qad5 = r2;
            qad qad6 = new qad(p3b, qad3.b, elapsedRealtime, j2, j3, n2, 0, qad4.h, qad4.i, qad4.a.f);
            m4b j4 = m4b.j(qad5);
            this.n = j4;
            if (j4.y != 1) {
                this.n = j4.f(1, j4.a);
                kp7 kp7 = new kp7(22);
                pm7 pm7 = this.h;
                pm7.c(4, kp7);
                pm7.b();
            }
        }
    }

    public final void t(tb8 tb8, long j2) {
        if (T(31)) {
            long j3 = j2;
            G(new x72((Object) this, (Object) tb8, j3, 8));
            d1(Collections.singletonList(tb8), -1, j3, false);
        }
    }

    public final void t0(int i2, int i3) {
        if (T(20)) {
            fm9.f(i2 >= 0 && i3 >= 0);
            G(new l98(this, i2, i3, 2));
            M0(i2, i2 + 1, i3);
        }
    }

    public final boolean u() {
        return this.n.t;
    }

    public final void u0(int i2, int i3, int i4) {
        if (T(20)) {
            fm9.f(i2 >= 0 && i2 <= i3 && i4 >= 0);
            G(new ot1(this, i2, i3, i4));
            M0(i2, i3, i4);
        }
    }

    public final void v() {
        if (T(20)) {
            G(new k98(this, 5));
            Y0(0, Integer.MAX_VALUE);
        }
    }

    public final int v0() {
        return this.n.x;
    }

    public final void w(boolean z2) {
        if (T(14)) {
            G(new o98(this, z2, 1));
            m4b m4b = this.n;
            if (m4b.i != z2) {
                this.n = m4b.k(z2);
                l01 l01 = new l01(z2, 6);
                pm7 pm7 = this.h;
                pm7.c(9, l01);
                pm7.b();
            }
        }
    }

    public final void w0(List list) {
        if (T(20)) {
            G(new d74(this, 29, list));
            h(this.n.j.p(), list);
        }
    }

    public final int x() {
        return this.n.c.f;
    }

    public final mue x0() {
        return this.n.j;
    }

    public final long y() {
        return this.n.C;
    }

    public final void z(n3b n3b) {
        this.h.a(n3b);
    }

    public final boolean z0() {
        return this.n.s;
    }
}
