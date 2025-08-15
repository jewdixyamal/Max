package defpackage;

import java.util.List;

/* renamed from: yg6  reason: default package */
public final class yg6 implements ah6 {
    public final String a;
    public final jqe b;
    public final List c;

    public yg6(String str, jqe jqe, List list) {
        this.a = str;
        this.b = jqe;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg6)) {
            return false;
        }
        yg6 yg6 = (yg6) obj;
        return tpa.f(this.a, yg6.a) && tpa.f(this.b, yg6.b) && tpa.f(this.c, yg6.c);
    }

    public final int hashCode() {
        int f = k7d.f(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return f + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(conversationId=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", avatarInfo=");
        return au1.i(sb, this.c, ")");
    }
}
