package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: opa  reason: default package */
public final class opa {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public opa(int i2, int i3) {
        this.a = Color.red(i2);
        this.b = Color.green(i2);
        this.c = Color.blue(i2);
        this.d = i2;
        this.e = i3;
    }

    public final void a() {
        if (!this.f) {
            int i2 = this.d;
            int f2 = s63.f(-1, 4.5f, i2);
            int f3 = s63.f(-1, 3.0f, i2);
            if (f2 == -1 || f3 == -1) {
                int f4 = s63.f(-16777216, 4.5f, i2);
                int f5 = s63.f(-16777216, 3.0f, i2);
                if (f4 == -1 || f5 == -1) {
                    this.h = f2 != -1 ? s63.i(-1, f2) : s63.i(-16777216, f4);
                    this.g = f3 != -1 ? s63.i(-1, f3) : s63.i(-16777216, f5);
                    this.f = true;
                    return;
                }
                this.h = s63.i(-16777216, f4);
                this.g = s63.i(-16777216, f5);
                this.f = true;
                return;
            }
            this.h = s63.i(-1, f2);
            this.g = s63.i(-1, f3);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        s63.a(this.a, this.b, this.c, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || opa.class != obj.getClass()) {
            return false;
        }
        opa opa = (opa) obj;
        return this.e == opa.e && this.d == opa.d;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(opa.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
