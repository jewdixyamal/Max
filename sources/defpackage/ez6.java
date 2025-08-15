package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ez6  reason: default package */
public final class ez6 extends ffe implements a66 {
    public final /* synthetic */ fz6 X;
    public final /* synthetic */ a86 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ez6(fz6 fz6, a86 a86, int i, Continuation continuation) {
        super(2, continuation);
        this.X = fz6;
        this.Y = a86;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ez6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ez6(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        fz6 fz6 = this.X;
        ConcurrentHashMap concurrentHashMap = fz6.A0;
        a86 a86 = this.Y;
        List list = (List) concurrentHashMap.get(a86);
        e5f e5f = e5f.a;
        if (list == null) {
            return e5f;
        }
        int i = a86 instanceof z76 ? 40 : this.Z;
        if (list.size() <= i) {
            return e5f;
        }
        fz6.A0.put(a86, list.subList(0, i));
        return e5f;
    }
}
