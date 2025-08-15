package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: upf  reason: default package */
public final class upf extends su3 {
    public final /* synthetic */ cd6 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ vpf c;
    public final /* synthetic */ View d;

    public upf(cd6 cd6, ViewTreeObserver viewTreeObserver, vpf vpf, View view) {
        this.a = cd6;
        this.b = viewTreeObserver;
        this.c = vpf;
        this.d = view;
    }

    public final void s(uu3 uu3, View view) {
        Iterator it = ((ArrayList) this.a.c).iterator();
        while (it.hasNext()) {
            ((spf) it.next()).b();
        }
        uu3.removeLifecycleListener(this);
        cd6.a(this.c, this.d, this.b);
    }
}
