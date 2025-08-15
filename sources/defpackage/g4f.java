package defpackage;

/* renamed from: g4f  reason: default package */
public final class g4f {
    public final wv7 a;

    public g4f(wv7 wv7) {
        this.a = wv7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4f) && tpa.f(this.a, ((g4f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypingState(typing=" + this.a + ")";
    }
}
