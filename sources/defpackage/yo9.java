package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ListIterator;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: yo9  reason: default package */
public final /* synthetic */ class yo9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ yo9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    public final void onClick(View view) {
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = NeuroAvatarsScreen.M0;
                neuroAvatarsScreen.getClass();
                OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.w0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.M0[7]);
                oneMeButton.setProgressEnabled(true);
                oneMeButton.setClickable(false);
                wp9 r0 = neuroAvatarsScreen.r0();
                r0.c.b(((k4d) r0.u0.a.getValue()).a);
                return;
            default:
                bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
                if (neuroAvatarsScreen.o0() != null) {
                    mr0.G(neuroAvatarsScreen);
                    wp9 r02 = neuroAvatarsScreen.r0();
                    r02.getClass();
                    kl7 l = j1e.l();
                    l.add(new mg3(hwb.oneme_login_neuro_avatars_load_from_gallery_action, new eqe(v0c.oneme_login_neuro_avatars_load_from_gallery_action), 3, false));
                    l.add(new mg3(hwb.oneme_login_neuro_avatars_take_photo_action, new eqe(v0c.oneme_login_neuro_avatars_take_photo_action), 3, false));
                    if (((k4d) r02.u0.a.getValue()).a != null) {
                        l.add(new mg3(hwb.oneme_login_neuro_avatars_remove_photo_action, new eqe(v0c.oneme_login_neuro_avatars_remove_photo_action), 1, false));
                    }
                    l.add(new mg3(hwb.oneme_login_neuro_avatars_cancel_action, new eqe(v0c.oneme_login_neuro_avatars_cancel_action), 2, false));
                    kl7 d = j1e.d(l);
                    znc znc = null;
                    lg3 e = wg0.e(v0c.oneme_login_neuro_avatars_bottomsheet_title, 6, (Bundle) null);
                    ListIterator listIterator = d.listIterator(0);
                    while (true) {
                        il7 il7 = (il7) listIterator;
                        if (il7.hasNext()) {
                            e.a((mg3) il7.next());
                        } else {
                            bc7[] bc7Arr3 = BottomSheetWidget.x0;
                            ConfirmationBottomSheet e2 = e.e();
                            e2.setTargetController(neuroAvatarsScreen);
                            uu3 uu3 = neuroAvatarsScreen;
                            while (uu3.getParentController() != null) {
                                uu3 = uu3.getParentController();
                            }
                            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                            if (foc != null) {
                                znc = foc.T();
                            }
                            e2.z0(neuroAvatarsScreen);
                            if (znc != null) {
                                coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                                wg0.l(false, coc, true, "BottomSheetWidget");
                                znc.G(coc);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
