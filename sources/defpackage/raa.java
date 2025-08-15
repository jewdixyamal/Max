package defpackage;

/* renamed from: raa  reason: default package */
public final class raa implements qo4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ iab b;

    public raa(String str, iab iab) {
        this.a = str;
        this.b = iab;
    }

    public final void e(dn4 dn4, Exception exc) {
        if (tpa.f(dn4.a.a, this.a)) {
            String str = dn4.a.a;
            int i = dn4.b;
            float f = dn4.h.b;
            hm9.m("OneMeDownloadController", "onDownloadChanged, " + str + ", " + i + ", " + f + "%", new Object[0]);
            if (exc != null) {
                ((fab) this.b).i(exc);
                return;
            }
            fab fab = (fab) this.b;
            fab.getClass();
            fab.n(dn4);
            int i2 = dn4.b;
            if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5) {
                fab fab2 = (fab) this.b;
                fab2.getClass();
                if (!fab2.a.p()) {
                    fab fab3 = (fab) this.b;
                    fab3.getClass();
                    fab3.i((Throwable) null);
                }
            }
        }
    }

    public final void f(so4 so4, dn4 dn4) {
        if (tpa.f(dn4.a.a, this.a)) {
            so4.e.remove(this);
            fab fab = (fab) this.b;
            fab.getClass();
            if (!fab.a.p()) {
                fab.getClass();
                fab.i((Throwable) null);
            }
        }
    }
}
