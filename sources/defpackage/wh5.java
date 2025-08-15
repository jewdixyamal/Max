package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wh5  reason: default package */
public final class wh5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh5(String str, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wh5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wh5 wh5 = new wh5(this.Z, continuation);
        wh5.Y = obj;
        return wh5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5 = (on5) this.Y;
            String str = this.Z;
            if (str != null) {
                this.X = 1;
                if (on5.a(str, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
