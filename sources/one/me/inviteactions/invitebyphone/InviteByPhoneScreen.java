package one.me.inviteactions.invitebyphone;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/inviteactions/invitebyphone/InviteByPhoneScreen;", "Lone/me/sdk/arch/Widget;", "Loy3;", "", "Lng3;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
public final class InviteByPhoneScreen extends Widget implements oy3, ng3 {
    public static final /* synthetic */ bc7[] B0;
    public final vf1 A0 = new vf1(this, 5);
    public final fs X = new fs(String.class, "", "screen:input_phone:phone");
    public final q7c Y = viewBinding(gca.i);
    public final q7c Z = viewBinding(gca.g);
    public final /* synthetic */ dp3 a = new Object();
    public final glc b = new glc(new fh5(28), (k56) null, 6);
    public final x27 c = x27.d;
    public final je7 o = createViewModelLazy(c67.class, new nj4(10, new fh5(29)));
    public final q7c s0 = viewBinding(gca.f);
    public final q7c t0 = viewBinding(gca.h);
    public final q7c u0 = viewBinding(gca.j);
    public AppCompatTextView v0;
    public final khe w0 = new khe(new m57(0));
    public final je7 x0 = c57.a.getAccessor().d(zua.class);
    public f47 y0;
    public final fs z0 = new fs(eaa.class, daa.b, "screen:input_phone:country_model");

