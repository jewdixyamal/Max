package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: d7e  reason: default package */
public final class d7e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ i7e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d7e(i7e i7e, Continuation continuation) {
        super(2, continuation);
        this.Z = i7e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d7e) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d7e d7e = new d7e(this.Z, continuation);
        d7e.Y = obj;
        return d7e;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kpa kpa = (kpa) this.Y;
            this.X = 1;
            if (i7e.q(this.Z, (List) kpa.a, (d6e) kpa.b, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
