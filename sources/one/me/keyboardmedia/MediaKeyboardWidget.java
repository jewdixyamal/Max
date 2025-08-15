package one.me.keyboardmedia;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/keyboardmedia/MediaKeyboardWidget;", "Lone/me/sdk/arch/Widget;", "Lkre;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", "chatId", "", "onlyEmoji", "(Ljava/lang/String;JZLz84;)V", "kc8", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaKeyboardWidget extends Widget implements kre {
    public static final /* synthetic */ bc7[] C0;
    public ObjectAnimator A0;
    public AnimatorSet B0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final fs a;
    public final fs b;
    public final je7 c;
    public gw7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public xu3 v0;
    public final fd7 w0;
    public qg2 x0;
    public lh0 y0;
    public final EnumMap z0;

    static {
        Class<MediaKeyboardWidget> cls = MediaKeyboardWidget.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        C0 = new bc7[]{hob, zr6.e(oec, cls, "onlyEmoji", "getOnlyEmoji()Z", 0), zr6.f(cls, "bottomPanelView", "getBottomPanelView()Landroid/view/View;", 0, oec), zr6.f(cls, "keyboardBottomTabs", "getKeyboardBottomTabs()Lone/me/keyboardmedia/tablayout/KeyboardTabLayout;", 0, oec), zr6.f(cls, "keyboardViewPager", "getKeyboardViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oec), zr6.f(cls, "settingsButton", "getSettingsButton()Landroid/view/View;", 0, oec), zr6.f(cls, "removeButton", "getRemoveButton()Landroid/view/View;", 0, oec), zr6.f(cls, "showcaseButton", "getShowcaseButton()Landroid/view/View;", 0, oec)};
    }

    public MediaKeyboardWidget(String str, long j, boolean z, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("arg_key_chat_id", Long.valueOf(j)), new kpa("arg_key_only_emoji", Boolean.valueOf(z))));
    }

    public final void m0() {
        if (getView() != null) {
            List list = (List) this.w0.a;
            int currentItem = o0().getCurrentItem();
            if (currentItem >= 0 && currentItem <= y53.L(list)) {
                bd7 bd7 = (bd7) list.get(currentItem);
                int ordinal = bd7.ordinal();
                if (ordinal == 0) {
                    q0(bd7, (RecyclerView) o0().findViewById(jca.n));
                } else if (ordinal == 1) {
                    q0(bd7, (RecyclerView) o0().findViewById(jca.c));
                }
            }
        }
    }

    public final View n0() {
        return (View) this.X.T0(this, C0[2]);
    }

    public final ViewPager2 o0() {
        return (ViewPager2) this.Z.T0(this, C0[4]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        v3c.y(new lc8(3, (Continuation) null, 1), frameLayout);
        int i = vc7.a;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, vc7.a(frameLayout.getContext())));
        ViewPager2 viewPager2 = new ViewPager2(frameLayout.getContext());
        viewPager2.setId(jca.f);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOverScrollMode(2);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fm9.z(viewPager2);
        frameLayout.addView(viewPager2);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(jca.a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        v3c.y(new lc8(3, (Continuation) null, 0), frameLayout2);
        frameLayout2.setClickable(true);
        View view = new View(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.F(((double) fk4.d().getDisplayMetrics().density) * 0.5d));
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        v3c.y(new xr3(3, (Continuation) null, 1), view);
        frameLayout2.addView(view);
        int G = tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView.setId(jca.j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(G, G);
        layoutParams3.gravity = 8388627;
        float f = (float) 12;
        layoutParams3.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setPadding(4, 4, 4, 4);
        v3c.y(new a02(3, (Continuation) null, 1), appCompatImageView);
        tu0.K(appCompatImageView, 300, new y20(4));
        frameLayout2.addView(appCompatImageView);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView2.setId(jca.k);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(G, G);
        layoutParams4.gravity = 8388629;
        layoutParams4.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        appCompatImageView2.setLayoutParams(layoutParams4);
        appCompatImageView2.setPadding(4, 4, 4, 4);
        v3c.y(new a02(3, (Continuation) null, 2), appCompatImageView2);
        tu0.K(appCompatImageView2, 300, new ic8(this, 0));
        frameLayout2.addView(appCompatImageView2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView3.setId(jca.i);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(G, G);
        layoutParams5.gravity = 8388629;
        layoutParams5.rightMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        appCompatImageView3.setLayoutParams(layoutParams5);
        appCompatImageView3.setPadding(4, 4, 4, 4);
        v3c.y(new a02(3, (Continuation) null, 3), appCompatImageView3);
        appCompatImageView3.setOnClickListener(new ic8(this, 1));
        frameLayout2.addView(appCompatImageView3);
        ed7 ed7 = new ed7(frameLayout2.getContext(), (AttributeSet) null);
        ed7.setId(jca.p);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        int G2 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        ed7.setPadding(ed7.getPaddingLeft(), G2, ed7.getPaddingRight(), G2);
        ed7.setLayoutParams(layoutParams6);
        ed7.setTabMode(0);
        frameLayout2.addView(ed7);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        cc8 cc8 = (cc8) this.c.getValue();
        int currentItem = o0().getCurrentItem();
        List list = (List) this.w0.a;
        cc8.getClass();
        if (currentItem >= 0 && currentItem < list.size()) {
            ((kxc) ((hp) cc8.c.getValue())).l("app.last.media_keyboard.page.id", Long.valueOf(zr6.c(((bd7) list.get(currentItem)).b)));
        }
        ObjectAnimator objectAnimator = this.A0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A0 = null;
        AnimatorSet animatorSet = this.B0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.B0 = null;
        xu3 xu3 = this.v0;
        if (xu3 != null) {
            xu3.c();
        }
        this.v0 = null;
        lh0 lh0 = this.y0;
        if (lh0 != null) {
            o0().g(lh0);
        }
        this.y0 = null;
        this.z0.clear();
    }

    public final void onThemeChanged(fka fka) {
        ((ed7) this.Y.T0(this, C0[3])).onThemeChanged(fka);
    }

    public final void onViewCreated(View view) {
        List list;
        int i = 8;
        gw7 gw7 = this.o;
        bc7[] bc7Arr = C0;
        int i2 = 0;
        bc7 bc7 = bc7Arr[0];
        long longValue = ((Number) this.a.a(this)).longValue();
        Class<suc> cls = suc.class;
        Object v = ay7.v(getArgs(), Widget.ARG_SCOPE_ID, cls);
        if (v != null) {
            this.x0 = new qg2(this, gw7, longValue, ((suc) ((Parcelable) v)).a);
            o0().setAdapter(this.x0);
            ViewPager2 o0 = o0();
            lh0 lh0 = new lh0(8, this);
            this.y0 = lh0;
            o0.b(lh0);
            ed7 ed7 = (ed7) this.Y.T0(this, bc7Arr[3]);
            ViewPager2 o02 = o0();
            fd7 fd7 = this.w0;
            fd7.getClass();
            xu3 xu3 = new xu3(ed7, o02, new u00((Object) ed7, (Object) fd7, (Object) o02, 12));
            xu3.a();
            this.v0 = xu3;
            i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
            if (onBackPressedDispatcher != null) {
                eh7 eh7 = this.lifecycleOwner;
                ru3 ru3 = new ru3(!p0(), (m56) new wz7(1, this));
                if (eh7 != null) {
                    onBackPressedDispatcher.a(eh7, ru3);
                } else {
                    onBackPressedDispatcher.b(ru3);
                }
            }
            if (p0()) {
                list = Collections.singletonList(bd7.Z);
            } else {
                bd7.o.getClass();
                list = bd7.X;
            }
            fd7.a = list;
            qg2 qg2 = this.x0;
            if (qg2 != null) {
                if (!qg2.y0.isEmpty() || !(!list.isEmpty())) {
                    wj4 e = lz7.e(new b81(2, qg2.y0, list));
                    qg2.y0 = list;
                    e.a(new y8((Object) qg2));
                } else {
                    qg2.y0 = list;
                    qg2.p(0, list.size());
                }
            }
            ViewPager2 o03 = o0();
            View childAt = o03.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setItemAnimator((mdc) null);
                recyclerView.setHasFixedSize(true);
            }
            qg2 qg22 = this.x0;
            if ((qg22 != null ? qg22.y0.size() : 0) > 0) {
                ((View) this.t0.T0(this, bc7Arr[6])).setVisibility(p0() ? 0 : 8);
                ((View) this.s0.T0(this, bc7Arr[5])).setVisibility(p0() ^ true ? 0 : 8);
                View view2 = (View) this.u0.T0(this, bc7Arr[7]);
                if (!p0()) {
                    i = 0;
                }
                view2.setVisibility(i);
                cc8 cc8 = (cc8) this.c.getValue();
                cc8.getClass();
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (zr6.c(((bd7) it.next()).b) == ((kxc) ((hp) cc8.c.getValue())).g.getLong("app.last.media_keyboard.page.id", 0)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    i2 = i3;
                }
                o03.e(i2, true);
                int i4 = vc7.a;
                o03.measure(View.MeasureSpec.makeMeasureSpec(o03.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(vc7.a(o03.getContext()), 1073741824));
                m0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final boolean p0() {
        bc7 bc7 = C0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final void q0(bd7 bd7, RecyclerView recyclerView) {
        bd7 bd72 = bd7;
        RecyclerView recyclerView2 = recyclerView;
        EnumMap enumMap = this.z0;
        if (!enumMap.containsKey(bd72) && recyclerView2 != null) {
            kc8 kc8 = new kc8(getContext(), new e11(0, this, MediaKeyboardWidget.class, "showBottomPanel", "showBottomPanel()V", 0, 27), new e11(0, this, MediaKeyboardWidget.class, "hideBottomPanel", "hideBottomPanel()V", 0, 28));
            recyclerView2.m(kc8);
            enumMap.put(bd72, kc8);
        }
    }

    /* JADX WARNING: type inference failed for: r6v20, types: [fd7, java.lang.Object] */
    public MediaKeyboardWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(Long.class, 0L, "arg_key_chat_id");
        this.b = new fs(Boolean.class, Boolean.FALSE, "arg_key_only_emoji");
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, Widget.ARG_SCOPE_ID, cls);
        if (v != null) {
            this.c = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, cc8.class, (k56) null);
            this.X = viewBinding(jca.a);
            this.Y = viewBinding(jca.p);
            this.Z = viewBinding(jca.f);
            this.s0 = viewBinding(jca.j);
            this.t0 = viewBinding(jca.i);
            this.u0 = viewBinding(jca.k);
            ? obj = new Object();
            obj.a = nz4.a;
            this.w0 = obj;
            this.z0 = new EnumMap(bd7.class);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaKeyboardWidget(String str, long j, boolean z, int i, z84 z84) {
        this(str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? false : z, (z84) null);
    }
}
