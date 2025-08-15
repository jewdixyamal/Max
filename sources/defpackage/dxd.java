package defpackage;

import java.math.BigInteger;

/* renamed from: dxd  reason: default package */
public final class dxd extends fxd {
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dxd(long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, long j2, long j3, String str2, long j4, long j5, long j6, long j7, long j8, long j9, bkb bkb) {
        super(1, j, str, bigInteger, bigInteger2, bigInteger3, j3, str2, bkb);
        this.l = j2;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = j8;
        this.r = j9;
    }

    public final String toString() {
        return "AudioRecv{ssrc=" + this.c + ", transportId='" + this.d + "', trackId='" + this.e + "', packetsReceived=" + this.h + ", packetsLost=" + this.i + ", bytesReceived=" + this.j + ", jitterBufferMs=" + this.k + ", audioOutputLevel=" + this.l + ", unknown=" + this.g + '}';
    }
}
