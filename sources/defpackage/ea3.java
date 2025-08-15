package defpackage;

import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.sdk.arch.Widget;

/* renamed from: ea3  reason: default package */
public final /* synthetic */ class ea3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComplaintBottomSheet b;

    public /* synthetic */ ea3(ComplaintBottomSheet complaintBottomSheet, int i) {
        this.a = i;
        this.b = complaintBottomSheet;
    }

    public final Object invoke() {
        ComplaintBottomSheet complaintBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7 bc7 = ComplaintBottomSheet.X[0];
                return new oa3(((Number) complaintBottomSheet.a.a(complaintBottomSheet)).longValue());
            default:
                bc7[] bc7Arr = ComplaintBottomSheet.X;
                wha wha = new wha((Widget) complaintBottomSheet);
                wha.e(new kia(woc.z));
                wha.g(new eqe(maa.b));
                return wha;
        }
    }
}
