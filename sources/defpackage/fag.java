package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* renamed from: fag  reason: default package */
public final class fag {
    public final int a;
    public final yt8 b;
    public final boolean c = true;
    public final boolean d = true;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public final GestureDetector l;
    public boolean m;

    public fag(Context context, yt8 yt8) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.b = yt8;
        this.l = new GestureDetector(context, new q00(18, this));
    }

    public final float a() {
        if (b()) {
            boolean z = this.m;
            boolean z2 = (z && this.e < this.f) || (!z && this.e > this.f);
            float abs = Math.abs(((float) 1) - (this.e / this.f)) * 0.5f;
            if (this.f <= ((float) this.a)) {
                return 1.0f;
            }
            return z2 ? 1.0f + abs : 1.0f - abs;
        }
        float f2 = this.f;
        if (f2 > 0.0f) {
            return this.e / f2;
        }
        return 1.0f;
    }

    public final boolean b() {
        return this.k != 0;
    }
}
