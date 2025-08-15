package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: yp3  reason: default package */
public final class yp3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cq3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yp3(cq3 cq3, Continuation continuation) {
        super(2, continuation);
        this.Y = cq3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yp3) n((u83) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yp3 yp3 = new yp3(this.Y, continuation);
        yp3.X = obj;
        return yp3;
    }

    public final Object o(Object obj) {
        ArrayList arrayList;
        p83 p83;
        Iterator it;
        uib uib;
        od2.a0(obj);
        u83 u83 = (u83) this.X;
        boolean equals = u83.equals(n83.a);
        List list = nz4.a;
        if (equals || u83.equals(o83.a)) {
            arrayList = list;
        } else if (u83 instanceof p83) {
            p83 p832 = (p83) u83;
            List list2 = p832.a;
            ArrayList arrayList2 = new ArrayList(z53.S(list2, 10));
            Iterator it2 = list2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    t83 t83 = (t83) next;
                    int i3 = t83 instanceof r83 ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 512;
                    if (p832.a.size() != 1) {
                        i3 |= i == 0 ? 536870912 : i == y53.L(p832.a) ? Integer.MIN_VALUE : 1073741824;
                    }
                    if (tpa.f(t83, q83.a)) {
                        uib = sib.a;
                    } else if (tpa.f(t83, r83.a)) {
                        uib = new tib(i3);
                    } else if (t83 instanceof s83) {
                        s83 s83 = (s83) t83;
                        e52 e52 = s83.a;
                        long j = e52.a;
                        CharSequence charSequence = s83.b;
                        iqe iqe = new iqe(s83.c);
                        String g = e52.g(kk0.c, jk0.a);
                        e52 e522 = s83.a;
                        p83 = p832;
                        it = it2;
                        long j2 = e522.b.a;
                        e522.l0();
                        uib = new uib(new ycb(j, charSequence, iqe, g, j2, e522.x0), i3);
                        arrayList2.add(uib);
                        p832 = p83;
                        i = i2;
                        it2 = it;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    p83 = p832;
                    it = it2;
                    arrayList2.add(uib);
                    p832 = p83;
                    i = i2;
                    it2 = it;
                } else {
                    y53.R();
                    throw null;
                }
            }
            arrayList = arrayList2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        q0e q0e = this.Y.s;
        if (!arrayList.isEmpty()) {
            xs2 xs2 = this.Y.n;
            xs2.getClass();
            kl7 l = j1e.l();
            l.add((mib) xs2.a.getValue());
            l.addAll(arrayList);
            list = j1e.d(l);
        }
        q0e.setValue(list);
        return e5f.a;
    }
}
