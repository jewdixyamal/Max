package defpackage;

/* renamed from: pne  reason: default package */
public final class pne {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;

    public pne(one one2) {
        long j2 = one2.a;
        this.a = j2;
        String str = one2.b;
        this.b = str;
        this.c = one2.c;
        this.d = one2.d;
        this.e = one2.e;
        this.f = one2.f;
        this.j = one2.j;
        this.k = one2.k;
        this.g = one2.g;
        this.h = one2.h;
        this.i = one2.i;
        this.l = one2.l;
        this.m = one2.m;
        this.n = one2.n;
        this.o = (j2 * 31) + ((long) str.hashCode());
    }

    public final boolean a() {
        return this.c > 0 || this.d > 0 || this.e > 0 || this.j > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        sb.append(this.a);
        sb.append(", attachId='");
        sb.append(this.b);
        sb.append("', videoId=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", mp4GifId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', notifyProgress=");
        sb.append(this.h);
        sb.append(", checkAutoLoadConnection=");
        sb.append(this.i);
        sb.append(", fileId=");
        sb.append(this.j);
        sb.append(", fileName='");
        sb.append(this.k);
        sb.append("', invalidateCount=");
        sb.append(this.l);
        sb.append(", useOriginalExtension=");
        sb.append(this.m);
        sb.append(", notCopyVideoToGallery=");
        return au1.j(sb, this.n, "}");
    }
}
