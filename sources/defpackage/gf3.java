package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: gf3  reason: default package */
public final class gf3 extends ffe implements a66 {
    public ConfirmPhoneScreen X;
    public TextView Y;
    public int Z;
    public final /* synthetic */ ConfirmPhoneScreen s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.s0 = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gf3(this.s0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007c, code lost:
        r15 = (android.view.ViewGroup) r8.getView();
        r15.removeView(r8.A0);
        r1 = new androidx.appcompat.widget.AppCompatTextView(r8.getContext(), (android.util.AttributeSet) null);
        r1.setId(defpackage.hwb.oneme_login_confirm_timer);
        defpackage.i4f.p.b(r1, defpackage.du4.b);
        r9 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        r10 = (float) 12;
        r9.setMargins(defpackage.tu0.G(defpackage.fk4.d().getDisplayMetrics().density * r10), 0, defpackage.tu0.G(r10 * defpackage.fk4.d().getDisplayMetrics().density), defpackage.tu0.G(((float) 16) * defpackage.fk4.d().getDisplayMetrics().density));
        r1.setLayoutParams(r9);
        r1.setGravity(17);
        r1.setTextColor(defpackage.qp4.u0.j(r15).getText().g);
        r1.setAlpha(0.0f);
        r8.A0 = r1;
        r15.addView(r1);
        r15 = r8.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f8, code lost:
        if (r15 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00fa, code lost:
        r1 = defpackage.v0c.oneme_login_confirm_info_loading_1;
        r14.X = r8;
        r14.Y = r15;
        r14.Z = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0107, code lost:
        if (r8.n0(r15, r1, false, r14) != r0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0109, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010a, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x010b, code lost:
        r14.X = r8;
        r14.Y = r1;
        r14.Z = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0116, code lost:
        if (defpackage.j47.x(1000, r14) != r0) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0118, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0119, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x011a, code lost:
        r15 = defpackage.v0c.oneme_login_confirm_info_loading_2;
        r14.X = r7;
        r14.Y = r1;
        r14.Z = 4;
        r8 = one.me.login.confirm.ConfirmPhoneScreen.C0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0129, code lost:
        if (r7.n0(r1, r15, false, r14) != r0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x012b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x012c, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x012d, code lost:
        r14.X = r2;
        r14.Y = r1;
        r14.Z = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0138, code lost:
        if (defpackage.j47.x(1000, r14) != r0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x013b, code lost:
        r15 = defpackage.v0c.oneme_login_confirm_info_loading_3;
        r14.X = null;
        r14.Y = null;
        r14.Z = 6;
        r3 = one.me.login.confirm.ConfirmPhoneScreen.C0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x014a, code lost:
        if (r2.n0(r1, r15, true, r14) != r0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x014f, code lost:
        return defpackage.e5f.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r14.Z
            r2 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            r6 = 0
            r7 = 0
            one.me.login.confirm.ConfirmPhoneScreen r8 = r14.s0
            switch(r1) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0040;
                case 2: goto L_0x0037;
                case 3: goto L_0x002e;
                case 4: goto L_0x0025;
                case 5: goto L_0x001c;
                case 6: goto L_0x0017;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0017:
            defpackage.od2.a0(r15)
            goto L_0x014d
        L_0x001c:
            android.widget.TextView r1 = r14.Y
            one.me.login.confirm.ConfirmPhoneScreen r2 = r14.X
            defpackage.od2.a0(r15)
            goto L_0x013b
        L_0x0025:
            android.widget.TextView r1 = r14.Y
            one.me.login.confirm.ConfirmPhoneScreen r2 = r14.X
            defpackage.od2.a0(r15)
            goto L_0x012d
        L_0x002e:
            android.widget.TextView r1 = r14.Y
            one.me.login.confirm.ConfirmPhoneScreen r7 = r14.X
            defpackage.od2.a0(r15)
            goto L_0x011a
        L_0x0037:
            android.widget.TextView r1 = r14.Y
            one.me.login.confirm.ConfirmPhoneScreen r8 = r14.X
            defpackage.od2.a0(r15)
            goto L_0x010b
        L_0x0040:
            defpackage.od2.a0(r15)
            goto L_0x007c
        L_0x0044:
            defpackage.od2.a0(r15)
            bc7[] r15 = one.me.login.confirm.ConfirmPhoneScreen.C0
            one.me.sdk.uikit.common.button.OneMeButton r15 = r8.o0()
            android.view.ViewPropertyAnimator r15 = r15.animate()
            r9 = 800(0x320, double:3.953E-321)
            android.view.ViewPropertyAnimator r15 = r15.setDuration(r9)
            android.view.ViewPropertyAnimator r15 = r15.alpha(r7)
            r15.start()
            android.widget.TextView r15 = r8.q0()
            android.view.ViewPropertyAnimator r15 = r15.animate()
            android.view.ViewPropertyAnimator r15 = r15.setDuration(r9)
            android.view.ViewPropertyAnimator r15 = r15.alpha(r7)
            r15.start()
            r14.Z = r5
            r9 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r15 = defpackage.j47.x(r9, r14)
            if (r15 != r0) goto L_0x007c
            return r0
        L_0x007c:
            android.view.View r15 = r8.getView()
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            android.widget.TextView r1 = r8.A0
            r15.removeView(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r9 = r8.getContext()
            r1.<init>(r9, r6)
            int r9 = defpackage.hwb.oneme_login_confirm_timer
            r1.setId(r9)
            kqe r9 = defpackage.i4f.p
            r9.b(r1, defpackage.du4.b)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)
            r10 = 12
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = defpackage.tu0.G(r11)
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r10 = r10 * r12
            int r10 = defpackage.tu0.G(r10)
            r12 = 16
            float r12 = (float) r12
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = defpackage.tu0.G(r12)
            r9.setMargins(r11, r2, r10, r12)
            r1.setLayoutParams(r9)
            r9 = 17
            r1.setGravity(r9)
            pq9 r9 = defpackage.qp4.u0
            fka r9 = r9.j(r15)
            xoe r9 = r9.getText()
            int r9 = r9.g
            r1.setTextColor(r9)
            r1.setAlpha(r7)
            r8.A0 = r1
            r15.addView(r1)
            android.widget.TextView r15 = r8.A0
            if (r15 == 0) goto L_0x014d
            int r1 = defpackage.v0c.oneme_login_confirm_info_loading_1
            r14.X = r8
            r14.Y = r15
            r7 = 2
            r14.Z = r7
            java.lang.Object r1 = r8.n0(r15, r1, r2, r14)
            if (r1 != r0) goto L_0x010a
            return r0
        L_0x010a:
            r1 = r15
        L_0x010b:
            r14.X = r8
            r14.Y = r1
            r15 = 3
            r14.Z = r15
            java.lang.Object r15 = defpackage.j47.x(r3, r14)
            if (r15 != r0) goto L_0x0119
            return r0
        L_0x0119:
            r7 = r8
        L_0x011a:
            int r15 = defpackage.v0c.oneme_login_confirm_info_loading_2
            r14.X = r7
            r14.Y = r1
            r8 = 4
            r14.Z = r8
            bc7[] r8 = one.me.login.confirm.ConfirmPhoneScreen.C0
            java.lang.Object r15 = r7.n0(r1, r15, r2, r14)
            if (r15 != r0) goto L_0x012c
            return r0
        L_0x012c:
            r2 = r7
        L_0x012d:
            r14.X = r2
            r14.Y = r1
            r15 = 5
            r14.Z = r15
            java.lang.Object r15 = defpackage.j47.x(r3, r14)
            if (r15 != r0) goto L_0x013b
            return r0
        L_0x013b:
            int r15 = defpackage.v0c.oneme_login_confirm_info_loading_3
            r14.X = r6
            r14.Y = r6
            r3 = 6
            r14.Z = r3
            bc7[] r3 = one.me.login.confirm.ConfirmPhoneScreen.C0
            java.lang.Object r14 = r2.n0(r1, r15, r5, r14)
            if (r14 != r0) goto L_0x014d
            return r0
        L_0x014d:
            e5f r14 = defpackage.e5f.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf3.o(java.lang.Object):java.lang.Object");
    }
}
