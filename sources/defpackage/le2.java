package defpackage;

import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: le2  reason: default package */
public final class le2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaDownloadBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public le2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.Y = chatMediaDownloadBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((le2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        le2 le2 = new le2(continuation, this.Y);
        le2.X = obj;
        return le2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((a10) this.Y.z0.getValue()).setLevel(tu0.G(((Number) this.X).floatValue() * ((float) 100)));
        return e5f.a;
    }
}
