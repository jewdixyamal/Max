package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: rx4  reason: default package */
public final /* synthetic */ class rx4 implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx4 b;

    public /* synthetic */ rx4(sx4 sx4, int i) {
        this.a = i;
        this.b = sx4;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        sx4 sx4 = this.b;
        sx4.d = list;
        sx4.a.e(list);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                gx4 gx4 = (gx4) obj;
                sx4 sx4 = this.b;
                sx4.getClass();
                return new e0a(qy9.j(gx4.a), new rx4(sx4, 2), 1).v().h(new q64(9, (Object) gx4));
            default:
                lw4 lw4 = (lw4) obj;
                sx4 sx42 = this.b;
                sx42.getClass();
                hb3 j = qy9.j(lw4.d);
                tx4 tx4 = sx42.c;
                Objects.requireNonNull(tx4);
                return new e0a(j, new q64(10, (Object) tx4), 3).v().h(new d74(sx42, 10, lw4));
        }
    }
}
