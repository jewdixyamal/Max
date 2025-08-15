package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: el2  reason: default package */
public final class el2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fl2 Y;
    public final /* synthetic */ fs8 Z;
    public final /* synthetic */ nx8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public el2(fl2 fl2, fs8 fs8, nx8 nx8, Continuation continuation) {
        super(2, continuation);
        this.Y = fl2;
        this.Z = fs8;
        this.s0 = nx8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((el2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new el2(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        fl2 fl2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = fl2.b(fl2, this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        ((q0e) fl2.h).m((Object) null, new gk6(cu8.o, cu8.b, cu8.c, this.s0.o));
        return e5f.a;
    }
}
