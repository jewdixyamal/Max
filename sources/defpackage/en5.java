package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: en5  reason: default package */
public final class en5 implements Drawable.Callback {
    public final dd4 a;
    public final kl4 b;
    public final /* synthetic */ fn5 c;

    public en5(fn5 fn5) {
        this.c = fn5;
        this.a = new dd4(22, fn5);
        this.b = new kl4((Object) fn5, 29, (Object) this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        fn5 fn5 = this.c;
        RecyclerView recyclerView = fn5.t0;
        kl4 kl4 = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(kl4);
        }
        RecyclerView recyclerView2 = fn5.t0;
        if (recyclerView2 != null) {
            recyclerView2.post(kl4);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        fn5 fn5 = this.c;
        RecyclerView recyclerView = fn5.t0;
        kl4 kl4 = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(kl4);
        }
        RecyclerView recyclerView2 = fn5.t0;
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(kl4, j - System.currentTimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        RecyclerView recyclerView = this.c.t0;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.b);
        }
    }
}
