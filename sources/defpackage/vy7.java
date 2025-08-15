package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vy7  reason: default package */
public final class vy7 {
    public final Map a = Collections.synchronizedMap(new i56(10, 0));
    public final Map b = Collections.synchronizedMap(new i56(10, 0));
    public final Map c = Collections.synchronizedMap(new i56(10, 0));
    public final Map d = Collections.synchronizedMap(new i56(10, 0));
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final xke f;
    public final qx7 g;
    public final boolean h;

    public vy7(xke xke, qx7 qx7) {
        this.f = xke;
        this.g = qx7;
        this.h = true;
    }

    public static void a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is main!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: sy7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sy7 b(android.content.Context r10, defpackage.i08 r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            a()
            java.util.Map r0 = r9.a
            java.util.Map r1 = r9.c
            java.util.Map r2 = r9.b
            java.lang.String r3 = "Wrong marker weight"
            xke r4 = r9.f
            r5 = 1
            if (r12 == 0) goto L_0x0059
            r6 = 0
            if (r13 == 0) goto L_0x0037
            java.lang.Object r7 = r2.get(r11)
            sy7 r7 = (defpackage.sy7) r7
            int r8 = r11.ordinal()
            if (r8 == 0) goto L_0x002f
            if (r8 != r5) goto L_0x0029
            r4.getClass()
            int r3 = defpackage.xke.a(r5, r5)
            goto L_0x0079
        L_0x0029:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x002f:
            r4.getClass()
            int r3 = defpackage.xke.a(r6, r5)
            goto L_0x0079
        L_0x0037:
            java.lang.Object r7 = r1.get(r11)
            sy7 r7 = (defpackage.sy7) r7
            int r8 = r11.ordinal()
            if (r8 == 0) goto L_0x0053
            if (r8 != r5) goto L_0x004d
            r4.getClass()
            int r3 = defpackage.xke.a(r5, r6)
            goto L_0x0079
        L_0x004d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x0053:
            r4.getClass()
            int r3 = defpackage.gpc.K
            goto L_0x0079
        L_0x0059:
            java.lang.Object r6 = r0.get(r11)
            r7 = r6
            sy7 r7 = (defpackage.sy7) r7
            int r6 = r11.ordinal()
            if (r6 == 0) goto L_0x0074
            if (r6 != r5) goto L_0x006e
            r4.getClass()
            int r3 = defpackage.gpc.L
            goto L_0x0079
        L_0x006e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L_0x0074:
            r4.getClass()
            int r3 = defpackage.gpc.L
        L_0x0079:
            if (r7 != 0) goto L_0x00a6
            pq9 r5 = defpackage.qp4.u0
            android.content.Context r4 = r4.a
            bs6 r4 = defpackage.k7d.h(r5, r4)
            int r4 = r4.k
            android.graphics.Bitmap r10 = defpackage.j47.o0(r3, r4, r10)
            qx7 r9 = r9.g
            r9.getClass()
            sn0 r9 = defpackage.qx7.i(r10)
            sy7 r7 = new sy7
            r7.<init>(r10, r9)
            if (r12 == 0) goto L_0x00a3
            if (r13 == 0) goto L_0x009f
            r2.put(r11, r7)
            goto L_0x00a6
        L_0x009f:
            r1.put(r11, r7)
            goto L_0x00a6
        L_0x00a3:
            r0.put(r11, r7)
        L_0x00a6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy7.b(android.content.Context, i08, boolean, boolean):sy7");
    }
}
