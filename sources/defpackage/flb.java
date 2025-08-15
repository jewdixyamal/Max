package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* renamed from: flb  reason: default package */
public final class flb extends ffe implements a66 {
    public final /* synthetic */ ProfileScreen X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public flb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.X = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((flb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new flb(continuation, this.X);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ProfileScreen profileScreen = this.X;
        View view = profileScreen.getView();
        e5f e5f = e5f.a;
        if (view != null && !profileScreen.r0().O0.r() && !profileScreen.r0().O0.p()) {
            j03 j03 = (j03) profileScreen.z0.T0(profileScreen, ProfileScreen.D0[11]);
            if (!tpa.f(j03.c(), "profile_members_list_widget")) {
                coc coc = new coc(new ChatMembersCompactWidget(profileScreen.getArgs().getLong("profile:id")), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("profile_members_list_widget");
                j03.a.R(coc);
            }
        }
        return e5f;
    }
}
