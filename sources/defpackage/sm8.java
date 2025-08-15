package defpackage;

/* renamed from: sm8  reason: default package */
public final class sm8 extends hm9 {
    public final jqe o;
    public final float p;

    public sm8(jqe jqe, float f) {
        this.o = jqe;
        this.p = f;
    }

    public final jqe C() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm8)) {
            return false;
        }
        sm8 sm8 = (sm8) obj;
        return tpa.f(this.o, sm8.o) && Float.compare(this.p, sm8.p) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.p) + (this.o.hashCode() * 31);
    }

    public final String toString() {
        return "Downloading(downloadText=" + this.o + ", progress=" + this.p + ")";
    }
}
