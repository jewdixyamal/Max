package defpackage;

import android.os.Handler;

/* renamed from: b9g  reason: default package */
public abstract class b9g extends pc3 {
    public final ej0 k;

    public b9g(ej0 ej0) {
        this.k = ej0;
    }

    public abstract void A(mue mue);

    public void B() {
        y((Object) null, this.k);
    }

    public final mue h() {
        return this.k.h();
    }

    public final tb8 i() {
        return this.k.i();
    }

    public final boolean j() {
        return this.k.j();
    }

    public final void m(z0f z0f) {
        this.j = z0f;
        this.i = oaf.o((Handler.Callback) null);
        B();
    }

    public void t(tb8 tb8) {
        this.k.t(tb8);
    }

    public final yj8 u(Object obj, yj8 yj8) {
        Void voidR = (Void) obj;
        return z(yj8);
    }

    public final long v(long j, Object obj) {
        Void voidR = (Void) obj;
        return j;
    }

    public final int w(int i, Object obj) {
        Void voidR = (Void) obj;
        return i;
    }

    public final void x(Object obj, ej0 ej0, mue mue) {
        Void voidR = (Void) obj;
        A(mue);
    }

    public yj8 z(yj8 yj8) {
        return yj8;
    }
}
