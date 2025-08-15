package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: zz8  reason: default package */
public final /* synthetic */ class zz8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ zz8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [k56] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = 5
            r2 = -2
            r3 = -1
            r4 = 0
            r5 = 2
            e5f r6 = defpackage.e5f.a
            one.me.sdk.messagewrite.MessageWriteWidget r7 = r0.b
            r8 = 1
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x0078;
                case 2: goto L_0x0065;
                case 3: goto L_0x003d;
                case 4: goto L_0x0029;
                default: goto L_0x0011;
            }
        L_0x0011:
            r0 = r25
            android.net.Uri r0 = (android.net.Uri) r0
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            xz8 r1 = r7.v0()
            r1.getClass()
            hz8 r2 = new hz8
            r2.<init>(r0)
            s35 r0 = r1.z0
            defpackage.pnf.o(r0, r2)
            return r6
        L_0x0029:
            r0 = r25
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            if (r0 == 0) goto L_0x003c
            xz8 r0 = r7.v0()
            defpackage.xz8.z(r0, r5, r5)
        L_0x003c:
            return r6
        L_0x003d:
            r0 = r25
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            zz8 r1 = new zz8
            r1.<init>(r7, r4)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5)
            int r5 = defpackage.lga.w
            r4.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r5.<init>(r3, r2)
            r4.setLayoutParams(r5)
            r1.invoke(r4)
            r0.addView(r4)
            return r6
        L_0x0065:
            r0 = r25
            android.widget.EditText r0 = (android.widget.EditText) r0
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            xz7 r1 = new xz7
            y8 r2 = new y8
            r2.<init>((java.lang.Object) r7)
            r1.<init>(r0, r2)
            r7.A0 = r1
            return r1
        L_0x0078:
            r0 = r25
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            if (r0 == 0) goto L_0x00b0
            int r1 = r0.length()
            int r1 = r1 - r8
            r2 = r4
            r5 = r2
        L_0x0087:
            if (r2 > r1) goto L_0x00aa
            if (r5 != 0) goto L_0x008d
            r9 = r2
            goto L_0x008e
        L_0x008d:
            r9 = r1
        L_0x008e:
            char r9 = r0.charAt(r9)
            r10 = 32
            int r9 = defpackage.tpa.m(r9, r10)
            if (r9 > 0) goto L_0x009c
            r9 = r8
            goto L_0x009d
        L_0x009c:
            r9 = r4
        L_0x009d:
            if (r5 != 0) goto L_0x00a5
            if (r9 != 0) goto L_0x00a3
            r5 = r8
            goto L_0x0087
        L_0x00a3:
            int r2 = r2 + r8
            goto L_0x0087
        L_0x00a5:
            if (r9 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            int r1 = r1 + r3
            goto L_0x0087
        L_0x00aa:
            int r1 = r1 + r8
            java.lang.CharSequence r1 = r0.subSequence(r2, r1)
            goto L_0x00b1
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            if (r1 == 0) goto L_0x00b9
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00ba
        L_0x00b9:
            r4 = r8
        L_0x00ba:
            r1 = r4 ^ 1
            if (r1 == 0) goto L_0x00cb
            if (r0 == 0) goto L_0x00cb
            char r0 = defpackage.w9e.D0(r0)
            r1 = 10
            if (r0 != r1) goto L_0x00cb
            r7.A0()
        L_0x00cb:
            return r6
        L_0x00cc:
            r7 = r25
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            bc7[] r9 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            sv8 r9 = new sv8
            android.content.Context r10 = r7.getContext()
            r9.<init>(r10)
            android.content.Context r10 = r9.getContext()
            d09 r15 = new d09
            one.me.sdk.messagewrite.MessageWriteWidget r0 = r0.b
            xz8 r16 = r0.v0()
            java.lang.Class<xz8> r14 = defpackage.xz8.class
            java.lang.String r17 = "onEmojiClick"
            r12 = 0
            java.lang.String r18 = "onEmojiClick(ZZ)V"
            r13 = 0
            r11 = r15
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            ua6 r11 = new ua6
            r11.<init>(r8, r2)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            r2.<init>(r10, r11)
            r2.setIsLongpressEnabled(r4)
            q46 r10 = new q46
            r10.<init>(r2, r1)
            r9.setLeftInnerIconTouchListener(r10)
            r9.setRightInnerIconVisible(r8)
            android.content.Context r2 = r9.getContext()
            e11 r10 = new e11
            java.lang.String r21 = "onClickAttachPicker()V"
            r22 = 0
            r17 = 0
            java.lang.Class<one.me.sdk.messagewrite.MessageWriteWidget> r19 = one.me.sdk.messagewrite.MessageWriteWidget.class
            java.lang.String r20 = "onClickAttachPicker"
            r23 = 29
            r16 = r10
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            ua6 r11 = new ua6
            r11.<init>(r8, r10)
            android.view.GestureDetector r10 = new android.view.GestureDetector
            r10.<init>(r2, r11)
            r10.setIsLongpressEnabled(r4)
            q46 r2 = new q46
            r2.<init>(r10, r1)
            r9.setRightInnerIconTouchListener(r2)
            android.content.Context r1 = r9.getContext()
            e09 r2 = new e09
            java.lang.String r21 = "onRightOuterIconClick()V"
            r22 = 0
            r17 = 0
            java.lang.Class<one.me.sdk.messagewrite.MessageWriteWidget> r19 = one.me.sdk.messagewrite.MessageWriteWidget.class
            java.lang.String r20 = "onRightOuterIconClick"
            r23 = 0
            r16 = r2
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            e09 r10 = new e09
            java.lang.String r21 = "onSendLongClick()V"
            r22 = 0
            r17 = 0
            java.lang.Class<one.me.sdk.messagewrite.MessageWriteWidget> r19 = one.me.sdk.messagewrite.MessageWriteWidget.class
            java.lang.String r20 = "onSendLongClick"
            r23 = 1
            r16 = r10
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            om8 r11 = new om8
            java.lang.String r21 = "onTouch(Landroid/view/MotionEvent;)V"
            r22 = 0
            r17 = 1
            java.lang.Class<one.me.sdk.messagewrite.MessageWriteWidget> r19 = one.me.sdk.messagewrite.MessageWriteWidget.class
            java.lang.String r20 = "onTouch"
            r23 = 4
            r16 = r11
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            p63 r12 = new p63
            r12.<init>(r2, r5, r10)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            r2.<init>(r1, r12)
            rf1 r1 = new rf1
            r1.<init>(r11, r5, r2)
            r9.setRightOuterIconTouchListener(r1)
            je7 r1 = r0.Z
            java.lang.Object r1 = r1.getValue()
            qe5 r1 = (defpackage.qe5) r1
            se5 r1 = (defpackage.se5) r1
            boolean r1 = r1.v()
            r9.setVideoMessageEnabled(r1)
            ei1 r1 = new ei1
            r2 = 3
            r1.<init>(r2, r0)
            r9.setVideoMessageTouchListener(r1)
            je7 r1 = r0.t0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01cd
            zz8 r1 = new zz8
            r1.<init>(r0, r8)
            vf1 r2 = new vf1
            r8 = 7
            r2.<init>(r1, r8, r9)
            qv8 r1 = r9.c
            r1.addTextChangedListener(r2)
        L_0x01cd:
            b09 r1 = new b09
            r1.<init>(r4, r0)
            r9.setInputKeyListener(r1)
            zz8 r1 = new zz8
            r1.<init>(r0, r5)
            r9.setCustomSelectionActionModeCallback(r1)
            r7.addView(r9)
            w12 r0 = new w12
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            int r1 = defpackage.lga.x
            r0.setId(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r1.<init>(r3, r2)
            r2 = 80
            r1.gravity = r2
            r0.setLayoutParams(r1)
            r0.setBackgroundColor(r4)
            r7.addView(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.invoke(java.lang.Object):java.lang.Object");
    }
}
