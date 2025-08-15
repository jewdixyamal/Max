package defpackage;

/* renamed from: gc1  reason: default package */
public final class gc1 implements jc1 {
    public final eqe X = new eqe(t7a.f);
    public final jqe a;
    public final bfd b;
    public final Integer c = Integer.valueOf(q7a.h);
    public final long o = ((long) r7a.b);

    public gc1(jqe jqe, afd afd) {
        this.a = jqe;
        this.b = afd;
    }

    public final jqe b() {
        return this.a;
    }

    public final bfd c() {
        return this.b;
    }

    public final hfd e() {
        return cfd.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc1)) {
            return false;
        }
        gc1 gc1 = (gc1) obj;
        return tpa.f(this.a, gc1.a) && tpa.f(this.b, gc1.b);
    }

    public final Integer f() {
        return this.c;
    }

    public final long getItemId() {
        return this.o;
    }

    public final jqe getTitle() {
        return this.X;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bfd bfd = this.b;
        return hashCode + (bfd == null ? 0 : bfd.hashCode());
    }

    public final int l() {
        return r7a.m;
    }

    public final String toString() {
        return "OpenCallChat(descriptionRes=" + this.a + ", counterType=" + this.b + ")";
    }

    public final int u() {
        return 0;
    }
}
