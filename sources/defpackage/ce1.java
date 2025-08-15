package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* renamed from: ce1  reason: default package */
public final class ce1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallMoreBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ce1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.Y = callMoreBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ce1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ce1 ce1 = new ce1(continuation, this.Y);
        ce1.X = obj;
        return ce1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        CharSequence charSequence = (CharSequence) this.X;
        bc7[] bc7Arr = CallMoreBottomSheet.x0;
        acc acc = (acc) this.Y.v0.getValue();
        acc.b = charSequence;
        for (zbc zbc : acc.a) {
            ((ufd) ((zd1) zbc).a).setDescription(charSequence);
        }
        return e5f.a;
    }
}
