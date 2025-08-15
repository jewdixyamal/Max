package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: w96  reason: default package */
public final class w96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ zp7 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w96(z96 z96, zp7 zp7, List list, Continuation continuation) {
        super(2, continuation);
        this.X = z96;
        this.Y = zp7;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w96(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r14 = r0.c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            defpackage.od2.a0(r15)
            z96 r15 = r14.X
            d86 r0 = r15.b
            boolean r0 = r0.b
            zp7 r3 = r14.Y
            r1 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r3.w0
            r2 = 4
            if (r0 != r2) goto L_0x0014
            return r1
        L_0x0014:
            java.util.List r14 = r14.Z
            java.util.Iterator r14 = r14.iterator()
        L_0x001a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r14.next()
            r2 = r0
            r4d r2 = (defpackage.r4d) r2
            up7 r2 = r2.a
            android.net.Uri r4 = r3.b
            android.net.Uri r2 = r2.c()
            boolean r2 = defpackage.kp.e(r4, r2)
            if (r2 == 0) goto L_0x001a
            goto L_0x0037
        L_0x0036:
            r0 = r1
        L_0x0037:
            r4d r0 = (defpackage.r4d) r0
            if (r0 == 0) goto L_0x0043
            awa r14 = r0.c
            if (r14 == 0) goto L_0x0043
            android.net.Uri r14 = r14.X
            r7 = r14
            goto L_0x0044
        L_0x0043:
            r7 = r1
        L_0x0044:
            android.net.Uri r14 = r3.v0
            if (r0 == 0) goto L_0x006a
            awa r2 = r0.c
            up7 r4 = r0.a
            boolean r2 = defpackage.awa.b(r2, r4)
            if (r2 == 0) goto L_0x006a
            awa r2 = r0.c
            android.net.Uri r2 = defpackage.awa.a(r2, r4)
            if (r2 == 0) goto L_0x006a
            java.lang.String r5 = r2.getPath()
            if (r5 == 0) goto L_0x006a
            java.lang.String r4 = r4.c
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x006a
            r13 = r2
            goto L_0x006b
        L_0x006a:
            r13 = r14
        L_0x006b:
            d86 r14 = r15.b
            boolean r2 = r14.c
            w86 r14 = r15.y0
            jic r4 = r14.h
            up7 r14 = defpackage.ay7.H(r3)
            p4d r15 = r15.F0
            int r8 = r15.g(r14)
            if (r0 == 0) goto L_0x0083
            ref r14 = r0.b
            r6 = r14
            goto L_0x0084
        L_0x0083:
            r6 = r1
        L_0x0084:
            if (r0 == 0) goto L_0x008a
            awa r14 = r0.c
            r5 = r14
            goto L_0x008b
        L_0x008a:
            r5 = r1
        L_0x008b:
            u86 r14 = new u86
            long r10 = r3.a
            r9 = 1
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w96.o(java.lang.Object):java.lang.Object");
    }
}
