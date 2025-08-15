package defpackage;

import java.util.List;

/* renamed from: x3e  reason: default package */
public final /* synthetic */ class x3e implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4e b;

    public /* synthetic */ x3e(a4e a4e, int i) {
        this.a = i;
        this.b = a4e;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        c4e c4e = this.b.a;
        c4e.getClass();
        nd7.U(new qa3(new e0a(qy9.j(list), new m2e(22), 3).v(), 2, new z3e(c4e, 1)).l(), ft.e, new z72(26, list), new ic5(6, list));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return a4e.e((n3e) obj);
            default:
                q3e q3e = (q3e) obj;
                a4e a4e = this.b;
                a4e.getClass();
                return ((o2e) a4e.b).b(q3e.h).h(new ypc(a4e, 6, q3e));
        }
    }
}
