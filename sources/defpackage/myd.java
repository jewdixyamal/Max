package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: myd  reason: default package */
public final class myd extends LinearLayout {
    public final TextInputLayout a;
    public final AppCompatTextView b;
    public CharSequence c;
    public final CheckableImageButton o;
    public ColorStateList s0;
    public PorterDuff.Mode t0;
    public int u0;
    public ImageView.ScaleType v0;
    public View.OnLongClickListener w0;
    public boolean x0;

    public myd(TextInputLayout textInputLayout, k8g k8g) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(vyb.design_text_input_start_icon, this, false);
        this.o = checkableImageButton;
        CharSequence charSequence = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        if (ju0.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.w0;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        a14.J(checkableImageButton, onLongClickListener);
        this.w0 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        a14.J(checkableImageButton, (View.OnLongClickListener) null);
        int i = z2c.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) k8g.b;
        if (typedArray.hasValue(i)) {
            this.s0 = ju0.p(getContext(), k8g, z2c.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(z2c.TextInputLayout_startIconTintMode)) {
            this.t0 = mqd.A(typedArray.getInt(z2c.TextInputLayout_startIconTintMode, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(z2c.TextInputLayout_startIconDrawable)) {
            b(k8g.n(z2c.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(z2c.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(z2c.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(z2c.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(z2c.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(stb.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.u0) {
                this.u0 = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(z2c.TextInputLayout_startIconScaleType)) {
                ImageView.ScaleType k = a14.k(typedArray.getInt(z2c.TextInputLayout_startIconScaleType, -1));
                this.v0 = k;
                checkableImageButton.setScaleType(k);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(ivb.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = zmf.a;
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(z2c.TextInputLayout_prefixTextAppearance, 0));
            if (typedArray.hasValue(z2c.TextInputLayout_prefixTextColor)) {
                appCompatTextView.setTextColor(k8g.l(z2c.TextInputLayout_prefixTextColor));
            }
            CharSequence text2 = typedArray.getText(z2c.TextInputLayout_prefixText);
            this.c = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            appCompatTextView.setText(text2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.o;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = zmf.a;
        return this.b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.o;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.s0;
            PorterDuff.Mode mode = this.t0;
            TextInputLayout textInputLayout = this.a;
            a14.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            a14.I(textInputLayout, checkableImageButton, this.s0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.w0;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        a14.J(checkableImageButton, onLongClickListener);
        this.w0 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        a14.J(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.o;
        int i = 0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int i;
        EditText editText = this.a.o;
        if (editText != null) {
            if (this.o.getVisibility() == 0) {
                i = 0;
            } else {
                WeakHashMap weakHashMap = zmf.a;
                i = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(stb.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = zmf.a;
            this.b.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i = 8;
        int i2 = (this.c == null || this.x0) ? 8 : 0;
        if (this.o.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.b.setVisibility(i2);
        this.a.q();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
