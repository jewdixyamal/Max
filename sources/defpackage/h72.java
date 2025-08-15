package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h72  reason: default package */
public final class h72 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k72 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h72(k72 k72, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = k72;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h72) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h72(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k72 k72 = this.Y;
            e52 o = k72.o();
            int i2 = (o == null || !o.I()) ? 1 : 2;
            this.X = 1;
            obj = ((a03) k72.n.getValue()).a(this.Z, i2, this);
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
