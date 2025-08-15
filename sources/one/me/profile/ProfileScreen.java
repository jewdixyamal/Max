package one.me.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/profile/ProfileScreen;", "Lone/me/sdk/arch/Widget;", "Lplb;", "Lxt3;", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lhdb;", "type", "", "isOpenedFromDialog", "(JLhdb;Z)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileScreen extends Widget implements plb, xt3, ng3, ad0 {
    public static final /* synthetic */ bc7[] D0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final q7c z0;

    static {
        Class<ProfileScreen> cls = ProfileScreen.class;
        hob hob = new hob(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0);
        oec oec = nec.a;
        D0 = new bc7[]{hob, zr6.e(oec, cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0, oec), zr6.f(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oec), zr6.f(cls, "expandedTitle", "getExpandedTitle()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "expandedSubtitle", "getExpandedSubtitle()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "linkView", "getLinkView()Landroidx/appcompat/widget/AppCompatTextView;", 0, oec), zr6.f(cls, "dotDivider", "getDotDivider()Landroidx/appcompat/widget/AppCompatTextView;", 0, oec), zr6.f(cls, "phoneNumberView", "getPhoneNumberView()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0, oec), zr6.f(cls, "linkButtonView", "getLinkButtonView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec)};
    }

    public ProfileScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new lab(20), (k56) null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(cnb.class, new jp8(21, new zja(bundle, 8, this)));
        this.o = tu0.r(3, new clb(this, 1));
        this.X = viewBinding(wea.d1);
        this.Y = viewBinding(wea.l1);
        this.Z = viewBinding(wea.k1);
        this.s0 = viewBinding(wea.f1);
        this.t0 = viewBinding(wea.e1);
        this.u0 = viewBinding(wea.i1);
        this.v0 = viewBinding(wea.h1);
        this.w0 = viewBinding(wea.U);
        this.x0 = viewBinding(wea.E);
        this.y0 = viewBinding(wea.c1);
        viewBinding(wea.T);
        this.z0 = childSlotRouter(wea.j1);
        xcb xcb = xcb.a;
        this.A0 = xcb.getAccessor().d(eua.class);
        this.B0 = xcb.getAccessor().d(an9.class);
        this.C0 = xcb.getAccessor().d(bt1.class);
    }

    public static final void m0(ProfileScreen profileScreen, cla cla, boolean z) {
        ecf ecf;
        profileScreen.getClass();
        int I = i24.I(qqe.e(cla.getTitle()));
        int i = 0;
        if (z) {
            ecf a2 = qqe.a(cla.getTitle());
            if ((a2 != null ? a2.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a3 = qqe.a(cla.getTitle());
            if (a3 != null) {
                i = a3.a;
            }
            if (i != I) {
                ecf = new ecf(cla.getContext(), I, new ww9(27));
                qqe.d(cla.getTitle(), ecf);
            }
        }
        ecf = null;
        qqe.d(cla.getTitle(), ecf);
    }

    public final void a(String str, RectF rectF, Rect rect) {
        cnb r0 = r0();
        j47.T(r0.a, ((w9a) r0.u()).b(), (vx3) null, new tmb(r0, str, rectF, (Continuation) null), 2);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r6, android.os.Bundle r7) {
        /*
            r5 = this;
            rg1 r0 = r5.n0()
            boolean r0 = r0.g(r6)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            int r0 = defpackage.wea.S0
            if (r6 == r0) goto L_0x0188
            int r1 = defpackage.wea.T0
            if (r6 == r1) goto L_0x0188
            int r1 = defpackage.wea.R0
            if (r6 == r1) goto L_0x0188
            int r1 = defpackage.wea.U0
            if (r6 != r1) goto L_0x001d
            goto L_0x0188
        L_0x001d:
            int r0 = defpackage.wea.m
            r1 = 0
            if (r6 != r0) goto L_0x003d
            cnb r5 = r5.r0()
            kotlinx.coroutines.internal.ContextScope r6 = r5.a
            kke r7 = r5.u()
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            mmb r0 = new mmb
            r0.<init>(r5, r1)
            r5 = 2
            defpackage.j47.T(r6, r7, r1, r0, r5)
            goto L_0x0214
        L_0x003d:
            int r0 = defpackage.wea.x
            if (r6 != r0) goto L_0x004a
            cnb r5 = r5.r0()
            r5.q()
            goto L_0x0214
        L_0x004a:
            int r0 = defpackage.wea.D
            r2 = 0
            if (r6 == r0) goto L_0x017d
            int r0 = defpackage.wea.B
            if (r6 != r0) goto L_0x0055
            goto L_0x017d
        L_0x0055:
            int r0 = defpackage.wea.r
            java.lang.String r3 = "&leave_chat=true"
            java.lang.String r4 = ":profile/change-owner?chat_id="
            if (r6 != r0) goto L_0x008d
            cnb r5 = r5.r0()
            pab r6 = r5.O0
            java.lang.Long r6 = r6.i()
            if (r6 == 0) goto L_0x0214
            long r6 = r6.longValue()
            ckb r0 = defpackage.ckb.c
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
            c64 r7 = new c64
            r7.<init>(r6)
            s35 r5 = r5.A0
            defpackage.pnf.o(r5, r7)
            goto L_0x0214
        L_0x008d:
            int r0 = defpackage.wea.R
            if (r6 != r0) goto L_0x00c3
            cnb r5 = r5.r0()
            pab r6 = r5.O0
            java.lang.Long r6 = r6.i()
            if (r6 == 0) goto L_0x0214
            long r6 = r6.longValue()
            kke r0 = r5.u()
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            vx3 r3 = defpackage.vx3.b
            rmb r4 = new rmb
            r4.<init>(r5, r6, r1)
            kotlinx.coroutines.internal.ContextScope r6 = r5.a
            vxd r6 = defpackage.j47.S(r6, r0, r3, r4)
            bc7[] r7 = defpackage.cnb.S0
            r7 = r7[r2]
            w4d r0 = r5.B0
            r0.o1(r5, r7, r6)
            goto L_0x0214
        L_0x00c3:
            int r0 = defpackage.wea.Q
            if (r6 != r0) goto L_0x00ee
            android.os.Bundle r5 = r5.getArgs()
            java.lang.String r6 = "profile:id"
            long r5 = r5.getLong(r6)
            ckb r7 = defpackage.ckb.c
            r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            f64 r6 = r7.P1()
            r6.b(r5, r1)
            goto L_0x0214
        L_0x00ee:
            int r0 = defpackage.wea.B0
            r3 = 1
            java.lang.String r4 = "profile:participant_id_for_action"
            if (r6 != r0) goto L_0x011b
            if (r7 == 0) goto L_0x011a
            long r6 = r7.getLong(r4)
            cnb r5 = r5.r0()
            r5.getClass()
            ulb r0 = new ulb
            int r1 = defpackage.xea.d
            aqe r4 = new aqe
            r4.<init>(r1, r3)
            hmb r1 = new hmb
            r1.<init>((defpackage.cnb) r5, (long) r6, (boolean) r2)
            r0.<init>(r4, r1)
            s35 r5 = r5.z0
            defpackage.pnf.o(r5, r0)
            goto L_0x0214
        L_0x011a:
            return
        L_0x011b:
            int r0 = defpackage.wea.D0
            if (r6 != r0) goto L_0x0145
            if (r7 == 0) goto L_0x0144
            long r6 = r7.getLong(r4)
            cnb r5 = r5.r0()
            r5.getClass()
            ulb r0 = new ulb
            int r1 = defpackage.xea.d
            aqe r2 = new aqe
            r2.<init>(r1, r3)
            hmb r1 = new hmb
            r1.<init>((defpackage.cnb) r5, (long) r6, (boolean) r3)
            r0.<init>(r2, r1)
            s35 r5 = r5.z0
            defpackage.pnf.o(r5, r0)
            goto L_0x0214
        L_0x0144:
            return
        L_0x0145:
            int r7 = defpackage.wea.o
            if (r6 != r7) goto L_0x0156
            ckb r5 = defpackage.ckb.c
            f64 r5 = r5.P1()
            java.lang.String r6 = ":media-picker/select/photo"
            r5.b(r6, r1)
            goto L_0x0214
        L_0x0156:
            int r7 = defpackage.wea.n
            if (r6 != r7) goto L_0x0163
            cnb r5 = r5.r0()
            r5.y()
            goto L_0x0214
        L_0x0163:
            int r7 = defpackage.wea.C
            if (r6 != r7) goto L_0x0170
            cnb r5 = r5.r0()
            r5.A()
            goto L_0x0214
        L_0x0170:
            int r7 = defpackage.wea.A
            if (r6 != r7) goto L_0x0214
            cnb r5 = r5.r0()
            r5.C(r3)
            goto L_0x0214
        L_0x017d:
            cnb r5 = r5.r0()
            bc7[] r6 = defpackage.cnb.S0
            r5.C(r2)
            goto L_0x0214
        L_0x0188:
            cnb r5 = r5.r0()
            pab r7 = r5.O0
            java.lang.Long r7 = r7.i()
            if (r7 == 0) goto L_0x0214
            long r1 = r7.longValue()
            je7 r7 = r5.t0
            if (r6 != r0) goto L_0x01ad
            java.lang.Object r6 = r7.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r6 = r6.n()
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x01ab:
            long r6 = r6 + r3
            goto L_0x01db
        L_0x01ad:
            int r0 = defpackage.wea.T0
            if (r6 != r0) goto L_0x01c1
            java.lang.Object r6 = r7.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r6 = r6.n()
            r3 = 18000000(0x112a880, double:8.8931816E-317)
            goto L_0x01ab
        L_0x01c1:
            int r0 = defpackage.wea.R0
            if (r6 != r0) goto L_0x01d5
            java.lang.Object r6 = r7.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r6 = r6.n()
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x01ab
        L_0x01d5:
            int r7 = defpackage.wea.U0
            if (r6 != r7) goto L_0x0214
            r6 = -1
        L_0x01db:
            iy2 r0 = r5.t()
            jz2 r0 = (defpackage.jz2) r0
            p82 r0 = r0.l()
            e52 r1 = r0.C(r1)
            if (r1 == 0) goto L_0x01fd
            r0.l(r6, r1)
            rm4 r6 = r0.p
            java.lang.Object r6 = r6.get()
            pk r6 = (defpackage.pk) r6
            long r0 = r1.a
            k4a r6 = (defpackage.k4a) r6
            r6.r(r0)
        L_0x01fd:
            zlb r6 = new zlb
            int r7 = defpackage.woc.n
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = defpackage.yea.A2
            eqe r1 = new eqe
            r1.<init>(r0)
            r6.<init>(r1, r7)
            s35 r5 = r5.z0
            defpackage.pnf.o(r5, r6)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.ProfileScreen.h(int, android.os.Bundle):void");
    }

    public final rg1 n0() {
        return (rg1) this.o.getValue();
    }

    public final TextView o0() {
        return (TextView) this.u0.T0(this, D0[5]);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                r0().D();
                return;
            }
            cnb r0 = r0();
            j47.T(r0.a, ((w9a) r0.u()).b(), (vx3) null, new umb(intent, r0, (Continuation) null), 2);
        } else if (i2 == -1) {
            cnb r02 = r0();
            j47.T(r02.a, ((w9a) r02.u()).b(), (vx3) null, new nmb(r02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new qq0(10, this));
        } else if (qqe.c(p0().getTitle())) {
            m0(this, p0(), true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dlb dlb = new dlb(this, 2);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(wea.g1);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dlb.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!n0().b(i, strArr, iArr) && i == 158 && ((eua) this.A0.getValue()).b(strArr)) {
            r0().y();
        }
    }

    public final void onViewCreated(View view) {
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new flb((Continuation) null, this), 3);
        v3c.y(new c3(this, (Continuation) null, 26), view);
        EndlessRecyclerView2 q0 = q0();
        d74 d74 = new d74(new vq0(4, this), 17, new Rect(q0.getPaddingLeft(), q0.getPaddingTop(), q0.getPaddingRight(), q0.getPaddingBottom()));
        WeakHashMap weakHashMap = zmf.a;
        omf.u(q0, d74);
        if (q0.G0) {
            mmf.c(q0);
        } else {
            q0.addOnAttachStateChangeListener(new o50(q0, 4, q0));
        }
        wb5 wb5 = new wb5();
        bc7[] bc7Arr = D0;
        bc7 bc7 = bc7Arr[0];
        q7c q7c = this.X;
        ((fm) q7c.T0(this, bc7)).a(s36.D(new vc1(wb5, this, 3), (fm) q7c.T0(this, bc7Arr[0]), getViewLifecycleOwner()));
        ((AppCompatTextView) this.w0.T0(this, bc7Arr[7])).setOnClickListener(new elb(0, (Object) this));
        t03 t03 = new t03(r0().N0, 11);
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(t03, getViewLifecycleOwner().Q(), fg7), new glb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(od2.x(new j31(r0().J0, r0().L0, new wu7(3, (Continuation) null, 3), 4)), getViewLifecycleOwner().Q(), fg7), new hlb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new m58(r0().z0, 25), getViewLifecycleOwner().Q(), fg7), new ilb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().A0, getViewLifecycleOwner().Q(), fg7), new jlb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final cla p0() {
        return (cla) this.Z.T0(this, D0[2]);
    }

    public final EndlessRecyclerView2 q0() {
        return (EndlessRecyclerView2) this.Y.T0(this, D0[1]);
    }

    public final cnb r0() {
        return (cnb) this.c.getValue();
    }

    public final void y(int i, Bundle bundle) {
        String string;
        lk7 lk7;
        String string2;
        lk7 lk72;
        eqe eqe;
        if (i == wea.Y0) {
            Context context = getContext();
            cnb r0 = r0();
            String o2 = r0.O0.o();
            if (o2 == null) {
                o2 = "";
            }
            pnf.o(r0.z0, new zlb(new eqe(yea.H0), Integer.valueOf(woc.u)));
            tpa.o(context, "+" + o2);
        } else if (i == wea.b1) {
            cnb r02 = r0();
            String o3 = r02.O0.o();
            if (o3 != null) {
                pnf.o(r02.A0, new fkb("+".concat(o3)));
            }
        } else if (i == wea.a1) {
            r0().w(false);
        } else if (i == wea.Z0) {
            r0().w(true);
        } else if (i == wea.S) {
            tpa.o(getContext(), r0().r());
        } else if (i == wea.s0) {
            if (bundle != null) {
                long j = bundle.getLong("profile:participant_id_for_action");
                cnb r03 = r0();
                amb z = r03.O0.z(j);
                if (z != null) {
                    pnf.o(r03.z0, z);
                }
            }
        } else if (i == cpc.f || i == cpc.e || i == cpc.g || i == cpc.h) {
            if (bundle != null && (string = bundle.getString("profile:contextmenu:link")) != null && (lk7 = (lk7) x53.j0(bundle.getInt("profile:contextmenu:link_type", -1), lk7.s0)) != null) {
                r0().x(4, string, lk7);
                r0().v(string);
            }
        } else if ((i == cpc.b || i == cpc.a || i == cpc.c || i == cpc.d) && bundle != null && (string2 = bundle.getString("profile:contextmenu:link")) != null && (lk72 = (lk7) x53.j0(bundle.getInt("profile:contextmenu:link_type", -1), lk7.s0)) != null) {
            int i2 = 3;
            r0().x(3, string2, lk72);
            tpa.o(getContext(), ju0.B(string2) ? w9e.K0(string2, "mailto:") : ju0.C(string2) ? w9e.K0(string2, "tel:") : string2);
            if (tpa.s()) {
                if (!ju0.B(string2)) {
                    i2 = ju0.C(string2) ? 2 : 1;
                }
                int s = au1.s(i2);
                if (s == 0) {
                    eqe = lk72 == lk7.X ? new eqe(yea.t1) : new eqe(dpc.k);
                } else if (s == 1) {
                    eqe = new eqe(dpc.n);
                } else if (s == 2) {
                    eqe = new eqe(dpc.l);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                wha wha = new wha((Widget) this);
                wha.g(eqe);
                wha.e(new kia(woc.s));
                wha.i();
            }
        }
    }

    public ProfileScreen(long j, hdb hdb, boolean z) {
        this(dy7.g(new kpa("profile:id", Long.valueOf(j)), new kpa("profile:id_type", hdb), new kpa("profile:opened_from_dialog", Boolean.valueOf(z))));
    }
}
