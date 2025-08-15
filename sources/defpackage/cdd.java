package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.media.ui.SettingMediaScreen;

/* renamed from: cdd  reason: default package */
public final class cdd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingMediaScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cdd(Continuation continuation, SettingMediaScreen settingMediaScreen) {
        super(2, continuation);
        this.Y = settingMediaScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cdd) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cdd cdd = new cdd(continuation, this.Y);
        cdd.X = obj;
        return cdd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        znc znc = null;
        if (wm9 instanceof sgd) {
            sgd sgd = (sgd) wm9;
            bc7[] bc7Arr = SettingMediaScreen.Y;
            SettingMediaScreen settingMediaScreen = this.Y;
            settingMediaScreen.getClass();
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            lg3 a = od2.a(sgd.b, (Bundle) null, 4);
            for (rgd rgd : sgd.c) {
                boolean z = rgd.c;
                jqe jqe = rgd.a;
                int i = rgd.b;
                if (z) {
                    a.b(i, (eqe) jqe);
                } else {
                    a.d(i, (eqe) jqe);
                }
            }
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(settingMediaScreen);
            uu3 uu3 = settingMediaScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(settingMediaScreen);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (wm9 instanceof c64) {
            bdd.c.R1((c64) wm9);
        } else if (wm9 instanceof qgd) {
            bdd.c.P1().b(":settings/caching", (Bundle) null);
        }
        return e5f.a;
    }
}
