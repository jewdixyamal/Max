package defpackage;

import android.text.style.ClickableSpan;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: gt8  reason: default package */
public final class gt8 implements hk7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(nu8 nu8) {
        switch (this.a) {
            case 0:
                MessagesListWidget.n0(((b69) ((xs8) this.b)).a, nu8, ((ht8) this.c).J0);
                return;
            default:
                xs8 xs8 = ((m29) this.b).X;
                MessagesListWidget.n0(((b69) xs8).a, nu8, ((MessageModel) this.c).a);
                return;
        }
    }

    public final void b(String str, lk7 lk7, ClickableSpan clickableSpan) {
        switch (this.a) {
            case 0:
                MessagesListWidget.m0(((b69) ((xs8) this.b)).a, str, lk7, ((ht8) this.c).J0);
                return;
            default:
                xs8 xs8 = ((m29) this.b).X;
                MessagesListWidget.m0(((b69) xs8).a, str, lk7, ((MessageModel) this.c).a);
                return;
        }
    }
}
