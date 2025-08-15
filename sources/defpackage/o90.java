package defpackage;

import android.util.Range;

/* renamed from: o90  reason: default package */
public final class o90 {
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final Range g = new Range(0, Integer.MAX_VALUE);
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        jc6 a2 = a();
        a2.X = 0;
        a2.k();
    }

    public o90(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, jc6] */
    public static jc6 a() {
        ? obj = new Object();
        obj.b = -1;
        obj.c = -1;
        obj.X = -1;
        Range range = f;
        if (range != null) {
            obj.a = range;
            Range range2 = g;
            if (range2 != null) {
                obj.o = range2;
                return obj;
            }
            throw new NullPointerException("Null sampleRate");
        }
        throw new NullPointerException("Null bitrate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        o90 o90 = (o90) obj;
        return this.a.equals(o90.a) && this.b == o90.b && this.c == o90.c && this.d.equals(o90.d) && this.e == o90.e;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return zr6.j(sb, this.e, "}");
    }
}
