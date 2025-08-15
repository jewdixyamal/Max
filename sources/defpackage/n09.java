package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: n09  reason: default package */
public final class n09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n09 n09 = new n09(continuation, this.Y);
        n09.X = obj;
        return n09;
    }

    public final Object o(Object obj) {
        int i;
        od2.a0(obj);
        p35 p35 = (p35) this.X;
        uy8 uy8 = p35 != null ? (uy8) p35.a : null;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (uy8 != null) {
            bc7[] bc7Arr = MessageWriteWidget.F0;
            messageWriteWidget.getClass();
            i = uy8.a;
        } else {
            i = 0;
        }
        q0e q0e = messageWriteWidget.C0;
        if (i == 2) {
            messageWriteWidget.q0().setLeftIcon(woc.e1);
            q0e.m((Object) null, Boolean.TRUE);
        } else {
            messageWriteWidget.q0().setEmojiExpandableState(iv8.a);
            qv8 qv8 = messageWriteWidget.q0().c;
            qv8.setShowSoftInputOnFocus(true);
            qv8.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            messageWriteWidget.q0().setLeftIcon(woc.a1);
            q0e.m((Object) null, Boolean.FALSE);
        }
        return e5f.a;
    }
}
