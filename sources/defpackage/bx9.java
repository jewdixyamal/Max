package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: bx9  reason: default package */
public final class bx9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gx9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx9(gx9 gx9, Continuation continuation) {
        super(2, continuation);
        this.Y = gx9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bx9) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bx9 bx9 = new bx9(this.Y, continuation);
        bx9.X = obj;
        return bx9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.Z.setValue((List) this.X);
        return e5f.a;
    }
}
