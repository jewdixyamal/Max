package defpackage;

/* renamed from: yhc  reason: default package */
public final class yhc {
    public final fc0 a;
    public final vje b;
    public final oq1 c;
    public final oq1 d;
    public lq1 e;
    public lq1 f;
    public boolean g = false;
    public boolean h = false;
    public bm7 i;

    public yhc(fc0 fc0, vje vje) {
        this.a = fc0;
        this.b = vje;
        this.c = f8.g(new xhc(this, 0));
        this.d = f8.g(new xhc(this, 1));
    }

    public final void a() {
        c54.p("The callback can only complete once.", !this.d.b.isDone());
        this.f.b((Object) null);
    }
}
