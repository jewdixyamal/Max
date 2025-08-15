package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: mv2  reason: default package */
public final class mv2 extends fld {
    public String x0 = "";

    public final void m(ViewGroup viewGroup, View view, View view2, w1f w1f, boolean z, i50 i50) {
        eha searchView;
        String string = viewGroup.getResources().getString(r8a.q);
        this.x0 = string;
        if (!(view2 == null || z || (searchView = ((cla) hm9.x(view2, string)).getSearchView()) == null)) {
            int i = eha.I0;
            searchView.c(true);
        }
        super.m(viewGroup, view, view2, w1f, z, i50);
    }

    public final void o() {
        String str = this.x0;
        this.Z.put(str, str);
    }

    public final e2f p(View view, boolean z) {
        e2f e2f = new e2f();
        e2f.Q(new lv2(view, this, z));
        return e2f;
    }
}
