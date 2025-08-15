package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: nme  reason: default package */
public final class nme implements lme {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ ry1 b;

    public nme(sy1 sy1) {
        this.b = sy1;
    }

    public final void e(gle gle) {
        ry1 ry1 = this.b;
        if (ry1.isActive() && this.a.compareAndSet(false, true)) {
            ry1.resumeWith(gle);
        }
    }

    public final void g(pke pke) {
        ry1 ry1 = this.b;
        if (ry1.isActive() && this.a.compareAndSet(false, true)) {
            ry1.resumeWith(new njc(new TamErrorException(pke)));
        }
    }
}
