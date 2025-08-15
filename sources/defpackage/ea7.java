package defpackage;

/* renamed from: ea7  reason: default package */
public final class ea7 extends ga7 {
    public final ha7 d;

    public ea7(ha7 ha7) {
        super("client", 1, ha7);
        this.d = ha7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea7) && tpa.f(this.d, ((ea7) obj).d);
    }

    public final int hashCode() {
        ha7 ha7 = this.d;
        if (ha7 == null) {
            return 0;
        }
        return ha7.hashCode();
    }

    public final ha7 l() {
        return this.d;
    }

    public final String toString() {
        return "ClientError(reason=" + this.d + ")";
    }
}
