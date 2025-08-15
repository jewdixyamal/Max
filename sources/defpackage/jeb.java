package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: jeb  reason: default package */
public final class jeb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jeb(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jeb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jeb jeb = new jeb(continuation, this.Y);
        jeb.X = obj;
        return jeb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof qdb) {
            gfb.c.P1().b(ey8.i(((qdb) wm9).b, ":chats?id=", "&type=local"), (Bundle) null);
        } else if (wm9 instanceof g43) {
            ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.Y;
            mr0.G(profileEditAdminPermissionsWidget);
            profileEditAdminPermissionsWidget.getRouter().B(profileEditAdminPermissionsWidget);
        } else if (wm9 instanceof c64) {
            gfb.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
