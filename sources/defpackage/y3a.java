package defpackage;

/* renamed from: y3a  reason: default package */
public final /* synthetic */ class y3a extends p66 implements c66 {
    public static final y3a a = new p66(3, z3a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z3a z3a = (z3a) obj;
        z3d z3d = (z3d) obj2;
        long j = z3a.a;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        e5f e5f = e5f.a;
        if (i <= 0) {
            ((y3d) z3d).X = e5f;
        } else {
            h76 h76 = new h76(z3d, 15, z3a);
            y3d y3d = (y3d) z3d;
            lx3 lx3 = y3d.a;
            y3d.c = j47.H(lx3).invokeOnTimeout(j, h76, lx3);
        }
        return e5f;
    }
}
