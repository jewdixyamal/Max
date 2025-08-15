package defpackage;

import java.util.List;

/* renamed from: q98  reason: default package */
public final /* synthetic */ class q98 implements u98 {
    public final /* synthetic */ w98 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long o;

    public /* synthetic */ q98(w98 w98, List list, int i, long j) {
        this.a = w98;
        this.b = list;
        this.c = i;
        this.o = j;
    }

    public final void c(qr6 qr6, int i) {
        w98 w98 = this.a;
        w98.getClass();
        ww6 i2 = zw6.i();
        int i3 = 0;
        while (true) {
            List list = this.b;
            if (i3 < list.size()) {
                i2.a(((tb8) list.get(i3)).d(true));
                i3++;
            } else {
                qr6 qr62 = qr6;
                qr62.v(w98.c, i, new pu0(i2.j()), this.c, this.o);
                return;
            }
        }
    }
}
