package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.core.widget.a;

/* renamed from: jm  reason: default package */
public class jm extends AutoCompleteTextView implements ww4 {
    public static final int[] o = {16843126};
    public final x8 a;
    public final io b;
    public final y7g c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vue.a(context);
        gse.a(getContext(), this);
        k8g x = k8g.x(getContext(), attributeSet, o, i, 0);
        if (((TypedArray) x.b).hasValue(0)) {
            setDropDownBackgroundDrawable(x.n(0));
        }
        x.z();
        x8 x8Var = new x8((View) this);
        this.a = x8Var;
        x8Var.E(attributeSet, i);
        io ioVar = new io(this);
        this.b = ioVar;
        ioVar.f(attributeSet, i);
        ioVar.b();
        y7g y7g = new y7g((EditText) this);
        this.c = y7g;
        y7g.B(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener z = y7g.z(keyListener);
            if (z != keyListener) {
                super.setKeyListener(z);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final boolean a() {
        return ((qy4) ((bx4) this.c.c).a.c).Y;
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c54.V(onCreateInputConnection, editorInfo, this);
        return ((bx4) this.c.c).a(onCreateInputConnection, editorInfo);
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

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        io ioVar = this.b;
        if (ioVar != null) {
            ioVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(s36.n(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.F(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.z(keyListener));
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
}
