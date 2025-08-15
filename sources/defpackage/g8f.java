package defpackage;

import java.util.Objects;

/* renamed from: g8f  reason: default package */
public final class g8f {
    public final c7f a;
    public final q2e b;
    public final ztc c;
    public final rm4 d;

    public g8f(c7f c7f, q2e q2e, ztc ztc, rm4 rm4) {
        this.a = c7f;
        this.d = rm4;
        this.b = q2e;
        this.c = ztc;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gk8, java.lang.Object] */
    public static d7f b(iy8 iy8) {
        ? obj = new Object();
        obj.d = oag.t(iy8.f) ? iy8.a.c : iy8.f;
        obj.c = iy8.b;
        obj.b = iy8.d;
        obj.a = iy8.c;
        return new d7f(obj);
    }

    public final s1a a(iy8 iy8) {
        e0a e0a = new e0a(qy9.m(iy8).d(new f8f(this, 0)), new f8f(this, 1), 3);
        c7f c7f = this.a;
        Objects.requireNonNull(c7f);
        return new oz9(e0a.d(new x6f(c7f, 9)).d(new f8f(this, 3)), ft.e, new ypc(this, 15, iy8), ft.d).o(Long.MAX_VALUE, new f8f(this, 2)).r(this.c);
    }
}
