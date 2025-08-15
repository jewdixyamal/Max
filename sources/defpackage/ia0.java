package defpackage;

/* renamed from: ia0  reason: default package */
public final class ia0 {
    public final Object a;
    public final kb0 b;

    public ia0(a99 a99, kb0 kb0) {
        this.a = a99;
        this.b = kb0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        ia0 ia0 = (ia0) obj;
        ia0.getClass();
        if (this.a.equals(ia0.a)) {
            z8b z8b = z8b.a;
            if (z8b.equals(z8b)) {
                kb0 kb0 = ia0.b;
                kb0 kb02 = this.b;
                if (kb02 == null) {
                    if (kb0 == null) {
                        return true;
                    }
                } else if (kb02.equals(kb0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ z8b.a.hashCode()) * 1000003;
        kb0 kb0 = this.b;
        return (kb0 == null ? 0 : kb0.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + z8b.a + ", productData=" + this.b + "}";
    }
}
