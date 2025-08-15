package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;

/* renamed from: z2b  reason: default package */
public final class z2b {
    public static final xj8 t = new xj8(new Object());
    public final lue a;
    public final xj8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final sze h;
    public final l0f i;
    public final List j;
    public final xj8 k;
    public final boolean l;
    public final int m;
    public final b3b n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public z2b(lue lue, xj8 xj8, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, sze sze, l0f l0f, List list, xj8 xj82, boolean z2, int i3, b3b b3b, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.a = lue;
        this.b = xj8;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = sze;
        this.i = l0f;
        this.j = list;
        this.k = xj82;
        this.l = z2;
        this.m = i3;
        this.n = b3b;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.o = z3;
        this.p = z4;
    }

    public static z2b h(l0f l0f) {
        eue eue = lue.a;
        xj8 xj8 = t;
        return new z2b(eue, xj8, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, sze.o, l0f, ffc.X, xj8, false, 0, b3b.o, 0, 0, 0, false, false);
    }

    public final z2b a(xj8 xj8) {
        lue lue = this.a;
        return new z2b(lue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, xj8, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b b(xj8 xj8, long j2, long j3, long j4, long j5, sze sze, l0f l0f, List list) {
        long j6 = j2;
        sze sze2 = sze;
        l0f l0f2 = l0f;
        List list2 = list;
        lue lue = this.a;
        return new z2b(lue, xj8, j3, j4, this.e, this.f, this.g, sze2, l0f2, list2, this.k, this.l, this.m, this.n, this.q, j5, j6, this.o, this.p);
    }

    public final z2b c(boolean z) {
        lue lue = this.a;
        return new z2b(lue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public final z2b d(int i2, boolean z) {
        boolean z2 = z;
        lue lue = this.a;
        return new z2b(lue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z2, i2, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b e(ExoPlaybackException exoPlaybackException) {
        lue lue = this.a;
        return new z2b(lue, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b f(int i2) {
        lue lue = this.a;
        return new z2b(lue, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b g(lue lue) {
        return new z2b(lue, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
