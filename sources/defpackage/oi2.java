package defpackage;

import android.view.Surface;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: oi2  reason: default package */
public final class oi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oi2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oi2 oi2 = new oi2(continuation, this.Y);
        oi2.X = obj;
        return oi2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            bc7[] bc7Arr = ChatMediaViewerScreen.K0;
            ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
            chatMediaViewerScreen.z0();
            if (ChatMediaViewerScreen.v0(chatMediaViewerScreen)) {
                dkf B0 = chatMediaViewerScreen.B0();
                B0.pause();
                B0.M0((Surface) null);
                B0.N0();
            }
            hi2.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
