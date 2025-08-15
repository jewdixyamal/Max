package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: ue6  reason: default package */
public final class ue6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ we6 Y;
    public final /* synthetic */ Bundle Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ue6(we6 we6, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.Y = we6;
        this.Z = bundle;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ue6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ue6(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String string = this.Z.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            this.X = 1;
            if (we6.a(this.Y, string, this) == tx3) {
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
