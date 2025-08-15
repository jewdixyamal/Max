package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v0f  reason: default package */
public final class v0f implements jx3 {
    public static final sp3 c = new Object();
    public final iu3 a;
    public final AtomicInteger b = new AtomicInteger(0);

    public v0f(iu3 iu3) {
        this.a = iu3;
    }

    public final Object fold(Object obj, a66 a66) {
        return a66.invoke(obj, this);
    }

    public final jx3 get(kx3 kx3) {
        return tpa.r(this, kx3);
    }

    public final kx3 getKey() {
        return c;
    }

    public final lx3 minusKey(kx3 kx3) {
        return tpa.y(this, kx3);
    }

    public final lx3 plus(lx3 lx3) {
        return ema.z(this, lx3);
    }
}
