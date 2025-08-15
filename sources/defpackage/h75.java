package defpackage;

/* renamed from: h75  reason: default package */
public final /* synthetic */ class h75 implements km7, jm7, pj3, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ h75(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((x4b) obj).L(this.b, this.c);
                return;
            case 4:
                ((x4b) obj).t0(this.b, this.c);
                return;
            default:
                j10 j10 = (j10) obj;
                boolean O = s5c.O(j10);
                if (j10.d != null || O) {
                    int i = this.b;
                    int i2 = this.c;
                    if (O) {
                        h20 a2 = j10.b().d.d.a();
                        a2.o = i;
                        a2.p = i2;
                        k20 k20 = new k20(a2);
                        j10 j = j10.b().d.j();
                        j.d = k20;
                        l20 a3 = j.a();
                        r10 a4 = j10.b().a();
                        a4.e = a3;
                        j10.r = new s10(a4);
                        return;
                    }
                    h20 a5 = j10.c().a();
                    a5.o = i;
                    a5.p = i2;
                    j10.d = new k20(a5);
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((n3b) obj).m(this.b, this.c);
                return;
            case 1:
                ((m3b) obj).m(this.b, this.c);
                return;
            default:
                ((n3b) obj).m(this.b, this.c);
                return;
        }
    }
}
