package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: m4b  reason: default package */
public final class m4b {
    public static final m4b F;
    public static final String G = Integer.toString(1, 36);
    public static final String H = Integer.toString(2, 36);
    public static final String I = Integer.toString(3, 36);
    public static final String J = Integer.toString(4, 36);
    public static final String K = Integer.toString(5, 36);
    public static final String L = Integer.toString(6, 36);
    public static final String M = Integer.toString(7, 36);
    public static final String N = Integer.toString(8, 36);
    public static final String O = Integer.toString(9, 36);
    public static final String P = Integer.toString(10, 36);
    public static final String Q = Integer.toString(11, 36);
    public static final String R = Integer.toString(12, 36);
    public static final String S = Integer.toString(13, 36);
    public static final String T = Integer.toString(14, 36);
    public static final String U = Integer.toString(15, 36);
    public static final String V = Integer.toString(16, 36);
    public static final String W = Integer.toString(17, 36);
    public static final String X = Integer.toString(18, 36);
    public static final String Y = Integer.toString(19, 36);
    public static final String Z = Integer.toString(20, 36);
    public static final String a0 = Integer.toString(21, 36);
    public static final String b0 = Integer.toString(22, 36);
    public static final String c0 = Integer.toString(23, 36);
    public static final String d0 = Integer.toString(24, 36);
    public static final String e0 = Integer.toString(25, 36);
    public static final String f0 = Integer.toString(26, 36);
    public static final String g0 = Integer.toString(27, 36);
    public static final String h0 = Integer.toString(28, 36);
    public static final String i0 = Integer.toString(29, 36);
    public static final String j0 = Integer.toString(30, 36);
    public static final String k0 = Integer.toString(31, 36);
    public static final String l0 = Integer.toString(32, 36);
    public final long A;
    public final long B;
    public final long C;
    public final p0f D;
    public final j0f E;
    public final PlaybackException a;
    public final int b;
    public final qad c;
    public final p3b d;
    public final p3b e;
    public final int f;
    public final c3b g;
    public final int h;
    public final boolean i;
    public final mue j;
    public final int k;
    public final jlf l;
    public final gd8 m;
    public final float n;
    public final h30 o;
    public final zz3 p;
    public final ui4 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final gd8 z;

    static {
        qad qad = qad.l;
        p3b p3b = qad.k;
        c3b c3b = c3b.d;
        jlf jlf = jlf.e;
        fue fue = mue.a;
        gd8 gd8 = gd8.J;
        F = new m4b((PlaybackException) null, 0, qad, p3b, p3b, 0, c3b, 0, false, jlf, fue, 0, gd8, 1.0f, h30.g, zz3.c, ui4.e, 0, false, false, 1, 0, 1, false, false, gd8, MultiFileUploader.UPLOAD_NEXT_INTERVAL, 15000, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, p0f.b, j0f.C);
        int i2 = oaf.a;
    }

    public m4b(PlaybackException playbackException, int i2, qad qad, p3b p3b, p3b p3b2, int i3, c3b c3b, int i4, boolean z2, jlf jlf, mue mue, int i5, gd8 gd8, float f2, h30 h30, zz3 zz3, ui4 ui4, int i6, boolean z3, boolean z4, int i7, int i8, int i9, boolean z5, boolean z6, gd8 gd82, long j2, long j3, long j4, p0f p0f, j0f j0f) {
        this.a = playbackException;
        this.b = i2;
        this.c = qad;
        this.d = p3b;
        this.e = p3b2;
        this.f = i3;
        this.g = c3b;
        this.h = i4;
        this.i = z2;
        this.l = jlf;
        this.j = mue;
        this.k = i5;
        this.m = gd8;
        this.n = f2;
        this.o = h30;
        this.p = zz3;
        this.q = ui4;
        this.r = i6;
        this.s = z3;
        this.t = z4;
        this.u = i7;
        this.x = i8;
        this.y = i9;
        this.v = z5;
        this.w = z6;
        this.z = gd82;
        this.A = j2;
        this.B = j3;
        this.C = j4;
        this.D = p0f;
        this.E = j0f;
    }

