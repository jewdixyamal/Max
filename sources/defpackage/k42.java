package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k42  reason: default package */
public final class k42 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j5d Z;
    public final /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k42(j5d j5d, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = j5d;
        this.s0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k42) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k42 k42 = new k42(this.Z, this.s0, continuation);
        k42.Y = obj;
        return k42;
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            j5d j5d = this.Z;
            Object obj4 = this.s0;
            this.X = 1;
            if (j5d.o(obj4, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = obj3;
        if (!(!(obj2 instanceof njc))) {
            obj3 = new g42(pjc.a(obj2));
        }
        return new i42(obj3);
    }
}
