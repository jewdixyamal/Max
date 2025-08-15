package defpackage;

import android.util.Range;
import java.util.Arrays;

/* renamed from: mc0  reason: default package */
public final class mc0 {
    public static final Range e = new Range(0, Integer.MAX_VALUE);
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final b9b g;
    public final b9b a;
    public final Range b;
    public final Range c;
    public final int d;

    static {
        mb0 mb0 = mb0.f;
        g = b9b.l(Arrays.asList(new mb0[]{mb0, mb0.e, mb0.d}), new la0(mb0, 1));
    }

    public mc0(b9b b9b, Range range, Range range2, int i) {
        this.a = b9b;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [lc0, java.lang.Object] */
    public static lc0 a() {
        ? obj = new Object();
        obj.b(g);
        Range range = e;
        if (range != null) {
            obj.b = range;
            Range range2 = f;
            if (range2 != null) {
                obj.c = range2;
                obj.d = -1;
                return obj;
            }
            throw new NullPointerException("Null bitrate");
        }
        throw new NullPointerException("Null frameRate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0 = (mc0) obj;
        return this.a.equals(mc0.a) && this.b.equals(mc0.b) && this.c.equals(mc0.c) && this.d == mc0.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", frameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return zr6.j(sb, this.d, "}");
    }
}
