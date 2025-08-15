package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iif  reason: default package */
public final class iif extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dkf Y;
    public final /* synthetic */ nif Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iif(dkf dkf, nif nif, Continuation continuation) {
        super(2, continuation);
        this.Y = dkf;
        this.Z = nif;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iif(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        long R;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0 || i == 1) {
            od2.a0(obj);
            do {
                dkf dkf = this.Y;
                if (!dkf.b()) {
                    return e5f.a;
                }
                pag.j(this.b);
                nif nif = this.Z;
                ijf ijf = (ijf) x53.i0(nif.Z.a.b());
                if (ijf != null) {
                    kld kld = nif.Y;
                    ijf.X = 3;
                    ijf.Y = (((float) dkf.F0()) / ((float) dkf.G0())) * 100.0f;
                    kld.g(ijf);
                }
                int i2 = ft4.o;
                R = z7.R(100, kt4.MILLISECONDS);
                this.X = 1;
            } while (j47.y(R, this) != tx3);
            return tx3;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
