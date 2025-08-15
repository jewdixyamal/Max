package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: lp9  reason: default package */
public final class lp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lp9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lp9 lp9 = new lp9(continuation, this.Y);
        lp9.X = obj;
        return lp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof wo9;
        e5f e5f = e5f.a;
        if (z) {
            ((ita) lt7.a.getAccessor().c(ita.class)).c();
            du7 du7 = du7.c;
            du7.getClass();
            du7.P1().b(":chat-list", (Bundle) null);
        } else if (wm9 instanceof c64) {
            du7.c.R1((c64) wm9);
        } else if (wm9 instanceof g43) {
            this.Y.getRouter().C();
        }
        return e5f;
    }
}
