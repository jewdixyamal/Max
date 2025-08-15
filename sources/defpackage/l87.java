package defpackage;

import android.os.SystemClock;

/* renamed from: l87  reason: default package */
public final class l87 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n87 b;

    public /* synthetic */ l87(n87 n87, int i) {
        this.a = i;
        this.b = n87;
    }

    public final void run() {
        g05 g05;
        int i;
        switch (this.a) {
            case 0:
                n87 n87 = this.b;
                n87.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (n87) {
                    g05 = n87.e;
                    i = n87.f;
                    n87.e = null;
                    n87.f = 0;
                    n87.g = 3;
                    n87.i = uptimeMillis;
                }
                try {
                    if (n87.d(g05, i)) {
                        n87.b.e(g05, i);
                    }
                    return;
                } finally {
                    g05.d(g05);
                    n87.b();
                }
            default:
                n87 n872 = this.b;
                n872.a.execute(n872.c);
                return;
        }
    }
}
