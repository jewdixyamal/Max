package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: xn3  reason: default package */
public final class xn3 extends ffe implements a66 {
    public Collection X;
    public nz4 Y;
    public int Z;
    public final /* synthetic */ yn3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn3(yn3 yn3, Continuation continuation) {
        super(2, continuation);
        this.s0 = yn3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xn3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xn3(this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Z
            e5f r2 = defpackage.e5f.a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            yn3 r8 = r10.s0
            if (r1 == 0) goto L_0x0040
            if (r1 == r7) goto L_0x003c
            if (r1 == r6) goto L_0x0036
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            defpackage.od2.a0(r11)
            goto L_0x0094
        L_0x001e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0026:
            nz4 r1 = r10.Y
            java.util.Collection r4 = r10.X
            java.util.List r4 = (java.util.List) r4
            defpackage.od2.a0(r11)
            goto L_0x007e
        L_0x0030:
            java.util.Collection r1 = r10.X
            defpackage.od2.a0(r11)
            goto L_0x006a
        L_0x0036:
            java.util.Collection r1 = r10.X
            defpackage.od2.a0(r11)
            goto L_0x005a
        L_0x003c:
            defpackage.od2.a0(r11)
            goto L_0x004c
        L_0x0040:
            defpackage.od2.a0(r11)
            r10.Z = r7
            java.io.Serializable r11 = defpackage.yn3.c(r8, r10)
            if (r11 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            r10.X = r1
            r10.Z = r6
            java.io.Serializable r11 = defpackage.yn3.d(r8, r10)
            if (r11 != r0) goto L_0x005a
            return r0
        L_0x005a:
            java.util.Collection r11 = (java.util.Collection) r11
            r10.X = r11
            r10.Z = r5
            java.lang.Object r1 = defpackage.pag.c(r1, r10)
            if (r1 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x006a:
            java.util.List r11 = (java.util.List) r11
            nz4 r5 = defpackage.nz4.a
            r10.X = r11
            r10.Y = r5
            r10.Z = r4
            java.lang.Object r1 = defpackage.pag.c(r1, r10)
            if (r1 != r0) goto L_0x007b
            return r0
        L_0x007b:
            r4 = r11
            r11 = r1
            r1 = r5
        L_0x007e:
            java.util.List r11 = (java.util.List) r11
            dn3 r5 = new dn3
            r5.<init>(r4, r1, r11)
            q0e r11 = r8.k
            r1 = 0
            r10.X = r1
            r10.Y = r1
            r10.Z = r3
            r11.m(r1, r5)
            if (r2 != r0) goto L_0x0094
            return r0
        L_0x0094:
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.o
            r11 = 0
            r10.set(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn3.o(java.lang.Object):java.lang.Object");
    }
}
