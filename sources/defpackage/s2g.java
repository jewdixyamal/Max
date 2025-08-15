package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: s2g  reason: default package */
public final class s2g implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final Set c;
    public final zt0 d;
    public wsf e;

    public s2g(ja7 ja7, je7 je7) {
        this.a = ja7;
        this.b = je7;
        v25 v25 = o2g.Y;
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            arrayList.add(((o2g) u1Var.next()).a);
        }
        this.c = x53.H0(arrayList);
        this.d = c37.a(0, 0, 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.p2g
            if (r4 == 0) goto L_0x001b
            r4 = r3
            p2g r4 = (defpackage.p2g) r4
            int r5 = r4.s0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.s0 = r5
            goto L_0x0020
        L_0x001b:
            p2g r4 = new p2g
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.Y
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.s0
            e5f r7 = defpackage.e5f.a
            switch(r6) {
                case 0: goto L_0x003e;
                case 1: goto L_0x0033;
                case 2: goto L_0x0033;
                case 3: goto L_0x0033;
                case 4: goto L_0x0033;
                case 5: goto L_0x0033;
                case 6: goto L_0x0033;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            o2g r0 = r4.X
            s2g r1 = r4.o
            defpackage.od2.a0(r3)
            r3 = r0
            r0 = r1
            goto L_0x0149
        L_0x003e:
            defpackage.od2.a0(r3)
            c32 r3 = defpackage.o2g.o
            r3.getClass()
            v25 r3 = defpackage.o2g.Y
            java.util.Iterator r3 = r3.iterator()
        L_0x004c:
            r6 = r3
            u1 r6 = (defpackage.u1) r6
            boolean r8 = r6.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x0066
            java.lang.Object r6 = r6.next()
            r8 = r6
            o2g r8 = (defpackage.o2g) r8
            java.lang.String r8 = r8.a
            boolean r8 = defpackage.tpa.f(r8, r1)
            if (r8 == 0) goto L_0x004c
            goto L_0x0067
        L_0x0066:
            r6 = r9
        L_0x0067:
            r3 = r6
            o2g r3 = (defpackage.o2g) r3
            if (r3 != 0) goto L_0x008c
            java.lang.Class<s2g> r2 = defpackage.s2g.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown method with name = "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " in JsDelegate: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.hm9.p(r2, r0, r9)
            return r7
        L_0x008c:
            int r1 = r3.ordinal()
            r6 = 1
            zt0 r8 = r0.d
            if (r1 == 0) goto L_0x0136
            r9 = 2
            if (r1 == r6) goto L_0x0123
            r6 = 3
            if (r1 == r9) goto L_0x00fa
            r9 = 4
            if (r1 == r6) goto L_0x00d1
            r6 = 5
            if (r1 == r9) goto L_0x00b7
            if (r1 != r6) goto L_0x00b1
            r4.o = r0
            r4.X = r3
            r1 = 6
            r4.s0 = r1
            java.lang.Object r1 = r0.e(r2, r4)
            if (r1 != r5) goto L_0x0149
            return r5
        L_0x00b1:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b7:
            r4.o = r0
            r4.X = r3
            r4.s0 = r6
            x97 r1 = new x97
            c32 r6 = defpackage.o2g.o
            java.lang.String r6 = "WebAppBackButtonPressed"
            r1.<init>(r6, r2)
            java.lang.Object r1 = r8.o(r1, r4)
            if (r1 != r5) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r7
        L_0x00ce:
            if (r1 != r5) goto L_0x0149
            return r5
        L_0x00d1:
            r4.o = r0
            r4.X = r3
            r4.s0 = r9
            ja7 r1 = defpackage.ja7.d
            r1.getClass()
            u0g r6 = defpackage.v0g.Companion
            cc7 r6 = r6.serializer()
            java.lang.Object r1 = r1.a(r6, r2)
            v0g r1 = (defpackage.v0g) r1
            k2g r2 = new k2g
            boolean r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r8.o(r2, r4)
            if (r1 != r5) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r1 = r7
        L_0x00f7:
            if (r1 != r5) goto L_0x0149
            return r5
        L_0x00fa:
            r4.o = r0
            r4.X = r3
            r4.s0 = r6
            ja7 r1 = defpackage.ja7.d
            r1.getClass()
            r0g r6 = defpackage.s0g.Companion
            cc7 r6 = r6.serializer()
            java.lang.Object r1 = r1.a(r6, r2)
            s0g r1 = (defpackage.s0g) r1
            m2g r2 = new m2g
            boolean r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r8.o(r2, r4)
            if (r1 != r5) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r1 = r7
        L_0x0120:
            if (r1 != r5) goto L_0x0149
            return r5
        L_0x0123:
            r4.o = r0
            r4.X = r3
            r4.s0 = r9
            j2g r1 = defpackage.j2g.a
            java.lang.Object r1 = r8.o(r1, r4)
            if (r1 != r5) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r1 = r7
        L_0x0133:
            if (r1 != r5) goto L_0x0149
            return r5
        L_0x0136:
            r4.o = r0
            r4.X = r3
            r4.s0 = r6
            n2g r1 = defpackage.n2g.a
            java.lang.Object r1 = r8.o(r1, r4)
            if (r1 != r5) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r1 = r7
        L_0x0146:
            if (r1 != r5) goto L_0x0149
            return r5
        L_0x0149:
            java.lang.String r9 = r3.a
            wsf r1 = r0.e
            if (r1 == 0) goto L_0x0166
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            iwf r8 = (defpackage.iwf) r8
            r14 = 0
            r17 = 240(0xf0, float:3.36E-43)
            long r10 = r1.a
            java.lang.String r12 = r1.b
            r13 = 1
            r15 = 0
            r16 = 0
            defpackage.iwf.a(r8, r9, r10, r12, r13, r14, r15, r16, r17)
        L_0x0166:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2g.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final zt0 b() {
        return this.d;
    }

    public final Set c() {
        return this.c;
    }

    public final void d(wsf wsf) {
        this.e = wsf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.q2g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            q2g r0 = (defpackage.q2g) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            q2g r0 = new q2g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.od2.a0(r7)
            goto L_0x007f
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            l2g r5 = r0.Y
            y0g r6 = r0.X
            s2g r2 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x006a
        L_0x003c:
            defpackage.od2.a0(r7)
            ja7 r7 = defpackage.ja7.d
            r7.getClass()
            x0g r2 = defpackage.y0g.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r6 = r7.a(r2, r6)
            y0g r6 = (defpackage.y0g) r6
            l2g r7 = new l2g
            boolean r2 = r6.b
            r7.<init>(r2)
            r0.o = r5
            r0.X = r6
            r0.Y = r7
            r0.t0 = r4
            zt0 r2 = r5.d
            java.lang.Object r2 = r2.o(r7, r0)
            if (r2 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r5
            r5 = r7
        L_0x006a:
            r2g r7 = new r2g
            r4 = 0
            r7.<init>(r6, r2, r4)
            r0.o = r4
            r0.X = r4
            r0.Y = r4
            r0.t0 = r3
            java.lang.Object r5 = r5.c(r7, r0)
            if (r5 != r1) goto L_0x007f
            return r1
        L_0x007f:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2g.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
