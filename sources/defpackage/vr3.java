package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: vr3  reason: default package */
public final class vr3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr3(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vr3) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vr3 vr3 = new vr3(this.Y, continuation);
        vr3.X = obj;
        return vr3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setVisibility(8);
            oneMeButton.c((Integer) null, true);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.setText(r8a.I);
            oneMeButton.c(new Integer(size), true);
        }
        return e5f.a;
    }
}
