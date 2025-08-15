package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h1a  reason: default package */
public final class h1a extends vg3 {
    public final r1a a;
    public final AtomicReference b;
    public final z0a c;
    public final r1a o;

    public h1a(e1a e1a, r1a r1a, AtomicReference atomicReference, z0a z0a) {
        this.o = e1a;
        this.a = r1a;
        this.b = atomicReference;
        this.c = z0a;
    }

    public final void q(f2a f2a) {
        this.o.a(f2a);
    }

    public final void x(w0a w0a) {
        d1a d1a;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            d1a = (d1a) atomicReference.get();
            if (d1a != null && !d1a.h()) {
                break;
            }
            d1a d1a2 = new d1a(this.c.call(), atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(d1a, d1a2)) {
                    d1a = d1a2;
                    break loop0;
                } else if (atomicReference.get() != d1a) {
                }
            }
        }
        AtomicBoolean atomicBoolean = d1a.o;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            w0a.accept(d1a);
            if (z) {
                this.a.a(d1a);
            }
        } catch (Throwable th) {
            c37.B(th);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            c37.B(th);
            throw q45.f(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[LOOP:0: B:4:0x0010->B:7:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.b
            java.lang.Object r0 = r2.get()
            d1a r0 = (defpackage.d1a) r0
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.h()
            if (r1 == 0) goto L_0x001e
        L_0x0010:
            r1 = 0
            boolean r1 = r2.compareAndSet(r0, r1)
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L_0x0010
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1a.y():void");
    }
}
