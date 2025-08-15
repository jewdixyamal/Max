package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xpb  reason: default package */
public final class xpb extends vg3 {
    public static final wpb[] c = new wpb[0];
    public static final wpb[] o = new wpb[0];
    public final AtomicReference a = new AtomicReference(o);
    public Throwable b;

    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj != obj2) {
            for (wpb wpb : (wpb[]) atomicReference.getAndSet(obj2)) {
                if (!wpb.get()) {
                    wpb.a.b();
                }
            }
        }
    }

    public final void c(zl4 zl4) {
        if (this.a.get() == c) {
            zl4.g();
        }
    }

    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        for (wpb wpb : (wpb[]) this.a.get()) {
            if (!wpb.get()) {
                wpb.a.e(obj);
            }
        }
    }

    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            j47.Z(th);
            return;
        }
        this.b = th;
        for (wpb wpb : (wpb[]) atomicReference.getAndSet(obj2)) {
            if (wpb.get()) {
                j47.Z(th);
            } else {
                wpb.a.onError(th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: wpb[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.f2a r7) {
        /*
            r6 = this;
            wpb r0 = new wpb
            r0.<init>(r7, r6)
            r7.c(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            java.lang.Object r2 = r1.get()
            wpb[] r2 = (defpackage.wpb[]) r2
            wpb[] r3 = c
            if (r2 != r3) goto L_0x0020
            java.lang.Throwable r6 = r6.b
            if (r6 == 0) goto L_0x001c
            r7.onError(r6)
            goto L_0x003a
        L_0x001c:
            r7.b()
            goto L_0x003a
        L_0x0020:
            int r3 = r2.length
            int r4 = r3 + 1
            wpb[] r4 = new defpackage.wpb[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x002b:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x003b
            boolean r7 = r0.get()
            if (r7 == 0) goto L_0x003a
            r6.z(r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x002b
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpb.q(f2a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: wpb[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: wpb} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(defpackage.wpb r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r1 = r0.get()
            wpb[] r1 = (defpackage.wpb[]) r1
            wpb[] r2 = c
            if (r1 == r2) goto L_0x0042
            wpb[] r2 = o
            if (r1 != r2) goto L_0x0011
            goto L_0x0042
        L_0x0011:
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x0014:
            if (r5 >= r3) goto L_0x001e
            r6 = r1[r5]
            if (r6 != r8) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x001e:
            r5 = -1
        L_0x001f:
            if (r5 >= 0) goto L_0x0022
            return
        L_0x0022:
            r6 = 1
            if (r3 != r6) goto L_0x0026
            goto L_0x0034
        L_0x0026:
            int r2 = r3 + -1
            wpb[] r2 = new defpackage.wpb[r2]
            java.lang.System.arraycopy(r1, r4, r2, r4, r5)
            int r4 = r5 + 1
            int r3 = r3 - r5
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r4, r2, r5, r3)
        L_0x0034:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003b
            return
        L_0x003b:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0034
            goto L_0x0000
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpb.z(wpb):void");
    }
}
