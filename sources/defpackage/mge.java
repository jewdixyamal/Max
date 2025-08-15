package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: mge  reason: default package */
public final class mge extends zu3 {
    public final String X;
    public final zu3 o;

    public mge() {
        this(0);
    }

    public final void a() {
        this.o.a();
    }

    public final void f(zu3 zu3, uu3 uu3) {
        this.o.f(zu3, uu3);
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3) {
        if (view == null && !z) {
            String str = this.X;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "Already swiped controller manually, skip performChange", (Throwable) null);
            }
            xu3.q();
        } else if (view != null || !z) {
            this.o.g(viewGroup, view, view2, z, xu3);
        } else {
            String str2 = this.X;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, str2, "Showing controller without animation", (Throwable) null);
            }
            new gqd(true).g(viewGroup, view, view2, z, xu3);
        }
    }

    public final void h(Bundle bundle) {
        this.o.h(bundle);
    }

    public final void i(Bundle bundle) {
        this.o.i(bundle);
    }

    public mge(int i) {
        this.o = new u18(0);
        this.X = mge.class.getName();
    }
}
