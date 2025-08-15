package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: s57  reason: default package */
public final class s57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((s57) n((k57) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s57 s57 = new s57(continuation, this.Y);
        s57.X = obj;
        return s57;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [znc] */
    /* JADX WARNING: type inference failed for: r3v3, types: [znc] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r14 = defpackage.br7.E(r14);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            defpackage.od2.a0(r15)
            java.lang.Object r15 = r14.X
            k57 r15 = (defpackage.k57) r15
            bc7[] r0 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.B0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r14 = r14.Y
            one.me.sdk.uikit.common.button.OneMeButton r0 = r14.n0()
            r1 = 0
            r0.setProgressEnabled(r1)
            r2 = 1
            r0.setClickable(r2)
            boolean r0 = r15 instanceof defpackage.g57
            if (r0 == 0) goto L_0x002c
            g57 r15 = (defpackage.g57) r15
            jqe r15 = r15.a
            android.content.Context r0 = r14.getContext()
            java.lang.CharSequence r15 = r15.b(r0)
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen.m0(r14, r15)
            goto L_0x0145
        L_0x002c:
            boolean r0 = r15 instanceof defpackage.h57
            r3 = 0
            if (r0 == 0) goto L_0x007d
            h57 r15 = (defpackage.h57) r15
            jqe r0 = r15.a
            dp3 r4 = r14.a
            r4.getClass()
            android.content.Context r4 = r14.getContext()
            java.lang.CharSequence r0 = r0.b(r4)
            if (r0 != 0) goto L_0x0046
            goto L_0x0145
        L_0x0046:
            jqe r15 = r15.b
            if (r15 == 0) goto L_0x0052
            android.content.Context r3 = r14.getContext()
            java.lang.CharSequence r3 = r15.b(r3)
        L_0x0052:
            wha r15 = new wha
            r15.<init>((one.me.sdk.arch.Widget) r14)
            r15.h(r0)
            r15.b(r3)
            eia r0 = new eia
            android.view.View r14 = r14.getView()
            if (r14 == 0) goto L_0x0070
            java.lang.Integer r14 = defpackage.br7.E(r14)
            if (r14 == 0) goto L_0x0070
            int r14 = r14.intValue()
            goto L_0x0071
        L_0x0070:
            r14 = r1
        L_0x0071:
            r3 = 4
            r0.<init>(r2, r14, r1, r3)
            r15.c(r0)
            r15.i()
            goto L_0x0145
        L_0x007d:
            boolean r0 = r15 instanceof defpackage.i57
            java.lang.String r4 = "BottomSheetWidget"
            r5 = 6
            if (r0 == 0) goto L_0x00e6
            bc7[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            int r15 = defpackage.hca.c
            lg3 r15 = defpackage.wg0.e(r15, r5, r3)
            int r0 = defpackage.hca.b
            eqe r5 = new eqe
            r5.<init>(r0)
            r15.f(r5)
            int r0 = defpackage.gca.b
            int r5 = defpackage.yoc.s0
            eqe r6 = new eqe
            r6.<init>(r5)
            r15.d(r0, r6)
            int r0 = defpackage.gca.a
            int r5 = defpackage.hca.a
            eqe r6 = new eqe
            r6.<init>(r5)
            r15.d(r0, r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r15.e()
            r8.setTargetController(r14)
            r15 = r14
        L_0x00b6:
            uu3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x00c1
            uu3 r15 = r15.getParentController()
            goto L_0x00b6
        L_0x00c1:
            boolean r0 = r15 instanceof defpackage.foc
            if (r0 == 0) goto L_0x00c8
            foc r15 = (defpackage.foc) r15
            goto L_0x00c9
        L_0x00c8:
            r15 = r3
        L_0x00c9:
            if (r15 == 0) goto L_0x00cf
            znc r3 = r15.T()
        L_0x00cf:
            r8.z0(r14)
            if (r3 == 0) goto L_0x0145
            coc r14 = new coc
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            defpackage.wg0.l(r1, r14, r2, r4)
            r3.G(r14)
            goto L_0x0145
        L_0x00e6:
            boolean r0 = r15 instanceof defpackage.j57
            if (r0 == 0) goto L_0x0140
            bc7[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.x0
            int r15 = defpackage.vfa.c
            lg3 r15 = defpackage.wg0.e(r15, r5, r3)
            int r0 = defpackage.vfa.b
            eqe r5 = new eqe
            r5.<init>(r0)
            r15.f(r5)
            int r0 = defpackage.ufa.d
            int r5 = defpackage.vfa.a
            eqe r6 = new eqe
            r6.<init>(r5)
            r15.d(r0, r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r15.e()
            r8.setTargetController(r14)
            r15 = r14
        L_0x0110:
            uu3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x011b
            uu3 r15 = r15.getParentController()
            goto L_0x0110
        L_0x011b:
            boolean r0 = r15 instanceof defpackage.foc
            if (r0 == 0) goto L_0x0122
            foc r15 = (defpackage.foc) r15
            goto L_0x0123
        L_0x0122:
            r15 = r3
        L_0x0123:
            if (r15 == 0) goto L_0x0129
            znc r3 = r15.T()
        L_0x0129:
            r8.z0(r14)
            if (r3 == 0) goto L_0x0145
            coc r14 = new coc
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            defpackage.wg0.l(r1, r14, r2, r4)
            r3.G(r14)
            goto L_0x0145
        L_0x0140:
            if (r15 != 0) goto L_0x0148
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen.m0(r14, r3)
        L_0x0145:
            e5f r14 = defpackage.e5f.a
            return r14
        L_0x0148:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s57.o(java.lang.Object):java.lang.Object");
    }
}
