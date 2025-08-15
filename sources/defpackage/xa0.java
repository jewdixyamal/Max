package defpackage;

import java.util.Arrays;

/* renamed from: xa0  reason: default package */
public final class xa0 extends qs7 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final sn9 g;

    public xa0(long j, Integer num, long j2, byte[] bArr, String str, long j3, bb0 bb0) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = bb0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qs7)) {
            return false;
        }
        qs7 qs7 = (qs7) obj;
        if (this.a == ((xa0) qs7).a && ((num = this.b) != null ? num.equals(((xa0) qs7).b) : ((xa0) qs7).b == null)) {
            xa0 xa0 = (xa0) qs7;
            if (this.c == xa0.c) {
                if (Arrays.equals(this.d, qs7 instanceof xa0 ? ((xa0) qs7).d : xa0.d)) {
                    String str = xa0.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == xa0.f) {
                            sn9 sn9 = xa0.g;
                            sn9 sn92 = this.g;
                            if (sn92 == null) {
                                if (sn9 == null) {
                                    return true;
                                }
                            } else if (sn92.equals(sn9)) {
                                return true;
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        sn9 sn9 = this.g;
        if (sn9 != null) {
            i2 = sn9.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
