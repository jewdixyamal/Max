package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: vz5  reason: default package */
public final class vz5 extends ffe implements a66 {
    public final /* synthetic */ View X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vz5(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((vz5) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vz5((ViewGroup) this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        br7.d(this.X, ForwardPickerScreen.J0, (m56) null);
        return e5f.a;
    }
}
