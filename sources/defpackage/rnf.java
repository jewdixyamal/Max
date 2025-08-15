package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: rnf  reason: default package */
public final class rnf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ snf Z;
    public final /* synthetic */ a66 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rnf(snf snf, a66 a66, Continuation continuation) {
        super(2, continuation);
        this.Z = snf;
        this.s0 = a66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rnf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rnf rnf = new rnf(this.Z, this.s0, continuation);
        rnf.Y = obj;
        return rnf;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        snf snf = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            if (((gh3) snf.b.getValue()).f()) {
                a66 a66 = this.s0;
                this.X = 1;
                if (a66.invoke(sx3, this) == tx3) {
                    return tx3;
                }
            } else {
                throw new TamErrorException(new pke("io.exception", "io connection error", (String) null));
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (TamErrorException e) {
                kld kld = snf.c;
                Object invoke = snf.a.invoke(e);
                this.X = 2;
                if (kld.a(invoke, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
