package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: kx4  reason: default package */
public final class kx4 implements InputFilter {
    public final TextView a;
    public jx4 b;

    public kx4(TextView textView) {
        this.a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = vw4.a().b();
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 3) {
                    return charSequence;
                }
            } else if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                CharSequence charSequence2 = charSequence;
                return vw4.a().g(0, charSequence2.length(), charSequence2, Integer.MAX_VALUE, 0);
            }
        }
        vw4 a2 = vw4.a();
        if (this.b == null) {
            this.b = new jx4(textView, this);
        }
        a2.i(this.b);
        return charSequence;
    }
}
