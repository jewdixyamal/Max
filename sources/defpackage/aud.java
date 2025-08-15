package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: aud  reason: default package */
public final class aud extends ffe implements a66 {
    public bud X;
    public a66 Y;
    public Iterator Z;
    public l17 s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ List v0;
    public final /* synthetic */ bud w0;
    public final /* synthetic */ a66 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aud(ArrayList arrayList, bud bud, shb shb, Continuation continuation) {
        super(2, continuation);
        this.v0 = arrayList;
        this.w0 = bud;
        this.x0 = shb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aud) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aud aud = new aud((ArrayList) this.v0, this.w0, (shb) this.x0, continuation);
        aud.u0 = obj;
        return aud;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.t0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            l17 r1 = r10.s0
            java.util.Iterator r5 = r10.Z
            a66 r6 = r10.Y
            bud r7 = r10.X
            java.lang.Object r8 = r10.u0
            sx3 r8 = (defpackage.sx3) r8
            defpackage.od2.a0(r11)
            goto L_0x007f
        L_0x001d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0025:
            java.lang.Object r1 = r10.u0
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r11)
            goto L_0x0050
        L_0x002d:
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.u0
            sx3 r11 = (defpackage.sx3) r11
            r1 = r11
        L_0x0035:
            boolean r11 = defpackage.j1e.z(r1)
            if (r11 == 0) goto L_0x008c
            r10.u0 = r1
            r10.X = r2
            r10.Y = r2
            r10.Z = r2
            r10.s0 = r2
            r10.t0 = r4
            r5 = 1800(0x708, double:8.893E-321)
            java.lang.Object r11 = defpackage.j47.x(r5, r10)
            if (r11 != r0) goto L_0x0050
            return r0
        L_0x0050:
            java.util.List r11 = r10.v0
            java.util.Iterator r11 = r11.iterator()
            bud r5 = r10.w0
            a66 r6 = r10.x0
            r7 = r5
            r5 = r11
        L_0x005c:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0035
            java.lang.Object r11 = r5.next()
            l17 r11 = (defpackage.l17) r11
            r10.u0 = r1
            r10.X = r7
            r10.Y = r6
            r10.Z = r5
            r10.s0 = r11
            r10.t0 = r3
            r8 = 80
            java.lang.Object r8 = defpackage.j47.x(r8, r10)
            if (r8 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r8 = r1
            r1 = r11
        L_0x007f:
            sx3 r11 = r7.a
            ztd r9 = new ztd
            r9.<init>(r6, r1, r2)
            r1 = 3
            defpackage.j47.T(r11, r2, r2, r9, r1)
            r1 = r8
            goto L_0x005c
        L_0x008c:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.o(java.lang.Object):java.lang.Object");
    }
}
