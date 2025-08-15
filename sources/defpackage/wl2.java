package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: wl2  reason: default package */
public final class wl2 extends ffe implements a66 {
    public on5 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ cm2 s0;
    public final /* synthetic */ Set t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl2(cm2 cm2, Set set, Continuation continuation) {
        super(2, continuation);
        this.s0 = cm2;
        this.t0 = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wl2 wl2 = new wl2(this.s0, this.t0, continuation);
        wl2.Z = obj;
        return wl2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: on5} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0020, B:13:0x002c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[ExcHandler: CancellationException (r7v4 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:9:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.Y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            defpackage.od2.a0(r8)
            goto L_0x0074
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001c:
            java.lang.Object r1 = r7.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r8)     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            goto L_0x0074
        L_0x0024:
            r7 = move-exception
            goto L_0x0077
        L_0x0026:
            on5 r1 = r7.X
            java.lang.Object r4 = r7.Z
            on5 r4 = (defpackage.on5) r4
            defpackage.od2.a0(r8)     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            goto L_0x0058
        L_0x0030:
            r1 = r4
            goto L_0x0065
        L_0x0032:
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.Z
            r1 = r8
            on5 r1 = (defpackage.on5) r1
            cm2 r8 = r7.s0
            java.util.Set r6 = r7.t0
            je7 r8 = r8.c     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            le5 r8 = (defpackage.le5) r8     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            java.util.List r6 = defpackage.x53.D0(r6)     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            r7.Z = r1     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            r7.X = r1     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            r7.Y = r4     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            java.lang.Object r8 = r8.b(r6, r7)     // Catch:{ CancellationException -> 0x0024, all -> 0x0065 }
            if (r8 != r0) goto L_0x0057
            return r0
        L_0x0057:
            r4 = r1
        L_0x0058:
            r7.Z = r4     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            r7.X = r5     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            r7.Y = r3     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            java.lang.Object r7 = r1.a(r8, r7)     // Catch:{ CancellationException -> 0x0024, all -> 0x0030 }
            if (r7 != r0) goto L_0x0074
            return r0
        L_0x0065:
            nz4 r8 = defpackage.nz4.a
            r7.Z = r5
            r7.X = r5
            r7.Y = r2
            java.lang.Object r7 = r1.a(r8, r7)
            if (r7 != r0) goto L_0x0074
            return r0
        L_0x0074:
            e5f r7 = defpackage.e5f.a
            return r7
        L_0x0077:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl2.o(java.lang.Object):java.lang.Object");
    }
}
