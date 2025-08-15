package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: cgb  reason: default package */
public final class cgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cgb(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cgb) n((wm9) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cgb cgb = new cgb(this.Y, continuation);
        cgb.X = obj;
        return cgb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean f = tpa.f(wm9, jfb.b);
        e5f e5f = e5f.a;
        if (!f) {
            boolean z = wm9 instanceof rfb;
            znc znc = null;
            ProfileEditScreen profileEditScreen = this.Y;
            if (z) {
                mr0.G(profileEditScreen);
                bc7[] bc7Arr = BottomSheetWidget.x0;
                rfb rfb = (rfb) wm9;
                lg3 a = od2.a(rfb.b, (Bundle) null, 6);
                a.f(rfb.c);
                rfb.d.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 10), 8));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(profileEditScreen);
                uu3 uu3 = profileEditScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e.z0(profileEditScreen);
                if (znc != null) {
                    coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (wm9 instanceof sfb) {
                sfb sfb = (sfb) wm9;
                CharSequence b = sfb.b.b(profileEditScreen.getContext());
                if (b == null) {
                    return e5f;
                }
                wha wha = new wha((Widget) profileEditScreen);
                wha.h(b);
                Integer num = sfb.c;
                wha.e(num != null ? new kia(num.intValue()) : lia.a);
                wha.i();
            } else if (tpa.f(wm9, ofb.b)) {
                bc7[] bc7Arr2 = ProfileEditScreen.y0;
                profileEditScreen.n0().u();
            } else if (tpa.f(wm9, qfb.b)) {
                gfb.c.P1().b(":media-picker/select/photo", (Bundle) null);
            } else if (wm9 instanceof pfb) {
                try {
                    profileEditScreen.startActivityForResult(((pfb) wm9).b, 333);
                    an9.g((an9) profileEditScreen.w0.getValue(), wuc.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    hm9.p(profileEditScreen.getClass().getName(), "failed open camera", (Throwable) null);
                    profileEditScreen.n0().s();
                }
            } else if (wm9 instanceof kfb) {
                profileEditScreen.startActivityForResult(((kfb) wm9).b, 666);
            } else if (tpa.f(wm9, hfb.b)) {
                bc7[] bc7Arr3 = ProfileEditScreen.y0;
                ((eua) profileEditScreen.v0.getValue()).g(new l5g(profileEditScreen, 1));
            } else if (tpa.f(wm9, nfb.b)) {
                bc7[] bc7Arr4 = ProfileEditScreen.y0;
                if (profileEditScreen.getRouter().e().size() == 2) {
                    coc coc2 = (coc) profileEditScreen.getRouter().e().get(1);
                    if (tpa.f(coc2 != null ? coc2.a : null, profileEditScreen)) {
                        Activity d = ((haa) gfb.c.P1().a()).f().C().d();
                        if (d != null) {
                            d.finish();
                        }
                    }
                }
                gfb.c.P1().b(":chat-list", (Bundle) null);
            } else if (wm9 instanceof mfb) {
                gfb.c.P1().b(ey8.i(((mfb) wm9).b, ":chats?id=", "&type=local"), (Bundle) null);
            } else if (wm9 instanceof c64) {
                gfb.c.R1((c64) wm9);
            } else if (wm9 instanceof ifb) {
                ifb ifb = (ifb) wm9;
                int ordinal = ifb.c.ordinal();
                long j = ifb.b;
                if (ordinal == 0) {
                    gfb.c.P1().b(ey8.i(j, ":profile/edit/link?id=", "&type=local_chat&flow=edit"), (Bundle) null);
                } else if (ordinal == 1) {
                    gfb.c.P1().b(ey8.i(j, ":profile/edit/link?id=", "&type=server_chat&flow=edit"), (Bundle) null);
                } else if (ordinal == 2) {
                    gfb gfb = gfb.c;
                    gfb.getClass();
                    qyc qyc = (qyc) ((y7d) neb.a.getAccessor().d(y7d.class).getValue());
                    qyc.getClass();
                    if (qyc.n(PmsKey.f3accountnicknameenabled, false)) {
                        gfb.P1().b(ey8.i(j, ":profile/edit/link?id=", "&type=contact&flow=edit"), (Bundle) null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (wm9 instanceof lfb) {
                gfb gfb2 = gfb.c;
                long j2 = ((lfb) wm9).b;
                f64 P1 = gfb2.P1();
                P1.b(":profile/invite?id=" + j2, (Bundle) null);
            } else if (wm9 instanceof g43) {
                mr0.G(profileEditScreen);
                profileEditScreen.getRouter().B(profileEditScreen);
            }
        }
        return e5f;
    }
}
