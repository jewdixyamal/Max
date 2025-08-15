package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: qi2  reason: default package */
public final class qi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qi2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qi2 qi2 = new qi2(continuation, this.Y);
        qi2.X = obj;
        return qi2;
    }

    public final Object o(Object obj) {
        yk8 yk8;
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
            vxd vxd = chatMediaViewerScreen.I0;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            chatMediaViewerScreen.A0().a((aj2) chatMediaViewerScreen.D0().S0.a.getValue());
            yk8 yk82 = chatMediaViewerScreen.A0;
            if (yk82 != null) {
                br7.b((ViewGroup) yk82.b, yk82.a(), -1);
            }
            if (chatMediaViewerScreen.A0().getVisibility() == 0 && (yk8 = chatMediaViewerScreen.A0) != null) {
                yk8.c(true);
            }
            chatMediaViewerScreen.F0();
            chatMediaViewerScreen.D0().X0.g(Boolean.FALSE);
        }
        return e5f.a;
    }
}
