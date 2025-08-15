package defpackage;

import android.view.View;

/* renamed from: lv2  reason: default package */
public final class lv2 implements v1f {
    public final /* synthetic */ View a;
    public final /* synthetic */ mv2 b;
    public final /* synthetic */ boolean c;

    public lv2(View view, mv2 mv2, boolean z) {
        this.a = view;
        this.b = mv2;
        this.c = z;
    }

    public final void a(w1f w1f) {
        View view = this.a;
        if (view != null) {
            cla cla = (cla) hm9.x(view, this.b.x0);
            if (this.c) {
                eha searchView = cla.getSearchView();
                if (searchView != null) {
                    searchView.d();
                    return;
                }
                return;
            }
            eha searchView2 = cla.getSearchView();
            if (searchView2 != null) {
                searchView2.b();
            }
        }
    }

    public final void b() {
    }

    public final void c(w1f w1f) {
    }

    public final void f() {
    }

    public final void g(w1f w1f) {
    }
}
