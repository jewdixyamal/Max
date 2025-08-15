package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xkb  reason: default package */
public final class xkb extends ffe implements a66 {
    public blb X;
    public Iterator Y;
    public wgb Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ blb u0;
    public final /* synthetic */ je7 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xkb(blb blb, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.u0 = blb;
        this.v0 = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xkb) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xkb xkb = new xkb(this.u0, this.v0, continuation);
        xkb.t0 = obj;
        return xkb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            blb r3 = r0.u0
            r4 = 1
            if (r2 == 0) goto L_0x0025
            if (r2 != r4) goto L_0x001d
            wgb r2 = r0.Z
            java.util.Iterator r5 = r0.Y
            blb r6 = r0.X
            java.lang.Object r7 = r0.t0
            je7 r7 = (defpackage.je7) r7
            defpackage.od2.a0(r18)
            r8 = r18
            goto L_0x005a
        L_0x001d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            defpackage.od2.a0(r18)
            java.lang.Object r2 = r0.t0
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
            je7 r5 = r0.v0
            r6 = r3
            r7 = r5
            r5 = r2
        L_0x0035:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0156
            java.lang.Object r2 = r5.next()
            wgb r2 = (defpackage.wgb) r2
            java.lang.Object r8 = r7.getValue()
            ds3 r8 = (defpackage.ds3) r8
            long r9 = r2.b
            r0.t0 = r7
            r0.X = r6
            r0.Y = r5
            r0.Z = r2
            r0.s0 = r4
            java.lang.Comparable r8 = r8.b(r9, r0)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r14 = r8
            uj3 r14 = (defpackage.uj3) r14
            if (r14 != 0) goto L_0x0060
            goto L_0x0035
        L_0x0060:
            r6.getClass()
            bdb r8 = r2.c
            java.lang.Object r8 = r8.b
            java.util.Map r8 = (java.util.Map) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0076:
            boolean r10 = r8.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x00ce
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r12 = r10.getKey()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Object r10 = r10.getValue()
            jjc r10 = (defpackage.jjc) r10
            c32 r13 = defpackage.ljc.a
            r13.getClass()
            v25 r13 = defpackage.ljc.c
            java.util.Iterator r13 = r13.iterator()
        L_0x009e:
            r15 = r13
            u1 r15 = (defpackage.u1) r15
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00b5
            java.lang.Object r15 = r15.next()
            r16 = r15
            ljc r16 = (defpackage.ljc) r16
            r16.getClass()
            if (r4 != r12) goto L_0x009e
            goto L_0x00b6
        L_0x00b5:
            r15 = r11
        L_0x00b6:
            ljc r15 = (defpackage.ljc) r15
            if (r15 != 0) goto L_0x00bb
            goto L_0x00c8
        L_0x00bb:
            jjc r11 = new jjc
            long r12 = r10.a
            r11.<init>(r12)
            kpa r10 = new kpa
            r10.<init>(r15, r11)
            r11 = r10
        L_0x00c8:
            if (r11 == 0) goto L_0x0076
            r9.add(r11)
            goto L_0x0076
        L_0x00ce:
            java.util.EnumMap r12 = new java.util.EnumMap
            java.lang.Class<ljc> r8 = defpackage.ljc.class
            r12.<init>(r8)
            defpackage.mz7.b0(r9, r12)
            bdb r8 = r2.c
            java.lang.Object r8 = r8.c
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00e7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0122
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            oz7 r10 = defpackage.wkb.a
            r10.getClass()
            v25 r10 = defpackage.wkb.o
            java.util.Iterator r10 = r10.iterator()
        L_0x0102:
            r15 = r10
            u1 r15 = (defpackage.u1) r15
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0119
            java.lang.Object r15 = r15.next()
            r16 = r15
            wkb r16 = (defpackage.wkb) r16
            r16.getClass()
            if (r4 != r9) goto L_0x0102
            goto L_0x011a
        L_0x0119:
            r15 = r11
        L_0x011a:
            wkb r15 = (defpackage.wkb) r15
            if (r15 == 0) goto L_0x00e7
            r13.add(r15)
            goto L_0x00e7
        L_0x0122:
            oab r8 = new oab
            long r10 = r2.b
            r9 = r8
            r15 = r10
            r9.<init>(r10, r12, r13, r14)
            java.util.concurrent.ConcurrentHashMap r9 = r6.e
            java.lang.Long r10 = new java.lang.Long
            r11 = r15
            r10.<init>(r11)
            r9.put(r10, r8)
            java.util.concurrent.ConcurrentHashMap r9 = r6.f
            long r10 = r2.b
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            nq2 r12 = new nq2
            r13 = 2
            r12.<init>(r6, r10, r13)
            di r10 = new di
            r11 = 18
            r10.<init>(r11, r12)
            java.lang.Object r2 = r9.computeIfAbsent(r2, r10)
            ti9 r2 = (defpackage.ti9) r2
            r2.setValue(r8)
            goto L_0x0035
        L_0x0156:
            ua3 r0 = r3.d
            e5f r1 = defpackage.e5f.a
            r0.makeCompleting$kotlinx_coroutines_core(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.o(java.lang.Object):java.lang.Object");
    }
}
