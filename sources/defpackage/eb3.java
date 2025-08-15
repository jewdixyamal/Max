package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eb3  reason: default package */
public final class eb3 extends AtomicReference implements zl4 {
    public final ab3 a;

    public eb3(ab3 ab3, fb3 fb3) {
        this.a = ab3;
        lazySet(fb3);
    }

    public final void g() {
        fb3 fb3 = (fb3) getAndSet((Object) null);
        if (fb3 != null) {
            fb3.m(this);
        }
    }

    public final boolean h() {
        return get() == null;
    }
}
