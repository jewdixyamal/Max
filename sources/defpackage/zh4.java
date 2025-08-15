package defpackage;

/* renamed from: zh4  reason: default package */
public final class zh4 {
    public final String a;
    public final String b;
    public final String c;

    public zh4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zh4.class != obj.getClass()) {
            return false;
        }
        zh4 zh4 = (zh4) obj;
        return maf.a(this.a, zh4.a) && maf.a(this.b, zh4.b) && maf.a(this.c, zh4.c);
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
