package defpackage;

import android.os.Bundle;

/* renamed from: mo7  reason: default package */
public final class mo7 extends ci9 {
    public final int l = 0;
    public final Bundle m = null;
    public final rgg n;
    public eh7 o;
    public no7 p;
    public rgg q;

    public mo7(rgg rgg) {
        this.n = rgg;
        this.q = null;
        if (rgg.b == null) {
            rgg.b = this;
            rgg.a = 0;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void g() {
        rgg rgg = this.n;
        rgg.c = true;
        rgg.e = false;
        rgg.d = false;
        rgg.j.drainPermits();
        rgg.a();
        rgg.h = new sx(rgg);
        rgg.b();
    }

    public final void h() {
        this.n.c = false;
    }

    public final void j(g2a g2a) {
        super.j(g2a);
        this.o = null;
        this.p = null;
    }

    public final void k(Object obj) {
        super.k(obj);
        rgg rgg = this.q;
        if (rgg != null) {
            rgg.e = true;
            rgg.c = false;
            rgg.d = false;
            rgg.f = false;
            this.q = null;
        }
    }

    public final void l() {
        eh7 eh7 = this.o;
        no7 no7 = this.p;
        if (eh7 != null && no7 != null) {
            super.j(no7);
            e(eh7, no7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        z04.g(sb, this.n);
        sb.append("}}");
        return sb.toString();
    }
}
