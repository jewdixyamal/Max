package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ui2  reason: default package */
public final class ui2 extends ffe implements a66 {
    public /* synthetic */ long X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ui2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ui2) n(new ft4(((ft4) obj).a), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ui2 ui2 = new ui2(continuation, this.Y);
        ui2.X = ((ft4) obj).a;
        return ui2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long j = this.X;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        boolean z = chatMediaViewerScreen.H0;
        e5f e5f = e5f.a;
        if (z) {
            return e5f;
        }
        g07 A0 = chatMediaViewerScreen.A0();
        long e = ft4.e(j);
        dkf B0 = chatMediaViewerScreen.B0();
        gef gef = B0.Z;
        A0.c(e, gef != null ? B0.o.e0() - gef.m() : 0, chatMediaViewerScreen.B0().G0());
        return e5f;
    }
}
