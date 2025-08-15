package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d79  reason: default package */
public final class d79 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ je7 Z;
    public final /* synthetic */ uj3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d79(je7 je7, uj3 uj3, Continuation continuation) {
        super(2, continuation);
        this.Z = je7;
        this.s0 = uj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d79) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d79 d79 = new d79(this.Z, this.s0, continuation);
        d79.Y = obj;
        return d79;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r4 = r6;
        r6 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000d, B:11:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ExcHandler: CancellationException (r5v6 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.X
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r5 = r5.Y
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.a0(r6)     // Catch:{ CancellationException -> 0x0013, all -> 0x0011 }
            goto L_0x004d
        L_0x0011:
            r6 = move-exception
            goto L_0x003f
        L_0x0013:
            r5 = move-exception
            goto L_0x004e
        L_0x0015:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001d:
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.Y
            sx3 r6 = (defpackage.sx3) r6
            je7 r1 = r5.Z
            uj3 r3 = r5.s0
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            tda r1 = (defpackage.tda) r1     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            r5.Y = r6     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            r5.X = r2     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            java.lang.Object r6 = r1.c(r3, r5)     // Catch:{ CancellationException -> 0x0013, all -> 0x003d }
            if (r6 != r0) goto L_0x004d
            return r0
        L_0x0039:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x003f
        L_0x003d:
            r5 = move-exception
            goto L_0x0039
        L_0x003f:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "fail to fetch self avatar"
            defpackage.hm9.p(r5, r0, r6)
            r6 = 0
        L_0x004d:
            return r6
        L_0x004e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d79.o(java.lang.Object):java.lang.Object");
    }
}
