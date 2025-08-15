package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: sn5  reason: default package */
public final class sn5 extends ffe implements m56 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ p8c Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ iab t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn5(p8c p8c, int i, iab iab, Continuation continuation, int i2) {
        super(1, continuation);
        this.X = i2;
        this.Z = p8c;
        this.s0 = i;
        this.t0 = iab;
    }

    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                return new sn5(this.Z, this.s0, this.t0, (Continuation) obj, 0).o(e5f.a);
            default:
                return new sn5(this.Z, this.s0, this.t0, (Continuation) obj, 1).o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                tx3 tx3 = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    List g = nu0.g(this.Z, this.s0);
                    if (!((ArrayList) g).isEmpty()) {
                        this.Y = 1;
                        if (((fab) this.t0).a.o(g, this) == tx3) {
                            return tx3;
                        }
                    }
                } else if (i == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Boolean.FALSE;
            default:
                tx3 tx32 = tx3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    od2.a0(obj);
                    List g2 = nu0.g(this.Z, this.s0);
                    if (!((ArrayList) g2).isEmpty()) {
                        this.Y = 1;
                        if (((fab) this.t0).a.o(g2, this) == tx32) {
                            return tx32;
                        }
                    }
                } else if (i2 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Boolean.TRUE;
        }
    }
}
