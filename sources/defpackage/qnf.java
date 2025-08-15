package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: qnf  reason: default package */
public abstract class qnf {
    public final mu3 a = new mu3();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        mu3 mu3 = this.a;
        if (mu3 == null) {
            return;
        }
        if (mu3.a) {
            mu3.b(autoCloseable);
            return;
        }
        synchronized (((qx7) mu3.b)) {
            autoCloseable2 = (AutoCloseable) ((LinkedHashMap) mu3.c).put(str, autoCloseable);
        }
        mu3.b(autoCloseable2);
    }

    public final void b() {
        mu3 mu3 = this.a;
        if (mu3 != null && !mu3.a) {
            mu3.a = true;
            synchronized (((qx7) mu3.b)) {
                try {
                    for (AutoCloseable b : ((LinkedHashMap) mu3.c).values()) {
                        mu3.b(b);
                    }
                    for (AutoCloseable b2 : (LinkedHashSet) mu3.d) {
                        mu3.b(b2);
                    }
                    ((LinkedHashSet) mu3.d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        mu3 mu3 = this.a;
        if (mu3 == null) {
            return null;
        }
        synchronized (((qx7) mu3.b)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) mu3.c).get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
