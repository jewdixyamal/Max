package defpackage;

/* renamed from: d41  reason: default package */
public final class d41 implements g41 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public d41(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41 = (d41) obj;
        return this.a == d41.a && this.b == d41.b && this.c == d41.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ms2.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.a);
        sb.append(", isVideoEnabled=");
        sb.append(this.b);
        sb.append(", isAudioEnabled=");
        return au1.j(sb, this.c, ")");
    }
}
