package defpackage;

/* renamed from: qhg  reason: default package */
public final class qhg extends rhg {
    public final /* synthetic */ rhg X;
    public final transient int c;
    public final transient int o;

    public qhg(rhg rhg, int i, int i2) {
        this.X = rhg;
        this.c = i;
        this.o = i2;
    }

    public final Object[] a() {
        return this.X.a();
    }

    public final int b() {
        return this.X.b() + this.c;
    }

    public final int c() {
        return this.X.b() + this.c + this.o;
    }

    public final boolean d() {
        return true;
    }

    /* renamed from: f */
    public final rhg subList(int i, int i2) {
        lz7.b0(i, i2, this.o);
        int i3 = this.c;
        return this.X.subList(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        lz7.a0(i, this.o);
        return this.X.get(i + this.c);
    }

    public final int size() {
        return this.o;
    }
}
