package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h82  reason: default package */
public final /* synthetic */ class h82 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v82 b;

    public /* synthetic */ h82(v82 v82, int i) {
        this.a = i;
        this.b = v82;
    }

    public final void accept(Object obj) {
        u82 u82 = (u82) obj;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(u82.c());
                arrayList.remove(this.b);
                List list = u82.B;
                if (list != null) {
                    list.clear();
                }
                if (u82.B == null) {
                    u82.B = new ArrayList();
                }
                u82.B.addAll(arrayList);
                return;
            default:
                u82.a(this.b);
                return;
        }
    }
}
