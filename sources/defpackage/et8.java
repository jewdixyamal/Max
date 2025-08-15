package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: et8  reason: default package */
public final /* synthetic */ class et8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ht8 b;
    public final /* synthetic */ xs8 c;

    public /* synthetic */ et8(xs8 xs8, ht8 ht8) {
        this.c = xs8;
        this.b = ht8;
    }

    public final void onClick(View view) {
        xs8 xs8 = this.c;
        ht8 ht8 = this.b;
        switch (this.a) {
            case 0:
                long j = ht8.J0;
                b69 b69 = (b69) xs8;
                b69.getClass();
                bc7[] bc7Arr = MessagesListWidget.X0;
                b69.a.z0(j, ht8.I0);
                return;
            default:
                ht8.K(xs8, (String) null);
                return;
        }
    }

    public /* synthetic */ et8(ht8 ht8, xs8 xs8) {
        this.b = ht8;
        this.c = xs8;
    }
}
