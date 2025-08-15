package defpackage;

/* renamed from: ta0  reason: default package */
public final class ta0 {
    public final String a;
    public final String b;
    public final String c;
    public final gc0 d;
    public final int e;

    public ta0(String str, String str2, String str3, gc0 gc0, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gc0;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0 = (ta0) obj;
        String str = this.a;
        if (str != null ? str.equals(ta0.a) : ta0.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(ta0.b) : ta0.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(ta0.c) : ta0.c == null) {
                    gc0 gc0 = this.d;
                    if (gc0 != null ? gc0.equals(ta0.d) : ta0.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (ta0.e == 0) {
                                return true;
                            }
                        } else if (au1.c(i, ta0.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        gc0 gc0 = this.d;
        int hashCode4 = (hashCode3 ^ (gc0 == null ? 0 : gc0.hashCode())) * 1000003;
        int i2 = this.e;
        if (i2 != 0) {
            i = au1.s(i2);
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
