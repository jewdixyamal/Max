package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: yo8  reason: default package */
public final class yo8 extends ffe implements a66 {
    public final /* synthetic */ bp8 X;
    public final /* synthetic */ Collection Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo8(bp8 bp8, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.X = bp8;
        this.Y = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yo8) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yo8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Set set;
        od2.a0(obj);
        bp8 bp8 = this.X;
        Iterator it = l6d.Z(new at(2, (Iterable) bp8.x0.a.getValue()), new wz7(4, this.Y)).iterator();
        if (!it.hasNext()) {
            set = wz4.a;
        } else {
            Long valueOf = Long.valueOf(((kn8) it.next()).a);
            if (!it.hasNext()) {
                set = Collections.singleton(valueOf);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(valueOf);
                while (it.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((kn8) it.next()).a));
                }
                set = linkedHashSet;
            }
        }
        bp8.u0 = set;
        xn8 xn8 = new xn8(bp8.b, bp8.c, set);
        do8 do8 = bp8.Y;
        do8.getClass();
        j47.T(do8.b, (lx3) null, (vx3) null, new co8(do8, xn8, (Continuation) null), 3);
        return e5f.a;
    }
}
