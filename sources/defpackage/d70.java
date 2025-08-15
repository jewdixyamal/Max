package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: d70  reason: default package */
public final class d70 implements py9 {
    public final /* synthetic */ z05 a;
    public final /* synthetic */ e70 b;

    public d70(e70 e70, z05 z05) {
        this.b = e70;
        this.a = z05;
    }

    public final void a(Object obj) {
        lt0 lt0 = (lt0) obj;
        Objects.requireNonNull(lt0);
        e70 e70 = this.b;
        if (e70.l == this.a) {
            Objects.toString(e70.h);
            lt0.toString();
            if (e70.h != lt0) {
                e70.h = lt0;
                e70.d();
            }
        }
    }

    public final void onError(Throwable th) {
        e70 e70 = this.b;
        if (e70.l == this.a) {
            Executor executor = e70.j;
            l7b l7b = e70.k;
            if (executor != null && l7b != null) {
                executor.execute(new c(l7b, 8, th));
            }
        }
    }
}
