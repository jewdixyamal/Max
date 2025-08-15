package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: j09  reason: default package */
public final class j09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((j09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j09 j09 = new j09(continuation, this.Y);
        j09.X = obj;
        return j09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r8 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (defpackage.tpa.f(r3.b, r1) == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.X
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            bc7[] r0 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            one.me.sdk.messagewrite.MessageWriteWidget r11 = r11.Y
            yce r0 = r11.w0()
            q0e r1 = r0.G0
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            q0e r0 = r0.H0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = ""
        L_0x0026:
            yce r0 = r11.w0()
            ph4 r0 = r0.o
            sv8 r2 = r11.q0()
            r0.getClass()
            java.lang.CharSequence r3 = r2.getText()
            j0e r4 = r2.getMessagePosition()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r5 = defpackage.w9e.C0(r1)
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x004f
            goto L_0x00fb
        L_0x004f:
            if (r3 == 0) goto L_0x00fb
            boolean r5 = defpackage.w9e.C0(r3)
            if (r5 == 0) goto L_0x0059
            goto L_0x00fb
        L_0x0059:
            int r1 = r1.length()
            int r5 = r3.length()
            if (r1 > r5) goto L_0x0065
            goto L_0x00fb
        L_0x0065:
            java.lang.Object r0 = r0.b
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            r0.clear()
            r0.clearSpans()
            r0.append(r3)
            int r1 = r0.length()
            java.lang.Class<mce> r3 = defpackage.mce.class
            java.lang.Object[] r1 = r0.getSpans(r6, r1, r3)
            mce[] r1 = (defpackage.mce[]) r1
            if (r1 == 0) goto L_0x009d
            int r3 = r1.length
            r5 = r6
        L_0x0082:
            if (r5 >= r3) goto L_0x0099
            r8 = r1[r5]
            int r9 = r0.getSpanStart(r8)
            int r10 = r0.getSpanEnd(r8)
            if (r9 > r4) goto L_0x0096
            if (r4 > r10) goto L_0x0096
            int r10 = r10 - r9
            if (r10 <= 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r5 = r5 + 1
            goto L_0x0082
        L_0x0099:
            r8 = r7
        L_0x009a:
            if (r8 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = r7
        L_0x009e:
            if (r8 == 0) goto L_0x00fb
            int r1 = r0.getSpanStart(r8)
            int r3 = r0.getSpanEnd(r8)
            r4 = -1
            if (r1 == r4) goto L_0x00cb
            if (r3 == r4) goto L_0x00cb
            if (r1 <= r3) goto L_0x00b0
            goto L_0x00cb
        L_0x00b0:
            java.lang.CharSequence r1 = r0.subSequence(r1, r3)
            java.lang.String r1 = r1.toString()
            rce r3 = r8.a
            java.lang.CharSequence r5 = r3.o
            boolean r5 = defpackage.tpa.f(r5, r1)
            if (r5 != 0) goto L_0x00fb
            java.lang.CharSequence r3 = r3.b
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 == 0) goto L_0x00cb
            goto L_0x00fb
        L_0x00cb:
            int r1 = r0.getSpanStart(r8)
            int r3 = r0.getSpanEnd(r8)
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            defpackage.kp.w(r0, r5, r1, r3)
            android.text.SpannableStringBuilder r0 = r0.delete(r1, r3)
            r2.setText(r0)
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L_0x00ea
            int r0 = r0.length()
            goto L_0x00eb
        L_0x00ea:
            r0 = r6
        L_0x00eb:
            if (r1 <= r4) goto L_0x00f0
            if (r1 > r0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r1 = r0
        L_0x00f1:
            l40 r0 = new l40
            r3 = 12
            r0.<init>(r1, r3, r2)
            r2.post(r0)
        L_0x00fb:
            yce r0 = r11.w0()
            sv8 r1 = r11.q0()
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L_0x010e
            java.lang.String r1 = r1.toString()
            goto L_0x010f
        L_0x010e:
            r1 = r7
        L_0x010f:
            q0e r0 = r0.G0
        L_0x0111:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r0.c(r2, r1)
            if (r2 == 0) goto L_0x0111
            yce r0 = r11.w0()
            q0e r0 = r0.K0
            r0.setValue(r7)
            xz8 r11 = r11.v0()
            je7 r0 = r11.u0
            java.lang.Object r0 = r0.getValue()
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.a()
            vx3 r1 = defpackage.vx3.b
            qz8 r2 = new qz8
            r2.<init>(r11, r12, r7)
            kotlinx.coroutines.internal.ContextScope r12 = r11.a
            vxd r12 = defpackage.j47.S(r12, r0, r1, r2)
            bc7[] r0 = defpackage.xz8.V0
            r0 = r0[r6]
            w4d r1 = r11.y0
            r1.o1(r11, r0, r12)
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j09.o(java.lang.Object):java.lang.Object");
    }
}
