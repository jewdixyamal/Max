package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: ssc  reason: default package */
public final class ssc extends fm9 {
    public static final ssc k = new ssc(0);
    public static final ssc l = new ssc(1);
    public static final ssc m = new ssc(2);
    public static final ssc n = new ssc(3);
    public static final ssc o = new ssc(4);
    public static final ssc p = new ssc(5);
    public static final ssc q = new ssc(6);
    public static final ssc r = new ssc(7);
    public static final ssc s = new ssc(8);
    public final /* synthetic */ int j;

    public /* synthetic */ ssc(int i) {
        this.j = i;
    }

    public final void E(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        switch (this.j) {
            case 0:
                matrix.setTranslate((float) ((int) ((((float) (rect.width() - i)) * 0.5f) + ((float) rect.left) + 0.5f)), (float) ((int) ((((float) (rect.height() - i2)) * 0.5f) + ((float) rect.top) + 0.5f)));
                return;
            case 1:
                if (f4 > f3) {
                    f5 = ((((float) rect.width()) - (((float) i) * f4)) * 0.5f) + ((float) rect.left);
                    f6 = (float) rect.top;
                    f3 = f4;
                } else {
                    float height = (((float) rect.height()) - (((float) i2) * f3)) * 0.5f;
                    f5 = (float) rect.left;
                    f6 = height + ((float) rect.top);
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
                return;
            case 2:
                float min = Math.min(Math.min(f3, f4), 1.0f);
                float width = ((((float) rect.width()) - (((float) i) * min)) * 0.5f) + ((float) rect.left);
                float height2 = (((float) rect.height()) - (((float) i2) * min)) * 0.5f;
                matrix.setScale(min, min);
                matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height2 + ((float) rect.top) + 0.5f)));
                return;
            case 3:
                float min2 = Math.min(f3, f4);
                float height3 = ((float) rect.height()) - (((float) i2) * min2);
                matrix.setScale(min2, min2);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (height3 + ((float) rect.top) + 0.5f)));
                return;
            case 4:
                float min3 = Math.min(f3, f4);
                float width2 = ((((float) rect.width()) - (((float) i) * min3)) * 0.5f) + ((float) rect.left);
                float height4 = (((float) rect.height()) - (((float) i2) * min3)) * 0.5f;
                matrix.setScale(min3, min3);
                matrix.postTranslate((float) ((int) (width2 + 0.5f)), (float) ((int) (height4 + ((float) rect.top) + 0.5f)));
                return;
            case 5:
                float min4 = Math.min(f3, f4);
                float width3 = ((float) rect.width()) - (((float) i) * min4);
                float height5 = (((float) rect.height()) - (((float) i2) * min4)) + ((float) rect.top);
                matrix.setScale(min4, min4);
                matrix.postTranslate((float) ((int) (width3 + ((float) rect.left) + 0.5f)), (float) ((int) (height5 + 0.5f)));
                return;
            case 6:
                float min5 = Math.min(f3, f4);
                matrix.setScale(min5, min5);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
                return;
            case 7:
                matrix.setScale(f3, f4);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
                return;
            default:
                if (f4 > f3) {
                    float f9 = ((float) i) * f4;
                    f8 = Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f9), 0.0f), ((float) rect.width()) - f9) + ((float) rect.left);
                    f7 = (float) rect.top;
                    f3 = f4;
                } else {
                    f8 = (float) rect.left;
                    float f10 = ((float) i2) * f3;
                    f7 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f10), 0.0f), ((float) rect.height()) - f10) + ((float) rect.top);
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((float) ((int) (f8 + 0.5f)), (float) ((int) (f7 + 0.5f)));
                return;
        }
    }

    public final String toString() {
        switch (this.j) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            default:
                return "focus_crop";
        }
    }
}
