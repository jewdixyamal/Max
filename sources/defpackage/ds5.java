package defpackage;

import java.util.ArrayList;

/* renamed from: ds5  reason: default package */
public final class ds5 extends iqd implements w66 {
    public final /* synthetic */ int a;
    public final wq5 b;

    public /* synthetic */ ds5(p0 p0Var, int i) {
        this.a = i;
        this.b = p0Var;
    }

    public final wq5 b() {
        switch (this.a) {
            case 0:
                return new cs5(this.b, (Object) null, 0);
            default:
                return new yr5(this.b, os.a, 1);
        }
    }

    public final void l(erd erd) {
        wq5 wq5 = this.b;
        switch (this.a) {
            case 0:
                wq5.c(new zq5(erd, (Object) null));
                return;
            default:
                try {
                    ArrayList arrayList = new ArrayList();
                    p45 p45 = q45.a;
                    wq5.c(new ks5(erd, arrayList));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.c(th, erd);
                    return;
                }
        }
    }
}
