package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: yb0  reason: default package */
public final class yb0 {
    public final Size a;
    public final Rect b;
    public final ax1 c;
    public final int d;
    public final boolean e;

    public yb0(Size size, Rect rect, ax1 ax1, int i, boolean z) {
        if (size != null) {
            this.a = size;
            if (rect != null) {
                this.b = rect;
                this.c = ax1;
                this.d = i;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0 = (yb0) obj;
        if (this.a.equals(yb0.a) && this.b.equals(yb0.b)) {
            ax1 ax1 = yb0.c;
            ax1 ax12 = this.c;
            if (ax12 != null ? ax12.equals(ax1) : ax1 == null) {
                if (this.d == yb0.d && this.e == yb0.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        ax1 ax1 = this.c;
        return (this.e ? 1231 : 1237) ^ ((((hashCode ^ (ax1 == null ? 0 : ax1.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return au1.j(sb, this.e, "}");
    }
}
