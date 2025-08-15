package defpackage;

/* renamed from: my3  reason: default package */
public final class my3 {
    public final eaa a;
    public final int b;
    public final jqe c;

    public my3(eaa eaa, int i, jqe jqe) {
        this.a = eaa;
        this.b = i;
        this.c = jqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my3)) {
            return false;
        }
        my3 my3 = (my3) obj;
        return tpa.f(this.a, my3.a) && this.b == my3.b && tpa.f(this.c, my3.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CountryInfoModel(country=" + this.a + ", maxNumbersSize=" + this.b + ", hint=" + this.c + ")";
    }
}
