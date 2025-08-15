package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: sie  reason: default package */
public final class sie extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xie Y;
    public final /* synthetic */ SystemServicesManager$PushTokenGeneratedListener Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sie(xie xie, SystemServicesManager$PushTokenGeneratedListener systemServicesManager$PushTokenGeneratedListener, Continuation continuation) {
        super(2, continuation);
        this.Y = xie;
        this.Z = systemServicesManager$PushTokenGeneratedListener;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sie(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Y.e(this.Z, this) == tx3) {
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
