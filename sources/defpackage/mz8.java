package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mz8  reason: default package */
public final class mz8 extends ffe implements e66 {
    public int X;
    public /* synthetic */ yy8 Y;
    public /* synthetic */ bz8 Z;
    public /* synthetic */ boolean s0;
    public final /* synthetic */ xz8 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz8(xz8 xz8, Continuation continuation) {
        super(4, continuation);
        this.t0 = xz8;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        mz8 mz8 = new mz8(this.t0, (Continuation) obj4);
        mz8.Y = (yy8) obj;
        mz8.Z = (bz8) obj2;
        mz8.s0 = booleanValue;
        return mz8.o(e5f.a);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            yy8 yy8 = this.Y;
            bz8 bz8 = this.Z;
            boolean z = this.s0;
            this.Y = null;
            this.X = 1;
            obj = xz8.q(this.t0, yy8, bz8, z, this);
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
