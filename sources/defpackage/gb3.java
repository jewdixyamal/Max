package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gb3  reason: default package */
public final class gb3 extends pa3 {
    public final pa3 X;
    public final pa3 a;
    public final long b = 3;
    public final TimeUnit c;
    public final ztc o;

    public gb3(sa3 sa3, TimeUnit timeUnit, ztc ztc) {
        this.a = sa3;
        this.c = timeUnit;
        this.o = ztc;
        this.X = null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [zl4, hc3, java.lang.Object] */
    public final void j(ab3 ab3) {
        ? obj = new Object();
        ab3.c(obj);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        obj.a(this.o.c(new r8g((Object) this, (Object) atomicBoolean, (Object) obj, (Object) ab3, 2), this.b, this.c));
        this.a.i(new pl8(obj, atomicBoolean, ab3, 3));
    }
}
