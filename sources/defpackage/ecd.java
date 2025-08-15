package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: ecd  reason: default package */
public final class ecd extends i06 {
    public final su6 X;
    public final int Y;
    public final int Z;
    public final Object o = new Object();

    public ecd(ov6 ov6, Size size, su6 su6) {
        super(ov6);
        if (size == null) {
            this.Y = this.b.getWidth();
            this.Z = this.b.getHeight();
        } else {
            this.Y = size.getWidth();
            this.Z = size.getHeight();
        }
        this.X = su6;
    }

    public final void d(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.Y, this.Z)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.o) {
        }
    }

    public final int getHeight() {
        return this.Z;
    }

    public final su6 getImageInfo() {
        return this.X;
    }

    public final int getWidth() {
        return this.Y;
    }
}
