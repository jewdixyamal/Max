package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: j7g  reason: default package */
public final class j7g implements Runnable {
    public static final String Z = a14.O("WorkForegroundRunnable");
    public final dy5 X;
    public final wne Y;
    public final dcd a = new Object();
    public final Context b;
    public final h8g c;
    public final gm7 o;

    /* JADX WARNING: type inference failed for: r0v0, types: [dcd, java.lang.Object] */
    public j7g(Context context, h8g h8g, gm7 gm7, k7g k7g, wne wne) {
        this.b = context;
        this.c = h8g;
        this.o = gm7;
        this.X = k7g;
        this.Y = wne;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [l1, java.lang.Object] */
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.j((Object) null);
            return;
        }
        ? obj = new Object();
        bkb bkb = (bkb) this.Y;
        ((k40) bkb.c).execute(new fre(this, 19, obj));
        obj.d(new i76((Object) this, (Object) obj, false, 26), (k40) bkb.c);
    }
}
