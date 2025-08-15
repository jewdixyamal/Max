package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wp2  reason: default package */
public final class wp2 extends ffe implements a66 {
    public Serializable X;
    public Serializable Y;
    public int Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ List v0;
    public final /* synthetic */ List w0;
    public final /* synthetic */ cz5 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp2(rq2 rq2, long j, Long l, ArrayList arrayList, ArrayList arrayList2, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.s0 = rq2;
        this.t0 = j;
        this.u0 = l;
        this.v0 = arrayList;
        this.w0 = arrayList2;
        this.x0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wp2(this.s0, this.t0, this.u0, (ArrayList) this.v0, (ArrayList) this.w0, this.x0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.LinkedList} */
    /* JADX WARNING: type inference failed for: r15v2, types: [f9d, w8d] */
    /* JADX WARNING: type inference failed for: r15v4, types: [f9d, w8d] */
    /* JADX WARNING: type inference failed for: r14v6, types: [f9d, w8d] */
    /* JADX WARNING: type inference failed for: r14v8, types: [f9d, w8d] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.util.Queue] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0171 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r19
            r0 = 2
            r1 = 1
            tx3 r6 = defpackage.tx3.a
            int r2 = r5.Z
            r3 = 0
            java.util.List r4 = r5.v0
            r7 = 3
            long r8 = r5.t0
            rq2 r10 = r5.s0
            if (r2 == 0) goto L_0x0049
            if (r2 == r1) goto L_0x003a
            if (r2 == r0) goto L_0x0027
            if (r2 != r7) goto L_0x001f
            defpackage.od2.a0(r20)
            r0 = r20
            goto L_0x0172
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            java.io.Serializable r1 = r5.Y
            java.util.Queue r1 = (java.util.Queue) r1
            java.io.Serializable r2 = r5.X
            java.util.Queue r2 = (java.util.Queue) r2
            defpackage.od2.a0(r20)
            r7 = r8
            r9 = r2
            r2 = r1
            r1 = r0
            r0 = r20
            goto L_0x0139
        L_0x003a:
            java.io.Serializable r2 = r5.Y
            mec r2 = (defpackage.mec) r2
            java.io.Serializable r11 = r5.X
            mec r11 = (defpackage.mec) r11
            defpackage.od2.a0(r20)
            r12 = r11
            r11 = r20
            goto L_0x0069
        L_0x0049:
            defpackage.od2.a0(r20)
            mec r2 = new mec
            r2.<init>()
            je7 r11 = r10.H0
            java.lang.Object r11 = r11.getValue()
            x19 r11 = (defpackage.x19) r11
            r5.X = r2
            r5.Y = r2
            r5.Z = r1
            java.lang.Long r12 = r5.u0
            java.lang.Object r11 = r11.a(r8, r12, r5)
            if (r11 != r6) goto L_0x0068
            return r6
        L_0x0068:
            r12 = r2
        L_0x0069:
            r2.a = r11
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r11 = r4.iterator()
            r13 = 0
            r14 = r13
        L_0x0076:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x00b8
            java.lang.Object r15 = r11.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x00b4
            java.lang.Number r15 = (java.lang.Number) r15
            long r0 = r15.longValue()
            if (r14 != 0) goto L_0x009e
            bc7[] r14 = defpackage.rq2.f1
            w8d r14 = new w8d
            r14.<init>(r8)
            r14.m = r0
            java.lang.Object r0 = r12.a
            bw8 r0 = (defpackage.bw8) r0
            r14.b = r0
            r12.a = r3
            goto L_0x00a7
        L_0x009e:
            bc7[] r14 = defpackage.rq2.f1
            w8d r14 = new w8d
            r14.<init>(r8)
            r14.m = r0
        L_0x00a7:
            x8d r0 = new x8d
            r0.<init>(r14)
            r2.add(r0)
            r14 = r16
            r0 = 2
            r1 = 1
            goto L_0x0076
        L_0x00b4:
            defpackage.y53.R()
            throw r3
        L_0x00b8:
            java.util.List r0 = r5.w0
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011f
            java.lang.Object r1 = r0.next()
            r11 = 1
            int r14 = r13 + 1
            if (r13 < 0) goto L_0x011b
            uua r1 = (defpackage.uua) r1
            if (r13 != 0) goto L_0x00f5
            java.lang.Object r13 = r12.a
            if (r13 == 0) goto L_0x00f5
            bc7[] r15 = defpackage.rq2.f1
            w8d r15 = new w8d
            r15.<init>(r8)
            r17 = r8
            long r7 = r1.a
            int r7 = (int) r7
            r15.n = r7
            java.lang.String r7 = r1.b
            r15.o = r7
            java.lang.String r1 = r1.c
            r15.p = r1
            bw8 r13 = (defpackage.bw8) r13
            r15.b = r13
            r12.a = r3
            r9 = r12
            r7 = r17
            goto L_0x010e
        L_0x00f5:
            r17 = r8
            bc7[] r7 = defpackage.rq2.f1
            w8d r15 = new w8d
            r7 = r17
            r15.<init>(r7)
            r9 = r12
            long r11 = r1.a
            int r11 = (int) r11
            r15.n = r11
            java.lang.String r11 = r1.b
            r15.o = r11
            java.lang.String r1 = r1.c
            r15.p = r1
        L_0x010e:
            x8d r1 = new x8d
            r1.<init>(r15)
            r2.add(r1)
            r12 = r9
            r13 = r14
            r8 = r7
            r7 = 3
            goto L_0x00be
        L_0x011b:
            defpackage.y53.R()
            throw r3
        L_0x011f:
            r7 = r8
            je7 r0 = r10.F0
            java.lang.Object r0 = r0.getValue()
            xb6 r0 = (defpackage.xb6) r0
            r5.X = r2
            r5.Y = r2
            r1 = 2
            r5.Z = r1
            cz5 r9 = r5.x0
            java.lang.Object r0 = r0.b(r9, r5)
            if (r0 != r6) goto L_0x0138
            return r6
        L_0x0138:
            r9 = r2
        L_0x0139:
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            h8d r0 = new h8d
            r0.<init>(r7, r9, r1)
            h9d r1 = new h9d
            r1.<init>(r0)
            s8g r0 = defpackage.rq2.r(r10)
            r0.a(r1)
            int r2 = r4.size()
            je7 r0 = r10.E0
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            lu0 r4 = (defpackage.lu0) r4
            r5.X = r3
            r5.Y = r3
            r0 = 3
            r5.Z = r0
            long r0 = r5.t0
            cz5 r7 = r5.x0
            r3 = r4
            r4 = r7
            r5 = r19
            java.lang.Object r0 = defpackage.zo2.d.c(r0, r2, r3, r4, false, r5)
            if (r0 != r6) goto L_0x0172
            return r6
        L_0x0172:
            zo2 r0 = (defpackage.zo2) r0
            s35 r1 = r10.b1
            defpackage.pnf.o(r1, r0)
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp2.o(java.lang.Object):java.lang.Object");
    }
}
