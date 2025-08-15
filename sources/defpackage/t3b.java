package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: t3b  reason: default package */
public final class t3b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ o23 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t3b(o23 o23, Continuation continuation) {
        super(2, continuation);
        this.Y = o23;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((t3b) n((bb9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t3b t3b = new t3b(this.Y, continuation);
        t3b.X = obj;
        return t3b;
    }

    public final Object o(Object obj) {
        nif nif;
        dkf dkf;
        dkf dkf2;
        od2.a0(obj);
        bb9 bb9 = (bb9) this.X;
        ab9 ab9 = bb9 instanceof ab9 ? (ab9) bb9 : null;
        int i = ab9 != null ? ab9.e : 0;
        int i2 = i == 0 ? -1 : s3b.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 != -1) {
            o23 o23 = this.Y;
            if (i2 == 1) {
                mif mif = (mif) o23.b;
                if (mif != null && (((dkf = (nif = mif.b).X) != null && dkf.b()) || ((dkf2 = nif.X) != null && dkf2.H0()))) {
                    ((mif) o23.b).b();
                }
                o23.c = (e60) o23.a;
            } else if (i2 == 2) {
                e60 e60 = (e60) o23.a;
                uh9 uh9 = (uh9) e60.c;
                if (uh9.x || uh9.w) {
                    e60.b();
                }
                mif mif2 = (mif) o23.b;
                if (mif2 != null) {
                    o23.c = mif2;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
