package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n32  reason: default package */
public final class n32 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ z5d Z;
    public final /* synthetic */ c5d s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n32(mn5 mn5, z5d z5d, f5d f5d, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5;
        this.Z = z5d;
        this.s0 = f5d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n32) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n32(this.Y, this.Z, (f5d) this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        c5d c5d = this.s0;
        if (i == 0) {
            od2.a0(obj);
            mn5 mn5 = this.Y;
            z5d z5d = this.Z;
            this.X = 1;
            if (mn5.d(z5d, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                ((f5d) c5d).c();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((f5d) c5d).c();
        return e5f.a;
    }
}
