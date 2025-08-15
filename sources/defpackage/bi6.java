package defpackage;

import android.os.Handler;

/* renamed from: bi6  reason: default package */
public final class bi6 implements Runnable, zl4 {
    public final /* synthetic */ int a = 0;
    public final Runnable b;
    public volatile boolean c;
    public final Object o;

    public bi6(Handler handler, Runnable runnable) {
        this.o = handler;
        this.b = runnable;
    }

    public final void g() {
        switch (this.a) {
            case 0:
                ((Handler) this.o).removeCallbacks(this);
                this.c = true;
                return;
            default:
                this.c = true;
                ((xtc) this.o).g();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    j47.Z(th);
                    return;
                }
            default:
                if (!this.c) {
                    try {
                        this.b.run();
                        return;
                    } catch (Throwable th2) {
                        g();
                        j47.Z(th2);
                        throw th2;
                    }
                } else {
                    return;
                }
        }
    }

    public bi6(Runnable runnable, xtc xtc) {
        this.b = runnable;
        this.o = xtc;
    }
}
