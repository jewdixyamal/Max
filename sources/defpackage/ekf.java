package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ekf  reason: default package */
public final class ekf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dkf Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ekf(dkf dkf, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = dkf;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((ekf) n((on5) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ekf ekf = new ekf(this.Z, this.s0, continuation);
        ekf.Y = obj;
        return ekf;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L_0x002c
        L_0x0014:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001c:
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L_0x004e
        L_0x0024:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            on5 r7 = (defpackage.on5) r7
            r1 = r7
        L_0x002c:
            dkf r7 = r6.Z
            boolean r4 = r7.b()
            if (r4 == 0) goto L_0x004e
            long r4 = r7.F0()
            kt4 r7 = defpackage.kt4.MILLISECONDS
            long r4 = defpackage.z7.S(r4, r7)
            ft4 r7 = new ft4
            r7.<init>(r4)
            r6.Y = r1
            r6.X = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r6.Y = r1
            r6.X = r2
            long r4 = r6.s0
            java.lang.Object r7 = defpackage.j47.y(r4, r6)
            if (r7 != r0) goto L_0x002c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekf.o(java.lang.Object):java.lang.Object");
    }
}
