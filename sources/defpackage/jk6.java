package defpackage;

import java.util.List;

/* renamed from: jk6  reason: default package */
public final class jk6 {
    public final long a;
    public final List b;

    public jk6(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk6)) {
            return false;
        }
        jk6 jk6 = (jk6) obj;
        return this.a == jk6.a && tpa.f(this.b, jk6.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "HighlightTextState(messageLocalId=" + this.a + ", highlights=" + this.b + ")";
    }
}
