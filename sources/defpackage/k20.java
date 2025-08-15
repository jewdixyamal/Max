package defpackage;

import java.util.Arrays;

/* renamed from: k20  reason: default package */
public final class k20 {
    public static final k20 r = new h20().a();
    public final long a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final byte[] j;
    public final long k;
    public final j20 l;
    public final String m;
    public final uy n;
    public final boolean o;
    public final int p;
    public final int q;

    public k20(h20 h20) {
        this.a = h20.a;
        this.b = h20.q;
        this.c = h20.b;
        this.d = h20.c;
        this.e = h20.d;
        this.f = h20.e;
        this.g = h20.f;
        this.h = h20.g;
        this.i = h20.h;
        this.j = h20.i;
        this.k = h20.j;
        this.l = h20.k;
        this.m = h20.l;
        this.n = h20.m;
        this.o = h20.n;
        this.p = h20.o;
        this.q = h20.p;
    }

    public final h20 a() {
        h20 h20 = new h20();
        h20.a = this.a;
        h20.q = this.b;
        h20.b = this.c;
        h20.c = this.d;
        h20.d = this.e;
        h20.e = this.f;
        h20.f = this.g;
        h20.g = this.h;
        h20.h = this.i;
        h20.i = this.j;
        h20.j = this.k;
        h20.k = this.l;
        h20.l = this.m;
        h20.m = this.n;
        h20.n = this.o;
        h20.o = this.p;
        h20.p = this.q;
        return h20;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.j);
        StringBuilder sb = new StringBuilder("Video{videoId=");
        sb.append(this.a);
        sb.append(", videoType=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "VIDEO_MESSAGE" : "VIDEO");
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", thumbnail='");
        sb.append(this.d);
        sb.append("', width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", live=");
        sb.append(this.g);
        sb.append(", externalUrl='");
        sb.append(this.h);
        sb.append("', externalSiteName='");
        sb.append(this.i);
        sb.append("', previewData=");
        sb.append(arrays);
        sb.append(", startTime=");
        sb.append(this.k);
        sb.append(", convertOptions=");
        sb.append(this.l);
        sb.append(", token='");
        sb.append(this.m);
        sb.append("', videoCollage=");
        sb.append(this.n);
        sb.append(", ignoreAutoplay=");
        sb.append(this.o);
        sb.append(", audioTrackIndex=");
        sb.append(this.p);
        sb.append(", audioGroupIndex=");
        return zr6.j(sb, this.q, "}");
    }
}
