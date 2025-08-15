package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: off  reason: default package */
public final class off extends ffe implements a66 {
    public e52 X;
    public List Y;
    public int Z;
    public int s0;
    public int t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ rff v0;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public off(List list, rff rff, long j, Continuation continuation) {
        super(2, continuation);
        this.u0 = list;
        this.v0 = rff;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((off) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new off(this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.t0
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            r5 = 1
            rff r6 = r12.v0
            if (r1 == 0) goto L_0x0033
            if (r1 == r5) goto L_0x002d
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            defpackage.od2.a0(r13)
            goto L_0x00e6
        L_0x0018:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0020:
            int r1 = r12.s0
            int r7 = r12.Z
            java.util.List r8 = r12.Y
            e52 r9 = r12.X
            defpackage.od2.a0(r13)
            goto L_0x00cf
        L_0x002d:
            e52 r1 = r12.X
            defpackage.od2.a0(r13)
            goto L_0x00a7
        L_0x0033:
            defpackage.od2.a0(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r1 = r12.u0
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r1.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            java.util.Set r10 = r6.l
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r8)
            boolean r8 = r10.contains(r11)
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0041
            r13.add(r7)
            goto L_0x0041
        L_0x0064:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0072
            java.lang.String r12 = r6.f
            java.lang.String r13 = "Fetch video. Don't start because ids empty"
            defpackage.hm9.m(r12, r13, new java.lang.Object[0])
            return r2
        L_0x0072:
            je7 r1 = r6.i
            java.lang.Object r1 = r1.getValue()
            iy2 r1 = (defpackage.iy2) r1
            long r7 = r12.w0
            jz2 r1 = (defpackage.jz2) r1
            w7c r1 = r1.m(r7)
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            e52 r1 = (defpackage.e52) r1
            if (r1 != 0) goto L_0x0094
            java.lang.String r12 = "Fetch video. Can't start fetch because chat not exist"
            java.lang.String r13 = r6.f
            defpackage.hm9.m(r13, r12, new java.lang.Object[0])
            return r2
        L_0x0094:
            je7 r7 = r6.h
            java.lang.Object r7 = r7.getValue()
            r79 r7 = (defpackage.r79) r7
            r12.X = r1
            r12.t0 = r5
            java.lang.Object r13 = r7.b(r13, r12)
            if (r13 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            java.util.List r13 = (java.util.List) r13
            int r7 = r13.size()
            r8 = 0
            r9 = r1
            r1 = r7
            r7 = r8
            r8 = r13
        L_0x00b2:
            if (r7 >= r1) goto L_0x00d1
            java.lang.Object r13 = r8.get(r7)
            cu8 r13 = (defpackage.cu8) r13
            k92 r10 = r9.b
            long r10 = r10.a
            r12.X = r9
            r12.Y = r8
            r12.Z = r7
            r12.s0 = r1
            r12.t0 = r4
            java.lang.Object r13 = defpackage.rff.a(r6, r13, r10, r12)
            if (r13 != r0) goto L_0x00cf
            return r0
        L_0x00cf:
            int r7 = r7 + r5
            goto L_0x00b2
        L_0x00d1:
            kld r13 = r6.j
            jff r1 = new jff
            r1.<init>()
            r4 = 0
            r12.X = r4
            r12.Y = r4
            r12.t0 = r3
            java.lang.Object r12 = r13.a(r1, r12)
            if (r12 != r0) goto L_0x00e6
            return r0
        L_0x00e6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.off.o(java.lang.Object):java.lang.Object");
    }
}
