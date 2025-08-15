package defpackage;

import android.util.Size;

/* renamed from: y90  reason: default package */
public final class y90 {
    public iv1 a = new Object();
    public fw6 b;
    public final fw6 c = null;
    public final Size d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Size h;
    public final int i;
    public final nu4 j;
    public final nu4 k;

    /* JADX WARNING: type inference failed for: r0v0, types: [iv1, java.lang.Object] */
    public y90(Size size, int i2, int i3, boolean z, nu4 nu4, nu4 nu42) {
        if (size != null) {
            this.d = size;
            this.e = i2;
            this.f = i3;
            this.g = z;
            this.h = null;
            this.i = 35;
            this.j = nu4;
            this.k = nu42;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90 = (y90) obj;
        if (this.d.equals(y90.d) && this.e == y90.e && this.f == y90.f && this.g == y90.g) {
            Size size = y90.h;
            Size size2 = this.h;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.i == y90.i && this.j.equals(y90.j) && this.k.equals(y90.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * -721379959;
        Size size = this.h;
        return this.k.hashCode() ^ ((((((hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormat=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSize=" + this.h + ", postviewImageFormat=" + this.i + ", requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
