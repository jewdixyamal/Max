package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dca  reason: default package */
public final class dca extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ eca Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dca(eca eca, Continuation continuation) {
        super(2, continuation);
        this.Z = eca;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dca dca = new dca(this.Z, continuation);
        dca.Y = obj;
        return dca;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            eca eca = this.Z;
            this.X = 1;
            obj = new de0(new yf4[]{j47.h(sx3, ((w9a) ((kke) eca.a.getValue())).a(), new bca(eca, (Continuation) null), 2), j47.h(sx3, ((w9a) ((kke) eca.a.getValue())).a(), new cca(eca, (Continuation) null), 2)}).a(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
