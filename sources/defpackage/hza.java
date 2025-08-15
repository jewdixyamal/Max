package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: hza  reason: default package */
public final /* synthetic */ class hza implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerMembersListWidget b;

    public /* synthetic */ hza(PickerMembersListWidget pickerMembersListWidget, int i) {
        this.a = i;
        this.b = pickerMembersListWidget;
    }

    public final Object invoke() {
        PickerMembersListWidget pickerMembersListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PickerMembersListWidget.x0;
                bc7 bc7 = PickerMembersListWidget.x0[0];
                long longValue = ((Number) pickerMembersListWidget.a.a(pickerMembersListWidget)).longValue();
                ys2 ys2 = ys2.a;
                return new pza(longValue, (mp8) ys2.getAccessor().c(mp8.class), (kq8) ys2.getAccessor().c(kq8.class), ys2.getAccessor().d(iy2.class));
            case 1:
                bc7[] bc7Arr2 = PickerMembersListWidget.x0;
                aba aba = new aba(pickerMembersListWidget.getContext(), (AttributeSet) null);
                aba.setIcon(woc.O0);
                aba.setTitle(new eqe(yoc.d));
                aba.setSubtitle(new eqe(yoc.c));
                return aba;
            default:
                bc7[] bc7Arr3 = PickerMembersListWidget.x0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(p8a.d0);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                endlessRecyclerView2.setAdapter(pickerMembersListWidget.Y);
                endlessRecyclerView2.j(new c03(new u15(endlessRecyclerView2, 1), new ga(endlessRecyclerView2, 25, pickerMembersListWidget), new pz2(1), new pz2(1)));
                endlessRecyclerView2.l(new w54(endlessRecyclerView2));
                if (pickerMembersListWidget.n0()) {
                    pickerMembersListWidget.m0(endlessRecyclerView2);
                }
                pickerMembersListWidget.u0 = z7.m(endlessRecyclerView2);
                return endlessRecyclerView2;
        }
    }
}
