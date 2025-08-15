package defpackage;

/* renamed from: e08  reason: default package */
public final class e08 {
    public final er7 a;
    public final long b;
    public final long c;
    public final i08 d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final String l;

    public e08(d08 d08) {
        this.a = d08.a;
        this.b = d08.b;
        this.c = d08.c;
        this.d = d08.d;
        this.e = d08.e;
        this.f = d08.f;
        this.g = d08.g;
        this.h = d08.h;
        this.i = d08.i;
        this.j = d08.j;
        this.k = d08.k;
        this.l = d08.l;
    }

    public final d08 a() {
        d08 d08 = new d08(this.a);
        d08.b = this.b;
        d08.c = this.c;
        d08.d = this.d;
        d08.e = this.e;
        d08.f = this.f;
        d08.g = this.g;
        d08.h = this.h;
        d08.i = this.i;
        d08.j = this.j;
        d08.k = this.k;
        d08.l = this.l;
        return d08;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerData{location=");
        sb.append(this.a);
        sb.append(", contactId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", markerWeight=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.e);
        sb.append("', address='");
        sb.append(this.f);
        sb.append("', distance=");
        sb.append(this.g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", decoding=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", active=");
        sb.append(this.k);
        sb.append(", deviceId='");
        return zr6.l(sb, this.l, "'}");
    }
}
