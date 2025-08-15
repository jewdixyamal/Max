package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: c5e  reason: default package */
public final class c5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c5e(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.Y = stickersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((c5e) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c5e c5e = new c5e(continuation, this.Y);
        c5e.X = obj;
        return c5e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        m7e m7e = (m7e) this.X;
        bc7[] bc7Arr = StickersScreen.v0;
        StickersScreen stickersScreen = this.Y;
        cla n0 = stickersScreen.n0();
        CharSequence b = m7e.a.b(stickersScreen.getContext());
        if (b == null) {
            b = "";
        }
        n0.setTitle(b);
        String str = m7e.b;
        if (str != null) {
            stickersScreen.n0().setSubtitle((CharSequence) str);
        }
        return e5f.a;
    }
}
