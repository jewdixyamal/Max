package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: ked  reason: default package */
public final class ked extends ffe implements a66 {
    public Iterator X;
    public Long Y;
    public ped Z;
    public ky7 s0;
    public ky7 t0;
    public int u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ ped w0;
    public final /* synthetic */ je7 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ked(ped ped, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.w0 = ped;
        this.x0 = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ked) n((ap0) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ked ked = new ked(this.w0, this.x0, continuation);
        ked.v0 = obj;
        return ked;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            ped r6 = r0.w0
            if (r2 == 0) goto L_0x0038
            if (r2 == r5) goto L_0x001f
            if (r2 != r4) goto L_0x0017
            defpackage.od2.a0(r20)
            goto L_0x0149
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            ky7 r2 = r0.t0
            ky7 r4 = r0.s0
            ped r7 = r0.Z
            java.lang.Long r8 = r0.Y
            java.util.Iterator r9 = r0.X
            java.lang.Object r10 = r0.v0
            ap0 r10 = (defpackage.ap0) r10
            defpackage.od2.a0(r20)
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r4
            r4 = r20
            goto L_0x009c
        L_0x0038:
            defpackage.od2.a0(r20)
            java.lang.Object r2 = r0.v0
            ap0 r2 = (defpackage.ap0) r2
            boolean r7 = r2 instanceof defpackage.xo0
            r8 = 0
            if (r7 == 0) goto L_0x0109
            r6.v0 = r8
            r4 = r2
            xo0 r4 = (defpackage.xo0) r4
            kn3 r4 = r4.a
            java.util.List r4 = r4.o
            java.util.Iterator r4 = r4.iterator()
            r10 = r2
            r9 = r4
        L_0x0053:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r9.next()
            r8 = r2
            java.lang.Long r8 = (java.lang.Long) r8
            ky7 r2 = new ky7
            r2.<init>()
            q0e r4 = r6.t0
            java.lang.Object r4 = r4.getValue()
            java.util.Map r4 = (java.util.Map) r4
            r2.putAll(r4)
            boolean r4 = r2.containsKey(r8)
            if (r4 != 0) goto L_0x00c9
            je7 r4 = r0.x0
            java.lang.Object r4 = r4.getValue()
            ds3 r4 = (defpackage.ds3) r4
            long r11 = r8.longValue()
            r0.v0 = r10
            r0.X = r9
            r0.Y = r8
            r0.Z = r6
            r0.s0 = r2
            r0.t0 = r2
            r0.u0 = r5
            java.lang.Comparable r4 = r4.b(r11, r0)
            if (r4 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r7 = r2
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r6
        L_0x009c:
            uj3 r4 = (defpackage.uj3) r4
            if (r4 == 0) goto L_0x00c6
            bc7[] r12 = defpackage.ped.z0
            r8.getClass()
            wo0 r8 = new wo0
            long r14 = r4.n()
            kk0 r12 = defpackage.kk0.b
            java.lang.String r16 = r4.p(r12)
            java.lang.String r12 = r4.d()
            if (r12 != 0) goto L_0x00b9
            java.lang.String r12 = ""
        L_0x00b9:
            r17 = r12
            java.lang.CharSequence r18 = r4.m()
            r13 = r8
            r13.<init>(r14, r16, r17, r18)
            r2.put(r9, r8)
        L_0x00c6:
            r2 = r7
            r9 = r10
            goto L_0x00ca
        L_0x00c9:
            r11 = r10
        L_0x00ca:
            ky7 r2 = r2.b()
            q0e r4 = r6.t0
        L_0x00d0:
            java.lang.Object r7 = r4.getValue()
            r8 = r7
            java.util.Map r8 = (java.util.Map) r8
            boolean r7 = r4.c(r7, r2)
            if (r7 == 0) goto L_0x00d0
            r10 = r11
            goto L_0x0053
        L_0x00e0:
            int r0 = r6.w0
            xo0 r10 = (defpackage.xo0) r10
            kn3 r1 = r10.a
            java.util.List r1 = r1.o
            int r1 = r1.size()
            int r1 = r1 + r0
            r6.w0 = r1
            kn3 r0 = r10.a
            java.util.List r1 = r0.o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0103
            java.util.List r0 = r0.o
            int r0 = r0.size()
            r1 = 40
            if (r0 >= r1) goto L_0x0149
        L_0x0103:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r6.w0 = r0
            goto L_0x0149
        L_0x0109:
            boolean r5 = r2 instanceof defpackage.yo0
            if (r5 == 0) goto L_0x012d
            r0.u0 = r4
            je7 r2 = r6.s0
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            med r4 = new med
            r4.<init>(r6, r8)
            java.lang.Object r0 = defpackage.j47.t0(r2, r4, r0)
            if (r0 != r1) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r0 = r3
        L_0x012a:
            if (r0 != r1) goto L_0x0149
            return r1
        L_0x012d:
            boolean r0 = r2 instanceof defpackage.zo0
            if (r0 == 0) goto L_0x014a
            zo0 r2 = (defpackage.zo0) r2
            long r0 = r2.a
            java.lang.Long r2 = r6.v0
            if (r2 != 0) goto L_0x013a
            goto L_0x0149
        L_0x013a:
            long r4 = r2.longValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0149
            r6.v0 = r8
            int r0 = r6.w0
            r6.q(r0)
        L_0x0149:
            return r3
        L_0x014a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ked.o(java.lang.Object):java.lang.Object");
    }
}
