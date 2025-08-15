package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c89  reason: default package */
public final class c89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c89(l89 l89, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = l89;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c89(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        l89 l89 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = l89.p;
            long j = l89.a.a;
            this.X = 1;
            obj = ((r79) l89.j.getValue()).a.j(j, this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        if (cu8 == null) {
            return e5f;
        }
        this.X = 2;
        return l89.a(l89, cu8.b, this) == tx3 ? tx3 : e5f;
    }
}
