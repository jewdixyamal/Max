package defpackage;

import android.graphics.Matrix;

/* renamed from: ra0  reason: default package */
public final class ra0 implements su6 {
    public final nje a;
    public final long b;
    public final int c;
    public final Matrix d;

    public ra0(nje nje, long j, int i, Matrix matrix) {
        if (nje != null) {
            this.a = nje;
            this.b = j;
            this.c = i;
            if (matrix != null) {
                this.d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public final void b(t55 t55) {
        t55.d(this.c);
    }

    public final nje c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0 = (ra0) obj;
        return this.a.equals(ra0.a) && this.b == ra0.b && this.c == ra0.c && this.d.equals(ra0.d);
    }

    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.b;
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
