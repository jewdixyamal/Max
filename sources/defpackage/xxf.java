package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: xxf  reason: default package */
public final class xxf implements ia7 {
    public final je7 a;
    public final Set b;
    public final zt0 c;
    public wsf d;

    public xxf(je7 je7) {
        this.a = je7;
        v25 v25 = vxf.Y;
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            arrayList.add(((vxf) u1Var.next()).a);
        }
        this.b = x53.H0(arrayList);
        this.c = c37.a(0, 0, 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.wxf
            if (r4 == 0) goto L_0x001b
            r4 = r3
            wxf r4 = (defpackage.wxf) r4
            int r5 = r4.s0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.s0 = r5
            goto L_0x0020
        L_0x001b:
            wxf r4 = new wxf
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.Y
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.s0
            e5f r7 = defpackage.e5f.a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0043
            if (r6 == r9) goto L_0x0030
            if (r6 != r8) goto L_0x003b
        L_0x0030:
            vxf r0 = r4.X
            xxf r1 = r4.o
            defpackage.od2.a0(r3)
            r3 = r0
            r0 = r1
            goto L_0x00f3
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            defpackage.od2.a0(r3)
            yxc r3 = defpackage.vxf.o
            r3.getClass()
            v25 r3 = defpackage.vxf.Y
            java.util.Iterator r3 = r3.iterator()
        L_0x0051:
            r6 = r3
            u1 r6 = (defpackage.u1) r6
            boolean r10 = r6.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x006b
            java.lang.Object r6 = r6.next()
            r10 = r6
            vxf r10 = (defpackage.vxf) r10
            java.lang.String r10 = r10.a
            boolean r10 = defpackage.tpa.f(r10, r1)
            if (r10 == 0) goto L_0x0051
            goto L_0x006c
        L_0x006b:
            r6 = r11
        L_0x006c:
            r3 = r6
            vxf r3 = (defpackage.vxf) r3
            if (r3 != 0) goto L_0x0091
            java.lang.Class<xxf> r2 = defpackage.xxf.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown method with name = "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " in JsDelegate: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.hm9.p(r2, r0, r11)
            return r7
        L_0x0091:
            int r1 = r3.ordinal()
            zt0 r6 = r0.c
            if (r1 == 0) goto L_0x00ca
            if (r1 != r9) goto L_0x00c4
            r4.o = r0
            r4.X = r3
            r4.s0 = r8
            ja7 r1 = defpackage.ja7.d
            r1.getClass()
            eyf r8 = defpackage.fyf.Companion
            cc7 r8 = r8.serializer()
            java.lang.Object r1 = r1.a(r8, r2)
            fyf r1 = (defpackage.fyf) r1
            sxf r2 = new sxf
            java.lang.String r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r6.o(r2, r4)
            if (r1 != r5) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r1 = r7
        L_0x00c1:
            if (r1 != r5) goto L_0x00f3
            return r5
        L_0x00c4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ca:
            r4.o = r0
            r4.X = r3
            r4.s0 = r9
            ja7 r1 = defpackage.ja7.d
            r1.getClass()
            byf r8 = defpackage.cyf.Companion
            cc7 r8 = r8.serializer()
            java.lang.Object r1 = r1.a(r8, r2)
            cyf r1 = (defpackage.cyf) r1
            txf r2 = new txf
            java.lang.String r1 = r1.a
            r2.<init>(r1)
            java.lang.Object r1 = r6.o(r2, r4)
            if (r1 != r5) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = r7
        L_0x00f0:
            if (r1 != r5) goto L_0x00f3
            return r5
        L_0x00f3:
            java.lang.String r9 = r3.a
            wsf r1 = r0.d
            if (r1 == 0) goto L_0x0110
            je7 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            iwf r8 = (defpackage.iwf) r8
            r15 = 0
            r17 = 240(0xf0, float:3.36E-43)
            long r10 = r1.a
            java.lang.String r12 = r1.b
            r13 = 1
            r14 = 0
            r16 = 0
            defpackage.iwf.a(r8, r9, r10, r12, r13, r14, r15, r16, r17)
        L_0x0110:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxf.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final zt0 b() {
        return this.c;
    }

    public final Set c() {
        return this.b;
    }

    public final void d(wsf wsf) {
        this.d = wsf;
    }
}
