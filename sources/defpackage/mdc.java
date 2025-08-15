package defpackage;

import java.util.ArrayList;

/* renamed from: mdc  reason: default package */
public abstract class mdc {
    public re6 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(dec dec) {
        int i = dec.u0;
        if (!dec.n() && (i & 4) == 0) {
            dec.g();
        }
    }

    public abstract boolean a(dec dec, dec dec2, jt jtVar, jt jtVar2);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.dec r9) {
        /*
            r8 = this;
            re6 r8 = r8.a
            if (r8 == 0) goto L_0x00a6
            r0 = 1
            r9.v(r0)
            dec r1 = r9.s0
            r2 = 0
            if (r1 == 0) goto L_0x0013
            dec r1 = r9.t0
            if (r1 != 0) goto L_0x0013
            r9.s0 = r2
        L_0x0013:
            r9.t0 = r2
            int r1 = r9.u0
            r1 = r1 & 16
            if (r1 == 0) goto L_0x001d
            goto L_0x00a6
        L_0x001d:
            java.lang.Object r8 = r8.b
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r8.C0()
            l0f r1 = r8.t0
            java.lang.Object r2 = r1.X
            g03 r2 = (defpackage.g03) r2
            java.lang.Object r3 = r1.o
            sy4 r3 = (defpackage.sy4) r3
            int r4 = r1.b
            r5 = 0
            android.view.View r6 = r9.a
            if (r4 != r0) goto L_0x0045
            java.lang.Object r0 = r1.c
            android.view.View r0 = (android.view.View) r0
            if (r0 != r6) goto L_0x003d
        L_0x003b:
            r0 = r5
            goto L_0x0070
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            r7 = 2
            if (r4 == r7) goto L_0x009e
            r1.b = r7     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r3.b     // Catch:{ all -> 0x005b }
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4     // Catch:{ all -> 0x005b }
            int r4 = r4.indexOfChild(r6)     // Catch:{ all -> 0x005b }
            r7 = -1
            if (r4 != r7) goto L_0x005d
            r1.X(r6)     // Catch:{ all -> 0x005b }
        L_0x0058:
            r1.b = r5
            goto L_0x0070
        L_0x005b:
            r8 = move-exception
            goto L_0x009b
        L_0x005d:
            boolean r7 = r2.S(r4)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x006d
            r2.Z(r4)     // Catch:{ all -> 0x005b }
            r1.X(r6)     // Catch:{ all -> 0x005b }
            r3.M(r4)     // Catch:{ all -> 0x005b }
            goto L_0x0058
        L_0x006d:
            r1.b = r5
            goto L_0x003b
        L_0x0070:
            if (r0 == 0) goto L_0x008a
            dec r1 = androidx.recyclerview.widget.RecyclerView.U(r6)
            vdc r2 = r8.c
            r2.k(r1)
            vdc r2 = r8.c
            r2.h(r1)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.M1
            if (r1 == 0) goto L_0x008a
            java.util.Objects.toString(r6)
            r8.toString()
        L_0x008a:
            r1 = r0 ^ 1
            r8.D0(r1)
            if (r0 != 0) goto L_0x00a6
            boolean r9 = r9.r()
            if (r9 == 0) goto L_0x00a6
            r8.removeDetachedView(r6, r5)
            goto L_0x00a6
        L_0x009b:
            r1.b = r5
            throw r8
        L_0x009e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r9)
            throw r8
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdc.c(dec):void");
    }

    public abstract void d(dec dec);

    public abstract void e();

    public abstract boolean f();
}
