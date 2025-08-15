package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import kotlin.coroutines.Continuation;

/* renamed from: fve  reason: default package */
public final class fve extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tve Y;
    public final /* synthetic */ ByteBuffer Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fve(tve tve, ByteBuffer byteBuffer, Continuation continuation) {
        super(2, continuation);
        this.Y = tve;
        this.Z = byteBuffer;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fve) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fve(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            AsynchronousByteChannel asynchronousByteChannel = this.Y.b;
            this.X = 1;
            sy1 sy1 = new sy1(1, v3c.u(this));
            sy1.n();
            asynchronousByteChannel.write(this.Z, sy1, fv.b);
            obj = sy1.m();
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
