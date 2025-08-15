package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: ny4  reason: default package */
public final class ny4 extends z04 {
    public final my4 e;

    public ny4(TextView textView) {
        this.e = new my4(textView);
    }

    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        return (vw4.p != null) ^ true ? inputFilterArr : this.e.B(inputFilterArr);
    }

    public final boolean K() {
        return this.e.g;
    }

    public final void V(boolean z) {
        if (!(!(vw4.p != null))) {
            this.e.V(z);
        }
    }

    public final void W(boolean z) {
        boolean z2 = !(vw4.p != null);
        my4 my4 = this.e;
        if (z2) {
            my4.g = z;
        } else {
            my4.W(z);
        }
    }

    public final TransformationMethod f0(TransformationMethod transformationMethod) {
        return (vw4.p != null) ^ true ? transformationMethod : this.e.f0(transformationMethod);
    }
}
