package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: imb  reason: default package */
public final /* synthetic */ class imb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cnb b;

    public /* synthetic */ imb(cnb cnb, int i) {
        this.a = i;
        this.b = cnb;
    }

    public final Object invoke(Object obj) {
        yha yha = (yha) obj;
        switch (this.a) {
            case 0:
                int ordinal = yha.ordinal();
                cnb cnb = this.b;
                if (ordinal == 0 || ordinal == 1) {
                    j47.S(cnb.a, ((w9a) cnb.u()).b().plus(xq9.a), vx3.c, new anb(cnb, (Continuation) null));
                    cnb.s();
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            cnb.A();
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    cnb.R0 = false;
                }
                return e5f.a;
            case 1:
                int ordinal2 = yha.ordinal();
                cnb cnb2 = this.b;
                if (ordinal2 == 0 || ordinal2 == 1) {
                    j47.S(cnb2.a, ((w9a) cnb2.u()).b().plus(xq9.a), vx3.c, new anb(cnb2, (Continuation) null));
                } else {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            cnb2.getClass();
                            pnf.o(cnb2.z0, new ulb(new eqe(yea.H2), new imb(cnb2, 1)));
                        } else if (ordinal2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    cnb2.R0 = false;
                }
                return e5f.a;
            default:
                if (yha == yha.X) {
                    cnb cnb3 = this.b;
                    j47.T(cnb3.a, ((w9a) cnb3.u()).b(), (vx3) null, new bnb(cnb3, (Continuation) null), 2);
                }
                return e5f.a;
        }
    }
}
