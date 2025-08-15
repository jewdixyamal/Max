package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e40  reason: default package */
public final class e40 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ f40 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ub8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e40(f40 f40, long j, ub8 ub8, Continuation continuation) {
        super(2, continuation);
        this.Y = f40;
        this.Z = j;
        this.s0 = ub8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e40(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nx3 b = ((w9a) ((kke) this.Y.Z.getValue())).b();
            d40 d40 = new d40(this.Y, this.Z, (Continuation) null);
            this.X = 1;
            obj2 = j47.t0(b, d40, this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj2;
        if (cu8 != null) {
            this.Y.v0 = this.Z;
            this.Y.w0 = cu8.t0;
            f40 f40 = this.Y;
            f40.s(this.Z, this.s0, f40.w0);
        } else {
            this.Y.s(this.Z, this.s0, -1);
        }
        return e5f.a;
    }
}
