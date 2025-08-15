package defpackage;

/* renamed from: hv6  reason: default package */
public final class hv6 implements ide {
    public final /* synthetic */ iv6 a;
    public final /* synthetic */ wv6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vv6 d;

    public hv6(iv6 iv6, wv6 wv6, Object obj) {
        vv6 vv6 = vv6.FULL_FETCH;
        this.a = iv6;
        this.b = wv6;
        this.c = obj;
        this.d = vv6;
    }

    public final Object get() {
        return this.a.b(this.b, this.c, this.d, (uhc) null, (String) null);
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.e(this.b.b, "uri");
        return r0.toString();
    }
}
