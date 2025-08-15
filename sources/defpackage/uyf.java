package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: uyf  reason: default package */
public final class uyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;
    public final /* synthetic */ fxc Z;
    public final /* synthetic */ FrameLayout s0;
    public final /* synthetic */ LinearLayout t0;
    public final /* synthetic */ nfa u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uyf(WebAppRootScreen webAppRootScreen, fxc fxc, FrameLayout frameLayout, LinearLayout linearLayout, nfa nfa, Continuation continuation) {
        super(2, continuation);
        this.Y = webAppRootScreen;
        this.Z = fxc;
        this.s0 = frameLayout;
        this.t0 = linearLayout;
        this.u0 = nfa;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uyf) n((e0g) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uyf uyf = new uyf(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
        uyf.X = obj;
        return uyf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e0g e0g = (e0g) this.X;
        bc7[] bc7Arr = WebAppRootScreen.G0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.y0().setTitle((CharSequence) e0g.a);
        WebAppRootScreen.D0(webAppRootScreen.y0(), e0g.b);
        b0g b0g = b0g.a;
        a0g a0g = e0g.c;
        boolean f = tpa.f(a0g, b0g);
        fxc fxc = this.Z;
        FrameLayout frameLayout = this.s0;
        if (f) {
            fxc.setVisibility(8);
            int childCount = frameLayout.getChildCount();
            LinearLayout linearLayout = this.t0;
            if (childCount <= 1 || frameLayout.getChildAt(1) != linearLayout) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(linearLayout, 1);
            }
            webAppRootScreen.E0(false);
        } else if (tpa.f(a0g, c0g.a)) {
            fxc.setVisibility(8);
            int childCount2 = frameLayout.getChildCount();
            nfa nfa = this.u0;
            if (childCount2 <= 1 || frameLayout.getChildAt(1) != nfa) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(nfa, 1);
            }
            webAppRootScreen.E0(false);
        } else if (a0g instanceof d0g) {
            fxc.setVisibility(0);
            if (frameLayout.getChildCount() > 1) {
                frameLayout.removeViewAt(1);
            }
            webAppRootScreen.E0(((d0g) a0g).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
