package one.me.login.inputname;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/inputname/InputNameScreen;", "Lone/me/sdk/arch/Widget;", "", "Lnta;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "token", "phone", "Le8b;", "presetAvatars", "(Ljava/lang/String;Ljava/lang/String;Le8b;)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class InputNameScreen extends Widget implements nta, ng3 {
    public static final /* synthetic */ bc7[] B0;
    public final fs A0;
    public final x27 X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ dp3 a;
    public final fs b;
    public final fs c;
    public final glc o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final fs z0;

    static {
        Class<InputNameScreen> cls = InputNameScreen.class;
        B0 = new bc7[]{new hob(cls, ApiProtocol.KEY_TOKEN, "getToken()Ljava/lang/String;", 0), z7b.g(nec.a, cls, "phone", "getPhone()Ljava/lang/String;", 0), new hob(cls, "nameInput", "getNameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new hob(cls, "surnameInput", "getSurnameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new hob(cls, "buttonsContainer", "getButtonsContainer()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new oi9(cls, "nameText", "getNameText()Ljava/lang/String;"), new oi9(cls, "surnameText", "getSurnameText()Ljava/lang/String;")};
    }

    public InputNameScreen(String str, String str2, e8b e8b) {
        this(dy7.g(new kpa("screen:input_name:token", str), new kpa("screen:input_name:phone", str2), new kpa("screen:input_name:avatars", e8b)));
    }

    public final void Y(boolean z) {
        ((iu7) this.u0.getValue()).b.m((Object) null, Boolean.FALSE);
    }

    public final x27 getInsetsConfig() {
        return this.X;
    }

    public final bvc getScreenDelegate() {
        return this.o;
    }

    public final void h(int i, Bundle bundle) {
        Object obj;
        uu3 uu3;
        if (i == hwb.oneme_login_input_name_confirmation_return) {
            x37 x37 = (x37) this.s0.getValue();
            x37.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("screen:input_phone:phone", "");
            znc znc = x37.a;
            ArrayList e = znc.e();
            HashSet hashSet = new HashSet();
            Iterator it = new gkc(znc.e()).iterator();
            while (true) {
                ListIterator listIterator = ((fkc) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                coc coc = (coc) listIterator.previous();
                if (tpa.f(coc.b, "InputPhoneScreen")) {
                    break;
                }
                hashSet.add(coc);
            }
            ListIterator listIterator2 = e.listIterator(e.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator2.previous();
                if (tpa.f(((coc) obj).b, "InputPhoneScreen")) {
                    break;
                }
            }
            coc coc2 = (coc) obj;
            if (coc2 != null && (uu3 = coc2.a) != null) {
                uu3.getArgs().clear();
                uu3.getArgs().putAll(bundle2);
                e.removeAll(hashSet);
                znc.P(e, (zu3) null);
            }
        }
    }

    public final nf m0() {
        return (nf) this.y0.T0(this, B0[4]);
    }

    public final cka n0() {
        return (cka) this.w0.T0(this, B0[2]);
    }

    public final cka o0() {
        return (cka) this.x0.T0(this, B0[3]);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [android.widget.FrameLayout, nf, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ti3(-1, -1));
        cla cla = new cla(constraintLayout.getContext(), 6);
        cla.setId(hwb.oneme_login_input_name_toolbar);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new q17(this, 0)));
        constraintLayout.addView(cla);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(hwb.oneme_login_input_name_title);
        textView.setLayoutParams(new ti3(-1, -2));
        textView.setGravity(17);
        i4f.c.b(textView, du4.b);
        v3c.y(new v9(3, (Continuation) null, 12), textView);
        textView.setText(z7.B(getContext(), v0c.oneme_login_input_name_title));
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(hwb.oneme_login_input_name_description);
        textView2.setLayoutParams(new ti3(-1, -2));
        textView2.setGravity(17);
        i4f.m.b(textView2, du4.b);
        v3c.y(new v9(3, (Continuation) null, 13), textView2);
        textView2.setText(z7.B(getContext(), v0c.oneme_login_input_name_description));
        constraintLayout.addView(textView2);
        cka cka = new cka(constraintLayout.getContext());
        cka.setId(hwb.oneme_login_input_name);
        cka.setLayoutParams(new ti3(-1, -2));
        float f = (float) 76;
        cka.setMinimumHeight(tu0.G(fk4.d().getDisplayMetrics().density * f));
        cka.setHint(z7.B(getContext(), v0c.oneme_login_input_name_hint_name));
        bc7 bc7 = B0[5];
        cka.setText((String) this.z0.a(this));
        cka.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        int i = wfa.L;
        cka.setBackgroundColorAttr(Integer.valueOf(i));
        v3c.y(new xr2(3, (Continuation) null, 1), cka);
        constraintLayout.addView(cka);
        cka cka2 = new cka(constraintLayout.getContext());
        cka2.setId(hwb.oneme_login_input_surname);
        cka2.setLayoutParams(new ti3(-1, -2));
        cka2.setBackgroundColorAttr(Integer.valueOf(i));
        cka2.setMinimumHeight(tu0.G(f * fk4.d().getDisplayMetrics().density));
        cka2.setHint(z7.B(getContext(), v0c.oneme_login_input_name_hint_surname));
        cka2.setText(p0());
        cka2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        v3c.y(new xr2(3, (Continuation) null, 2), cka2);
        constraintLayout.addView(cka2);
        ? frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setClipToOutline(true);
        frameLayout.setId(hwb.oneme_login_input_name_btn_container);
        frameLayout.setLayoutParams(new ti3(-1, -2));
        frameLayout.setupDisabledButton(new pz2(27));
        frameLayout.setupActiveButton(new pz2(28));
        constraintLayout.addView(frameLayout);
        dj3 q = fp3.q(constraintLayout);
        int i2 = hwb.oneme_login_input_name_toolbar;
        q.d(i2, 6, 0, 6);
        q.d(i2, 3, 0, 3);
        q.d(i2, 7, 0, 7);
        int i3 = hwb.oneme_login_input_name_title;
        q.d(i3, 6, 0, 6);
        float f2 = (float) 12;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, i3, 4));
        q.d(i3, 3, hwb.oneme_login_input_name_toolbar, 4);
        float f3 = (float) 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, i3, 4));
        q.d(i3, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, i3, 4));
        int i4 = hwb.oneme_login_input_name_description;
        q.d(i4, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, i4, 4));
        q.d(i4, 3, hwb.oneme_login_input_name_title, 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, i4, 4));
        q.d(i4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, i4, 4));
        int i5 = hwb.oneme_login_input_name;
        q.d(i5, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, i5, 4));
        q.d(i5, 3, hwb.oneme_login_input_name_description, 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, i5, 4));
        q.d(i5, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, i5, 4));
        int i6 = hwb.oneme_login_input_surname;
        q.d(i6, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, i6, 4));
        q.d(i6, 3, hwb.oneme_login_input_name, 4);
        au1.p((float) 8, fk4.d().getDisplayMetrics().density, new l2a(q, 3, i6, 4));
        q.d(i6, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, i6, 4));
        int i7 = hwb.oneme_login_input_name_btn_container;
        q.d(i7, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, i7, 4));
        q.d(i7, 4, 0, 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 4, i7, 4));
        q.d(i7, 7, 0, 7);
        new l2a(q, 7, i7, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.a(constraintLayout);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        o0().a.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156 && getView() != null) {
            w17 q0 = q0();
            pnf.o(q0.s0, lnd.a);
        }
    }

    public final void onViewCreated(View view) {
        kre kre = view instanceof kre ? (kre) view : null;
        if (kre != null) {
            kre.onThemeChanged(qp4.u0.j(view));
        }
        m0().setActiveButtonClickListener(new p17(this, 2));
        nf m0 = m0();
        bc7 bc7 = B0[5];
        m0.setEnabled(((String) this.z0.a(this)).length() > 0);
        n0().b(new q17(this, 1));
        o0().b(new q17(this, 2));
        q0().q(p0(), o0().a.isFocused());
        o0().a.setOnFocusChangeListener(new gv8(1, new q17(this, 3)));
        i3a h = getRouter().h();
        if (h != null) {
            h.a(this.lifecycleOwner, new ru3(6, (Object) this));
        }
        m32 m32 = q0().t0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(m32, getViewLifecycleOwner().Q(), fg7), new u17((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(tu0.g(q0().Y, getViewLifecycleOwner().Q(), fg7), 17), new t17((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((iu7) this.u0.getValue()).c, getViewLifecycleOwner().Q(), fg7), new r17((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final String p0() {
        bc7 bc7 = B0[6];
        return (String) this.A0.a(this);
    }

    public final w17 q0() {
        return (w17) this.v0.getValue();
    }

    public final void r0() {
        bc7[] bc7Arr = BottomSheetWidget.x0;
        znc znc = null;
        lg3 e = wg0.e(v0c.oneme_login_input_name_confirmation_title, 6, (Bundle) null);
        int i = v0c.oneme_login_input_name_confirmation_description;
        bc7 bc7 = B0[1];
        e.f(new gqe(i, ys.m0(new Object[]{(String) this.c.a(this)})));
        e.d(hwb.oneme_login_input_name_confirmation_cancel, new eqe(v0c.oneme_login_input_name_confirmation_cancel));
        e.b(hwb.oneme_login_input_name_confirmation_return, new eqe(v0c.oneme_login_input_name_confirmation_return));
        ConfirmationBottomSheet e2 = e.e();
        e2.setTargetController(this);
        uu3 uu3 = this;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        e2.z0(this);
        if (znc != null) {
            coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [dp3, java.lang.Object] */
    public InputNameScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new Object();
        Class<String> cls = String.class;
        this.b = new fs(cls, "screen:input_name:token");
        this.c = new fs(cls, "screen:input_name:phone");
        this.o = new glc(new fh5(20), (k56) null, 6);
        this.X = x27.d;
        lt7 lt7 = lt7.a;
        this.Y = lt7.getAccessor().d(eua.class);
        this.Z = lt7.getAccessor().d(q33.class);
        this.s0 = tu0.r(3, new p17(this, 0));
        this.t0 = lt7.getAccessor().d(d80.class);
        this.u0 = m82getSharedViewModelcp94BC8("LoginScope", iu7.class, (k56) null);
        this.v0 = createViewModelLazy(w17.class, new nj4(8, new p17(this, 1)));
        this.w0 = viewBinding(hwb.oneme_login_input_name);
        this.x0 = viewBinding(hwb.oneme_login_input_surname);
        this.y0 = viewBinding(hwb.oneme_login_input_name_btn_container);
        this.z0 = new fs(cls, "", "screen:input_name:name");
        this.A0 = new fs(cls, "", "screen:input_name:surname");
    }
}
