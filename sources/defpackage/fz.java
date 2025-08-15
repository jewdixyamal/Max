package defpackage;

/* renamed from: fz  reason: default package */
public final class fz {
    public final String a;
    public final String b;
    public final Integer c;

    public fz(String str, Integer num, String str2) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return tpa.f(this.a, fzVar.a) && tpa.f(this.b, fzVar.b) && tpa.f(this.c, fzVar.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AttachData(attachName=" + this.a + ", image=" + this.b + ", placeholder=" + this.c + ")";
    }
}
