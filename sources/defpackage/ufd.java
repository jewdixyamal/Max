package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ufd  reason: default package */
public final class ufd extends ConstraintLayout implements kre, mkc {
    public static final /* synthetic */ bc7[] a1;
    public final je7 G0;
    public final tfd H0;
    public final je7 I0;
    public final ImageView J0;
    public final je7 K0;
    public final LinearLayout L0;
    public final LinearLayout M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final je7 R0;
    public qfd S0;
    public final ShapeDrawable T0;
    public final RippleDrawable U0;
    public final je7 V0 = tu0.r(3, new hbc(20));
    public jfd W0 = jfd.b;
    public final sfd X0;
    public final sfd Y0;
    public boolean Z0;

    static {
        Class<ufd> cls = ufd.class;
        a1 = new bc7[]{new oi9(cls, "modelItem", "getModelItem()Lone/me/sdk/sections/SettingsItem;"), rh4.g(nec.a, cls, "themeDepended", "getThemeDepended()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent$Companion$ThemeDependedType;")};
    }

    public ufd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new nfd(context, this, 1));
        tfd tfd = new tfd(context, attributeSet, this);
        this.H0 = tfd;
        this.I0 = tu0.r(3, new nfd(context, this, 2));
        ImageView imageView = new ImageView(context);
        imageView.setId(pga.f);
        float f = (float) 36;
        imageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        rh4.p((float) 6, fk4.d().getDisplayMetrics().density, imageView);
        this.J0 = imageView;
        this.K0 = tu0.r(3, new xda(context, 27));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(pga.i);
        linearLayout.setLayoutParams(new ti3(tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388627);
        this.L0 = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(pga.d);
        linearLayout2.setLayoutParams(new ti3(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setOnTouchListener(new q46(new GestureDetector(context, new q00(16, this)), 7));
        this.M0 = linearLayout2;
        this.N0 = tu0.r(3, new nfd(context, this, 3));
        this.O0 = tu0.r(3, new nfd(context, this, 4));
        this.P0 = tu0.r(3, new nfd(context, this, 5));
        this.Q0 = tu0.r(3, new nfd(context, this, 6));
        this.R0 = tu0.r(3, new nfd(context, this, 0));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.T0 = shapeDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this).d().a.a.h), (Drawable) null, shapeDrawable);
        this.U0 = rippleDrawable;
        kfd.V.getClass();
        this.X0 = new sfd(yed.b, this);
        this.Y0 = new sfd(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        addView(imageView);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout.addView(tfd);
        G();
    }

    public static AppCompatTextView A(Context context, ufd ufd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(pga.e);
        i4f.m.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(rfd.$EnumSwitchMapping$0[ufd.W0.ordinal()] == 1 ? ufd.getCurrentTheme().d().c.b.e : ufd.getCurrentTheme().getText().g);
        LinearLayout linearLayout = ufd.M0;
        ti3 ti3 = new ti3(-2, -2);
        ti3.setMarginEnd(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density));
        linearLayout.addView(appCompatTextView, ti3);
        return appCompatTextView;
    }

    public static final void E(ufd ufd, kfd kfd) {
        Drawable drawable;
        ufd.getClass();
        ufd.setTitle(kfd.getTitle());
        Integer f = kfd.f();
        CharSequence charSequence = null;
        if (f != null) {
            drawable = kt3.b(ufd.getContext(), f.intValue());
        } else {
            drawable = null;
        }
        ufd.setStartIcon(drawable);
        ufd.setDescription(kfd.b());
        ufd.setCounter(kfd.c());
        jqe d = kfd.d();
        if (d != null) {
            charSequence = d.b(ufd.getContext());
        }
        ufd.setUpperText(charSequence);
        ufd.setEndView(kfd.e());
        ufd.setStartIconPadding(kfd.q());
        kfd.getItemId();
        ufd.setType(ufd.getModelItem().getType());
        ufd.setAvatar(kfd.s());
        ufd.G();
        ufd.requestLayout();
        ufd.invalidate();
    }

    public static void F(LinearLayout linearLayout, je7 je7) {
        if (!je7.a()) {
            return;
        }
        if (((View) je7.getValue()).getVisibility() == 0) {
            br7.b(linearLayout, (View) je7.getValue(), -1);
        } else {
            linearLayout.removeView((View) je7.getValue());
        }
    }

    /* access modifiers changed from: private */
    public final fka getCurrentTheme() {
        int ordinal = getThemeDepended().ordinal();
        pq9 pq9 = qp4.u0;
        if (ordinal == 0) {
            return pq9.j(this);
        }
        if (ordinal == 1) {
            return pq9.p(this).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    public final Matrix getTitleGradientMatrix() {
        return (Matrix) this.V0.getValue();
    }

    private final void setAvatar(wed wed) {
        s5a s5a = (s5a) this.K0.getValue();
        s5a.setVisibility(wed != null ? 0 : 8);
        String str = wed != null ? wed.a : null;
        uc0 uc0 = wed != null ? wed.b : null;
        s5a.setAvatarUrl(str);
        s5a.g(uc0, true);
        br7.b(this, s5a, (Integer) null);
    }

    private final void setupCounter(bfd bfd) {
        boolean f = tpa.f(bfd, zed.a);
        je7 je7 = this.R0;
        if (f) {
            caa caa = (caa) je7.getValue();
            caa.setVisibility(0);
            caa.setAppearance(x9a.o);
            caa.h();
        } else if (bfd instanceof afd) {
            caa caa2 = (caa) je7.getValue();
            caa2.setVisibility(0);
            afd afd = (afd) bfd;
            caa2.setAppearance(afd.c);
            caa2.g(afd.a, afd.b);
        } else if (bfd != null) {
            throw new NoWhenBranchMatchedException();
        } else if (je7.a()) {
            ((caa) je7.getValue()).setVisibility(8);
        }
    }

    private final void setupDescription(CharSequence charSequence) {
        TextView textView = (TextView) this.I0.getValue();
        int i = 0;
        if (!(charSequence != null)) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        br7.b(this.L0, textView, (Integer) null);
    }

    private final void setupEndText(CharSequence charSequence) {
        je7 je7 = this.P0;
        if (je7.a()) {
            ((tja) je7.getValue()).setVisibility(8);
        }
        je7 je72 = this.O0;
        if (je72.a()) {
            ((AppCompatImageView) je72.getValue()).setVisibility(8);
        }
        je7 je73 = this.Q0;
        if (je73.a()) {
            ((ofa) je73.getValue()).setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.N0.getValue();
        appCompatTextView.setId(pga.n);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void setupUpperText(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.G0.getValue();
        appCompatTextView.setVisibility(charSequence != null ? 0 : 8);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
        br7.b(this.L0, appCompatTextView, 0);
    }

    public static AppCompatImageView w(Context context, ufd ufd) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(pga.c);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), woc.G0));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(ufd.getCurrentTheme().getIcon().j));
        ufd.M0.addView(appCompatImageView);
        return appCompatImageView;
    }

    public static AppCompatTextView x(Context context, ufd ufd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(pga.h);
        appCompatTextView.setLayoutParams(new ti3(-2, -2));
        i4f.p.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(ufd.getCurrentTheme().getText().g);
        ufd.L0.addView(appCompatTextView, 0);
        return appCompatTextView;
    }

    public static AppCompatTextView y(Context context, ufd ufd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(pga.b);
        appCompatTextView.setLayoutParams(new ti3(-2, -2));
        i4f.n.b(appCompatTextView, du4.b);
        appCompatTextView.setMaxLines(2);
        int ordinal = ufd.W0.ordinal();
        appCompatTextView.setTextColor(ordinal != 0 ? ordinal != 3 ? ufd.getCurrentTheme().getText().g : ufd.getCurrentTheme().d().c.b.e : ufd.getCurrentTheme().getText().j);
        appCompatTextView.setPadding(0, tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), 0, 0);
        ufd.L0.addView(appCompatTextView);
        return appCompatTextView;
    }

    public final void G() {
        int i;
        dj3 q = fp3.q(this);
        je7 je7 = this.K0;
        if (br7.H(je7)) {
            i = ((s5a) je7.getValue()).getId();
            sh0 sh0 = new sh0(((s5a) je7.getValue()).getId(), 4, (Object) q);
            sh0.D(0).e(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
            sh0.G(0);
            sh0.e(0);
        } else {
            ImageView imageView = this.J0;
            i = imageView.getId();
            sh0 sh02 = new sh0(imageView.getId(), 4, (Object) q);
            sh02.D(0).e(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
            sh02.G(0);
            sh02.e(0);
        }
        sh0 sh03 = new sh0(this.L0.getId(), 4, (Object) q);
        l2a C = sh03.C(i);
        float f = (float) 12;
        C.e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        float f2 = (float) 10;
        sh03.G(0).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        au1.p(f2, fk4.d().getDisplayMetrics().density, sh03.e(0));
        LinearLayout linearLayout = this.M0;
        sh03.p(linearLayout.getId()).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        sh0 sh04 = new sh0(linearLayout.getId(), 4, (Object) q);
        sh04.n(0).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        sh04.G(0);
        sh04.e(0);
        q.a(this);
    }

    public final kfd getModelItem() {
        bc7 bc7 = a1[0];
        return (kfd) this.X0.b;
    }

    public final pfd getThemeDepended() {
        bc7 bc7 = a1[1];
        return (pfd) this.Y0.b;
    }

    public final void onThemeChanged(fka fka) {
        fka currentTheme = getCurrentTheme();
        this.U0.setColor(ColorStateList.valueOf(currentTheme.d().a.a.h));
        je7 je7 = this.P0;
        if (je7.a()) {
            ((tja) je7.getValue()).onThemeChanged(currentTheme);
        }
        je7 je72 = this.Q0;
        if (je72.a()) {
            ((ofa) je72.getValue()).onThemeChanged(currentTheme);
        }
        je7 je73 = this.R0;
        if (je73.a()) {
            ((caa) je73.getValue()).f(currentTheme);
        }
        je7 je74 = this.N0;
        if (je74.a()) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) je74.getValue();
            appCompatTextView.setTextColor(currentTheme.getText().g);
            nqe.f(appCompatTextView, ColorStateList.valueOf(currentTheme.getIcon().j));
        }
        je7 je75 = this.O0;
        if (je75.a()) {
            ((AppCompatImageView) je75.getValue()).setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().j));
        }
        je7 je76 = this.G0;
        if (je76.a()) {
            ((AppCompatTextView) je76.getValue()).setTextColor(currentTheme.getText().g);
        }
        int ordinal = this.W0.ordinal();
        je7 je77 = this.I0;
        ImageView imageView = this.J0;
        tfd tfd = this.H0;
        if (ordinal == 0) {
            tfd.setTextColor(currentTheme.getText().j);
            if (je77.a()) {
                ((TextView) je77.getValue()).setTextColor(currentTheme.getText().j);
            }
            if (this.Z0) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().k));
            }
        } else if (ordinal == 1) {
            tfd.setTextColor(currentTheme.getText().e);
            if (je77.a()) {
                ((TextView) je77.getValue()).setTextColor(currentTheme.getText().g);
            }
            if (this.Z0) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().f));
            }
        } else if (ordinal == 2) {
            tfd.setTextColor(currentTheme.getText().b);
            if (je77.a()) {
                ((TextView) je77.getValue()).setTextColor(currentTheme.getText().g);
            }
            if (this.Z0) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().c));
            }
        } else if (ordinal == 3) {
            tfd.setTextColor(currentTheme.d().c.b.e);
            if (je77.a()) {
                ((TextView) je77.getValue()).setTextColor(currentTheme.d().c.b.e);
            }
            if (this.Z0) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.d().b.a.f));
            }
        } else if (ordinal == 4) {
            tfd.setTextColor(currentTheme.getText().e);
            if (je77.a()) {
                ((TextView) je77.getValue()).setTextColor(currentTheme.getText().g);
            }
            imageView.setImageTintList((ColorStateList) null);
        } else if (ordinal == 5) {
            tfd.setTextColor(currentTheme.getText().e);
            TextPaint paint = tfd.getPaint();
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.5f, 1.0f, 0.5f, currentTheme.e().f.a, (float[]) null, Shader.TileMode.CLAMP);
            linearGradient.setLocalMatrix(getTitleGradientMatrix());
            paint.setShader(linearGradient);
            if (this.Z0) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().a.b.a));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.W0 != jfd.Y && (tfd.getPaint().getShader() instanceof LinearGradient)) {
            tfd.getPaint().setShader((Shader) null);
            tfd.invalidate();
        }
    }

    public final void setCounter(bfd bfd) {
        setupCounter(bfd);
        requestLayout();
        invalidate();
    }

    public final void setDescription(jqe jqe) {
        setupDescription(jqe != null ? jqe.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDisableStartIconText(boolean z) {
        this.Z0 = z;
        ImageView imageView = this.J0;
        if (z) {
            imageView.setImageTintList((ColorStateList) null);
        } else {
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().k));
        }
        requestLayout();
        invalidate();
    }

    public final void setEndView(hfd hfd) {
        Drawable drawable;
        boolean z = hfd instanceof ffd;
        je7 je7 = this.O0;
        je7 je72 = this.P0;
        je7 je73 = this.Q0;
        je7 je74 = this.N0;
        if (z) {
            ffd ffd = (ffd) hfd;
            boolean z2 = ffd.a;
            boolean z3 = ffd.b;
            if (je74.a()) {
                ((AppCompatTextView) je74.getValue()).setVisibility(8);
            }
            if (je7.a()) {
                ((AppCompatImageView) je7.getValue()).setVisibility(8);
            }
            if (je73.a()) {
                ((ofa) je73.getValue()).setVisibility(8);
            }
            tja tja = (tja) je72.getValue();
            tja.setId(pga.m);
            tja.setVisibility(0);
            if (tja.isChecked() != z2) {
                tja.setChecked(z2);
            }
            tja.setEnabled(z3);
            tja.setClickable(z3);
        } else if (hfd instanceof cfd) {
            if (je72.a()) {
                ((tja) je72.getValue()).setVisibility(8);
            }
            if (je74.a()) {
                ((AppCompatTextView) je74.getValue()).setVisibility(8);
            }
            if (je73.a()) {
                ((ofa) je73.getValue()).setVisibility(8);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7.getValue();
            appCompatImageView.setId(pga.k);
            appCompatImageView.setVisibility(0);
        } else {
            CharSequence charSequence = "";
            if (hfd instanceof dfd) {
                dfd dfd = (dfd) hfd;
                CharSequence b = dfd.a.b(getContext());
                if (b != null) {
                    charSequence = b;
                }
                if (je72.a()) {
                    ((tja) je72.getValue()).setVisibility(8);
                }
                if (je73.a()) {
                    ((ofa) je73.getValue()).setVisibility(8);
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) je74.getValue();
                appCompatTextView.setId(pga.n);
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility(0);
                appCompatTextView.setCompoundDrawablePadding(6);
                nqe.f(appCompatTextView, ColorStateList.valueOf(getCurrentTheme().getIcon().j));
                Integer num = dfd.b;
                if (num == null || (drawable = kt3.b(appCompatTextView.getContext(), num.intValue())) == null) {
                    drawable = null;
                } else {
                    float f = (float) 16;
                    drawable.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                }
                appCompatTextView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) je7.getValue();
                appCompatImageView2.setId(pga.k);
                appCompatImageView2.setVisibility(0);
            } else if (hfd instanceof gfd) {
                CharSequence b2 = ((gfd) hfd).a.b(getContext());
                if (b2 != null) {
                    charSequence = b2;
                }
                setupEndText(charSequence);
            } else if (hfd instanceof efd) {
                efd efd = (efd) hfd;
                boolean z4 = efd.a;
                boolean z5 = efd.b;
                if (je74.a()) {
                    ((AppCompatTextView) je74.getValue()).setVisibility(8);
                }
                if (je7.a()) {
                    ((AppCompatImageView) je7.getValue()).setVisibility(8);
                }
                if (je72.a()) {
                    ((tja) je72.getValue()).setVisibility(8);
                }
                ofa ofa = (ofa) je73.getValue();
                ofa.setId(pga.l);
                ofa.setVisibility(0);
                ofa.setChecked(z4);
                ofa.setEnabled(z5);
                ofa.setOnCheckedChangeListener(new wz2(4, this));
            } else {
                if (je72.a()) {
                    ((tja) je72.getValue()).setVisibility(8);
                }
                if (je74.a()) {
                    ((AppCompatTextView) je74.getValue()).setVisibility(8);
                }
                if (je7.a()) {
                    ((AppCompatImageView) je7.getValue()).setVisibility(8);
                }
                if (je73.a()) {
                    ((ofa) je73.getValue()).setVisibility(8);
                }
            }
        }
        je7 je75 = this.R0;
        boolean a = je75.a();
        LinearLayout linearLayout = this.M0;
        if (a) {
            linearLayout.removeView((caa) je75.getValue());
        }
        if (je74.a()) {
            linearLayout.removeView((AppCompatTextView) je74.getValue());
        }
        if (je7.a()) {
            linearLayout.removeView((AppCompatImageView) je7.getValue());
        }
        F(linearLayout, je75);
        F(linearLayout, je74);
        F(linearLayout, je7);
        F(linearLayout, je72);
        F(linearLayout, je73);
        linearLayout.requestLayout();
        linearLayout.invalidate();
    }

    public final void setItemId(long j) {
    }

    public final void setModelItem(kfd kfd) {
        this.X0.o1(this, a1[0], kfd);
    }

    public final void setOnSwitchCheckedListener(a66 a66) {
        if (a66 != null) {
            setOnSwitchListener(new w4d(24, (Object) a66));
        } else {
            setOnSwitchListener((qfd) null);
        }
    }

    public final void setOnSwitchListener(qfd qfd) {
        je7 je7 = this.P0;
        if (je7.a()) {
            this.S0 = qfd;
            if (qfd != null) {
                ((tja) je7.getValue()).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                ((tja) je7.getValue()).setOnCheckedChangeListener(new ofd(this, qfd));
                return;
            }
            ((tja) je7.getValue()).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
    }

    public void setRippleMask(Shape shape) {
        this.T0.setShape(shape);
    }

    public final void setStartIcon(int i) {
        ImageView imageView = this.J0;
        imageView.setImageDrawable(kt3.b(getContext(), i));
        imageView.setVisibility(0);
        requestLayout();
        invalidate();
    }

    public final void setStartIconPadding(int i) {
        this.J0.setPadding(i, i, i, i);
    }

    public final void setThemeDepended(pfd pfd) {
        this.Y0.o1(this, a1[1], pfd);
    }

    public final void setTitle(jqe jqe) {
        this.H0.setText(jqe != null ? jqe.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setType(jfd jfd) {
        if (this.W0 != jfd) {
            this.W0 = jfd;
            onThemeChanged(qp4.u0.j(this));
            requestLayout();
            invalidate();
        }
    }

    public final void setUpperText(jqe jqe) {
        setupUpperText(jqe != null ? jqe.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDescription(CharSequence charSequence) {
        setupDescription(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.H0.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setUpperText(CharSequence charSequence) {
        setupUpperText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setStartIcon(Drawable drawable) {
        ImageView imageView = this.J0;
        imageView.setImageDrawable(drawable);
        int i = 0;
        if (!(drawable != null)) {
            i = 8;
        }
        imageView.setVisibility(i);
        requestLayout();
        invalidate();
    }
}
