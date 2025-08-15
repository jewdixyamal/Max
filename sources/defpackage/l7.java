package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: l7  reason: default package */
public final class l7 {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public /* synthetic */ l7(int i, boolean z) {
        this.a = i;
    }

    public d92 a() {
        return new d92(this.b, this.c);
    }

    public void b(long j) {
        if (j == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        this.c = j;
    }

    public double c(long j, long j2) {
        double d;
        long c2 = ote.c(j - this.b, 0);
        long j3 = this.c;
        if (j3 == 0) {
            d = Double.NaN;
        } else {
            d = ((double) (TimeUnit.SECONDS.toMillis(1) * c2)) / ((double) ote.c(j2 - j3, 1));
        }
        this.b = j;
        this.c = j2;
        return d * ((double) 8);
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l7(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public l7(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                return;
            default:
                this.b = 300;
                return;
        }
    }

    public l7(long j, long j2, long j3) {
        this.a = 4;
        this.b = j2;
        this.c = j3;
    }
}
