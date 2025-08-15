package defpackage;

import one.me.contactlist.ContactListWidget;

/* renamed from: yo3  reason: default package */
public final class yo3 extends a3a {
    public final /* synthetic */ ContactListWidget d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo3(ContactListWidget contactListWidget) {
        super(false);
        this.d = contactListWidget;
    }

    public final void b() {
        bc7[] bc7Arr = ContactListWidget.P0;
        eha searchView = this.d.o0().getSearchView();
        if (searchView != null) {
            searchView.b();
        }
    }
}
