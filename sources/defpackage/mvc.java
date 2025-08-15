package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: mvc  reason: default package */
public final class mvc extends ffe implements a66 {
    public Set X;
    public String Y;
    public int Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ vvc t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mvc(long j, vvc vvc, Continuation continuation) {
        super(2, continuation);
        this.s0 = j;
        this.t0 = vvc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mvc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mvc(this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            long r3 = r0.s0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            vvc r9 = r0.t0
            if (r2 == 0) goto L_0x0036
            if (r2 == r7) goto L_0x002e
            if (r2 == r6) goto L_0x0023
            if (r2 != r5) goto L_0x001b
            defpackage.od2.a0(r17)
            goto L_0x00ad
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.String r2 = r0.Y
            java.util.Set r3 = r0.X
            defpackage.od2.a0(r17)
            r4 = r3
            r3 = r17
            goto L_0x0074
        L_0x002e:
            java.util.Set r2 = r0.X
            defpackage.od2.a0(r17)
            r7 = r17
            goto L_0x004f
        L_0x0036:
            defpackage.od2.a0(r17)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r3)
            java.util.Set r2 = java.util.Collections.singleton(r2)
            so1 r10 = r9.a
            r0.X = r2
            r0.Z = r7
            java.lang.Object r7 = r10.b(r2, r0)
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Object r7 = defpackage.x53.h0(r7)
            bo1 r7 = (defpackage.bo1) r7
            if (r7 == 0) goto L_0x0062
            java.lang.String r7 = r7.getName()
            goto L_0x0063
        L_0x0062:
            r7 = r8
        L_0x0063:
            so1 r10 = r9.a
            r0.X = r2
            r0.Y = r7
            r0.Z = r6
            java.lang.Object r3 = r10.c(r3, r0)
            if (r3 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r4 = r2
            r2 = r7
        L_0x0074:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x009e
            if (r2 == 0) goto L_0x009e
            boolean r3 = defpackage.w9e.C0(r2)
            if (r3 == 0) goto L_0x0085
            goto L_0x009e
        L_0x0085:
            q0e r3 = r9.s0
        L_0x0087:
            java.lang.Object r0 = r3.getValue()
            r10 = r0
            wvc r10 = (defpackage.wvc) r10
            r12 = 0
            r13 = 0
            r11 = 0
            r15 = 7
            r14 = r2
            wvc r1 = defpackage.wvc.a(r10, r11, r12, r13, r14, r15)
            boolean r0 = r3.c(r0, r1)
            if (r0 == 0) goto L_0x0087
            goto L_0x00ad
        L_0x009e:
            so1 r2 = r9.a
            r0.X = r8
            r0.Y = r8
            r0.Z = r5
            java.lang.Object r0 = r2.d(r4, r0)
            if (r0 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvc.o(java.lang.Object):java.lang.Object");
    }
}
