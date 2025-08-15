package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: h68  reason: default package */
public final class h68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h68) n((j48) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h68 h68 = new h68(continuation, this.Y);
        h68.X = obj;
        return h68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        j48 j48 = (j48) this.X;
        boolean z = j48 instanceof d48;
        MediaBarWidget mediaBarWidget = this.Y;
        znc znc = null;
        int i = 0;
        if (z) {
            bc7[] bc7Arr = MediaBarWidget.d1;
            mediaBarWidget.w0().setText(mediaBarWidget.X.f.k);
            mediaBarWidget.D0((i5d) mediaBarWidget.B0().F0.a.getValue());
            boolean z2 = ((Boolean) mediaBarWidget.B0().D0.a.getValue()).booleanValue() || mediaBarWidget.B0().s();
            mediaBarWidget.w0().setVisibility(z2 ? 0 : 8);
            bc7 bc7 = MediaBarWidget.d1[16];
            w12 w12 = (w12) mediaBarWidget.P0.getValue();
            if (!(!z2)) {
                i = 8;
            }
            w12.setVisibility(i);
            mediaBarWidget.E0((n00) mediaBarWidget.B0().s0.getValue());
            f6b x0 = mediaBarWidget.x0();
            if (!x0.isLaidOut() || x0.isLayoutRequested()) {
                x0.addOnLayoutChangeListener(new k68(mediaBarWidget, 1));
            } else if (mediaBarWidget.B0().s()) {
                mediaBarWidget.x0().k();
            } else {
                mediaBarWidget.x0().setHalfScreen((a66) null);
            }
            an9.g(mediaBarWidget.o, wuc.CHAT_ATTACH_PICKER);
        } else if (j48 instanceof a48) {
            if (((a48) j48).a) {
                bc7[] bc7Arr2 = MediaBarWidget.d1;
                mediaBarWidget.w0().setText((CharSequence) null);
            }
            bc7[] bc7Arr3 = MediaBarWidget.d1;
            mediaBarWidget.x0().j(true);
        } else if (j48 instanceof b48) {
            bc7[] bc7Arr4 = MediaBarWidget.d1;
            mediaBarWidget.w0().e(false);
        } else if (j48 instanceof e48) {
            bc7[] bc7Arr5 = MediaBarWidget.d1;
            mediaBarWidget.getClass();
            bc7[] bc7Arr6 = BottomSheetWidget.x0;
            lg3 e = wg0.e(u8a.B, 6, (Bundle) null);
            e.a(new mg3(1, new eqe(u8a.z), 1, false));
            e.a(new mg3(2, new eqe(u8a.A), 2, false));
            ConfirmationBottomSheet e2 = e.e();
            e2.setTargetController(mediaBarWidget);
            uu3 uu3 = mediaBarWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e2.z0(mediaBarWidget);
            if (znc != null) {
                coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (j48 instanceof z38) {
            bc7[] bc7Arr7 = MediaBarWidget.d1;
            pnf.o(mediaBarWidget.u0().o, h86.a);
        } else if (j48 instanceof c48) {
            bc7[] bc7Arr8 = MediaBarWidget.d1;
            s86 u0 = mediaBarWidget.u0();
            q4d q4d = ((c48) j48).a;
            u0.getClass();
            pnf.o(u0.o, new j86(q4d));
        } else if (j48 instanceof g48) {
            g48 g48 = (g48) j48;
            up7 H = ay7.H(g48.a.a);
            bc7[] bc7Arr9 = MediaBarWidget.d1;
            mediaBarWidget.C0(H, g48.b, "SELECTED_MEDIA_ALBUM");
        } else if (j48 instanceof h48) {
            MediaBarWidget.m0(mediaBarWidget, s8a.k, u8a.V);
        } else if (j48 instanceof f48) {
            MediaBarWidget.m0(mediaBarWidget, s8a.j, u8a.U);
        } else if (j48 instanceof i48) {
            MediaBarWidget.n0(mediaBarWidget, ((i48) j48).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
