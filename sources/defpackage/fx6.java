package defpackage;

/* renamed from: fx6  reason: default package */
public final class fx6 extends n1 implements rx6, uaf {
    public static final fx6 b = new fx6(new uaf[0]);
    public final uaf[] a;

    public fx6(uaf[] uafArr) {
        this.a = uafArr;
    }

    public static void x(StringBuilder sb, uaf uaf) {
        if (h4f.g(((n1) uaf).e())) {
            sb.append(uaf.a());
        } else {
            sb.append(uaf.toString());
        }
    }

    public final String a() {
        uaf[] uafArr = this.a;
        if (uafArr.length == 0) {
            return "{}";
        }
        StringBuilder l = au1.l("{");
        uaf uaf = uafArr[0];
        if (h4f.g(((n1) uaf).e())) {
            l.append(uaf.a());
        } else {
            m1.x(l, uaf.toString());
        }
        l.append(":");
        l.append(uafArr[1].a());
        for (int i = 2; i < uafArr.length; i += 2) {
            l.append(",");
            uaf uaf2 = uafArr[i];
            if (h4f.g(((n1) uaf2).e())) {
                l.append(uaf2.a());
            } else {
                m1.x(l, uaf2.toString());
            }
            l.append(":");
            l.append(uafArr[i + 1].a());
        }
        l.append("}");
        return l.toString();
    }

    public final int e() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uaf = (uaf) obj;
        int e = ((n1) uaf).e();
        if (e == 0) {
            throw null;
        } else if (e != 8) {
            return false;
        } else {
            fx6 g = uaf.g();
            ex6 ex6 = new ex6(this.a);
            g.getClass();
            return ex6.equals(new ex6(g.a));
        }
    }

    public final fx6 g() {
        return this;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            uaf[] uafArr = this.a;
            if (i >= uafArr.length) {
                return i2;
            }
            i2 += uafArr[i + 1].hashCode() ^ uafArr[i].hashCode();
            i += 2;
        }
    }

    public final String toString() {
        uaf[] uafArr = this.a;
        if (uafArr.length == 0) {
            return "{}";
        }
        StringBuilder l = au1.l("{");
        x(l, uafArr[0]);
        l.append(":");
        x(l, uafArr[1]);
        for (int i = 2; i < uafArr.length; i += 2) {
            l.append(",");
            x(l, uafArr[i]);
            l.append(":");
            x(l, uafArr[i + 1]);
        }
        l.append("}");
        return l.toString();
    }

    public final fx6 w() {
        return this;
    }
}
