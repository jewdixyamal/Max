package defpackage;

/* renamed from: pp1  reason: default package */
public final class pp1 {
    public final boolean a;

    public pp1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp1) && this.a == ((pp1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("PromotionApproved(approved="), this.a, ")");
    }
}
