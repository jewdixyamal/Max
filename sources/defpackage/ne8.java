package defpackage;

import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* renamed from: ne8  reason: default package */
public final class ne8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ne8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ne8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ne8 ne8 = new ne8(continuation, this.Y);
        ne8.X = obj;
        return ne8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        r86 r86 = (r86) this.X;
        if (r86 instanceof n86) {
            bc7[] bc7Arr = MediaPickerScreen.B0;
            te8 te8 = (te8) this.Y.s0.getValue();
            pnf.n(te8, ((w9a) ((kke) te8.X.getValue())).b(), (vx3) null, new re8(te8, ((n86) r86).c, (Continuation) null), 2);
        }
        return e5f.a;
    }
}
