package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ya2  reason: default package */
public final class ya2 extends ffe implements a66 {
    public boolean X;
    public zb2 Y;
    public String Z;
    public Collection s0;
    public Iterator t0;
    public Collection u0;
    public int v0;
    public final /* synthetic */ List w0;
    public final /* synthetic */ zb2 x0;
    public final /* synthetic */ boolean y0;
    public final /* synthetic */ String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ya2(List list, zb2 zb2, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.w0 = list;
        this.x0 = zb2;
        this.y0 = z;
        this.z0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ya2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ya2(this.w0, this.x0, this.y0, this.z0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.v0
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            zb2 r7 = r0.x0
            r8 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r3) goto L_0x0032
            if (r2 == r6) goto L_0x002d
            if (r2 == r5) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            defpackage.od2.a0(r18)
            goto L_0x00fb
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            zb2 r7 = r0.Y
            defpackage.od2.a0(r18)
            r2 = r18
            goto L_0x00ec
        L_0x002d:
            defpackage.od2.a0(r18)
            goto L_0x00db
        L_0x0032:
            boolean r2 = r0.X
            java.util.Collection r9 = r0.u0
            java.util.Iterator r10 = r0.t0
            java.util.Collection r11 = r0.s0
            java.lang.String r12 = r0.Z
            zb2 r13 = r0.Y
            defpackage.od2.a0(r18)
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r18
            goto L_0x009b
        L_0x0047:
            defpackage.od2.a0(r18)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r9 = r0.w0
            r10 = 10
            int r10 = defpackage.z53.S(r9, r10)
            r2.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r0.y0
            java.lang.String r11 = r0.z0
            r13 = r7
            r12 = r11
            r16 = r9
            r9 = r2
            r2 = r10
            r10 = r16
        L_0x0067:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b4
            java.lang.Object r11 = r10.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r14 = r11.longValue()
            if (r2 == 0) goto L_0x00a2
            java.lang.String r11 = defpackage.zb2.K0
            je7 r11 = r13.v0
            java.lang.Object r11 = r11.getValue()
            iy2 r11 = (defpackage.iy2) r11
            r0.Y = r13
            r0.Z = r12
            r0.s0 = r9
            r0.t0 = r10
            r0.u0 = r9
            r0.X = r2
            r0.v0 = r3
            java.lang.Object r11 = r11.d(r14, r0)
            if (r11 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r14 = r13
            r13 = r12
            r12 = r9
        L_0x009b:
            e52 r11 = (defpackage.e52) r11
            k92 r11 = r11.b
            long r3 = r11.a
            goto L_0x00a6
        L_0x00a2:
            r3 = r14
            r14 = r13
            r13 = r12
            r12 = r9
        L_0x00a6:
            v52 r11 = new v52
            r11.<init>(r3, r13)
            r9.add(r11)
            r9 = r12
            r12 = r13
            r13 = r14
            r3 = 1
            r4 = 4
            goto L_0x0067
        L_0x00b4:
            java.util.List r9 = (java.util.List) r9
            java.lang.String r2 = defpackage.zb2.K0
            alc r2 = r7.e()
            r0.Y = r8
            r0.Z = r8
            r0.s0 = r8
            r0.t0 = r8
            r0.u0 = r8
            r0.v0 = r6
            r2.getClass()
            uh r3 = new uh
            r4 = 24
            r3.<init>(r2, r4, r9)
            ilc r2 = r2.a
            java.lang.Object r2 = defpackage.ote.j(r2, r3, r0)
            if (r2 != r1) goto L_0x00db
            return r1
        L_0x00db:
            java.lang.String r2 = defpackage.zb2.K0
            alc r2 = r7.e()
            r0.Y = r7
            r0.v0 = r5
            java.lang.Object r2 = r2.d(r0)
            if (r2 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            java.util.List r2 = (java.util.List) r2
            r0.Y = r8
            r3 = 4
            r0.v0 = r3
            r3 = 1
            java.lang.Object r0 = defpackage.zb2.j(r7, r2, r3, r0)
            if (r0 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya2.o(java.lang.Object):java.lang.Object");
    }
}
