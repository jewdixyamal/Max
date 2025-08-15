package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hhc  reason: default package */
public final class hhc extends lhc implements a24 {
    public final m2d Y;

    public hhc(long j, qy5 qy5, List list, m2d m2d, ArrayList arrayList) {
        super(qy5, list, m2d, arrayList);
        this.Y = m2d;
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

    public final a24 c() {
        return this;
    }

    public final r4c d() {
        return null;
    }

    public final long j(long j, long j2) {
        return this.Y.f(j, j2);
    }

    public final long k(long j, long j2) {
        return this.Y.d(j, j2);
    }

    public final long m(long j, long j2) {
        m2d m2d = this.Y;
        if (m2d.f != null) {
            return -9223372036854775807L;
        }
        long c = m2d.c(j, j2) + m2d.d(j, j2);
        return (m2d.f(c, j) + m2d.h(c)) - m2d.i;
    }

    public final r4c n(long j) {
        return this.Y.i(j, this);
    }

    public final long v(long j, long j2) {
        return this.Y.g(j, j2);
    }
}
