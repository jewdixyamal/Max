package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yw3  reason: default package */
public final class yw3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fc3 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yw3(fc3 fc3, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = fc3;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yw3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yw3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            qrc qrc = (qrc) this.Y.c;
            this.X = 1;
            qrc.getClass();
            obj = j47.t0(xq9.a.plus(qrc.b), new orc(qrc, this.Z, false, true, (Continuation) null), this);
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
