package defpackage;

/* renamed from: y9g  reason: default package */
public final class y9g {
    public final py5 a;
    public final String b;

    public y9g(py5 py5, String str) {
        this.a = py5;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y9g.class != obj.getClass()) {
            return false;
        }
        y9g y9g = (y9g) obj;
        py5 py5 = y9g.a;
        py5 py52 = this.a;
        if (py52 == null ? py5 != null : !py52.equals(py5)) {
            return false;
        }
        String str = y9g.b;
        String str2 = this.b;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        int i = 0;
        py5 py5 = this.a;
        int hashCode = (py5 != null ? py5.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YtFile{format=");
        sb.append(this.a);
        sb.append(", url='");
        return zr6.l(sb, this.b, "'}");
    }
}
