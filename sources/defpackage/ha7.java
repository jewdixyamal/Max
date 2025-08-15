package defpackage;

/* renamed from: ha7  reason: default package */
public final class ha7 {
    public final String a;
    public final int b;

    public ha7(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha7)) {
            return false;
        }
        ha7 ha7 = (ha7) obj;
        return tpa.f(this.a, ha7.a) && this.b == ha7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JsBridgeMethodErrorReason(title=" + this.a + ", code=" + this.b + ")";
    }
}
