package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: po3  reason: default package */
public final /* synthetic */ class po3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ po3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    public final Object invoke() {
        wka wka = null;
        uo3 uo3 = uo3.a;
        ContactListWidget contactListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ContactListWidget.P0;
                bc7 bc7 = bc7Arr[7];
                if (((Boolean) contactListWidget.M0.a(contactListWidget)).booleanValue()) {
                    ((EndlessRecyclerView2) contactListWidget.C0.T0(contactListWidget, bc7Arr[2])).x0(0);
                    bc7 bc72 = bc7Arr[7];
                    contactListWidget.M0.b(contactListWidget, Boolean.FALSE);
                }
                return e5f.a;
            case 1:
                bc7[] bc7Arr2 = ContactListWidget.P0;
                return Boolean.valueOf(((dn3) contactListWidget.p0().z0.a.getValue()).b());
            case 2:
                bc7[] bc7Arr3 = ContactListWidget.P0;
                return contactListWidget.getRouter();
            case 3:
                bc7[] bc7Arr4 = ContactListWidget.P0;
                cla cla = new cla(contactListWidget.getContext(), 6);
                cla.setId(z8a.t);
                int ordinal = contactListWidget.p0().b.ordinal();
                if (ordinal == 0) {
                    cla.setForm(uka.a);
                    cla.setTitle(l0c.contact_list_call_contact_title);
                } else if (ordinal == 1) {
                    cla.setForm(uka.b);
                    cla.setTitle(jpc.Q);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (vo3.$EnumSwitchMapping$1[contactListWidget.p0().b.ordinal()] == 1) {
                    cla.setLeftActions(new kka(new qo3(contactListWidget, 2)));
                }
                xka xka = new xka(new gd1(6, contactListWidget));
                int ordinal2 = contactListWidget.p0().b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        wka = new wka(woc.M0, 0, new qo3(contactListWidget, 1), 14);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                cla.setRightActions(new pka(xka, wka));
                eha searchView = cla.getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(z7.B(cla.getContext(), a9a.j));
                    if (contactListWidget.q0()) {
                        searchView.setExpandWithAnimation(false);
                        searchView.d();
                        searchView.setExpandWithAnimation(true);
                        searchView.setSearchText(contactListWidget.n0());
                    }
                }
                return cla;
            case 4:
                bc7[] bc7Arr5 = ContactListWidget.P0;
                return new yo3(contactListWidget);
            case 5:
                bc7[] bc7Arr6 = ContactListWidget.P0;
                uo3 uo32 = contactListWidget.p0().b;
                uo32.getClass();
                return new bh0(uo32 == uo3 ? dh0.a.getAccessor().d(br3.class) : dh0.a.getAccessor().d(os3.class), ((Boolean) contactListWidget.z0.getValue()).booleanValue(), new po3(contactListWidget, 1), 14);
            case 6:
                bc7[] bc7Arr7 = ContactListWidget.P0;
                return new wha((Widget) contactListWidget);
            case 7:
                bc7[] bc7Arr8 = ContactListWidget.P0;
                return new rg1(new khe(new po3(contactListWidget, 2)), new l5g(contactListWidget, 0));
            default:
                bc7[] bc7Arr9 = ContactListWidget.P0;
                uo3 uo33 = contactListWidget.p0().b;
                uo33.getClass();
                if (uo33 == uo3) {
                    return wuc.CALL_NEW_CALL;
                }
                return null;
        }
    }
}
