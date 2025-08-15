package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ya0  reason: default package */
public final class ya0 extends ws7 {
    public final long a;
    public final long b;
    public final o33 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final hqb g;

    public ya0(long j, long j2, z90 z90, Integer num, String str, ArrayList arrayList) {
        hqb hqb = hqb.a;
        this.a = j;
        this.b = j2;
        this.c = z90;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = hqb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ws7)) {
            return false;
        }
        ws7 ws7 = (ws7) obj;
        if (this.a == ((ya0) ws7).a) {
            ya0 ya0 = (ya0) ws7;
            if (this.b == ya0.b) {
                o33 o33 = ya0.c;
                o33 o332 = this.c;
                if (o332 != null ? o332.equals(o33) : o33 == null) {
                    Integer num = ya0.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = ya0.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = ya0.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                hqb hqb = ya0.g;
                                hqb hqb2 = this.g;
                                if (hqb2 == null) {
                                    if (hqb == null) {
                                        return true;
                                    }
                                } else if (hqb2.equals(hqb)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i2 = 0;
        o33 o33 = this.c;
        int hashCode = (i ^ (o33 == null ? 0 : o33.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        hqb hqb = this.g;
        if (hqb != null) {
            i2 = hqb.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
