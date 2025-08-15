package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.view.Window;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: vi2  reason: default package */
public final class vi2 implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    public vi2(float f, ChatMediaViewerScreen chatMediaViewerScreen, boolean z) {
        this.d = f;
        this.b = chatMediaViewerScreen;
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

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        Window window;
        yk8 yk8;
        switch (this.a) {
            case 0:
                if (this.d == 0.0f) {
                    bc7[] bc7Arr = ChatMediaViewerScreen.K0;
                    ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
                    chatMediaViewerScreen.C0().setVisibility(8);
                    chatMediaViewerScreen.A0().setVisibility(8);
                    if (this.c && (yk8 = chatMediaViewerScreen.A0) != null) {
                        yk8.c(false);
                    }
                    Activity activity = chatMediaViewerScreen.getActivity();
                    if (!(activity == null || (window = activity.getWindow()) == null)) {
                        qp4.u0.o(chatMediaViewerScreen.getContext()).c.b();
                        window.setNavigationBarColor(0);
                    }
                    chatMediaViewerScreen.x0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        Window window;
        yk8 yk8;
        int i = 0;
        boolean z = this.c;
        Object obj = this.b;
        float f = this.d;
        switch (this.a) {
            case 0:
                return;
            case 1:
                bc7[] bc7Arr = ChatMediaViewerScreen.K0;
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) obj;
                if (chatMediaViewerScreen.C0().getVisibility() != 0) {
                    chatMediaViewerScreen.C0().setVisibility(0);
                }
                if (chatMediaViewerScreen.A0().getVisibility() != 0) {
                    chatMediaViewerScreen.A0().setVisibility(0);
                }
                if (z && (yk8 = chatMediaViewerScreen.A0) != null) {
                    yk8.c(true);
                }
                if (f == 1.0f) {
                    Activity activity = chatMediaViewerScreen.getActivity();
                    if (!(activity == null || (window = activity.getWindow()) == null)) {
                        window.setNavigationBarColor(qp4.u0.o(chatMediaViewerScreen.getContext()).c.b().j);
                    }
                    chatMediaViewerScreen.x0(true);
                    return;
                }
                return;
            default:
                ela ela = (ela) obj;
                ela.setAlpha(f);
                if (!z) {
                    i = 8;
                }
                ela.setVisibility(i);
                return;
        }
    }

    public vi2(ela ela, float f, boolean z) {
        this.b = ela;
        this.d = f;
        this.c = z;
    }

    public vi2(ChatMediaViewerScreen chatMediaViewerScreen, boolean z, float f) {
        this.b = chatMediaViewerScreen;
        this.c = z;
        this.d = f;
    }
}
