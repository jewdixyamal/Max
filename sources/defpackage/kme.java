package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kme  reason: default package */
public class kme {
    public static final jme b = new kme();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public void a(Runnable runnable) {
        if (this.a.compareAndSet(false, true)) {
            runnable.run();
        }
    }
}
