package defpackage;

import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* renamed from: pbb  reason: default package */
public final /* synthetic */ class pbb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileAvatarsScreen b;

    public /* synthetic */ pbb(ProfileAvatarsScreen profileAvatarsScreen, int i) {
        this.a = i;
        this.b = profileAvatarsScreen;
    }

    public final Object invoke() {
        ProfileAvatarsScreen profileAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ProfileAvatarsScreen.z0;
                return qp4.u0.o(profileAvatarsScreen.getContext()).c;
            case 1:
                bc7[] bc7Arr2 = ProfileAvatarsScreen.z0;
                im requireActivity = profileAvatarsScreen.requireActivity();
                return new a7g(requireActivity.getWindow(), requireActivity.getWindow().getDecorView());
            default:
                bc7[] bc7Arr3 = ProfileAvatarsScreen.z0;
                return profileAvatarsScreen.requireResources().getString(c2c.tt_of);
        }
    }
}
