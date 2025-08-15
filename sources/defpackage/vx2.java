package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: vx2  reason: default package */
public final class vx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vx2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vx2 vx2 = new vx2(continuation, this.Y);
        vx2.X = obj;
        return vx2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = ChatsListWidget.M0;
        ChatsListWidget chatsListWidget = this.Y;
        if (booleanValue) {
            OneMeButton oneMeButton = chatsListWidget.n0().J0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener((View.OnClickListener) null);
            oneMeButton.setVisibility(8);
        } else {
            chatsListWidget.n0().x(chatsListWidget.getContext().getString(j0c.chats_list_empty_state_action), new c5(17, (Object) chatsListWidget));
        }
        return e5f.a;
    }
}
