package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx  reason: default package */
public final class rx extends vg3 {
    public static final qx[] X = new qx[0];
    public static final qx[] o = new qx[0];
    public final AtomicReference a = new AtomicReference(o);
    public Throwable b;
    public Object c;

    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = X;
        if (obj != obj2) {
            Object obj3 = this.c;
            qx[] qxVarArr = (qx[]) atomicReference.getAndSet(obj2);
            int i = 0;
            if (obj3 == null) {
                int length = qxVarArr.length;
                while (i < length) {
                    qx qxVar = qxVarArr[i];
                    if (!qxVar.h()) {
                        qxVar.a.b();
                    }
                    i++;
                }
                return;
            }
            int length2 = qxVarArr.length;
            while (i < length2) {
                qxVarArr[i].f(obj3);
                i++;
            }
        }
    }

    public final void c(zl4 zl4) {
        if (this.a.get() == X) {
            zl4.g();
        }
    }

    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        if (this.a.get() != X) {
            this.c = obj;
        }
    }

    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = X;
        if (obj == obj2) {
            j47.Z(th);
            return;
        }
        this.c = null;
        this.b = th;
        for (qx qxVar : (qx[]) atomicReference.getAndSet(obj2)) {
            if (qxVar.h()) {
                j47.Z(th);
            } else {
                qxVar.a.onError(th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: qx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.f2a r7) {
        /*
            r6 = this;
            qx r0 = new qx
            r0.<init>(r7, r6)
            r7.c(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            java.lang.Object r2 = r1.get()
            qx[] r2 = (defpackage.qx[]) r2
            qx[] r3 = X
            if (r2 != r3) goto L_0x0030
            java.lang.Throwable r1 = r6.b
            if (r1 == 0) goto L_0x001c
            r7.onError(r1)
            goto L_0x004a
        L_0x001c:
            java.lang.Object r6 = r6.c
            if (r6 == 0) goto L_0x0024
            r0.f(r6)
            goto L_0x004a
        L_0x0024:
            boolean r6 = r0.h()
            if (r6 != 0) goto L_0x004a
            f2a r6 = r0.a
            r6.b()
            goto L_0x004a
        L_0x0030:
            int r3 = r2.length
            int r4 = r3 + 1
            qx[] r4 = new defpackage.qx[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x003b:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x004b
            boolean r7 = r0.h()
            if (r7 == 0) goto L_0x004a
            r6.z(r0)
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x003b
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.q(f2a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: qx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: qx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(defpackage.qx r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r1 = r0.get()
            qx[] r1 = (defpackage.qx[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x0018
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0018:
            r4 = -1
        L_0x0019:
            if (r4 >= 0) goto L_0x001c
            return
        L_0x001c:
            r5 = 1
            if (r2 != r5) goto L_0x0022
            qx[] r2 = o
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            qx[] r6 = new defpackage.qx[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0031:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0031
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.z(qx):void");
    }
}
