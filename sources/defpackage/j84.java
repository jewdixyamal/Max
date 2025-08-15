package defpackage;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: j84  reason: default package */
public final class j84 implements cq4 {
    public final gaa a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final hc9 d;
    public final s2b e;
    public final jy3 f;
    public final ide g;
    public final ide h;
    public final ide i;
    public final ide j;
    public final ide k;
    public final ide l;

    public j84(gaa gaa, v4f v4f, v6d v6d, RealtimeSinceBootClock realtimeSinceBootClock, s2b s2b, jy3 jy3, xe xeVar, xe xeVar2, x24 x24, x24 x242, x24 x243, x24 x244) {
        this.a = gaa;
        this.b = v4f;
        this.c = v6d;
        this.d = realtimeSinceBootClock;
        this.e = s2b;
        this.f = jy3;
        this.g = xeVar;
        this.h = xeVar2;
        this.i = x24;
        this.k = x243;
        this.j = x242;
        this.l = x244;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: fm5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: w36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: fm5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: woe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: fm5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: woe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: w36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: w36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: w36} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: w36} */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7, types: [java.lang.Object, wf] */
    /* JADX WARNING: type inference failed for: r0v21, types: [l84, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.Object, y26] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(defpackage.l43 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.j43
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            j43 r15 = (defpackage.j43) r15
            monitor-enter(r15)
            a8g r0 = r15.o     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x000f
            r0 = r1
            goto L_0x0013
        L_0x000f:
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x0152 }
            com.facebook.animated.gif.GifImage r0 = (com.facebook.animated.gif.GifImage) r0     // Catch:{ all -> 0x0152 }
        L_0x0013:
            monitor-exit(r15)
            monitor-enter(r15)
            a8g r2 = r15.o     // Catch:{ all -> 0x014f }
            monitor-exit(r15)
            r2.getClass()
            if (r0 == 0) goto L_0x0020
            android.graphics.Bitmap$Config r15 = r0.a
            goto L_0x0021
        L_0x0020:
            r15 = r1
        L_0x0021:
            java.lang.Object r0 = r2.a
            com.facebook.animated.gif.GifImage r0 = (com.facebook.animated.gif.GifImage) r0
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r0.k()
            int r0 = r0.h()
            r5 = 0
            r3.<init>(r5, r5, r4, r0)
            gaa r0 = r14.a
            ue r0 = r0.j(r2, r3)
            re6 r3 = new re6
            r4 = 2
            r3.<init>((int) r4, (java.lang.Object) r0)
            ide r4 = r14.g
            java.lang.Object r4 = r4.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = 1
            if (r4 == r6) goto L_0x0079
            r6 = 2
            if (r4 == r6) goto L_0x0063
            r5 = 3
            if (r4 == r5) goto L_0x005a
            xxc r4 = new xxc
            r4.<init>()
            goto L_0x008e
        L_0x005a:
            y26 r4 = new y26
            r4.<init>()
            r5 = -1
            r4.a = r5
            goto L_0x008e
        L_0x0063:
            w36 r4 = new w36
            die r6 = new die
            cg r7 = new cg
            int r8 = r2.hashCode()
            r7.<init>(r8, r5)
            jy3 r8 = r14.f
            r6.<init>((defpackage.cg) r7, (defpackage.jy3) r8)
            r4.<init>(r6, r5)
            goto L_0x008e
        L_0x0079:
            w36 r4 = new w36
            die r7 = new die
            cg r8 = new cg
            int r9 = r2.hashCode()
            r8.<init>(r9, r5)
            jy3 r5 = r14.f
            r7.<init>((defpackage.cg) r8, (defpackage.jy3) r5)
            r4.<init>(r7, r6)
        L_0x008e:
            te r5 = new te
            ide r12 = r14.i
            java.lang.Object r6 = r12.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r5.<init>(r4, r0, r6)
            ide r0 = r14.h
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            s2b r6 = r14.e
            if (r0 <= 0) goto L_0x00d2
            fm5 r1 = new fm5
            r7 = 0
            r1.<init>(r0, r7)
            l84 r0 = new l84
            if (r15 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00bc:
            java.util.concurrent.ExecutorService r7 = r14.c
            r0.<init>()
            r0.a = r6
            r0.b = r5
            r0.c = r15
            r0.d = r7
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r0.e = r15
            r13 = r0
            goto L_0x00d3
        L_0x00d2:
            r13 = r1
        L_0x00d3:
            java.lang.Object r15 = r12.get()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0116
            woe r15 = new woe
            u26 r10 = new u26
            ide r0 = r14.k
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            ide r1 = r14.l
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.<init>(r6, r0, r1)
            ide r0 = r14.j
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            java.lang.Object r0 = r2.b
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r6 = r15
            r8 = r3
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0117
        L_0x0116:
            r15 = r1
        L_0x0117:
            pn0 r0 = new pn0
            java.lang.Object r1 = r12.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r11 = r1.booleanValue()
            s2b r7 = r14.e
            r6 = r0
            r8 = r4
            r9 = r3
            r10 = r5
            r12 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            wf r15 = new wf
            hc9 r1 = r14.d
            java.util.concurrent.ScheduledExecutorService r14 = r14.b
            r15.<init>()
            r15.c = r0
            r2 = 0
            r15.a = r2
            re r2 = new re
            r3 = 1
            r2.<init>(r3, r15)
            r15.Z = r2
            r15.Y = r0
            r15.o = r1
            r15.X = r14
            se r14 = new se
            r14.<init>(r15)
            return r14
        L_0x014f:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x014f }
            throw r14
        L_0x0152:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0152 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j84.a(l43):android.graphics.drawable.Drawable");
    }

    public final boolean b(l43 l43) {
        return l43 instanceof j43;
    }
}
