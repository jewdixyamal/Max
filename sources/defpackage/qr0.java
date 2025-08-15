package defpackage;

/* renamed from: qr0  reason: default package */
public abstract class qr0 {
    public final String a;

    public qr0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof qr0) {
                if (tpa.f(this.a, ((qr0) obj).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
