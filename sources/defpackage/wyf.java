package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: wyf  reason: default package */
public final class wyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wyf(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.Y = webAppRootScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wyf) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wyf wyf = new wyf(continuation, this.Y);
        wyf.X = obj;
        return wyf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rtf rtf = (rtf) this.X;
        bc7[] bc7Arr = WebAppRootScreen.G0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.getClass();
        if (rtf instanceof ntf) {
            bwf bwf = webAppRootScreen.z0;
            if (bwf != null) {
                ntf ntf = (ntf) rtf;
                bwf.e(ntf.c, ntf.a, ntf.b);
            }
        } else {
            znc znc = null;
            if (tpa.f(rtf, otf.a)) {
                zxf zxf = zxf.c;
                bc7 bc7 = WebAppRootScreen.G0[1];
                long longValue = ((Number) webAppRootScreen.t0.a(webAppRootScreen)).longValue();
                zxf.P1().d();
                f64 P1 = zxf.P1();
                P1.b(":settings/webapp?bot_id=" + longValue, (Bundle) null);
            } else if (rtf instanceof ptf) {
                Bundle g = zr6.g(4, "dialog_id");
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                ptf ptf = (ptf) rtf;
                lg3 a = od2.a(ptf.a, g, 4);
                a.f(ptf.b);
                a.a.putInt("icon", woc.A);
                ptf.c.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 14), 12));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(webAppRootScreen);
                uu3 uu3 = webAppRootScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(webAppRootScreen);
                if (znc != null) {
                    coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (rtf instanceof qtf) {
                Bundle g2 = zr6.g(5, "dialog_id");
                bc7[] bc7Arr3 = BottomSheetWidget.x0;
                qtf qtf = (qtf) rtf;
                lg3 a2 = od2.a(qtf.a, g2, 4);
                qtf.b.forEach(new hk2(new jk2(1, a2, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 15), 13));
                ConfirmationBottomSheet e2 = a2.e();
                e2.setTargetController(webAppRootScreen);
                uu3 uu32 = webAppRootScreen;
                while (uu32.getParentController() != null) {
                    uu32 = uu32.getParentController();
                }
                foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
                if (foc2 != null) {
                    znc = foc2.T();
                }
                e2.z0(webAppRootScreen);
                if (znc != null) {
                    coc coc2 = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc2, true, "BottomSheetWidget");
                    znc.G(coc2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
