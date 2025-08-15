package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: ilb  reason: default package */
public final class ilb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ilb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ilb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ilb ilb = new ilb(continuation, this.Y);
        ilb.X = obj;
        return ilb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        amb amb = (amb) this.X;
        boolean z = amb instanceof vlb;
        znc znc = null;
        ProfileScreen profileScreen = this.Y;
        if (z) {
            vlb vlb = (vlb) amb;
            bc7[] bc7Arr = ProfileScreen.D0;
            profileScreen.getClass();
            bc7[] bc7Arr2 = BottomSheetWidget.x0;
            lg3 a = od2.a(vlb.a, vlb.d, 4);
            a.f(vlb.b);
            mg3[] mg3Arr = (mg3[]) vlb.c.toArray(new mg3[0]);
            a.a((mg3[]) Arrays.copyOf(mg3Arr, mg3Arr.length));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(profileScreen);
            uu3 uu3 = profileScreen;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(profileScreen);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (amb instanceof ulb) {
            CharSequence b = ((ulb) amb).a.b(profileScreen.getContext());
            if (b != null) {
                wha wha = new wha((Widget) profileScreen);
                wha.e(nia.a);
                wha.f(pia.a);
                wha.h(b);
                wha.d(new fd7(amb));
                wha.i();
            }
        } else if (amb instanceof wlb) {
            CharSequence b2 = ((wlb) amb).a.b(profileScreen.getContext());
            if (b2 != null) {
                wha wha2 = new wha((Widget) profileScreen);
                wha2.e(new kia(gpc.x0));
                wha2.h(b2);
                wha2.i();
            }
        } else if (amb instanceof zlb) {
            wha wha3 = new wha((Widget) profileScreen);
            zlb zlb = (zlb) amb;
            Integer num = zlb.a;
            if (num != null) {
                wha3.e(new kia(num.intValue()));
            }
            wha3.g(zlb.b);
            wha3.i();
        } else if (amb instanceof rlb) {
            String str = o37.a;
            Context context = profileScreen.getContext();
            CharSequence b3 = ((rlb) amb).a.b(profileScreen.getContext());
            if (b3 == null) {
                b3 = "";
            }
            o37.d(context, b3, (Uri) null);
        } else if (amb instanceof ylb) {
            bc7[] bc7Arr3 = ProfileScreen.D0;
            profileScreen.getClass();
            dy7.c(1).I(((ylb) amb).a).Y((ufd) profileScreen.y0.T0(profileScreen, ProfileScreen.D0[9])).build().q(profileScreen);
        } else if (amb instanceof xlb) {
            ((xlb) amb).getClass();
            dy7.g(new kpa("profile:participant_id_for_action", new Long(0)));
            bc7[] bc7Arr4 = ProfileScreen.D0;
            profileScreen.q0();
            throw null;
        } else if (tpa.f(amb, slb.a)) {
            bc7[] bc7Arr5 = ProfileScreen.D0;
            ((eua) profileScreen.A0.getValue()).g(new l5g(profileScreen, 1));
        } else if (amb instanceof tlb) {
            try {
                profileScreen.startActivityForResult(((tlb) amb).a, 333);
                an9.g((an9) profileScreen.B0.getValue(), wuc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                bc7[] bc7Arr6 = ProfileScreen.D0;
                profileScreen.r0().z();
                hm9.p(ProfileScreen.class.getName(), "failed open camera", (Throwable) null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
