package defpackage;

/* renamed from: e35  reason: default package */
public final class e35 {
    public static final a35 Companion = new Object();
    public final String a;
    public final d35 b;

    public /* synthetic */ e35(int i, String str, d35 d35) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = d35;
            return;
        }
        ju0.I(i, 3, z25.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e35)) {
            return false;
        }
        e35 e35 = (e35) obj;
        return tpa.f(this.a, e35.a) && tpa.f(this.b, e35.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorResponse(requestId=" + this.a + ", error=" + this.b + ")";
    }

    public e35(String str, d35 d35) {
        this.a = str;
        this.b = d35;
    }
}
