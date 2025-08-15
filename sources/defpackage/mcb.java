package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: mcb  reason: default package */
public final class mcb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mcb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mcb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mcb mcb = new mcb(continuation, this.Y);
        mcb.X = obj;
        return mcb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (((wm9) this.X) instanceof g43) {
            bc7[] bc7Arr = ProfileChangeLinkScreen.v0;
            ProfileChangeLinkScreen profileChangeLinkScreen = this.Y;
            View view = profileChangeLinkScreen.getView();
            if (view != null) {
                view.clearFocus();
            }
            mr0.G(profileChangeLinkScreen);
            profileChangeLinkScreen.getRouter().B(profileChangeLinkScreen);
        }
        return e5f.a;
    }
}
