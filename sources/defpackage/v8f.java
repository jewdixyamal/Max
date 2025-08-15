package defpackage;

import java.util.concurrent.Callable;

/* renamed from: v8f  reason: default package */
public final class v8f implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ w8f o;

    public v8f(w8f w8f, String str, int i, long j) {
        this.o = w8f;
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final Object call() {
        w8f w8f = this.o;
        zkc zkc = w8f.c;
        ilc ilc = w8f.a;
        q36 f = zkc.f();
        String str = this.a;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        f.j(2, (long) au1.s(this.b));
        f.j(3, this.c);
        try {
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            zkc.t(f);
            return null;
        } catch (Throwable th) {
            zkc.t(f);
            throw th;
        }
    }
}
