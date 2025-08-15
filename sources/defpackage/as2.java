package defpackage;

import android.os.Bundle;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: as2  reason: default package */
public final class as2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ as2(ChatTitleIconScreen chatTitleIconScreen, wm9 wm9, int i) {
        this.a = i;
        this.b = wm9;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                syd syd = (syd) obj;
                syd.a2();
                syd.R1(syd.Z1(((rr2) this.b).b));
                return e5f.a;
            case 1:
                syd syd2 = (syd) obj;
                syd2.a2();
                syd2.P1().b(ey8.i(((qr2) this.b).b, ":profile/edit/link?id=", "&type=local_chat&flow=create"), (Bundle) null);
                return e5f.a;
            default:
                syd syd3 = (syd) obj;
                syd3.a2();
                syd3.P1().b(ey8.h(((pr2) this.b).b, ":start-conversation/add-subscribers?id="), (Bundle) null);
                return e5f.a;
        }
    }
}
