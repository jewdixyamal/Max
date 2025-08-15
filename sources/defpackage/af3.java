package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: af3  reason: default package */
public final class af3 extends hu3 {
    public boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ConfirmPhoneScreen Z;
    public TextView o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(continuation);
        this.Z = confirmPhoneScreen;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        bc7[] bc7Arr = ConfirmPhoneScreen.C0;
        return this.Z.n0((TextView) null, 0, false, this);
    }
}
