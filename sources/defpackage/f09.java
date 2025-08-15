package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: f09  reason: default package */
public final class f09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((f09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f09 f09 = new f09(continuation, this.Y);
        f09.X = obj;
        return f09;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, mec] */
    public final Object o(Object obj) {
        od2.a0(obj);
        e5f e5f = (e5f) this.X;
        bc7[] bc7Arr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        sv8 q0 = messageWriteWidget.q0();
        c01 c01 = new c01(5, messageWriteWidget);
        Handler handler = new Handler(Looper.getMainLooper());
        ? obj2 = new Object();
        enf enf = new enf(handler, obj2, 300);
        obj2.a = new yg3((Object) handler, (Object) q0, (Object) enf, (Object) c01, 18);
        q0.addOnLayoutChangeListener(enf);
        if (!q0.isAttachedToWindow()) {
            handler.removeCallbacksAndMessages((Object) null);
            q0.removeOnLayoutChangeListener(enf);
        } else {
            q0.addOnAttachStateChangeListener(new e6c(q0, handler, q0, enf));
        }
        handler.postDelayed((Runnable) obj2.a, 300);
        return e5f.a;
    }
}
