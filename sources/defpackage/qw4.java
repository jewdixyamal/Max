package defpackage;

import android.os.Build;

/* renamed from: qw4  reason: default package */
public final class qw4 extends tu0 {
    public final /* synthetic */ rw4 n;

    public qw4(rw4 rw4) {
        this.n = rw4;
    }

    public final void v(Throwable th) {
        ((vw4) this.n.a).e(th);
    }

    public final void y(t99 t99) {
        rw4 rw4 = this.n;
        if (t99 == null) {
            ((vw4) rw4.a).e(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        rw4.c = t99;
        t99 t992 = (t99) rw4.c;
        vw4 vw4 = (vw4) rw4.a;
        rw4.b = new te(t992, vw4.g, vw4.n, vw4.i, vw4.j, Build.VERSION.SDK_INT >= 34 ? dx4.a() : od2.H());
        ((vw4) rw4.a).f();
    }
}
