package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.a;

public class AppCompatButton extends Button implements ww4 {
    public final x8 a;
    public final io b;
    public in c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.buttonStyle);
    }

    private in getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new in(this);
        }
        return this.c;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.i();
        }
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.a;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.getClass();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.a;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        io ioVar = this.b;
        ioVar.i(colorStateList);
        ioVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        io ioVar = this.b;
        ioVar.j(mode);
        ioVar.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.g(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vue.a(context);
        gse.a(getContext(), this);
        x8 x8Var = new x8((View) this);
        this.a = x8Var;
        x8Var.E(attributeSet, i);
        io ioVar = new io(this);
        this.b = ioVar;
        ioVar.f(attributeSet, i);
        ioVar.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
