package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: a5d  reason: default package */
public final class a5d extends ffe implements a66 {
    public Set X;
    public x3c Y;
    public Iterator Z;
    public int s0;
    public final /* synthetic */ x3c t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a5d(x3c x3c, Continuation continuation) {
        super(2, continuation);
        this.t0 = x3c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a5d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a5d(this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.s0
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.util.Iterator r1 = r9.Z
            x3c r3 = r9.Y
            java.util.Set r4 = r9.X
            defpackage.od2.a0(r10)
            goto L_0x0080
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001b:
            defpackage.od2.a0(r10)
            x3c r10 = r9.t0
            java.lang.Object r1 = r10.Y
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = r3
            r3 = r10
        L_0x0035:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00a8
            java.lang.Object r10 = r1.next()
            gza r10 = (defpackage.gza) r10
            fza r5 = r10.b
            fza r6 = defpackage.fza.a
            long r7 = r10.a
            if (r5 == r6) goto L_0x0094
            java.lang.Object r10 = r3.b
            je7 r10 = (defpackage.je7) r10
            if (r10 != 0) goto L_0x0050
            goto L_0x0094
        L_0x0050:
            fza r10 = defpackage.fza.b
            if (r5 != r10) goto L_0x008e
            java.lang.Object r10 = r3.o
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            q33 r10 = (defpackage.q33) r10
            hyc r10 = (defpackage.hyc) r10
            long r5 = r10.t()
            long r5 = r5 ^ r7
            java.lang.Object r10 = r3.b
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            iy2 r10 = (defpackage.iy2) r10
            r9.X = r4
            r9.Y = r3
            r9.Z = r1
            r9.s0 = r2
            jz2 r10 = (defpackage.jz2) r10
            java.lang.Object r10 = r10.u(r5, r9)
            if (r10 != r0) goto L_0x0080
            return r0
        L_0x0080:
            e52 r10 = (defpackage.e52) r10
            if (r10 == 0) goto L_0x008c
            java.lang.Long r5 = new java.lang.Long
            long r6 = r10.a
            r5.<init>(r6)
            goto L_0x0099
        L_0x008c:
            r5 = 0
            goto L_0x0099
        L_0x008e:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
            goto L_0x0099
        L_0x0094:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
        L_0x0099:
            if (r5 == 0) goto L_0x0035
            long r5 = r5.longValue()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            r4.add(r10)
            goto L_0x0035
        L_0x00a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5d.o(java.lang.Object):java.lang.Object");
    }
}
