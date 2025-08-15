package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: vjf  reason: default package */
public final class vjf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoMessageWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vjf(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.Y = videoMessageWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vjf) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vjf vjf = new vjf(continuation, this.Y);
        vjf.X = obj;
        return vjf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String str = (String) this.X;
        bc7[] bc7Arr = VideoMessageWidget.y0;
        VideoMessageWidget videoMessageWidget = this.Y;
        videoMessageWidget.getClass();
        TextView textView = (TextView) videoMessageWidget.Y.T0(videoMessageWidget, VideoMessageWidget.y0[2]);
        int i = 0;
        if (!(str != null)) {
            i = 8;
        }
        textView.setVisibility(i);
        if (str != null) {
            textView.setText(str);
        }
        return e5f.a;
    }
}
