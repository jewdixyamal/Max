package defpackage;

/* renamed from: mj1  reason: default package */
public final class mj1 extends wj1 {
    public final CharSequence D;

    public mj1(CharSequence charSequence) {
        this.D = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mj1) && tpa.f(this.D, ((mj1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "RecordStart(name=" + this.D + ")";
    }
}
