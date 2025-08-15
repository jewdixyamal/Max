package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: nd5  reason: default package */
public final class nd5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ od5 c;

    public /* synthetic */ nd5(od5 od5, List list, int i) {
        this.a = i;
        this.c = od5;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                od5 od5 = this.c;
                ilc ilc = od5.a;
                ilc.c();
                try {
                    od5.b.B(this.b);
                    ilc.r();
                    ilc.l();
                    return null;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
            default:
                StringBuilder l = au1.l("DELETE FROM favorite_stickers WHERE id IN (");
                int i = 1;
                List<Long> list = this.b;
                a14.c(l, list == null ? 1 : list.size());
                l.append(")");
                String sb = l.toString();
                od5 od52 = this.c;
                q36 d = od52.a.d(sb);
                if (list == null) {
                    d.W(1);
                } else {
                    for (Long l2 : list) {
                        if (l2 == null) {
                            d.W(i);
                        } else {
                            d.j(i, l2.longValue());
                        }
                        i++;
                    }
                }
                ilc ilc2 = od52.a;
                ilc2.c();
                try {
                    d.n();
                    ilc2.r();
                    ilc2.l();
                    return null;
                } catch (Throwable th2) {
                    ilc2.l();
                    throw th2;
                }
        }
    }
}
