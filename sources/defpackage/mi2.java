package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: mi2  reason: default package */
public final class mi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mi2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mi2 mi2 = new mi2(continuation, this.Y);
        mi2.X = obj;
        return mi2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        aj2 aj2 = (aj2) this.X;
        bc7[] bc7Arr = ChatMediaViewerScreen.K0;
        g07 A0 = this.Y.A0();
        A0.u0.setText(aj2.a);
        A0.v0.setText(aj2.b);
        CharSequence charSequence = aj2.c;
        int length = charSequence.length();
        je7 je7 = A0.A0;
        je7 je72 = A0.z0;
        if (length > 0) {
            br7.b(A0, (View) je72.getValue(), -1);
            br7.b(A0, (View) je7.getValue(), -1);
            ((View) je72.getValue()).setVisibility(0);
            ((View) je7.getValue()).setVisibility(0);
            ((TextView) je72.getValue()).setText(charSequence);
        } else if (br7.H(je72)) {
            ((View) je72.getValue()).setVisibility(8);
            ((View) je7.getValue()).setVisibility(8);
            ((TextView) je72.getValue()).setText((CharSequence) null);
        }
        je7 je73 = A0.w0;
        if (je73.a()) {
            ((w3b) je73.getValue()).a(aj2.d);
        }
        return e5f.a;
    }
}
