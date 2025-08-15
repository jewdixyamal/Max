package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ghc  reason: default package */
public final class ghc extends khc implements z14 {
    public final l2d Y;

    public ghc(long j, oy5 oy5, List list, l2d l2d, ArrayList arrayList) {
        super(oy5, list, l2d, arrayList);
        this.Y = l2d;
    }

    public final boolean A() {
        return this.Y.j();
    }

    public final long C() {
        return this.Y.d;
    }

    public final long D(long j) {
        return this.Y.e(j);
    }

    public final long E(long j, long j2) {
        return this.Y.c(j, j2);
    }

    public final String a() {
        return null;
    }

    public final long b(long j) {
        return this.Y.h(j);
    }

    public final z14 c() {
        return this;
    }

    public final q4c d() {
        return null;
    }

    public final long j(long j, long j2) {
        return this.Y.f(j, j2);
    }

    public final long k(long j, long j2) {
        return this.Y.d(j, j2);
    }

    public final long m(long j, long j2) {
        l2d l2d = this.Y;
        if (l2d.f != null) {
            return -9223372036854775807L;
        }
        long c = l2d.c(j, j2) + l2d.d(j, j2);
        return (l2d.f(c, j) + l2d.h(c)) - l2d.i;
    }

    public final q4c n(long j) {
        return this.Y.i(j, this);
    }

    public final long v(long j, long j2) {
        return this.Y.g(j, j2);
    }
}
