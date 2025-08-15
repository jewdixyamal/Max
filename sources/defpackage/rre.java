package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rre  reason: default package */
public final class rre extends Drawable {
    public final qre a;
    public final je7 b = tu0.r(3, new rzd(9, this));

    public rre(qre qre) {
        this.a = qre;
    }

    public final rre a(float f) {
        kge kge;
        kge kge2;
        qre qre = this.a;
        pre pre = qre.a;
        pre pre2 = null;
        if (pre == null || (kge2 = pre.a) == null) {
            kge = null;
        } else {
            kge = kge2.mutate();
            kge.a.f = f;
        }
        if (kge != null) {
            pre.getClass();
            pre2 = new pre(kge);
        }
        nre nre = qre.b;
        List list = qre.c;
        List list2 = qre.d;
        Integer num = qre.e;
        qre.getClass();
        return new rre(new qre(pre2, nre, list, list2, num));
    }

    public final void draw(Canvas canvas) {
        cbf cbf = (cbf) this.b.getValue();
        qre qre = cbf.a;
        Integer num = qre.e;
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        if (qre.b != null) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) cbf.b.getValue());
        }
        if (qre.d != null) {
            cbf.a(canvas, cbf.e, cbf.f, (Paint) cbf.c.getValue());
        }
        pre pre = qre.a;
        if (pre != null) {
            pre.a.draw(canvas);
        }
        if (pre != null) {
            ArrayList arrayList = cbf.g;
            if (!arrayList.isEmpty()) {
                int saveLayer = canvas.saveLayer((RectF) null, (Paint) null);
                cbf.a(canvas, arrayList, cbf.h, (Paint) cbf.d.getValue());
                kge kge = pre.a;
                Xfermode xfermode = kge.a.g.getXfermode();
                int alpha = kge.getAlpha();
                PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                pte pte = kge.a;
                pte.g.setXfermode(porterDuffXfermode);
                kge.setAlpha(255);
                kge.draw(canvas);
                pte.g.setXfermode(xfermode);
                kge.setAlpha(alpha);
                canvas.restoreToCount(saveLayer);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final Drawable mutate() {
        return a(1.0f);
    }

    public final void onBoundsChange(Rect rect) {
        cbf cbf = (cbf) this.b.getValue();
        cbf.getClass();
        int width = rect.width();
        int height = rect.height();
        qre qre = cbf.a;
        nre nre = qre.b;
        if (nre != null) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            float[] fArr = new float[2];
            float f = nre.b;
            cbf.c(width, height, f, fArr);
            rectF.left = fArr[0];
            rectF.top = fArr[1];
            cbf.c(width, height, (f + 180.0f) % ((float) 360), fArr);
            rectF.right = fArr[0];
            rectF.bottom = fArr[1];
            ((Paint) cbf.b.getValue()).setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, nre.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        List list = qre.c;
        if (list != null) {
            cbf.b(list, cbf.e, cbf.f, width, height);
        }
        List list2 = qre.d;
        if (list2 != null) {
            cbf.b(list2, cbf.g, cbf.h, width, height);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
