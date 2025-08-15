package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: c61  reason: default package */
public final class c61 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ s51 Y;
    public final /* synthetic */ h61 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c61(s51 s51, h61 h61, Continuation continuation) {
        super(2, continuation);
        this.Y = s51;
        this.Z = h61;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c61) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c61(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        tx3 tx3 = tx3.a;
        int i = this.X;
        s51 s51 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long longValue = ((oqf) s51).b.longValue();
            this.X = 1;
            if (j47.x(longValue, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0e q0e = this.Z.o;
        do {
            value = q0e.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.remove(Integer.valueOf(s51.getPriority()));
        } while (!q0e.c(value, mz7.d0(linkedHashMap)));
        return e5f.a;
    }
}
