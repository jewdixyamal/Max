package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: sbb  reason: default package */
public final class sbb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sbb(Continuation continuation, ProfileAvatarsScreen profileAvatarsScreen) {
        super(2, continuation);
        this.Y = profileAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sbb) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sbb sbb = new sbb(continuation, this.Y);
        sbb.X = obj;
        return sbb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        acb acb = (acb) this.X;
        boolean f = tpa.f(acb, zbb.a);
        ProfileAvatarsScreen profileAvatarsScreen = this.Y;
        if (f) {
            bc7[] bc7Arr = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.x0(true);
        } else if (tpa.f(acb, vbb.a)) {
            bc7[] bc7Arr2 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.x0(false);
        } else if (tpa.f(acb, ubb.a)) {
            bc7[] bc7Arr3 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.getRouter().C();
        } else if (acb instanceof xbb) {
            bc7[] bc7Arr4 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.getClass();
            String str = o37.a;
            o37.c(profileAvatarsScreen.getContext(), ((xbb) acb).a, "image/*");
        } else if (acb instanceof wbb) {
            wbb wbb = (wbb) acb;
            bc7[] bc7Arr5 = ProfileAvatarsScreen.z0;
            profileAvatarsScreen.getClass();
            CharSequence b = wbb.a.b(profileAvatarsScreen.getContext());
            if (b != null) {
                int i = wbb.b ? woc.I : woc.n;
                wha wha = new wha((Widget) profileAvatarsScreen);
                wha.e(new kia(i));
                wha.h(b);
                wha.i();
            }
        } else if (acb instanceof ybb) {
            ybb ybb = (ybb) acb;
            int size = profileAvatarsScreen.w0.w0.size();
            int i2 = ybb.a;
            if (i2 >= 0 && i2 < size) {
                profileAvatarsScreen.C0().e(ybb.a, true);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
