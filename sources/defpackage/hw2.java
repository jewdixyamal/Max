package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: hw2  reason: default package */
public final /* synthetic */ class hw2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ hw2(nx2 nx2, long j, int i) {
        this.a = i;
        this.b = nx2;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        vx3 vx3 = vx3.c;
        e5f e5f = e5f.a;
        long j = this.c;
        nx2 nx2 = this.b;
        yha yha = (yha) obj;
        switch (this.a) {
            case 0:
                int ordinal = yha.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    j47.S(nx2.a, ((w9a) nx2.Y).b().plus(xq9.a), vx3, new lx2(nx2, j, (Continuation) null));
                } else if (ordinal == 3) {
                    nx2.getClass();
                    pnf.o(nx2.P0, new cnd(new eqe(r8a.t), new hw2(nx2, j, 0)));
                }
                return e5f;
            case 1:
                int ordinal2 = yha.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    j47.S(nx2.a, ((w9a) nx2.Y).b().plus(xq9.a), vx3, new lx2(nx2, j, (Continuation) null));
                    zfc.a((zfc) nx2.Z.getValue(), j);
                } else if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        nx2.getClass();
                        pnf.o(nx2.P0, new cnd(new eqe(r8a.s), new hw2(nx2, j, 1)));
                    } else if (ordinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return e5f;
            default:
                if (yha != yha.X) {
                    bc7[] bc7Arr = nx2.X0;
                    ((s8g) nx2.E0.getValue()).a(new g8d(j, false));
                }
                return e5f;
        }
    }
}
