package defpackage;

import java.io.Serializable;

/* renamed from: op3  reason: default package */
public final class op3 implements Serializable {
    public final String a;
    public final np3 b;
    public final String c;

    public op3(String str, np3 np3, String str2) {
        this.a = str;
        this.b = np3;
        this.c = str2;
    }

    public final String a() {
        np3 np3 = np3.b;
        String str = this.a;
        np3 np32 = this.b;
        if (np32 == np3 || np32 == np3.a) {
            String str2 = this.c;
            if (oag.u(str2)) {
                return rh4.j(str, " ", str2);
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{firstName='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.b);
        sb.append("', lastName=");
        return zr6.l(sb, this.c, "}");
    }
}
