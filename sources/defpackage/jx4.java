package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: jx4  reason: default package */
public final class jx4 extends tw4 {
    public final WeakReference a;
    public final WeakReference b;

    public jx4(TextView textView, kx4 kx4) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(kx4);
    }

    public final void i() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence h;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i = 0;
            while (i < filters.length) {
                if (filters[i] != inputFilter) {
                    i++;
                } else if (textView.isAttachedToWindow() && (text = textView.getText()) != (h = vw4.a().h(text))) {
                    int selectionStart = Selection.getSelectionStart(h);
                    int selectionEnd = Selection.getSelectionEnd(h);
                    textView.setText(h);
                    if (h instanceof Spannable) {
                        Spannable spannable = (Spannable) h;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
