package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: kkd  reason: default package */
public final class kkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kkd(ShareDataPickerScreen shareDataPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kkd) n((dkd) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kkd kkd = new kkd(this.Y, continuation);
        kkd.X = obj;
        return kkd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((dkd) this.X, dkd.a)) {
            ShareDataPickerScreen shareDataPickerScreen = this.Y;
            String string = shareDataPickerScreen.getArgs().getString("tag");
            if (string != null) {
                uu3 g = shareDataPickerScreen.getRouter().g(string);
                if ((g instanceof mkd ? (mkd) g : null) != null) {
                    ckb.c.f2();
                }
            }
            yjd yjd = yjd.c;
            if (!yjd.P1().d()) {
                yjd.P1().b(":chat-list", (Bundle) null);
            }
        }
        return e5f.a;
    }
}
