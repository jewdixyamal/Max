package defpackage;

/* renamed from: em7  reason: default package */
public final class em7 extends fm7 {
    public final d24 a;

    public em7(d24 d24) {
        this.a = d24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || em7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((em7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (em7.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
