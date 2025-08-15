package defpackage;

import java.util.ArrayList;

/* renamed from: pd4  reason: default package */
public final /* synthetic */ class pd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd4 b;
    public final /* synthetic */ ovd c;

    public /* synthetic */ pd4(yd4 yd4, ovd ovd, int i) {
        this.a = i;
        this.b = yd4;
        this.c = ovd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                return;
            case 1:
                yd4 yd4 = this.b;
                ArrayList arrayList = yd4.b;
                ovd ovd = this.c;
                if (arrayList.contains(ovd)) {
                    k7d.a(ovd.a, ovd.c.U0, yd4.a);
                    return;
                }
                return;
            default:
                yd4 yd42 = this.b;
                ArrayList arrayList2 = yd42.b;
                ovd ovd2 = this.c;
                arrayList2.remove(ovd2);
                yd42.c.remove(ovd2);
                return;
        }
    }
}
