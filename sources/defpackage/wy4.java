package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: wy4  reason: default package */
public final class wy4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ az4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy4(az4 az4, Continuation continuation) {
        super(2, continuation);
        this.Y = az4;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wy4) n((a3f) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wy4 wy4 = new wy4(this.Y, continuation);
        wy4.X = obj;
        return wy4;
    }

    public final Object o(Object obj) {
        boolean z;
        q0e q0e;
        long j;
        long j2;
        ph phVar;
        Object obj2;
        boolean z2 = true;
        od2.a0(obj);
        a3f a3f = (a3f) this.X;
        List list = (List) a3f.a;
        List list2 = (List) a3f.b;
        List list3 = (List) a3f.c;
        az4 az4 = this.Y;
        bc7[] bc7Arr = az4.v0;
        az4.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            z = false;
            qx4 qx4 = null;
            if (!it.hasNext()) {
                break;
            }
            h9c h9c = (h9c) it.next();
            t9c t9c = h9c.a;
            if (t9c == t9c.EMOJI && (h9c instanceof by4)) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (tpa.f(((qx4) obj2).c, ((by4) h9c).c)) {
                        break;
                    }
                }
                qx4 qx42 = (qx4) obj2;
                if (qx42 != null) {
                    qx4 = new qx4(ow4.RECENT.a, -qx42.b, qx42.c, qx42.o, qx42.X, qx42.Y);
                }
            } else if (t9c == t9c.ANIMOJI && (phVar = (ph) ((gj) az4.X.getValue()).i(h9c.b).getValue()) != null) {
                qx4 = az4.q(list, phVar, ow4.RECENT.a, 0);
            }
            if (qx4 != null) {
                arrayList.add(qx4);
            }
        }
        String name = this.Y.getClass().getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, rh4.h("Load emoji. Finish. emojis:", list.size(), list2.size(), ", recent:"), (Throwable) null);
        }
        az4 az42 = this.Y;
        az42.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Integer valueOf = Integer.valueOf(((qx4) next).a);
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            q0e = az42.Y;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            int intValue = ((Number) entry.getKey()).intValue();
            List list4 = (List) entry.getValue();
            ob6 ob6 = ow4.o;
            int intValue2 = ((Number) entry.getKey()).intValue();
            ob6.getClass();
            ow4 l = ob6.l(intValue2);
            int intValue3 = ((Number) entry.getKey()).intValue();
            arrayList2.add(new d02(intValue, list4, !arrayList.isEmpty() || !list3.isEmpty() || ((yy4) q0e.getValue()).a != Integer.MIN_VALUE ? ((yy4) q0e.getValue()).a == ((Number) entry.getKey()).intValue() : ((Number) entry.getKey()).intValue() == ow4.CLASSIC.a, l, (String) null, (String) null, (iqe) null, intValue3 == ow4.RECENT.a ? Long.MIN_VALUE : -9223372036854775807L + ((long) intValue3), 496));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (!list3.isEmpty()) {
            int i = 0;
            for (Object next2 : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    lj ljVar = (lj) next2;
                    boolean isEmpty = arrayList.isEmpty() ^ z2;
                    ArrayList arrayList4 = new ArrayList();
                    int i3 = ow4.ANIMOJI.a + i;
                    int size = ljVar.d.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        arrayList4.add(az42.q(list, (ph) ljVar.d.get(i4), i3, i4));
                    }
                    ow4 ow4 = ow4.ANIMOJI;
                    iqe iqe = new iqe(ljVar.a);
                    if (i3 == ow4.RECENT.a) {
                        j2 = Long.MIN_VALUE;
                        j = -9223372036854775807L;
                    } else {
                        j = -9223372036854775807L;
                        j2 = ((long) i3) - Long.MAX_VALUE;
                    }
                    arrayList3.add(0, new d02(i3, arrayList4, isEmpty || ((yy4) q0e.getValue()).a != Integer.MIN_VALUE ? ((yy4) q0e.getValue()).a == i3 : i == 0, ow4, ljVar.b, ljVar.c, iqe, j2, 384));
                    z = false;
                    i = i2;
                    long j3 = j;
                    z2 = true;
                } else {
                    y53.R();
                    throw null;
                }
            }
        }
        boolean z3 = z;
        if (!arrayList.isEmpty()) {
            int i5 = ow4.RECENT.a;
            ow4.o.getClass();
            arrayList3.add(z3 ? 1 : 0, new d02(i5, arrayList, !(((yy4) q0e.getValue()).a != Integer.MIN_VALUE ? true : z3), ob6.l(i5), (String) null, (String) null, (iqe) null, Long.MIN_VALUE, 496));
        }
        kl7 l2 = j1e.l();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            d02 d02 = (d02) it4.next();
            l2.add(d02);
            l2.addAll(d02.b);
        }
        this.Y.t0.m((Object) null, new xy4(arrayList3, j1e.d(l2)));
        return e5f.a;
    }
}
