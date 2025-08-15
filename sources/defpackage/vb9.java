package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vb9  reason: default package */
public final class vb9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xb9 Y;
    public final /* synthetic */ long[] Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb9(xb9 xb9, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.Y = xb9;
        this.Z = jArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vb9(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tq2 tq2 = new tq2(this.Z);
            this.X = 1;
            obj = ((k4a) ((pk) this.Y.b.getValue())).J(tq2, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                hm9.p("MissedContactsController", "fail to fetch contact info ".concat(ys.h0(this.Z, ", ", "", "", -1, "...", (m56) null)), th);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long[] jArr = this.Z;
        ym3 ym3 = (ym3) obj;
        ir6 ir6 = hm9.m;
        if (ir6 != null) {
            if (ir6.c()) {
                us7 us7 = us7.X;
                String i0 = ys.h0(jArr, ", ", "", "", -1, "...", (m56) null);
                ir6.d(us7, "MissedContactsController", "success CONTACT_INFO request: " + ym3 + "; " + i0 + "}", (Throwable) null);
            }
        }
        return (ym3) obj;
    }
}
