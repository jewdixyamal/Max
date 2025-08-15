package defpackage;

/* renamed from: kef  reason: default package */
public final class kef {
    public final lef a;
    public final boolean b;
    public final String c;
    public final String d;

    public kef(w36 w36) {
        this.a = (lef) w36.b;
        this.b = w36.a;
        this.c = (String) w36.c;
        this.d = (String) w36.o;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, w36] */
    public final w36 a() {
        ? obj = new Object();
        obj.b = this.a;
        obj.a = this.b;
        obj.c = this.c;
        obj.o = this.d;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kef.class != obj.getClass()) {
            return false;
        }
        kef kef = (kef) obj;
        if (this.b != kef.b) {
            return false;
        }
        lef lef = kef.a;
        lef lef2 = this.a;
        if (lef2 == null ? lef != null : !lef2.equals(lef)) {
            return false;
        }
        String str = kef.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = kef.d;
        String str4 = this.d;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        int i = 0;
        lef lef = this.a;
        int hashCode = (((lef != null ? lef.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConversion{videoConversionData=");
        sb.append(this.a);
        sb.append(", finished=");
        sb.append(this.b);
        sb.append(", preparedPath='");
        sb.append(this.c);
        sb.append("', resultPath='");
        return zr6.l(sb, this.d, "'}");
    }
}
