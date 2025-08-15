package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qj5  reason: default package */
public final class qj5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ float Y;
    public final /* synthetic */ iab Z;
    public final /* synthetic */ yj5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qj5(iab iab, yj5 yj5, Continuation continuation) {
        super(2, continuation);
        this.Z = iab;
        this.s0 = yj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qj5) n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qj5 qj5 = new qj5(this.Z, this.s0, continuation);
        qj5.Y = ((Number) obj).floatValue();
        return qj5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pjc pjc = new pjc(new h8f(this.Y * 100.0f, this.s0.j, (String) null));
            this.X = 1;
            if (((fab) this.Z).a.o(pjc, this) == tx3) {
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
