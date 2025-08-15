package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* renamed from: a3b  reason: default package */
public final class a3b {
    public static final yj8 u = new yj8(new Object());
    public final mue a;
    public final yj8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final tze h;
    public final l0f i;
    public final List j;
    public final yj8 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final c3b o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public a3b(mue mue, yj8 yj8, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, tze tze, l0f l0f, List list, yj8 yj82, boolean z2, int i3, int i4, c3b c3b, long j4, long j5, long j6, long j7, boolean z3) {
        this.a = mue;
        this.b = yj8;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = tze;
        this.i = l0f;
        this.j = list;
        this.k = yj82;
        this.l = z2;
        this.m = i3;
        this.n = i4;
        this.o = c3b;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.t = j7;
        this.p = z3;
    }

    public static a3b i(l0f l0f) {
        fue fue = mue.a;
        yj8 yj8 = u;
        return new a3b(fue, yj8, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, tze.d, l0f, ffc.X, yj8, false, 1, 0, c3b.d, 0, 0, 0, 0, false);
    }

    public final a3b a() {
        return new a3b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, j(), SystemClock.elapsedRealtime(), this.p);
    }

    public final a3b b(yj8 yj8) {
        mue mue = this.a;
        return new a3b(mue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, yj8, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b c(yj8 yj8, long j2, long j3, long j4, long j5, tze tze, l0f l0f, List list) {
        long j6 = j2;
        tze tze2 = tze;
        l0f l0f2 = l0f;
        List list2 = list;
        mue mue = this.a;
        return new a3b(mue, yj8, j3, j4, this.e, this.f, this.g, tze2, l0f2, list2, this.k, this.l, this.m, this.n, this.o, this.q, j5, j6, SystemClock.elapsedRealtime(), this.p);
    }

    public final a3b d(int i2, int i3, boolean z) {
        boolean z2 = z;
        mue mue = this.a;
        return new a3b(mue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z2, i2, i3, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b e(ExoPlaybackException exoPlaybackException) {
        mue mue = this.a;
        return new a3b(mue, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b f(c3b c3b) {
        mue mue = this.a;
        return new a3b(mue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, c3b, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b g(int i2) {
        mue mue = this.a;
        return new a3b(mue, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b h(mue mue) {
        return new a3b(mue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long j() {
        long j2;
        long j3;
        if (!k()) {
            return this.s;
        }
        do {
            j2 = this.t;
            j3 = this.s;
        } while (j2 != this.t);
        return oaf.S(oaf.h0(j3) + ((long) (((float) (SystemClock.elapsedRealtime() - j2)) * this.o.a)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
