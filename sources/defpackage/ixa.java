package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: ixa  reason: default package */
public final class ixa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ixa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ixa) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ixa ixa = new ixa(this.Y, continuation);
        ixa.X = obj;
        return ixa;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b9, code lost:
        r1 = defpackage.br7.v(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.X
            java.util.Set r11 = (java.util.Set) r11
            int r11 = r11.size()
            bc7[] r2 = one.me.startconversation.channel.PickSubscribersScreen.z0
            one.me.startconversation.channel.PickSubscribersScreen r10 = r10.Y
            one.me.sdk.uikit.common.button.OneMeButton r2 = r10.x0()
            r3 = 20000(0x4e20, float:2.8026E-41)
            r4 = 0
            khe r5 = r10.v0
            if (r11 != 0) goto L_0x0030
            int r6 = defpackage.aja.d
            r2.setText((int) r6)
            r2.c(r4, r1)
            hxa r6 = new hxa
            r6.<init>(r10, r0)
            defpackage.tu0.K(r2, 300, r6)
            r2.setEnabled(r1)
            goto L_0x0061
        L_0x0030:
            java.lang.Object r6 = r5.getValue()
            y7d r6 = (defpackage.y7d) r6
            qyc r6 = (defpackage.qyc) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f72maxparticipants
            long r8 = (long) r3
            long r6 = r6.q(r7, r8)
            int r6 = (int) r6
            if (r11 <= r6) goto L_0x0049
            r2.setEnabled(r0)
            goto L_0x0061
        L_0x0049:
            int r6 = defpackage.r8a.Q
            r2.setText((int) r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            r2.c(r6, r1)
            r2.setEnabled(r1)
            hxa r6 = new hxa
            r6.<init>(r10, r1)
            defpackage.tu0.K(r2, 300, r6)
        L_0x0061:
            java.lang.Object r1 = r5.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f72maxparticipants
            long r6 = (long) r3
            long r8 = r1.q(r2, r6)
            int r1 = (int) r8
            if (r11 <= r1) goto L_0x00f4
            vha r11 = r10.w0
            if (r11 == 0) goto L_0x007d
            r11.a()
        L_0x007d:
            wha r11 = new wha
            r11.<init>((one.me.sdk.arch.Widget) r10)
            int r1 = defpackage.aja.c
            java.lang.Object r3 = r5.getValue()
            y7d r3 = (defpackage.y7d) r3
            qyc r3 = (defpackage.qyc) r3
            r3.getClass()
            long r2 = r3.q(r2, r6)
            int r2 = (int) r2
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            gqe r3 = new gqe
            java.util.List r2 = defpackage.ys.m0(r2)
            r3.<init>(r1, r2)
            r11.g(r3)
            kia r1 = new kia
            int r2 = defpackage.woc.u1
            r1.<init>(r2)
            r11.e(r1)
            android.view.View r1 = r10.getView()
            if (r1 == 0) goto L_0x00c4
            java.lang.Integer r1 = defpackage.br7.v(r1)
            if (r1 == 0) goto L_0x00c4
            int r1 = r1.intValue()
            goto L_0x00c5
        L_0x00c4:
            r1 = r0
        L_0x00c5:
            eia r2 = new eia
            one.me.sdk.uikit.common.button.OneMeButton r3 = r10.x0()
            int r3 = r3.getMeasuredHeight()
            if (r1 != 0) goto L_0x00e5
            one.me.sdk.uikit.common.button.OneMeButton r1 = r10.x0()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r5 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x00e0
            r4 = r1
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x00e0:
            if (r4 == 0) goto L_0x00e5
            int r1 = r4.bottomMargin
            goto L_0x00e6
        L_0x00e5:
            r1 = r0
        L_0x00e6:
            int r3 = r3 + r1
            r1 = 3
            r2.<init>(r0, r0, r3, r1)
            r11.c(r2)
            vha r11 = r11.i()
            r10.w0 = r11
        L_0x00f4:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.o(java.lang.Object):java.lang.Object");
    }
}
