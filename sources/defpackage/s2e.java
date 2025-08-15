package defpackage;

import java.util.List;

/* renamed from: s2e  reason: default package */
public final class s2e extends mi0 {
    public final int A0;
    public final String B0;
    public final int X;
    public final String Y;
    public final long Z;
    public final long c;
    public final int o;
    public final String s0;
    public final String t0;
    public final String u0;
    public final List v0;
    public final int w0;
    public final long x0;
    public final String y0;
    public final boolean z0;

    public s2e(r2e r2e) {
        super(r2e.a);
        this.c = r2e.b;
        this.o = r2e.c;
        this.X = r2e.d;
        this.Y = r2e.e;
        this.Z = r2e.f;
        this.s0 = r2e.g;
        this.t0 = r2e.h;
        this.u0 = r2e.i;
        this.v0 = r2e.j;
        this.w0 = r2e.k;
        this.x0 = r2e.l;
        this.y0 = r2e.m;
        this.z0 = r2e.n;
        this.A0 = r2e.o;
        this.B0 = r2e.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerDb{stickerId=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.o);
        sb.append(", height=");
        sb.append(this.X);
        sb.append(", url='");
        sb.append(this.Y);
        sb.append("', updateTime=");
        sb.append(this.Z);
        sb.append(", mp4url='");
        sb.append(this.s0);
        sb.append("', firstUrl='");
        sb.append(this.t0);
        sb.append("', previewUrl='");
        sb.append(this.u0);
        sb.append("', tags='");
        sb.append(this.v0);
        sb.append("', token='null', stickerType=");
        sb.append(k7d.s(this.w0));
        sb.append(", setId=");
        sb.append(this.x0);
        sb.append(", lottieUrl='");
        sb.append(this.y0);
        sb.append("', audio=");
        sb.append(this.z0);
        sb.append(", authorType=");
        sb.append(k7d.q(this.A0));
        sb.append(", videoUrl='");
        return zr6.l(sb, this.B0, "'}");
    }
}
