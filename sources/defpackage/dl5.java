package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dl5  reason: default package */
public final class dl5 implements re0 {
    public static final AtomicReference a = new AtomicReference();

    public final void a(boolean z) {
        synchronized (fl5.j) {
            try {
                Iterator it = new ArrayList(fl5.k.values()).iterator();
                while (it.hasNext()) {
                    fl5 fl5 = (fl5) it.next();
                    if (fl5.e.get()) {
                        Iterator it2 = fl5.i.iterator();
                        while (it2.hasNext()) {
                            fl5 fl52 = ((cl5) it2.next()).a;
                            if (!z) {
                                ((bb4) fl52.h.get()).b();
                            } else {
                                fl52.getClass();
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
