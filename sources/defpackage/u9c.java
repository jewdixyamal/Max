package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: u9c  reason: default package */
public final /* synthetic */ class u9c implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9c b;
    public final /* synthetic */ List c;

    public /* synthetic */ u9c(x9c x9c, List list, int i) {
        this.a = i;
        this.b = x9c;
        this.c = list;
    }

    public final void run() {
        x10 x10;
        List<h9c> list = this.c;
        x9c x9c = this.b;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (h9c h9c : list) {
                    int ordinal = h9c.a.ordinal();
                    Long l = null;
                    if (ordinal == 2) {
                        j3e j3e = h9c instanceof j3e ? (j3e) h9c : null;
                        if (j3e != null) {
                            l = Long.valueOf(j3e.c);
                        }
                    } else if (ordinal == 3) {
                        vc6 vc6 = h9c instanceof vc6 ? (vc6) h9c : null;
                        if (!(vc6 == null || (x10 = vc6.c) == null)) {
                            l = Long.valueOf(x10.s0);
                        }
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((k4a) ((pk) x9c.d.getValue())).f(6, nd7.j(arrayList));
                    return;
                }
                return;
            default:
                int i = x9c.g;
                ((k4a) ((pk) x9c.d.getValue())).f(6, nd7.j(list));
                return;
        }
    }
}
