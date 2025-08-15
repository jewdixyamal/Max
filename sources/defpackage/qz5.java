package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: qz5  reason: default package */
public final class qz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ csb Y;
    public final /* synthetic */ ForwardPickerScreen Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qz5(csb csb, ForwardPickerScreen forwardPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = csb;
        this.Z = forwardPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qz5) n((a06) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qz5 qz5 = new qz5(this.Y, this.Z, continuation);
        qz5.X = obj;
        return qz5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a06 a06 = (a06) this.X;
        e5f e5f = e5f.a;
        int i = 8;
        csb csb = this.Y;
        if (a06 == null) {
            csb.setVisibility(8);
        } else {
            bc7[] bc7Arr = ForwardPickerScreen.I0;
            ForwardPickerScreen forwardPickerScreen = this.Z;
            if ((!((Collection) forwardPickerScreen.v0().Z.a.getValue()).isEmpty()) && forwardPickerScreen.B0()) {
                i = 0;
            }
            csb.setVisibility(i);
            CharSequence b = a06.a.b(csb.getContext());
            if (b != null) {
                csb.setTitle(b);
                csb.setAttachDescription(a06.c);
                if (forwardPickerScreen.A0()) {
                    csb.setStartIconDrawable((Drawable) null);
                    csb.setStartIconClickListener((View.OnClickListener) null);
                } else if (!a06.d) {
                    return e5f;
                } else {
                    if (csb.getVisibility() == 0) {
                        ((iz5) forwardPickerScreen.v0().c).f();
                    }
                    csb.setStartIconDrawable(((iz5) forwardPickerScreen.v0().c).g());
                    csb.setStartIconClickListener(new vu5(forwardPickerScreen, 2, csb));
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return e5f;
    }
}
