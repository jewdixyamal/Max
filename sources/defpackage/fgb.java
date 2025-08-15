package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: fgb  reason: default package */
public final class fgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fgb(ProfileEditScreen profileEditScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fgb) n((meb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fgb fgb = new fgb(this.Y, this.Z, continuation);
        fgb.X = obj;
        return fgb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        meb meb = (meb) this.X;
        bc7[] bc7Arr = ProfileEditScreen.y0;
        ProfileEditScreen profileEditScreen = this.Y;
        profileEditScreen.getClass();
        bc7[] bc7Arr2 = ProfileEditScreen.y0;
        bc7 bc7 = bc7Arr2[4];
        q7c q7c = profileEditScreen.u0;
        s5a s5a = (s5a) q7c.T0(profileEditScreen, bc7);
        String str = meb.a;
        Long l = new Long(meb.b);
        CharSequence charSequence = meb.d;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(s5a, str, l, charSequence);
        ((s5a) q7c.T0(profileEditScreen, bc7Arr2[4])).setAddBadgeVisibility(meb.f);
        int s = au1.s(meb.g);
        boolean z = meb.e;
        if (s == 0) {
            qm0 qm0 = profileEditScreen.x0;
            if (!qm0.a()) {
                ((ViewGroup) this.Z).addView((View) qm0.getValue());
            }
            OneMeButton oneMeButton = (OneMeButton) qm0.getValue();
            int i = 0;
            oneMeButton.setVisibility(z ? 0 : 8);
            if (z) {
                i = (tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density) * 2) + oneMeButton.getMeasuredHeight();
            }
            RecyclerView recyclerView = (RecyclerView) profileEditScreen.Z.T0(profileEditScreen, bc7Arr2[1]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i);
        } else if (s != 1) {
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            profileEditScreen.m0().setRightActions(new mka(new zfb(profileEditScreen, 5)));
        } else {
            profileEditScreen.m0().setRightActions(nka.a);
        }
        return e5f.a;
    }
}
