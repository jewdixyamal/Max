package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: b61  reason: default package */
public final class b61 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ h61 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b61(h61 h61, Continuation continuation) {
        super(2, continuation);
        this.Y = h61;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b61) n((s51) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b61 b61 = new b61(this.Y, continuation);
        b61.X = obj;
        return b61;
    }

    public final Object o(Object obj) {
        Object value;
        Object obj2;
        od2.a0(obj);
        s51 s51 = (s51) this.X;
        h61 h61 = this.Y;
        q0e q0e = h61.o;
        do {
            value = q0e.getValue();
            Map map = (Map) value;
            if (tpa.f(s51, c51.a) || tpa.f(s51, b51.a)) {
                obj2 = oz4.a;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(s51.getPriority()), s51);
                obj2 = mz7.d0(linkedHashMap);
            }
        } while (!q0e.c(value, obj2));
        if ((s51 instanceof oqf) && ((oqf) s51).b != null) {
            j47.T(h61.a, (lx3) null, (vx3) null, new c61(s51, h61, (Continuation) null), 3);
        }
        return e5f.a;
    }
}
