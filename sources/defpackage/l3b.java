package defpackage;

/* renamed from: l3b  reason: default package */
public final class l3b {
    public final tm5 a;

    public l3b(tm5 tm5) {
        this.a = tm5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3b)) {
            return false;
        }
        return this.a.equals(((l3b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
