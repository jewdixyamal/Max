package defpackage;

import java.util.List;

/* renamed from: ec2  reason: default package */
public final class ec2 extends pi0 {
    public final long X;
    public final int Y;
    public final mg4 Z;
    public final long b;
    public final long c;
    public final long o;
    public final List s0;

    public ec2(long j, long j2, long j3, long j4, int i, mg4 mg4, List list) {
        super(j);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = j4;
        this.Y = i;
        this.Z = mg4;
        this.s0 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec2)) {
            return false;
        }
        ec2 ec2 = (ec2) obj;
        return this.b == ec2.b && this.c == ec2.c && this.o == ec2.o && this.X == ec2.X && this.Y == ec2.Y && this.Z == ec2.Z && tpa.f(this.s0, ec2.s0);
    }

    public final int hashCode() {
        int e = k7d.e(this.Y, h4f.m(h4f.m(h4f.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o), 31, this.X), 31);
        return this.s0.hashCode() + ((this.Z.hashCode() + e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEvent(requestId=");
        sb.append(this.b);
        sb.append(", chatId=");
        sb.append(this.c);
        sb.append(", startTime=");
        sb.append(this.o);
        sb.append(", endTime=");
        sb.append(this.X);
        sb.append(", count=");
        sb.append(this.Y);
        sb.append(", itemType=");
        sb.append(this.Z);
        sb.append(", messageIds=");
        return au1.i(sb, this.s0, ")");
    }
}
