package defpackage;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.SettingsListScreen;

/* renamed from: hgd  reason: default package */
public final class hgd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hgd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hgd) n((wm9) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hgd hgd = new hgd(this.Y, continuation);
        hgd.X = obj;
        return hgd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof wgd;
        e5f e5f = e5f.a;
        znc znc = null;
        if (z) {
            cgd.c.P1().b(ey8.i(((wgd) wm9).b, ":profile/edit?id=", "&type=contact"), (Bundle) null);
        } else if (wm9 instanceof xgd) {
            cgd.c.P1().b(ey8.i(((xgd) wm9).b, ":profile/avatars?id=", "&type=contact"), (Bundle) null);
        } else {
            boolean f = tpa.f(wm9, tgd.b);
            SettingsListScreen settingsListScreen = this.Y;
            if (f) {
                bc7[] bc7Arr = SettingsListScreen.B0;
                settingsListScreen.getClass();
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                lg3 e = wg0.e(mha.s, 6, (Bundle) null);
                e.a(new mg3(lha.d, new eqe(mha.v), 3, false));
                e.a(new mg3(lha.c, new eqe(mha.u), 3, false));
                e.a(new mg3(lha.b, new eqe(mha.t), 3, false));
                e.a(new mg3(lha.a, new eqe(mha.p), 2, false));
                ConfirmationBottomSheet e2 = e.e();
                e2.setTargetController(settingsListScreen);
                uu3 uu3 = settingsListScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e2.z0(settingsListScreen);
                if (znc != null) {
                    coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (tpa.f(wm9, ugd.b)) {
                bc7[] bc7Arr3 = SettingsListScreen.B0;
                ((eua) settingsListScreen.v0.getValue()).g(new l5g(settingsListScreen, 1));
            } else if (wm9 instanceof vgd) {
                settingsListScreen.startActivityForResult(((vgd) wm9).b, 666);
            } else if (wm9 instanceof ygd) {
                try {
                    settingsListScreen.startActivityForResult(((ygd) wm9).b, 333);
                    an9.g((an9) settingsListScreen.w0.getValue(), wuc.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    hm9.p(settingsListScreen.getClass().getName(), "failed open camera", (Throwable) null);
                    settingsListScreen.q0().v();
                }
            } else if (tpa.f(wm9, zgd.b)) {
                cgd.c.P1().b(":media-picker/select/photo", (Bundle) null);
            } else if (wm9 instanceof ahd) {
                ahd ahd = (ahd) wm9;
                CharSequence b = ahd.b.b(settingsListScreen.getContext());
                if (b == null) {
                    return e5f;
                }
                wha wha = (wha) settingsListScreen.u0.getValue();
                wha.h(b);
                Integer num = ahd.c;
                wha.e(num != null ? new kia(num.intValue()) : lia.a);
                wha.i();
            } else if (wm9 instanceof c64) {
                cgd.c.R1((c64) wm9);
            }
        }
        return e5f;
    }
}
