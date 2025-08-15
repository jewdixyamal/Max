package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: lb5  reason: default package */
public final class lb5 extends ffe implements c66 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ FakeInAppReviewBottomSheet Z;
    public final /* synthetic */ AppCompatTextView s0;
    public final /* synthetic */ AppCompatTextView t0;
    public final /* synthetic */ AppCompatTextView u0;
    public final /* synthetic */ g5c v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, g5c g5c, Continuation continuation) {
        super(3, continuation);
        this.Z = fakeInAppReviewBottomSheet;
        this.s0 = appCompatTextView;
        this.t0 = appCompatTextView2;
        this.u0 = appCompatTextView3;
        this.v0 = g5c;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatTextView appCompatTextView = this.u0;
        g5c g5c = this.v0;
        lb5 lb5 = new lb5(this.Z, this.s0, this.t0, appCompatTextView, g5c, (Continuation) obj3);
        lb5.X = (ConstraintLayout) obj;
        lb5.Y = (fka) obj2;
        e5f e5f = e5f.a;
        lb5.o(e5f);
        return e5f;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ConstraintLayout constraintLayout = this.X;
        fka fka = this.Y;
        pq9 pq9 = qp4.u0;
        boolean j = pq9.b(constraintLayout.getContext()).j();
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.Z;
        fakeInAppReviewBottomSheet.B0.getPaint().setColor(fka.i().b.b);
        fakeInAppReviewBottomSheet.D0.getPaint().setColor(j ? -14860999 : -1969940);
        this.s0.setTextColor(fka.getText().e);
        this.t0.setTextColor(fka.getText().i);
        this.u0.setTextColor(this.v0.getSelected() != 0 ? -1 : pq9.j(constraintLayout).getText().i);
        constraintLayout.invalidate();
        return e5f.a;
    }
}
