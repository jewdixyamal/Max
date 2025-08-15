package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: bi5  reason: default package */
public final class bi5 {
    public final int a;
    public final sx3 b;
    public final int c;
    public final qec d;
    public final qec e;
    public final String f = bi5.class.getName();
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public vxd j;
    public final y77 k;
    public final aj9 l;
    public final kld m;

    public bi5(yf3 yf3, int i2, sx3 sx3, int i3, qec qec, qec qec2) {
        this.a = i2;
        this.b = sx3;
        this.c = i3;
        this.d = qec;
        this.e = qec2;
        this.g = tu0.r(2, new sh5(0, yf3));
        this.h = tu0.r(2, new th5(this, 0));
        this.i = tu0.r(2, new th5(this, 1));
        this.k = pag.a();
        this.l = bj9.a();
        this.m = lld.b(0, 0, 0, 7);
        this.j = j47.T(sx3, (lx3) null, (vx3) null, new zh5(this, (String) null, (Continuation) null), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        defpackage.v3c.i(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
        defpackage.v3c.i(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008f, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.bi5 r7, java.util.Collection r8) {
        /*
            r7.getClass()
            r8.size()
            boolean r0 = r8.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0090
            java.io.File r0 = r7.c()
            defpackage.v3c.g(r0)
            java.io.FileWriter r0 = new java.io.FileWriter
            java.io.File r2 = r7.c()
            r0.<init>(r2, r1)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x007a }
            r1.<init>(r0)     // Catch:{ all -> 0x007a }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x003c }
        L_0x002c:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x003c }
            r2.println(r3)     // Catch:{ all -> 0x003c }
            goto L_0x002c
        L_0x003c:
            r7 = move-exception
            goto L_0x007e
        L_0x003e:
            java.io.File r8 = r7.c()     // Catch:{ all -> 0x003c }
            long r3 = r8.length()     // Catch:{ all -> 0x003c }
            r8 = 1024(0x400, float:1.435E-42)
            long r5 = (long) r8     // Catch:{ all -> 0x003c }
            long r3 = r3 / r5
            int r8 = r7.a     // Catch:{ all -> 0x003c }
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x006f
            java.io.File r8 = r7.c()     // Catch:{ IOException -> 0x006b }
            je7 r3 = r7.i     // Catch:{ IOException -> 0x006b }
            java.lang.Object r3 = r3.getValue()     // Catch:{ IOException -> 0x006b }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IOException -> 0x006b }
            boolean r8 = r8.renameTo(r3)     // Catch:{ IOException -> 0x006b }
            if (r8 == 0) goto L_0x006f
            java.io.File r7 = r7.c()     // Catch:{ IOException -> 0x006b }
            defpackage.v3c.g(r7)     // Catch:{ IOException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ all -> 0x003c }
        L_0x006f:
            r7 = 0
            defpackage.v3c.i(r2, r7)     // Catch:{ all -> 0x007c }
            defpackage.v3c.i(r1, r7)     // Catch:{ all -> 0x007a }
            defpackage.v3c.i(r0, r7)
            goto L_0x0090
        L_0x007a:
            r7 = move-exception
            goto L_0x008a
        L_0x007c:
            r7 = move-exception
            goto L_0x0084
        L_0x007e:
            throw r7     // Catch:{ all -> 0x007f }
        L_0x007f:
            r8 = move-exception
            defpackage.v3c.i(r2, r7)     // Catch:{ all -> 0x007c }
            throw r8     // Catch:{ all -> 0x007c }
        L_0x0084:
            throw r7     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r8 = move-exception
            defpackage.v3c.i(r1, r7)     // Catch:{ all -> 0x007a }
            throw r8     // Catch:{ all -> 0x007a }
        L_0x008a:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x008b:
            r8 = move-exception
            defpackage.v3c.i(r0, r7)
            throw r8
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.a(bi5, java.util.Collection):void");
    }

    public static String d(String str, boolean z) {
        return au1.g(str, z ? ".1.log" : ".log");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: aj9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: aj9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: xi9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: aj9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: aj9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: aj9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: xi9} */
    /* JADX WARNING: type inference failed for: r8v13, types: [xi9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.uh5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            uh5 r0 = (defpackage.uh5) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            uh5 r0 = new uh5
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r7) goto L_0x0051
            if (r2 == r6) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.String r8 = r0.Y
            xi9 r1 = r0.X
            bi5 r0 = r0.o
            defpackage.od2.a0(r9)     // Catch:{ all -> 0x0037 }
            goto L_0x00a6
        L_0x0037:
            r8 = move-exception
            goto L_0x00bc
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            xi9 r8 = r0.X
            bi5 r2 = r0.o
            defpackage.od2.a0(r9)     // Catch:{ TimeoutCancellationException -> 0x004f, all -> 0x004a }
            goto L_0x0083
        L_0x004a:
            r9 = move-exception
            r1 = r8
            r8 = r9
            goto L_0x00bc
        L_0x004f:
            r9 = r8
            goto L_0x008a
        L_0x0051:
            xi9 r8 = r0.X
            bi5 r2 = r0.o
            defpackage.od2.a0(r9)
            r9 = r8
            r8 = r2
            goto L_0x006d
        L_0x005b:
            defpackage.od2.a0(r9)
            r0.o = r8
            aj9 r9 = r8.l
            r0.X = r9
            r0.t0 = r7
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L_0x006d
            return r1
        L_0x006d:
            vh5 r2 = new vh5     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r2.<init>(r8, r5)     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r0.o = r8     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r0.X = r9     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r0.t0 = r6     // Catch:{ TimeoutCancellationException -> 0x0089 }
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r2 = defpackage.fp3.I(r6, r2, r0)     // Catch:{ TimeoutCancellationException -> 0x0089 }
            if (r2 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r2 = r8
            r8 = r9
        L_0x0083:
            r9 = r8
            r8 = r5
            goto L_0x008c
        L_0x0086:
            r8 = move-exception
            r1 = r9
            goto L_0x00bc
        L_0x0089:
            r2 = r8
        L_0x008a:
            java.lang.String r8 = "Timeout was exceed during waiting finishing jobs on flushing, not all logs were flushed"
        L_0x008c:
            vxd r6 = r2.j     // Catch:{ all -> 0x0086 }
            r0.o = r2     // Catch:{ all -> 0x0086 }
            r0.X = r9     // Catch:{ all -> 0x0086 }
            r0.Y = r8     // Catch:{ all -> 0x0086 }
            r0.t0 = r4     // Catch:{ all -> 0x0086 }
            r6.cancel((java.util.concurrent.CancellationException) r5)     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r6.join(r0)     // Catch:{ all -> 0x0086 }
            if (r0 != r1) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r0 = r3
        L_0x00a1:
            if (r0 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r1 = r9
            r0 = r2
        L_0x00a6:
            r0.getClass()     // Catch:{ all -> 0x0037 }
            zh5 r9 = new zh5     // Catch:{ all -> 0x0037 }
            r9.<init>(r0, r8, r5)     // Catch:{ all -> 0x0037 }
            sx3 r8 = r0.b     // Catch:{ all -> 0x0037 }
            vxd r8 = defpackage.j47.T(r8, r5, r5, r9, r4)     // Catch:{ all -> 0x0037 }
            r0.j = r8     // Catch:{ all -> 0x0037 }
            aj9 r1 = (defpackage.aj9) r1
            r1.e(r5)
            return r3
        L_0x00bc:
            aj9 r1 = (defpackage.aj9) r1
            r1.e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final File c() {
        return (File) this.h.getValue();
    }
}
