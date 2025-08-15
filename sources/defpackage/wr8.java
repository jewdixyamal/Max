package defpackage;

import java.util.List;

/* renamed from: wr8  reason: default package */
public final class wr8 implements n85 {
    public final n85 a;
    public final rze b;

    public wr8(n85 n85, rze rze) {
        this.a = n85;
        this.b = rze;
    }

    public final rze a() {
        return this.b;
    }

    public final int b() {
        return this.a.b();
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final qy5 d(int i) {
        return this.b.d[this.a.f(i)];
    }

    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr8)) {
            return false;
        }
        wr8 wr8 = (wr8) obj;
        return this.a.equals(wr8.a) && this.b.equals(wr8.b);
    }

    public final int f(int i) {
        return this.a.f(i);
    }

    public final int g(long j, List list) {
        return this.a.g(j, list);
    }

    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    public final int i() {
        return this.a.i();
    }

    public final qy5 j() {
        return this.b.d[this.a.i()];
    }

    public final int k() {
        return this.a.k();
    }

    public final void l(float f) {
        this.a.l(f);
    }

    public final int length() {
        return this.a.length();
    }

    public final Object m() {
        return this.a.m();
    }

    public final void n() {
        this.a.n();
    }

    public final void o() {
        this.a.o();
    }

    public final int p(int i) {
        return this.a.p(i);
    }

    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    public final void r(long j, long j2, long j3, List list, i78[] i78Arr) {
        this.a.r(j, j2, j3, list, i78Arr);
    }

    public final int s(qy5 qy5) {
        return this.a.p(this.b.d(qy5));
    }

    public final boolean t(long j, j13 j13, List list) {
        return this.a.t(j, j13, list);
    }

    public final boolean u(int i, long j) {
        return this.a.u(i, j);
    }
}
