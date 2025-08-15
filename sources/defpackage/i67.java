package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: i67  reason: default package */
public final class i67 extends ffe implements c66 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ InviteFriendsToMaxBottomSheet s0;
    public final /* synthetic */ RLottieImageView t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i67(TextView textView, InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, RLottieImageView rLottieImageView, Continuation continuation) {
        super(3, continuation);
        this.Z = textView;
        this.s0 = inviteFriendsToMaxBottomSheet;
        this.t0 = rLottieImageView;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i67 i67 = new i67(this.Z, this.s0, this.t0, (Continuation) obj3);
        i67.X = (ConstraintLayout) obj;
        i67.Y = (fka) obj2;
        e5f e5f = e5f.a;
        i67.o(e5f);
        return e5f;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ConstraintLayout constraintLayout = this.X;
        this.Z.setTextColor(this.Y.getText().e);
        bc7[] bc7Arr = InviteFriendsToMaxBottomSheet.E0;
        InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = this.s0;
        boolean B0 = inviteFriendsToMaxBottomSheet.B0();
        e5f e5f = e5f.a;
        pq9 pq9 = qp4.u0;
        if ((B0 && pq9.b(constraintLayout.getContext()).j()) || (!inviteFriendsToMaxBottomSheet.B0() && !pq9.b(constraintLayout.getContext()).j())) {
            return e5f;
        }
        RLottieDrawable A0 = inviteFriendsToMaxBottomSheet.A0();
        A0.setCurrentFrame(A0.getFramesCount() - 1);
        RLottieImageView rLottieImageView = this.t0;
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView, A0);
        rLottieImageView.playAnimation();
        return e5f;
    }
}
