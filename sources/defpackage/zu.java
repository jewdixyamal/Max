package defpackage;

/* renamed from: zu  reason: default package */
public final /* synthetic */ class zu implements bb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ zu(tf2 tf2, long j, int i) {
        this.a = i;
        this.b = tf2;
        this.c = j;
    }

    public final void b(ra3 ra3) {
        switch (this.a) {
            case 0:
                nl6 nl6 = this.b.b;
                yx4 yx4 = nl6.e;
                long j = this.c;
                if (yx4 != null) {
                    String a2 = yx4.a(j);
                    yx4.b("loadPrev: " + a2);
                }
                nl6.q();
                if (!nl6.d().i().isEmpty()) {
                    vk6 h = ft.h(nl6.f(j));
                    if (h != null) {
                        j = h.k();
                    }
                    long j2 = j;
                    nl6.j(nl6.b, j2, true, false, false);
                    nl6.k(nl6.c, j2, true, false);
                } else {
                    nl6.l(j);
                }
                if (yx4 != null) {
                    kq0.u(yx4, nl6.e());
                }
                if (!ra3.h()) {
                    ra3.b();
                    return;
                }
                return;
            default:
                nl6 nl62 = this.b.b;
                yx4 yx42 = nl62.e;
                long j3 = this.c;
                if (yx42 != null) {
                    String a3 = yx4.a(j3);
                    yx42.b("load: " + a3);
                }
                nl62.q();
                if (!nl62.d().i().isEmpty()) {
                    nl62.j(nl62.b, j3, true, true, false);
                    nl62.k(nl62.c, j3, true, true);
                } else {
                    nl62.l(j3);
                }
                if (yx42 != null) {
                    kq0.u(yx42, nl62.e());
                }
                if (!ra3.h()) {
                    ra3.b();
                    return;
                }
                return;
        }
    }
}
