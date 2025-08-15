package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: l90  reason: default package */
public final class l90 {
    public final xb0 a;
    public final int b;
    public final Size c;
    public final eu4 d;
    public final List e;
    public final ce3 f;
    public final Range g;

    public l90(xb0 xb0, int i, Size size, eu4 eu4, List list, ce3 ce3, Range range) {
        if (xb0 != null) {
            this.a = xb0;
            this.b = i;
            if (size != null) {
                this.c = size;
                if (eu4 != null) {
                    this.d = eu4;
                    if (list != null) {
                        this.e = list;
                        this.f = ce3;
                        this.g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90 = (l90) obj;
        if (this.a.equals(l90.a) && this.b == l90.b && this.c.equals(l90.c) && this.d.equals(l90.d) && this.e.equals(l90.e)) {
            ce3 ce3 = l90.f;
            ce3 ce32 = this.f;
            if (ce32 != null ? ce32.equals(ce3) : ce3 == null) {
                Range range = l90.g;
                Range range2 = this.g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        ce3 ce3 = this.f;
        int hashCode2 = (hashCode ^ (ce3 == null ? 0 : ce3.hashCode())) * 1000003;
        Range range = this.g;
        if (range != null) {
            i = range.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
