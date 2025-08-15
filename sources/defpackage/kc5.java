package defpackage;

import java.util.List;

/* renamed from: kc5  reason: default package */
public final /* synthetic */ class kc5 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc5 b;

    public /* synthetic */ kc5(sc5 sc5, int i) {
        this.a = i;
        this.b = sc5;
    }

    public void accept(Object obj) {
        sc5 sc5 = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                sc5.getClass();
                hm9.m("sc5", "onNotifUpdated: updated ids: %s", list);
                sc5.Z.e(list);
                return;
            case 1:
                List list2 = (List) obj;
                sc5.getClass();
                hm9.m("sc5", "on next favorite ids from obs: %s", list2);
                sc5.Z.e(list2);
                return;
            case 3:
                List list3 = (List) obj;
                sc5.getClass();
                hm9.m("sc5", "on next favorite sticker sets: %s", list3);
                sc5.s0.e(list3);
                return;
            default:
                xc5 xc5 = (xc5) obj;
                sc5.getClass();
                long j = xc5.b;
                if (j != 0) {
                    hm9.m("sc5", "loadFromMarker: new marker in response=%d", Long.valueOf(j));
                    sc5.c(xc5.b);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((a4e) this.b.b.getValue()).c((List) obj);
            case 4:
                sc5 sc5 = this.b;
                sc5.getClass();
                return new sa3(1, new p00(sc5, 3, (Long) obj));
            default:
                return new qa3(((wc5) this.b.a.getValue()).a(), 2, new z72(13, (List) obj));
        }
    }
}
