package defpackage;

/* renamed from: ks7  reason: default package */
public final /* synthetic */ class ks7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ os7 b;

    public /* synthetic */ ks7(os7 os7, int i) {
        this.a = i;
        this.b = os7;
    }

    public final Object invoke() {
        os7 os7 = this.b;
        switch (this.a) {
            case 0:
                ThreadLocal threadLocal = os7.h;
                return ema.f(os7.d, os7.b);
            default:
                ThreadLocal threadLocal2 = os7.h;
                return ema.g(os7.d, os7.b);
        }
    }
}
