package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: y08  reason: default package */
public final class y08 implements OnBackAnimationCallback {
    public final /* synthetic */ w08 a;
    public final /* synthetic */ z08 b;

    public y08(z08 z08, w08 w08) {
        this.b = z08;
        this.a = w08;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new ge0(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new ge0(backEvent));
        }
    }
}
