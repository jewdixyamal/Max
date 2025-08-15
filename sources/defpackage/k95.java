package defpackage;

/* renamed from: k95  reason: default package */
public final class k95 extends gle {
    public final Long c;
    public final String o;

    public k95(String str, Long l) {
        this.c = l;
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k95)) {
            return false;
        }
        k95 k95 = (k95) obj;
        return tpa.f(this.c, k95.c) && tpa.f(this.o, k95.o);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.c;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(botId=" + this.c + ", startParams=" + this.o + ")";
    }
}
