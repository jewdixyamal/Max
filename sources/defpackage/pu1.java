package defpackage;

import java.util.concurrent.Executor;

/* renamed from: pu1  reason: default package */
public final class pu1 implements ov1 {
    public final Executor a;
    public final su1 b;
    public final int c;

    public pu1(su1 su1, Executor executor, int i) {
        this.b = su1;
        this.a = executor;
        this.c = i;
    }

    public final bm7 a() {
        b76 a2 = b76.a(this.b.a(this.c));
        mu1 mu1 = new mu1(1);
        a2.getClass();
        return kq0.K(a2, new re6(15, (Object) mu1), this.a);
    }

    public final bm7 b() {
        return f8.g(new ync(25, this));
    }
}
