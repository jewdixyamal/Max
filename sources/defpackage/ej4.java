package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: ej4  reason: default package */
public final class ej4 implements k56 {
    public final Application a;
    public final Context b;
    public final String c = "https";
    public final String o = "max.ru";

    public ej4(Application application, c5a c5a) {
        this.a = application;
        this.b = c5a;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [hx9, java.lang.Object] */
    public final Object invoke() {
        try {
            if (!c37.g) {
                hm9.n = true;
                c37.g = true;
                ema.c = new Object();
            }
            jy2 jy2 = new jy2(9, this);
            y5f y5f = new y5f("app-scope");
            jy2.invoke(y5f);
            c37.f = y5f.a();
        } catch (Throwable unused) {
        }
        return e5f.a;
    }
}
