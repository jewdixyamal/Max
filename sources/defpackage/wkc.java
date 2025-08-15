package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wkc  reason: default package */
public final class wkc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ alc c;

    public /* synthetic */ wkc(alc alc, String str, int i) {
        this.a = i;
        this.c = alc;
        this.b = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                alc alc = this.c;
                zkc zkc = alc.e;
                ilc ilc = alc.a;
                q36 f = zkc.f();
                String str = this.b;
                if (str == null) {
                    f.W(1);
                } else {
                    f.f(1, str);
                }
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
                alc alc2 = this.c;
                zkc zkc2 = alc2.g;
                ilc ilc2 = alc2.a;
                q36 f2 = zkc2.f();
                String str2 = this.b;
                if (str2 == null) {
                    f2.W(1);
                } else {
                    f2.f(1, str2);
                }
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
