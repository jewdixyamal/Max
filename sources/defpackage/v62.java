package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: v62  reason: default package */
public final class v62 extends ffe implements a66 {
    public final /* synthetic */ k72 X;
    public final /* synthetic */ boolean Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v62(k72 k72, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = k72;
        this.Y = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v62(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        k72 k72 = this.X;
        e52 o = k72.o();
        e5f e5f = e5f.a;
        if (o == null) {
            return e5f;
        }
        (this.Y ? k72.u : k72.v).set(((k4a) ((pk) k72.o.getValue())).l(o.a, o.b.a, 0, (String) null, true, (HashMap) null));
        return e5f;
    }
}
