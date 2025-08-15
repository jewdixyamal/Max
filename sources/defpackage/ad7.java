package defpackage;

import android.os.Bundle;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: ad7  reason: default package */
public final class ad7 {
    public final /* synthetic */ KeyboardStickersWidget a;
    public final /* synthetic */ Bundle b;

    public ad7(KeyboardStickersWidget keyboardStickersWidget, Bundle bundle) {
        this.a = keyboardStickersWidget;
        this.b = bundle;
    }

    public final void a(z2e z2e) {
        pnf.o(((cc8) this.a.b.getValue()).X, yb8.a);
        sc7 sc7 = sc7.c;
        long j = this.b.getLong("arg_key_chat_id");
        f64 P1 = sc7.P1();
        P1.b(":stickers/preview?sticker_id=" + z2e.a + "&chat_id=" + j, (Bundle) null);
    }
}
