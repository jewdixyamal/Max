package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: rb1  reason: default package */
public final class rb1 extends ffe implements c66 {
    public int X;
    public /* synthetic */ on5 Y;
    public /* synthetic */ Object[] Z;
    public final /* synthetic */ sx3 s0;
    public final /* synthetic */ List t0;
    public final /* synthetic */ vb1 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rb1(Continuation continuation, sx3 sx3, List list, vb1 vb1) {
        super(3, continuation);
        this.s0 = sx3;
        this.t0 = list;
        this.u0 = vb1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rb1 rb1 = new rb1((Continuation) obj3, this.s0, this.t0, this.u0);
        rb1.Y = (on5) obj;
        rb1.Z = (Object[]) obj2;
        return rb1.o(e5f.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            tx3 r1 = defpackage.tx3.a
            int r2 = r11.X
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L_0x0024
            if (r2 == r0) goto L_0x001a
            if (r2 != r3) goto L_0x0012
            defpackage.od2.a0(r12)
            goto L_0x008c
        L_0x0012:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001a:
            java.lang.Object[] r0 = r11.Z
            uj3[] r0 = (defpackage.uj3[]) r0
            on5 r2 = r11.Y
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x007e }
            goto L_0x007e
        L_0x0024:
            defpackage.od2.a0(r12)
            on5 r2 = r11.Y
            java.lang.Object[] r12 = r11.Z
            uj3[] r12 = (defpackage.uj3[]) r12
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r12.length
            r7 = 0
            r8 = r7
        L_0x0035:
            if (r7 >= r6) goto L_0x0053
            r9 = r12[r7]
            int r10 = r8 + 1
            boolean r9 = defpackage.i24.r(r9)
            if (r9 == 0) goto L_0x004a
            java.util.List r9 = r11.t0
            java.lang.Object r8 = r9.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            goto L_0x004b
        L_0x004a:
            r8 = r4
        L_0x004b:
            if (r8 == 0) goto L_0x0050
            r5.add(r8)
        L_0x0050:
            int r7 = r7 + r0
            r8 = r10
            goto L_0x0035
        L_0x0053:
            gi9 r5 = defpackage.oag.G(r5)
            boolean r6 = r5.j()
            if (r6 == 0) goto L_0x007f
            vb1 r6 = r11.u0     // Catch:{ all -> 0x007d }
            je7 r6 = r6.t0     // Catch:{ all -> 0x007d }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x007d }
            xb9 r6 = (defpackage.xb9) r6     // Catch:{ all -> 0x007d }
            int r7 = defpackage.ft4.o     // Catch:{ all -> 0x007d }
            kt4 r7 = defpackage.kt4.SECONDS     // Catch:{ all -> 0x007d }
            r8 = 5
            long r7 = defpackage.z7.R(r8, r7)     // Catch:{ all -> 0x007d }
            r11.Y = r2     // Catch:{ all -> 0x007d }
            r11.Z = r12     // Catch:{ all -> 0x007d }
            r11.X = r0     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = r6.t(r5, r7, r11)     // Catch:{ all -> 0x007d }
            if (r0 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r0 = r12
        L_0x007e:
            r12 = r0
        L_0x007f:
            r11.Y = r4
            r11.Z = r4
            r11.X = r3
            java.lang.Object r11 = r2.a(r12, r11)
            if (r11 != r1) goto L_0x008c
            return r1
        L_0x008c:
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb1.o(java.lang.Object):java.lang.Object");
    }
}
