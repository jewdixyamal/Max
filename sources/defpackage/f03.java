package defpackage;

/* renamed from: f03  reason: default package */
public final class f03 extends k87 implements e03 {
    public final h03 b;

    public f03(h03 h03) {
        this.b = h03;
    }

    public final boolean a(Throwable th) {
        z87 z87 = this.a;
        if (z87 == null) {
            z87 = null;
        }
        return z87.childCancelled(th);
    }

    public final boolean c() {
        return true;
    }

    public final void d(Throwable th) {
        z87 z87 = this.a;
        if (z87 == null) {
            z87 = null;
        }
        this.b.parentCancelled(z87);
    }

    public final x77 getParent() {
        z87 z87 = this.a;
        if (z87 != null) {
            return z87;
        }
        return null;
    }
}
