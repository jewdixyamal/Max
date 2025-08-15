package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.server.ServerHostBottomSheet;

/* renamed from: p7d  reason: default package */
public final class p7d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ServerHostBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p7d(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet) {
        super(2, continuation);
        this.Y = serverHostBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p7d) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p7d p7d = new p7d(continuation, this.Y);
        p7d.X = obj;
        return p7d;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.A0.E((List) this.X);
        return e5f.a;
    }
}
