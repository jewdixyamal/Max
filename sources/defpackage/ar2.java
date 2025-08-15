package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;

/* renamed from: ar2  reason: default package */
public final class ar2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatStatusBottomWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar2(Continuation continuation, ChatStatusBottomWidget chatStatusBottomWidget) {
        super(2, continuation);
        this.Y = chatStatusBottomWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ar2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ar2 ar2 = new ar2(continuation, this.Y);
        ar2.X = obj;
        return ar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.X
            yq2 r10 = (defpackage.yq2) r10
            bc7[] r0 = one.me.chatscreen.chatstatus.ChatStatusBottomWidget.c
            one.me.chatscreen.chatstatus.ChatStatusBottomWidget r9 = r9.Y
            r9.getClass()
            bc7[] r0 = one.me.chatscreen.chatstatus.ChatStatusBottomWidget.c
            r1 = 1
            r0 = r0[r1]
            q7c r1 = r9.b
            java.lang.Object r0 = r1.T0(r9, r0)
            one.me.sdk.uikit.common.button.OneMeButton r0 = (one.me.sdk.uikit.common.button.OneMeButton) r0
            int r1 = r10.ordinal()
            b7a r2 = defpackage.b7a.c
            c7a r3 = defpackage.c7a.c
            r4 = 3
            r5 = 0
            r6 = 12
            r7 = -1
            if (r1 == r4) goto L_0x00b8
            r4 = 4
            r8 = 6
            if (r1 == r4) goto L_0x008d
            if (r1 == r8) goto L_0x00b8
            r4 = 7
            if (r1 == r4) goto L_0x00b8
            r4 = 8
            if (r1 == r4) goto L_0x00b8
            r0.setSize(r3)
            r0.setMode(r2)
            z6a r1 = defpackage.z6a.c
            r0.setAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r7, r7)
            float r2 = (float) r6
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = defpackage.tu0.G(r3)
            float r4 = (float) r5
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = defpackage.tu0.G(r4)
            r1.setMargins(r3, r5, r2, r4)
            r0.setLayoutParams(r1)
            goto L_0x010c
        L_0x008d:
            c7a r1 = defpackage.c7a.b
            r0.setSize(r1)
            b7a r1 = defpackage.b7a.a
            r0.setMode(r1)
            z6a r1 = defpackage.z6a.o
            r0.setAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r7, r7)
            float r2 = (float) r8
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            r1.setMargins(r2, r2, r2, r2)
            r0.setLayoutParams(r1)
            goto L_0x010c
        L_0x00b8:
            r0.setSize(r3)
            r0.setMode(r2)
            z6a r1 = defpackage.z6a.a
            r0.setAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r7, r7)
            float r2 = (float) r6
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = defpackage.tu0.G(r3)
            float r4 = (float) r5
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = defpackage.tu0.G(r2)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = defpackage.tu0.G(r4)
            r1.setMargins(r3, r5, r2, r4)
            r0.setLayoutParams(r1)
        L_0x010c:
            int[] r1 = defpackage.zq2.$EnumSwitchMapping$0
            int r2 = r10.ordinal()
            r1 = r1[r2]
            iqe r2 = defpackage.jqe.a
            switch(r1) {
                case -1: goto L_0x0170;
                case 0: goto L_0x0119;
                case 1: goto L_0x0169;
                case 2: goto L_0x0161;
                case 3: goto L_0x0159;
                case 4: goto L_0x013f;
                case 5: goto L_0x0137;
                case 6: goto L_0x012f;
                case 7: goto L_0x0127;
                case 8: goto L_0x011f;
                case 9: goto L_0x0170;
                default: goto L_0x0119;
            }
        L_0x0119:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L_0x011f:
            int r1 = defpackage.u8a.p
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x0127:
            int r1 = defpackage.u8a.q
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x012f:
            int r1 = defpackage.u8a.v
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x0137:
            int r1 = defpackage.u8a.t
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x013f:
            rq2 r1 = r9.m0()
            boolean r1 = r1.v()
            if (r1 == 0) goto L_0x0151
            int r1 = defpackage.u8a.n
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x0151:
            int r1 = defpackage.u8a.o
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x0159:
            int r1 = defpackage.u8a.s
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x0161:
            int r1 = defpackage.u8a.u
            eqe r2 = new eqe
            r2.<init>(r1)
            goto L_0x0170
        L_0x0169:
            int r1 = defpackage.u8a.j
            eqe r2 = new eqe
            r2.<init>(r1)
        L_0x0170:
            android.content.Context r1 = r0.getContext()
            java.lang.CharSequence r1 = r2.b(r1)
            r0.setText((java.lang.CharSequence) r1)
            tb r1 = new tb
            r2 = 15
            r1.<init>((java.lang.Object) r9, (int) r2, (java.lang.Object) r10)
            defpackage.tu0.K(r0, 300, r1)
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar2.o(java.lang.Object):java.lang.Object");
    }
}
