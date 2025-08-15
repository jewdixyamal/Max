package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: lk3  reason: default package */
public final class lk3 extends ConstraintLayout implements kre {
    public static final /* synthetic */ bc7[] h1;
    public final s5a G0;
    public final AppCompatTextView H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0 = tu0.r(3, new md1(24, this));
    public final kk3 R0 = new kk3(this, 0);
    public final kk3 S0 = new kk3(this, 1);
    public final kk3 T0 = new kk3(this, 2);
    public final kk3 U0 = new kk3(this, 3);
    public final je7 V0 = tu0.r(3, new e11(0, this, lk3.class, "linesWithCallButtons", "linesWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 13));
    public final je7 W0 = tu0.r(3, new e11(0, this, lk3.class, "lineWithCallButtons", "lineWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 9));
    public final gic X0 = nu0.L(new e11(0, this, lk3.class, "singleLineWithoutButton", "singleLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 11));
    public final je7 Y0 = tu0.r(3, new e11(0, this, lk3.class, "singleLineWithButton", "singleLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 8));
    public final je7 Z0 = tu0.r(3, new e11(0, this, lk3.class, "singleLineWithoutAvatar", "singleLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 10));
    public final gic a1 = nu0.L(new e11(0, this, lk3.class, "twoLineWithoutButton", "twoLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 15));
    public final gic b1 = nu0.L(new e11(0, this, lk3.class, "twoLineWithoutButtonWithBigAvatar", "twoLineWithoutButtonWithBigAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 16));
    public final je7 c1 = tu0.r(3, new e11(0, this, lk3.class, "twoLineWithButton", "twoLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 12));
    public final je7 d1 = tu0.r(3, new e11(0, this, lk3.class, "twoLineWithoutAvatar", "twoLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 14));
    public final je7 e1 = tu0.r(3, new e11(0, this, lk3.class, "allWithRadioButton", "allWithRadioButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 17));
    public final int f1;
    public int g1;

    static {
        Class<lk3> cls = lk3.class;
        h1 = new bc7[]{new oi9(cls, "isSelectionEnabled", "isSelectionEnabled()Z"), rh4.g(nec.a, cls, "isContactSelected", "isContactSelected()Z"), new oi9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new oi9(cls, "callButtonMode", "getCallButtonMode()Lone/me/common/contact/ContactCellView$Companion$CallButtonMode;")};
    }

    public lk3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s5a s5a = new s5a(context);
        s5a.setId(xoc.A);
        s5a.setAvatarShape(j5a.a);
        this.G0 = s5a;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(xoc.F);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
        i4f.j.b(appCompatTextView, du4.b);
        appCompatTextView.setSingleLine();
        this.H0 = appCompatTextView;
        this.I0 = tu0.r(3, new ik3(context, this, 1));
        this.J0 = tu0.r(3, new ik3(context, this, 2));
        this.K0 = tu0.r(3, new ik3(context, this, 3));
        this.L0 = tu0.r(3, new ik3(context, this, 4));
        this.M0 = tu0.r(3, new ik3(context, this, 5));
        this.N0 = tu0.r(3, new ik3(context, this, 6));
        this.O0 = tu0.r(3, new a5(context, 29));
        this.P0 = tu0.r(3, new ik3(context, this, 0));
        int G = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        this.f1 = G;
        int G2 = tu0.G(((float) 60) * fk4.d().getDisplayMetrics().density);
        this.g1 = G;
        float f = (float) 12;
        float f2 = (float) 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        addView(s5a, new ti3(G, G));
        ti3 ti3 = new ti3(-2, tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density));
        ti3.E = 0.0f;
        addView(appCompatTextView, ti3);
        setLayoutParams(new ti3(-1, G2));
        J();
    }

    public static final dj3 A(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3.H0;
        int id2 = appCompatTextView.getId();
        dj3.d(id2, 3, 0, 3);
        dj3.d(id2, 4, lk3.getMessageView().getId(), 3);
        dj3.d(id2, 6, s5a.getId(), 7);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        dj3.d(id2, 7, lk3.getButtonAudioCallView().getId(), 6);
        new l2a(dj3, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3.g(id2).d.l0 = true;
        int id3 = lk3.getMessageView().getId();
        dj3.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p((float) 2, fk4.d().getDisplayMetrics().density, new l2a(dj3, 3, id3, 4));
        dj3.d(id3, 4, 0, 4);
        dj3.d(id3, 6, s5a.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id3, 4));
        dj3.d(id3, 7, lk3.getButtonAudioCallView().getId(), 6);
        new l2a(dj3, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3.g(id3).d.l0 = true;
        int id4 = lk3.getButtonAudioCallView().getId();
        dj3.d(id4, 3, 0, 3);
        dj3.d(id4, 4, 0, 4);
        dj3.d(id4, 7, lk3.getButtonVideoCallView().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 7, id4, 4));
        int id5 = lk3.getButtonVideoCallView().getId();
        dj3.d(id5, 3, 0, 3);
        dj3.d(id5, 4, 0, 4);
        dj3.d(id5, 7, 0, 7);
        return dj3;
    }

    public static final dj3 B(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        int id2 = lk3.H0.getId();
        dj3.d(id2, 3, 0, 3);
        dj3.d(id2, 4, 0, 4);
        dj3.d(id2, 6, s5a.getId(), 7);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        dj3.d(id2, 7, lk3.getIconInfoView().getId(), 6);
        new l2a(dj3, 7, id2, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3.g(id2).d.l0 = true;
        int id3 = lk3.getIconInfoView().getId();
        dj3.d(id3, 3, 0, 3);
        dj3.d(id3, 4, 0, 4);
        dj3.d(id3, 7, lk3.getButtonView().getId(), 6);
        int id4 = lk3.getButtonView().getId();
        dj3.d(id4, 3, 0, 3);
        dj3.d(id4, 4, 0, 4);
        dj3.d(id4, 7, 0, 7);
        return dj3;
    }

    public static final dj3 C(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3.H0;
        int id2 = appCompatTextView.getId();
        dj3.d(id2, 3, 0, 3);
        dj3.d(id2, 4, 0, 4);
        dj3.d(id2, 6, s5a.getId(), 7);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        je7 je7 = lk3.J0;
        if (br7.H(je7)) {
            dj3.d(id2, 7, lk3.getAliasView().getId(), 6);
            au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 7, id2, 4));
        } else {
            dj3.d(id2, 7, 0, 7);
            new l2a(dj3, 7, id2, 4).e(0);
        }
        dj3.g(id2).d.l0 = true;
        if (br7.H(je7)) {
            int id3 = lk3.getAliasView().getId();
            dj3.d(id3, 3, appCompatTextView.getId(), 3);
            dj3.d(id3, 4, appCompatTextView.getId(), 4);
            dj3.d(id3, 7, 0, 7);
            new l2a(dj3, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
            dj3.g(id3).d.l0 = true;
        }
        return dj3;
    }

    public static final dj3 E(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3.H0;
        int id2 = appCompatTextView.getId();
        dj3.d(id2, 3, 0, 3);
        dj3.d(id2, 4, lk3.getMessageView().getId(), 3);
        dj3.d(id2, 6, s5a.getId(), 7);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        dj3.d(id2, 7, lk3.getIconInfoView().getId(), 6);
        new l2a(dj3, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3.g(id2).d.l0 = true;
        int id3 = lk3.getMessageView().getId();
        dj3.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p((float) 2, fk4.d().getDisplayMetrics().density, new l2a(dj3, 3, id3, 4));
        dj3.d(id3, 4, 0, 4);
        dj3.d(id3, 6, s5a.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id3, 4));
        dj3.d(id3, 7, lk3.getIconInfoView().getId(), 6);
        new l2a(dj3, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3.g(id3).d.l0 = true;
        int id4 = lk3.getIconInfoView().getId();
        dj3.d(id4, 3, 0, 3);
        dj3.d(id4, 4, 0, 4);
        dj3.d(id4, 7, lk3.getButtonView().getId(), 6);
        int id5 = lk3.getButtonView().getId();
        dj3.d(id5, 3, 0, 3);
        dj3.d(id5, 4, 0, 4);
        dj3.d(id5, 7, 0, 7);
        return dj3;
    }

    public static final dj3 F(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        AppCompatTextView appCompatTextView = lk3.H0;
        int id = appCompatTextView.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, lk3.getMessageView().getId(), 3);
        dj3.d(id, 6, 0, 6);
        new l2a(dj3, 6, id, 4).e(0);
        dj3.d(id, 7, 0, 7);
        new l2a(dj3, 7, id, 4).e(0);
        dj3.g(id).d.l0 = true;
        int id2 = lk3.getMessageView().getId();
        dj3.d(id2, 3, appCompatTextView.getId(), 4);
        au1.p((float) 2, fk4.d().getDisplayMetrics().density, new l2a(dj3, 3, id2, 4));
        dj3.d(id2, 4, 0, 4);
        dj3.d(id2, 6, 0, 6);
        new l2a(dj3, 6, id2, 4).e(0);
        dj3.d(id2, 7, 0, 7);
        new l2a(dj3, 7, id2, 4).e(0);
        dj3.g(id2).d.l0 = true;
        return dj3;
    }

    public static final dj3 G(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = lk3.H0;
        int id2 = appCompatTextView.getId();
        dj3.d(id2, 3, 0, 3);
        dj3.d(id2, 4, lk3.getMessageView().getId(), 3);
        dj3.d(id2, 6, s5a.getId(), 7);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        je7 je7 = lk3.J0;
        if (br7.H(je7)) {
            dj3.d(id2, 7, lk3.getAliasView().getId(), 6);
            au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 7, id2, 4));
        } else {
            dj3.d(id2, 7, 0, 7);
            new l2a(dj3, 7, id2, 4).e(0);
        }
        dj3.g(id2).d.l0 = true;
        int id3 = lk3.getMessageView().getId();
        dj3.d(id3, 3, appCompatTextView.getId(), 4);
        au1.p((float) 2, fk4.d().getDisplayMetrics().density, new l2a(dj3, 3, id3, 4));
        dj3.d(id3, 4, 0, 4);
        dj3.d(id3, 6, s5a.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id3, 4));
        dj3.d(id3, 7, 0, 7);
        new l2a(dj3, 7, id3, 4).e(0);
        dj3.g(id3).d.l0 = true;
        if (br7.H(je7)) {
            int id4 = lk3.getAliasView().getId();
            dj3.d(id4, 3, appCompatTextView.getId(), 3);
            dj3.d(id4, 4, lk3.getMessageView().getId(), 4);
            dj3.d(id4, 7, 0, 7);
            new l2a(dj3, 7, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
            dj3.g(id4).d.l0 = true;
        }
        return dj3;
    }

    public static final dj3 I(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        dj3.g(id).d.b = lk3.g1;
        dj3.g(id).d.c = lk3.g1;
        AppCompatTextView appCompatTextView = lk3.H0;
        sh0 sh0 = new sh0(appCompatTextView.getId(), 4, (Object) dj3);
        sh0.G(0);
        sh0.f(lk3.getMessageView().getId());
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, sh0.C(s5a.getId()));
        je7 je7 = lk3.J0;
        if (br7.H(je7)) {
            au1.p(f, fk4.d().getDisplayMetrics().density, sh0.p(lk3.getAliasView().getId()));
        } else {
            sh0.n(0).e(0);
        }
        sh0.h();
        sh0.I();
        int id2 = lk3.getMessageView().getId();
        dj3.d(id2, 3, appCompatTextView.getId(), 4);
        au1.p((float) 2, fk4.d().getDisplayMetrics().density, new l2a(dj3, 3, id2, 4));
        dj3.d(id2, 4, 0, 4);
        dj3.d(id2, 6, s5a.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        dj3.d(id2, 7, 0, 7);
        new l2a(dj3, 7, id2, 4).e(0);
        dj3.g(id2).d.l0 = true;
        if (br7.H(je7)) {
            int id3 = lk3.getAliasView().getId();
            dj3.d(id3, 3, appCompatTextView.getId(), 3);
            dj3.d(id3, 4, lk3.getMessageView().getId(), 4);
            dj3.d(id3, 7, 0, 7);
            new l2a(dj3, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
            dj3.g(id3).d.l0 = true;
        }
        return dj3;
    }

    public static /* synthetic */ void S(lk3 lk3, Integer num, b7a b7a, k56 k56, int i) {
        if ((i & 2) != 0) {
            b7a = b7a.b;
        }
        lk3.R(num, b7a, z6a.c, k56);
    }

    private final TextView getAliasView() {
        return (TextView) this.J0.getValue();
    }

    private final AppCompatImageView getButtonAudioCallView() {
        return (AppCompatImageView) this.N0.getValue();
    }

    private final AppCompatImageView getButtonVideoCallView() {
        return (AppCompatImageView) this.M0.getValue();
    }

    private final OneMeButton getButtonView() {
        return (OneMeButton) this.L0.getValue();
    }

    private final StateListDrawable getCheckboxDrawable() {
        return (StateListDrawable) this.O0.getValue();
    }

    private final ImageView getIconInfoView() {
        return (ImageView) this.K0.getValue();
    }

    private final TextView getMessageView() {
        return (TextView) this.I0.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.Q0.getValue();
    }

    private final dj3 getSingleLineWithButtonConstraint() {
        return (dj3) this.Y0.getValue();
    }

    private final dj3 getSingleLineWithCallButtonConstraint() {
        return (dj3) this.W0.getValue();
    }

    private final dj3 getSingleLineWithoutAvatarConstraint() {
        return (dj3) this.Z0.getValue();
    }

    private final dj3 getTwoLineWithButtonConstraint() {
        return (dj3) this.c1.getValue();
    }

    private final dj3 getTwoLineWithCallButtonConstraint() {
        return (dj3) this.V0.getValue();
    }

    private final dj3 getTwoLineWithoutAvatarConstraint() {
        return (dj3) this.d1.getValue();
    }

    private final dj3 getWithRadioButtonConstraint() {
        return (dj3) this.e1.getValue();
    }

    public static AppCompatCheckBox w(Context context, lk3 lk3) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, (AttributeSet) null);
        appCompatCheckBox.setId(xoc.C);
        appCompatCheckBox.setPadding(0, 0, 0, 0);
        appCompatCheckBox.setButtonDrawable((Drawable) null);
        appCompatCheckBox.setBackground(lk3.getCheckboxDrawable());
        appCompatCheckBox.setClickable(false);
        float f = (float) 24;
        lk3.addView(appCompatCheckBox, new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        return appCompatCheckBox;
    }

    public static final void x(lk3 lk3) {
        if (br7.H(lk3.P0)) {
            lk3.getWithRadioButtonConstraint().a(lk3);
        } else {
            lk3.J();
        }
    }

    public static final dj3 y(lk3 lk3) {
        lk3.getClass();
        dj3 dj3 = new dj3();
        dj3.c(lk3);
        s5a s5a = lk3.G0;
        int id = s5a.getId();
        dj3.d(id, 3, 0, 3);
        dj3.d(id, 4, 0, 4);
        dj3.d(id, 6, 0, 6);
        int id2 = lk3.H0.getId();
        dj3.d(id2, 3, 0, 3);
        dj3.d(id2, 4, 0, 4);
        dj3.d(id2, 6, s5a.getId(), 7);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 6, id2, 4));
        dj3.d(id2, 7, lk3.getButtonAudioCallView().getId(), 6);
        new l2a(dj3, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        dj3.g(id2).d.l0 = true;
        int id3 = lk3.getButtonAudioCallView().getId();
        dj3.d(id3, 3, 0, 3);
        dj3.d(id3, 4, 0, 4);
        dj3.d(id3, 7, lk3.getButtonVideoCallView().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3, 7, id3, 4));
        int id4 = lk3.getButtonVideoCallView().getId();
        dj3.d(id4, 3, 0, 3);
        dj3.d(id4, 4, 0, 4);
        dj3.d(id4, 7, 0, 7);
        return dj3;
    }

    public final void J() {
        CharSequence text;
        boolean z = false;
        boolean z2 = this.G0.getVisibility() == 0;
        boolean z3 = br7.H(this.I0) && (text = getMessageView().getText()) != null && !w9e.C0(text);
        boolean H = br7.H(this.L0);
        if (br7.H(this.M0) || br7.H(this.N0)) {
            z = true;
        }
        ((z3 || !z) ? z ? getTwoLineWithCallButtonConstraint() : (z2 || z3) ? !z2 ? getTwoLineWithoutAvatarConstraint() : (z3 || H) ? (z3 || !H) ? (!z3 || H || this.g1 == this.f1) ? (!z3 || H) ? getTwoLineWithButtonConstraint() : (dj3) this.a1.getValue() : (dj3) this.b1.getValue() : getSingleLineWithButtonConstraint() : (dj3) this.X0.getValue() : getSingleLineWithoutAvatarConstraint() : getSingleLineWithCallButtonConstraint()).a(this);
    }

    public final boolean K(String str) {
        return (str == null || str.length() == 0 || getMessageView().getPaint().measureText(str) <= ((float) getMessageView().getMeasuredWidth())) ? false : true;
    }

    public final boolean M(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        AppCompatTextView appCompatTextView = this.H0;
        return appCompatTextView.getPaint().measureText(str) > ((float) appCompatTextView.getMeasuredWidth());
    }

    public final void N() {
        if (br7.H(this.L0)) {
            getButtonView().setOnClickListener((View.OnClickListener) null);
            getButtonView().setVisibility(8);
        }
        if (br7.H(this.N0)) {
            getButtonAudioCallView().setOnClickListener((View.OnClickListener) null);
            getButtonAudioCallView().setVisibility(8);
        }
        if (br7.H(this.M0)) {
            getButtonVideoCallView().setOnClickListener((View.OnClickListener) null);
            getButtonVideoCallView().setVisibility(8);
        }
        J();
    }

    public final void O(long j, CharSequence charSequence, String str) {
        s5a.i(this.G0, str, Long.valueOf(j), charSequence);
    }

    public final void P(CharSequence charSequence, k56 k56) {
        OneMeButton buttonView = getButtonView();
        buttonView.setText(charSequence);
        tu0.K(buttonView, 300, new m6(6, k56));
        buttonView.setVisibility(0);
        buttonView.setMode(b7a.o);
        buttonView.setAppearance(z6a.a);
        buttonView.setSize(c7a.b);
        J();
    }

    public final void Q(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, m56 m56) {
        AppCompatImageView buttonAudioCallView = getButtonAudioCallView();
        tu0.K(buttonAudioCallView, 300, new hk3(2, m56));
        buttonAudioCallView.setImageDrawable(layerDrawable);
        float f = (float) 0;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        buttonAudioCallView.setPadding(G, G, G, G);
        buttonAudioCallView.setVisibility(0);
        AppCompatImageView buttonVideoCallView = getButtonVideoCallView();
        tu0.K(buttonVideoCallView, 300, new hk3(3, m56));
        buttonVideoCallView.setImageDrawable(layerDrawable2);
        int G2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        buttonVideoCallView.setPadding(G2, G2, G2, G2);
        buttonVideoCallView.setVisibility(0);
        T();
        J();
    }

    public final void R(Integer num, b7a b7a, z6a z6a, k56 k56) {
        if (num == null) {
            je7 je7 = this.L0;
            if (je7.a()) {
                ((OneMeButton) je7.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        OneMeButton buttonView = getButtonView();
        bc7[] bc7Arr = OneMeButton.B0;
        buttonView.d(num, true);
        tu0.K(buttonView, 300, new m6(5, k56));
        buttonView.setVisibility(0);
        buttonView.setMode(b7a);
        buttonView.setAppearance(z6a);
        buttonView.setSize(c7a.b);
        J();
    }

    public final void T() {
        int i;
        int i2;
        fka customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = qp4.u0.j(this);
        }
        je7 je7 = this.N0;
        if (je7.a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7.getValue();
            int ordinal = getCallButtonMode().ordinal();
            if (ordinal == 0) {
                i2 = customTheme.getIcon().f;
            } else if (ordinal == 1) {
                i2 = customTheme.getIcon().e;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i2));
        }
        je7 je72 = this.M0;
        if (je72.a()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) je72.getValue();
            int ordinal2 = getCallButtonMode().ordinal();
            if (ordinal2 == 0) {
                i = customTheme.getIcon().f;
            } else if (ordinal2 == 1) {
                i = customTheme.getIcon().c;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final View getAnchorButton() {
        return getButtonView();
    }

    public final jk3 getCallButtonMode() {
        bc7 bc7 = h1[3];
        return (jk3) this.U0.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7 = h1[2];
        return (fka) this.T0.b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onMeasure(int i, int i2) {
        if (qqe.c(this.H0)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(fka fka) {
        fka customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = fka;
        }
        this.G0.onThemeChanged(customTheme);
        getIconInfoView().setImageTintList(ColorStateList.valueOf(-1));
        this.H0.setTextColor(customTheme.getText().e);
        je7 je7 = this.I0;
        if (je7.a()) {
            ((TextView) je7.getValue()).setTextColor(customTheme.getText().g);
        }
        je7 je72 = this.J0;
        if (je72.a()) {
            ((TextView) je72.getValue()).setTextColor(customTheme.getText().g);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(customTheme.d().a.a.h));
        T();
        je7 je73 = this.P0;
        if (je73.a()) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) je73.getValue();
            a14.g(getCheckboxDrawable(), fka);
        }
    }

    public final void setAlias(CharSequence charSequence) {
        CharSequence text;
        if ((charSequence != null && !w9e.C0(charSequence)) || getAliasView().getVisibility() == 0) {
            boolean H = br7.H(this.I0);
            c32 c32 = c32.Y;
            if (!H || (text = getMessageView().getText()) == null || w9e.C0(text)) {
                this.X0.b = c32;
            } else {
                this.a1.b = c32;
            }
            getAliasView().setText(charSequence);
            TextView aliasView = getAliasView();
            int i = 0;
            if (!(!(charSequence == null || w9e.C0(charSequence)))) {
                i = 8;
            }
            aliasView.setVisibility(i);
            J();
        }
    }

    public final void setCallButtonMode(jk3 jk3) {
        this.U0.o1(this, h1[3], jk3);
    }

    public final void setCallButtons(m56 m56) {
        tu0.K(getButtonAudioCallView(), 300, new hk3(0, m56));
        tu0.K(getButtonVideoCallView(), 300, new hk3(1, m56));
        getButtonAudioCallView().setVisibility(0);
        getButtonAudioCallView().setVisibility(0);
        J();
    }

    public final void setContactSelected(boolean z) {
        this.S0.o1(this, h1[1], Boolean.valueOf(z));
    }

    public final void setCustomTheme(fka fka) {
        this.T0.o1(this, h1[2], fka);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setIconInfo(Integer num) {
        if (num == null) {
            je7 je7 = this.K0;
            if (je7.a()) {
                ((ImageView) je7.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ImageView iconInfoView = getIconInfoView();
        iconInfoView.setImageResource(num.intValue());
        iconInfoView.setVisibility(0);
        J();
    }

    public final void setMessage(CharSequence charSequence) {
        if ((charSequence != null && !w9e.C0(charSequence)) || br7.H(this.I0)) {
            getMessageView().setText(charSequence);
            TextView messageView = getMessageView();
            int i = 0;
            if (!(!(charSequence == null || w9e.C0(charSequence)))) {
                i = 8;
            }
            messageView.setVisibility(i);
            J();
        }
    }

    public final void setName(CharSequence charSequence) {
        this.H0.setText(charSequence);
        J();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setBackground(onClickListener != null ? getRippleDrawable() : null);
    }

    public final void setOnline(boolean z) {
        this.G0.setOnlineBadgeVisibility(z);
    }

    public final void setSelectionEnabled(boolean z) {
        this.R0.o1(this, h1[0], Boolean.valueOf(z));
    }

    public final void setVerified(boolean z) {
        ecf ecf;
        AppCompatTextView appCompatTextView = this.H0;
        int I = i24.I(qqe.e(appCompatTextView));
        int i = 0;
        if (z) {
            ecf a = qqe.a(appCompatTextView);
            if ((a != null ? a.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a2 = qqe.a(appCompatTextView);
            if (a2 != null) {
                i = a2.a;
            }
            if (i != I) {
                ecf = new ecf(getContext(), I, new pz2(6));
                qqe.d(appCompatTextView, ecf);
            }
        }
        ecf = null;
        qqe.d(appCompatTextView, ecf);
    }

    public final void setName(int i) {
        this.H0.setText(i);
        J();
    }
}
