package defpackage;

import java.util.Collections;

/* renamed from: h52  reason: default package */
public abstract class h52 {
    public static final mg3 a = new mg3(p8a.R, new eqe(r8a.a), 2, false);
    public static final khe b = new khe(new dk1(27));

    public static gnd a(e52 e52) {
        int i = r8a.E;
        uj3 l = e52.l();
        String d = l != null ? l.d() : null;
        if (d != null) {
            return new gnd(e52.a, new gqe(i, ys.m0(new Object[]{d})), new eqe(jpc.P), y53.M(new mg3(p8a.Q, new eqe(r8a.A), 1, false), a));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static gnd b(long j) {
        return new gnd(j, new eqe(r8a.b), (jqe) null, y53.M(new mg3(p8a.T, new eqe(r8a.B), 1, false), a));
    }

    public static gnd c(long j) {
        return new gnd(j, new eqe(r8a.j), (jqe) null, y53.M(new mg3(p8a.T, new eqe(r8a.i), 1, false), a));
    }

    public static gnd d(e52 e52) {
        long j = e52.a;
        int i = r8a.d;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), new eqe(jpc.x), y53.M(new mg3(p8a.I, new eqe(r8a.f), 1, false), new mg3(p8a.B, new eqe(r8a.c), 1, false), a));
    }

    public static gnd e(e52 e52) {
        long j = e52.a;
        int i = r8a.m;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), (jqe) null, y53.M(new mg3(p8a.S, new eqe(r8a.h), 1, false), a));
    }

    public static gnd f(e52 e52) {
        long j = e52.a;
        int i = r8a.m;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), new eqe(jpc.D), y53.M(new mg3(p8a.I, new eqe(r8a.r), 1, false), new mg3(p8a.C, new eqe(r8a.k), 1, false), a));
    }

    public static gnd g(e52 e52) {
        long j = e52.a;
        int i = r8a.K;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), new eqe(jpc.z), y53.M(new mg3(p8a.S, new eqe(r8a.l), 1, false), new mg3(p8a.T, new eqe(r8a.k), 1, false), a));
    }

    public static gnd h(e52 e52) {
        long j = e52.a;
        int i = r8a.e;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), (jqe) null, y53.M(new mg3(p8a.U, new eqe(r8a.C), 1, false), a));
    }

    public static gnd i(e52 e52) {
        long j = e52.a;
        int i = r8a.e;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), (jqe) null, y53.M(new mg3(p8a.I, new eqe(r8a.f), 1, false), a));
    }

    public static gnd j(e52 e52) {
        long j = e52.a;
        int i = r8a.o;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), (jqe) null, y53.M(new mg3(p8a.U, new eqe(r8a.D), 1, false), (mg3) b.getValue()));
    }

    public static gnd k(e52 e52) {
        long j = e52.a;
        int i = r8a.o;
        e52.k0();
        return new gnd(j, new gqe(i, ys.m0(new Object[]{e52.u0})), (jqe) null, y53.M(new mg3(p8a.I, new eqe(r8a.r), 1, false), (mg3) b.getValue()));
    }

    public static gnd l(e52 e52) {
        return new gnd(e52.a, new eqe(r8a.O), (jqe) null, y53.M(new mg3(p8a.W, new eqe(r8a.M), 3, false), new mg3(p8a.X, new eqe(r8a.N), 3, false), new mg3(p8a.V, new eqe(r8a.L), 3, false), new mg3(p8a.Y, new eqe(r8a.P), 1, false), a));
    }

    public static gnd m() {
        return new gnd(Long.MAX_VALUE, new iqe("Действие находится в разработке!"), new iqe("Возвращайтесь позже :)"), Collections.singletonList(new mg3(Integer.MIN_VALUE, new iqe("Вернусь позже"), 3, false)));
    }
}
