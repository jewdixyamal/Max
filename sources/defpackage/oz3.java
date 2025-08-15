package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: oz3  reason: default package */
public final class oz3 extends uf4 {
    public final int l;
    public Rect m;
    public final RectF n = new RectF();
    public boolean o;
    public float p = 0.0f;

    public oz3(b9b b9b, int i) {
        super(b9b);
        this.l = i;
    }

    public final void a(float f, float f2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.m
            if (r0 == 0) goto L_0x0051
            android.graphics.Matrix r0 = r8.k
            android.graphics.RectF r1 = r8.n
            android.graphics.RectF r2 = r8.h
            r0.mapRect(r1, r2)
            float r2 = r1.top
            android.graphics.Rect r3 = r8.m
            int r4 = r3.top
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r6 = 0
            if (r5 <= 0) goto L_0x001c
        L_0x0019:
            float r4 = (float) r4
            float r4 = r4 - r2
            goto L_0x0027
        L_0x001c:
            float r2 = r1.bottom
            int r4 = r3.bottom
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0026
            goto L_0x0019
        L_0x0026:
            r4 = r6
        L_0x0027:
            float r2 = r1.left
            int r5 = r3.left
            float r7 = (float) r5
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            float r1 = (float) r5
            float r1 = r1 - r2
            goto L_0x0041
        L_0x0033:
            float r1 = r1.right
            int r2 = r3.right
            float r3 = (float) r2
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0040
            float r2 = (float) r2
            float r1 = r2 - r1
            goto L_0x0041
        L_0x0040:
            r1 = r6
        L_0x0041:
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0049
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
        L_0x0049:
            r0.postTranslate(r1, r4)
            b9b r8 = r8.a
            r8.q()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz3.b():void");
    }

    public final Rect c(int i) {
        RectF rectF = new RectF();
        this.k.mapRect(rectF, this.h);
        if (this.m == null) {
            return null;
        }
        float width = ((float) i) / rectF.width();
        Rect rect = this.m;
        int i2 = rect.left;
        float f = rectF.left;
        int width2 = (int) (((((float) i2) - f) + ((float) rect.width())) * width);
        Rect rect2 = this.m;
        Rect rect3 = new Rect((int) ((((float) i2) - f) * width), (int) ((((float) rect.top) - rectF.top) * width), width2, (int) (((((float) rect2.top) - rectF.top) + ((float) rect2.height())) * width));
        if (this.o && rect3.height() != rect3.width()) {
            hm9.k("oz3", "cropped rect is not square: square it");
            if (rect3.width() > rect3.height()) {
                rect3.right -= rect3.width() - rect3.height();
            } else {
                rect3.bottom -= rect3.height() - rect3.width();
            }
        }
        return rect3;
    }

    public final void d(int i) {
        float width = (((float) c(i).width()) / ((float) this.l)) - 0.05f;
        if (width > 1.0f) {
            this.f = width;
        }
    }

    public final void e() {
        RectF rectF = this.h;
        if (rectF != null && this.m != null) {
            float width = rectF.width();
            float height = rectF.height();
            if (width > 0.0f && height > 0.0f) {
                this.e = Math.max(((float) this.m.width()) / width, ((float) this.m.height()) / height);
                b();
            }
        }
    }

    public final void reset() {
        super.reset();
        this.p = 0.0f;
    }
}
