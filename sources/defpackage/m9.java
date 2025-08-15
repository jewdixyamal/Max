package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: m9  reason: default package */
public final class m9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m9(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m9) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m9 m9Var = new m9(this.Y, continuation);
        m9Var.X = obj;
        return m9Var;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setVisibility(8);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.c(new Integer(size), true);
        }
        return e5f.a;
    }
}
