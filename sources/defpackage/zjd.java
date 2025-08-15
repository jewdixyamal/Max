package defpackage;

/* renamed from: zjd  reason: default package */
public final class zjd {
    public final jqe a;
    public final jqe b;
    public final String c;
    public final Integer d;

    public zjd(eqe eqe, jqe jqe, String str, Integer num) {
        this.a = eqe;
        this.b = jqe;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjd)) {
            return false;
        }
        zjd zjd = (zjd) obj;
        return tpa.f(this.a, zjd.a) && tpa.f(this.b, zjd.b) && tpa.f(this.c, zjd.c) && tpa.f(this.d, zjd.d) && tpa.f((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        jqe jqe = this.b;
        int hashCode2 = (hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return (hashCode3 + i) * 31;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=null)";
    }
}
