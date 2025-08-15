package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: m15  reason: default package */
public final class m15 extends LinearLayout {
    public int A0;
    public ImageView.ScaleType B0;
    public View.OnLongClickListener C0;
    public CharSequence D0;
    public final AppCompatTextView E0;
    public boolean F0;
    public EditText G0;
    public final AccessibilityManager H0;
    public q64 I0;
    public final k15 J0 = new k15(this);
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList o;
    public PorterDuff.Mode s0;
    public View.OnLongClickListener t0;
    public final CheckableImageButton u0;
    public final ty v0;
    public int w0 = 0;
    public final LinkedHashSet x0 = new LinkedHashSet();
    public ColorStateList y0;
    public PorterDuff.Mode z0;

    /* JADX WARNING: type inference failed for: r11v1, types: [ty, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m15(TextInputLayout textInputLayout, k8g k8g) {
        super(textInputLayout.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        k8g k8g2 = k8g;
        l15 l15 = new l15(this);
        this.H0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, ivb.text_input_error_icon);
        this.c = a2;
        CheckableImageButton a3 = a(frameLayout, from, ivb.text_input_end_icon);
        this.u0 = a3;
        ? obj = new Object();
        obj.c = new SparseArray();
        obj.o = this;
        int i = z2c.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) k8g2.b;
        obj.a = typedArray.getResourceId(i, 0);
        obj.b = typedArray.getResourceId(z2c.TextInputLayout_passwordToggleDrawable, 0);
        this.v0 = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.E0 = appCompatTextView;
        int i2 = z2c.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) k8g2.b;
        if (typedArray2.hasValue(i2)) {
            this.o = ju0.p(getContext(), k8g2, z2c.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_errorIconTintMode)) {
            this.s0 = mqd.A(typedArray2.getInt(z2c.TextInputLayout_errorIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_errorIconDrawable)) {
            i(k8g2.n(z2c.TextInputLayout_errorIconDrawable));
        }
        a2.setContentDescription(getResources().getText(wzb.error_icon_content_description));
        WeakHashMap weakHashMap = zmf.a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray2.hasValue(z2c.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconTint)) {
                this.y0 = ju0.p(getContext(), k8g2, z2c.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconTintMode)) {
                this.z0 = mqd.A(typedArray2.getInt(z2c.TextInputLayout_endIconTintMode, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(z2c.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconContentDescription) && a3.getContentDescription() != (text = typedArray2.getText(z2c.TextInputLayout_endIconContentDescription))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray2.getBoolean(z2c.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(z2c.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z2c.TextInputLayout_passwordToggleTint)) {
                this.y0 = ju0.p(getContext(), k8g2, z2c.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(z2c.TextInputLayout_passwordToggleTintMode)) {
                this.z0 = mqd.A(typedArray2.getInt(z2c.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null);
            }
            g(typedArray2.getBoolean(z2c.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(z2c.TextInputLayout_passwordToggleContentDescription);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(z2c.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(stb.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.A0) {
                this.A0 = dimensionPixelSize;
                a3.setMinimumWidth(dimensionPixelSize);
                a3.setMinimumHeight(dimensionPixelSize);
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconScaleType)) {
                ImageView.ScaleType k = a14.k(typedArray2.getInt(z2c.TextInputLayout_endIconScaleType, -1));
                this.B0 = k;
                a3.setScaleType(k);
                a2.setScaleType(k);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(ivb.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray2.getResourceId(z2c.TextInputLayout_suffixTextAppearance, 0));
            if (typedArray2.hasValue(z2c.TextInputLayout_suffixTextColor)) {
                appCompatTextView.setTextColor(k8g2.l(z2c.TextInputLayout_suffixTextColor));
            }
            CharSequence text3 = typedArray2.getText(z2c.TextInputLayout_suffixText);
            this.D0 = TextUtils.isEmpty(text3) ? null : text3;
            appCompatTextView.setText(text3);
            n();
            frameLayout.addView(a3);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a2);
            textInputLayout2.p1.add(l15);
            if (textInputLayout2.o != null) {
                l15.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new ck(5, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(vyb.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ju0.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n15 b() {
        n15 m04;
        int i = this.w0;
        ty tyVar = this.v0;
        SparseArray sparseArray = (SparseArray) tyVar.c;
        n15 n15 = (n15) sparseArray.get(i);
        if (n15 == null) {
            m15 m15 = (m15) tyVar.o;
            if (i == -1) {
                m04 = new m04(m15, 0);
            } else if (i == 0) {
                m04 = new m04(m15, 1);
            } else if (i == 1) {
                n15 = new gra(m15, tyVar.b);
                sparseArray.append(i, n15);
            } else if (i == 2) {
                m04 = new h33(m15);
            } else if (i == 3) {
                m04 = new qs4(m15);
            } else {
                throw new IllegalArgumentException(zr6.h(i, "Invalid end icon mode: "));
            }
            n15 = m04;
            sparseArray.append(i, n15);
        }
        return n15;
    }

    public final int c() {
        int i;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.u0;
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = zmf.a;
        return this.E0.getPaddingEnd() + getPaddingEnd() + i;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.u0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        n15 b2 = b();
        boolean k = b2.k();
        CheckableImageButton checkableImageButton = this.u0;
        boolean z4 = true;
        if (!k || (z3 = checkableImageButton.o) == b2.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b2 instanceof qs4) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            a14.I(this.a, checkableImageButton, this.y0);
        }
    }

    public final void g(int i) {
        if (this.w0 != i) {
            n15 b2 = b();
            q64 q64 = this.I0;
            AccessibilityManager accessibilityManager = this.H0;
            if (!(q64 == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new b4(q64));
            }
            CharSequence charSequence = null;
            this.I0 = null;
            b2.s();
            this.w0 = i;
            Iterator it = this.x0.iterator();
            if (!it.hasNext()) {
                h(i != 0);
                n15 b3 = b();
                int i2 = this.v0.a;
                if (i2 == 0) {
                    i2 = b3.d();
                }
                Drawable n = i2 != 0 ? s36.n(getContext(), i2) : null;
                CheckableImageButton checkableImageButton = this.u0;
                checkableImageButton.setImageDrawable(n);
                TextInputLayout textInputLayout = this.a;
                if (n != null) {
                    a14.d(textInputLayout, checkableImageButton, this.y0, this.z0);
                    a14.I(textInputLayout, checkableImageButton, this.y0);
                }
                int c2 = b3.c();
                if (c2 != 0) {
                    charSequence = getResources().getText(c2);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b3.k());
                if (b3.i(textInputLayout.getBoxBackgroundMode())) {
                    b3.r();
                    q64 h = b3.h();
                    this.I0 = h;
                    if (!(h == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = zmf.a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new b4(this.I0));
                        }
                    }
                    View.OnClickListener f = b3.f();
                    View.OnLongClickListener onLongClickListener = this.C0;
                    checkableImageButton.setOnClickListener(f);
                    a14.J(checkableImageButton, onLongClickListener);
                    EditText editText = this.G0;
                    if (editText != null) {
                        b3.m(editText);
                        j(b3);
                    }
                    a14.d(textInputLayout, checkableImageButton, this.y0, this.z0);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
            }
            au1.r(it.next());
            throw null;
        }
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.u0.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        a14.d(this.a, checkableImageButton, this.o, this.s0);
    }

    public final void j(n15 n15) {
        if (this.G0 != null) {
            if (n15.e() != null) {
                this.G0.setOnFocusChangeListener(n15.e());
            }
            if (n15.g() != null) {
                this.u0.setOnFocusChangeListener(n15.g());
            }
        }
    }

    public final void k() {
        int i = 8;
        this.b.setVisibility((this.u0.getVisibility() != 0 || e()) ? 8 : 0);
        boolean z = (this.D0 == null || this.F0) ? true : false;
        if (d() || e() || !z) {
            i = 0;
        }
        setVisibility(i);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable == null || !textInputLayout.x0.q || !textInputLayout.m()) ? 8 : 0);
        k();
        m();
        if (this.w0 == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.o != null) {
            if (d() || e()) {
                i = 0;
            } else {
                EditText editText = textInputLayout.o;
                WeakHashMap weakHashMap = zmf.a;
                i = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(stb.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.o.getPaddingTop();
            int paddingBottom = textInputLayout.o.getPaddingBottom();
            WeakHashMap weakHashMap2 = zmf.a;
            this.E0.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.E0;
        int visibility = appCompatTextView.getVisibility();
        boolean z = false;
        int i = (this.D0 == null || this.F0) ? 8 : 0;
        if (visibility != i) {
            n15 b2 = b();
            if (i == 0) {
                z = true;
            }
            b2.p(z);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.q();
    }
}
