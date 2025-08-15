package defpackage;

import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: u15  reason: default package */
public final /* synthetic */ class u15 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndlessRecyclerView2 b;

    public /* synthetic */ u15(EndlessRecyclerView2 endlessRecyclerView2, int i) {
        this.a = i;
        this.b = endlessRecyclerView2;
    }

    public final Object invoke() {
        EndlessRecyclerView2 endlessRecyclerView2 = this.b;
        switch (this.a) {
            case 0:
                int i = EndlessRecyclerView2.i2;
                String name = EndlessRecyclerView2.class.getName();
                String resourceName = endlessRecyclerView2.getResources().getResourceName(endlessRecyclerView2.getId());
                return eae.n0(name + "-" + resourceName, ".", "_");
            default:
                bc7[] bc7Arr = PickerMembersListWidget.x0;
                return a14.m(endlessRecyclerView2.getContext());
        }
    }
}
