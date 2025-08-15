package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.a;

/* renamed from: lm  reason: default package */
public final class lm extends CheckedTextView implements ww4 {
    public final mm a = new mm(this);
    public final x8 b;
    public final io c;
    public in o;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lm(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r7 = defpackage.vsb.checkedTextViewStyle
            defpackage.vue.a(r11)
            r10.<init>(r11, r12, r7)
            android.content.Context r11 = r10.getContext()
            defpackage.gse.a(r11, r10)
            io r11 = new io
            r11.<init>(r10)
            r10.c = r11
            r11.f(r12, r7)
            r11.b()
            x8 r11 = new x8
            r11.<init>((android.view.View) r10)
            r10.b = r11
            r11.E(r12, r7)
            mm r11 = new mm
            r11.<init>(r10)
            r10.a = r11
            android.content.Context r11 = r10.getContext()
            int[] r0 = defpackage.p3c.CheckedTextView
            r8 = 0
            k8g r11 = defpackage.k8g.x(r11, r12, r0, r7, r8)
            java.lang.Object r0 = r11.b
            r9 = r0
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            android.content.Context r1 = r10.getContext()
            int[] r2 = defpackage.p3c.CheckedTextView
            java.util.WeakHashMap r0 = defpackage.zmf.a
            java.lang.Object r0 = r11.b
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r6 = 0
            r0 = r10
            r3 = r12
            r5 = r7
            defpackage.umf.d(r0, r1, r2, r3, r4, r5, r6)
            int r0 = defpackage.p3c.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x006d }
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x006f
            int r0 = defpackage.p3c.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x006d }
            int r0 = r9.getResourceId(r0, r8)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x006f
            android.content.Context r1 = r10.getContext()     // Catch:{ NotFoundException -> 0x006f }
            android.graphics.drawable.Drawable r0 = defpackage.s36.n(r1, r0)     // Catch:{ NotFoundException -> 0x006f }
            r10.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ NotFoundException -> 0x006f }
            goto L_0x008a
        L_0x006d:
            r10 = move-exception
            goto L_0x00bd
        L_0x006f:
            int r0 = defpackage.p3c.CheckedTextView_android_checkMark     // Catch:{ all -> 0x006d }
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x008a
            int r0 = defpackage.p3c.CheckedTextView_android_checkMark     // Catch:{ all -> 0x006d }
            int r0 = r9.getResourceId(r0, r8)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x008a
            android.content.Context r1 = r10.getContext()     // Catch:{ all -> 0x006d }
            android.graphics.drawable.Drawable r0 = defpackage.s36.n(r1, r0)     // Catch:{ all -> 0x006d }
            r10.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ all -> 0x006d }
        L_0x008a:
            int r0 = defpackage.p3c.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x006d }
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x009b
            int r0 = defpackage.p3c.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x006d }
            android.content.res.ColorStateList r0 = r11.l(r0)     // Catch:{ all -> 0x006d }
            r10.setCheckMarkTintList(r0)     // Catch:{ all -> 0x006d }
        L_0x009b:
            int r0 = defpackage.p3c.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x006d }
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x00b2
            int r0 = defpackage.p3c.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x006d }
            r1 = -1
            int r0 = r9.getInt(r0, r1)     // Catch:{ all -> 0x006d }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.hq4.c(r0, r1)     // Catch:{ all -> 0x006d }
            r10.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x006d }
        L_0x00b2:
            r11.z()
            in r10 = r10.getEmojiTextViewHelper()
            r10.c(r12, r7)
            return
        L_0x00bd:
            r11.z()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm.<init>(android.content.Context, android.util.AttributeSet):void");
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
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.b();
        }
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.i();
        }
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (ColorStateList) mmVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c54.V(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        mm mmVar = this.a;
        if (mmVar == null) {
            return;
        }
        if (mmVar.e) {
            mmVar.e = false;
            return;
        }
        mmVar.e = true;
        mmVar.b();
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.a = colorStateList;
            mmVar.c = true;
            mmVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b = mode;
            mmVar.d = true;
            mmVar.b();
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

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        io ioVar = this.c;
        if (ioVar != null) {
            ioVar.g(context, i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(s36.n(getContext(), i));
    }
}
