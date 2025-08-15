package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: i09  reason: default package */
public final class i09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i09(Continuation continuation, MessageWriteWidget messageWriteWidget, View view) {
        super(2, continuation);
        this.Y = messageWriteWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i09 i09 = new i09(continuation, this.Y, this.Z);
        i09.X = obj;
        return i09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = MessageWriteWidget.F0;
        this.Y.q0().setInputHint(((jqe) this.X).b(this.Z.getContext()));
        return e5f.a;
    }
}
