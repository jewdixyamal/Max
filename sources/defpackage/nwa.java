package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: nwa  reason: default package */
public final class nwa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nwa(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((nwa) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nwa nwa = new nwa(this.Y, continuation);
        nwa.X = obj;
        return nwa;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setText(aja.v);
            oneMeButton.c((Integer) null, true);
        } else {
            oneMeButton.setText(aja.u);
            oneMeButton.c(new Integer(size), true);
        }
        return e5f.a;
    }
}
