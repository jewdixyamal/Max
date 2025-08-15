package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: m96  reason: default package */
public final class m96 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z96 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m96(z96 z96, Continuation continuation) {
        super(2, continuation);
        this.Y = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m96) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m96 m96 = new m96(this.Y, continuation);
        m96.X = obj;
        return m96;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.u0.setValue((List) this.X);
        return e5f.a;
    }
}
