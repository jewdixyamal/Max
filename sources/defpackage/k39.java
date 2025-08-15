package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k39  reason: default package */
public final class k39 extends ffe implements a66 {
    public ti9 X;
    public n59 Y;
    public Object Z;
    public int s0;
    public final /* synthetic */ n59 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k39(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.t0 = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k39(this.t0, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[RETURN] */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.s0
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r1 = r5.Z
            n59 r3 = r5.Y
            ti9 r4 = r5.X
            defpackage.od2.a0(r6)
            goto L_0x003c
        L_0x0013:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001b:
            defpackage.od2.a0(r6)
            n59 r6 = r5.t0
            q0e r1 = r6.A1
            r3 = r6
            r4 = r1
        L_0x0024:
            java.lang.Object r1 = r4.getValue()
            r6 = r1
            z2e r6 = (defpackage.z2e) r6
            p31 r6 = r3.t0
            r5.X = r4
            r5.Y = r3
            r5.Z = r1
            r5.s0 = r2
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L_0x003c
            return r0
        L_0x003c:
            z2e r6 = (defpackage.z2e) r6
            boolean r6 = r4.c(r1, r6)
            if (r6 == 0) goto L_0x0024
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k39.o(java.lang.Object):java.lang.Object");
    }
}
