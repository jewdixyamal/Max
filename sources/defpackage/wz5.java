package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: wz5  reason: default package */
public final class wz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wz5(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wz5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wz5 wz5 = new wz5(continuation, this.Y);
        wz5.X = obj;
        return wz5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((Boolean) this.X).getClass();
        bc7[] bc7Arr = ForwardPickerScreen.I0;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        forwardPickerScreen.z0().setStartIconDrawable(((iz5) forwardPickerScreen.v0().c).g());
        return e5f.a;
    }
}
