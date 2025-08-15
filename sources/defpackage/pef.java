package defpackage;

import java.util.concurrent.Callable;

/* renamed from: pef  reason: default package */
public final class pef implements Callable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ qef Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ mqb b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public pef(qef qef, String str, mqb mqb, float f, float f2, boolean z) {
        this.Y = qef;
        this.a = str;
        this.b = mqb;
        this.c = f;
        this.o = f2;
        this.X = z;
    }

    public final Object call() {
        qef qef = this.Y;
        zkc zkc = qef.c;
        ilc ilc = qef.a;
        q36 f = zkc.f();
        String str = this.a;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        f.j(2, (long) this.b.b);
        f.h(3, (double) this.c);
        f.h(4, (double) this.o);
        f.j(5, this.X ? 1 : 0);
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
