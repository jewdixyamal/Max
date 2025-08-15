package defpackage;

/* renamed from: ww3  reason: default package */
public final class ww3 implements xw3 {
    public final jqe a;

    public ww3(jqe jqe) {
        this.a = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww3) && tpa.f(this.a, ((ww3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("Success(message="), this.a, ")");
    }
}
