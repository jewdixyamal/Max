package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: p9b  reason: default package */
public final class p9b extends gz4 {
    final /* synthetic */ q9b this$0;

    public p9b(q9b q9b) {
        this.this$0 = q9b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
        q9b q9b = this.this$0;
        int i = q9b.b - 1;
        q9b.b = i;
        if (i == 0) {
            q9b.X.postDelayed(q9b.Z, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        n9b.a(activity, new o9b(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        q9b q9b = this.this$0;
        int i = q9b.a - 1;
        q9b.a = i;
        if (i == 0 && q9b.c) {
            q9b.Y.d(eg7.ON_STOP);
            q9b.o = true;
        }
    }
}
