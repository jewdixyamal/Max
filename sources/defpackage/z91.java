package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: z91  reason: default package */
public final class z91 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIndicatorWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z91(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = callIndicatorWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z91) n((String) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z91 z91 = new z91(this.Y, continuation);
        z91.X = obj;
        return z91;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        CallIndicatorWidget.m0(this.Y).setTime((String) this.X);
        return e5f.a;
    }
}
