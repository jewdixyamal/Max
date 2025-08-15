package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jy8  reason: default package */
public final class jy8 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final khe e;

    public jy8(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je74;
        this.e = new khe(new z30(17, je73));
    }

    public final void a() {
        hm9.m(jy8.class.getName(), "try to restore uploads", new Object[0]);
        if (this.d.compareAndSet(false, true)) {
            ((ExecutorService) this.e.getValue()).execute(new nn6(15, this));
        }
    }
}
