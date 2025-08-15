package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ncb  reason: default package */
public final class ncb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ncb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ncb) n((m22) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ncb ncb = new ncb(continuation, this.Y);
        ncb.X = obj;
        return ncb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        m22 m22 = (m22) this.X;
        bc7[] bc7Arr = ProfileChangeLinkScreen.v0;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.Y;
        profileChangeLinkScreen.o0().setTitle(m22.a);
        ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setEnabled(m22.c);
        ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setProgressEnabled(m22.d);
        int ordinal = profileChangeLinkScreen.n0().ordinal();
        int i = 0;
        if (ordinal == 0) {
            ProfileChangeLinkScreen.m0(profileChangeLinkScreen).setVisibility(0);
        } else if (ordinal == 1) {
            OneMeButton m0 = ProfileChangeLinkScreen.m0(profileChangeLinkScreen);
            if (!m22.b) {
                i = 8;
            }
            m0.setVisibility(i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
