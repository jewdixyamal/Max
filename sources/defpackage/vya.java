package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: vya  reason: default package */
public final /* synthetic */ class vya implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ vya(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    public final Object invoke() {
        PickerContactsListWidget pickerContactsListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PickerContactsListWidget.y0;
                aba aba = new aba(pickerContactsListWidget.getContext(), (AttributeSet) null);
                aba.setIcon(woc.O0);
                aba.setTitle(new eqe(yoc.d));
                aba.setSubtitle(new eqe(yoc.c));
                return aba;
            default:
                bc7[] bc7Arr2 = PickerContactsListWidget.y0;
                RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(p8a.d0);
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setClipToOutline(false);
                recyclerView.setItemAnimator((mdc) null);
                recyclerView.setHasFixedSize(true);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(pickerContactsListWidget.s0);
                recyclerView.j(new c03(new pw5(recyclerView, 1), new uya(pickerContactsListWidget, 2), new ww9(17), new uya(pickerContactsListWidget, 1)));
                pickerContactsListWidget.m0(recyclerView);
                pickerContactsListWidget.v0 = z7.m(recyclerView);
                return recyclerView;
        }
    }
}
