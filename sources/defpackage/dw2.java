package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: dw2  reason: default package */
public final class dw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ td6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw2(gw2 gw2, td6 td6, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2;
        this.Z = td6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dw2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List singletonList = Collections.singletonList(this.Z.v0);
            ol3 ol3 = ol3.b;
            this.X = 1;
            obj = ((ds3) this.Y.w0.getValue()).e(singletonList, ol3, this);
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
