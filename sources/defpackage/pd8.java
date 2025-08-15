package defpackage;

/* renamed from: pd8  reason: default package */
public final class pd8 implements y88, n3b {
    public final bj8 a;
    public final qh8 b;

    public pd8(bj8 bj8, qh8 qh8) {
        this.a = bj8;
        this.b = qh8;
    }

    public final void Y(q3b q3b, l3b l3b) {
        if (l3b.a.a(4, 5, 14, 0)) {
            this.a.g(this.b, false);
        }
    }

    public final void e() {
        this.a.g(this.b, false);
    }

    public final void g() {
        this.a.g(this.b, false);
    }

    public final void onDisconnected() {
        bj8 bj8 = this.a;
        qh8 qh8 = this.b;
        if (bj8.d(qh8)) {
            bj8.h(qh8);
        }
        bj8.g(qh8, false);
    }

    public final void s(boolean z) {
        if (z) {
            this.a.g(this.b, false);
        }
    }
}
