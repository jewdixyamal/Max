package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lse  reason: default package */
public final class lse extends pnf {
    public final s35 X = new s35(0);
    public final Context b;
    public final je7 c;
    public final q0e o = r0e.a(q());

    public lse() {
        fi4 fi4 = fi4.a;
        khe d = fi4.getAccessor().d(kke.class);
        this.b = (Context) fi4.getAccessor().c(Context.class);
        this.c = d;
    }

    public final kl7 q() {
        kl7 l = j1e.l();
        pq9 pq9 = qp4.u0;
        Context context = this.b;
        List e0 = x53.e0(((ConcurrentHashMap) ((je7) ((adb) pq9.b(context).X).c).getValue()).values());
        ArrayList arrayList = new ArrayList(z53.S(e0, 10));
        Iterator it = ((ArrayList) e0).iterator();
        while (it.hasNext()) {
            String str = ((sba) it.next()).a;
            arrayList.add(new vre(str, Boolean.valueOf(tpa.f(str, pq9.b(context).g().a))));
        }
        l.addAll(arrayList);
        return j1e.d(l);
    }
}
