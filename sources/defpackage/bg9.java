package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: bg9  reason: default package */
public final class bg9 extends ffe implements a66 {
    public final /* synthetic */ dg9 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg9(dg9 dg9, long j, Continuation continuation) {
        super(2, continuation);
        this.X = dg9;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bg9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bg9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Set set;
        List list;
        od2.a0(obj);
        dg9 dg9 = this.X;
        Set set2 = ((xf9) dg9.d.getValue()).b;
        boolean isEmpty = set2.isEmpty();
        long j = this.Y;
        if (isEmpty) {
            set = Collections.singleton(new Long(j));
        } else if (set2.contains(new Long(j))) {
            set = x53.G0(set2);
            set.remove(new Long(j));
        } else {
            Long l = new Long(j);
            LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(set2.size() + 1));
            linkedHashSet.addAll(set2);
            linkedHashSet.add(l);
            set = linkedHashSet;
        }
        if (set.isEmpty()) {
            list = nz4.a;
        } else {
            kl7 l2 = j1e.l();
            l2.add(new zka(gja.v, hja.h, woc.w));
            list = j1e.d(l2);
        }
        dg9.d.m((Object) null, new xf9(true, set, list));
        return e5f.a;
    }
}
