package defpackage;

import android.app.Activity;

/* renamed from: o9b  reason: default package */
public final class o9b extends gz4 {
    final /* synthetic */ q9b this$0;

    public o9b(q9b q9b) {
        this.this$0 = q9b;
    }

    public void onActivityPostResumed(Activity activity) {
        this.this$0.a();
    }

    public void onActivityPostStarted(Activity activity) {
        q9b q9b = this.this$0;
        int i = q9b.a + 1;
        q9b.a = i;
        if (i == 1 && q9b.o) {
            q9b.Y.d(eg7.ON_START);
            q9b.o = false;
        }
    }
}
