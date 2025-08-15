package defpackage;

/* renamed from: iq0  reason: default package */
public final class iq0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public iq0(String str, long j, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq0)) {
            return false;
        }
        iq0 iq0 = (iq0) obj;
        return this.a == iq0.a && tpa.f(this.b, iq0.b) && tpa.f(this.c, iq0.c) && tpa.f(this.d, iq0.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int d2 = rh4.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BotItem(botId=");
        sb.append(this.a);
        sb.append(", botTag=");
        sb.append(this.b);
        sb.append(", commandName=");
        sb.append(this.c);
        sb.append(", commandDescription=");
        return zr6.l(sb, this.d, ")");
    }
}
