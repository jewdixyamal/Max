package defpackage;

import android.util.AttributeSet;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: fya  reason: default package */
public final /* synthetic */ class fya implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    public /* synthetic */ fya(PickerChatsListWidget pickerChatsListWidget, int i) {
        this.a = i;
        this.b = pickerChatsListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        PickerChatsListWidget pickerChatsListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PickerChatsListWidget.C0;
                s4a s4a = new s4a(17);
                ys2 ys2 = ys2.a;
                Class<q33> cls = q33.class;
                vu2 vu2 = new vu2(s4a, ys2.getAccessor().d(cls), ys2.getAccessor().d(y7d.class), ys2.getAccessor().d(qe5.class), ys2.getAccessor().d(w7b.class), ys2.getAccessor().d(lr2.class), ys2.getAccessor().d(kr2.class));
                khe khe = new khe(new s4a(18));
                v07 v07 = new v07(vu2);
                qn3 qn3 = (qn3) ys2.getAccessor().c(qn3.class);
                khe d = ys2.getAccessor().d(yx7.class);
                pu2 a2 = ((rt2) ys2.getAccessor().c(rt2.class)).a(pickerChatsListWidget.b);
                bc7 bc7 = PickerChatsListWidget.C0[0];
                oa2 oa2 = (oa2) pickerChatsListWidget.c.a(pickerChatsListWidget);
                return new eya(pickerChatsListWidget.b, a2, qn3, (q33) ys2.getAccessor().c(cls), new fya(pickerChatsListWidget, 4), oa2, (kke) ys2.getAccessor().c(kke.class), d, v07, khe);
            case 1:
                bc7[] bc7Arr2 = PickerChatsListWidget.C0;
                aba aba = new aba(pickerChatsListWidget.getContext(), (AttributeSet) null);
                aba.setIcon(woc.O0);
                aba.setTitle(new eqe(yoc.d));
                aba.setSubtitle(new eqe(yoc.c));
                return aba;
            case 2:
                bc7[] bc7Arr3 = PickerChatsListWidget.C0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerChatsListWidget.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(p8a.k);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                return endlessRecyclerView2;
            case 3:
                bc7[] bc7Arr4 = PickerChatsListWidget.C0;
                return new c03(new fya(pickerChatsListWidget, 5), new wz7(17, pickerChatsListWidget), new gya(pickerChatsListWidget, 0), new gya(pickerChatsListWidget, 1));
            case 4:
                bc7 bc72 = PickerChatsListWidget.C0[1];
                if (!((Boolean) pickerChatsListWidget.o.a(pickerChatsListWidget)).booleanValue() || !tpa.f(pickerChatsListWidget.b, "all.chat.folder")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                bc7[] bc7Arr5 = PickerChatsListWidget.C0;
                return a14.m(pickerChatsListWidget.getContext());
        }
    }
}
