package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: h74  reason: default package */
public final class h74 implements m3b, hk8, mr4 {
    public final SparseArray X;
    public z23 Y;
    public u2 Z;
    public final rhe a;
    public final gue b;
    public final jue c;
    public final z23 o;
    public boolean s0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, z23] */
    public h74(rhe rhe) {
        rhe.getClass();
        this.a = rhe;
        int i = maf.a;
        Looper myLooper = Looper.myLooper();
        this.Y = new z23(myLooper == null ? Looper.getMainLooper() : myLooper, rhe, new v64(7));
        gue gue = new gue();
        this.b = gue;
        this.c = new jue();
        ? obj = new Object();
        obj.b = gue;
        ls5 ls5 = zw6.b;
        obj.a = ffc.X;
        obj.c = kfc.s0;
        this.o = obj;
        this.X = new SparseArray();
    }

    public final void A(rb8 rb8, int i) {
        Q(e(), 1, new yv3(29));
    }

    public final void B(int i, xj8 xj8) {
        Q(O(i, xj8), 1027, new v64(15));
    }

    public final void C(o3b o3b, o3b o3b2, int i) {
        if (i == 1) {
            this.s0 = false;
        }
        u2 u2Var = this.Z;
        u2Var.getClass();
        z23 z23 = this.o;
        z23.d = z23.d(u2Var, (zw6) z23.a, (xj8) z23.e, (gue) z23.b);
        Q(e(), 11, new v64(29));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [ce8, xj8] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((com.google.android.exoplayer2.ExoPlaybackException) r3).s0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(com.google.android.exoplayer2.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0014
            com.google.android.exoplayer2.ExoPlaybackException r3 = (com.google.android.exoplayer2.ExoPlaybackException) r3
            ce8 r3 = r3.s0
            if (r3 == 0) goto L_0x0014
            xj8 r0 = new xj8
            r0.<init>(r3)
            ed r3 = r2.J(r0)
            goto L_0x0018
        L_0x0014:
            ed r3 = r2.e()
        L_0x0018:
            v64 r0 = new v64
            r1 = 17
            r0.<init>((int) r1)
            r1 = 10
            r2.Q(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h74.D(com.google.android.exoplayer2.PlaybackException):void");
    }

    public final void E(int i, xj8 xj8, pc8 pc8) {
        Q(O(i, xj8), 1004, new yv3(23));
    }

    public final void F(int i, xj8 xj8, pc8 pc8) {
        Q(O(i, xj8), 1005, new v64(25));
    }

    public final void G(sze sze, b0f b0f) {
        Q(e(), 2, new b74(1));
    }

    public final void H(j3b j3b) {
        Q(e(), 13, new v64(1));
    }

    public final void I(int i, xj8 xj8) {
        Q(O(i, xj8), 1025, new b74(20));
    }

    public final ed J(xj8 xj8) {
        this.Z.getClass();
        lue lue = xj8 == null ? null : (lue) ((cx6) this.o.c).get(xj8);
        if (xj8 != null && lue != null) {
            return L(lue, lue.h(xj8.a, this.b).c, xj8);
        }
        int p0 = this.Z.p0();
        lue O1 = this.Z.O1();
        if (p0 >= O1.p()) {
            O1 = lue.a;
        }
        return L(O1, p0, (xj8) null);
    }

    public final void K(int i, xj8 xj8) {
        Q(O(i, xj8), 1026, new b74(13));
    }

    public final ed L(lue lue, int i, xj8 xj8) {
        long j;
        lue lue2 = lue;
        int i2 = i;
        xj8 xj82 = lue.q() ? null : xj8;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = lue2.equals(this.Z.O1()) && i2 == this.Z.p0();
        long j2 = 0;
        if (xj82 == null || !xj82.a()) {
            if (z) {
                j = this.Z.b0();
                return new ed(elapsedRealtime, lue, i, xj82, j, this.Z.O1(), this.Z.p0(), (xj8) this.o.d, this.Z.k(), this.Z.q());
            } else if (!lue.q()) {
                j2 = maf.M(lue2.n(i2, this.c, 0).x0);
            }
        } else if (z && this.Z.o0() == xj82.b && this.Z.O() == xj82.c) {
            j2 = this.Z.k();
        }
        j = j2;
        return new ed(elapsedRealtime, lue, i, xj82, j, this.Z.O1(), this.Z.p0(), (xj8) this.o.d, this.Z.k(), this.Z.q());
    }

    public final void M(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        Q(O(i, xj8), MultiFileUploader.MSG_TRY_UPLOAD_NEXT, new yv3(18));
    }

    public final void N(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        Q(O(i, xj8), 1000, new v64(23));
    }

    public final ed O(int i, xj8 xj8) {
        this.Z.getClass();
        lue lue = lue.a;
        if (xj8 != null) {
            return ((lue) ((cx6) this.o.c).get(xj8)) != null ? J(xj8) : L(lue, i, xj8);
        }
        lue O1 = this.Z.O1();
        if (i < O1.p()) {
            lue = O1;
        }
        return L(lue, i, (xj8) null);
    }

    public final ed P() {
        return J((xj8) this.o.f);
    }

    public final void Q(ed edVar, int i, jm7 jm7) {
        this.X.put(i, edVar);
        this.Y.i(i, jm7);
    }

    public final void R(u2 u2Var, Looper looper) {
        np8.f(this.Z == null || ((zw6) this.o.a).isEmpty());
        u2Var.getClass();
        this.Z = u2Var;
        this.a.a(looper, (Handler.Callback) null);
        z23 z23 = this.Y;
        this.Y = new z23((CopyOnWriteArraySet) z23.d, looper, (rhe) z23.b, new q64(this, 0, u2Var));
    }

    public final void a(int i) {
        Q(e(), 6, new v64(19));
    }

    public final void b(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        Q(O(i, xj8), 1002, new b74(22));
    }

    public final void c(boolean z) {
        ed e = e();
        Q(e, 3, new b74(e, z));
    }

    public final void d(int i, boolean z) {
        Q(e(), 5, new yv3(13));
    }

    public final ed e() {
        return J((xj8) this.o.d);
    }

    public final void f(float f) {
        Q(P(), 22, new b74(6));
    }

    public final void g(int i, xj8 xj8, Exception exc) {
        Q(O(i, xj8), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new v64(27));
    }

    public final void h(int i) {
        Q(e(), 4, new v64(6));
    }

    public final void i(int i, boolean z) {
        Q(e(), 30, new b74(10));
    }

    public final void j(boolean z) {
        Q(P(), 23, new b74(16));
    }

    public final void k(List list) {
        Q(e(), 27, new v64(16));
    }

    public final void l(int i, boolean z) {
        Q(e(), -1, new yv3(19));
    }

    public final void m(int i, int i2) {
        Q(P(), 24, new yv3(24));
    }

    public final void n(boolean z) {
        Q(e(), 7, new b74(24));
    }

    public final void o(si4 si4) {
        Q(e(), 29, new b74(8));
    }

    public final void onRepeatModeChanged(int i) {
        Q(e(), 8, new v64(12));
    }

    public final void p() {
        Q(e(), -1, new yv3(22));
    }

    public final void q(fd8 fd8) {
        Q(e(), 14, new yv3(15));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ce8, xj8] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((com.google.android.exoplayer2.ExoPlaybackException) r3).s0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(com.google.android.exoplayer2.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto L_0x0015
            r0 = r3
            com.google.android.exoplayer2.ExoPlaybackException r0 = (com.google.android.exoplayer2.ExoPlaybackException) r0
            ce8 r0 = r0.s0
            if (r0 == 0) goto L_0x0015
            xj8 r1 = new xj8
            r1.<init>(r0)
            ed r0 = r2.J(r1)
            goto L_0x0019
        L_0x0015:
            ed r0 = r2.e()
        L_0x0019:
            q64 r1 = new q64
            r1.<init>((defpackage.ed) r0, (com.google.android.exoplayer2.PlaybackException) r3)
            r3 = 10
            r2.Q(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h74.r(com.google.android.exoplayer2.PlaybackException):void");
    }

    public final void s(e99 e99) {
        Q(e(), 28, new b74(11));
    }

    public final void t(r0f r0f) {
        Q(e(), 2, new yv3(26));
    }

    public final void u(int i, xj8 xj8, xn7 xn7, pc8 pc8, IOException iOException, boolean z) {
        ed O = O(i, xj8);
        Q(O, 1003, new t64(O, xn7, pc8, iOException, z));
    }

    public final void v(int i, xj8 xj8) {
        Q(O(i, xj8), 1023, new b74(18));
    }

    public final void w(b3b b3b) {
        Q(e(), 12, new yv3(16));
    }

    public final void x(int i) {
        u2 u2Var = this.Z;
        u2Var.getClass();
        z23 z23 = this.o;
        z23.d = z23.d(u2Var, (zw6) z23.a, (xj8) z23.e, (gue) z23.b);
        z23.j(u2Var.O1());
        Q(e(), 0, new b74(3));
    }

    public final void y(int i, xj8 xj8, int i2) {
        ed O = O(i, xj8);
        Q(O, 1022, new b74(O, i2));
    }

    public final void z(ilf ilf) {
        ed P = P();
        Q(P, 25, new f74(P, ilf));
    }
}