    public static m4b r(int i2, Bundle bundle) {
        PlaybackException playbackException;
        fue fue;
        ffc ffc;
        zz3 zz3;
        ui4 b2;
        p0f p0f;
        ffc ffc2;
        ffc ffc3;
        int i3 = i2;
        Bundle bundle2 = bundle;
        IBinder binder = bundle2.getBinder(l0);
        if (binder instanceof l4b) {
            return ((l4b) binder).c;
        }
        Bundle bundle3 = bundle2.getBundle(X);
        Throwable th = null;
        if (bundle3 == null) {
            playbackException = null;
        } else {
            String string = bundle3.getString(PlaybackException.Y);
            String string2 = bundle3.getString(PlaybackException.Z);
            String string3 = bundle3.getString(PlaybackException.s0);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    if (Throwable.class.isAssignableFrom(cls)) {
                        th = (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string3});
                    }
                    if (th == null) {
                        th = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    th = new RemoteException(string3);
                }
            }
            Throwable th2 = th;
            int i4 = bundle3.getInt(PlaybackException.o, 1000);
            Bundle bundle4 = bundle3.getBundle(PlaybackException.t0);
            if (bundle4 == null) {
                bundle4 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th2, i4, bundle4, bundle3.getLong(PlaybackException.X, SystemClock.elapsedRealtime()));
        }
        int i5 = bundle2.getInt(Z, 0);
        Bundle bundle5 = bundle2.getBundle(Y);
        qad b3 = bundle5 == null ? qad.l : qad.b(bundle5);
        Bundle bundle6 = bundle2.getBundle(a0);
        p3b c2 = bundle6 == null ? qad.k : p3b.c(bundle6);
        Bundle bundle7 = bundle2.getBundle(b0);
        p3b c3 = bundle7 == null ? qad.k : p3b.c(bundle7);
        int i6 = bundle2.getInt(c0, 0);
        Bundle bundle8 = bundle2.getBundle(G);
        c3b c3b = bundle8 == null ? c3b.d : new c3b(bundle8.getFloat(c3b.e, 1.0f), bundle8.getFloat(c3b.f, 1.0f));
        int i7 = bundle2.getInt(H, 0);
        boolean z2 = bundle2.getBoolean(I, false);
        Bundle bundle9 = bundle2.getBundle(J);
        if (bundle9 == null) {
            fue = mue.a;
        } else {
            hme hme = new hme(9);
            IBinder binder2 = bundle9.getBinder(mue.b);
            if (binder2 == null) {
                ls5 ls5 = zw6.b;
                ffc2 = ffc.X;
            } else {
                ffc2 = nu0.i(hme, pu0.a(binder2));
            }
            hme hme2 = new hme(10);
            IBinder binder3 = bundle9.getBinder(mue.c);
            if (binder3 == null) {
                ls5 ls52 = zw6.b;
                ffc3 = ffc.X;
            } else {
                ffc3 = nu0.i(hme2, pu0.a(binder3));
            }
            int[] intArray = bundle9.getIntArray(mue.d);
            if (intArray == null) {
                int i8 = ffc2.o;
                int[] iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
                intArray = iArr;
            }
            fue = new iue(ffc2, ffc3, intArray);
        }
        int i10 = bundle2.getInt(k0, 0);
        Bundle bundle10 = bundle2.getBundle(K);
        jlf jlf = bundle10 == null ? jlf.e : new jlf(bundle10.getFloat(jlf.i, 1.0f), bundle10.getInt(jlf.f, 0), bundle10.getInt(jlf.g, 0), bundle10.getInt(jlf.h, 0));
        Bundle bundle11 = bundle2.getBundle(L);
        gd8 b4 = bundle11 == null ? gd8.J : gd8.b(bundle11);
        float f2 = bundle2.getFloat(M, 1.0f);
        Bundle bundle12 = bundle2.getBundle(N);
        h30 a2 = bundle12 == null ? h30.g : h30.a(bundle12);
        Bundle bundle13 = bundle2.getBundle(d0);
        if (bundle13 == null) {
            zz3 = zz3.c;
        } else {
            ArrayList parcelableArrayList = bundle13.getParcelableArrayList(zz3.d);
            if (parcelableArrayList == null) {
                ffc = ffc.X;
            } else {
                ww6 i11 = zw6.i();
                for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                    Bundle bundle14 = (Bundle) parcelableArrayList.get(i12);
                    bundle14.getClass();
                    i11.a(yz3.a(bundle14));
                }
                ffc = i11.j();
            }
            zz3 = new zz3(bundle13.getLong(zz3.e), ffc);
        }
        zz3 zz32 = zz3;
        Bundle bundle15 = bundle2.getBundle(O);
        if (bundle15 == null) {
            b2 = ui4.e;
        } else {
            int i13 = bundle15.getInt(ui4.f, 0);
            int i14 = bundle15.getInt(ui4.g, 0);
            int i15 = bundle15.getInt(ui4.h, 0);
            String string4 = bundle15.getString(ui4.i);
            sv0 sv0 = new sv0(i13);
            sv0.c = i14;
            sv0.d = i15;
            fm9.f(i13 != 0 || string4 == null);
            sv0.e = string4;
            b2 = sv0.b();
        }
        ui4 ui4 = b2;
        int i16 = bundle2.getInt(P, 0);
        boolean z3 = bundle2.getBoolean(Q, false);
        boolean z4 = bundle2.getBoolean(R, false);
        int i17 = bundle2.getInt(S, 1);
        int i18 = bundle2.getInt(T, 0);
        int i19 = bundle2.getInt(U, 1);
        boolean z5 = bundle2.getBoolean(V, false);
        boolean z6 = bundle2.getBoolean(W, false);
        Bundle bundle16 = bundle2.getBundle(e0);
        gd8 b5 = bundle16 == null ? gd8.J : gd8.b(bundle16);
        long j2 = 0;
        long j3 = bundle2.getLong(f0, i3 < 4 ? 0 : MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        long j4 = bundle2.getLong(g0, i3 < 4 ? 0 : 15000);
        if (i3 >= 4) {
            j2 = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        }
        long j5 = bundle2.getLong(h0, j2);
        Bundle bundle17 = bundle2.getBundle(j0);
        if (bundle17 == null) {
            p0f = p0f.b;
        } else {
            ArrayList parcelableArrayList2 = bundle17.getParcelableArrayList(p0f.c);
            p0f = new p0f(parcelableArrayList2 == null ? ffc.X : nu0.i(new hme(21), parcelableArrayList2));
        }
        Bundle bundle18 = bundle2.getBundle(i0);
        return new m4b(playbackException, i5, b3, c2, c3, i6, c3b, i7, z2, jlf, fue, i10, b4, f2, a2, zz32, ui4, i16, z3, z4, i17, i18, i19, z5, z6, b5, j3, j4, j5, p0f, bundle18 == null ? j0f.C : j0f.b(bundle18));
    }

    public final m4b a(h30 h30) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, h30, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b b(p0f p0f) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, p0f, this.E);
    }

    public final m4b c(int i2, boolean z2) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, i2, z2, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b d(int i2, int i3, boolean z2) {
        boolean z3 = false;
        boolean z4 = this.y == 3 && z2 && i3 == 0;
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        if (q2 || qad.a.b < mue.p()) {
            z3 = true;
        }
        fm9.k(z3);
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z2, i2, i3, this.y, z4, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b e(c3b c3b) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, c3b, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b f(int i2, PlaybackException playbackException) {
        boolean z2 = false;
        boolean z3 = i2 == 3 && this.t && this.x == 0;
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        if (q2 || qad.a.b < mue.p()) {
            z2 = true;
        }
        fm9.k(z2);
        m4b m4b = r4;
        m4b m4b2 = new m4b(playbackException, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, i2, z3, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        return m4b;
    }

    public final m4b g(gd8 gd8) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, gd8, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b h(p3b p3b, p3b p3b2, int i2) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, p3b, p3b2, i2, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b i(int i2) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, i2, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b j(qad qad) {
        mue mue = this.j;
        fm9.k(mue.q() || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b k(boolean z2) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, z2, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final m4b l(mue mue) {
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        m4b m4b = r2;
        m4b m4b2 = new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
        return m4b;
    }

    public final m4b m(xqb xqb, int i2) {
        p3b p3b = r14;
        qad qad = this.c;
        p3b p3b2 = qad.a;
        p3b p3b3 = new p3b(p3b2.a, i2, p3b2.c, p3b2.d, p3b2.e, p3b2.f, p3b2.g, p3b2.h, p3b2.i);
        qad qad2 = r1;
        qad qad3 = new qad(p3b, qad.b, qad.c, qad.d, qad.e, qad.f, qad.g, qad.h, qad.i, qad.j);
        fm9.k(xqb.q() || qad2.a.b < xqb.p());
        qad qad4 = qad2;
        p0f p0f = this.D;
        j0f j0f = this.E;
        return new m4b(this.a, this.b, qad4, this.d, this.e, this.f, this.g, this.h, this.i, this.l, xqb, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, p0f, j0f);
    }

    public final m4b n(mue mue, qad qad, int i2) {
        boolean z2;
        if (mue.q()) {
            qad qad2 = qad;
        } else if (qad.a.b >= mue.p()) {
            z2 = false;
            fm9.k(z2);
            p0f p0f = this.D;
            j0f j0f = this.E;
            return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, i2, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, p0f, j0f);
        }
        z2 = true;
        fm9.k(z2);
        p0f p0f2 = this.D;
        j0f j0f2 = this.E;
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, i2, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, p0f2, j0f2);
    }

    public final m4b o(j0f j0f) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, j0f);
    }

    public final m4b p(float f2) {
        mue mue = this.j;
        boolean q2 = mue.q();
        qad qad = this.c;
        fm9.k(q2 || qad.a.b < mue.p());
        return new m4b(this.a, this.b, qad, this.d, this.e, this.f, this.g, this.h, this.i, this.l, mue, this.k, this.m, f2, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.m4b q(defpackage.k3b r41, boolean r42, boolean r43) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = 16
            boolean r2 = r1.a(r2)
            r3 = 17
            boolean r3 = r1.a(r3)
            qad r4 = r0.c
            qad r8 = r4.a(r2, r3)
            p3b r5 = r0.d
            p3b r9 = r5.b(r2, r3)
            p3b r5 = r0.e
            p3b r10 = r5.b(r2, r3)
            r5 = 1
            mue r6 = r0.j
            r7 = 0
            if (r3 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            boolean r2 = r6.q()
            if (r2 != 0) goto L_0x007c
            p3b r2 = r4.a
            int r2 = r2.b
            int r3 = r6.p()
            if (r3 != r5) goto L_0x003b
            goto L_0x0079
        L_0x003b:
            kue r3 = new kue
            r3.<init>()
            r11 = 0
            kue r2 = r6.n(r2, r3, r11)
            ww6 r3 = defpackage.zw6.i()
            int r4 = r2.n
        L_0x004c:
            int r11 = r2.o
            if (r4 > r11) goto L_0x0061
            hue r11 = new hue
            r11.<init>()
            hue r11 = r6.g(r4, r11, r5)
            r11.c = r7
            r3.a(r11)
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0061:
            int r4 = r2.n
            int r11 = r11 - r4
            r2.o = r11
            r2.n = r7
            iue r6 = new iue
            ffc r2 = defpackage.zw6.n(r2)
            ffc r3 = r3.j()
            int[] r4 = new int[]{r7}
            r6.<init>(r2, r3, r4)
        L_0x0079:
            r16 = r6
            goto L_0x0084
        L_0x007c:
            if (r42 != 0) goto L_0x0080
            if (r3 != 0) goto L_0x0079
        L_0x0080:
            fue r2 = defpackage.mue.a
            r16 = r2
        L_0x0084:
            r2 = 18
            boolean r3 = r1.a(r2)
            if (r3 != 0) goto L_0x0091
            gd8 r3 = defpackage.gd8.J
        L_0x008e:
            r18 = r3
            goto L_0x0094
        L_0x0091:
            gd8 r3 = r0.m
            goto L_0x008e
        L_0x0094:
            r3 = 22
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00a1
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x009e:
            r19 = r3
            goto L_0x00a4
        L_0x00a1:
            float r3 = r0.n
            goto L_0x009e
        L_0x00a4:
            r3 = 21
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00b1
            h30 r3 = defpackage.h30.g
        L_0x00ae:
            r20 = r3
            goto L_0x00b4
        L_0x00b1:
            h30 r3 = r0.o
            goto L_0x00ae
        L_0x00b4:
            r3 = 28
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00c1
            zz3 r3 = defpackage.zz3.c
        L_0x00be:
            r21 = r3
            goto L_0x00c4
        L_0x00c1:
            zz3 r3 = r0.p
            goto L_0x00be
        L_0x00c4:
            r3 = 23
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x00d1
            r23 = r7
            r24 = r23
            goto L_0x00d9
        L_0x00d1:
            int r3 = r0.r
            boolean r4 = r0.s
            r23 = r3
            r24 = r4
        L_0x00d9:
            boolean r2 = r1.a(r2)
            if (r2 != 0) goto L_0x00e4
            gd8 r2 = defpackage.gd8.J
        L_0x00e1:
            r31 = r2
            goto L_0x00e7
        L_0x00e4:
            gd8 r2 = r0.z
            goto L_0x00e1
        L_0x00e7:
            if (r43 != 0) goto L_0x00f7
            r2 = 30
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            p0f r1 = r0.D
        L_0x00f4:
            r38 = r1
            goto L_0x00fa
        L_0x00f7:
            p0f r1 = defpackage.p0f.b
            goto L_0x00f4
        L_0x00fa:
            boolean r1 = r16.q()
            if (r1 != 0) goto L_0x010c
            p3b r1 = r8.a
            int r1 = r1.b
            int r2 = r16.p()
            if (r1 >= r2) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r5 = r7
        L_0x010c:
            defpackage.fm9.k(r5)
            m4b r1 = new m4b
            r5 = r1
            long r2 = r0.C
            r36 = r2
            j0f r2 = r0.E
            r39 = r2
            androidx.media3.common.PlaybackException r6 = r0.a
            int r7 = r0.b
            int r11 = r0.f
            c3b r12 = r0.g
            int r13 = r0.h
            boolean r14 = r0.i
            jlf r15 = r0.l
            int r2 = r0.k
            r17 = r2
            ui4 r2 = r0.q
            r22 = r2
            boolean r2 = r0.t
            r25 = r2
            int r2 = r0.u
            r26 = r2
            int r2 = r0.x
            r27 = r2
            int r2 = r0.y
            r28 = r2
            boolean r2 = r0.v
            r29 = r2
            boolean r2 = r0.w
            r30 = r2
            long r2 = r0.A
            r32 = r2
            long r2 = r0.B
            r34 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4b.q(k3b, boolean, boolean):m4b");
    }

    public final tb8 s() {
        mue mue = this.j;
        if (mue.q()) {
            return null;
        }
        return mue.n(this.c.a.b, new kue(), 0).c;
    }

    public final Bundle t(int i2) {
        long j2;
        long j3;
        int i3;
        Bundle bundle;
        hue hue;
        int i4;
        long j4;
        tb8[] tb8Arr;
        Bundle bundle2;
        int i5 = i2;
        Bundle bundle3 = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            bundle3.putBundle(X, playbackException.c());
        }
        int i6 = this.b;
        if (i6 != 0) {
            bundle3.putInt(Z, i6);
        }
        qad qad = this.c;
        if (i5 < 3 || !qad.equals(qad.l)) {
            bundle3.putBundle(Y, qad.c(i5));
        }
        p3b p3b = this.d;
        if (i5 < 3 || !qad.k.a(p3b)) {
            bundle3.putBundle(a0, p3b.d(i5));
        }
        p3b p3b2 = this.e;
        if (i5 < 3 || !qad.k.a(p3b2)) {
            bundle3.putBundle(b0, p3b2.d(i5));
        }
        int i7 = this.f;
        if (i7 != 0) {
            bundle3.putInt(c0, i7);
        }
        c3b c3b = c3b.d;
        c3b c3b2 = this.g;
        if (!c3b2.equals(c3b)) {
            Bundle bundle4 = new Bundle();
            bundle4.putFloat(c3b.e, c3b2.a);
            bundle4.putFloat(c3b.f, c3b2.b);
            bundle3.putBundle(G, bundle4);
        }
        int i8 = this.h;
        if (i8 != 0) {
            bundle3.putInt(H, i8);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle3.putBoolean(I, z2);
        }
        fue fue = mue.a;
        mue mue = this.j;
        boolean z3 = false;
        long j5 = 0;
        if (!mue.equals(fue)) {
            ArrayList arrayList = new ArrayList();
            int p2 = mue.p();
            kue kue = new kue();
            int i9 = 0;
            while (true) {
                j3 = -9223372036854775807L;
                if (i9 >= p2) {
                    break;
                }
                kue n2 = mue.n(i9, kue, j5);
                n2.getClass();
                Bundle bundle5 = new Bundle();
                if (!tb8.g.equals(n2.c)) {
                    bundle5.putBundle(kue.t, n2.c.d(false));
                }
                long j6 = n2.e;
                if (j6 != -9223372036854775807L) {
                    bundle5.putLong(kue.u, j6);
                }
                long j7 = n2.f;
                if (j7 != -9223372036854775807L) {
                    bundle5.putLong(kue.v, j7);
                }
                long j8 = n2.g;
                if (j8 != -9223372036854775807L) {
                    bundle5.putLong(kue.w, j8);
                }
                boolean z4 = n2.h;
                if (z4) {
                    bundle5.putBoolean(kue.x, z4);
                }
                boolean z5 = n2.i;
                if (z5) {
                    bundle5.putBoolean(kue.y, z5);
                }
                hb8 hb8 = n2.j;
                if (hb8 != null) {
                    bundle5.putBundle(kue.z, hb8.c());
                }
                boolean z6 = n2.k;
                if (z6) {
                    bundle5.putBoolean(kue.A, z6);
                }
                long j9 = n2.l;
                if (j9 != 0) {
                    bundle5.putLong(kue.B, j9);
                }
                long j10 = n2.m;
                if (j10 != -9223372036854775807L) {
                    bundle5.putLong(kue.C, j10);
                }
                int i10 = n2.n;
                if (i10 != 0) {
                    bundle5.putInt(kue.D, i10);
                }
                int i11 = n2.o;
                if (i11 != 0) {
                    bundle5.putInt(kue.E, i11);
                }
                long j11 = n2.p;
                if (j11 != 0) {
                    bundle5.putLong(kue.F, j11);
                }
                arrayList.add(bundle5);
                i9++;
                j5 = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            int i12 = mue.i();
            hue hue2 = new hue();
            int i13 = 0;
            while (i13 < i12) {
                hue g2 = mue.g(i13, hue2, z3);
                g2.getClass();
                Bundle bundle6 = new Bundle();
                int i14 = g2.c;
                if (i14 != 0) {
                    bundle6.putInt(hue.h, i14);
                }
                int i15 = i12;
                hue hue3 = hue2;
                long j12 = g2.d;
                if (j12 != j3) {
                    bundle6.putLong(hue.i, j12);
                }
                long j13 = g2.e;
                if (j13 != 0) {
                    bundle6.putLong(hue.j, j13);
                }
                boolean z7 = g2.f;
                if (z7) {
                    bundle6.putBoolean(hue.k, z7);
                }
                if (!g2.g.equals(s8.g)) {
                    s8 s8Var = g2.g;
                    s8Var.getClass();
                    Bundle bundle7 = new Bundle();
                    ArrayList arrayList3 = new ArrayList();
                    q8[] q8VarArr = s8Var.f;
                    int length = q8VarArr.length;
                    i4 = i15;
                    int i16 = 0;
                    while (i16 < length) {
                        int i17 = length;
                        q8 q8Var = q8VarArr[i16];
                        q8Var.getClass();
                        q8[] q8VarArr2 = q8VarArr;
                        Bundle bundle8 = new Bundle();
                        hue hue4 = hue3;
                        bundle8.putLong(q8.j, q8Var.a);
                        bundle8.putInt(q8.k, q8Var.b);
                        bundle8.putInt(q8.q, q8Var.c);
                        bundle8.putParcelableArrayList(q8.l, new ArrayList(Arrays.asList(q8Var.d)));
                        ArrayList arrayList4 = new ArrayList();
                        tb8[] tb8Arr2 = q8Var.e;
                        int length2 = tb8Arr2.length;
                        Bundle bundle9 = bundle3;
                        int i18 = 0;
                        while (i18 < length2) {
                            int i19 = length2;
                            tb8 tb8 = tb8Arr2[i18];
                            if (tb8 == null) {
                                bundle2 = null;
                                tb8Arr = tb8Arr2;
                            } else {
                                tb8Arr = tb8Arr2;
                                bundle2 = tb8.d(true);
                            }
                            arrayList4.add(bundle2);
                            i18++;
                            length2 = i19;
                            tb8Arr2 = tb8Arr;
                        }
                        bundle8.putParcelableArrayList(q8.r, arrayList4);
                        bundle8.putIntArray(q8.m, q8Var.f);
                        bundle8.putLongArray(q8.n, q8Var.g);
                        bundle8.putLong(q8.o, q8Var.h);
                        bundle8.putBoolean(q8.p, q8Var.i);
                        arrayList3.add(bundle8);
                        i16++;
                        int i20 = i2;
                        length = i17;
                        q8VarArr = q8VarArr2;
                        hue3 = hue4;
                        bundle3 = bundle9;
                    }
                    bundle = bundle3;
                    hue = hue3;
                    if (!arrayList3.isEmpty()) {
                        bundle7.putParcelableArrayList(s8.i, arrayList3);
                    }
                    long j14 = s8Var.c;
                    if (j14 != 0) {
                        bundle7.putLong(s8.j, j14);
                    }
                    long j15 = s8Var.d;
                    j4 = -9223372036854775807L;
                    if (j15 != -9223372036854775807L) {
                        bundle7.putLong(s8.k, j15);
                    }
                    int i21 = s8Var.e;
                    if (i21 != 0) {
                        bundle7.putInt(s8.l, i21);
                    }
                    bundle6.putBundle(hue.l, bundle7);
                } else {
                    bundle = bundle3;
                    i4 = i15;
                    hue = hue3;
                    j4 = -9223372036854775807L;
                }
                arrayList2.add(bundle6);
                i13++;
                int i22 = i2;
                j3 = j4;
                i12 = i4;
                hue2 = hue;
                bundle3 = bundle;
                z3 = false;
            }
            Bundle bundle10 = bundle3;
            j2 = 0;
            int[] iArr = new int[p2];
            boolean z8 = true;
            if (p2 > 0) {
                i3 = 0;
                iArr[0] = mue.a(true);
            } else {
                i3 = 0;
            }
            int i23 = 1;
            while (i23 < p2) {
                iArr[i23] = mue.e(iArr[i23 - 1], i3, z8);
                i23++;
                z8 = true;
                i3 = 0;
            }
            Bundle bundle11 = new Bundle();
            bundle11.putBinder(mue.b, new pu0(arrayList));
            bundle11.putBinder(mue.c, new pu0(arrayList2));
            bundle11.putIntArray(mue.d, iArr);
            bundle3 = bundle10;
            bundle3.putBundle(J, bundle11);
        } else {
            j2 = 0;
        }
        int i24 = this.k;
        if (i24 != 0) {
            bundle3.putInt(k0, i24);
        }
        jlf jlf = jlf.e;
        jlf jlf2 = this.l;
        if (!jlf2.equals(jlf)) {
            Bundle bundle12 = new Bundle();
            bundle12.putInt(jlf.f, jlf2.a);
            bundle12.putInt(jlf.g, jlf2.b);
            bundle12.putInt(jlf.h, jlf2.c);
            bundle12.putFloat(jlf.i, jlf2.d);
            bundle3.putBundle(K, bundle12);
        }
        gd8 gd8 = gd8.J;
        gd8 gd82 = this.m;
        if (!gd82.equals(gd8)) {
            bundle3.putBundle(L, gd82.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle3.putFloat(M, f2);
        }
        h30 h30 = h30.g;
        h30 h302 = this.o;
        if (!h302.equals(h30)) {
            bundle3.putBundle(N, h302.c());
        }
        zz3 zz3 = zz3.c;
        zz3 zz32 = this.p;
        if (!zz32.equals(zz3)) {
            Bundle bundle13 = new Bundle();
            ww6 i25 = zw6.i();
            int i26 = 0;
            while (true) {
                zw6 zw6 = zz32.a;
                if (i26 >= zw6.size()) {
                    break;
                }
                if (((yz3) zw6.get(i26)).d == null) {
                    i25.a((yz3) zw6.get(i26));
                }
                i26++;
            }
            ffc j16 = i25.j();
            ArrayList arrayList5 = new ArrayList(j16.o);
            ls5 l2 = j16.listIterator(0);
            while (l2.hasNext()) {
                yz3 yz3 = (yz3) l2.next();
                Bundle b2 = yz3.b();
                Bitmap bitmap = yz3.d;
                if (bitmap != null) {
                    b2.putParcelable(yz3.v, bitmap);
                }
                arrayList5.add(b2);
            }
            bundle13.putParcelableArrayList(zz3.d, arrayList5);
            bundle13.putLong(zz3.e, zz32.b);
            bundle3.putBundle(d0, bundle13);
        }
        ui4 ui4 = ui4.e;
        ui4 ui42 = this.q;
        if (!ui42.equals(ui4)) {
            Bundle bundle14 = new Bundle();
            int i27 = ui42.a;
            if (i27 != 0) {
                bundle14.putInt(ui4.f, i27);
            }
            int i28 = ui42.b;
            if (i28 != 0) {
                bundle14.putInt(ui4.g, i28);
            }
            int i29 = ui42.c;
            if (i29 != 0) {
                bundle14.putInt(ui4.h, i29);
            }
            String str = ui42.d;
            if (str != null) {
                bundle14.putString(ui4.i, str);
            }
            bundle3.putBundle(O, bundle14);
        }
        int i30 = this.r;
        if (i30 != 0) {
            bundle3.putInt(P, i30);
        }
        boolean z9 = this.s;
        if (z9) {
            bundle3.putBoolean(Q, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            bundle3.putBoolean(R, z10);
        }
        int i31 = this.u;
        if (i31 != 1) {
            bundle3.putInt(S, i31);
        }
        int i32 = this.x;
        if (i32 != 0) {
            bundle3.putInt(T, i32);
        }
        int i33 = this.y;
        if (i33 != 1) {
            bundle3.putInt(U, i33);
        }
        boolean z11 = this.v;
        if (z11) {
            bundle3.putBoolean(V, z11);
        }
        boolean z12 = this.w;
        if (z12) {
            bundle3.putBoolean(W, z12);
        }
        gd8 gd83 = gd8.J;
        gd8 gd84 = this.z;
        if (!gd84.equals(gd83)) {
            bundle3.putBundle(e0, gd84.c());
        }
        int i34 = i2;
        long j17 = i34 < 6 ? j2 : MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        long j18 = this.A;
        if (j18 != j17) {
            bundle3.putLong(f0, j18);
        }
        long j19 = i34 < 6 ? j2 : 15000;
        long j20 = this.B;
        if (j20 != j19) {
            bundle3.putLong(g0, j20);
        }
        long j21 = i34 < 6 ? j2 : CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        long j22 = this.C;
        if (j22 != j21) {
            bundle3.putLong(h0, j22);
        }
        p0f p0f = p0f.b;
        p0f p0f2 = this.D;
        if (!p0f2.equals(p0f)) {
            Bundle bundle15 = new Bundle();
            bundle15.putParcelableArrayList(p0f.c, nu0.R(p0f2.a, new hme(20)));
            bundle3.putBundle(j0, bundle15);
        }
        j0f j0f = j0f.C;
        j0f j0f2 = this.E;
        if (!j0f2.equals(j0f)) {
            bundle3.putBundle(i0, j0f2.c());
        }
        return bundle3;
    }
}
