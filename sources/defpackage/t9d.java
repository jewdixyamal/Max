package defpackage;

/* renamed from: t9d  reason: default package */
public final class t9d extends d8d {
    public final boolean X;
    public final long b;
    public final long c;
    public final long o;

    public t9d(long j, long j2, boolean z, long j3) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = z;
    }

    public final void x() {
        au8 n = n();
        n.getClass();
        long j = this.o;
        Long valueOf = Long.valueOf(j);
        boolean z = this.X;
        hm9.m("au8", "updateDelayedAttrs %d, %b", valueOf, Boolean.valueOf(z));
        vlc vlc = ((k24) n.a).c;
        Long valueOf2 = Long.valueOf(j);
        Boolean valueOf3 = Boolean.valueOf(z);
        long j2 = this.c;
        vlc.q(j2, valueOf2, valueOf3);
        n.f.c.remove(Long.valueOf(j2));
        n().x(n().q(j2), iu8.SENDING);
        g6f g6f = new g6f(((hyc) i()).o(), this.b, this.c, this.o, this.X);
        e8d e8d = this.a;
        e8d e8d2 = null;
        if (e8d == null) {
            e8d = null;
        }
        ome.d((ome) e8d.h.getValue(), g6f, true, 1, 4);
        e8d e8d3 = this.a;
        if (e8d3 != null) {
            e8d2 = e8d3;
        }
        ((av0) e8d2.c.getValue()).c(new l6f(this.b, this.c, 0));
    }
}
