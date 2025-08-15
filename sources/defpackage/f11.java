package defpackage;

import java.util.Collections;
import one.me.devmenu.TestCrash;

/* renamed from: f11  reason: default package */
public final class f11 implements pi4 {
    public final /* synthetic */ int a;
    public final Object b;

    public f11(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = r0e.a(Collections.singletonList(new b54(ei4.b.incrementAndGet(), new iqe("Test crash"), gpc.j, new iqe("Тестовый креш для отправки в tracer"), (fp3) null, 16)));
                return;
            case 2:
                this.b = new w7c(r0e.a(nz4.a));
                return;
            default:
                this.b = r0e.a(Collections.singletonList(new b54(ei4.b.incrementAndGet(), new iqe("125.1.0.48.3"), rub.ic_statusbar_call_24, new iqe("Версия SDK Звонков"), (fp3) null, 16)));
                return;
        }
    }

    private final void e(b54 b54) {
    }

    private final void f(b54 b54) {
    }

    public final j0e c() {
        switch (this.a) {
            case 0:
                return (q0e) this.b;
            case 1:
                return (q0e) this.b;
            default:
                return (w7c) this.b;
        }
    }

    public final void d(b54 b54) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                throw new TestCrash();
            default:
                return;
        }
    }
}
