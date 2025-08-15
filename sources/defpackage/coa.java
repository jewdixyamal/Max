package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* renamed from: coa  reason: default package */
public final class coa {
    public final BitmapDrawable a;
    public float b = 1.0f;
    public final Rect c;
    public Interpolator d;
    public long e;
    public final Rect f;
    public int g;
    public float h = 1.0f;
    public float i = 1.0f;
    public long j;
    public boolean k;
    public boolean l;
    public h7b m;

    public coa(BitmapDrawable bitmapDrawable, Rect rect) {
        this.a = bitmapDrawable;
        this.f = rect;
        Rect rect2 = new Rect(rect);
        this.c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
