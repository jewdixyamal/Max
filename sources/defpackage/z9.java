package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: z9  reason: default package */
public final class z9 implements hx3 {
    public final hx3 a;
    public final float b;

    public z9(float f, hx3 hx3) {
        while (hx3 instanceof z9) {
            hx3 = ((z9) hx3).a;
            f += ((z9) hx3).b;
        }
        this.a = hx3;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return this.a.equals(z9Var.a) && this.b == z9Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
