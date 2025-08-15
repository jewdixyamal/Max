package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ab2  reason: default package */
public final class ab2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ String s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ab2(zb2 zb2, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
        this.s0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ab2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ab2(this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 4
            tx3 r1 = defpackage.tx3.a
            int r2 = r11.Y
            e5f r3 = defpackage.e5f.a
            r4 = 1
            java.lang.String r5 = r11.s0
            r6 = 3
            r7 = 2
            zb2 r8 = r11.Z
            if (r2 == 0) goto L_0x0034
            if (r2 == r4) goto L_0x0030
            if (r2 == r7) goto L_0x002c
            if (r2 == r6) goto L_0x0025
            if (r2 != r0) goto L_0x001d
            defpackage.od2.a0(r12)
            goto L_0x00b3
        L_0x001d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0025:
            zb2 r8 = r11.X
            defpackage.od2.a0(r12)
            goto L_0x00a5
        L_0x002c:
            defpackage.od2.a0(r12)
            goto L_0x0094
        L_0x0030:
            defpackage.od2.a0(r12)
            goto L_0x0064
        L_0x0034:
            defpackage.od2.a0(r12)
            java.lang.String r12 = defpackage.zb2.K0
            alc r12 = r8.e()
            r11.Y = r4
            r12.getClass()
            java.lang.String r2 = "SELECT options FROM chat_folder WHERE id=? "
            xlc r2 = defpackage.xlc.a(r4, r2)
            if (r5 != 0) goto L_0x004e
            r2.W(r4)
            goto L_0x0051
        L_0x004e:
            r2.f(r4, r5)
        L_0x0051:
            android.os.CancellationSignal r9 = new android.os.CancellationSignal
            r9.<init>()
            ykc r10 = new ykc
            r10.<init>(r12, r2, r0)
            ilc r12 = r12.a
            java.lang.Object r12 = defpackage.ote.i(r12, r9, r10, r11)
            if (r12 != r1) goto L_0x0064
            return r1
        L_0x0064:
            byte[] r12 = (byte[]) r12
            java.util.Set r12 = defpackage.dy7.r(r12)
            cv5 r2 = defpackage.cv5.NO_DELETE
            boolean r12 = r12.contains(r2)
            if (r12 == 0) goto L_0x007a
            java.lang.String r11 = defpackage.zb2.K0
            java.lang.String r12 = "try to delete not deleted folder!"
            defpackage.hm9.m0(r11, r12, new java.lang.Object[0])
            return r3
        L_0x007a:
            java.lang.String r12 = defpackage.zb2.K0
            alc r12 = r8.e()
            r11.Y = r7
            r12.getClass()
            tkc r2 = new tkc
            r7 = 0
            r2.<init>(r12, r5, r7)
            ilc r12 = r12.a
            java.lang.Object r12 = defpackage.z04.e0(r12, r2, r11)
            if (r12 != r1) goto L_0x0094
            return r1
        L_0x0094:
            java.lang.String r12 = defpackage.zb2.K0
            alc r12 = r8.e()
            r11.X = r8
            r11.Y = r6
            java.lang.Object r12 = r12.d(r11)
            if (r12 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            java.util.List r12 = (java.util.List) r12
            r2 = 0
            r11.X = r2
            r11.Y = r0
            java.lang.Object r11 = defpackage.zb2.j(r8, r12, r4, r11)
            if (r11 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab2.o(java.lang.Object):java.lang.Object");
    }
}
