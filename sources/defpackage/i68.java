package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: i68  reason: default package */
public final class i68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i68(Continuation continuation, u4d u4d) {
        super(2, continuation);
        this.Y = u4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i68) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i68 i68 = new i68(continuation, this.Y);
        i68.X = obj;
        return i68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.E((List) this.X);
        return e5f.a;
    }
}
