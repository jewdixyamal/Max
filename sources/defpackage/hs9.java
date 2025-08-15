package defpackage;

/* renamed from: hs9  reason: default package */
public final class hs9 extends gle {
    public final fs8 X;
    public final boolean Y;
    public final long Z;
    public final long c;
    public final f52 o;
    public final boolean s0;

    public hs9(long j, f52 f52, fs8 fs8, boolean z, long j2, boolean z2) {
        this.c = j;
        this.o = f52;
        this.X = fs8;
        this.Y = z;
        this.Z = j2;
        this.s0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs9)) {
            return false;
        }
        hs9 hs9 = (hs9) obj;
        return this.c == hs9.c && tpa.f(this.o, hs9.o) && tpa.f(this.X, hs9.X) && this.Y == hs9.Y && this.Z == hs9.Z && this.s0 == hs9.s0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        f52 f52 = this.o;
        return Boolean.hashCode(this.s0) + h4f.m(ms2.d((this.X.hashCode() + ((hashCode + (f52 == null ? 0 : f52.hashCode())) * 31)) * 31, 31, this.Y), 31, this.Z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", isInvisible=");
        sb.append(this.Y);
        sb.append(", prevMessageId=");
        sb.append(this.Z);
        sb.append(", ttl=");
        return au1.j(sb, this.s0, ")");
    }
}
