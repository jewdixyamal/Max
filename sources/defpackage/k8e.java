package defpackage;

import java.util.Set;

/* renamed from: k8e  reason: default package */
public final class k8e implements Runnable {
    public static final String o = a14.O("StopWorkRunnable");
    public final s7g a;
    public final yzd b;
    public final boolean c;

    public k8e(s7g s7g, yzd yzd, boolean z) {
        this.a = s7g;
        this.b = yzd;
        this.c = z;
    }

    public final void run() {
        boolean z;
        v8g v8g;
        if (this.c) {
            y9b y9b = this.a.f;
            yzd yzd = this.b;
            y9b.getClass();
            String str = yzd.a.a;
            synchronized (y9b.w0) {
                try {
                    a14.u().n(y9b.x0, "Processor stopping foreground work " + str);
                    v8g = (v8g) y9b.Y.remove(str);
                    if (v8g != null) {
                        y9b.s0.remove(str);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = y9b.c(str, v8g);
        } else {
            y9b y9b2 = this.a.f;
            yzd yzd2 = this.b;
            y9b2.getClass();
            String str2 = yzd2.a.a;
            synchronized (y9b2.w0) {
                try {
                    v8g v8g2 = (v8g) y9b2.Z.remove(str2);
                    if (v8g2 == null) {
                        a14.u().n(y9b.x0, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) y9b2.s0.get(str2);
                        if (set != null) {
                            if (set.contains(yzd2)) {
                                a14.u().n(y9b.x0, "Processor stopping background work " + str2);
                                y9b2.s0.remove(str2);
                                z = y9b.c(str2, v8g2);
                            }
                        }
                    }
                    z = false;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
        a14.u().n(o, "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + z);
    }
}
