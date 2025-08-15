package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: dpe  reason: default package */
public final class dpe {
    public final TextPaint a = new TextPaint(1);
    public final k03 b = new k03(1, this);
    public float c;
    public float d;
    public boolean e = true;
    public final WeakReference f = new WeakReference((Object) null);
    public voe g;

    public dpe(cpe cpe) {
        this.f = new WeakReference(cpe);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        float f2 = 0.0f;
        this.c = str == null ? 0.0f : textPaint.measureText(str, 0, str.length());
        if (str != null) {
            f2 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = f2;
        this.e = false;
    }

    public final void c(voe voe, Context context) {
        if (this.g != voe) {
            this.g = voe;
            if (voe != null) {
                TextPaint textPaint = this.a;
                k03 k03 = this.b;
                voe.f(context, textPaint, k03);
                cpe cpe = (cpe) this.f.get();
                if (cpe != null) {
                    textPaint.drawableState = cpe.getState();
                }
                voe.e(context, textPaint, k03);
                this.e = true;
            }
            cpe cpe2 = (cpe) this.f.get();
            if (cpe2 != null) {
                cpe2.a();
                cpe2.onStateChange(cpe2.getState());
            }
        }
    }
}
