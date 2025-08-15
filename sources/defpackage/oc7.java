package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: oc7  reason: default package */
public final class oc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardEmojiWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oc7(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardEmojiWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oc7) n((yy4) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oc7 oc7 = new oc7(this.Y, continuation);
        oc7.X = obj;
        return oc7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        yy4 yy4 = (yy4) this.X;
        bc7[] bc7Arr = KeyboardEmojiWidget.s0;
        KeyboardEmojiWidget keyboardEmojiWidget = this.Y;
        RecyclerView m0 = keyboardEmojiWidget.m0();
        int i = yy4.b;
        if (i >= 0) {
            m0.E0();
            GridLayoutManager q = z7.q(m0);
            if (q != null) {
                q.n1(i, 0);
            }
        }
        RecyclerView n0 = keyboardEmojiWidget.n0();
        int i2 = yy4.c;
        if (i2 >= 0) {
            n0.E0();
            n0.x0(i2);
        }
        if (yy4.b >= 0) {
            keyboardEmojiWidget.m0().Y();
        }
        return e5f.a;
    }
}
