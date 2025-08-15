package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ux1  reason: default package */
public final class ux1 {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final l0f d;
    public final HashMap e;
    public int f;

    public ux1(l0f l0f) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = l0f;
            this.f = this.c;
        }
    }

    public static void c(fv1 fv1, zw1 zw1) {
        if (hye.a()) {
            Trace.setCounter(c37.F("CX:State[" + fv1 + "]"), (long) zw1.ordinal());
        }
    }

    public final sx1 a(String str) {
        HashMap hashMap = this.e;
        for (fv1 fv1 : hashMap.keySet()) {
            if (str.equals(fv1.a().d())) {
                return (sx1) hashMap.get(fv1);
            }
        }
        return null;
    }

    public final void b() {
        boolean u = mqd.u(3, "CameraStateRegistry");
        StringBuilder sb = this.a;
        if (u) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (mqd.u(3, "CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((fv1) entry.getKey()).toString(), ((sx1) entry.getValue()).a != null ? ((sx1) entry.getValue()).a.toString() : "UNKNOWN"}));
            }
            zw1 zw1 = ((sx1) entry.getValue()).a;
            if (zw1 != null && zw1.a) {
                i++;
            }
        }
        if (mqd.u(3, "CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(wg0.h("Open count: ", i, " (Max allowed: ", this.c, ")"));
        }
        this.f = Math.max(this.c - i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089 A[Catch:{ all -> 0x004b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(defpackage.fv1 r13) {
        /*
            r12 = this;
            java.lang.String r0 = " --> "
            java.lang.Object r1 = r12.b
            monitor-enter(r1)
            java.util.HashMap r2 = r12.e     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x004b }
            sx1 r2 = (defpackage.sx1) r2     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "Camera must first be registered with registerCamera()"
            defpackage.c54.o(r2, r3)     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "CameraStateRegistry"
            r4 = 3
            boolean r3 = defpackage.mqd.u(r4, r3)     // Catch:{ all -> 0x004b }
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004d
            java.lang.StringBuilder r3 = r12.a     // Catch:{ all -> 0x004b }
            r3.setLength(r6)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r3 = r12.a     // Catch:{ all -> 0x004b }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x004b }
            java.lang.String r8 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            int r9 = r12.f     // Catch:{ all -> 0x004b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x004b }
            zw1 r10 = r2.a     // Catch:{ all -> 0x004b }
            if (r10 == 0) goto L_0x0038
            boolean r10 = r10.a     // Catch:{ all -> 0x004b }
            if (r10 == 0) goto L_0x0038
            r10 = r5
            goto L_0x0039
        L_0x0038:
            r10 = r6
        L_0x0039:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x004b }
            zw1 r11 = r2.a     // Catch:{ all -> 0x004b }
            java.lang.Object[] r9 = new java.lang.Object[]{r13, r9, r10, r11}     // Catch:{ all -> 0x004b }
            java.lang.String r7 = java.lang.String.format(r7, r8, r9)     // Catch:{ all -> 0x004b }
            r3.append(r7)     // Catch:{ all -> 0x004b }
            goto L_0x004d
        L_0x004b:
            r12 = move-exception
            goto L_0x008e
        L_0x004d:
            int r3 = r12.f     // Catch:{ all -> 0x004b }
            if (r3 > 0) goto L_0x0061
            zw1 r3 = r2.a     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x005b
            boolean r3 = r3.a     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x005b
            r3 = r5
            goto L_0x005c
        L_0x005b:
            r3 = r6
        L_0x005c:
            if (r3 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = r6
            goto L_0x0068
        L_0x0061:
            zw1 r3 = defpackage.zw1.OPENING     // Catch:{ all -> 0x004b }
            r2.a = r3     // Catch:{ all -> 0x004b }
            c(r13, r3)     // Catch:{ all -> 0x004b }
        L_0x0068:
            java.lang.String r13 = "CameraStateRegistry"
            boolean r13 = defpackage.mqd.u(r4, r13)     // Catch:{ all -> 0x004b }
            if (r13 == 0) goto L_0x0087
            java.lang.StringBuilder r13 = r12.a     // Catch:{ all -> 0x004b }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x0079
            java.lang.String r2 = "SUCCESS"
            goto L_0x007b
        L_0x0079:
            java.lang.String r2 = "FAIL"
        L_0x007b:
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x004b }
            r13.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r13 = r12.a     // Catch:{ all -> 0x004b }
            r13.getClass()     // Catch:{ all -> 0x004b }
        L_0x0087:
            if (r5 == 0) goto L_0x008c
            r12.b()     // Catch:{ all -> 0x004b }
        L_0x008c:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            return r5
        L_0x008e:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.d(fv1):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[Catch:{ all -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[ADDED_TO_REGION, Catch:{ all -> 0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            l0f r1 = r4.d     // Catch:{ all -> 0x000d }
            int r1 = r1.b     // Catch:{ all -> 0x000d }
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x000d:
            r4 = move-exception
            goto L_0x0055
        L_0x000f:
            sx1 r5 = r4.a(r5)     // Catch:{ all -> 0x000d }
            r1 = 0
            if (r5 == 0) goto L_0x0019
            zw1 r5 = r5.a     // Catch:{ all -> 0x000d }
            goto L_0x001a
        L_0x0019:
            r5 = r1
        L_0x001a:
            if (r6 == 0) goto L_0x0021
            sx1 r4 = r4.a(r6)     // Catch:{ all -> 0x000d }
            goto L_0x0022
        L_0x0021:
            r4 = r1
        L_0x0022:
            if (r4 == 0) goto L_0x0026
            zw1 r1 = r4.a     // Catch:{ all -> 0x000d }
        L_0x0026:
            zw1 r4 = defpackage.zw1.OPEN     // Catch:{ all -> 0x000d }
            boolean r6 = r4.equals(r5)     // Catch:{ all -> 0x000d }
            r2 = 0
            if (r6 != 0) goto L_0x003a
            zw1 r6 = defpackage.zw1.CONFIGURED     // Catch:{ all -> 0x000d }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x000d }
            if (r5 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r5 = r2
            goto L_0x003b
        L_0x003a:
            r5 = r3
        L_0x003b:
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x000d }
            if (r4 != 0) goto L_0x004c
            zw1 r4 = defpackage.zw1.CONFIGURED     // Catch:{ all -> 0x000d }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x000d }
            if (r4 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = r2
            goto L_0x004d
        L_0x004c:
            r4 = r3
        L_0x004d:
            if (r5 == 0) goto L_0x0052
            if (r4 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = r2
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.e(java.lang.String, java.lang.String):boolean");
    }
}
