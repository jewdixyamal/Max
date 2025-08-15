package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mc6  reason: default package */
public final class mc6 {
    public static final long[] g = new long[0];
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public mc6(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r17, defpackage.ek2 r19, long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r23
            boolean r2 = r1 instanceof defpackage.lc6
            if (r2 == 0) goto L_0x0017
            r2 = r1
            lc6 r2 = (defpackage.lc6) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001c
        L_0x0017:
            lc6 r2 = new lc6
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r6) goto L_0x0033
            mc6 r0 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x0031 }
        L_0x002d:
            r15 = r1
            r1 = r0
            r0 = r15
            goto L_0x007a
        L_0x0031:
            r1 = r0
            goto L_0x0082
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            defpackage.od2.a0(r1)
            au r1 = new au
            r4 = r19
            java.lang.String r10 = r4.a
            je7 r4 = r0.b
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            qyc r4 = (defpackage.qyc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f74maxreadmarks
            r8 = 300(0x12c, float:4.2E-43)
            long r8 = (long) r8
            long r7 = r4.q(r7, r8)
            int r13 = (int) r7
            r7 = r1
            r8 = r17
            r11 = r20
            r14 = r22
            r7.<init>((long) r8, (java.lang.String) r10, (long) r11, (int) r13, (java.lang.String) r14)
            je7 r4 = r0.a     // Catch:{ all -> 0x0031 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0031 }
            pk r4 = (defpackage.pk) r4     // Catch:{ all -> 0x0031 }
            r2.o = r0     // Catch:{ all -> 0x0031 }
            r2.Z = r6     // Catch:{ all -> 0x0031 }
            k4a r4 = (defpackage.k4a) r4     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r4.J(r1, r2)     // Catch:{ all -> 0x0031 }
            if (r1 != r3) goto L_0x002d
            return r3
        L_0x007a:
            fk2 r0 = (defpackage.fk2) r0     // Catch:{ all -> 0x0082 }
            r1.b(r0)     // Catch:{ all -> 0x0080 }
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x009d
        L_0x0082:
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0080 }
            ir6 r2 = defpackage.hm9.m     // Catch:{ all -> 0x0080 }
            if (r2 != 0) goto L_0x008f
            goto L_0x009c
        L_0x008f:
            boolean r3 = r2.c()     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x009c
            us7 r3 = defpackage.us7.s0     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "fail to get chat members"
            r2.d(r3, r0, r4, r5)     // Catch:{ all -> 0x0080 }
        L_0x009c:
            return r5
        L_0x009d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail"
            defpackage.hm9.p(r1, r2, r0)
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00af
            return r5
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc6.a(long, ek2, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(fk2 fk2) {
        if (!fk2.c.isEmpty()) {
            ArrayList arrayList = new ArrayList(fk2.c.size());
            xs xsVar = new xs(fk2.c.size());
            Iterator it = fk2.c.iterator();
            while (it.hasNext()) {
                dk2 dk2 = (dk2) it.next();
                arrayList.add(dk2.a);
                wm3 wm3 = dk2.a;
                xsVar.add(Long.valueOf(wm3.a));
                ((w7b) this.d.getValue()).d().f(wm3.a, iz7.l(dk2.b));
            }
            if (!arrayList.isEmpty()) {
                ((el3) this.c.getValue()).s(arrayList, g);
            }
            if (!xsVar.isEmpty()) {
                ((r47) this.e.getValue()).a(xsVar);
            }
            ((av0) this.f.getValue()).c(new ps3(0, xsVar));
        }
    }
}
