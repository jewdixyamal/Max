package defpackage;

import android.animation.Animator;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* renamed from: qbb  reason: default package */
public final class qbb implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileAvatarsScreen b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qbb(ProfileAvatarsScreen profileAvatarsScreen, boolean z, int i) {
        this.a = i;
        this.b = profileAvatarsScreen;
        this.c = z;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        int i = 8;
        boolean z = this.c;
        ProfileAvatarsScreen profileAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                if (profileAvatarsScreen.getView() != null) {
                    View v0 = ProfileAvatarsScreen.v0(profileAvatarsScreen);
                    if (z) {
                        i = 0;
                    }
                    v0.setVisibility(i);
                    return;
                }
                return;
            default:
                if (profileAvatarsScreen.getView() != null) {
                    bc7[] bc7Arr = ProfileAvatarsScreen.z0;
                    cla A0 = profileAvatarsScreen.A0();
                    if (z) {
                        i = 0;
                    }
                    A0.setVisibility(i);
                    if (!z) {
                        profileAvatarsScreen.y0(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        ProfileAvatarsScreen profileAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                if (profileAvatarsScreen.getView() != null) {
                    ProfileAvatarsScreen.v0(profileAvatarsScreen).setVisibility(0);
                    return;
                }
                return;
            default:
                if (profileAvatarsScreen.getView() != null) {
                    bc7[] bc7Arr = ProfileAvatarsScreen.z0;
                    profileAvatarsScreen.A0().setVisibility(0);
                    if (this.c) {
                        profileAvatarsScreen.y0(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
