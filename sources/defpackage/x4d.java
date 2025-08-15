package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: x4d  reason: default package */
public final class x4d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x4d(y4d y4d, Continuation continuation) {
        super(2, continuation);
        this.Y = y4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((x4d) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x4d x4d = new x4d(this.Y, continuation);
        x4d.X = obj;
        return x4d;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        y4d y4d = this.Y;
        y4d.a.clear();
        for (v4d v4d : (List) this.X) {
            y4d.a.put(new Long(v4d.a), v4d);
        }
        return e5f.a;
    }
}
