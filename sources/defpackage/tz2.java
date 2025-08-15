package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* renamed from: tz2  reason: default package */
public final class tz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tz2) n((aj6) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tz2 tz2 = new tz2(continuation, this.Y);
        tz2.X = obj;
        return tz2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        aj6 aj6 = (aj6) this.X;
        ChatsTabWidget chatsTabWidget = this.Y;
        bc7[] bc7Arr = ChatsTabWidget.C0;
        String name = ChatsTabWidget.class.getName();
        ir6 ir6 = hm9.m;
        CharSequence charSequence = null;
        if (ir6 != null) {
            chatsTabWidget.getClass();
            if (ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, name, "handleHeaderStateUpdate: state=" + aj6, (Throwable) null);
            }
        }
        c2f.b(chatsTabWidget.o0());
        j90 j90 = new j90();
        boolean z = false;
        j90.U(0);
        c2f.a(chatsTabWidget.o0(), j90);
        cla o0 = chatsTabWidget.o0();
        CharSequence b = aj6.a.b(chatsTabWidget.getContext());
        if (b == null) {
            b = "";
        }
        o0.setTitle(b);
        cla o02 = chatsTabWidget.o0();
        jqe jqe = aj6.b;
        if (jqe != null) {
            charSequence = jqe.b(chatsTabWidget.getContext());
        }
        o02.setSubtitle(charSequence);
        cla o03 = chatsTabWidget.o0();
        if (aj6.b != null) {
            z = true;
        }
        o03.setTextShimmerEnabled(z);
        return e5f.a;
    }
}
