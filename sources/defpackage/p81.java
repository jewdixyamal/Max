package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: p81  reason: default package */
public final class p81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p81(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.Y = callHistoryScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p81) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p81 p81 = new p81(continuation, this.Y);
        p81.X = obj;
        return p81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            defpackage.od2.a0(r18)
            java.lang.Object r2 = r0.X
            ls1 r2 = (defpackage.ls1) r2
            bc7[] r3 = one.me.calllist.ui.CallHistoryScreen.C0
            one.me.calllist.ui.CallHistoryScreen r0 = r0.Y
            r0.getClass()
            bc7[] r3 = one.me.calllist.ui.CallHistoryScreen.C0
            r4 = 4
            r4 = r3[r4]
            q7c r5 = r0.t0
            java.lang.Object r4 = r5.T0(r0, r4)
            qy0 r4 = (defpackage.qy0) r4
            boolean r5 = r2.b
            r13 = 0
            if (r5 == 0) goto L_0x0025
            r5 = r13
            goto L_0x0027
        L_0x0025:
            r5 = 8
        L_0x0027:
            r4.setVisibility(r5)
            r4 = 5
            r5 = r3[r4]
            q7c r6 = r0.u0
            java.lang.Object r5 = r6.T0(r0, r5)
            qy0 r5 = (defpackage.qy0) r5
            boolean r6 = r2.b
            java.util.List r15 = r2.a
            if (r6 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            boolean r6 = r15.isEmpty()
            if (r6 != 0) goto L_0x0044
        L_0x0042:
            r6 = r13
            goto L_0x0046
        L_0x0044:
            r6 = 8
        L_0x0046:
            r5.setVisibility(r6)
            y8 r5 = r0.x0
            r5.a = r15
            androidx.viewpager2.widget.ViewPager2 r5 = r0.m0()
            f81 r7 = r0.y0
            java.util.List r6 = r7.x0
            boolean r6 = r6.isEmpty()
            r12 = 1
            if (r6 == 0) goto L_0x006e
            boolean r6 = r15.isEmpty()
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x006e
            r7.x0 = r15
            int r5 = r15.size()
            r7.p(r13, r5)
            r1 = r12
            goto L_0x00a1
        L_0x006e:
            b81 r6 = new b81
            java.util.List r8 = r7.x0
            r6.<init>(r1, r8, r15)
            wj4 r6 = defpackage.lz7.e(r6)
            a81 r10 = new a81
            r10.<init>(r7, r15, r6, r1)
            x5 r11 = new x5
            r6 = 23
            r11.<init>(r6, r7)
            boolean r6 = r5.isInLayout()
            if (r6 == 0) goto L_0x009d
            cy0 r9 = new cy0
            r16 = 1
            r6 = r9
            r8 = r5
            r14 = r9
            r9 = r13
            r1 = r12
            r12 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.post(r14)
            goto L_0x00a1
        L_0x009d:
            r1 = r12
            r10.invoke()
        L_0x00a1:
            r5 = 2
            r6 = r3[r5]
            q7c r7 = r0.Z
            java.lang.Object r6 = r7.T0(r0, r6)
            wja r6 = (defpackage.wja) r6
            boolean r7 = r15.isEmpty()
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x00b5
            r7 = r13
            goto L_0x00b7
        L_0x00b5:
            r7 = 8
        L_0x00b7:
            r6.setVisibility(r7)
            androidx.viewpager2.widget.ViewPager2 r6 = r0.m0()
            boolean r7 = r15.isEmpty()
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x00c7
            r7 = r13
            goto L_0x00c9
        L_0x00c7:
            r7 = 8
        L_0x00c9:
            r6.setVisibility(r7)
            boolean r6 = r15.isEmpty()
            android.view.View r7 = r0.requireView()
            int r8 = defpackage.pvb.call_history_empty
            android.view.View r7 = r7.findViewById(r8)
            if (r7 == 0) goto L_0x00de
            r12 = r1
            goto L_0x00df
        L_0x00de:
            r12 = r13
        L_0x00df:
            r7 = 7
            q7c r8 = r0.w0
            if (r6 == 0) goto L_0x0172
            if (r12 != 0) goto L_0x0164
            r6 = r3[r13]
            q7c r9 = r0.X
            java.lang.Object r6 = r9.T0(r0, r6)
            androidx.coordinatorlayout.widget.CoordinatorLayout r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r6
            aba r9 = new aba
            android.content.Context r10 = r0.getContext()
            r11 = 0
            r9.<init>(r10, r11)
            int r10 = defpackage.pvb.call_history_empty
            r9.setId(r10)
            rw3 r10 = new rw3
            r12 = -1
            r10.<init>((int) r12, (int) r12)
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r12 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r12.<init>()
            r10.b(r12)
            r9.setLayoutParams(r10)
            int r10 = defpackage.woc.f0
            r9.setIcon(r10)
            int r10 = defpackage.c0c.call_history_call_history_empty_title
            eqe r12 = new eqe
            r12.<init>(r10)
            r9.setTitle(r12)
            int r10 = defpackage.c0c.call_history_call_history_empty_subtitle
            eqe r12 = new eqe
            r12.<init>(r10)
            r9.setSubtitle(r12)
            u81 r10 = r0.n0()
            je7 r10 = r10.Y
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x014e
            android.content.Context r10 = r9.getContext()
            int r12 = defpackage.c0c.call_history_call_contact_action
            java.lang.String r10 = r10.getString(r12)
            y20 r12 = new y20
            r14 = 3
            r12.<init>(r14)
            r9.x(r10, r12)
        L_0x014e:
            x27 r10 = new x27
            yq0 r12 = new yq0
            r12.<init>(r4, r5, r1)
            r4 = 0
            r10.<init>(r4, r12, r1)
            defpackage.br7.d(r9, r10, r11)
            r1 = 8
            r9.setVisibility(r1)
            defpackage.br7.b(r6, r9, -1)
        L_0x0164:
            r1 = r3[r7]
            java.lang.Object r1 = r8.T0(r0, r1)
            aba r1 = (defpackage.aba) r1
            r1.setVisibility(r13)
        L_0x016f:
            r4 = 8
            goto L_0x0181
        L_0x0172:
            if (r12 == 0) goto L_0x016f
            r1 = r3[r7]
            java.lang.Object r1 = r8.T0(r0, r1)
            aba r1 = (defpackage.aba) r1
            r4 = 8
            r1.setVisibility(r4)
        L_0x0181:
            r1 = 6
            r1 = r3[r1]
            q7c r3 = r0.v0
            java.lang.Object r0 = r3.T0(r0, r1)
            x8a r0 = (defpackage.x8a) r0
            boolean r1 = r2.c
            if (r1 == 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r13 = r4
        L_0x0192:
            r0.setVisibility(r13)
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p81.o(java.lang.Object):java.lang.Object");
    }
}
