package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: kp9  reason: default package */
public final class kp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kp9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kp9 kp9 = new kp9(continuation, this.Y);
        kp9.X = obj;
        return kp9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r2 = defpackage.br7.E(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.X
            boolean r0 = r8 instanceof defpackage.rt7
            r1 = 4
            r2 = 0
            r3 = 1
            r4 = 0
            one.me.login.neuroavatars.NeuroAvatarsScreen r7 = r7.Y
            if (r0 == 0) goto L_0x004d
            rt7 r8 = (defpackage.rt7) r8
            jqe r8 = r8.c
            dp3 r0 = r7.a
            r0.getClass()
            android.content.Context r0 = r7.getContext()
            java.lang.CharSequence r8 = r8.b(r0)
            if (r8 != 0) goto L_0x0024
            goto L_0x00b4
        L_0x0024:
            wha r0 = new wha
            r0.<init>((one.me.sdk.arch.Widget) r7)
            r0.h(r8)
            r0.b(r2)
            eia r8 = new eia
            android.view.View r2 = r7.getView()
            if (r2 == 0) goto L_0x0042
            java.lang.Integer r2 = defpackage.br7.E(r2)
            if (r2 == 0) goto L_0x0042
            int r2 = r2.intValue()
            goto L_0x0043
        L_0x0042:
            r2 = r4
        L_0x0043:
            r8.<init>(r3, r2, r4, r1)
            r0.c(r8)
            r0.i()
            goto L_0x00b4
        L_0x004d:
            boolean r0 = r8 instanceof defpackage.st7
            if (r0 == 0) goto L_0x00b4
            st7 r8 = (defpackage.st7) r8
            int r0 = r8.e
            bc7[] r5 = one.me.login.neuroavatars.NeuroAvatarsScreen.M0
            afc r5 = r7.o0()
            if (r5 != 0) goto L_0x005e
            goto L_0x006e
        L_0x005e:
            je7 r5 = r7.o
            java.lang.Object r5 = r5.getValue()
            d80 r5 = (defpackage.d80) r5
            c80 r6 = new c80
            r6.<init>(r0)
            r5.a(r6)
        L_0x006e:
            dp3 r0 = r7.a
            r0.getClass()
            android.content.Context r0 = r7.getContext()
            jqe r5 = r8.c
            java.lang.CharSequence r0 = r5.b(r0)
            if (r0 != 0) goto L_0x0080
            goto L_0x00b4
        L_0x0080:
            jqe r8 = r8.d
            if (r8 == 0) goto L_0x008c
            android.content.Context r2 = r7.getContext()
            java.lang.CharSequence r2 = r8.b(r2)
        L_0x008c:
            wha r8 = new wha
            r8.<init>((one.me.sdk.arch.Widget) r7)
            r8.h(r0)
            r8.b(r2)
            eia r0 = new eia
            android.view.View r2 = r7.getView()
            if (r2 == 0) goto L_0x00aa
            java.lang.Integer r2 = defpackage.br7.E(r2)
            if (r2 == 0) goto L_0x00aa
            int r2 = r2.intValue()
            goto L_0x00ab
        L_0x00aa:
            r2 = r4
        L_0x00ab:
            r0.<init>(r3, r2, r4, r1)
            r8.c(r0)
            r8.i()
        L_0x00b4:
            bc7[] r8 = one.me.login.neuroavatars.NeuroAvatarsScreen.M0
            r7.getClass()
            bc7[] r8 = one.me.login.neuroavatars.NeuroAvatarsScreen.M0
            r0 = 7
            r8 = r8[r0]
            q7c r0 = r7.w0
            java.lang.Object r7 = r0.T0(r7, r8)
            one.me.sdk.uikit.common.button.OneMeButton r7 = (one.me.sdk.uikit.common.button.OneMeButton) r7
            r7.setProgressEnabled(r4)
            r7.setClickable(r3)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp9.o(java.lang.Object):java.lang.Object");
    }
}
