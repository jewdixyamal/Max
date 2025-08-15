package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: og4  reason: default package */
public final class og4 extends zu3 {
    public final Handler X = new Handler(Looper.getMainLooper());
    public yg3 Y;
    public final long o = 1000;

    public final void a() {
        yg3 yg3 = this.Y;
        if (yg3 != null) {
            this.X.removeCallbacks(yg3);
        }
        yg3 yg32 = this.Y;
        if (yg32 != null) {
            yg32.run();
        }
        this.Y = null;
    }

    public final void f(zu3 zu3, uu3 uu3) {
        yg3 yg3 = this.Y;
        if (yg3 != null) {
            this.X.removeCallbacks(yg3);
        }
        this.Y = null;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3) {
        yg3 yg3 = this.Y;
        Handler handler = this.X;
        if (yg3 != null) {
            handler.removeCallbacks(yg3);
        }
        yg3 yg32 = new yg3(view, z, this, viewGroup, view2, xu3);
        handler.postDelayed(yg32, this.o);
        this.Y = yg32;
    }
}
