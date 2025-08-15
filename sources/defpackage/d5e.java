package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: d5e  reason: default package */
public final class d5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d5e(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.Y = stickersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d5e) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d5e d5e = new d5e(continuation, this.Y);
        d5e.X = obj;
        return d5e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ved ved = (ved) this.X;
        bc7[] bc7Arr = StickersScreen.v0;
        StickersScreen stickersScreen = this.Y;
        stickersScreen.getClass();
        if (ved instanceof sed) {
            sed sed = (sed) ved;
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            znc znc = null;
            lg3 a = od2.a(sed.a, (Bundle) null, 6);
            a.f(sed.b);
            sed.c.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 12), 10));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(stickersScreen);
            uu3 uu3 = stickersScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(stickersScreen);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (ved instanceof ued) {
            wha wha = new wha((Widget) stickersScreen);
            ued ued = (ued) ved;
            wha.e(new kia(ued.a));
            CharSequence b = ued.b.b(stickersScreen.getContext());
            if (b == null) {
                b = "";
            }
            wha.h(b);
            wha.i();
        }
        return e5f.a;
    }
}
