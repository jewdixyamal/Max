package defpackage;

import java.util.Objects;

/* renamed from: jl3  reason: default package */
public final class jl3 {
    public static final jl3 e = new jl3("", il3.o, "");
    public final String a;
    public final String b;
    public final il3 c;
    public String d = null;

    public jl3(String str, il3 il3, String str2) {
        this.a = str;
        this.c = il3;
        this.b = str2;
    }

    public final String a() {
        if (equals(e) || this.c == il3.o) {
            return "";
        }
        String str = this.b;
        boolean u = oag.u(str);
        String str2 = this.a;
        if (!u) {
            return oag.t(str2) ? "" : str2;
        }
        if (this.d == null) {
            this.d = str2 + " " + str;
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl3)) {
            return false;
        }
        jl3 jl3 = (jl3) obj;
        return this.c == jl3.c && Objects.equals(this.a, jl3.a) && this.b.equals(jl3.b);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.b);
        return Objects.hashCode(this.c) + ((hashCode + (Objects.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = rh4.o(jl3.class.getSimpleName(), "type=");
        o.append(this.c);
        o.append(",f=");
        o.append(oag.u(this.a));
        o.append(",l=");
        o.append(oag.u(this.b));
        return o.toString();
    }
}
