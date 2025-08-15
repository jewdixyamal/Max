package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: c68  reason: default package */
public final class c68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((c68) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c68 c68 = new c68(continuation, this.Y);
        c68.X = obj;
        return c68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = MediaBarWidget.d1;
        this.Y.E0((n00) this.X);
        return e5f.a;
    }
}
