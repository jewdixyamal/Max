package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@TargetApi(19)
@pm4
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final wm5 c;

    @pm4
    public KitKatPurgeableDecoder(wm5 wm5) {
        this.c = wm5;
    }

    public final Bitmap b(o43 o43, BitmapFactory.Options options) {
        qq8 qq8 = (qq8) o43.e0();
        int U = qq8.U();
        v84 a = this.c.a(U);
        try {
            byte[] bArr = (byte[]) a.e0();
            qq8.S(0, 0, U, bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, U, options);
            od2.o(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            o43.S(a);
        }
    }

    public final Bitmap c(o43 o43, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(i, o43) ? null : DalvikPurgeableDecoder.b;
        qq8 qq8 = (qq8) o43.e0();
        if (i <= qq8.U()) {
            int i2 = i + 2;
            v84 a = this.c.a(i2);
            try {
                byte[] bArr2 = (byte[]) a.e0();
                qq8.S(0, 0, i, bArr2);
                if (bArr != null) {
                    bArr2[i] = -1;
                    bArr2[i + 1] = -39;
                    i = i2;
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
                od2.o(decodeByteArray, "BitmapFactory returned null");
                return decodeByteArray;
            } finally {
                o43.S(a);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
