package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: s09  reason: default package */
public final class s09 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ s09(on5 on5, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = on5;
        this.c = messageWriteWidget;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            e5f r0 = defpackage.e5f.a
            on5 r1 = r11.b
            one.me.sdk.messagewrite.MessageWriteWidget r2 = r11.c
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            tx3 r6 = defpackage.tx3.a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r11.a
            switch(r8) {
                case 0: goto L_0x011a;
                case 1: goto L_0x00a4;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r8 = r13 instanceof defpackage.v09
            if (r8 == 0) goto L_0x0024
            r8 = r13
            v09 r8 = (defpackage.v09) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x0024
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0029
        L_0x0024:
            v09 r8 = new v09
            r8.<init>(r11, r13)
        L_0x0029:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x003c
            if (r13 != r5) goto L_0x0036
            defpackage.od2.a0(r11)
            goto L_0x00a3
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x003c:
            defpackage.od2.a0(r11)
            r11 = r12
            zy8 r11 = (defpackage.zy8) r11
            if (r11 != 0) goto L_0x0046
            r11 = r5
            goto L_0x0047
        L_0x0046:
            r11 = r3
        L_0x0047:
            bc7[] r13 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            xz8 r13 = r2.v0()
            w7c r13 = r13.J0
            j0e r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            if (r13 == 0) goto L_0x0059
            r13 = r5
            goto L_0x005a
        L_0x0059:
            r13 = r3
        L_0x005a:
            xz8 r4 = r2.v0()
            w7c r4 = r4.L0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x0069
            r3 = r5
        L_0x0069:
            if (r11 == 0) goto L_0x007f
            if (r13 == 0) goto L_0x007f
            xz8 r4 = r2.v0()
            w7c r4 = r4.J0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            dz8 r4 = (defpackage.dz8) r4
            one.me.sdk.messagewrite.MessageWriteWidget.o0(r2, r4)
            goto L_0x0094
        L_0x007f:
            if (r11 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0094
            xz8 r4 = r2.v0()
            w7c r4 = r4.L0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            xy8 r4 = (defpackage.xy8) r4
            one.me.sdk.messagewrite.MessageWriteWidget.m0(r2, r4)
        L_0x0094:
            if (r11 == 0) goto L_0x009a
            if (r13 != 0) goto L_0x00a3
            if (r3 != 0) goto L_0x00a3
        L_0x009a:
            r8.X = r5
            java.lang.Object r11 = r1.a(r12, r8)
            if (r11 != r6) goto L_0x00a3
            r0 = r6
        L_0x00a3:
            return r0
        L_0x00a4:
            boolean r8 = r13 instanceof defpackage.u09
            if (r8 == 0) goto L_0x00b5
            r8 = r13
            u09 r8 = (defpackage.u09) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x00b5
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x00ba
        L_0x00b5:
            u09 r8 = new u09
            r8.<init>(r11, r13)
        L_0x00ba:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x00cc
            if (r13 != r5) goto L_0x00c6
            defpackage.od2.a0(r11)
            goto L_0x0119
        L_0x00c6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x00cc:
            defpackage.od2.a0(r11)
            r11 = r12
            xy8 r11 = (defpackage.xy8) r11
            if (r11 != 0) goto L_0x00d6
            r11 = r5
            goto L_0x00d7
        L_0x00d6:
            r11 = r3
        L_0x00d7:
            bc7[] r13 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            xz8 r13 = r2.v0()
            w7c r13 = r13.J0
            j0e r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            if (r13 == 0) goto L_0x00e9
            r13 = r5
            goto L_0x00ea
        L_0x00e9:
            r13 = r3
        L_0x00ea:
            xz8 r4 = r2.v0()
            w7c r4 = r4.R0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x00f9
            r3 = r5
        L_0x00f9:
            if (r11 == 0) goto L_0x010a
            if (r13 != 0) goto L_0x010a
            if (r3 == 0) goto L_0x010a
            xz8 r4 = r2.v0()
            zy8 r4 = r4.v()
            one.me.sdk.messagewrite.MessageWriteWidget.n0(r2, r4)
        L_0x010a:
            if (r11 == 0) goto L_0x0110
            if (r13 != 0) goto L_0x0119
            if (r3 != 0) goto L_0x0119
        L_0x0110:
            r8.X = r5
            java.lang.Object r11 = r1.a(r12, r8)
            if (r11 != r6) goto L_0x0119
            r0 = r6
        L_0x0119:
            return r0
        L_0x011a:
            boolean r8 = r13 instanceof defpackage.r09
            if (r8 == 0) goto L_0x012b
            r8 = r13
            r09 r8 = (defpackage.r09) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x012b
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0130
        L_0x012b:
            r09 r8 = new r09
            r8.<init>(r11, r13)
        L_0x0130:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x0142
            if (r13 != r5) goto L_0x013c
            defpackage.od2.a0(r11)
            goto L_0x018f
        L_0x013c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0142:
            defpackage.od2.a0(r11)
            r11 = r12
            dz8 r11 = (defpackage.dz8) r11
            if (r11 != 0) goto L_0x014c
            r11 = r5
            goto L_0x014d
        L_0x014c:
            r11 = r3
        L_0x014d:
            bc7[] r13 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            xz8 r13 = r2.v0()
            w7c r13 = r13.L0
            j0e r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            if (r13 == 0) goto L_0x015f
            r13 = r5
            goto L_0x0160
        L_0x015f:
            r13 = r3
        L_0x0160:
            xz8 r4 = r2.v0()
            w7c r4 = r4.R0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x016f
            r3 = r5
        L_0x016f:
            if (r11 == 0) goto L_0x0180
            if (r13 != 0) goto L_0x0180
            if (r3 == 0) goto L_0x0180
            xz8 r4 = r2.v0()
            zy8 r4 = r4.v()
            one.me.sdk.messagewrite.MessageWriteWidget.n0(r2, r4)
        L_0x0180:
            if (r11 == 0) goto L_0x0186
            if (r13 != 0) goto L_0x018f
            if (r3 != 0) goto L_0x018f
        L_0x0186:
            r8.X = r5
            java.lang.Object r11 = r1.a(r12, r8)
            if (r11 != r6) goto L_0x018f
            r0 = r6
        L_0x018f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s09.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
