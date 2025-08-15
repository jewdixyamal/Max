package defpackage;

/* renamed from: r98  reason: default package */
public final /* synthetic */ class r98 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4b b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ r98(m4b m4b, Integer num, int i) {
        this.a = i;
        this.b = m4b;
        this.c = num;
    }

    public final void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 0:
                n3b.f0(this.b.j, this.c.intValue());
                return;
            case 1:
                m4b m4b = this.b;
                n3b.q(m4b.d, m4b.e, this.c.intValue());
                return;
            default:
                n3b.d(this.c.intValue(), this.b.t);
                return;
        }
    }
}
