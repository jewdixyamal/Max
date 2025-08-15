package defpackage;

import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: ekd  reason: default package */
public final /* synthetic */ class ekd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ ekd(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ShareDataPickerScreen.D0;
                sv8 sv8 = new sv8(shareDataPickerScreen.getContext());
                sv8.setId(qha.a);
                sv8.setInputHint(rha.a);
                sv8.setRightOuterIconActionState(lv8.a);
                sv8.setRightOuterIconTouchListener(s5c.a(sv8.getContext(), new zja(shareDataPickerScreen, 22, sv8)));
                sv8.setLeftInnerIconTouchListener(s5c.a(sv8.getContext(), new ekd(shareDataPickerScreen, 3)));
                return sv8;
            case 1:
                shareDataPickerScreen.B0.m();
                return e5f;
            case 2:
                return shareDataPickerScreen.B0;
            default:
                bc7[] bc7Arr2 = ShareDataPickerScreen.D0;
                ((ckd) shareDataPickerScreen.v0().c).k.z(0);
                return e5f;
        }
    }
}
