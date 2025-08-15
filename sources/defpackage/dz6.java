package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dz6  reason: default package */
public final class dz6 extends ffe implements a66 {
    public final /* synthetic */ a86 X;
    public final /* synthetic */ fz6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dz6(a86 a86, fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.X = a86;
        this.Y = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dz6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dz6(this.X, this.Y, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        defpackage.v3c.i(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            defpackage.od2.a0(r12)
            x76 r12 = defpackage.x76.a
            a86 r0 = r11.X
            boolean r12 = defpackage.tpa.f(r0, r12)
            if (r12 == 0) goto L_0x0014
            java.lang.Integer r11 = new java.lang.Integer
            r12 = -1
            r11.<init>(r12)
            return r11
        L_0x0014:
            java.util.List r12 = r0.d()
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
            r2 = r1
        L_0x001e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r12.next()
            u76 r3 = (defpackage.u76) r3
            fz6 r4 = r11.Y
            android.content.ContentResolver r5 = r4.o
            android.net.Uri r6 = r3.i()
            java.lang.String r4 = r3.f()
            java.lang.String[] r7 = new java.lang.String[]{r4}
            java.lang.String r8 = r0.e(r3)
            java.lang.String[] r9 = r0.a(r3)
            r10 = 0
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x0059
            int r4 = r3.getCount()     // Catch:{ all -> 0x0052 }
            r5 = 0
            defpackage.v3c.i(r3, r5)
            goto L_0x005a
        L_0x0052:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r12 = move-exception
            defpackage.v3c.i(r3, r11)
            throw r12
        L_0x0059:
            r4 = r1
        L_0x005a:
            int r2 = r2 + r4
            goto L_0x001e
        L_0x005c:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz6.o(java.lang.Object):java.lang.Object");
    }
}
