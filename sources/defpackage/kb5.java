package defpackage;

import android.view.View;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: kb5  reason: default package */
public final /* synthetic */ class kb5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FakeInAppReviewBottomSheet b;

    public /* synthetic */ kb5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, int i) {
        this.a = i;
        this.b = fakeInAppReviewBottomSheet;
    }

    public final void onClick(View view) {
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.b;
        switch (this.a) {
            case 0:
                fakeInAppReviewBottomSheet.G0 = false;
                xx6 xx6 = (xx6) tx6.a.getAccessor().e();
                if (xx6 != null) {
                    xx6.b(4);
                }
                fakeInAppReviewBottomSheet.s0(true);
                return;
            default:
                bc7[] bc7Arr = FakeInAppReviewBottomSheet.H0;
                fakeInAppReviewBottomSheet.s0(true);
                return;
        }
    }
}
