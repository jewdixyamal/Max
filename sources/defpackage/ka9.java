package defpackage;

import org.apache.http.entity.ContentLengthStrategy;

/* renamed from: ka9  reason: default package */
public final class ka9 implements pn7 {
    public final n64 a = new n64(1);
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public int g;

    public ka9(ve veVar) {
        String name = ka9.class.getName();
        this.b = ((long) veVar.a) * 1000;
        this.c = ((long) veVar.b) * 1000;
        this.d = ((long) veVar.c) * 1000;
        this.e = ((long) veVar.d) * 1000;
        this.f = veVar.e;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, toString(), (Throwable) null);
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean b(long j) {
        boolean z = j > this.c ? false : j < this.b ? true : true;
        return z || (z && !(this.a.a() >= this.g));
    }

    public final void c(j4b j4b) {
        this.g = 0;
        n64 n64 = this.a;
        synchronized (n64) {
            if (n64.b) {
                n64.c(0);
            }
        }
    }

    public final void d(j4b j4b) {
        this.g = 0;
        n64 n64 = this.a;
        synchronized (n64) {
            if (n64.b) {
                n64.c(0);
            }
        }
    }

    public final boolean e(long j, boolean z) {
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    public final long f() {
        return 0;
    }

    public final void g(j4b j4b) {
        this.g = 0;
    }

    public final void h(j4b j4b, vj0[] vj0Arr, n85[] n85Arr) {
        int i;
        int i2;
        this.g = 0;
        int length = vj0Arr.length;
        for (int i3 = 0; i3 < length; i3++) {
            n85 n85 = n85Arr[i3];
            if (n85 != null) {
                qy5 j = n85.j();
                int i4 = this.g;
                int i5 = j.o;
                if (i5 != -1) {
                    i = this.f * i5;
                } else {
                    int i6 = vj0Arr[i3].b;
                    i = 65536;
                    switch (i6) {
                        case ContentLengthStrategy.CHUNKED /*-2*/:
                            i = 0;
                            break;
                        case 0:
                            i2 = 5373952;
                            break;
                        case 1:
                        case 3:
                            break;
                        case 2:
                            i2 = 5242880;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i = 131072;
                            break;
                        default:
                            throw new IllegalArgumentException(zr6.h(i6, "Unexpected type of the track="));
                    }
                    i = i2;
                }
                this.g = i4 + i;
                continue;
            }
        }
        this.a.c(this.g);
    }

    public final n64 j() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinSizeLoadControl(\n        minBufferUs=");
        sb.append(this.b);
        sb.append("\n        maxBufferUs=");
        sb.append(this.c);
        sb.append("\n        playbackBufferUs=");
        sb.append(this.d);
        sb.append("\n        playbackBufferAfterRebufferUs=");
        sb.append(this.e);
        sb.append("\n        formatMaxInputSizeScaleUpFactor=");
        return zr6.j(sb, this.f, "\n        )\n        ");
    }
}
