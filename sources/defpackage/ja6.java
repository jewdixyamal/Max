package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* renamed from: ja6  reason: default package */
public class ja6 extends mj0 {
    public final int[] v0;

    public ja6(qq9 qq9, n5b n5b, rq9 rq9) {
        super(qq9, n5b, rq9);
        SparseIntArray sparseIntArray = n5b.c;
        if (sparseIntArray != null) {
            this.v0 = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.v0[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.v0 = new int[0];
        }
        this.b.getClass();
        this.t0.getClass();
    }

    public final Object a(int i) {
        return new byte[i];
    }

    public final /* bridge */ /* synthetic */ void c(Object obj) {
        byte[] bArr = (byte[]) obj;
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
        return ((byte[]) obj).length;
    }

    public final int h(int i) {
        return i;
    }
}
