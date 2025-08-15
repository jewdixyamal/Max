package defpackage;

import android.widget.EditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: b3  reason: default package */
public final class b3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AbstractPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b3(Continuation continuation, AbstractPickerScreen abstractPickerScreen) {
        super(2, continuation);
        this.Y = abstractPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b3 b3Var = new b3(continuation, this.Y);
        b3Var.X = obj;
        return b3Var;
    }

    public final Object o(Object obj) {
        EditText editText;
        od2.a0(obj);
        if (tpa.f((uxa) this.X, uxa.a)) {
            g9a r0 = this.Y.r0();
            if (!(r0 == null || (editText = r0.getEditText()) == null)) {
                editText.setText((CharSequence) null);
            }
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
