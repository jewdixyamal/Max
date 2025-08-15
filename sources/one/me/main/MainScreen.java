package one.me.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/main/MainScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "route", "Landroid/os/Bundle;", "routeArgs", "(Ljava/lang/String;Landroid/os/Bundle;)V", "ix7", "huc", "main-screen_release"}, k = 1, mv = {2, 0, 0})
public final class MainScreen extends Widget {
    public static final huc Z = new Object();
    public static final /* synthetic */ bc7[] s0;
    public static final kld t0 = lld.b(0, 1, 0, 4);
    public final q7c X;
    public final String Y;
    public final je7 a;
    public final glc b;
    public final LinkedHashMap c;
    public final q7c o;

    /* JADX WARNING: type inference failed for: r1v1, types: [huc, java.lang.Object] */
    static {
        Class<MainScreen> cls = MainScreen.class;
        s0 = new bc7[]{new hob(cls, "rootView", "getRootView()Landroid/widget/FrameLayout;", 0), z7b.g(nec.a, cls, "bottomBarView", "getBottomBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0)};
    }

    public MainScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        this.a = createViewModelLazy(ox7.class, new nj4(19, new zj7(3, this)));
        this.b = new glc(new e11(0, this, MainScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 25), new e11(0, this, MainScreen.class, "getCurrentParams", "getCurrentParams()Lone/me/sdk/statistics/params/Params;", 0, 26), 4);
        this.c = new LinkedHashMap();
        this.o = viewBinding(wca.h);
        this.X = viewBinding(wca.a);
        this.Y = MainScreen.class.getName();
        setRetainViewMode(tu3.b);
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final void m0(t6a t6a) {
        wuc wuc;
        ChatsTabWidget chatsTabWidget;
        uu3 settingsListScreen;
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(t6a);
        w12 w12 = obj;
        if (obj == null) {
            w12 b2 = s36.b(getContext());
            b2.setId(t6a.c);
            linkedHashMap.put(t6a, b2);
            w12 = b2;
        }
        ViewGroup viewGroup = (ViewGroup) w12;
        ((FrameLayout) this.o.T0(this, s0[0])).addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
        String str = t6a.d;
        if (str.length() <= 0) {
            str = null;
        }
        znc childRouter = getChildRouter(viewGroup, str);
        childRouter.e = 1;
        if (!childRouter.n()) {
            ex7.b.getClass();
            String a2 = m64.a(ex7.c.a);
            String str2 = t6a.d;
            if (tpa.f(str2, a2)) {
                settingsListScreen = new ContactListWidget((Bundle) null, 1, (z84) null);
                wuc = wuc.CONTACTS_TAB;
            } else if (tpa.f(str2, m64.a(ex7.d.a))) {
                settingsListScreen = new CallHistoryScreen();
                wuc = wuc.CALL_HISTORY_TAB;
            } else if (tpa.f(str2, m64.a(ex7.e.a))) {
                chatsTabWidget = new ChatsTabWidget(getArgs().getString("folder_id"));
                wuc = wuc.CHATS_LIST_TAB;
                chatsTabWidget.addLifecycleListener(new ia3(4, wuc));
                chatsTabWidget.setRetainViewMode(tu3.b);
                coc coc = new coc(chatsTabWidget, (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d(str);
                childRouter.R(coc);
            } else if (tpa.f(str2, m64.a(ex7.f.a))) {
                settingsListScreen = new SettingsListScreen();
                wuc = wuc.SETTINGS_TAB;
            } else {
                throw new IllegalStateException(("invalid screen! " + str2).toString());
            }
            chatsTabWidget = settingsListScreen;
            chatsTabWidget.addLifecycleListener(new ia3(4, wuc));
            chatsTabWidget.setRetainViewMode(tu3.b);
            coc coc2 = new coc(chatsTabWidget, (String) null, (zu3) null, (zu3) null, false, -1);
            coc2.d(str);
            childRouter.R(coc2);
        }
        childRouter.I();
    }

    public final void n0(t6a t6a) {
        ViewGroup viewGroup = (ViewGroup) this.c.get(t6a);
        if (viewGroup != null) {
            znc childRouter = getChildRouter(viewGroup, t6a.d, false);
            if (childRouter != null) {
                childRouter.F();
            }
            ((FrameLayout) this.o.T0(this, s0[0])).removeView(viewGroup);
        }
    }

    public final u6a o0() {
        return (u6a) this.X.T0(this, s0[1]);
    }

    public final void onAttach(View view) {
        t0.g(Boolean.TRUE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ix7 ix7 = new ix7(this, getContext());
        ix7.setId(wca.h);
        ix7.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        u6a u6a = new u6a(ix7.getContext());
        u6a.setId(wca.a);
        u6a.setElevation(fk4.d().getDisplayMetrics().density * 8.0f);
        tfg.s(u6a.getContext().getApplicationContext());
        u6a.setBlurEnabled(Boolean.FALSE);
        br7.d(u6a, new x27(0, new yq0(3, 1, false), 1), (m56) null);
        qp4 b2 = qp4.u0.b(ix7.getContext());
        od2.L(new zn5((w7c) b2.t0, new jx7(this, ix7, b2, (Continuation) null), 5), getViewLifecycleScope());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ix7.addView(u6a, layoutParams);
        return ix7;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        LinkedHashMap linkedHashMap = this.c;
        for (t6a n0 : linkedHashMap.keySet()) {
            n0(n0);
        }
        linkedHashMap.clear();
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Object obj;
        String string = bundle.getString("main:selected_tag");
        if (string != null) {
            ox7 r0 = r0();
            Iterator it = r0.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (tpa.f(((t6a) obj).d, string)) {
                    break;
                }
            }
            t6a t6a = (t6a) obj;
            if (t6a != null) {
                r0.o = t6a;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("main:selected_tag", r0().o.d);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        t6a t6a = r0().o;
        znc p0 = p0();
        Widget widget = null;
        uu3 g = p0 != null ? p0.g(t6a.d) : null;
        if (g instanceof Widget) {
            widget = (Widget) g;
        }
        if (widget != null) {
            widget.onUpdateArgs(bundle, bundle2);
        }
    }

    public final void onViewCreated(View view) {
        for (t6a t6a : r0().c) {
            u6a o0 = o0();
            boolean f = tpa.f(t6a, r0().o);
            vu5 vu5 = new vu5(this, 11, t6a);
            wq0 wq0 = new wq0(o0.getContext(), (AttributeSet) null);
            wq0.setId(t6a.e);
            tpa.J(vxb.tag_tab_item, wq0, t6a);
            wq0.setText(t6a.a);
            s6a s6a = t6a.b;
            if (s6a instanceof q6a) {
                q6a q6a = (q6a) s6a;
                wq0.H0.setImageDrawable((Drawable) q6a.a.invoke(wq0.getContext()));
                c66 c66 = q6a.b;
                if (c66 == null) {
                    c66 = wq0.K0;
                }
                wq0.L0 = c66;
                wq0.w();
            } else if (s6a instanceof r6a) {
                wq0.setIcon(((r6a) s6a).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            wq0.setSelected(f);
            tu0.K(wq0, 300, vu5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            float f2 = (float) 4;
            layoutParams.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams.rightMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            o0.addView(wq0, layoutParams);
            o0.setWeightSum((float) o0.getChildCount());
        }
        od2.L(new zn5(r0().Y, new kx7(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().s0, new lx7(this, (Continuation) null), 5), getViewLifecycleScope());
        m0(r0().o);
    }

    public final znc p0() {
        t6a t6a = r0().o;
        ViewGroup viewGroup = (ViewGroup) this.c.get(t6a);
        if (viewGroup == null) {
            return null;
        }
        return getChildRouter(viewGroup, t6a.d);
    }

    public final wuc q0() {
        int i = r0().o.c;
        return i == wca.g ? wuc.CONTACTS_TAB : i == wca.c ? wuc.CALL_HISTORY_TAB : i == wca.j ? wuc.SETTINGS_TAB : wuc.CHATS_LIST_TAB;
    }

    public final ox7 r0() {
        return (ox7) this.a.getValue();
    }

    public final void s0(t6a t6a) {
        String str = this.Y;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "handleClick, selected item=" + t6a, (Throwable) null);
        }
        if (!tpa.f(r0().o, t6a)) {
            n0(r0().o);
            r0().o = t6a;
            u6a o0 = o0();
            o0.getClass();
            int i = 0;
            while (i < o0.getChildCount()) {
                int i2 = i + 1;
                View childAt = o0.getChildAt(i);
                if (childAt != null) {
                    ((wq0) childAt).setSelected(tpa.v(childAt, vxb.tag_tab_item) == t6a);
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            m0(t6a);
            this.b.a();
        }
    }

    public MainScreen(String str, Bundle bundle) {
        this();
        getArgs().putString("main:arg:deep_link", str);
        getArgs().putAll(bundle);
    }
}
