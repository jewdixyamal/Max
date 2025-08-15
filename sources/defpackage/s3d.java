package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: s3d  reason: default package */
public final class s3d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ f4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s3d(Continuation continuation, f4d f4d) {
        super(2, continuation);
        this.Y = f4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((s3d) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s3d s3d = new s3d(continuation, this.Y);
        s3d.X = obj;
        return s3d;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.E((List) this.X);
        return e5f.a;
    }
}
