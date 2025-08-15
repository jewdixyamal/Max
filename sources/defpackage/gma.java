package defpackage;

/* renamed from: gma  reason: default package */
public final class gma extends wm9 {
    public final long b;
    public final boolean c;

    public gma(long j, boolean z) {
        super(e5f.a);
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gma)) {
            return false;
        }
        gma gma = (gma) obj;
        return this.b == gma.b && this.c == gma.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOneToOneCall(opponentId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        return au1.j(sb, this.c, ")");
    }
}
