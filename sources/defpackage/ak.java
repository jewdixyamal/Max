package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: ak  reason: default package */
public final class ak extends yl5 implements dvd, me {
    public final long Z;
    public final zj s0;

    public ak(long j, zj zjVar) {
        super((Drawable) zjVar, sl5.a, true);
        this.Z = j;
        this.s0 = zjVar;
    }

    public final Drawable b() {
        return this.s0;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) i3);
        canvas.clipRect(this.c);
        oq9 oq9 = zj.z0;
        zj zjVar = this.s0;
        zjVar.a(canvas, 0.0f, 0.0f, (float) zjVar.getBounds().height(), paint);
        canvas.restore();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return this.Z == akVar.Z && tpa.f(this.s0, akVar.s0);
    }

    public final Drawable getDrawable() {
        return this.s0;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        zj zjVar = this.s0;
        if (size <= 0) {
            hm9.m(ak.class.getName(), "Empty size when try get size from span", new Object[0]);
            size = zjVar.getBounds().right;
        }
        zjVar.getClass();
        bc7 bc7 = zj.A0[0];
        if (vj.$EnumSwitchMapping$0[((uj) zjVar.Z.b).ordinal()] != 1 || (zjVar.c instanceof ki)) {
            return size;
        }
        return 0;
    }

    public final int hashCode() {
        int hashCode = ak.class.hashCode();
        return (Long.hashCode(this.Z) * 31) + (this.s0.hashCode() * 31) + hashCode;
    }
}
