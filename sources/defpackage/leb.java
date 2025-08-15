package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: leb  reason: default package */
public final class leb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public leb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((leb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        leb leb = new leb(continuation, this.Y);
        leb.X = obj;
        return leb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        vdb vdb = (vdb) this.X;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
        gic gic = profileEditAdminPermissionsWidget.u0;
        if (gic.a()) {
            ((OneMeButton) gic.getValue()).setVisibility(vdb.b ? 0 : 8);
            profileEditAdminPermissionsWidget.p0();
        }
        profileEditAdminPermissionsWidget.Z.E(vdb.a);
        return e5f.a;
    }
}
