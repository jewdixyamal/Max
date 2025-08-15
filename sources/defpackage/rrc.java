package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: rrc  reason: default package */
public final class rrc extends ffe implements a66 {
    public final /* synthetic */ djb X;
    public final /* synthetic */ byte[] Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rrc(djb djb, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.X = djb;
        this.Y = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rrc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rrc(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        byte[] bArr;
        int i;
        int i2;
        Matrix matrix;
        Bitmap decodeByteArray;
        int v;
        int i3;
        boolean z = true;
        od2.a0(obj);
        djb djb = this.X;
        ((yd) ((uuc) djb.b)).e.getClass();
        int i4 = c37.h;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 3;
            bArr = this.Y;
            if (i6 >= bArr.length) {
                i = 0;
                break;
            }
            i3 = i5 + 1;
            if ((bArr[i5] & 255) != 255) {
                break;
            }
            byte b = bArr[i3] & 255;
            if (b != 255) {
                i3 = i5 + 2;
                if (!(b == 216 || b == 1)) {
                    if (b != 217 && b != 218) {
                        int v2 = c37.v(bArr, i3, 2, false);
                        if (v2 >= 2 && (i3 = i3 + v2) <= bArr.length) {
                            if (b == 225 && v2 >= 8 && c37.v(bArr, i5 + 4, 4, false) == 1165519206 && c37.v(bArr, i5 + 8, 2, false) == 0) {
                                i5 += 10;
                                i = v2 - 8;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i5 = i3;
        }
        i = 0;
        i5 = i3;
        if (i > 8 && ((v = c37.v(bArr, i5, 4, false)) == 1229531648 || v == 1296891946)) {
            if (v != 1229531648) {
                z = false;
            }
            int v3 = c37.v(bArr, i5 + 4, 4, z) + 2;
            if (v3 >= 10 && v3 <= i) {
                int i7 = i5 + v3;
                int i8 = i - v3;
                int v4 = c37.v(bArr, i7 - 2, 2, z);
                while (true) {
                    int i9 = v4 - 1;
                    if (v4 <= 0 || i8 < 12) {
                        break;
                    } else if (c37.v(bArr, i7, 2, z) == 274) {
                        int v5 = c37.v(bArr, i7 + 8, 2, z);
                        if (v5 == 3) {
                            i2 = 180;
                        } else if (v5 == 6) {
                            i2 = 90;
                        } else if (v5 == 8) {
                            i2 = 270;
                        }
                    } else {
                        i7 += 12;
                        i8 -= 12;
                        v4 = i9;
                    }
                }
                matrix = new Matrix();
                matrix.setRotate((float) i2);
                decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (decodeByteArray.isMutable() || !matrix.isIdentity()) {
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    decodeByteArray = createBitmap;
                }
                oo0 oo0 = new oo0(decodeByteArray, 0);
                uuc uuc = (uuc) djb.b;
                Uri c = ((yd) uuc).c(oo0, uuc.b(false));
                decodeByteArray.recycle();
                return c;
            }
        }
        i2 = 0;
        matrix = new Matrix();
        matrix.setRotate((float) i2);
        decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Bitmap createBitmap2 = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        decodeByteArray.recycle();
        decodeByteArray = createBitmap2;
        oo0 oo02 = new oo0(decodeByteArray, 0);
        uuc uuc2 = (uuc) djb.b;
        Uri c2 = ((yd) uuc2).c(oo02, uuc2.b(false));
        decodeByteArray.recycle();
        return c2;
    }
}
