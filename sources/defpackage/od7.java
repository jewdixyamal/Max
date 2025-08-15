package defpackage;

/* renamed from: od7  reason: default package */
public final class od7 {
    public static final String c = Integer.toString(0, 36);
    public static final String d = Integer.toString(1, 36);
    public final String a;
    public final String b;

    static {
        int i = oaf.a;
    }

    public od7(String str, String str2) {
        this.a = oaf.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || od7.class != obj.getClass()) {
            return false;
        }
        od7 od7 = (od7) obj;
        return oaf.a(this.a, od7.a) && oaf.a(this.b, od7.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
