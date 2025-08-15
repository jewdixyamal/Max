package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w11  reason: default package */
public final class w11 extends ffe implements g66 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ boolean s0;
    public final /* synthetic */ je7 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w11(je7 je7, Continuation continuation) {
        super(5, continuation);
        this.t0 = je7;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        w11 w11 = new w11(this.t0, (Continuation) obj5);
        w11.X = booleanValue;
        w11.Y = booleanValue2;
        w11.Z = booleanValue3;
        w11.s0 = booleanValue4;
        return w11.o(e5f.a);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        boolean z2 = this.Y;
        boolean z3 = this.Z;
        boolean z4 = this.s0;
        boolean z5 = false;
        if (((se5) ((qe5) this.t0.getValue())).q() && z4 && !z3 && z2 && z) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
