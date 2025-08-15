package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: job  reason: default package */
public final class job implements TypeEvaluator {
    public sra[] a = null;

    public final Object evaluate(float f, Object obj, Object obj2) {
        sra[] sraArr = (sra[]) obj;
        sra[] sraArr2 = (sra[]) obj2;
        if (m6d.a(sraArr, sraArr2)) {
            if (!m6d.a(this.a, sraArr)) {
                this.a = sraArr != null ? m6d.j(sraArr) : null;
            }
            sra[] sraArr3 = this.a;
            if (sraArr3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (sraArr != null) {
                int length = sraArr.length;
                for (int i = 0; i < length; i++) {
                    if (sraArr2 != null) {
                        sraArr3[i].b(sraArr[i], sraArr2[i], f);
                    }
                }
                return sraArr3;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
