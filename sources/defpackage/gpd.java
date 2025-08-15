package defpackage;

/* renamed from: gpd  reason: default package */
public final class gpd {
    public final long a;
    public final pcc b;
    public final bg1 c;
    public final long d;
    public final String e;
    public final String f;

    public gpd(long j, pcc pcc, bg1 bg1, long j2, String str, String str2) {
        this.a = j;
        this.b = pcc;
        this.c = bg1;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpd)) {
            return false;
        }
        gpd gpd = (gpd) obj;
        return this.a == gpd.a && this.b == gpd.b && tpa.f(this.c, gpd.c) && this.d == gpd.d && tpa.f(this.e, gpd.e) && tpa.f(this.f, gpd.f);
    }

    public final int hashCode() {
        int m = h4f.m((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        int i = 0;
        String str = this.e;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(this.a);
        sb.append(", recordType=");
        sb.append(this.b);
        sb.append(", initiator=");
        sb.append(this.c);
        sb.append(", recordStartTime=");
        sb.append(this.d);
        sb.append(", recordExternalMovieId=");
        sb.append(this.e);
        sb.append(", recordExternalOwnerId=");
        return zr6.l(sb, this.f, ")");
    }
}