    static {
        Class<InviteByPhoneScreen> cls = InviteByPhoneScreen.class;
        B0 = new bc7[]{new oi9(cls, "phone", "getPhone()Ljava/lang/String;"), z7b.g(nec.a, cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new hob(cls, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new hob(cls, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new hob(cls, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new oi9(cls, "selectedCountry", "getSelectedCountry()Lone/me/sdk/phoneutils/OneMeCountryModel;")};
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [dp3, java.lang.Object] */
    public InviteByPhoneScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m0(one.me.inviteactions.invitebyphone.InviteByPhoneScreen r8, java.lang.CharSequence r9) {
        /*
            androidx.appcompat.widget.AppCompatTextView r0 = r8.v0
            r1 = 0
            if (r0 != 0) goto L_0x0083
            if (r9 == 0) goto L_0x0083
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r8.getContext()
            r3 = 0
            r0.<init>(r2, r3)
            kqe r2 = defpackage.i4f.p
            r2.b(r0, defpackage.du4.b)
            pq9 r2 = defpackage.qp4.u0
            fka r2 = r2.j(r0)
            xoe r2 = r2.getText()
            int r2 = r2.b
            r0.setTextColor(r2)
            ti3 r2 = new ti3
            r4 = -2
            r2.<init>(r1, r4)
            r4 = 24
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.tu0.G(r5)
            r6 = 4
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = defpackage.tu0.G(r4)
            r2.setMargins(r5, r6, r4, r1)
            int r4 = defpackage.gca.h
            r2.j = r4
            r2.t = r1
            r2.v = r1
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r4)
            r0.setLayoutParams(r2)
            android.view.View r2 = r8.getView()
            boolean r4 = r2 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x007c
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            r3.addView(r0)
        L_0x0081:
            r8.v0 = r0
        L_0x0083:
            androidx.appcompat.widget.AppCompatTextView r0 = r8.v0
            if (r0 == 0) goto L_0x008a
            r0.setText(r9)
        L_0x008a:
            androidx.appcompat.widget.AppCompatTextView r8 = r8.v0
            if (r8 == 0) goto L_0x00a4
            r0 = 1
            if (r9 == 0) goto L_0x009a
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r9 = r1
            goto L_0x009b
        L_0x009a:
            r9 = r0
        L_0x009b:
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r1 = 8
        L_0x00a1:
            r8.setVisibility(r1)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.inviteactions.invitebyphone.InviteByPhoneScreen.m0(one.me.inviteactions.invitebyphone.InviteByPhoneScreen, java.lang.CharSequence):void");
    }

    public final void K(eaa eaa) {
        p0().x0.m((Object) null, eaa);
    }

    public final x27 getInsetsConfig() {
        return this.c;
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final void h(int i, Bundle bundle) {
        if (i == ufa.d) {
            getRouter().C();
        } else if (i == gca.b) {
            c67 p0 = p0();
            p0.getClass();
            bc7[] bc7Arr = c67.F0;
            bc7 bc7 = bc7Arr[2];
            w4d w4d = p0.B0;
            x77 x77 = (x77) w4d.T0(p0, bc7);
            if (x77 == null || !x77.isActive()) {
                w4d.o1(p0, bc7Arr[2], pnf.n(p0, ((w9a) ((kke) p0.Z.getValue())).c(), (vx3) null, new a67(p0, (Continuation) null), 2));
            }
        }
    }

    public final OneMeButton n0() {
        return (OneMeButton) this.s0.T0(this, B0[3]);
    }

    public final lea o0() {
        return (lea) this.t0.T0(this, B0[4]);
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        o0().postDelayed(new q57(0, this), 200);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r57 r57 = new r57(this, getContext());
        cla cla = new cla(r57.getContext(), 6);
        int i = gca.j;
        cla.setId(i);
        ti3 ti3 = new ti3(-1, -2);
        ti3.i = 0;
        ti3.t = 0;
        ti3.v = 0;
        cla.setLayoutParams(ti3);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new jy2(21, this)));
        r57.addView(cla);
        AppCompatTextView appCompatTextView = new AppCompatTextView(r57.getContext(), (AttributeSet) null);
        int i2 = gca.i;
        appCompatTextView.setId(i2);
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setText(hca.j);
        ti3 ti32 = new ti3(0, -2);
        float f = (float) 28;
        float f2 = (float) 24;
        ti32.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti32.j = i;
        ti32.t = 0;
        ti32.v = 0;
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(ti32);
        r57.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(r57.getContext(), (AttributeSet) null);
        int i3 = gca.g;
        appCompatTextView2.setId(i3);
        i4f.m.b(appCompatTextView2, du4.b);
        appCompatTextView2.setText(hca.h);
        ti3 ti33 = new ti3(0, -2);
        float f3 = (float) 12;
        ti33.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        ti33.j = i2;
        ti33.t = 0;
        ti33.v = 0;
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(ti33);
        r57.addView(appCompatTextView2);
        lea lea = new lea(r57.getContext());
        lea.setId(gca.h);
        ti3 ti34 = new ti3(0, -2);
        ti34.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), 0);
        ti34.j = i3;
        ti34.t = 0;
        ti34.v = 0;
        lea.setLayoutParams(ti34);
        lea.setPhoneFormatterProvider(new d74(this, 18, lea));
        lea.setOnCountryViewClickListener(new es3(27, this));
        r57.addView(lea);
        OneMeButton oneMeButton = new OneMeButton(r57.getContext(), (AttributeSet) null);
        oneMeButton.setId(gca.f);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        ti3 ti35 = new ti3(0, -2);
        ti35.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        ti35.l = 0;
        ti35.t = 0;
        ti35.v = 0;
        oneMeButton.setLayoutParams(ti35);
        oneMeButton.setText(hca.g);
        r57.addView(oneMeButton);
        return r57;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.v0 = null;
        lea o0 = o0();
        o0.w0.removeTextChangedListener(this.y0);
        this.y0 = null;
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        mr0.I(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        kre kre = view instanceof kre ? (kre) view : null;
        if (kre != null) {
            kre.onThemeChanged(qp4.u0.j(view));
        }
        lea o0 = o0();
        bc7[] bc7Arr = B0;
        boolean z = false;
        bc7 bc7 = bc7Arr[0];
        fs fsVar = this.X;
        o0.setText((String) fsVar.a(this));
        OneMeButton n0 = n0();
        bc7 bc72 = bc7Arr[0];
        if (((String) fsVar.a(this)).length() > 0) {
            z = true;
        }
        n0.setEnabled(z);
        tu0.K(n0(), 300, new xx5(5, this));
        bc7 bc73 = bc7Arr[6];
        K((eaa) this.z0.a(this));
        o0().w0.addTextChangedListener(this.A0);
        s35 s35 = p0().u0;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, Q, fg7), new p57((Continuation) null, this), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(p0().t0, getViewLifecycleOwner().Q(), fg7), new o57((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().w0, this.lifecycleOwner.Q(), fg7), new s57((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().y0, getViewLifecycleOwner().Q(), fg7), new n57((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final c67 p0() {
        return (c67) this.o.getValue();
    }
}
