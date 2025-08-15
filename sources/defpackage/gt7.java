package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gt7  reason: default package */
public final class gt7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ht7 Z;
    public final /* synthetic */ kt7 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gt7(ht7 ht7, kt7 kt7, Continuation continuation) {
        super(2, continuation);
        this.Z = ht7;
        this.s0 = kt7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gt7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gt7 gt7 = new gt7(this.Z, this.s0, continuation);
        gt7.Y = obj;
        return gt7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r11.Z.g(r12.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000e, B:10:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012 A[ExcHandler: TamErrorException (r12v4 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:4:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            java.lang.Object r0 = r11.Y
            sx3 r0 = (defpackage.sx3) r0
            defpackage.od2.a0(r12)     // Catch:{ TamErrorException -> 0x0012, all -> 0x0049 }
            goto L_0x006b
        L_0x0012:
            r12 = move-exception
            goto L_0x0064
        L_0x0014:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001c:
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.Y
            sx3 r12 = (defpackage.sx3) r12
            ht7 r1 = r11.Z     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            pl r1 = r1.c     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            if (r1 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            je7 r1 = r1.j     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r4 = r1
            cu7 r4 = (defpackage.cu7) r4     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            ht7 r1 = r11.Z     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            long r5 = r1.a     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            kt7 r7 = r11.s0     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            long r8 = r1.X     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r11.Y = r12     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r11.X = r3     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            r10 = r11
            java.lang.Object r11 = r4.r(r5, r7, r8, r10)     // Catch:{ TamErrorException -> 0x0012, all -> 0x0048 }
            if (r11 != r0) goto L_0x006b
            return r0
        L_0x0048:
            r0 = r12
        L_0x0049:
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getName()
            ir6 r12 = defpackage.hm9.m
            if (r12 != 0) goto L_0x0056
            goto L_0x006b
        L_0x0056:
            boolean r0 = r12.c()
            if (r0 == 0) goto L_0x006b
            us7 r0 = defpackage.us7.s0
            java.lang.String r1 = "beans.loginLogic.onLogin fail"
            r12.d(r0, r11, r1, r2)
            goto L_0x006b
        L_0x0064:
            ht7 r11 = r11.Z
            pke r12 = r12.a
            r11.g(r12)
        L_0x006b:
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt7.o(java.lang.Object):java.lang.Object");
    }
}
