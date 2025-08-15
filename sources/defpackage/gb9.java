package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gb9  reason: default package */
public final class gb9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ t68 Y;
    public final /* synthetic */ byte[] Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gb9(t68 t68, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = t68;
        this.Z = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gb9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = this.Y.e(this.Z);
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
