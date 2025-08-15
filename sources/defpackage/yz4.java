package defpackage;

/* renamed from: yz4  reason: default package */
public final class yz4 implements a05 {
    public final z2e a;

    public yz4(z2e z2e) {
        this.a = z2e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz4) && tpa.f(this.a, ((yz4) obj).a);
    }

    public final int hashCode() {
        z2e z2e = this.a;
        if (z2e == null) {
            return 0;
        }
        return z2e.hashCode();
    }

    public final String toString() {
        return "EmptyDialog(sticker=" + this.a + ")";
    }
}
