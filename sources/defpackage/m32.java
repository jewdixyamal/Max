package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m32  reason: default package */
public class m32 extends l32 {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m32(Object obj, lx3 lx3, int i, int i2, int i3) {
        super(lx3, i, i2);
        this.o = i3;
        this.X = obj;
    }

    public Object j(iab iab, Continuation continuation) {
        switch (this.o) {
            case 0:
                Object invoke = ((a66) this.X).invoke(iab, continuation);
                return invoke == tx3.a ? invoke : e5f.a;
            default:
                z5d z5d = new z5d(iab);
                for (mn5 y32 : (Iterable) this.X) {
                    j47.T(iab, (lx3) null, (vx3) null, new y32(y32, z5d, (Continuation) null), 3);
                }
                return e5f.a;
        }
    }

    public l32 k(lx3 lx3, int i, int i2) {
        switch (this.o) {
            case 0:
                return new m32((a66) this.X, lx3, i, i2, 0);
            default:
                return new m32((Iterable) this.X, lx3, i, i2, 1);
        }
    }

    public p8c m(sx3 sx3) {
        switch (this.o) {
            case 1:
                k32 k32 = new k32(this, (Continuation) null);
                vx3 vx3 = vx3.a;
                fab fab = new fab(v3c.x(sx3, this.a), c37.a(this.b, 1, 4));
                fab.start(vx3, fab, k32);
                return fab;
            default:
                return super.m(sx3);
        }
    }

    public String toString() {
        switch (this.o) {
            case 0:
                return "block[" + ((a66) this.X) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
