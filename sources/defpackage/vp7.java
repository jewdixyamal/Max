package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* renamed from: vp7  reason: default package */
public final class vp7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xp7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vp7(xp7 xp7, Continuation continuation) {
        super(2, continuation);
        this.Y = xp7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vp7) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vp7 vp7 = new vp7(this.Y, continuation);
        vp7.X = obj;
        return vp7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List<b86> list = (List) this.X;
        xp7 xp7 = this.Y;
        xp7.getClass();
        hm9.m("xp7", "albums loaded", new Object[0]);
        int Z = mz7.Z(z53.S(list, 10));
        if (Z < 16) {
            Z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
        for (Object next : list) {
            linkedHashMap.put(((b86) next).a.b(), next);
        }
        xp7.g = linkedHashMap;
        su suVar = new su(6);
        av0 av0 = xp7.a;
        av0.c(suVar);
        for (b86 b86 : list) {
            av0.c(new yp7(b86.a.b()));
        }
        x77 x77 = ((fz6) xp7.c).y0;
        if (x77 != null && x77.isCompleted()) {
            r1f r1f = new r1f(l6d.d0(new r1f(new at(2, list), new jy2(27, xp7)), n71.t0), new g27(6));
            xs xsVar = new xs(0);
            l6d.h0(r1f, xsVar);
            p4d p4d = xp7.f;
            p4d.getClass();
            hm9.m("p4d", "refreshSelectedMedias()", new Object[0]);
            CopyOnWriteArraySet copyOnWriteArraySet = p4d.a;
            List p = nd7.p(copyOnWriteArraySet, new bqc(4, xsVar));
            hm9.m("p4d", "refreshSelectedMedias(), itemsForRemoveCount = " + p.size(), new Object[0]);
            copyOnWriteArraySet.removeAll(p);
            if (!p.isEmpty()) {
                p4d.n();
            }
        }
        return e5f.a;
    }
}
