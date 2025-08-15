package defpackage;

import java.util.Set;

/* renamed from: xp9  reason: default package */
public final class xp9 extends pi0 {
    public final long X;
    public final Set Y;
    public final long b;
    public final boolean c;
    public final long o;

    public xp9(long j, boolean z, long j2, long j3, Set set) {
        this.b = j;
        this.c = z;
        this.o = j2;
        this.X = j3;
        this.Y = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp9)) {
            return false;
        }
        xp9 xp9 = (xp9) obj;
        return this.b == xp9.b && this.c == xp9.c && this.o == xp9.o && this.X == xp9.X && tpa.f(this.Y, xp9.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + h4f.m(h4f.m(ms2.d(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o), 31, this.X);
    }

    public final String toString() {
        return "NewReactionEvent(chatId=" + this.b + ", isOnSubscription=" + this.c + ", messageLocalId=" + this.o + ", messageTime=" + this.X + ", reactions=" + this.Y + ")";
    }
}
