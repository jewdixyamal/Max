package one.me.settings;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/settings/SettingsListScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Llfd;", "Lem;", "Lng3;", "Lad0;", "<init>", "()V", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
public final class SettingsListScreen extends SectionRecyclerWidget implements lfd, em, ng3, ad0 {
    public static final /* synthetic */ bc7[] B0;
    public final y51 A0;
    public final je7 X;
    public final khe Y;
    public final je7 Z;
    public final x27 o = x27.d;
    public final q7c s0;
    public final q7c t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final ExecutorService x0;
    public fm y0;
    public final mfd z0;

    static {
        Class<SettingsListScreen> cls = SettingsListScreen.class;
        B0 = new bc7[]{new hob(cls, "settingsCollapsingContent", "getSettingsCollapsingContent()Lone/me/settings/ui/collapsingtoolbar/SettingsTopBarContent;", 0), zr6.e(nec.a, cls, "settingsPinnedToolbar", "getSettingsPinnedToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    public SettingsListScreen() {
        yfd yfd = yfd.a;
        this.X = yfd.getAccessor().d(l67.class);
        this.Y = new khe(new hbc(28));
        this.Z = createViewModelLazy(add.class, new jp8(29, igd.s0));
        this.s0 = viewBinding(lha.j);
        this.t0 = viewBinding(lha.i);
        this.u0 = tu0.r(3, new lwa(27, this));
        this.v0 = yfd.getAccessor().d(eua.class);
        this.w0 = yfd.getAccessor().d(an9.class);
        ExecutorService a = ((iba) yfd.getAccessor().c(iba.class)).a();
        this.x0 = a;
        this.z0 = new mfd(this, a);
        this.A0 = new y51(a, 5);
        w7c w7c = q0().C0;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, Q, fg7), new egd(this, (Continuation) null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(q0().E0, this.lifecycleOwner.Q(), fg7), new fgd(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final void V(fm fmVar, int i) {
        if (fmVar != null) {
            float abs = ((float) Math.abs(i)) / ((float) fmVar.getTotalScrollRange());
            ((cla) this.t0.T0(this, B0[1])).setTitleAlpha(abs);
            p0().setAlpha(1.0f - abs);
        }
    }

    public final void X(long j, boolean z) {
    }

    public final void a(String str, RectF rectF, Rect rect) {
        add q0 = q0();
        j47.T(q0.a, ((w9a) q0.r()).b(), (vx3) null, new ucd(rectF, q0, str, (Continuation) null), 2);
    }

    public final x27 getInsetsConfig() {
        return this.o;
    }

    public final void h(int i, Bundle bundle) {
        add q0 = q0();
        q0.getClass();
        int i2 = lha.d;
        s35 s35 = q0.z0;
        if (i == i2) {
            Long t = q0.t();
            if (t != null) {
                long longValue = t.longValue();
                cgd.c.getClass();
                wg0.k(":neuro-avatars?id=" + longValue, s35);
            }
        } else if (i == lha.c) {
            pnf.o(s35, zgd.b);
        } else if (i == lha.b) {
            q0.u();
        }
    }

    public final void i(long j) {
        c64 c64;
        c64 c642;
        add q0 = q0();
        q0.getClass();
        if (j == hcd.FOLDERS.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/folder-list");
        } else if (j == hcd.APPEARANCE.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/appearance");
        } else if (j == hcd.NOTIFICATIONS.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/notifications");
        } else if (j == hcd.PRIVACY.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/privacy");
        } else if (j == hcd.MESSAGES.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/messages");
        } else if (j == hcd.SUPPORT.a) {
            cgd.c.getClass();
            c64 = new c64(":webview/faq");
        } else if (j == hcd.DEV_MENU.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/dev");
        } else if (j == hcd.BATTERY.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/media");
        } else if (j == hcd.STORAGE.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/caching");
        } else if (j == hcd.ABOUT.a) {
            cgd.c.getClass();
            c64 = new c64(":settings/aboutapp");
        } else {
            if (j == hcd.ESIA_CONNECT.a) {
                cgd cgd = cgd.c;
                long q = ((p7b) q0.s()).b.q(pyc.c, -1);
                b46 b46 = osf.c;
                cgd.getClass();
                c642 = new c64(":webapp:root?bot_id=" + q + "&entry_point=settings");
            } else if (j == hcd.INVITE_FRIENDS.a) {
                bc7[] bc7Arr = add.K0;
                bc7 bc7 = bc7Arr[0];
                w4d w4d = q0.H0;
                x77 x77 = (x77) w4d.T0(q0, bc7);
                if (x77 == null || !x77.isActive()) {
                    ((l67) q0.x0.getValue()).a("click_link", "main", "invite_friends");
                    w4d.o1(q0, bc7Arr[0], pnf.n(q0, ((w9a) q0.r()).c(), (vx3) null, new xcd(q0, (Continuation) null), 2));
                    return;
                }
                return;
            } else if (j == hcd.SAVED_MESSAGES.a) {
                pnf.n(q0, ((w9a) q0.r()).a(), (vx3) null, new ycd(q0, (Continuation) null), 2);
                return;
            } else {
                icd icd = (icd) q0.J0.c((int) j);
                if (icd != null) {
                    cgd cgd2 = cgd.c;
                    b46 b462 = osf.c;
                    cgd2.getClass();
                    StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
                    sb.append(icd.c);
                    sb.append("&entry_point=settings");
                    String str = icd.d;
                    if (!(str == null || str.length() == 0)) {
                        sb.append("&start_param=");
                        sb.append(str);
                    }
                    c642 = new c64(sb.toString());
                } else {
                    return;
                }
            }
            c64 = c642;
        }
        pnf.o(q0.z0, c64);
    }

    public final y51 m0() {
        return this.A0;
    }

    public final mfd n0() {
        return this.z0;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                hm9.p(SettingsListScreen.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                q0().w();
                return;
            }
            add q0 = q0();
            j47.T(q0.a, ((w9a) q0.r()).b(), (vx3) null, new vcd(intent, q0, (Continuation) null), 2);
        } else if (i2 == -1) {
            add q02 = q0();
            j47.T(q02.a, ((w9a) q02.r()).b(), (vx3) null, new pcd(q02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        q0().q();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dgd dgd = new dgd(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(lha.f);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new egb(3, (Continuation) null, 1), coordinatorLayout);
        dgd.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.v0.getValue()).b(strArr)) {
            q0().u();
        }
        q0().q();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        fm fmVar = this.y0;
        if (fmVar != null) {
            fmVar.a(s36.D(this, fmVar, getViewLifecycleOwner()));
        }
        p0().setAvatarClickedListener(new e09(0, q0(), add.class, "openUserAvatars", "openUserAvatars()V", 0, 7));
        p0().setNicknameClickListener(new e09(0, q0(), add.class, "copyProfileLink", "copyProfileLink()V", 0, 8));
        p0().setUserPhoneClickListener(new e09(0, q0(), add.class, "copyUserPhone", "copyUserPhone()V", 0, 9));
        od2.L(new zn5(tu0.g(q0().z0, this.lifecycleOwner.Q(), fg7.X), new hgd(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().A0, this.lifecycleOwner.Q(), fg7.o), new ggd(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final wid p0() {
        return (wid) this.s0.T0(this, B0[0]);
    }

    public final add q0() {
        return (add) this.Z.getValue();
    }
}
