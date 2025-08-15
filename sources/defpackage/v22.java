package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: v22  reason: default package */
public final class v22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v22(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((v22) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v22 v22 = new v22(continuation, this.Y);
        v22.X = obj;
        return v22;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof nkb) {
            ckb.c.a2(((nkb) wm9).b);
        } else {
            boolean z = wm9 instanceof pkb;
            znc znc = null;
            ChangeOwnerScreen changeOwnerScreen = this.Y;
            if (z) {
                bc7[] bc7Arr = ChangeOwnerScreen.u0;
                if (changeOwnerScreen.getRouter().e().size() == 1) {
                    coc coc = (coc) x53.i0(changeOwnerScreen.getRouter().e());
                    if (tpa.f(coc != null ? coc.a : null, changeOwnerScreen)) {
                        ckb.c.f2();
                    }
                }
                ckb.c.P1().b(":chat-list", (Bundle) null);
            } else if (wm9 instanceof y22) {
                y22 y22 = (y22) wm9;
                Bundle g = dy7.g(new kpa("new_owner_id", new Long(y22.d)));
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                lg3 a = od2.a(y22.b, g, 4);
                a.f(y22.c);
                bc7[] bc7Arr3 = ChangeOwnerScreen.u0;
                if (changeOwnerScreen.n0()) {
                    a.b(wea.q, new eqe(yea.i0));
                } else {
                    int i = wea.q;
                    eqe eqe = new eqe(yea.g0);
                    Bundle bundle = a.a;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    }
                    parcelableArrayList.add(new mg3(i, eqe, 4, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                }
                a.c(wea.p, new eqe(yea.f0));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(changeOwnerScreen);
                uu3 uu3 = changeOwnerScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(changeOwnerScreen);
                if (znc != null) {
                    coc coc2 = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc2, true, "BottomSheetWidget");
                    znc.G(coc2);
                }
            }
        }
        return e5f.a;
    }
}
