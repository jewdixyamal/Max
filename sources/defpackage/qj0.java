package defpackage;

import android.os.SystemClock;

/* renamed from: qj0  reason: default package */
public final class qj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj0 b;

    public /* synthetic */ qj0(sj0 sj0, int i) {
        this.a = i;
        this.b = sj0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                sj0 sj0 = this.b;
                if (sj0.o > 0) {
                    SystemClock.uptimeMillis();
                }
                sj0.setVisibility(0);
                return;
            default:
                sj0 sj02 = this.b;
                ((jq4) sj02.getCurrentDrawable()).d(false, false, true);
                if ((sj02.getProgressDrawable() == null || !sj02.getProgressDrawable().isVisible()) && (sj02.getIndeterminateDrawable() == null || !sj02.getIndeterminateDrawable().isVisible())) {
                    sj02.setVisibility(4);
                }
                sj02.getClass();
                return;
        }
    }
}
