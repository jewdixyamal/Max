package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ksf  reason: default package */
public final class ksf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ byte[] Y;
    public final /* synthetic */ lsf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ksf(lsf lsf, Continuation continuation, byte[] bArr) {
        super(2, continuation);
        this.Y = bArr;
        this.Z = lsf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ksf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ksf(this.Z, continuation, this.Y);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            tx3 r1 = defpackage.tx3.a
            int r2 = r12.X
            if (r2 == 0) goto L_0x0016
            if (r2 != r0) goto L_0x000e
            defpackage.od2.a0(r13)
            goto L_0x0092
        L_0x000e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0016:
            defpackage.od2.a0(r13)
            r13 = 0
            lsf r2 = r12.Z
            byte[] r3 = r12.Y
            if (r3 == 0) goto L_0x0079
            android.animation.IntEvaluator r4 = defpackage.r70.F0
            r70 r4 = r2.getWaveView()
            int r4 = r4.getPeaksCount()
            int r5 = r3.length
            if (r5 != 0) goto L_0x002e
            goto L_0x007a
        L_0x002e:
            byte[] r5 = new byte[r4]
            r6 = 0
            r7 = r6
        L_0x0032:
            if (r7 >= r4) goto L_0x0077
            if (r7 == 0) goto L_0x0070
            int r8 = r3.length
            if (r8 != r0) goto L_0x003a
            goto L_0x0070
        L_0x003a:
            int r8 = r4 + -1
            if (r7 != r8) goto L_0x0043
            int r8 = r3.length
            int r8 = r8 - r0
            byte r8 = r3[r8]
            goto L_0x0072
        L_0x0043:
            float r8 = (float) r7
            float r9 = (float) r4
            float r8 = r8 / r9
            int r9 = r3.length
            int r9 = r9 - r0
            float r9 = (float) r9
            float r8 = r8 * r9
            int r9 = (int) r8
            int r10 = r9 + 1
            int r11 = r3.length
            int r11 = r11 - r0
            if (r9 >= r11) goto L_0x006e
            int r11 = r3.length
            int r11 = r11 - r0
            if (r10 >= r11) goto L_0x006e
            float r11 = (float) r9
            float r8 = r8 - r11
            byte r9 = r3[r9]
            byte r10 = r3[r10]
            android.animation.IntEvaluator r11 = defpackage.r70.F0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r8 = r11.evaluate(r8, r9, r10)
            int r8 = r8.intValue()
            goto L_0x0072
        L_0x006e:
            r8 = r6
            goto L_0x0072
        L_0x0070:
            byte r8 = r3[r6]
        L_0x0072:
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r7 + r0
            goto L_0x0032
        L_0x0077:
            r3 = r5
            goto L_0x007a
        L_0x0079:
            r3 = r13
        L_0x007a:
            kke r4 = r2.getDispatchers()
            w9a r4 = (defpackage.w9a) r4
            cx7 r4 = r4.c()
            jsf r5 = new jsf
            r5.<init>(r2, r13, r3)
            r12.X = r0
            java.lang.Object r12 = defpackage.j47.t0(r4, r5, r12)
            if (r12 != r1) goto L_0x0092
            return r1
        L_0x0092:
            e5f r12 = defpackage.e5f.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksf.o(java.lang.Object):java.lang.Object");
    }
}
