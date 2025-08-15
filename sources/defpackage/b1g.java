package defpackage;

/* renamed from: b1g  reason: default package */
public final class b1g {
    public static final a1g Companion = new Object();
    public final String a;
    public final boolean b;

    public /* synthetic */ b1g(String str, int i, boolean z) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = z;
            return;
        }
        ju0.I(i, 3, z0g.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1g)) {
            return false;
        }
        b1g b1g = (b1g) obj;
        return tpa.f(this.a, b1g.a) && this.b == b1g.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSetupScreenCaptureBehaviorResponse(requestId=" + this.a + ", isScreenCaptureEnabled=" + this.b + ")";
    }

    public b1g(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
