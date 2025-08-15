package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: in  reason: default package */
public final class in {
    public final TextView a;
    public final ey1 b;

    public in(TextView textView) {
        this.a = textView;
        this.b = new ey1(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((z04) this.b.b).B(inputFilterArr);
    }

    public final boolean b() {
        return ((z04) this.b.b).K();
    }

    /* JADX INFO: finally extract failed */
    public final void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, p3c.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(p3c.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(p3c.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        ((z04) this.b.b).V(z);
    }

    public final void e(boolean z) {
        ((z04) this.b.b).W(z);
    }
}
