package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* renamed from: pq8  reason: default package */
public abstract class pq8 extends mj0 {
    public final int[] v0;

    public pq8(sq8 sq8, n5b n5b, o5b o5b) {
        super(sq8, n5b, o5b);
        SparseIntArray sparseIntArray = n5b.c;
        sparseIntArray.getClass();
        this.v0 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.v0;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.b.getClass();
                this.t0.getClass();
                return;
            }
        }
    }

    public final void c(Object obj) {
        oq8 oq8 = (oq8) obj;
        oq8.getClass();
        oq8.close();
    }

    public final int f(int i) {
        if (i > 0) {
            for (int i2 : this.v0) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new BasePool$InvalidSizeException(Integer.valueOf(i));
    }

    public final int g(Object obj) {
        oq8 oq8 = (oq8) obj;
        oq8.getClass();
        return oq8.getSize();
    }

    public final int h(int i) {
        return i;
    }

    public final boolean k(Object obj) {
        oq8 oq8 = (oq8) obj;
        oq8.getClass();
        return !oq8.isClosed();
    }
}
