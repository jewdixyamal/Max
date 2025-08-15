package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.tamtam.ExceptionHandler$HandledException;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarsScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lwab;", "Lxt3;", "Lzvc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lhdb;", "type", "(JLhdb;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileAvatarsScreen extends SwipeWidget implements wab, xt3, zvc {
    public static final /* synthetic */ bc7[] z0;
    public final khe X;
    public final x27 Y;
    public final glc Z;
    public final je7 o;
    public final je7 s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final gbb w0;
    public final je7 x0;
    public final je7 y0;

    static {
        Class<ProfileAvatarsScreen> cls = ProfileAvatarsScreen.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oec = nec.a;
        z0 = new bc7[]{hob, zr6.e(oec, cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), zr6.f(cls, "progressIndication", "getProgressIndication()Landroid/view/View;", 0, oec)};
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [p04, gbb] */
    public ProfileAvatarsScreen(Bundle bundle) {
        super(bundle);
        this.o = xcb.a.g();
        this.X = new khe(new pbb(this, 0));
        this.Y = x27.c;
        this.Z = new glc(wuc.AVATAR_VIEWER);
        this.s0 = createViewModelLazy(ccb.class, new jp8(15, new eh2(bundle, 6)));
        this.t0 = viewBinding(qwb.profile_contact_avatars_toolbar);
        this.u0 = viewBinding(qwb.profile_contact_avatars_viewpager);
        this.v0 = viewBinding(qwb.profile_contact_avatars_progress_indicator);
        ? p04 = new p04(this, 0);
        p04.w0 = nz4.a;
        this.w0 = p04;
        this.x0 = tu0.r(3, new pbb(this, 1));
        this.y0 = tu0.r(3, new pbb(this, 2));
    }

    public static final View v0(ProfileAvatarsScreen profileAvatarsScreen) {
        profileAvatarsScreen.getClass();
        return (View) profileAvatarsScreen.v0.T0(profileAvatarsScreen, z0[2]);
    }

    public static final void w0(ProfileAvatarsScreen profileAvatarsScreen, ebb ebb, int i) {
        profileAvatarsScreen.getClass();
        CharSequence charSequence = "";
        if (ebb instanceof dbb) {
            CharSequence b = ((dbb) ebb).a.b(profileAvatarsScreen.getContext());
            if (b != null) {
                charSequence = b;
            }
            if (!tpa.f(profileAvatarsScreen.A0().getTitle().getText(), charSequence)) {
                profileAvatarsScreen.A0().setTitle(charSequence);
            }
        } else if (tpa.f(ebb, cbb.a)) {
            int size = profileAvatarsScreen.w0.w0.size();
            if (i < 0 || size <= 0) {
                profileAvatarsScreen.A0().setTitle(charSequence);
                return;
            }
            cla A0 = profileAvatarsScreen.A0();
            A0.setTitle((CharSequence) (i + 1) + " " + ((String) profileAvatarsScreen.y0.getValue()) + " " + size);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final cla A0() {
        return (cla) this.t0.T0(this, z0[0]);
    }

    public final ccb B0() {
        return (ccb) this.s0.getValue();
    }

    public final ViewPager2 C0() {
        return (ViewPager2) this.u0.T0(this, z0[1]);
    }

    public final boolean P() {
        return true;
    }

    public final boolean S() {
        return ((se5) ((qe5) this.o.getValue())).u();
    }

    public final x27 getInsetsConfig() {
        return this.Y;
    }

    public final bvc getScreenDelegate() {
        return this.Z;
    }

    public final boolean n0() {
        return false;
    }

    public final void o0() {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(((fka) this.X.getValue()).b().j);
        }
        y0(true);
        z0(true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        je7 je7 = this.x0;
        ((a7g) je7.getValue()).b(false);
        ((a7g) je7.getValue()).a(false);
        ((a7g) je7.getValue()).a.w();
        pge pge = new pge(getContext());
        pge.setId(-1);
        pge.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        pge.setBackgroundColor(qp4.u0.o(layoutInflater.getContext()).c.b().j);
        int i = qwb.profile_contact_avatars_viewpager;
        ViewPager2 viewPager2 = new ViewPager2(pge.getContext());
        viewPager2.setId(i);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setLayoutDirection(0);
        viewPager2.setOffscreenPageLimit(1);
        pge.addView(viewPager2);
        int i2 = qwb.profile_contact_avatars_toolbar;
        cla cla = new cla(pge.getContext(), 6);
        cla.setId(i2);
        khe khe = this.X;
        cla.setCustomTheme((fka) khe.getValue());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        cla.setLayoutParams(layoutParams);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new wz7(22, this)));
        cla.setRightActions(new rka(new om8(1, this, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 9)));
        br7.e(cla);
        pge.addView(cla);
        int i3 = qwb.profile_contact_avatars_progress_indicator;
        FrameLayout frameLayout = new FrameLayout(pge.getContext());
        frameLayout.setId(i3);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(((fka) khe.getValue()).b().f);
        nfa nfa = new nfa(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        nfa.setLayoutParams(layoutParams2);
        nfa.setAppearance(ffa.a);
        nfa.setSize(hfa.a);
        frameLayout.addView(nfa);
        frameLayout.setOnClickListener(new y20(6));
        frameLayout.setVisibility(8);
        pge.addView(frameLayout);
        return pge;
    }

    public final void onDestroy() {
        super.onDestroy();
        y0(true);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0().setAdapter(this.w0);
        C0().b(new lh0(9, this));
        w7c d = B0().b.d();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(d, getViewLifecycleOwner().Q(), fg7), new rbb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().Z, getViewLifecycleOwner().Q(), fg7), new sbb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void q0() {
        View view = getView();
        if (view != null) {
            ((fka) this.X.getValue()).b();
            view.setBackgroundColor(0);
        }
    }

    public final void r0() {
        if (getView() != null) {
            A0().setVisibility(8);
            A0().setAlpha(0.0f);
            y0(true);
        }
    }

    public final Long t0() {
        return 1000L;
    }

    public final Integer u0() {
        return Integer.valueOf(((fka) this.X.getValue()).b().j);
    }

    public final void x0(boolean z) {
        if (getView() != null) {
            float f = z ? 1.0f : 0.0f;
            if (v0(this).getAlpha() != f) {
                ViewPropertyAnimator animate = v0(this).animate();
                animate.cancel();
                animate.alpha(f).setDuration(200).setListener(new qbb(this, z, 0)).start();
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        ccb B0 = B0();
        int currentItem = C0().getCurrentItem();
        uab uab = (uab) x53.j0(currentItem, (List) B0.b.d().a.getValue());
        if (uab != null) {
            try {
                String str = (String) x53.g0(uab.b);
                xab xab = (xab) x53.j0(i, xab.t0);
                if (xab != null) {
                    pnf.n(B0, ((w9a) ((kke) B0.X.getValue())).b(), (vx3) null, new bcb(B0, xab, uab, str, currentItem, (Continuation) null), 2);
                }
            } catch (NoSuchElementException e) {
                ((cba) ((o45) B0.o.getValue())).c(new ExceptionHandler$HandledException("model.urls.isNotEmpty() == false", e, 4, (String) null), false);
            }
        }
    }

    public final void y0(boolean z) {
        je7 je7 = this.x0;
        if (z) {
            ((a7g) je7.getValue()).a.x(3);
        } else {
            ((a7g) je7.getValue()).a.k(3);
        }
    }

    public final void z0(boolean z) {
        if (getView() != null) {
            if ((A0().getVisibility() == 0) != z) {
                float f = z ? 1.0f : 0.0f;
                ViewPropertyAnimator animate = A0().animate();
                animate.cancel();
                animate.alpha(f).setDuration(200).setListener(new qbb(this, z, 1)).start();
            }
        }
    }

    public ProfileAvatarsScreen(long j, hdb hdb) {
        this(dy7.g(new kpa("EXTRA_ID", Long.valueOf(j)), new kpa("EXTRA_TYPE", hdb.a)));
    }
}
