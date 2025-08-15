package defpackage;

import java.util.List;

/* renamed from: z6c  reason: default package */
public final class z6c {
    public final String a;
    public final long b;
    public final List c;

    public z6c(long j, String str, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6c)) {
            return false;
        }
        z6c z6c = (z6c) obj;
        return tpa.f(this.a, z6c.a) && this.b == z6c.b && tpa.f(this.c, z6c.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsSectionEntity(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", reactions=");
        return au1.i(sb, this.c, ")");
    }
}
