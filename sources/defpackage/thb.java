package defpackage;

import android.os.Bundle;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: thb  reason: default package */
public final class thb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileInviteScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public thb(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileInviteScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((thb) n((phb) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        thb thb = new thb(this.Y, continuation);
        thb.X = obj;
        return thb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        phb phb = (phb) this.X;
        boolean z = phb instanceof ohb;
        e5f e5f = e5f.a;
        ProfileInviteScreen profileInviteScreen = this.Y;
        if (z) {
            ohb ohb = (ohb) phb;
            CharSequence b = ohb.a.b(profileInviteScreen.getContext());
            if (b == null) {
                return e5f;
            }
            wha wha = new wha((Widget) profileInviteScreen);
            wha.e(new kia(ohb.b));
            wha.h(b);
            wha.i();
        } else if (phb instanceof lhb) {
            tpa.o(profileInviteScreen.getContext(), ((lhb) phb).a);
        } else if (phb instanceof nhb) {
            qt3 I = dy7.c(1).I(((nhb) phb).a);
            bc7[] bc7Arr = ProfileInviteScreen.Y;
            profileInviteScreen.getClass();
            I.Y((ImageView) profileInviteScreen.X.T0(profileInviteScreen, ProfileInviteScreen.Y[0])).build().q(profileInviteScreen);
        } else if (phb instanceof mhb) {
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            mhb mhb = (mhb) phb;
            znc znc = null;
            lg3 a = od2.a(mhb.a, (Bundle) null, 6);
            a.f(mhb.b);
            mhb.c.forEach(new hk2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 11), 9));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(profileInviteScreen);
            uu3 uu3 = profileInviteScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(profileInviteScreen);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
