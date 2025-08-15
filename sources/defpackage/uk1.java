package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: uk1  reason: default package */
public final class uk1 extends ffe implements h66 {
    public /* synthetic */ pqa X;
    public /* synthetic */ gg1 Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ i95 s0;
    public /* synthetic */ boolean t0;
    public final /* synthetic */ el1 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk1(el1 el1, Continuation continuation) {
        super(6, continuation);
        this.u0 = el1;
    }

    public final void k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        uk1 uk1 = new uk1(this.u0, (Continuation) obj6);
        uk1.X = (pqa) obj;
        uk1.Y = (gg1) obj2;
        uk1.Z = booleanValue;
        uk1.s0 = (i95) obj4;
        uk1.t0 = booleanValue2;
        uk1.o(e5f.a);
    }

    public final Object o(Object obj) {
        el1 el1;
        Object value;
        od2.a0(obj);
        pqa pqa = this.X;
        gg1 gg1 = this.Y;
        boolean z = this.Z;
        i95 i95 = this.s0;
        boolean z2 = this.t0;
        Map map = pqa.c;
        Map map2 = pqa.g;
        Set<gg1> G0 = x53.G0(x53.x0(map2.keySet(), new l45(1, map2)));
        ky7 ky7 = new ky7();
        fqa fqa = pqa.a;
        ky7.put(fqa.a.getId(), fqa);
        fqa fqa2 = (fqa) map.get(gg1);
        if (fqa2 != null) {
            ig1 ig1 = fqa2.a;
            ky7.put(ig1.getId(), fqa2);
            G0.remove(ig1.getId());
        }
        for (gg1 gg12 : G0) {
            fqa fqa3 = (fqa) map.get(gg12);
            if (fqa3 != null) {
                ky7.put(gg12, fqa3);
            }
        }
        fqa fqa4 = (fqa) map.get(pqa.a());
        if (fqa4 != null) {
            fqa fqa5 = (fqa) ky7.put(fqa4.a.getId(), fqa4);
        }
        for (Map.Entry entry : map.entrySet()) {
            gg1 gg13 = (gg1) entry.getKey();
            fqa fqa6 = (fqa) entry.getValue();
            if (!ky7.containsKey(gg13)) {
                ky7.put(gg13, fqa6);
            }
        }
        Collection values = ky7.b().values();
        int Z2 = mz7.Z(z53.S(values, 10));
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        Iterator it = ((my7) values).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            el1 = this.u0;
            if (!hasNext) {
                break;
            }
            fqa fqa7 = (fqa) it.next();
            linkedHashMap.put(fqa7.a.getId(), dz7.c(fqa7, fqa7.a.o(), z, z2, el1.Y, i95, gg1));
        }
        q0e q0e = el1.D0;
        do {
            value = q0e.getValue();
            Map map3 = (Map) value;
        } while (!q0e.c(value, linkedHashMap));
        return e5f.a;
    }
}
