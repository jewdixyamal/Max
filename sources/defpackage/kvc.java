package defpackage;

/* renamed from: kvc  reason: default package */
public final class kvc {
    public final long a;
    public final String b;
    public final gg1 c;
    public final long d;
    public final int e;

    public kvc(long j, String str, gg1 gg1, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = gg1;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvc)) {
            return false;
        }
        kvc kvc = (kvc) obj;
        return this.a == kvc.a && tpa.f(this.b, kvc.b) && tpa.f(this.c, kvc.c) && this.d == kvc.d && this.e == kvc.e;
    }

    public final int hashCode() {
        return au1.s(this.e) + h4f.m((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenRecordBroadcastData(id=");
        sb.append(this.a);
        sb.append(", streamId=");
        sb.append(this.b);
        sb.append(", initiatorId=");
        sb.append(this.c);
        sb.append(", startTimeMs=");
        sb.append(this.d);
        sb.append(", recordType=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "RECORD" : "STREAM" : "NOTHING");
        sb.append(")");
        return sb.toString();
    }
}
