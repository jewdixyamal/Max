package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zr3  reason: default package */
public final class zr3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ as3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr3(as3 as3, Continuation continuation) {
        super(2, continuation);
        this.Y = as3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zr3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zr3(this.Y, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: nn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: nn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: nn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: nn3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x001a
            if (r2 != r4) goto L_0x0012
            defpackage.od2.a0(r18)
            goto L_0x0108
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001a:
            defpackage.od2.a0(r18)
            as3 r2 = r0.Y
            x3c r5 = r2.a
            java.lang.Object r5 = r5.Y
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5
            java.lang.Object r5 = r5.get()
            java.util.Set r5 = (java.util.Set) r5
            java.util.List r5 = defpackage.x53.D0(r5)
            je7 r6 = r2.b
            java.lang.Object r6 = r6.getValue()
            qn3 r6 = (defpackage.qn3) r6
            j0e r6 = r6.a()
            java.lang.Object r6 = r6.getValue()
            dn3 r6 = (defpackage.dn3) r6
            boolean r7 = r6.b()
            if (r7 == 0) goto L_0x0048
            return r3
        L_0x0048:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r5.size()
            r10 = 0
        L_0x0057:
            if (r10 >= r9) goto L_0x00f2
            java.lang.Object r11 = r5.get(r10)
            gza r11 = (defpackage.gza) r11
            fza r12 = r11.b
            int[] r13 = defpackage.yr3.$EnumSwitchMapping$0
            int r12 = r12.ordinal()
            r12 = r13[r12]
            long r14 = r11.a
            if (r12 == r4) goto L_0x00ac
            r11 = 2
            if (r12 == r11) goto L_0x0074
            r16 = r5
            goto L_0x00eb
        L_0x0074:
            java.util.List r11 = r6.a
            if (r11 == 0) goto L_0x009d
            java.util.Iterator r11 = r11.iterator()
        L_0x007c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0097
            java.lang.Object r12 = r11.next()
            r13 = r12
            nn3 r13 = (defpackage.nn3) r13
            r16 = r5
            long r4 = r13.a
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0093
            r13 = r12
            goto L_0x009a
        L_0x0093:
            r5 = r16
            r4 = 1
            goto L_0x007c
        L_0x0097:
            r16 = r5
            r13 = 0
        L_0x009a:
            nn3 r13 = (defpackage.nn3) r13
            goto L_0x00a0
        L_0x009d:
            r16 = r5
            r13 = 0
        L_0x00a0:
            if (r13 == 0) goto L_0x00eb
            long r4 = r13.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7.add(r4)
            goto L_0x00eb
        L_0x00ac:
            r16 = r5
            java.util.List r4 = r6.c
            if (r4 == 0) goto L_0x00ce
            java.util.Iterator r4 = r4.iterator()
        L_0x00b6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r4.next()
            r11 = r5
            nn3 r11 = (defpackage.nn3) r11
            long r11 = r11.a
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x00b6
            goto L_0x00cb
        L_0x00ca:
            r5 = 0
        L_0x00cb:
            nn3 r5 = (defpackage.nn3) r5
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            if (r5 == 0) goto L_0x00eb
            uua r4 = new uua
            java.lang.CharSequence r11 = r5.b
            java.lang.String r11 = r11.toString()
            android.net.Uri r12 = r5.Z
            if (r12 == 0) goto L_0x00e2
            java.lang.String r13 = r12.toString()
            goto L_0x00e3
        L_0x00e2:
            r13 = 0
        L_0x00e3:
            long r14 = r5.a
            r4.<init>(r14, r11, r13)
            r8.add(r4)
        L_0x00eb:
            int r10 = r10 + 1
            r5 = r16
            r4 = 1
            goto L_0x0057
        L_0x00f2:
            qp3 r4 = new qp3
            r4.<init>(r7, r8)
            kld r2 = r2.f
            ur3 r5 = new ur3
            r5.<init>(r4)
            r4 = 1
            r0.X = r4
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L_0x0108
            return r1
        L_0x0108:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr3.o(java.lang.Object):java.lang.Object");
    }
}
