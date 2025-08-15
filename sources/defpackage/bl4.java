package defpackage;

/* renamed from: bl4  reason: default package */
public final class bl4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public bl4(cl4 cl4) {
        this.a = tu0.r(1, new zk4(cl4, 1));
        this.b = tu0.r(1, new al4(this, cl4, 0));
        this.c = tu0.r(1, new zk4(cl4, 2));
        this.d = tu0.r(1, new al4(this, cl4, 1));
        this.e = tu0.r(1, new zk4(cl4, this));
        this.f = tu0.r(1, new al4(this, cl4, 2));
    }

    public final du0 a() {
        return (du0) this.b.getValue();
    }
}
