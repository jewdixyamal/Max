package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: oed  reason: default package */
public final class oed extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ped Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oed(ped ped, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ped;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oed) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oed(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        long j;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        ped ped = this.Y;
        if (i == 0) {
            od2.a0(obj);
            q0e q0e = ped.t0;
            do {
                value = q0e.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                j = this.Z;
                linkedHashMap.remove(new Long(j));
            } while (!q0e.c(value, linkedHashMap));
            this.X = 1;
            ((qq3) ped.Z.getValue()).a(j);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(ped.y0, new ced(new eqe(kha.f)));
        return e5f;
    }
}
