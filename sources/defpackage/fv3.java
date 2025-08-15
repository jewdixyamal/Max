package defpackage;

/* renamed from: fv3  reason: default package */
public final class fv3 implements yu3 {
    public final String a;
    public final k56 b;
    public final k56 c;

    public fv3(String str, jr0 jr0, jr0 jr02) {
        this.a = str;
        this.b = jr0;
        this.c = jr02;
    }

    public final void a(uu3 uu3, uu3 uu32, boolean z) {
        if (tpa.f(uu3 != null ? uu3.getInstanceId() : null, this.a) && z) {
            this.b.invoke();
        }
    }

    public final void b(uu3 uu3, uu3 uu32, boolean z) {
        if (tpa.f(uu32 != null ? uu32.getInstanceId() : null, this.a) && !z) {
            this.c.invoke();
        }
    }
}
