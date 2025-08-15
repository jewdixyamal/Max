package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: q1e  reason: default package */
public final class q1e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ s1e c;

    public /* synthetic */ q1e(s1e s1e, List list, int i) {
        this.a = i;
        this.c = s1e;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                StringBuilder l = au1.l("DELETE FROM events WHERE id in (");
                List<Long> list = this.b;
                a14.c(l, list.size());
                l.append(")");
                String sb = l.toString();
                s1e s1e = this.c;
                q36 d = s1e.a.d(sb);
                int i = 1;
                for (Long l2 : list) {
                    if (l2 == null) {
                        d.W(i);
                    } else {
                        d.j(i, l2.longValue());
                    }
                    i++;
                }
                ilc ilc = s1e.a;
                ilc.c();
                try {
                    d.n();
                    ilc.r();
                    ilc.l();
                    return e5f.a;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
            default:
                s1e s1e2 = this.c;
                ilc ilc2 = s1e2.a;
                ilc2.c();
                try {
                    s1e2.b.B(this.b);
                    ilc2.r();
                    ilc2.l();
                    return e5f.a;
                } catch (Throwable th2) {
                    ilc2.l();
                    throw th2;
                }
        }
    }
}
