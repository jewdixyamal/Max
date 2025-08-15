package defpackage;

/* renamed from: j86  reason: default package */
public final class j86 implements k86 {
    public final q4d a;

    public j86(q4d q4d) {
        this.a = q4d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j86) && tpa.f(this.a, ((j86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
