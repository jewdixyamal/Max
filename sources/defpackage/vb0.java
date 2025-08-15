package defpackage;

import android.util.Range;
import android.util.Size;

/* renamed from: vb0  reason: default package */
public final class vb0 {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final eu4 b;
    public final Range c;
    public final ce3 d;
    public final boolean e;

    public vb0(Size size, eu4 eu4, Range range, ce3 ce3, boolean z) {
        this.a = size;
        this.b = eu4;
        this.c = range;
        this.d = ce3;
        this.e = z;
    }

    public final x3c a() {
        x3c x3c = new x3c(1);
        x3c.b = this.a;
        x3c.c = this.b;
        x3c.o = this.c;
        x3c.X = this.d;
        x3c.Y = Boolean.valueOf(this.e);
        return x3c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        vb0 vb0 = (vb0) obj;
        if (this.a.equals(vb0.a) && this.b.equals(vb0.b) && this.c.equals(vb0.c)) {
            ce3 ce3 = vb0.d;
            ce3 ce32 = this.d;
            if (ce32 != null ? ce32.equals(ce3) : ce3 == null) {
                if (this.e == vb0.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ce3 ce3 = this.d;
        return (this.e ? 1231 : 1237) ^ ((hashCode ^ (ce3 == null ? 0 : ce3.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return au1.j(sb, this.e, "}");
    }
}
