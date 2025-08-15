package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d1a  reason: default package */
public final class d1a extends AtomicReference implements f2a, zl4 {
    public static final a1a[] Y = new a1a[0];
    public static final a1a[] Z = new a1a[0];
    public final AtomicReference X;
    public final c1a a;
    public boolean b;
    public final AtomicReference c = new AtomicReference(Y);
    public final AtomicBoolean o = new AtomicBoolean();

    public d1a(c1a c1a, AtomicReference atomicReference) {
        this.a = c1a;
        this.X = atomicReference;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: a1a[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: a1a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.a1a r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.c
            java.lang.Object r1 = r0.get()
            a1a[] r1 = (defpackage.a1a[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x001c
            r5 = r1[r4]
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x001c:
            r4 = -1
        L_0x001d:
            if (r4 >= 0) goto L_0x0020
            return
        L_0x0020:
            r5 = 1
            if (r2 != r5) goto L_0x0026
            a1a[] r2 = Y
            goto L_0x0035
        L_0x0026:
            int r6 = r2 + -1
            a1a[] r6 = new defpackage.a1a[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0035:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003c
            return
        L_0x003c:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0035
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1a.a(a1a):void");
    }

    public final void b() {
        if (!this.b) {
            this.b = true;
            c1a c1a = this.a;
            c1a.a();
            for (a1a c2 : (a1a[]) this.c.getAndSet(Z)) {
                c1a.c(c2);
            }
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.e(this, zl4)) {
            for (a1a c2 : (a1a[]) this.c.get()) {
                this.a.c(c2);
            }
        }
    }

    public final void e(Object obj) {
        if (!this.b) {
            c1a c1a = this.a;
            c1a.b(obj);
            for (a1a c2 : (a1a[]) this.c.get()) {
                c1a.c(c2);
            }
        }
    }

    public final void g() {
        AtomicReference atomicReference;
        this.c.set(Z);
        do {
            atomicReference = this.X;
            if (atomicReference.compareAndSet(this, (Object) null) || atomicReference.get() != this) {
                dm4.a(this);
            }
            atomicReference = this.X;
            break;
        } while (atomicReference.get() != this);
        dm4.a(this);
    }

    public final boolean h() {
        return this.c.get() == Z;
    }

    public final void onError(Throwable th) {
        if (!this.b) {
            this.b = true;
            c1a c1a = this.a;
            c1a.d(th);
            for (a1a c2 : (a1a[]) this.c.getAndSet(Z)) {
                c1a.c(c2);
            }
            return;
        }
        j47.Z(th);
    }
}
