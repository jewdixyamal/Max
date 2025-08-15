package defpackage;

import java.util.List;

/* renamed from: ond  reason: default package */
public final class ond implements s29 {
    public final long a;
    public final String b;
    public final kv0 c;
    public final fv0 d;
    public final jqe e;
    public final jqe f;
    public final List g;

    public ond(long j, String str, kv0 kv0, fv0 fv0, eqe eqe, eqe eqe2, List list) {
        this.a = j;
        this.b = str;
        this.c = kv0;
        this.d = fv0;
        this.e = eqe;
        this.f = eqe2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ond)) {
            return false;
        }
        ond ond = (ond) obj;
        return this.a == ond.a && tpa.f(this.b, ond.b) && tpa.f(this.c, ond.c) && tpa.f(this.d, ond.d) && tpa.f(this.e, ond.e) && tpa.f(this.f, ond.f) && tpa.f(this.g, ond.g);
    }

    public final int hashCode() {
        int f2 = k7d.f((this.d.hashCode() + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        jqe jqe = this.f;
        return this.g.hashCode() + ((f2 + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowShareContactForBotConfirmation(messageId=");
        sb.append(this.a);
        sb.append(", keyboardId=");
        sb.append(this.b);
        sb.append(", buttonPosition=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", buttons=");
        return au1.i(sb, this.g, ")");
    }
}
