package defpackage;

/* renamed from: lgf  reason: default package */
public final class lgf {
    public final o9g a;
    public final cgf b;
    public final l7 c = new l7(10);
    public final due d = new due(1);
    public final due e = new due(1);
    public final uy f = new uy(4, (byte) 0);
    public jlf g;
    public jlf h = jlf.e;
    public long i;
    public long j = -9223372036854775807L;

    public lgf(o9g o9g, cgf cgf) {
        this.a = o9g;
        this.b = cgf;
    }

    public final void a() {
        uy uyVar = this.f;
        boolean z = false;
        uyVar.b = 0;
        uyVar.c = -1;
        uyVar.o = 0;
        this.j = -9223372036854775807L;
        due due = this.e;
        if (due.h() > 0) {
            fm9.f(due.h() > 0);
            while (due.h() > 1) {
                due.e();
            }
            Object e2 = due.e();
            e2.getClass();
            due.a(0, (Long) e2);
        }
        jlf jlf = this.g;
        due due2 = this.d;
        if (jlf != null) {
            due2.b();
        } else if (due2.h() > 0) {
            if (due2.h() > 0) {
                z = true;
            }
            fm9.f(z);
            while (due2.h() > 1) {
                due2.e();
            }
            Object e3 = due2.e();
            e3.getClass();
            this.g = (jlf) e3;
        }
    }
}
