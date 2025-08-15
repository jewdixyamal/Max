package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputname.InputNameScreen;

/* renamed from: cf3  reason: default package */
public final class cf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cf3) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cf3 cf3 = new cf3(this.Y, continuation);
        cf3.X = obj;
        return cf3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof we3;
        e5f e5f = e5f.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.Y;
        if (z) {
            ((ita) lt7.a.getAccessor().c(ita.class)).c();
            mr0.G(confirmPhoneScreen);
            du7 du7 = du7.c;
            du7.getClass();
            du7.P1().b(":chat-list", (Bundle) null);
        } else if (wm9 instanceof xe3) {
            x37 x37 = (x37) confirmPhoneScreen.s0.getValue();
            xe3 xe3 = (xe3) wm9;
            String str = xe3.b;
            bc7 bc7 = ConfirmPhoneScreen.C0[1];
            x37.getClass();
            x37.a(i24.e(new InputNameScreen(str, (String) confirmPhoneScreen.o.a(confirmPhoneScreen), xe3.c), (zu3) null, (zu3) null), "InputNameScreen");
        } else if (wm9 instanceof c64) {
            mr0.G(confirmPhoneScreen);
            du7.c.R1((c64) wm9);
        }
        return e5f;
    }
}
