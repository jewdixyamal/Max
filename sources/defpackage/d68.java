package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: d68  reason: default package */
public final class d68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d68) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d68 d68 = new d68(continuation, this.Y);
        d68.X = obj;
        return d68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = MediaBarWidget.d1;
        this.Y.D0((i5d) this.X);
        return e5f.a;
    }
}
