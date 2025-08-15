package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: d27  reason: default package */
public final class d27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d27) n((tt7) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d27 d27 = new d27(continuation, this.Y);
        d27.X = obj;
        return d27;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0093, code lost:
        r6 = defpackage.br7.E(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.X
            tt7 r7 = (defpackage.tt7) r7
            bc7[] r0 = one.me.login.inputphone.InputPhoneScreen.E0
            one.me.login.inputphone.InputPhoneScreen r6 = r6.Y
            one.me.sdk.uikit.common.button.OneMeButton r0 = r6.o0()
            r1 = 0
            r0.setProgressEnabled(r1)
            r2 = 1
            r0.setClickable(r2)
            boolean r0 = r7 instanceof defpackage.ot7
            if (r0 == 0) goto L_0x002c
            ot7 r7 = (defpackage.ot7) r7
            jqe r7 = r7.c
            android.content.Context r0 = r6.getContext()
            java.lang.CharSequence r7 = r7.b(r0)
            one.me.login.inputphone.InputPhoneScreen.n0(r6, r7)
            goto L_0x00af
        L_0x002c:
            boolean r0 = r7 instanceof defpackage.pt7
            if (r0 == 0) goto L_0x0041
            pt7 r7 = (defpackage.pt7) r7
            jqe r7 = r7.c
            android.content.Context r0 = r6.getContext()
            java.lang.CharSequence r7 = r7.b(r0)
            one.me.login.inputphone.InputPhoneScreen.n0(r6, r7)
            goto L_0x00af
        L_0x0041:
            boolean r0 = r7 instanceof defpackage.qt7
            if (r0 == 0) goto L_0x0049
            defpackage.fm9.N(r6)
            goto L_0x00af
        L_0x0049:
            boolean r0 = r7 instanceof defpackage.st7
            r3 = 0
            if (r0 == 0) goto L_0x00aa
            je7 r0 = r6.B0
            java.lang.Object r0 = r0.getValue()
            d80 r0 = (defpackage.d80) r0
            c80 r4 = new c80
            st7 r7 = (defpackage.st7) r7
            int r5 = r7.e
            r4.<init>(r5)
            r0.a(r4)
            dp3 r0 = r6.a
            r0.getClass()
            android.content.Context r0 = r6.getContext()
            jqe r4 = r7.c
            java.lang.CharSequence r0 = r4.b(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x00af
        L_0x0074:
            jqe r7 = r7.d
            if (r7 == 0) goto L_0x0080
            android.content.Context r3 = r6.getContext()
            java.lang.CharSequence r3 = r7.b(r3)
        L_0x0080:
            wha r7 = new wha
            r7.<init>((one.me.sdk.arch.Widget) r6)
            r7.h(r0)
            r7.b(r3)
            eia r0 = new eia
            android.view.View r6 = r6.getView()
            if (r6 == 0) goto L_0x009e
            java.lang.Integer r6 = defpackage.br7.E(r6)
            if (r6 == 0) goto L_0x009e
            int r6 = r6.intValue()
            goto L_0x009f
        L_0x009e:
            r6 = r1
        L_0x009f:
            r3 = 4
            r0.<init>(r2, r6, r1, r3)
            r7.c(r0)
            r7.i()
            goto L_0x00af
        L_0x00aa:
            if (r7 != 0) goto L_0x00b2
            one.me.login.inputphone.InputPhoneScreen.n0(r6, r3)
        L_0x00af:
            e5f r6 = defpackage.e5f.a
            return r6
        L_0x00b2:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d27.o(java.lang.Object):java.lang.Object");
    }
}
