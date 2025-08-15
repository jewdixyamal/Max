package defpackage;

/* renamed from: rt  reason: default package */
public final class rt {
    public final zad a;

    public rt(zad zad) {
        this.a = zad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt) && tpa.f(this.a, ((rt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopAsrRecord(sessionRoomId=" + this.a + ")";
    }
}
