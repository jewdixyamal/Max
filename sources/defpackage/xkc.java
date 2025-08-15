package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xkc  reason: default package */
public final class xkc implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ alc o;

    public xkc(alc alc, String str, String str2, String str3) {
        this.o = alc;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Object call() {
        alc alc = this.o;
        p19 p19 = alc.i;
        ilc ilc = alc.a;
        q36 f = p19.f();
        String str = this.a;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        String str2 = this.b;
        if (str2 == null) {
            f.W(2);
        } else {
            f.f(2, str2);
        }
        String str3 = this.c;
        if (str3 == null) {
            f.W(3);
        } else {
            f.f(3, str3);
        }
        try {
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            p19.t(f);
            return e5f.a;
        } catch (Throwable th) {
            p19.t(f);
            throw th;
        }
    }
}
