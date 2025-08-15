package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: x58  reason: default package */
public final class x58 extends ffe implements a66 {
    public final /* synthetic */ MediaBarWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x58(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((x58) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x58(continuation, this.X);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = MediaBarWidget.d1;
        br7.d(this.X.r0(), MediaBarWidget.e1, (m56) null);
        return e5f.a;
    }
}
