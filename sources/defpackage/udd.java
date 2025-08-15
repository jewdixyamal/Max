package defpackage;

/* renamed from: udd  reason: default package */
public final class udd implements wdd {
    public final tbd a;

    public udd(tbd tbd) {
        this.a = tbd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udd) && tpa.f(this.a, ((udd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsClose(event=" + this.a + ")";
    }
}
