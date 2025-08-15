package defpackage;

import java.util.List;

/* renamed from: q0d  reason: default package */
public final class q0d {
    public final sp3 a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final long g;
    public final int h;
    public final boolean i;
    public final long j;
    public final List k;
    public final List l;
    public final String m;
    public final List n;

    public q0d(p0d p0d) {
        this.a = p0d.a;
        this.b = p0d.b;
        this.c = p0d.c;
        this.d = p0d.d;
        this.e = p0d.e;
        this.f = p0d.f;
        this.g = p0d.g;
        this.i = p0d.i;
        this.h = p0d.h;
        this.j = p0d.j;
        this.k = p0d.k;
        this.l = p0d.l;
        this.m = p0d.m;
        this.n = p0d.n;
    }

    public final String toString() {
        int o = s5c.o(this.d);
        int o2 = s5c.o(this.e);
        int o3 = s5c.o(this.k);
        int o4 = s5c.o(this.l);
        int o5 = s5c.o(this.n);
        StringBuilder sb = new StringBuilder("Section{type=");
        sb.append(this.a);
        sb.append(", id='");
        sb.append(this.b);
        sb.append("', title='");
        sb.append(this.c);
        sb.append("', stickers=");
        sb.append(o);
        sb.append(", stickerSets=");
        sb.append(o2);
        sb.append(", marker=");
        sb.append(this.g);
        sb.append(", totalCount=");
        sb.append(this.h);
        sb.append(", collapsed=");
        sb.append(this.i);
        sb.append(", updateTime=");
        sb.append(this.j);
        sb.append(", recentEmojiList=");
        sb.append(o3);
        sb.append(", recentsList=");
        sb.append(o4);
        sb.append(", animojiSets=");
        sb.append(o5);
        sb.append(", mode='");
        return zr6.l(sb, this.m, "'}");
    }
}
