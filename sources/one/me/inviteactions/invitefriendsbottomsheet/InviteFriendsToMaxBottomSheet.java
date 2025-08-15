package one.me.inviteactions.invitefriendsbottomsheet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitefriendsbottomsheet/InviteFriendsToMaxBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class InviteFriendsToMaxBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] E0;
    public final je7 A0;
    public final je7 B0;
    public final w4d C0 = mqd.D();
    public final fs D0 = new fs(Boolean.class, "is_current_animation_dark");
    public final je7 y0;
    public final je7 z0;

    static {
        Class<InviteFriendsToMaxBottomSheet> cls = InviteFriendsToMaxBottomSheet.class;
        E0 = new bc7[]{new oi9(cls, "inviteFriendsJob", "getInviteFriendsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "isCurrentAnimationDark", "isCurrentAnimationDark()Z")};
    }

    public InviteFriendsToMaxBottomSheet() {
        super((Bundle) null, 1, (z84) null);
        c57 c57 = c57.a;
        this.y0 = c57.getAccessor().d(q33.class);
        this.z0 = c57.getAccessor().d(y7d.class);
        this.A0 = c57.getAccessor().d(l67.class);
        je7 createViewModelLazy = createViewModelLazy(h67.class, new nj4(12, new m57(3)));
        this.B0 = createViewModelLazy;
        ((h67) createViewModelLazy.getValue()).getClass();
    }

    public final RLottieDrawable A0() {
        boolean j = qp4.u0.b(getContext()).j();
        bc7 bc7 = E0[1];
        this.D0.b(this, Boolean.valueOf(j));
        return RLottieFactory.createByAsset$default(getContext(), B0() ? "invite_friends_dark.json" : "invite_friends_light.json", (String) null, tu0.G(((float) 248) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density), false, false, false, false, false, 900, (Object) null);
    }

    public final boolean B0() {
        bc7 bc7 = E0[1];
        return ((Boolean) this.D0.a(this)).booleanValue();
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        x77 x77 = (x77) this.C0.T0(this, E0[0]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setId(gca.p);
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView, A0());
        rLottieImageView.playAnimation();
        constraintLayout.addView(rLottieImageView, tu0.G(((float) 248) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density));
        TextView textView = new TextView(getContext());
        textView.setId(gca.r);
        textView.setGravity(17);
        i4f.i.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setText(hca.l);
        constraintLayout.addView(textView, -2, -2);
        f7a f7a = new f7a(getContext());
        f7a.setId(gca.q);
        f7a.setText(yoc.s0);
        tu0.K(f7a, 300, new xx5(7, this));
        constraintLayout.addView(f7a, 0, -2);
        v3c.y(new i67(textView, this, rLottieImageView, (Continuation) null), constraintLayout);
        dj3 q = fp3.q(constraintLayout);
        int id = rLottieImageView.getId();
        q.d(id, 3, 0, 3);
        au1.p((float) 44, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = textView.getId();
        q.d(id2, 3, rLottieImageView.getId(), 4);
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        int id3 = f7a.getId();
        q.d(id3, 3, textView.getId(), 4);
        au1.p((float) 48, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        q.d(id3, 4, 0, 4);
        new l2a(q, 4, id3, 4).e(tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
        q.a(constraintLayout);
        return constraintLayout;
    }
}
