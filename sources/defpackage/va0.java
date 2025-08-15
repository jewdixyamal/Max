package defpackage;

/* renamed from: va0  reason: default package */
public final class va0 {
    public final String a;
    public final String b;

    public va0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof va0)) {
            return false;
        }
        va0 va0 = (va0) obj;
        return this.a.equals(va0.a) && this.b.equals(va0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return zr6.l(sb, this.b, "}");
    }
}
