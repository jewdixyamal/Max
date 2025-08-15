package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wa2  reason: default package */
public final class wa2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ je7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wa2(je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wa2) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wa2 wa2 = new wa2(this.Y, continuation);
        wa2.X = obj;
        return wa2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((i8a) ((ra2) this.Y.getValue())).b.g((List) this.X);
        return e5f.a;
    }
}
