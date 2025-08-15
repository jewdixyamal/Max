package one.me.login.confirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/confirm/ConfirmPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lfg3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "verifyToken", "phone", "", "codeLength", "(Ljava/lang/String;Ljava/lang/String;I)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ConfirmPhoneScreen extends Widget implements fg3, ng3 {
    public static final /* synthetic */ bc7[] C0;
    public TextView A0;
    public final w4d B0;
    public final fs X;
    public final glc Y;
    public final je7 Z;
    public final /* synthetic */ dp3 a;
    public final x27 b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public TextView y0;
    public final je7 z0;

    static {
        Class<ConfirmPhoneScreen> cls = ConfirmPhoneScreen.class;
        C0 = new bc7[]{new hob(cls, "verifyToken", "getVerifyToken()Ljava/lang/String;", 0), z7b.g(nec.a, cls, "phone", "getPhone()Ljava/lang/String;", 0), new hob(cls, "codeLength", "getCodeLength()I", 0), new hob(cls, "phoneDescTextView", "getPhoneDescTextView()Landroid/widget/TextView;", 0), new hob(cls, "timerTextView", "getTimerTextView()Landroid/widget/TextView;", 0), new hob(cls, "resendButton", "getResendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new hob(cls, "smsInputView", "getSmsInputView()Lone/me/sdk/codeinput/ConfirmSmsInputView;", 0), new oi9(cls, "loginAnimationJob", "getLoginAnimationJob()Lkotlinx/coroutines/Job;")};
    }

    public ConfirmPhoneScreen(String str, String str2, int i) {
        this(dy7.g(new kpa("screen:confirm_phone:verify_token", str), new kpa("screen:confirm_phone:phone", str2), new kpa("screen:confirm_phone:code_length", Integer.valueOf(i))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m0(one.me.login.confirm.ConfirmPhoneScreen r9, defpackage.ttd r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.ff3
            if (r0 == 0) goto L_0x0016
            r0 = r11
            ff3 r0 = (defpackage.ff3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            ff3 r0 = new ff3
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x003b
            if (r2 != r6) goto L_0x0033
            one.me.login.confirm.ConfirmPhoneScreen r9 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x0111
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            defpackage.od2.a0(r11)
            goto L_0x0071
        L_0x003f:
            defpackage.od2.a0(r11)
            boolean r11 = r10 instanceof defpackage.std
            if (r11 == 0) goto L_0x0074
            jg3 r10 = r9.p0()
            gg3 r11 = defpackage.gg3.SUCCESS
            r10.setState(r11)
            r9.u0(r4)
            r0.Z = r5
            pg7 r10 = r9.getViewLifecycleScope()
            vx3 r11 = defpackage.vx3.b
            gf3 r0 = new gf3
            r0.<init>(r9, r4)
            vxd r10 = defpackage.j47.T(r10, r4, r11, r0, r5)
            bc7[] r11 = C0
            r0 = 7
            r11 = r11[r0]
            w4d r0 = r9.B0
            r0.o1(r9, r11, r10)
            if (r3 != r1) goto L_0x0071
            goto L_0x0128
        L_0x0071:
            r1 = r3
            goto L_0x0128
        L_0x0074:
            boolean r11 = r10 instanceof defpackage.rtd
            if (r11 == 0) goto L_0x012f
            jg3 r11 = r9.p0()
            gg3 r2 = defpackage.gg3.ERROR
            r11.setState(r2)
            r9.t0()
            rtd r10 = (defpackage.rtd) r10
            tt7 r11 = r10.a
            boolean r2 = r11 instanceof defpackage.st7
            if (r2 == 0) goto L_0x00ed
            je7 r11 = r9.t0
            java.lang.Object r11 = r11.getValue()
            d80 r11 = (defpackage.d80) r11
            c80 r2 = new c80
            tt7 r10 = r10.a
            st7 r10 = (defpackage.st7) r10
            int r7 = r10.e
            r2.<init>(r7)
            r11.a(r2)
            jqe r11 = r10.c
            dp3 r2 = r9.a
            r2.getClass()
            android.content.Context r2 = r9.getContext()
            java.lang.CharSequence r11 = r11.b(r2)
            if (r11 != 0) goto L_0x00b4
            goto L_0x0104
        L_0x00b4:
            jqe r10 = r10.d
            if (r10 == 0) goto L_0x00c1
            android.content.Context r2 = r9.getContext()
            java.lang.CharSequence r10 = r10.b(r2)
            goto L_0x00c2
        L_0x00c1:
            r10 = r4
        L_0x00c2:
            wha r2 = new wha
            r2.<init>((one.me.sdk.arch.Widget) r9)
            r2.h(r11)
            r2.b(r10)
            eia r10 = new eia
            android.view.View r11 = r9.getView()
            r7 = 0
            if (r11 == 0) goto L_0x00e1
            java.lang.Integer r11 = defpackage.br7.E(r11)
            if (r11 == 0) goto L_0x00e1
            int r11 = r11.intValue()
            goto L_0x00e2
        L_0x00e1:
            r11 = r7
        L_0x00e2:
            r8 = 4
            r10.<init>(r5, r11, r7, r8)
            r2.c(r10)
            r2.i()
            goto L_0x0104
        L_0x00ed:
            boolean r10 = r11 instanceof defpackage.ot7
            if (r10 == 0) goto L_0x00f9
            ot7 r11 = (defpackage.ot7) r11
            jqe r10 = r11.c
            r9.u0(r10)
            goto L_0x0104
        L_0x00f9:
            boolean r10 = r11 instanceof defpackage.pt7
            if (r10 == 0) goto L_0x011f
            pt7 r11 = (defpackage.pt7) r11
            jqe r10 = r11.c
            r9.u0(r10)
        L_0x0104:
            r0.o = r9
            r0.Z = r6
            r10 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.j47.x(r10, r0)
            if (r10 != r1) goto L_0x0111
            goto L_0x0128
        L_0x0111:
            r9.u0(r4)
            jg3 r9 = r9.p0()
            gg3 r10 = defpackage.gg3.NORMAL
            r9.setState(r10)
            goto L_0x0071
        L_0x011f:
            boolean r10 = r11 instanceof defpackage.qt7
            if (r10 == 0) goto L_0x0129
            defpackage.fm9.N(r9)
            goto L_0x0071
        L_0x0128:
            return r1
        L_0x0129:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L_0x012f:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.m0(one.me.login.confirm.ConfirmPhoneScreen, ttd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(String str) {
        of3 r0 = r0();
        r0.getClass();
        String str2 = of3.G0;
        hm9.m(str2, "onCodeEntered", new Object[0]);
        if (str.length() == 0) {
            hm9.m0(str2, "empty sms", new Object[0]);
        } else if (!str.equals(r0.C0)) {
            r0.C0 = str;
            ContextScope contextScope = r0.a;
            nx3 b2 = ((w9a) ((kke) r0.t0.getValue())).b();
            vx3 vx3 = vx3.b;
            jf3 jf3 = new jf3(r0, str, (Continuation) null);
            bc7 bc7 = of3.F0[0];
            r0.E0.o1(r0, bc7, (vxd) r0.b.a(contextScope, b2, vx3, jf3));
        }
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.Y;
    }

    public final void h(int i, Bundle bundle) {
        if (i == hwb.oneme_login_sms_code_exceeded_ok_btn) {
            getRouter().C();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n0(android.widget.TextView r11, int r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.af3
            if (r0 == 0) goto L_0x0013
            r0 = r14
            af3 r0 = (defpackage.af3) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            af3 r0 = new af3
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            tx3 r14 = defpackage.tx3.a
            int r1 = r0.s0
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 800(0x320, double:3.953E-321)
            if (r1 == 0) goto L_0x003f
            if (r1 == r5) goto L_0x0037
            if (r1 != r4) goto L_0x002f
            defpackage.od2.a0(r10)
            goto L_0x0085
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            boolean r13 = r0.X
            android.widget.TextView r11 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x0068
        L_0x003f:
            defpackage.od2.a0(r10)
            r11.setText(r12)
            r11.setAlpha(r3)
            android.view.ViewPropertyAnimator r10 = r11.animate()
            r12 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r10 = r10.alpha(r12)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r6)
            r10.start()
            r0.o = r11
            r0.X = r13
            r0.s0 = r5
            r8 = 2800(0xaf0, double:1.3834E-320)
            java.lang.Object r10 = defpackage.j47.x(r8, r0)
            if (r10 != r14) goto L_0x0068
            return r14
        L_0x0068:
            if (r13 != 0) goto L_0x0085
            android.view.ViewPropertyAnimator r10 = r11.animate()
            android.view.ViewPropertyAnimator r10 = r10.alpha(r3)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r6)
            r10.start()
            r10 = 0
            r0.o = r10
            r0.s0 = r4
            java.lang.Object r10 = defpackage.j47.x(r6, r0)
            if (r10 != r14) goto L_0x0085
            return r14
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.n0(android.widget.TextView, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final OneMeButton o0() {
        return (OneMeButton) this.w0.T0(this, C0[5]);
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        p0().requestFocus();
        of3 r0 = r0();
        vxd vxd = r0.D0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        r0.D0 = pnf.n(r0, (lx3) null, (vx3) null, new nf3(r0, (Continuation) null), 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new ye3(this, 0)));
        linearLayout.setGravity(17);
        linearLayout.addView(cla);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(hwb.oneme_login_confirm_title);
        textView.setText(v0c.oneme_login_confirm_title);
        i4f.c.b(textView, du4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        textView.setLayoutParams(layoutParams);
        v3c.y(new v9(3, (Continuation) null, 8), textView);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(hwb.oneme_login_confirm_description);
        i4f.m.b(textView2, du4.b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        textView2.setLayoutParams(layoutParams2);
        v3c.y(new v9(3, (Continuation) null, 9), textView2);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        jg3 jg3 = new jg3(linearLayout.getContext(), (AttributeSet) null);
        jg3.setId(hwb.oneme_login_confirm_sms_input);
        jg3.setListener(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        jg3.setLayoutParams(layoutParams3);
        pla.a(jg3, new bf3(jg3, jg3, 0));
        jg3.setKeyboardOpen(new hn2(28));
        bc7 bc7 = C0[2];
        jg3.setCountCells(((Number) this.X.a(this)).intValue());
        linearLayout.setGravity(17);
        linearLayout.addView(jg3);
        Space space = new Space(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
        layoutParams4.weight = 1.0f;
        space.setLayoutParams(layoutParams4);
        linearLayout.addView(space);
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setId(hwb.oneme_login_confirm_timer);
        i4f.p.b(textView3, du4.b);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 16;
        layoutParams5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        textView3.setLayoutParams(layoutParams5);
        v3c.y(new v9(3, (Continuation) null, 7), textView3);
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(hwb.oneme_login_confirm_resend_code);
        oneMeButton.setText(v0c.oneme_login_confirm_resend);
        oneMeButton.setMode(b7a.o);
        oneMeButton.setAppearance(z6a.a);
        oneMeButton.setSize(c7a.a);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams6);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        t0();
        this.y0 = null;
        p0().setListener((fg3) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        kre kre = view instanceof kre ? (kre) view : null;
        if (kre != null) {
            kre.onThemeChanged(qp4.u0.j(view));
        }
        bc7[] bc7Arr = C0;
        bc7 bc7 = bc7Arr[3];
        Context context = getContext();
        int i = v0c.oneme_login_confirm_description;
        bc7 bc72 = bc7Arr[1];
        ((TextView) this.u0.T0(this, bc7)).setText(context.getString(i, new Object[]{(String) this.o.a(this)}));
        tu0.K(o0(), 300, new c5(21, (Object) this));
        p0().setOnAnimationEnded(new ye3(this, 1));
        od2.L(new zn5(r0().x0, new cf3(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().z0, new df3(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(r0().A0, 11), new ef3(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().w0, new vw(2, this, ConfirmPhoneScreen.class, "processSmsEvent", "processSmsEvent(Lone/me/login/confirm/SmsCodeResultEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 5), getViewLifecycleScope());
        of3 r0 = r0();
        we6 we6 = (we6) ((cud) r0.u0.getValue());
        we6.g = r0.c;
        we6.b();
    }

    public final jg3 p0() {
        return (jg3) this.x0.T0(this, C0[6]);
    }

    public final TextView q0() {
        return (TextView) this.v0.T0(this, C0[4]);
    }

    public final of3 r0() {
        return (of3) this.Z.getValue();
    }

    public final void s0(String str) {
        int i = 0;
        boolean z = str != null;
        o0().setVisibility(z ^ true ? 0 : 8);
        TextView q0 = q0();
        if (!z) {
            i = 8;
        }
        q0.setVisibility(i);
        float f = 1.0f;
        o0().setAlpha(z ? 0.0f : 1.0f);
        TextView q02 = q0();
        if (!z) {
            f = 0.0f;
        }
        q02.setAlpha(f);
        if (str != null) {
            q0().setText(((String) this.z0.getValue()) + " " + str);
        }
    }

    public final void t0() {
        bc7[] bc7Arr = C0;
        bc7 bc7 = bc7Arr[7];
        w4d w4d = this.B0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[7], (Object) null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.A0);
        }
        this.A0 = null;
        s0((String) r0().z0.a.getValue());
    }

    public final void u0(jqe jqe) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        CharSequence charSequence = null;
        float f = 0.0f;
        if (this.y0 == null && jqe != null) {
            int indexOfChild = ((ViewGroup) getView()).indexOfChild(p0());
            TextView textView = new TextView(getContext());
            i4f.p.b(textView, du4.b);
            textView.setTextColor(qp4.u0.j(textView).getText().b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f2 = (float) 12;
            layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, indexOfChild + 1);
            }
            this.y0 = textView;
        }
        if (jqe != null) {
            f = 1.0f;
        }
        TextView textView2 = this.y0;
        if (textView2 != null) {
            if (jqe != null) {
                charSequence = jqe.b(getContext());
            }
            textView2.setText(charSequence);
        }
        TextView textView3 = this.y0;
        if (textView3 != null && (animate = textView3.animate()) != null && (duration = animate.setDuration(200)) != null && (alpha = duration.alpha(f)) != null) {
            alpha.start();
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [dp3, java.lang.Object] */
    public ConfirmPhoneScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new Object();
        this.b = x27.d;
        Class<String> cls = String.class;
        this.c = new fs(cls, "screen:confirm_phone:verify_token");
        this.o = new fs(cls, "screen:confirm_phone:phone");
        this.X = new fs(Integer.class, "screen:confirm_phone:code_length");
        this.Y = new glc(new hn2(29), (k56) null, 6);
        this.Z = createViewModelLazy(of3.class, new ti2(25, new ze3(this, 0)));
        this.s0 = tu0.r(3, new ze3(this, 1));
        this.t0 = lt7.a.getAccessor().d(d80.class);
        this.u0 = viewBinding(hwb.oneme_login_confirm_description);
        this.v0 = viewBinding(hwb.oneme_login_confirm_timer);
        this.w0 = viewBinding(hwb.oneme_login_confirm_resend_code);
        this.x0 = viewBinding(hwb.oneme_login_confirm_sms_input);
        this.z0 = tu0.r(3, new ze3(this, 2));
        this.B0 = mqd.D();
    }
}
