package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: my4  reason: default package */
public final class my4 extends z04 {
    public final TextView e;
    public final kx4 f;
    public boolean g = true;

    public my4(TextView textView) {
        this.e = textView;
        this.f = new kx4(textView);
    }

    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        if (!this.g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof kx4) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            kx4 kx4 = this.f;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = kx4;
                return inputFilterArr3;
            } else if (inputFilterArr[i4] == kx4) {
                return inputFilterArr;
            } else {
                i4++;
            }
        }
    }

    public final boolean K() {
        return this.g;
    }

    public final void V(boolean z) {
        if (z) {
            TextView textView = this.e;
            textView.setTransformationMethod(f0(textView.getTransformationMethod()));
        }
    }

    public final void W(boolean z) {
        this.g = z;
        TextView textView = this.e;
        textView.setTransformationMethod(f0(textView.getTransformationMethod()));
        textView.setFilters(B(textView.getFilters()));
    }

    public final TransformationMethod f0(TransformationMethod transformationMethod) {
        return this.g ? (!(transformationMethod instanceof ry4) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new ry4(transformationMethod) : transformationMethod : transformationMethod instanceof ry4 ? ((ry4) transformationMethod).a : transformationMethod;
    }
}
