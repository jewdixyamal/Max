package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: bf7  reason: default package */
public final class bf7 implements gh3 {
    public final gh3 a;
    public final /* synthetic */ v4 b;

    public bf7(v4 v4Var, Context context, ExecutorService executorService, wmc wmc, khe khe) {
        this.b = v4Var;
        this.a = new lh3(context, executorService, wmc, khe);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final zh3 b() {
        return this.a.b();
    }

    public final void c(fh3 fh3) {
        this.a.c(fh3);
    }

    public final boolean d() {
        return this.a.d();
    }

    public final void e(fh3 fh3) {
        this.a.e(fh3);
    }

    public final boolean f() {
        return this.a.f();
    }

    public final boolean g() {
        if (this.a.g()) {
            return true;
        }
        ((ri4) this.b.c(ri4.class)).e();
        return false;
    }

    public final void invalidate() {
        this.a.invalidate();
    }
}
