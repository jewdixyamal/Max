package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: keb  reason: default package */
public final class keb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public keb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((keb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        keb keb = new keb(continuation, this.Y);
        keb.X = obj;
        return keb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ldb ldb = (ldb) this.X;
        boolean z = ldb instanceof jdb;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
        if (z) {
            mr0.G(profileEditAdminPermissionsWidget);
            bc7[] bc7Arr = BottomSheetWidget.x0;
            jdb jdb = (jdb) ldb;
            znc znc = null;
            lg3 a = od2.a(jdb.a, (Bundle) null, 6);
            a.f(jdb.b);
            jdb.c.forEach(new oo2(new jk2(1, a, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 9), 1));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(profileEditAdminPermissionsWidget);
            uu3 uu3 = profileEditAdminPermissionsWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e.z0(profileEditAdminPermissionsWidget);
            if (znc != null) {
                coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (ldb instanceof kdb) {
            vha vha = profileEditAdminPermissionsWidget.w0;
            if (vha != null) {
                vha.a();
            }
            wha wha = new wha((Widget) profileEditAdminPermissionsWidget);
            kdb kdb = (kdb) ldb;
            wha.g(kdb.a);
            Integer num = kdb.b;
            if (num != null) {
                wha.e(new kia(num.intValue()));
            }
            profileEditAdminPermissionsWidget.w0 = wha.i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
