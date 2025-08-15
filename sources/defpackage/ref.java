package defpackage;

/* renamed from: ref  reason: default package */
public final class ref {
    public final mqb a;
    public final float b;
    public final float c;
    public final boolean d;

    public ref(i20 i20) {
        this.a = i20.a;
        this.b = i20.b;
        this.c = i20.c;
        this.d = i20.d;
    }

    public final i20 a() {
        i20 i20 = new i20(1);
        i20.a = this.a;
        i20.b = this.b;
        i20.c = this.c;
        i20.d = this.d;
        return i20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ref.class != obj.getClass()) {
            return false;
        }
        ref ref = (ref) obj;
        if (Float.compare(ref.b, this.b) == 0 && Float.compare(ref.c, this.c) == 0 && this.d == ref.d) {
            return this.a == ref.a;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        mqb mqb = this.a;
        int hashCode = (mqb != null ? mqb.hashCode() : 0) * 31;
        float f = this.b;
        int floatToIntBits = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.c;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return ((floatToIntBits + i) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        return "VideoConvertOptions{quality=" + this.a + ", startTrimPosition=" + this.b + ", endTrimPosition=" + this.c + ", mute=" + this.d + '}';
    }
}
