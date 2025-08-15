package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: j69  reason: default package */
public final class j69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((j69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j69 j69 = new j69(continuation, this.Y);
        j69.X = obj;
        return j69;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        du4 du4 = (du4) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        r5f r5f = messagesListWidget.F0;
        if (r5f != null) {
            r5f.Z = du4;
            FrameLayout frameLayout = r5f.Y;
            TextView textView = null;
            KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            if (childAt instanceof TextView) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                os2.f.b(textView, r5f.Z);
            }
        }
        f34 f34 = messagesListWidget.G0;
        if (f34 != null) {
            f34.b = du4;
        }
        h8e h8e = messagesListWidget.H0;
        if (h8e != null) {
            h8e.j();
        }
        messagesListWidget.u0().Y();
        messagesListWidget.u0().invalidate();
        return e5f.a;
    }
}
