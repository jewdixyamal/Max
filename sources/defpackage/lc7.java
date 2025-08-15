package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: lc7  reason: default package */
public final class lc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardEmojiWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lc7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardEmojiWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lc7) n((xy4) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lc7 lc7 = new lc7(this.Y, continuation);
        lc7.X = obj;
        return lc7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        xy4 xy4 = (xy4) this.X;
        KeyboardEmojiWidget keyboardEmojiWidget = this.Y;
        keyboardEmojiWidget.Y.E(xy4.a);
        keyboardEmojiWidget.X.E(xy4.b);
        return e5f.a;
    }
}
