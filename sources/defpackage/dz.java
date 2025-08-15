package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dz  reason: default package */
public final class dz {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final pk b;
    public final p82 c;
    public final m7b d;
    public final cn7 e;

    public dz(pk pkVar, p82 p82, m7b m7b, cn7 cn7) {
        this.b = pkVar;
        this.c = p82;
        this.d = m7b;
        this.e = cn7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r6 <= r2.c.g.getLong("app.update.to.version.with.live.location.date", 0)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r9 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if (((defpackage.p7b) r5).a.n() > r2.k) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cu8 r13) {
        /*
            r12 = this;
            iu8 r0 = r13.u0
            iu8 r1 = defpackage.iu8.SENDING
            if (r0 == r1) goto L_0x011b
            iu8 r1 = defpackage.iu8.ERROR
            if (r0 == r1) goto L_0x011b
            iu8 r1 = defpackage.iu8.UNKNOWN
            if (r0 != r1) goto L_0x0010
            goto L_0x011b
        L_0x0010:
            k8g r0 = r13.z0
            r1 = 0
            l20 r2 = r0.h(r1)
            r3 = 0
            m7b r5 = r12.d
            long r6 = r13.o
            if (r2 == 0) goto L_0x0069
            boolean r8 = r2.t
            if (r8 == 0) goto L_0x0024
            goto L_0x0069
        L_0x0024:
            u10 r2 = r2.m
            if (r2 != 0) goto L_0x0029
            goto L_0x0069
        L_0x0029:
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x002f
            goto L_0x00cc
        L_0x002f:
            r2 = r5
            p7b r2 = (defpackage.p7b) r2
            z7d r8 = r2.b
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f58livelocationenabled
            r10 = 1
            boolean r8 = r8.n(r9, r10)
            if (r8 == 0) goto L_0x0069
            cn7 r8 = r12.e
            r8.getClass()
            z7d r8 = r2.b
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f59livelocationreleasedate
            r10 = 1577626560000(0x16f51dee600, double:7.794510852627E-312)
            long r8 = r8.q(r9, r10)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0069
            jp r2 = r2.c
            ne7 r2 = r2.g
            java.lang.String r8 = "app.update.to.version.with.live.location.date"
            long r8 = r2.getLong(r8, r3)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0069
            goto L_0x00cc
        L_0x0069:
            l20 r2 = r0.h(r1)
            if (r2 == 0) goto L_0x00ab
            boolean r8 = r2.t
            if (r8 == 0) goto L_0x0074
            goto L_0x00ab
        L_0x0074:
            c20 r8 = r2.g
            if (r8 == 0) goto L_0x0080
            boolean r9 = r8.a()
            if (r9 == 0) goto L_0x0080
            l20 r2 = r8.g
        L_0x0080:
            boolean r8 = r2.t
            if (r8 == 0) goto L_0x0085
            goto L_0x00ab
        L_0x0085:
            k20 r2 = r2.d
            if (r2 != 0) goto L_0x008a
            goto L_0x00ab
        L_0x008a:
            uy r8 = r2.n
            boolean r9 = r2.g
            if (r8 != 0) goto L_0x0093
            if (r9 != 0) goto L_0x0093
            goto L_0x00cc
        L_0x0093:
            if (r9 == 0) goto L_0x00ab
            long r8 = r2.c
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x00ab
            r8 = r5
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            long r8 = r8.n()
            long r10 = r2.k
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ab
            goto L_0x00cc
        L_0x00ab:
            l20 r0 = r0.h(r1)
            if (r0 == 0) goto L_0x011b
            boolean r1 = r0.t
            if (r1 == 0) goto L_0x00b6
            goto L_0x011b
        L_0x00b6:
            boolean r0 = defpackage.s5c.P(r0)
            if (r0 == 0) goto L_0x011b
            p7b r5 = (defpackage.p7b) r5
            jp r0 = r5.c
            ne7 r0 = r0.g
            java.lang.String r1 = "app.update.to.version.with.file.video.date"
            long r0 = r0.getLong(r1, r3)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x011b
        L_0x00cc:
            java.util.concurrent.ConcurrentHashMap r0 = r12.a
            long r1 = r13.b
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r4 = java.lang.System.currentTimeMillis()
            if (r3 == 0) goto L_0x00ec
            long r6 = r3.longValue()
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x011b
        L_0x00ec:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
            long r0 = r13.t0
            p82 r2 = r12.c
            e52 r0 = r2.C(r0)
            if (r0 != 0) goto L_0x0106
            goto L_0x011b
        L_0x0106:
            k92 r0 = r0.b
            long r0 = r0.a
            long r2 = r13.c
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.util.List r13 = java.util.Collections.singletonList(r13)
            pk r12 = r12.b
            k4a r12 = (defpackage.k4a) r12
            r12.D(r0, r13)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz.a(cu8):void");
    }
}
