package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: wo4  reason: default package */
public final class wo4 implements qo4 {
    public final Context a;
    public final so4 b;
    public final boolean c;
    public final Class d;
    public xo4 e;

    public wo4(Context context, so4 so4, boolean z, Class cls) {
        this.a = context;
        this.b = so4;
        this.c = z;
        this.d = cls;
        so4.e.add(this);
    }

    public final void a(so4 so4) {
        xo4 xo4 = this.e;
        if (xo4 != null) {
            xo4.a(xo4, so4.l);
        }
    }

    public final void b() {
        boolean z = this.b.k;
    }

    public final void c() {
        xo4 xo4 = this.e;
        if (xo4 != null) {
            xo4.c();
        }
    }

    public final void d(so4 so4, boolean z) {
        if (!z && !so4.i) {
            xo4 xo4 = this.e;
            if (xo4 == null || xo4.s0) {
                List list = so4.l;
                for (int i = 0; i < list.size(); i++) {
                    if (((dn4) list.get(i)).b == 0) {
                        g();
                        return;
                    }
                }
            }
        }
    }

    public final void e(dn4 dn4, Exception exc) {
        xo4 xo4 = this.e;
        if (xo4 != null) {
            xo4.getClass();
        }
        xo4 xo42 = this.e;
        if ((xo42 == null || xo42.s0) && xo4.b(dn4.b)) {
            z04.c0("DownloadService wasn't running. Restarting.");
            g();
        }
    }

    public final void f(so4 so4, dn4 dn4) {
        xo4 xo4 = this.e;
        if (xo4 != null) {
            xo4.getClass();
        }
    }

    public final void g() {
        boolean z = this.c;
        Class cls = this.d;
        Context context = this.a;
        if (z) {
            try {
                Intent action = new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                if (oaf.a >= 26) {
                    context.startForegroundService(action);
                } else {
                    context.startService(action);
                }
            } catch (IllegalStateException unused) {
                z04.c0("Failed to restart (foreground launch restriction)");
            }
        } else {
            try {
                context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused2) {
                z04.c0("Failed to restart (process is idle)");
            }
        }
    }
}
