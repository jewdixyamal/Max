package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: dde  reason: default package */
public final /* synthetic */ class dde implements qj3, bce {
    public final /* synthetic */ ede a;

    public /* synthetic */ dde(ede ede) {
        this.a = ede;
    }

    public List a() {
        ede ede = this.a;
        ArrayList j = ede.n.j();
        ((oq3) ede.m.getValue()).b(j);
        return j;
    }

    public void accept(Object obj) {
        h62 h62 = (h62) obj;
        ede ede = this.a;
        ede.getClass();
        eq0 eq0 = new eq0(h62.c, h62.o);
        long j = ede.n.a;
        dq0 dq0 = ede.d;
        dq0.getClass();
        cqc.a(new t5(dq0, j, eq0), (ztc) cqc.a.b, (f6) null, new un0(2), (ztc) null);
        List list = h62.c;
        HashMap hashMap = h62.o;
        y8 y8Var = ede.f;
        y8Var.getClass();
        Collection emptyList = list == null ? Collections.emptyList() : nd7.F(list, new f9(y8Var, 3, hashMap));
        synchronized (ede) {
            ede.p.clear();
            ede.p.addAll(emptyList);
        }
    }
}
