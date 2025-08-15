package defpackage;

/* renamed from: h3a  reason: default package */
public final class h3a implements qy1 {
    public final a3a a;
    public final /* synthetic */ i3a b;

    public h3a(i3a i3a, a3a a3a) {
        this.b = i3a;
        this.a = a3a;
    }

    public final void cancel() {
        i3a i3a = this.b;
        hs hsVar = i3a.b;
        a3a a3a = this.a;
        hsVar.remove(a3a);
        if (tpa.f(i3a.c, a3a)) {
            a3a.a();
            i3a.c = null;
        }
        a3a.b.remove(this);
        k56 k56 = a3a.c;
        if (k56 != null) {
            k56.invoke();
        }
        a3a.c = null;
    }
}
