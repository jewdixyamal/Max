package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: qy4  reason: default package */
public final class qy4 implements TextWatcher {
    public int X = 0;
    public boolean Y;
    public final EditText a;
    public final boolean b;
    public oy4 c;
    public int o = Integer.MAX_VALUE;

    public qy4(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
        this.Y = true;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            vw4.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.Y) {
            if ((this.b || vw4.p != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
                int b2 = vw4.a().b();
                if (b2 != 0) {
                    if (b2 == 1) {
                        int i4 = i;
                        vw4.a().g(i4, i + i3, (Spannable) charSequence, this.o, this.X);
                        return;
                    } else if (b2 != 3) {
                        return;
                    }
                }
                vw4 a2 = vw4.a();
                if (this.c == null) {
                    this.c = new oy4(editText);
                }
                a2.i(this.c);
            }
        }
    }
}
