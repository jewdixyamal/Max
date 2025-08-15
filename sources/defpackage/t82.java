package defpackage;

/* renamed from: t82  reason: default package */
public final class t82 {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public t82(s82 s82) {
        this.a = s82.b;
        this.b = s82.a;
        this.c = s82.c;
        this.d = (String) s82.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant{id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias='");
        return zr6.l(sb, this.d, "'}");
    }
}
