package defpackage;

import android.view.View;
import one.me.contactlist.ContactListWidget;

/* renamed from: qo3  reason: default package */
public final /* synthetic */ class qo3 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ qo3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ContactListWidget contactListWidget = this.b;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                int j = contactListWidget.u0.j();
                a3g a3g = contactListWidget.Y;
                int j2 = a3g.j() + j;
                a3g a3g2 = contactListWidget.s0;
                int j3 = a3g2.j() + j2;
                int j4 = contactListWidget.t0.j();
                CharSequence n0 = contactListWidget.n0();
                if ((true ^ (n0 == null || n0.length() == 0)) || intValue < j || intValue < j4) {
                    return null;
                }
                if (intValue < j2) {
                    return ((nn3) ((ol7) a3g.C(intValue - j))).b;
                }
                if (intValue < j3) {
                    return ((nn3) ((ol7) a3g2.C(intValue - j2))).b;
                }
                return null;
            case 1:
                ((l67) contactListWidget.o.getValue()).a("show", "plus", "invite_friends");
                dy7.c(1).Y((View) obj).I(contactListWidget.E0).s().build().q(contactListWidget);
                return e5f;
            default:
                View view = (View) obj;
                bc7[] bc7Arr = ContactListWidget.P0;
                contactListWidget.getRouter().B(contactListWidget);
                return e5f;
        }
    }
}
