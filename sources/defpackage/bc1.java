package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: bc1  reason: default package */
public final class bc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallJoinLinkPreviewWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.Y = callJoinLinkPreviewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bc1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bc1 bc1 = new bc1(continuation, this.Y);
        bc1.X = obj;
        return bc1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        nb1 nb1 = (nb1) this.X;
        bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.Y;
        callJoinLinkPreviewWidget.getClass();
        ap1 ap1 = (ap1) callJoinLinkPreviewWidget.v0.T0(callJoinLinkPreviewWidget, CallJoinLinkPreviewWidget.B0[6]);
        ap1.setAvatar(nb1.a);
        m38 m38 = m38.b;
        m38 m382 = nb1.c;
        ap1.setButtonAction(m382 == m38 ? iaf.b : iaf.o);
        ap1.I(m382 == m38, nb1.d);
        ap1.J((String) null, (CharSequence) null);
        callJoinLinkPreviewWidget.o0().setText(nb1.e.b(callJoinLinkPreviewWidget.getContext()));
        Drawable drawable = (Drawable) callJoinLinkPreviewWidget.x0.getValue();
        eqe eqe = new eqe(f0c.call_microphone_enabled_accessibility);
        eqe eqe2 = new eqe(f0c.call_microphone_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.s0(callJoinLinkPreviewWidget.m0(), drawable, (Drawable) callJoinLinkPreviewWidget.w0.getValue(), nb1.b, eqe, eqe2);
        Drawable drawable2 = (Drawable) callJoinLinkPreviewWidget.z0.getValue();
        eqe eqe3 = new eqe(f0c.call_video_enabled_accessibility);
        eqe eqe4 = new eqe(f0c.call_video_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.s0(callJoinLinkPreviewWidget.p0(), drawable2, (Drawable) callJoinLinkPreviewWidget.y0.getValue(), nb1.c, eqe3, eqe4);
        yia n0 = callJoinLinkPreviewWidget.n0();
        n0.setAvatars(nb1.f);
        n0.setTitle(nb1.g);
        return e5f.a;
    }
}
