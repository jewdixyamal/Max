package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ax2  reason: default package */
public final class ax2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ dn3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dn3 dn3 = (dn3) obj;
        e5f e5f = (e5f) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ax2 ax2 = new ax2(3, continuation, 0);
                ax2.Y = dn3;
                od2.a0(e5f.a);
                return ax2.Y;
            default:
                ax2 ax22 = new ax2(3, continuation, 1);
                ax22.Y = dn3;
                return ax22.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                return this.Y;
            default:
                od2.a0(obj);
                return this.Y.a;
        }
    }
}
