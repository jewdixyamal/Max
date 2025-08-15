package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: rj9  reason: default package */
public final /* synthetic */ class rj9 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj9 b;

    public /* synthetic */ rj9(sj9 sj9, int i) {
        this.a = i;
        this.b = sj9;
    }

    public void accept(Object obj) {
        sj9 sj9 = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                sj9.Z1();
                return;
            case 2:
                List list = (List) obj;
                sj9.getClass();
                hm9.m("sj9", "Loaded %d", Integer.valueOf(list.size()));
                xk9 xk9 = (xk9) ((kk9) sj9.b);
                xk9.A(false);
                xk9.B(list);
                if (!sj9.w0) {
                    sj9.w0 = true;
                    sj9.Z.A();
                    return;
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                sj9.getClass();
                hm9.o("sj9", "Can't load locations");
                xk9 xk92 = (xk9) ((kk9) sj9.b);
                xk92.A(false);
                xk92.B(Collections.emptyList());
                return;
        }
    }

    public Object apply(Object obj) {
        au1.r(obj);
        this.b.getClass();
        throw null;
    }
}
