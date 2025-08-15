package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: vwa  reason: default package */
public final class vwa extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xwa Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vwa(xwa xwa, Continuation continuation) {
        super(2, continuation);
        this.Z = xwa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vwa) n((axa) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vwa vwa = new vwa(this.Z, continuation);
        vwa.Y = obj;
        return vwa;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            axa axa = (axa) this.Y;
            boolean z = axa instanceof ywa;
            xwa xwa = this.Z;
            if (z) {
                if (((ywa) axa).a != xwa.i.get()) {
                    return e5f;
                }
                kld kld = xwa.g;
                rwa rwa = rwa.a;
                this.X = 1;
                if (kld.a(rwa, this) == tx3) {
                    return tx3;
                }
            } else if (!(axa instanceof zwa)) {
                throw new NoWhenBranchMatchedException();
            } else if (((zwa) axa).a != xwa.i.get()) {
                return e5f;
            } else {
                kld kld2 = xwa.g;
                swa swa = new swa(xwa.a);
                this.X = 2;
                if (kld2.a(swa, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
