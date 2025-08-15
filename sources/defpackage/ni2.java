package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: ni2  reason: default package */
public final class ni2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ni2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ni2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ni2 ni2 = new ni2(continuation, this.Y);
        ni2.X = obj;
        return ni2;
    }

    public final Object o(Object obj) {
        yk8 yk8;
        od2.a0(obj);
        q35 q35 = (q35) this.X;
        bc7[] bc7Arr = ChatMediaViewerScreen.K0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        chatMediaViewerScreen.getClass();
        if (q35 instanceof k35) {
            vxd vxd = chatMediaViewerScreen.I0;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            if (((k35) q35).a instanceof qb8) {
                chatMediaViewerScreen.A0().a((aj2) chatMediaViewerScreen.D0().S0.a.getValue());
                yk8 yk82 = chatMediaViewerScreen.A0;
                if (yk82 != null) {
                    br7.b((ViewGroup) yk82.b, yk82.a(), -1);
                }
                if (chatMediaViewerScreen.A0().getVisibility() == 0 && (yk8 = chatMediaViewerScreen.A0) != null) {
                    yk8.c(true);
                }
                dkf B0 = chatMediaViewerScreen.B0();
                if (chatMediaViewerScreen.G0 < 0.0f && B0.e() == 0.0f) {
                    B0.g(1.0f);
                }
                chatMediaViewerScreen.F0();
            } else {
                g07 A0 = chatMediaViewerScreen.A0();
                je7 je7 = A0.w0;
                if (je7.a()) {
                    ((w3b) je7.getValue()).setVisibility(8);
                }
                je7 je72 = A0.x0;
                if (je72.a()) {
                    ((ImageView) je72.getValue()).setVisibility(8);
                }
            }
        } else if (!(q35 instanceof l35)) {
            if (q35 instanceof i35) {
                i35 i35 = (i35) q35;
                if (i35.a != null) {
                    wha wha = new wha((Widget) chatMediaViewerScreen);
                    wha.h(chatMediaViewerScreen.getContext().getString(i35.a.intValue()));
                    wha.e(new kia(woc.I));
                    wha.i();
                }
                i3a onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
            } else if (q35 instanceof j35) {
                j35 j35 = (j35) q35;
                int i = j35.a;
                if (i == 5) {
                    yk8 yk83 = chatMediaViewerScreen.A0;
                    if ((yk83 != null ? yk83.a : 0) != i) {
                        chatMediaViewerScreen.E0(j35.b);
                    }
                }
                yk8 yk84 = chatMediaViewerScreen.A0;
                if (yk84 != null) {
                    yk84.b(j35.a);
                }
            } else if (!(q35 instanceof m35)) {
                if (q35 instanceof n35) {
                    hi2 hi2 = hi2.c;
                    n35 n35 = (n35) q35;
                    long j = n35.a;
                    int w0 = chatMediaViewerScreen.w0();
                    f64 P1 = hi2.P1();
                    y7g y7g = new y7g(13);
                    y7g.b = ":dialogs/share-media";
                    y7g.D(Long.valueOf(j), "msg_id");
                    y7g.D(Long.valueOf(n35.b), "attach_id");
                    y7g.D(n35.c, "local_attach_id");
                    y7g.D(Integer.valueOf(n35.d.ordinal()), "cause_ordinal");
                    y7g.D(Integer.valueOf(w0), "snack_bot_margin");
                    y7g.D(Boolean.TRUE, "force_dark");
                    P1.c(y7g.r(), (Bundle) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return e5f.a;
    }
}
