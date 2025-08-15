package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: k5e  reason: default package */
public final class k5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ q5e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k5e(q5e q5e, Continuation continuation) {
        super(2, continuation);
        this.Y = q5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((k5e) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k5e k5e = new k5e(this.Y, continuation);
        k5e.X = obj;
        return k5e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        q5e q5e = this.Y;
        List list = (List) q5e.v0.updateAndGet(new oz0((List) this.X, 4, q5e));
        String str = ((l5e) q5e.w0.get()).a;
        if (str == null || str.length() == 0) {
            q5e.Z.m((Object) null, new szc(2, list));
        }
        return e5f.a;
    }
}
