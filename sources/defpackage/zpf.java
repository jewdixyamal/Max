package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: zpf  reason: default package */
public final class zpf implements ax1 {
    public final ax1 a;
    public final ejc b;
    public final bqf c;
    public final k9f o;

    public zpf(ax1 ax1, k9f k9f, bqc bqc) {
        this.a = ax1;
        this.o = k9f;
        this.b = new ejc(ax1.g(), bqc);
        this.c = new bqf(ax1.p());
    }

    public final void c(l9f l9f) {
        kq0.e();
        this.o.c(l9f);
    }

    public final void e(l9f l9f) {
        kq0.e();
        this.o.e(l9f);
    }

    public final ry9 f() {
        return this.a.f();
    }

    public final hw1 g() {
        return this.b;
    }

    public final void i(l9f l9f) {
        kq0.e();
        this.o.i(l9f);
    }

    public final void k(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final void m(l9f l9f) {
        kq0.e();
        this.o.m(l9f);
    }

    public final boolean n() {
        return false;
    }

    public final yw1 p() {
        return this.c;
    }
}
