package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: p1e  reason: default package */
public final class p1e implements Callable {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s1e c;

    public p1e(s1e s1e, List list, int i) {
        this.c = s1e;
        this.a = list;
        this.b = i;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        StringBuilder l = au1.l("UPDATE events SET status = ? WHERE id in (");
        List<Long> list = this.a;
        a14.c(l, list.size());
        l.append(")");
        String sb = l.toString();
        s1e s1e = this.c;
        q36 d = s1e.a.d(sb);
        d.j(1, (long) zr6.d(this.b));
        int i = 2;
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
    }
}
