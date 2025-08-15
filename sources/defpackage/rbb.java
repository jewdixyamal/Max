package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* renamed from: rbb  reason: default package */
public final class rbb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rbb(Continuation continuation, ProfileAvatarsScreen profileAvatarsScreen) {
        super(2, continuation);
        this.Y = profileAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rbb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rbb rbb = new rbb(continuation, this.Y);
        rbb.X = obj;
        return rbb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        ProfileAvatarsScreen profileAvatarsScreen = this.Y;
        gbb gbb = profileAvatarsScreen.w0;
        if (!gbb.w0.isEmpty() || !(!list.isEmpty())) {
            wj4 e = lz7.e(new b81(3, gbb.w0, list));
            gbb.w0 = list;
            e.a(new y8((Object) gbb));
        } else {
            gbb.w0 = list;
            gbb.p(0, list.size());
        }
        ProfileAvatarsScreen.w0(profileAvatarsScreen, profileAvatarsScreen.B0().b.getTitle(), profileAvatarsScreen.C0().getCurrentItem());
        return e5f.a;
    }
}
