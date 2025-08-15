package defpackage;

/* renamed from: rg7  reason: default package */
public final class rg7 extends pg7 implements ug7 {
    public final gh7 a;
    public final lx3 b;

    public rg7(gh7 gh7, lx3 lx3) {
        this.a = gh7;
        this.b = lx3;
        if (gh7.d == fg7.a) {
            pag.d(lx3);
        }
    }

    public final lx3 getCoroutineContext() {
        return this.b;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        gh7 gh7 = this.a;
        if (gh7.d.compareTo(fg7.a) <= 0) {
            gh7.f(this);
            pag.d(this.b);
        }
    }
}
