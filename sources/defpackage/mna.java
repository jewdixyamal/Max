package defpackage;

/* renamed from: mna  reason: default package */
public final class mna extends pi0 {
    public final String X;
    public final long Y;
    public final mg4 Z;
    public final long b;
    public final long c;
    public final long o;

    public mna(long j, long j2, long j3, String str, long j4, mg4 mg4) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = str;
        this.Y = j4;
        this.Z = mg4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mna)) {
            return false;
        }
        mna mna = (mna) obj;
        return this.b == mna.b && this.c == mna.c && this.o == mna.o && tpa.f(this.X, mna.X) && this.Y == mna.Y && this.Z == mna.Z;
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
        String str = this.X;
        return this.Z.hashCode() + h4f.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.Y);
    }

    public final String toString() {
        return "OutgoingMessageEvent(chatId=" + this.b + ", cid=" + this.c + ", messageId=" + this.o + ", tag=" + this.X + ", sender=" + this.Y + ", itemType=" + this.Z + ")";
    }
}
