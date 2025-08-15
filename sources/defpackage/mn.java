package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;

/* renamed from: mn  reason: default package */
public class mn extends RadioButton implements xue, ww4 {
    public final mm a;
    public final x8 b;
    public final io c;
    public in o;

    public mn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.radioButtonStyle);
    }

    private in getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new in(this);
        }
        return this.o;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.i();
        }
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x8 x8Var = this.b;
        if (x8Var != null) {
            return x8Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x8 x8Var = this.b;
        if (x8Var != null) {
            return x8Var.C();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (ColorStateList) mmVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (PorterDuff.Mode) mmVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.H();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.I(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        mm mmVar = this.a;
        if (mmVar == null) {
            return;
        }
        if (mmVar.e) {
            mmVar.e = false;
            return;
        }
        mmVar.e = true;
        mmVar.a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.O(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.P(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.a = colorStateList;
            mmVar.c = true;
            mmVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b = mode;
            mmVar.d = true;
            mmVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        io ioVar = this.c;
        ioVar.i(colorStateList);
        ioVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        io ioVar = this.c;
        ioVar.j(mode);
        ioVar.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vue.a(context);
        gse.a(getContext(), this);
        mm mmVar = new mm(this);
        this.a = mmVar;
        mmVar.e(attributeSet, i);
        x8 x8Var = new x8((View) this);
        this.b = x8Var;
        x8Var.E(attributeSet, i);
        io ioVar = new io(this);
        this.c = ioVar;
        ioVar.f(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(s36.n(getContext(), i));
    }
}
