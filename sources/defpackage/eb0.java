package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: eb0  reason: default package */
public final class eb0 {
    public final Object a;
    public final p55 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final pv1 h;

    public eb0(Object obj, p55 p55, int i, Size size, Rect rect, int i2, Matrix matrix, pv1 pv1) {
        if (obj != null) {
            this.a = obj;
            this.b = p55;
            this.c = i;
            this.d = size;
            if (rect != null) {
                this.e = rect;
                this.f = i2;
                if (matrix != null) {
                    this.g = matrix;
                    if (pv1 != null) {
                        this.h = pv1;
                        return;
                    }
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null data");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0 = (eb0) obj;
        if (this.a.equals(eb0.a)) {
            p55 p55 = eb0.b;
            p55 p552 = this.b;
            if (p552 != null ? p552.equals(p55) : p55 == null) {
                if (this.c == eb0.c && this.d.equals(eb0.d) && this.e.equals(eb0.e) && this.f == eb0.f && this.g.equals(eb0.g) && this.h.equals(eb0.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        p55 p55 = this.b;
        return this.h.hashCode() ^ ((((((((((((hashCode ^ (p55 == null ? 0 : p55.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
