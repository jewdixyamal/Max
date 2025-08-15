package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ji7  reason: default package */
public final class ji7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ki7 Y;
    public final /* synthetic */ oi0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ji7(ki7 ki7, oi0 oi0, Continuation continuation) {
        super(2, continuation);
        this.Y = ki7;
        this.Z = oi0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ji7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ji7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.a;
            oi0 oi0 = this.Z;
            long j = oi0.a;
            pke pke = oi0.b;
            String str = pke.o;
            if (str == null) {
                str = pke.c;
            }
            bi7 bi7 = new bi7(j, str);
            this.X = 1;
            if (kld.a(bi7, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
