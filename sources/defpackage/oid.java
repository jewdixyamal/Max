package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.storage.ui.SettingsStorageScreen;

/* renamed from: oid  reason: default package */
public final class oid extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsStorageScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oid(Continuation continuation, SettingsStorageScreen settingsStorageScreen) {
        super(2, continuation);
        this.Y = settingsStorageScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oid) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oid oid = new oid(continuation, this.Y);
        oid.X = obj;
        return oid;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof mid;
        SettingsStorageScreen settingsStorageScreen = this.Y;
        if (z) {
            mid mid = (mid) wm9;
            bc7[] bc7Arr = SettingsStorageScreen.X;
            settingsStorageScreen.getClass();
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            znc znc = null;
            lg3 a = od2.a(mid.b, (Bundle) null, 4);
            jqe jqe = mid.d;
            if (jqe != null) {
                a.f(jqe);
            }
            for (lid lid : mid.c) {
                boolean z2 = lid.c;
                jqe jqe2 = lid.b;
                int i = lid.a;
                if (z2) {
                    a.b(i, (eqe) jqe2);
                } else {
                    a.d(i, (eqe) jqe2);
                }
            }
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(settingsStorageScreen);
            uu3 uu3 = settingsStorageScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(settingsStorageScreen);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (wm9 instanceof nid) {
            wha wha = new wha((Widget) settingsStorageScreen);
            wha.g(((nid) wm9).b);
            wha.e(new kia(gpc.c));
            wha.i();
        }
        return e5f.a;
    }
}
