package defpackage;

import java.util.Objects;

/* renamed from: z8f  reason: default package */
public final /* synthetic */ class z8f implements bb3, d38 {
    public final /* synthetic */ a9f a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ z8f(a9f a9f, d7f d7f) {
        this.a = a9f;
        this.b = d7f;
    }

    public void b(ra3 ra3) {
        a9f a9f = this.a;
        d7f d7f = this.b;
        a9f.getClass();
        hm9.m("a9f", "removeUpload: upload=" + d7f, new Object[0]);
        synchronized (a9f) {
            a9f.a.c(d7f).e(((y8f) a9f.b.getValue()).c(d7f)).a();
        }
        if (!ra3.h()) {
            ra3.b();
        }
    }

    public void d(j28 j28) {
        v6f v6f;
        a9f a9f = this.a;
        d7f d7f = this.b;
        a9f.getClass();
        hm9.m("a9f", "getUpload: upload=" + d7f, new Object[0]);
        synchronized (a9f) {
            try {
                v6f = (v6f) a9f.a.d(d7f).b();
            } catch (Exception unused) {
                v6f = null;
            }
        }
        if (v6f == null) {
            try {
                f28 d = ((y8f) a9f.b.getValue()).d(d7f);
                c9f c9f = a9f.a;
                Objects.requireNonNull(c9f);
                v6f = (v6f) new e38(d, new gte(8, (Object) c9f), ft.e, ft.d).b();
            } catch (Exception unused2) {
            }
        }
        if (j28.h()) {
            return;
        }
        if (v6f == null) {
            j28.b();
        } else {
            j28.a(v6f);
        }
    }
}
