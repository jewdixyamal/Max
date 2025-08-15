package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: go3  reason: default package */
public final class go3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ oo3 Y;
    public final /* synthetic */ wm3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public go3(oo3 oo3, wm3 wm3, Continuation continuation) {
        super(2, continuation);
        this.Y = oo3;
        this.Z = wm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((go3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new go3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List singletonList = Collections.singletonList(this.Z);
            ol3 ol3 = ol3.b;
            this.X = 1;
            obj = ((ds3) this.Y.X.getValue()).e(singletonList, ol3, this);
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
