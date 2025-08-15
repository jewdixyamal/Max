package defpackage;

import java.io.Serializable;

/* renamed from: pke  reason: default package */
public class pke extends zje implements Serializable {
    public final yje X;
    public final String b;
    public final String c;
    public final String o;

    public pke(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = new yje(rh4.j(str, " ", str2), str3);
    }

    public String toString() {
        StringBuilder o2 = rh4.o(getClass().getSimpleName(), "{error='");
        o2.append(this.b);
        o2.append("', message='");
        o2.append(this.c);
        o2.append("', localizedMessage='");
        return zr6.l(o2, this.o, "'}");
    }
}
