package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nrc  reason: default package */
public final class nrc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ qrc Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ boolean t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nrc(qrc qrc, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = qrc;
        this.Z = str;
        this.s0 = z;
        this.t0 = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nrc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nrc(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = qrc.a(this.Y, this.Z, this.s0, this.t0, this);
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
