package defpackage;

import java.util.Map;

/* renamed from: e47  reason: default package */
public final class e47 implements sff {
    public long X;
    public Object Y;
    public long a;
    public long b;
    public String c;
    public String o;

    public void a(Object obj, String str) {
        if (((us) this.Y) == null) {
            this.Y = new qpd(1);
        }
        ((us) this.Y).put(str, obj);
    }

    public void b(Map map) {
        if (map != null && !map.isEmpty()) {
            if (((us) this.Y) == null) {
                this.Y = new qpd(map.size());
            }
            ((us) this.Y).putAll(map);
        }
    }

    public ms7 c() {
        if (oag.t(this.c) || oag.t(this.o)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        us usVar = (us) this.Y;
        if (usVar == null || usVar.c <= 10) {
            if (this.a == 0) {
                this.a = System.currentTimeMillis();
            }
            return new ms7(this.a, this.b, this.X, this.c, this.o, (us) this.Y);
        }
        throw new IllegalArgumentException("params can't be greater than limit = 10");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.c47
            if (r0 == 0) goto L_0x0013
            r0 = r14
            c47 r0 = (defpackage.c47) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            c47 r0 = new c47
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            e47 r13 = r0.o
            defpackage.od2.a0(r14)
            goto L_0x0080
        L_0x002a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0032:
            defpackage.od2.a0(r14)
            java.lang.String r14 = r13.o
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0061
            us7 r5 = defpackage.us7.X
            long r6 = r13.a
            java.lang.String r8 = r13.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Fetch video. Internal fetcher, videoId:"
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = ", token:"
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r2.d(r5, r14, r6, r4)
        L_0x0061:
            java.lang.Object r14 = r13.Y
            pk r14 = (defpackage.pk) r14
            gs9 r2 = new gs9
            long r7 = r13.a
            long r9 = r13.b
            long r11 = r13.X
            java.lang.String r6 = r13.c
            r5 = r2
            r5.<init>(r6, r7, r9, r11)
            r0.o = r13
            r0.Z = r3
            k4a r14 = (defpackage.k4a) r14
            java.lang.Object r14 = r14.J(r2, r0)
            if (r14 != r1) goto L_0x0080
            return r1
        L_0x0080:
            zjf r14 = (defpackage.zjf) r14
            java.lang.String r13 = r13.o
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x0089
            goto L_0x00a2
        L_0x0089:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x00a2
            us7 r1 = defpackage.us7.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Fetch video. Internal fetcher, response:"
            r2.<init>(r5)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.d(r1, r13, r2, r4)
        L_0x00a2:
            kl7 r13 = defpackage.j1e.l()
            java.util.Map r0 = r14.c
            java.lang.String r1 = "DASH"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x00b5
            r0 = r1
        L_0x00b5:
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x00c4
            ef5 r2 = new ef5
            r5 = 2
            r2.<init>(r5, r0)
            r13.add(r2)
        L_0x00c4:
            java.util.Map r0 = r14.c
            java.lang.String r2 = "HLS"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r1 = r0
        L_0x00d2:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00e0
            ef5 r0 = new ef5
            r0.<init>(r3, r1)
            r13.add(r0)
        L_0x00e0:
            java.util.Map r14 = r14.c
            java.util.Set r14 = r14.entrySet()
            at r0 = new at
            r1 = 2
            r0.<init>(r1, r14)
            g27 r14 = new g27
            r1 = 1
            r14.<init>(r1)
            qk5 r14 = defpackage.l6d.Z(r0, r14)
            ky6 r0 = new ky6
            r1 = 3
            r0.<init>(r1)
            km4 r1 = new km4
            r2 = 3
            r1.<init>(r14, r2, r0)
            g27 r14 = new g27
            r0 = 2
            r14.<init>(r0)
            r1f r0 = new r1f
            r0.<init>(r1, r14)
            java.util.List r14 = defpackage.l6d.i0(r0)
            r13.addAll(r14)
            kl7 r13 = defpackage.j1e.d(r13)
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            gf5 r4 = new gf5
            r4.<init>(r13)
        L_0x0124:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
