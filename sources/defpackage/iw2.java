package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: iw2  reason: default package */
public final class iw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nx2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iw2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iw2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        nx2 nx2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = nx2.X0;
            this.X = 1;
            obj = ((zb2) ((ta2) nx2.A0.getValue())).d(nx2.c, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        at5 at5 = (at5) obj;
        Set set = at5 != null ? at5.Y : null;
        nx2.M0.m((Object) null, Boolean.valueOf(!(set == null || set.isEmpty())));
        return e5f.a;
    }
}
