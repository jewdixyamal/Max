package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tfe  reason: default package */
public final class tfe extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;
    public final /* synthetic */ v6f s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tfe(cge cge, v6f v6f, Continuation continuation) {
        super(2, continuation);
        this.Z = cge;
        this.s0 = v6f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tfe) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tfe tfe = new tfe(this.Z, this.s0, continuation);
        tfe.Y = obj;
        return tfe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r5 = r5.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r5 != 5) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r6 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (defpackage.h4f.b(r5) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r19 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r10 = new defpackage.yj5(r11, r4.b, r3.b, (defpackage.khe) r3.c, r3.d, r3.e, r3.a.d(defpackage.zve.class), r18, r19, r3.f);
        r5 = new defpackage.cp5(new defpackage.mqc(new defpackage.sp5(defpackage.od2.w(new defpackage.t03(new defpackage.m32(new defpackage.tj5(r10, (kotlin.coroutines.Continuation) null), defpackage.hz4.a, -2, 1, 0), 7), new defpackage.ai0(14)), new defpackage.y03(3, (kotlin.coroutines.Continuation) null, 1), (kotlin.coroutines.Continuation) null)), new defpackage.y03(r10, (kotlin.coroutines.Continuation) null));
        r0.X = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d7, code lost:
        if (defpackage.od2.y(r5, r2, r0) != r1) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r9 = 1
            if (r2 == 0) goto L_0x0018
            if (r2 != r9) goto L_0x0010
            defpackage.od2.a0(r22)
            goto L_0x00da
        L_0x0010:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0018:
            defpackage.od2.a0(r22)
            java.lang.Object r2 = r0.Y
            on5 r2 = (defpackage.on5) r2
            cge r3 = r0.Z
            je7 r3 = r3.g
            java.lang.Object r3 = r3.getValue()
            x0f r3 = (defpackage.x0f) r3
            v6f r4 = r0.s0
            java.lang.String r11 = r4.d
            d7f r5 = r4.a
            int r6 = r5.c
            int r7 = defpackage.au1.s(r6)
            r8 = 3
            r10 = 5
            switch(r7) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0053;
                case 3: goto L_0x0053;
                case 4: goto L_0x0051;
                case 5: goto L_0x004d;
                case 6: goto L_0x0053;
                case 7: goto L_0x004a;
                case 8: goto L_0x0056;
                default: goto L_0x003a;
            }
        L_0x003a:
            one.me.sdk.transfer.domain.UploadException r0 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r1 = defpackage.h4f.t(r6)
            java.lang.String r2 = "unknown http type for upload type="
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x004a:
            r18 = r10
            goto L_0x0058
        L_0x004d:
            r6 = 2
        L_0x004e:
            r18 = r6
            goto L_0x0058
        L_0x0051:
            r6 = 4
            goto L_0x004e
        L_0x0053:
            r18 = r9
            goto L_0x0058
        L_0x0056:
            r18 = r8
        L_0x0058:
            int r5 = r5.c
            if (r5 != r10) goto L_0x005e
            r6 = r9
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            r7 = 0
            if (r6 != 0) goto L_0x006c
            boolean r5 = defpackage.h4f.b(r5)
            if (r5 == 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r19 = r7
            goto L_0x0070
        L_0x006c:
            java.lang.String r5 = r4.c
            r19 = r5
        L_0x0070:
            v4 r5 = r3.a
            java.lang.Class<zve> r6 = defpackage.zve.class
            khe r17 = r5.d(r6)
            yj5 r6 = new yj5
            w0f r5 = r3.f
            je7 r10 = r3.c
            r14 = r10
            khe r14 = (defpackage.khe) r14
            java.lang.String r12 = r4.b
            kke r13 = r3.b
            je7 r15 = r3.d
            je7 r3 = r3.e
            r10 = r6
            r16 = r3
            r20 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            tj5 r4 = new tj5
            r4.<init>(r6, r7)
            m32 r10 = new m32
            hz4 r5 = defpackage.hz4.a
            r11 = -2
            r12 = 0
            r3 = r10
            r13 = r6
            r6 = r11
            r11 = r7
            r7 = r9
            r14 = r8
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            t03 r3 = new t03
            r4 = 7
            r3.<init>(r10, r4)
            ai0 r4 = new ai0
            r5 = 14
            r4.<init>(r5)
            im4 r3 = defpackage.od2.w(r3, r4)
            y03 r4 = new y03
            r5 = 1
            r4.<init>((int) r14, (kotlin.coroutines.Continuation) r11, (int) r5)
            sp5 r5 = new sp5
            r5.<init>(r3, r4, r11)
            mqc r3 = new mqc
            r3.<init>(r5)
            y03 r4 = new y03
            r4.<init>((defpackage.yj5) r13, (kotlin.coroutines.Continuation) r11)
            cp5 r5 = new cp5
            r5.<init>(r3, r4)
            r0.X = r9
            java.lang.Object r0 = defpackage.od2.y(r5, r2, r0)
            if (r0 != r1) goto L_0x00da
            return r1
        L_0x00da:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfe.o(java.lang.Object):java.lang.Object");
    }
}
