package one.me.chats.picker;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import defpackage.qza;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/chats/picker/AbstractPickerScreen;", "Lqza;", "T", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public abstract class AbstractPickerScreen<T extends qza> extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final qm0 X;
    public final q7c Y;
    public final q7c Z;
    public final x27 a = x27.d;
    public final String b = "PickerScreen";
    public final je7 c;
    public final qm0 o;

    static {
        Class<AbstractPickerScreen> cls = AbstractPickerScreen.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oec = nec.a;
        s0 = new bc7[]{hob, zr6.e(oec, cls, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), zr6.f(cls, "mainContainer", "getMainContainer()Landroid/view/ViewGroup;", 0, oec), zr6.f(cls, "pickerWidgetContainer", "getPickerWidgetContainer()Landroid/view/ViewGroup;", 0, oec)};
    }

    public AbstractPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.c = createViewModelLazy(txa.class, new s(1, new x2((Object) this, 0, (Object) bundle)));
        this.o = binding(new y2(this, 0));
        this.X = binding(new y2(this, 1));
        this.Y = viewBinding(p8a.c0);
        this.Z = viewBinding(p8a.b0);
    }

    public x27 getInsetsConfig() {
        return this.a;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m46getScopeIdIluPPks() {
        return this.b;
    }

    public abstract Iterable m0();

    public abstract sya n0();

    public abstract Widget o0(String str);

    /* JADX WARNING: type inference failed for: r11v11, types: [android.widget.ScrollView, android.view.View, e28, android.view.ViewGroup] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(p8a.c0);
        linearLayout.addView(u0(), new FrameLayout.LayoutParams(-1, -2));
        if (r0() != null) {
            ? scrollView = new ScrollView(linearLayout.getContext(), (AttributeSet) null);
            scrollView.a = -1;
            scrollView.setMaxHeight(tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density));
            scrollView.addView(r0(), new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
            View view = new View(linearLayout.getContext());
            v3c.y(new a3(3, (Continuation) null, 0), view);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, tu0.F(((double) fk4.d().getDisplayMetrics().density) * 0.5d)));
        }
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(p8a.b0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(frameLayout, layoutParams);
        znc childRouter = getChildRouter(frameLayout);
        Widget o0 = o0(this.b);
        o0.setRetainViewMode(tu3.b);
        if (!childRouter.n()) {
            childRouter.R(new coc(o0, (String) null, (zu3) null, (zu3) null, false, -1));
        }
        for (View addView : m0()) {
            linearLayout.addView(addView);
        }
        FrameLayout frameLayout2 = new FrameLayout(layoutInflater.getContext());
        frameLayout2.addView(linearLayout);
        return frameLayout2;
    }

    public void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new j31(oz4.a, v0().X, new c3(this, (Continuation) null, 0)), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().s0, getViewLifecycleOwner().Q(), fg7.o), new b3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public abstract cla p0(Context context);

    public abstract qza q0();

    public g9a r0() {
        bc7 bc7 = s0[1];
        return (g9a) this.X.getValue();
    }

    public abstract j0e s0();

    public final ViewGroup t0() {
        return (ViewGroup) this.Y.T0(this, s0[2]);
    }

    public final cla u0() {
        bc7 bc7 = s0[0];
        return (cla) this.o.getValue();
    }

    public final txa v0() {
        return (txa) this.c.getValue();
    }

    public abstract Set w0(Bundle bundle);
}
