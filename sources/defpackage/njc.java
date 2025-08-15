package defpackage;

import java.io.Serializable;

/* renamed from: njc  reason: default package */
public final class njc implements Serializable {
    public final Throwable a;

    public njc(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof njc) {
            if (tpa.f(this.a, ((njc) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
