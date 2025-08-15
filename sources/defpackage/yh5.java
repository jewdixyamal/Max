package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yh5  reason: default package */
public final class yh5 extends ffe implements a66 {
    public final /* synthetic */ bi5 X;
    public final /* synthetic */ List Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yh5(bi5 bi5, List list, Continuation continuation) {
        super(2, continuation);
        this.X = bi5;
        this.Y = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yh5) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yh5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bi5.a(this.X, this.Y);
        return e5f.a;
    }
}
