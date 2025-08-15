package defpackage;

import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dc0  reason: default package */
public final class dc0 {
    public final Size a;
    public final Map b;
    public final Size c;
    public final Map d;
    public final Size e;
    public final Map f;
    public final Map g;

    public dc0(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4) {
        if (size != null) {
            this.a = size;
            this.b = hashMap;
            if (size2 != null) {
                this.c = size2;
                this.d = hashMap2;
                if (size3 != null) {
                    this.e = size3;
                    this.f = hashMap3;
                    this.g = hashMap4;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc0)) {
            return false;
        }
        dc0 dc0 = (dc0) obj;
        return this.a.equals(dc0.a) && this.b.equals(dc0.b) && this.c.equals(dc0.c) && this.d.equals(dc0.d) && this.e.equals(dc0.e) && this.f.equals(dc0.f) && this.g.equals(dc0.g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
