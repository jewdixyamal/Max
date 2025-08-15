package defpackage;

/* renamed from: fr1  reason: default package */
public final class fr1 implements fh3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh3 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr1(gh3 gh3, Object obj, int i) {
        this.a = i;
        this.b = gh3;
        this.c = obj;
    }

    private final void c() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                return;
            default:
                gh3 gh3 = this.b;
                if (gh3.f()) {
                    gh3.e(this);
                    ((ry1) this.c).resumeWith(e5f.a);
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((fab) ((iab) this.c)).n(this.b.d() ? u9f.a : u9f.b);
                return;
            default:
                gh3 gh3 = this.b;
                if (gh3.f()) {
                    gh3.e(this);
                    ((ry1) this.c).resumeWith(e5f.a);
                    return;
                }
                return;
        }
    }
}
