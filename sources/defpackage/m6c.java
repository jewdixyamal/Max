package defpackage;

import android.transition.Transition;
import android.view.View;

/* renamed from: m6c  reason: default package */
public final class m6c implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ au4 b;
    public final /* synthetic */ float c;

    public m6c(View view, au4 au4, float f) {
        this.a = view;
        this.b = au4;
        this.c = f;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        View view = this.a;
        au4 au4 = this.b;
        float f = this.c;
        kwd kwd = new kwd((Object) view, (ju0) au4, f);
        kwd.a = 0.0f;
        lwd lwd = new lwd(f);
        lwd.b(400.0f);
        lwd.a(0.68f);
        kwd.m = lwd;
        kwd.g();
    }
}
