package defpackage;

import java.util.List;

/* renamed from: kd5  reason: default package */
public final /* synthetic */ class kd5 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md5 b;

    public /* synthetic */ kd5(md5 md5, int i) {
        this.a = i;
        this.b = md5;
    }

    public void accept(Object obj) {
        md5 md5 = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                md5.getClass();
                hm9.m("md5", "onNotifUpdated: updated ids: %s", list);
                md5.i.e(list);
                return;
            case 1:
                List list2 = (List) obj;
                md5.getClass();
                hm9.m("md5", "on next favorite sticker ids from obs: %s", list2);
                md5.i.e(list2);
                return;
            case 3:
                List list3 = (List) obj;
                md5.getClass();
                hm9.m("md5", "on next favorite sticker: %s", list3);
                md5.j.e(list3);
                return;
            default:
                md5.getClass();
                long j = ((gd5) obj).b;
                if (j != 0) {
                    md5.b(j);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((o2e) this.b.b.get()).b((List) obj);
            case 4:
                md5 md5 = this.b;
                md5.getClass();
                return new sa3(1, new p00(md5, 4, (Long) obj));
            default:
                return new qa3(((hc5) this.b.a.get()).a(), 2, new z72(7, (List) obj));
        }
    }
}
