package defpackage;

/* renamed from: kv4  reason: default package */
public final class kv4 {
    public tb8 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public vv4 g;

    public final lv4 a() {
        return new lv4(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(long j) {
        fm9.f(j > 0);
        this.e = j;
    }

    public final void c(vv4 vv4) {
        this.g = vv4;
    }

    public final void d(tb8 tb8) {
        this.a = tb8;
    }

    public final void e() {
        this.b = true;
    }

    public final void f() {
        this.c = true;
    }
}
