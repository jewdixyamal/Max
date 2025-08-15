package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/profile/screens/media/ChatMediaTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaTabWidget extends Widget {
    public static final /* synthetic */ bc7[] w0;
    public final qm0 X;
    public final qm0 Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public xu3 t0;
    public final hh2 u0;
    public final qg2 v0;

    static {
        Class<ChatMediaTabWidget> cls = ChatMediaTabWidget.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oec = nec.a;
        w0 = new bc7[]{hob, zr6.e(oec, cls, "mediaTabs", "getMediaTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), zr6.f(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0, oec), zr6.f(cls, "mediaViewPager", "getMediaViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oec)};
    }

    public ChatMediaTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new e11(0, this, ChatMediaTabWidget.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 4), (k56) null, 6);
        this.b = x27.d;
        this.c = xcb.a.getAccessor().d(an9.class);
        this.o = createViewModelLazy(dh2.class, new s(29, new eh2(bundle, 0)));
        this.X = binding(new fh2(this, 0));
        this.Y = binding(new fh2(this, 1));
        this.Z = viewBinding(wea.o0);
        this.s0 = binding(new fh2(this, 2));
        this.u0 = new hh2();
        this.v0 = new qg2(this, bundle.getLong("chat_id"));
    }

    public static final wuc m0(ChatMediaTabWidget chatMediaTabWidget) {
        chatMediaTabWidget.getClass();
        int ordinal = ((ih2) ih2.o.get(chatMediaTabWidget.n0().getCurrentItem())).ordinal();
        wuc wuc = wuc.CHAT_ATTACHMENTS_MEDIA;
        if (ordinal == 0) {
            return wuc;
        }
        if (ordinal == 1) {
            return wuc.CHAT_ATTACHMENTS_FILES;
        }
        if (ordinal == 2) {
            return wuc.CHAT_ATTACHMENTS_LINKS;
        }
        if (ordinal == 3) {
            return wuc;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final ViewPager2 n0() {
        bc7 bc7 = w0[3];
        return (ViewPager2) this.s0.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(wea.m0);
        linearLayout.setOrientation(1);
        bc7[] bc7Arr = w0;
        bc7 bc7 = bc7Arr[0];
        linearLayout.addView((cla) this.X.getValue());
        bc7 bc72 = bc7Arr[1];
        linearLayout.addView((wja) this.Y.getValue());
        w12 b2 = s36.b(linearLayout.getContext());
        b2.setId(wea.o0);
        linearLayout.addView(b2);
        linearLayout.addView(n0());
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        xu3 xu3 = this.t0;
        if (xu3 != null) {
            xu3.c();
        }
        this.t0 = null;
    }

    public final void onViewCreated(View view) {
        ViewPager2 n0 = n0();
        qg2 qg2 = this.v0;
        n0.setAdapter(qg2);
        bc7[] bc7Arr = w0;
        bc7 bc7 = bc7Arr[1];
        wja wja = (wja) this.Y.getValue();
        ViewPager2 n02 = n0();
        hh2 hh2 = this.u0;
        hh2.getClass();
        xu3 xu3 = new xu3(wja, n02, new f9(wja, hh2));
        xu3.a();
        this.t0 = xu3;
        od2.L(new zn5(tu0.g(new t03(((dh2) this.o.getValue()).c, 11), getViewLifecycleOwner().Q(), fg7.o), new gh2((Continuation) null, this), 5), getViewLifecycleScope());
        ViewPager2 n03 = n0();
        View childAt = n03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((mdc) null);
            recyclerView.setHasFixedSize(true);
        }
        n03.e(0, false);
        if (qg2.y0.size() > 0) {
            n03.measure(View.MeasureSpec.makeMeasureSpec(n03.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(n03.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        znc childRouter = getChildRouter((ViewGroup) this.Z.T0(this, bc7Arr[2]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget((Bundle) null, 1, (z84) null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(i24.e(pinBarsWidget, (zu3) null, (zu3) null));
        }
    }

    public ChatMediaTabWidget(long j) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j))));
    }
}
