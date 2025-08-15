package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* renamed from: fte  reason: default package */
public final class fte extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThreadsStateViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fte(Continuation continuation, ThreadsStateViewerScreen threadsStateViewerScreen) {
        super(2, continuation);
        this.Y = threadsStateViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fte) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fte fte = new fte(continuation, this.Y);
        fte.X = obj;
        return fte;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.o.E((List) this.X);
        return e5f.a;
    }
}
