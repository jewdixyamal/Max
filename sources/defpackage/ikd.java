package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: ikd  reason: default package */
public final class ikd extends ffe implements a66 {
    public final /* synthetic */ View X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ikd(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((ikd) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ikd((ViewGroup) this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        br7.d(this.X, ShareDataPickerScreen.E0, (m56) null);
        return e5f.a;
    }
}
