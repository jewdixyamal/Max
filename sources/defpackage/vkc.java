package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vkc  reason: default package */
public final class vkc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ alc b;

    public /* synthetic */ vkc(alc alc, int i) {
        this.a = i;
        this.b = alc;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                alc alc = this.b;
                zkc zkc = alc.d;
                ilc ilc = alc.a;
                q36 f = zkc.f();
                try {
                    ilc.c();
                    f.n();
                    ilc.r();
                    ilc.l();
                    zkc.t(f);
                    return e5f.a;
                } catch (Throwable th) {
                    zkc.t(f);
                    throw th;
                }
            default:
                alc alc2 = this.b;
                zkc zkc2 = alc2.h;
                ilc ilc2 = alc2.a;
                q36 f2 = zkc2.f();
                try {
                    ilc2.c();
                    f2.n();
                    ilc2.r();
                    ilc2.l();
                    zkc2.t(f2);
                    return e5f.a;
                } catch (Throwable th2) {
                    zkc2.t(f2);
                    throw th2;
                }
        }
    }
}
