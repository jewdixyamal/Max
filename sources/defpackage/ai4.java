package defpackage;

/* renamed from: ai4  reason: default package */
public final class ai4 {
    public final String a;
    public final String b;
    public final String c;

    public ai4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ai4.class != obj.getClass()) {
            return false;
        }
        ai4 ai4 = (ai4) obj;
        return oaf.a(this.a, ai4.a) && oaf.a(this.b, ai4.b) && oaf.a(this.c, ai4.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
