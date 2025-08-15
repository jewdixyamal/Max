package defpackage;

/* renamed from: gz8  reason: default package */
public final class gz8 implements kz8 {
    public final cz5 a;

    public gz8(cz5 cz5) {
        this.a = cz5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz8) && tpa.f(this.a, ((gz8) obj).a);
    }

    public final int hashCode() {
        cz5 cz5 = this.a;
        if (cz5 == null) {
            return 0;
        }
        return cz5.hashCode();
    }

    public final String toString() {
        return "OnMessageSend(forwardMessagesSendData=" + this.a + ")";
    }
}
