package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c59  reason: default package */
public final class c59 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ l20 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c59(n59 n59, String str, l20 l20, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = str;
        this.s0 = l20;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c59) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c59(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            qrc qrc = this.Y.v0;
            boolean z = this.s0.b.X;
            this.X = 1;
            obj = qrc.b(this.Z, z, this);
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
