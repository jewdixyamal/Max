package defpackage;

/* renamed from: kb0  reason: default package */
public final class kb0 {
    public final Integer a;

    public kb0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0 = (kb0) obj;
        Integer num = this.a;
        return num == null ? kb0.a == null : num.equals(kb0.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
