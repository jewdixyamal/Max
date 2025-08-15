package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ce5  reason: default package */
public final class ce5 extends ffe implements a66 {
    public List X;
    public int Y;
    public final /* synthetic */ he5 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ gi9 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ce5(he5 he5, long j, gi9 gi9, Continuation continuation) {
        super(2, continuation);
        this.Z = he5;
        this.s0 = j;
        this.t0 = gi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ce5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ce5(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.Y
            r2 = 3
            r3 = 2
            r4 = 1
            he5 r5 = r11.Z
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.util.List r11 = r11.X
            defpackage.od2.a0(r12)
            goto L_0x00c1
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0020:
            java.util.List r1 = r11.X
            defpackage.od2.a0(r12)
            goto L_0x0082
        L_0x0026:
            defpackage.od2.a0(r12)
            goto L_0x0046
        L_0x002a:
            defpackage.od2.a0(r12)
            r11.Y = r4
            kke r12 = r5.X
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            de5 r1 = new de5
            r4 = 0
            long r6 = r11.s0
            r1.<init>(r5, r6, r4)
            java.lang.Object r12 = defpackage.j47.t0(r12, r1, r11)
            if (r12 != r0) goto L_0x0046
            return r0
        L_0x0046:
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r12 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r1, r4)
            r12.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x0058:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x006f
            java.lang.Object r6 = r4.next()
            je5 r6 = (defpackage.je5) r6
            long r6 = r6.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            r12.add(r8)
            goto L_0x0058
        L_0x006f:
            gi9 r12 = defpackage.oag.G(r12)
            java.util.List r12 = defpackage.oag.D(r12)
            r11.X = r1
            r11.Y = r3
            java.lang.Object r12 = defpackage.he5.p(r5, r12, r11)
            if (r12 != r0) goto L_0x0082
            return r0
        L_0x0082:
            ei9 r12 = (defpackage.ei9) r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x008d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r1.next()
            r6 = r4
            je5 r6 = (defpackage.je5) r6
            long r7 = r6.a
            int r7 = r12.b(r7)
            if (r7 < 0) goto L_0x00a7
            long[] r8 = r12.c
            r7 = r8[r7]
            goto L_0x00a9
        L_0x00a7:
            r7 = -9223372036854775808
        L_0x00a9:
            long r9 = r6.g
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x008d
            r3.add(r4)
            goto L_0x008d
        L_0x00b3:
            r11.X = r3
            r11.Y = r2
            gi9 r12 = r11.t0
            java.io.Serializable r12 = defpackage.he5.o(r5, r3, r12, r11)
            if (r12 != r0) goto L_0x00c0
            return r0
        L_0x00c0:
            r11 = r3
        L_0x00c1:
            java.util.Map r12 = (java.util.Map) r12
            sl2 r0 = new sl2
            int r11 = r11.size()
            r0.<init>(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce5.o(java.lang.Object):java.lang.Object");
    }
}
