package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ni3  reason: default package */
public final class ni3 implements c6d {
    public final AtomicReference a;

    public ni3(c6d c6d) {
        this.a = new AtomicReference(c6d);
    }

    public final Iterator iterator() {
        c6d c6d = (c6d) this.a.getAndSet((Object) null);
        if (c6d != null) {
            return c6d.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
