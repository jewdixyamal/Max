package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: hc3  reason: default package */
public final class hc3 implements zl4, am4 {
    public sv0 a;
    public volatile boolean b;

    public static void e(sv0 sv0) {
        if (sv0 != null) {
            ArrayList arrayList = null;
            for (Object obj : (Object[]) sv0.e) {
                if (obj instanceof zl4) {
                    try {
                        ((zl4) obj).g();
                    } catch (Throwable th) {
                        c37.B(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw q45.f((Throwable) arrayList.get(0));
            }
            throw new CompositeException((List) arrayList);
        }
    }

    public final boolean a(zl4 zl4) {
        Objects.requireNonNull(zl4, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        sv0 sv0 = this.a;
                        if (sv0 == null) {
                            sv0 = new sv0();
                            this.a = sv0;
                        }
                        sv0.a(zl4);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zl4.g();
        return false;
    }

    public final boolean b(zl4 zl4) {
        if (!c(zl4)) {
            return false;
        }
        zl4.g();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.zl4 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposable is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0012:
            r8 = move-exception
            goto L_0x004e
        L_0x0014:
            sv0 r0 = r7.a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004c
            java.io.Serializable r2 = r0.e     // Catch:{ all -> 0x0012 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0012 }
            int r3 = r0.b     // Catch:{ all -> 0x0012 }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x0012 }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0012 }
            if (r5 != 0) goto L_0x002f
            goto L_0x004c
        L_0x002f:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0012 }
            r6 = 1
            if (r5 == 0) goto L_0x003a
            r0.d(r4, r3, r2)     // Catch:{ all -> 0x0012 }
            goto L_0x004a
        L_0x003a:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0012 }
            if (r5 != 0) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0012 }
            if (r5 == 0) goto L_0x003a
            r0.d(r4, r3, r2)     // Catch:{ all -> 0x0012 }
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r6
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x004e:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc3.c(zl4):boolean");
    }

    public final void d() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        sv0 sv0 = this.a;
                        this.a = null;
                        e(sv0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void g() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        this.b = true;
                        sv0 sv0 = this.a;
                        this.a = null;
                        e(sv0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean h() {
        return this.b;
    }
}
