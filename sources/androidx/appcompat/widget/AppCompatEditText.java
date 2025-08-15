package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.a;

public class AppCompatEditText extends EditText implements w3a, ww4 {
    public final x8 a;
    public final io b;
    public final rqe c;
    public final y7g o;
    public hn s0;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.editTextStyle);
    }

    private hn getSuperCaller() {
        if (this.s0 == null) {
            this.s0 = new hn(this);
        }
        return this.s0;
    }

    public final boolean a() {
        return ((qy4) ((bx4) this.o.c).a.c).Y;
    }

    public final bt3 b(bt3 bt3) {
        return this.c.a(this, bt3);
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

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        io.h(this, onCreateInputConnection, editorInfo);
        c54.V(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (d = zmf.d(this)) == null)) {
            editorInfo.contentMimeTypes = d;
            onCreateInputConnection = new k17(onCreateInputConnection, new z16(8, this));
        }
        return ((bx4) this.o.c).a(onCreateInputConnection, editorInfo);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && zmf.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = on.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        sy4 sy4;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || zmf.d(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                sy4 = new sy4(primaryClip, 1);
            } else {
                zs3 zs3 = new zs3();
                zs3.b = primaryClip;
                zs3.c = 1;
                sy4 = zs3;
            }
            sy4.setFlags(i == 16908322 ? 0 : 1);
            zmf.g(this, sy4.build());
        }
        return true;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.o.F(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.o.z(keyListener));
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

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [rqe, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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
        this.c = new Object();
        y7g y7g = new y7g((EditText) this);
        this.o = y7g;
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

    public Editable getText() {
        return super.getText();
    }
}
