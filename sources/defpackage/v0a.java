package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v0a  reason: default package */
public final class v0a extends vg3 {
    public final r1a a;
    public final AtomicReference b = new AtomicReference();

    public v0a(xy9 xy9) {
        this.a = xy9;
    }

    public final void q(f2a f2a) {
        u0a u0a;
        t0a[] t0aArr;
        t0a[] t0aArr2;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            u0a = (u0a) atomicReference.get();
            if (u0a != null) {
                break;
            }
            u0a u0a2 = new u0a(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(u0a, u0a2)) {
                    u0a = u0a2;
                    break loop0;
                } else if (atomicReference.get() != u0a) {
                }
            }
        }
        t0a t0a = new t0a(f2a, u0a);
        f2a.c(t0a);
        do {
            t0aArr = (t0a[]) u0a.get();
            if (t0aArr == u0a.Y) {
                Throwable th = u0a.o;
                if (th != null) {
                    f2a.onError(th);
                    return;
                } else {
                    f2a.b();
                    return;
                }
            } else {
                int length = t0aArr.length;
                t0aArr2 = new t0a[(length + 1)];
                System.arraycopy(t0aArr, 0, t0aArr2, 0, length);
                t0aArr2[length] = t0a;
            }
        } while (!u0a.compareAndSet(t0aArr, t0aArr2));
        if (t0a.h()) {
            u0a.a(t0a);
        }
    }

    public final void x(w0a w0a) {
        u0a u0a;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            u0a = (u0a) atomicReference.get();
            if (u0a != null && !u0a.h()) {
                break;
            }
            u0a u0a2 = new u0a(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(u0a, u0a2)) {
                    u0a = u0a2;
                    break loop0;
                } else if (atomicReference.get() != u0a) {
                }
            }
        }
        AtomicBoolean atomicBoolean = u0a.a;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            w0a.accept(u0a);
            if (z) {
                this.a.a(u0a);
            }
        } catch (Throwable th) {
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
            u0a r0 = (defpackage.u0a) r0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0a.y():void");
    }
}
