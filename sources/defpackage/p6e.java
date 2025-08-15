package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: p6e  reason: default package */
public final class p6e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6e(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p6e) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p6e p6e = new p6e(continuation, this.Y);
        p6e.X = obj;
        return p6e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        bc7[] bc7Arr = StickersSettingsScreen.Y;
        StickersSettingsScreen stickersSettingsScreen = this.Y;
        stickersSettingsScreen.getClass();
        if (wm9 instanceof g43) {
            stickersSettingsScreen.getRouter().C();
        } else if (wm9 instanceof c64) {
            l6e.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
