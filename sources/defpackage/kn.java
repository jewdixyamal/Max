package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: kn  reason: default package */
public final class kn extends MultiAutoCompleteTextView implements ww4 {
    public static final int[] o = {16843126};
    public final x8 a;
    public final io b;
    public final y7g c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kn(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = defpackage.vsb.autoCompleteTextViewStyle
            defpackage.vue.a(r5)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.gse.a(r5, r4)
            android.content.Context r5 = r4.getContext()
            int[] r1 = o
            r2 = 0
            k8g r5 = defpackage.k8g.x(r5, r6, r1, r0, r2)
            java.lang.Object r1 = r5.b
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            boolean r1 = r1.hasValue(r2)
            if (r1 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r1 = r5.n(r2)
            r4.setDropDownBackgroundDrawable(r1)
        L_0x002b:
            r5.z()
            x8 r5 = new x8
            r5.<init>((android.view.View) r4)
            r4.a = r5
            r5.E(r6, r0)
            io r5 = new io
            r5.<init>(r4)
            r4.b = r5
            r5.f(r6, r0)
            r5.b()
            y7g r5 = new y7g
            r5.<init>((android.widget.EditText) r4)
            r4.c = r5
            r5.B(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.z(r6)
            if (r5 != r6) goto L_0x0070
            goto L_0x007f
        L_0x0070:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn.<init>(android.content.Context, android.util.AttributeSet):void");
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

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
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
