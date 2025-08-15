package defpackage;

/* renamed from: zc1  reason: default package */
public final class zc1 implements bd1 {
    public final String a;

    public zc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc1) && tpa.f(this.a, ((zc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Create(link="), this.a, ")");
    }
}
