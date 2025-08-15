package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: e3a  reason: default package */
public final class e3a implements OnBackAnimationCallback {
    public final /* synthetic */ m56 a;
    public final /* synthetic */ m56 b;
    public final /* synthetic */ k56 c;
    public final /* synthetic */ k56 d;

    public e3a(m56 m56, m56 m562, k56 k56, k56 k562) {
        this.a = m56;
        this.b = m562;
        this.c = k56;
        this.d = k562;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new ge0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new ge0(backEvent));
    }
}
