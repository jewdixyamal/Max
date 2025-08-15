package defpackage;

/* renamed from: tjd  reason: default package */
public final class tjd implements o00 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final yt6 f;
    public final long g;

    public tjd(long j, String str, String str2, String str3, String str4, yt6 yt6, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = yt6;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjd)) {
            return false;
        }
        tjd tjd = (tjd) obj;
        return this.a == tjd.a && tpa.f(this.b, tjd.b) && tpa.f(this.c, tjd.c) && tpa.f(this.d, tjd.d) && tpa.f(this.e, tjd.e) && tpa.f(this.f, tjd.f) && this.g == tjd.g;
    }

    public final int hashCode() {
        int d2 = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        yt6 yt6 = this.f;
        if (yt6 != null) {
            i = yt6.hashCode();
        }
        return Long.hashCode(this.g) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttachModel(shareId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", host=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", previewConfig=");
        sb.append(this.f);
        sb.append(", messageId=");
        return zr6.k(sb, this.g, ")");
    }
}
