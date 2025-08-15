package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hp5  reason: default package */
public final class hp5 extends ffe implements e66 {
    public int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ a66 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp5(long j, a66 a66, Continuation continuation) {
        super(4, continuation);
        this.s0 = j;
        this.t0 = a66;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        on5 on5 = (on5) obj;
        long longValue = ((Number) obj3).longValue();
        hp5 hp5 = new hp5(this.s0, this.t0, (Continuation) obj4);
        hp5.Y = (Throwable) obj2;
        hp5.Z = longValue;
        return hp5.o(e5f.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            defpackage.od2.a0(r8)
            goto L_0x002d
        L_0x000d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0015:
            defpackage.od2.a0(r8)
            java.lang.Throwable r8 = r7.Y
            long r3 = r7.Z
            long r5 = r7.s0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0036
            r7.X = r2
            a66 r1 = r7.t0
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L_0x002d
            return r0
        L_0x002d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp5.o(java.lang.Object):java.lang.Object");
    }
}
