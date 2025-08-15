package defpackage;

/* renamed from: yg1  reason: default package */
public final class yg1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public yg1(long j, long j2, String str, String str2, String str3, boolean z, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg1)) {
            return false;
        }
        yg1 yg1 = (yg1) obj;
        return this.a == yg1.a && this.b == yg1.b && tpa.f(this.c, yg1.c) && tpa.f(this.d, yg1.d) && tpa.f(this.e, yg1.e) && this.f == yg1.f && tpa.f(this.g, yg1.g);
    }

    public final int hashCode() {
        int m = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int d2 = ms2.d((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallPush(callerId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", conversationId=");
        sb.append(this.c);
        sb.append(", callerName=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", isVideo=");
        sb.append(this.f);
        sb.append(", conversationParams=");
        return zr6.l(sb, this.g, ")");
    }
}
