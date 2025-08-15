package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: js3  reason: default package */
public final class js3 {
    public static final /* synthetic */ bc7[] j;
    public final sx3 a;
    public final j0e b;
    public final td c;
    public final je7 d;
    public final je7 e;
    public final w4d f = mqd.D();
    public final khe g = new khe(new es3(0, this));
    public final q0e h;
    public final w7c i;

    static {
        oi9 oi9 = new oi9(js3.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9};
    }

    public js3(sx3 sx3, j0e j0e, td tdVar, je7 je7, je7 je72) {
        this.a = sx3;
        this.b = j0e;
        this.c = tdVar;
        this.d = je7;
        this.e = je72;
        q0e a2 = r0e.a(dn3.d);
        this.h = a2;
        this.i = new w7c(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if ((r2 != null ? ((defpackage.b0d) r3.getValue()).h(r2.toString(), r9) : false) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList a(defpackage.js3 r7, java.util.List r8, java.lang.String r9) {
        /*
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x000c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r8.next()
            r2 = r1
            nn3 r2 = (defpackage.nn3) r2
            java.util.List r3 = r2.o
            r4 = 0
            if (r3 == 0) goto L_0x0044
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0025
            goto L_0x0044
        L_0x0025:
            java.util.Iterator r3 = r3.iterator()
        L_0x0029:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r3.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = defpackage.eae.o0(r5, r9, r4)
            if (r5 == 0) goto L_0x0029
            goto L_0x006e
        L_0x0044:
            je7 r3 = r7.e
            java.lang.Object r5 = r3.getValue()
            b0d r5 = (defpackage.b0d) r5
            java.lang.CharSequence r6 = r2.b
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.h(r6, r9)
            if (r5 != 0) goto L_0x006e
            java.lang.CharSequence r2 = r2.c
            if (r2 == 0) goto L_0x006b
            java.lang.Object r3 = r3.getValue()
            b0d r3 = (defpackage.b0d) r3
            java.lang.String r2 = r2.toString()
            boolean r2 = r3.h(r2, r9)
            goto L_0x006c
        L_0x006b:
            r2 = r4
        L_0x006c:
            if (r2 == 0) goto L_0x006f
        L_0x006e:
            r4 = 1
        L_0x006f:
            if (r4 == 0) goto L_0x000c
            r0.add(r1)
            goto L_0x000c
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js3.a(js3, java.util.List, java.lang.String):java.util.ArrayList");
    }

    public final void b() {
        ((ti9) this.g.getValue()).setValue((Object) null);
        x77 x77 = (x77) this.f.T0(this, j[0]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        this.h.m((Object) null, dn3.d);
    }
}
