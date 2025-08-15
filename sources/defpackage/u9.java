package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: u9  reason: default package */
public final class u9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddLinkBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u9(Continuation continuation, AddLinkBottomSheet addLinkBottomSheet) {
        super(2, continuation);
        this.Y = addLinkBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((u9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u9 u9Var = new u9(continuation, this.Y);
        u9Var.X = obj;
        return u9Var;
    }

    public final Object o(Object obj) {
        boolean z;
        od2.a0(obj);
        mk7 mk7 = (mk7) this.X;
        jqe jqe = mk7.b;
        AddLinkBottomSheet addLinkBottomSheet = this.Y;
        CharSequence b = jqe.b(addLinkBottomSheet.getContext());
        if (b == null || b.length() == 0) {
            addLinkBottomSheet.x0().a();
        } else {
            addLinkBottomSheet.x0().d(b.toString(), aka.a);
        }
        OneMeButton oneMeButton = (OneMeButton) addLinkBottomSheet.u0.T0(addLinkBottomSheet, AddLinkBottomSheet.x0[2]);
        if (mk7.a.length() > 0) {
            if (tpa.f(mk7.b, jqe.a)) {
                z = true;
                oneMeButton.setEnabled(z);
                return e5f.a;
            }
        }
        z = false;
        oneMeButton.setEnabled(z);
        return e5f.a;
    }
}
