package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* renamed from: jed  reason: default package */
public final class jed extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsBlacklistScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jed(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.Y = settingsBlacklistScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jed) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jed jed = new jed(continuation, this.Y);
        jed.X = obj;
        return jed;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            ihd.c.R1((c64) wm9);
        } else {
            boolean z = wm9 instanceof aed;
            SettingsBlacklistScreen settingsBlacklistScreen = this.Y;
            if (z) {
                aed aed = (aed) wm9;
                bc7[] bc7Arr = SettingsBlacklistScreen.Z;
                settingsBlacklistScreen.getClass();
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                lg3 a = od2.a(aed.b, aed.e, 4);
                for (zdd zdd : aed.c) {
                    boolean z2 = zdd.c;
                    jqe jqe = zdd.a;
                    int i = zdd.b;
                    if (z2) {
                        a.d(i, (eqe) jqe);
                    } else {
                        a.c(i, (eqe) jqe);
                    }
                }
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(settingsBlacklistScreen);
                uu3 uu3 = settingsBlacklistScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                znc znc = null;
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(settingsBlacklistScreen);
                if (znc != null) {
                    coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (wm9 instanceof bed) {
                wha wha = new wha((Widget) settingsBlacklistScreen);
                wha.g(((bed) wm9).b);
                wha.i();
            } else if (wm9 instanceof ced) {
                wha wha2 = new wha((Widget) settingsBlacklistScreen);
                wha2.e(new kia(hha.b));
                wha2.g(((ced) wm9).b);
                wha2.i();
            }
        }
        return e5f.a;
    }
}
