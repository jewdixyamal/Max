package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: cc0  reason: default package */
public final class cc0 {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public cc0(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect != null) {
            this.a = rect;
            this.b = i;
            this.c = i2;
            this.d = z;
            if (matrix != null) {
                this.e = matrix;
                this.f = z2;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc0)) {
            return false;
        }
        cc0 cc0 = (cc0) obj;
        return this.a.equals(cc0.a) && this.b == cc0.b && this.c == cc0.c && this.d == cc0.d && this.e.equals(cc0.e) && this.f == cc0.f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return au1.j(sb, this.f, "}");
    }
}
