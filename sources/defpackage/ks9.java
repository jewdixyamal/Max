package defpackage;

import java.util.Set;

/* renamed from: ks9  reason: default package */
public final class ks9 extends gle {
    public final int X;
    public final fs8 Y;
    public final Set Z;
    public final long c;
    public final long o;

    public ks9(long j, long j2, int i, fs8 fs8, Set set) {
        this.c = j;
        this.o = j2;
        this.X = i;
        this.Y = fs8;
        this.Z = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks9)) {
            return false;
        }
        ks9 ks9 = (ks9) obj;
        return this.c == ks9.c && this.o == ks9.o && this.X == ks9.X && tpa.f(this.Y, ks9.Y) && tpa.f(this.Z, ks9.Z);
    }

    public final int hashCode() {
        int g = ey8.g(this.X, h4f.m(Long.hashCode(this.c) * 31, 31, this.o), 31);
        fs8 fs8 = this.Y;
        return this.Z.hashCode() + ((g + (fs8 == null ? 0 : fs8.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.o);
        sb.append(", updateType=");
        int i = this.X;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "FIRE_SUCCESS" : "DELETED" : "EDITED" : "CREATED");
        sb.append(", message=");
        sb.append(this.Y);
        sb.append(", messageIds=");
        sb.append(this.Z);
        sb.append(")");
        return sb.toString();
    }
}
