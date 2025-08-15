package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: i74  reason: default package */
public final class i74 implements n3b, ik8, nr4 {
    public final SparseArray X;
    public pm7 Y;
    public q3b Z;
    public final she a;
    public final hue b;
    public final kue c = new kue();
    public final ai3 o;
    public bie s0;
    public boolean t0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, ai3] */
    public i74(she she) {
        she.getClass();
        this.a = she;
        this.Y = new pm7(oaf.w(), she, new v64(2));
        hue hue = new hue();
        this.b = hue;
        ? obj = new Object();
        obj.a = hue;
        ls5 ls5 = zw6.b;
        obj.b = ffc.X;
        obj.c = kfc.s0;
        this.o = obj;
        this.X = new SparseArray();
    }

    public final void A(int i, yj8 yj8, pc8 pc8) {
        fd E = E(i, yj8);
        I(E, 1005, new g74(E, pc8, 0));
    }

    public final fd B(mue mue, int i, yj8 yj8) {
        long j;
        mue mue2 = mue;
        int i2 = i;
        yj8 yj82 = mue.q() ? null : yj8;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = mue2.equals(this.Z.x0()) && i2 == this.Z.p0();
        long j2 = 0;
        if (yj82 == null || !yj82.b()) {
            if (z) {
                j = this.Z.b0();
                return new fd(elapsedRealtime, mue, i, yj82, j, this.Z.x0(), this.Z.p0(), (yj8) this.o.o, this.Z.k(), this.Z.q());
            } else if (!mue.q()) {
                j2 = oaf.h0(mue2.n(i2, this.c, 0).l);
            }
        } else if (z && this.Z.o0() == yj82.b && this.Z.O() == yj82.c) {
            j2 = this.Z.k();
        }
        j = j2;
        return new fd(elapsedRealtime, mue, i, yj82, j, this.Z.x0(), this.Z.p0(), (yj8) this.o.o, this.Z.k(), this.Z.q());
    }

    public final void C(int i, yj8 yj8) {
        fd E = E(i, yj8);
        I(E, 1026, new w64(E, 4));
    }

    public final void D(int i, yj8 yj8) {
        fd E = E(i, yj8);
        I(E, 1023, new w64(E, 6));
    }

    public final fd E(int i, yj8 yj8) {
        this.Z.getClass();
        if (yj8 != null) {
            return ((mue) ((cx6) this.o.c).get(yj8)) != null ? g(yj8) : B(mue.a, i, yj8);
        }
        mue x0 = this.Z.x0();
        if (i >= x0.p()) {
            x0 = mue.a;
        }
        return B(x0, i, (yj8) null);
    }

    public final fd F() {
        return g((yj8) this.o.Y);
    }

    public final void G(int i, tb8 tb8) {
        fd b2 = b();
        I(b2, 1, new s64(b2, tb8, i));
    }

    public final void H(int i, yj8 yj8) {
        fd E = E(i, yj8);
        I(E, 1027, new w64(E, 3));
    }

    public final void I(fd fdVar, int i, km7 km7) {
        this.X.put(i, fdVar);
        this.Y.f(i, km7);
    }

    public final void J(q3b q3b, Looper looper) {
        fm9.k(this.Z == null || ((zw6) this.o.b).isEmpty());
        this.Z = q3b;
        this.s0 = this.a.a(looper, (Handler.Callback) null);
        pm7 pm7 = this.Y;
        Looper looper2 = looper;
        this.Y = new pm7(pm7.d, looper2, pm7.a, new f9(this, 25, q3b), pm7.i);
    }

    public final void L(int i, yj8 yj8, pc8 pc8) {
        fd E = E(i, yj8);
        I(E, 1004, new g74(E, pc8, 1));
    }

    public final void O(boolean z) {
        fd b2 = b();
        I(b2, 9, new p64(b2, z, 2));
    }

    public final void S(zz3 zz3) {
        I(b(), 27, new v64(20));
    }

    public final void X(p0f p0f) {
        fd b2 = b();
        I(b2, 2, new f9(b2, 27, p0f));
    }

    public final void Y(q3b q3b, l3b l3b) {
    }

    public final void a(int i) {
        fd b2 = b();
        I(b2, 6, new s64(b2, i, 0));
    }

    public final void a0(long j) {
        I(b(), 16, new b74(14));
    }

    public final fd b() {
        return g((yj8) this.o.o);
    }

    public final void b0(gd8 gd8) {
        I(b(), 14, new b74(7));
    }

    public final void c(boolean z) {
        fd b2 = b();
        I(b2, 3, new p64(b2, z, 3));
    }

    public final void c0(gd8 gd8) {
        I(b(), 15, new b74(5));
    }

    public final void d(int i, boolean z) {
        fd b2 = b();
        I(b2, 5, new u64(b2, z, i));
    }

    public final void d0(long j) {
        I(b(), 17, new b74(17));
    }

    public final void e(int i, yj8 yj8, yn7 yn7, pc8 pc8, IOException iOException, boolean z) {
        fd E = E(i, yj8);
        I(E, 1003, new t64(E, yn7, pc8, iOException, z));
    }

    public final void f(float f) {
        fd F = F();
        I(F, 22, new c74(F, f));
    }

    public final void f0(mue mue, int i) {
        q3b q3b = this.Z;
        q3b.getClass();
        ai3 ai3 = this.o;
        ai3.o = ai3.d(q3b, (zw6) ai3.b, (yj8) ai3.X, (hue) ai3.a);
        ai3.i(q3b.x0());
        fd b2 = b();
        I(b2, 0, new s64(b2, i, 5));
    }

    public final fd g(yj8 yj8) {
        this.Z.getClass();
        mue mue = yj8 == null ? null : (mue) ((cx6) this.o.c).get(yj8);
        if (yj8 != null && mue != null) {
            return B(mue, mue.h(yj8.a, this.b).c, yj8);
        }
        int p0 = this.Z.p0();
        mue x0 = this.Z.x0();
        if (p0 >= x0.p()) {
            x0 = mue.a;
        }
        return B(x0, p0, (yj8) null);
    }

    public final void h(int i) {
        fd b2 = b();
        I(b2, 4, new s64(b2, i, 2));
    }

    public final void i(int i, boolean z) {
        I(b(), 30, new yv3(28));
    }

    public final void i0() {
    }

    public final void j(boolean z) {
        fd F = F();
        I(F, 23, new p64(F, z, 1));
    }

    public final void k(List list) {
        I(b(), 27, new v64(0));
    }

    public final void l(int i, boolean z) {
        I(b(), -1, new yv3(17));
    }

    public final void m(int i, int i2) {
        fd F = F();
        I(F, 24, new a74(i, i2, F));
    }

    public final void n(boolean z) {
        fd b2 = b();
        I(b2, 7, new p64(b2, z, 0));
    }

    public final void o(boolean z) {
    }

    public final void onRepeatModeChanged(int i) {
        fd b2 = b();
        I(b2, 8, new s64(b2, i, 3));
    }

    public final void p(int i) {
    }

    public final void p0(c3b c3b) {
        fd b2 = b();
        I(b2, 12, new f9(b2, 24, c3b));
    }

    public final void q(p3b p3b, p3b p3b2, int i) {
        if (i == 1) {
            this.t0 = false;
        }
        q3b q3b = this.Z;
        q3b.getClass();
        ai3 ai3 = this.o;
        ai3.o = ai3.d(q3b, (zw6) ai3.b, (yj8) ai3.X, (hue) ai3.a);
        fd b2 = b();
        I(b2, 11, new id0((Object) b2, i, (Object) p3b, (Object) p3b2));
    }

    public final void q0(k3b k3b) {
        I(b(), 13, new b74(0));
    }

    public final void r(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        fd E = E(i, yj8);
        I(E, 1002, new b74(E, yn7, pc8, 21));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((androidx.media3.exoplayer.ExoPlaybackException) r3).z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r0(androidx.media3.common.PlaybackException r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r0 == 0) goto L_0x000f
            androidx.media3.exoplayer.ExoPlaybackException r3 = (androidx.media3.exoplayer.ExoPlaybackException) r3
            yj8 r3 = r3.z0
            if (r3 == 0) goto L_0x000f
            fd r3 = r2.g(r3)
            goto L_0x0013
        L_0x000f:
            fd r3 = r2.b()
        L_0x0013:
            yv3 r0 = new yv3
            r1 = 27
            r0.<init>(r1)
            r1 = 10
            r2.I(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i74.r0(androidx.media3.common.PlaybackException):void");
    }

    public final void s(int i, yj8 yj8, Exception exc) {
        fd E = E(i, yj8);
        I(E, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, new d74(E, 2, exc));
    }

    public final void s0(f99 f99) {
        fd b2 = b();
        I(b2, 28, new f9(b2, 26, f99));
    }

    public final void t(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        fd E = E(i, yj8);
        I(E, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, new b74(E, yn7, pc8, 23));
    }

    public final void t0(ui4 ui4) {
        I(b(), 29, new v64(8));
    }

    public final void u(h30 h30) {
        fd F = F();
        I(F, 20, new d74(F, 0, h30));
    }

    public final void u0(long j) {
        I(b(), 18, new b74(15));
    }

    public final void v(jlf jlf) {
        fd F = F();
        I(F, 25, new d74(F, 1, jlf));
    }

    public final void w(int i, yj8 yj8, int i2) {
        fd E = E(i, yj8);
        I(E, 1022, new s64(E, i2, 4));
    }

    public final void x(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        fd E = E(i, yj8);
        I(E, 1000, new b74(E, yn7, pc8, 19));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.media3.exoplayer.ExoPlaybackException) r4).z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x0(androidx.media3.common.PlaybackException r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r0 == 0) goto L_0x0010
            r0 = r4
            androidx.media3.exoplayer.ExoPlaybackException r0 = (androidx.media3.exoplayer.ExoPlaybackException) r0
            yj8 r0 = r0.z0
            if (r0 == 0) goto L_0x0010
            fd r0 = r3.g(r0)
            goto L_0x0014
        L_0x0010:
            fd r0 = r3.b()
        L_0x0014:
            f9 r1 = new f9
            r2 = 28
            r1.<init>(r0, r2, r4)
            r4 = 10
            r3.I(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i74.x0(androidx.media3.common.PlaybackException):void");
    }

    public final void y(j0f j0f) {
        I(b(), 19, new v64(26));
    }

    public final void z(int i, yj8 yj8) {
        fd E = E(i, yj8);
        I(E, 1025, new w64(E, 5));
    }
}
