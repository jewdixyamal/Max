package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: wg1  reason: default package */
public final class wg1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xg1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg1(xg1 xg1, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                ug1 ug1 = ug1.a;
                this.o = xg1;
                super(9, (Object) ug1);
                return;
            default:
                this.o = xg1;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        x1b x1b;
        switch (this.c) {
            case 0:
                fka fka = (fka) obj2;
                if (!tpa.f((fka) obj, fka)) {
                    this.o.getFakePipView().setCustomTheme(fka);
                    return;
                }
                return;
            case 1:
                ug1 ug1 = (ug1) obj2;
                if (((ug1) obj) != ug1) {
                    int ordinal = ug1.ordinal();
                    xg1 xg1 = this.o;
                    if (ordinal == 0) {
                        x1b = v1b.a;
                    } else if (ordinal == 1) {
                        x1b = new u1b(xg1, new wd6(5, (Object) xg1), xg1.getPipPositionMediator());
                    } else if (ordinal == 2) {
                        x1b = new f1b(xg1, new re6(6, (Object) xg1), xg1.getPipPositionMediator());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    xg1.o = x1b;
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    j1b j1b = (j1b) obj2;
                    j1b j1b2 = (j1b) obj;
                    xg1 xg12 = this.o;
                    xg12.c(xg12.getLeft(), xg12.getTop(), xg12.getRight(), xg12.getBottom());
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg1(j1b j1b, xg1 xg1) {
        super(9, (Object) j1b);
        this.c = 2;
        this.o = xg1;
    }
}
