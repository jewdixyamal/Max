package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n44  reason: default package */
public final class n44 extends ffe implements m56 {
    public int X;
    public final /* synthetic */ o44 Y;
    public final /* synthetic */ je5 Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n44(o44 o44, je5 je5, boolean z, Continuation continuation) {
        super(1, continuation);
        this.Y = o44;
        this.Z = je5;
        this.s0 = z;
    }

    public final Object invoke(Object obj) {
        return new n44(this.Y, this.Z, this.s0, (Continuation) obj).o(e5f.a);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            o44 o44 = this.Y;
            f44 f44 = o44.g;
            je5 je5 = this.Z;
            long j = je5.a;
            gi9 gi9 = f44.e;
            gi9.a(j);
            f44 f442 = new f44(f44.a, this.s0, gi9, f44.c, je5);
            this.X = 1;
            if (o44.a(o44, f442, this) == tx3) {
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
