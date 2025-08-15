package defpackage;

/* renamed from: g3a  reason: default package */
public final class g3a implements ug7, qy1 {
    public final gh7 a;
    public final a3a b;
    public h3a c;
    public final /* synthetic */ i3a o;

    public g3a(i3a i3a, gh7 gh7, a3a a3a) {
        this.o = i3a;
        this.a = gh7;
        this.b = a3a;
        gh7.a(this);
    }

    public final void cancel() {
        this.a.f(this);
        this.b.b.remove(this);
        h3a h3a = this.c;
        if (h3a != null) {
            h3a.cancel();
        }
        this.c = null;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        if (eg7 == eg7.ON_START) {
            this.c = this.o.b(this.b);
        } else if (eg7 == eg7.ON_STOP) {
            h3a h3a = this.c;
            if (h3a != null) {
                h3a.cancel();
            }
        } else if (eg7 == eg7.ON_DESTROY) {
            cancel();
        }
    }
}
