package defpackage;

/* renamed from: vd5  reason: default package */
public final class vd5 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final Long e;
    public final long f;
    public final Long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;

    public vd5(long j2, long j3, long j4, int i2, Long l2, long j5, Long l3, String str, long j6, long j7, String str2, long j8, long j9) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = i2;
        this.e = l2;
        this.f = j5;
        this.g = l3;
        this.h = str;
        this.i = j6;
        this.j = j7;
        this.k = str2;
        this.l = j8;
        this.m = j9;
    }

    public static vd5 a(vd5 vd5) {
        vd5 vd52 = vd5;
        return new vd5(vd52.a, vd52.b, vd52.c, 3, vd52.e, vd52.f, vd52.g, vd52.h, vd52.i, vd52.j, vd52.k, vd52.l, vd52.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd5)) {
            return false;
        }
        vd5 vd5 = (vd5) obj;
        return this.a == vd5.a && this.b == vd5.b && this.c == vd5.c && this.d == vd5.d && tpa.f(this.e, vd5.e) && this.f == vd5.f && tpa.f(this.g, vd5.g) && tpa.f(this.h, vd5.h) && this.i == vd5.i && this.j == vd5.j && tpa.f(this.k, vd5.k) && this.l == vd5.l && this.m == vd5.m;
    }

    public final int hashCode() {
        int g2 = ey8.g(this.d, h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        int i2 = 0;
        Long l2 = this.e;
        int m2 = h4f.m((g2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f);
        Long l3 = this.g;
        int hashCode = (m2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Long.hashCode(this.m) + h4f.m(rh4.d(h4f.m(h4f.m((hashCode + i2) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsEntryDb(pushId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", analyticsStatus=");
        int i2 = this.d;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "SENT" : "NOT_SENT" : "UNDEFINED");
        sb.append(", senderUserId=");
        sb.append(this.e);
        sb.append(", contentLength=");
        sb.append(this.f);
        sb.append(", sentTime=");
        sb.append(this.g);
        sb.append(", eventKey=");
        sb.append(this.h);
        sb.append(", fcmSentTime=");
        sb.append(this.i);
        sb.append(", receivedTime=");
        sb.append(this.j);
        sb.append(", pushType=");
        sb.append(this.k);
        sb.append(", time=");
        sb.append(this.l);
        sb.append(", createdTime=");
        return zr6.k(sb, this.m, ")");
    }
}
