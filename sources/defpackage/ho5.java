package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;

/* renamed from: ho5  reason: default package */
public final class ho5 extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ TimeUnit s0;
    public final /* synthetic */ long t0 = 0;
    public final /* synthetic */ long u0 = 100;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho5(TimeUnit timeUnit, Continuation continuation) {
        super(2, continuation);
        this.s0 = timeUnit;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((ho5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ho5 ho5 = new ho5(this.s0, continuation);
        ho5.Z = obj;
        return ho5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Y
            java.util.concurrent.TimeUnit r2 = r9.s0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x002d
            if (r1 == r4) goto L_0x0023
            if (r1 != r3) goto L_0x001b
            long r5 = r9.X
            java.lang.Object r1 = r9.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r10)
            goto L_0x0050
        L_0x001b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0023:
            long r5 = r9.X
            java.lang.Object r1 = r9.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r10)
            goto L_0x0066
        L_0x002d:
            java.lang.Object r1 = r9.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r10)
            goto L_0x004e
        L_0x0035:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Z
            r1 = r10
            on5 r1 = (defpackage.on5) r1
            long r6 = r9.t0
            long r6 = r2.toMillis(r6)
            r9.Z = r1
            r9.Y = r5
            java.lang.Object r10 = defpackage.j47.x(r6, r9)
            if (r10 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r5 = 0
        L_0x0050:
            r7 = 1
            long r7 = r7 + r5
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            r9.Z = r1
            r9.X = r7
            r9.Y = r4
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L_0x0065
            return r0
        L_0x0065:
            r5 = r7
        L_0x0066:
            long r7 = r9.u0
            long r7 = r2.toMillis(r7)
            r9.Z = r1
            r9.X = r5
            r9.Y = r3
            java.lang.Object r10 = defpackage.j47.x(r7, r9)
            if (r10 != r0) goto L_0x0050
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho5.o(java.lang.Object):java.lang.Object");
    }
}
