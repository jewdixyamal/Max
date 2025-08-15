package one.me.calls.ui.ui.call;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/calls/ui/ui/call/CallScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Liq9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "yxc", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallScreen extends Widget implements xt3, iq9 {
    public static final yxc R0 = new yxc(8);
    public static final /* synthetic */ bc7[] S0;
    public final je7 A0 = tu0.r(3, new ci1(this, 4));
    public final qm0 B0 = binding(new ci1(this, 5));
    public final qm0 C0 = binding(new ci1(this, 7));
    public final je7 D0 = tu0.r(3, new ci1(this, 8));
    public final je7 E0 = tu0.r(3, new ci1(this, 6));
    public final je7 F0 = tu0.r(3, new ci1(this, 12));
    public final je7 G0 = tu0.r(3, new ci1(this, 13));
    public final je7 H0 = tu0.r(3, new ci1(this, 14));
    public final qm0 I0 = binding(new ci1(this, 15));
    public final qm0 J0 = binding(new ci1(this, 16));
    public final qm0 K0 = binding(new ci1(this, 17));
    public final qm0 L0 = binding(new ci1(this, 18));
    public final qm0 M0 = binding(new ci1(this, 19));
    public final je7 N0 = tu0.r(3, new ci1(this, 0));
    public od1 O0;
    public final je7 P0 = tu0.r(3, new k11(26));
    public final glc Q0 = new glc(new k11(27), (k56) null, 6);
    public final khe X = new khe(new k11(28));
    public final khe Y = new khe(new k11(29));
    public final je7 Z = createViewModelLazy(el1.class, new s(20, new ci1(this, 3)));
    public final je7 a = yi1.c();
    public final khe b = new khe(new k11(25));
    public final khe c = new khe(new ci1(this, 1));
    public final khe o = new khe(new ci1(this, 2));
    public final String s0 = "CALL_SCREEN_SCOPE_ID";
    public boolean t0;
    public final q7c u0 = childSlotRouter(y7a.D1);
    public final q7c v0 = childSlotRouter(y7a.o);
    public final q7c w0 = childSlotRouter(rvb.call_events_view);
    public final q7c x0 = childSlotRouter(rvb.call_screen_vpn_container_id);
    public final q7c y0 = childSlotRouter(rvb.call_waiting_room_events_router);
    public final i1b z0 = new i1b();

    static {
        Class<CallScreen> cls = CallScreen.class;
        hob hob = new hob(cls, "callTopPanelRouter", "getCallTopPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0);
        oec oec = nec.a;
        S0 = new bc7[]{hob, zr6.e(oec, cls, "callBottomPanelRouter", "getCallBottomPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), zr6.f(cls, "callEventsRouter", "getCallEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec), zr6.f(cls, "callVpnRouter", "getCallVpnRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec), zr6.f(cls, "callWaitingRoomEventsRouter", "getCallWaitingRoomEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec), zr6.f(cls, "stubCallBottomUnavailablePanel", "getStubCallBottomUnavailablePanel()Landroid/view/ViewStub;", 0, oec), zr6.f(cls, "callBottomUnavailablePanel", "getCallBottomUnavailablePanel()Lone/me/calls/ui/view/controls/CallBottomUnavailableView;", 0, oec), zr6.f(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oec), zr6.f(cls, "stubCallSpeakerLabel", "getStubCallSpeakerLabel()Landroid/view/ViewStub;", 0, oec), zr6.f(cls, "callSpeakerLabel", "getCallSpeakerLabel()Lone/me/calls/ui/view/CallSpeakerLabel;", 0, oec), zr6.f(cls, "stubCallChangeModeHint", "getStubCallChangeModeHint()Landroid/view/ViewStub;", 0, oec), zr6.f(cls, "callChangeModeHint", "getCallChangeModeHint()Lone/me/calls/ui/view/CallChangeModeHintView;", 0, oec)};
    }

    public CallScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
    }

    public static final boolean m0(CallScreen callScreen, int i, String str) {
        od1 od1 = callScreen.O0;
        if (od1 == null || !od1.g || callScreen.E0().getCurrentItem() == i || callScreen.E0().getChildCount() == 0) {
            int currentItem = callScreen.E0().getCurrentItem();
            boolean z = callScreen.E0().F0;
            hm9.m("CallModeScrollTag", "skip changeViewPagerPosition from=" + str + " currentPos=" + currentItem + " newPos=" + i + " isUserInputEnabled=" + z, new Object[0]);
            return false;
        }
        callScreen.E0().setUserInputEnabled(false);
        callScreen.E0().e(i, false);
        hm9.m("CallModeScrollTag", "changeViewPagerPosition from=" + str + " newPos=" + i, new Object[0]);
        return true;
    }

    public static final j03 n0(CallScreen callScreen) {
        callScreen.getClass();
        return (j03) callScreen.x0.T0(callScreen, S0[3]);
    }

    public static final mm1 o0(CallScreen callScreen) {
        View childAt = callScreen.E0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return null;
        }
        dec M = recyclerView.M(callScreen.E0().getCurrentItem());
        KeyEvent.Callback callback = M != null ? M.a : null;
        if (callback instanceof mm1) {
            return (mm1) callback;
        }
        return null;
    }

    public static void q0(CallScreen callScreen) {
        callScreen.p0(!callScreen.z0().g);
    }

    public final ViewStub A0() {
        bc7 bc7 = S0[5];
        return (ViewStub) this.B0.getValue();
    }

    public final ViewStub B0() {
        bc7 bc7 = S0[10];
        return (ViewStub) this.L0.getValue();
    }

    public final ViewStub C0() {
        bc7 bc7 = S0[8];
        return (ViewStub) this.J0.getValue();
    }

    public final el1 D0() {
        return (el1) this.Z.getValue();
    }

    public final ViewPager2 E0() {
        bc7 bc7 = S0[7];
        return (ViewPager2) this.I0.getValue();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m44getScopeIdIluPPks() {
        return this.s0;
    }

    public final bvc getScreenDelegate() {
        return this.Q0;
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        D0().c.j.b();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            D0().w(true, intent);
            im requireActivity = requireActivity();
            ((hl1) this.b.getValue()).getClass();
            Intent intent2 = new Intent(requireActivity, CallServiceImpl.class);
            gl1 gl1 = gl1.a;
            hl1.b(requireActivity, intent2.putExtra("ACTION", 5));
        }
    }

    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        D0().c.j.a();
    }

    public final void onChangeEnded(zu3 zu3, av3 av3) {
        super.onChangeEnded(zu3, av3);
        boolean z = false;
        this.t0 = false;
        if (av3.b) {
            el1 D02 = D0();
            uv3 z02 = z0();
            if (z02.g && z02.b == null) {
                z = true;
            }
            D02.t(z);
        }
        if (av3 == av3.POP_EXIT) {
            ((tnd) this.P0.getValue()).getClass();
            tnd.a();
        }
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        this.t0 = true;
        D0().t(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: c41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: e41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: e41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: e41} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: e41} */
    /* JADX WARNING: type inference failed for: r6v11, types: [d41] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13, types: [f41] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            r19 = this;
            el1 r0 = r19.D0()
            la1 r0 = r0.s()
            i95 r0 = r0.e
            boolean r0 = r0 instanceof defpackage.d95
            c41 r1 = defpackage.c41.a
            if (r0 != 0) goto L_0x0012
            goto L_0x026d
        L_0x0012:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r2 = "type"
            java.lang.String r0 = r0.getString(r2)
            v25 r3 = defpackage.gi1.b
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            r4 = r3
            u1 r4 = (defpackage.u1) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003d
            java.lang.Object r4 = r4.next()
            r5 = r4
            gi1 r5 = (defpackage.gi1) r5
            java.lang.String r5 = r5.name()
            boolean r5 = defpackage.tpa.f(r5, r0)
            if (r5 == 0) goto L_0x0022
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            gi1 r4 = (defpackage.gi1) r4
            if (r4 == 0) goto L_0x028b
            int r0 = r4.ordinal()
            r3 = 1
            java.lang.String r4 = "microphone_enabled"
            java.lang.String r5 = "video_enabled"
            if (r0 == 0) goto L_0x00a0
            r6 = -1
            if (r0 == r3) goto L_0x0080
            r8 = 2
            if (r0 == r8) goto L_0x005f
            r4 = 3
            if (r0 != r4) goto L_0x0059
            goto L_0x00d6
        L_0x0059:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x005f:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r1 = "opponent_id"
            long r0 = r0.getLong(r1, r6)
            f41 r6 = new f41
            android.os.Bundle r7 = r19.getArgs()
            boolean r5 = r7.getBoolean(r5)
            android.os.Bundle r7 = r19.getArgs()
            boolean r4 = r7.getBoolean(r4)
            r6.<init>(r0, r5, r4)
        L_0x007e:
            r1 = r6
            goto L_0x00d6
        L_0x0080:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r1 = "chat_id"
            long r0 = r0.getLong(r1, r6)
            d41 r6 = new d41
            android.os.Bundle r7 = r19.getArgs()
            boolean r5 = r7.getBoolean(r5)
            android.os.Bundle r7 = r19.getArgs()
            boolean r4 = r7.getBoolean(r4)
            r6.<init>(r0, r5, r4)
            goto L_0x007e
        L_0x00a0:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r1 = "link"
            java.lang.String r7 = r0.getString(r1)
            if (r7 == 0) goto L_0x027f
            e41 r1 = new e41
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r6 = "is_new"
            boolean r8 = r0.getBoolean(r6)
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r6 = "front_camera_enabled"
            boolean r9 = r0.getBoolean(r6)
            android.os.Bundle r0 = r19.getArgs()
            boolean r10 = r0.getBoolean(r5)
            android.os.Bundle r0 = r19.getArgs()
            boolean r11 = r0.getBoolean(r4)
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x00d6:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r4 = "ACTIVE"
            r0.putString(r2, r4)
            el1 r0 = r19.D0()
            r0.getClass()
            boolean r2 = r1.b()
            tta r4 = r0.b
            eua r5 = r4.a()
            java.lang.String[] r6 = defpackage.eua.h
            boolean r5 = r5.b(r6)
            m38 r6 = defpackage.m38.a
            m38 r7 = defpackage.m38.X
            m38 r8 = defpackage.m38.b
            if (r5 != 0) goto L_0x0100
            r2 = r7
            goto L_0x0105
        L_0x0100:
            if (r2 == 0) goto L_0x0104
            r2 = r8
            goto L_0x0105
        L_0x0104:
            r2 = r6
        L_0x0105:
            boolean r5 = r1.a()
            eua r4 = r4.a()
            java.lang.String[] r9 = defpackage.eua.l
            boolean r4 = r4.b(r9)
            if (r4 != 0) goto L_0x0117
            r6 = r7
            goto L_0x011a
        L_0x0117:
            if (r5 == 0) goto L_0x011a
            r6 = r8
        L_0x011a:
            boolean r4 = r1 instanceof defpackage.f41
            q0e r5 = r0.x0
            ir1 r7 = r0.c
            r18 = 0
            if (r4 == 0) goto L_0x017d
            zm1 r4 = new zm1
            f41 r1 = (defpackage.f41) r1
            if (r6 != r8) goto L_0x012c
            r9 = r3
            goto L_0x012e
        L_0x012c:
            r9 = r18
        L_0x012e:
            long r10 = r1.a
            r4.<init>(r10, r9)
            nnf r1 = defpackage.nnf.a
            r7.a(r1)
        L_0x0138:
            java.lang.Object r1 = r5.getValue()
            r9 = r1
            la1 r9 = (defpackage.la1) r9
            if (r6 != r8) goto L_0x0144
            r16 = r3
            goto L_0x0146
        L_0x0144:
            r16 = r18
        L_0x0146:
            r13 = 0
            r17 = 327615(0x4ffbf, float:4.59086E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r6
            r15 = r2
            la1 r9 = defpackage.la1.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r5.c(r1, r9)
            if (r1 == 0) goto L_0x0138
            if (r6 != r8) goto L_0x015d
            r1 = r3
            goto L_0x015f
        L_0x015d:
            r1 = r18
        L_0x015f:
            if (r2 != r8) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r3 = r18
        L_0x0164:
            ek1 r5 = new ek1
            r8 = 0
            r5.<init>(r0, r2, r6, r8)
            lyd r0 = new lyd
            iyd r2 = new iyd
            r2.<init>(r4)
            r0.<init>(r2, r1, r3, r5)
            kr1 r1 = r7.a
            wr1 r1 = (defpackage.wr1) r1
            r1.A(r0)
            goto L_0x026d
        L_0x017d:
            boolean r4 = r1 instanceof defpackage.d41
            nnf r9 = defpackage.nnf.c
            if (r4 == 0) goto L_0x01d5
            xm1 r4 = new xm1
            d41 r1 = (defpackage.d41) r1
            if (r6 != r8) goto L_0x018b
            r10 = r3
            goto L_0x018d
        L_0x018b:
            r10 = r18
        L_0x018d:
            long r11 = r1.a
            r4.<init>(r11, r10)
            r7.a(r9)
        L_0x0195:
            java.lang.Object r1 = r5.getValue()
            r9 = r1
            la1 r9 = (defpackage.la1) r9
            r13 = 1
            r17 = 851903(0xcffbf, float:1.19377E-39)
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r14 = r6
            r15 = r2
            la1 r9 = defpackage.la1.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r5.c(r1, r9)
            if (r1 == 0) goto L_0x0195
            if (r6 != r8) goto L_0x01b5
            r1 = r3
            goto L_0x01b7
        L_0x01b5:
            r1 = r18
        L_0x01b7:
            if (r2 != r8) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r3 = r18
        L_0x01bc:
            ek1 r5 = new ek1
            r8 = 1
            r5.<init>(r0, r2, r6, r8)
            lyd r0 = new lyd
            gyd r2 = new gyd
            r2.<init>(r4)
            r0.<init>(r2, r1, r3, r5)
            kr1 r1 = r7.a
            wr1 r1 = (defpackage.wr1) r1
            r1.A(r0)
            goto L_0x026d
        L_0x01d5:
            boolean r4 = r1 instanceof defpackage.e41
            if (r4 == 0) goto L_0x0233
            r4 = r1
            e41 r4 = (defpackage.e41) r4
            r7.a(r9)
        L_0x01df:
            java.lang.Object r1 = r5.getValue()
            r9 = r1
            la1 r9 = (defpackage.la1) r9
            r13 = 1
            r17 = 851903(0xcffbf, float:1.19377E-39)
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r14 = r6
            r15 = r2
            la1 r9 = defpackage.la1.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r5.c(r1, r9)
            if (r1 == 0) goto L_0x01df
            if (r6 != r8) goto L_0x01ff
            r1 = r3
            goto L_0x0201
        L_0x01ff:
            r1 = r18
        L_0x0201:
            if (r2 != r8) goto L_0x0205
            r5 = r3
            goto L_0x0207
        L_0x0205:
            r5 = r18
        L_0x0207:
            fk1 r8 = new fk1
            boolean r9 = r4.c
            r8.<init>(r0, r2, r6, r9)
            boolean r0 = r4.b
            r0 = r0 ^ r3
            lyd r2 = new lyd
            java.lang.String r3 = r4.a
            int r4 = r3.length()
            if (r4 == 0) goto L_0x022b
            hyd r4 = new hyd
            r4.<init>(r3, r0)
            r2.<init>(r4, r1, r5, r8)
            kr1 r0 = r7.a
            wr1 r0 = (defpackage.wr1) r0
            r0.A(r2)
            goto L_0x026d
        L_0x022b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown target to call"
            r0.<init>(r1)
            throw r0
        L_0x0233:
            boolean r1 = r1 instanceof defpackage.c41
            if (r1 == 0) goto L_0x0279
            d04 r1 = r7.c()
            j1e r1 = r1.a
            if (r1 != 0) goto L_0x026d
            d04 r1 = r7.c()
            u8b r1 = r1.i
            if (r1 != 0) goto L_0x0249
            u8b r1 = defpackage.u8b.e
        L_0x0249:
            java.lang.Object r2 = r5.getValue()
            r6 = r2
            la1 r6 = (defpackage.la1) r6
            i95 r8 = r1.c
            z21 r3 = r0.s0
            y21 r4 = r1.d
            m31 r9 = r3.a(r4)
            r12 = 0
            r14 = 1048523(0xfffcb, float:1.469294E-39)
            j1e r7 = r1.b
            r10 = 0
            r11 = 0
            r13 = 0
            la1 r3 = defpackage.la1.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r2 = r5.c(r2, r3)
            if (r2 == 0) goto L_0x0249
        L_0x026d:
            android.content.Context r0 = r19.getContext()
            li1 r1 = new li1
            r2 = r19
            r1.<init>(r2, r0)
            return r1
        L_0x0279:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x027f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown open type="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.CallScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r9v12, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroyView(android.view.View r9) {
        /*
            r8 = this;
            im r0 = r8.requireActivity()
            r1 = 0
            defpackage.dy7.D(r0, r1)
            super.onDestroyView(r9)
            im r9 = r8.requireActivity()
            boolean r9 = r9.isChangingConfigurations()
            r0 = 0
            if (r9 != 0) goto L_0x00f6
            uv3 r9 = r8.z0()
            java.util.LinkedHashSet r2 = r9.a
            r2.clear()
            android.view.View r2 = r9.c
            if (r2 == 0) goto L_0x002e
            je7 r3 = r9.e
            java.lang.Object r3 = r3.getValue()
            android.view.View$OnLayoutChangeListener r3 = (android.view.View.OnLayoutChangeListener) r3
            r2.removeOnLayoutChangeListener(r3)
        L_0x002e:
            android.view.View r2 = r9.d
            if (r2 == 0) goto L_0x003d
            je7 r3 = r9.f
            java.lang.Object r3 = r3.getValue()
            android.view.View$OnLayoutChangeListener r3 = (android.view.View.OnLayoutChangeListener) r3
            r2.removeOnLayoutChangeListener(r3)
        L_0x003d:
            r9.c = r0
            r9.d = r0
            khe r9 = r8.Y
            java.lang.Object r9 = r9.getValue()
            fm1 r9 = (defpackage.fm1) r9
            gm1 r9 = (defpackage.gm1) r9
            java.util.LinkedHashSet r9 = r9.a
            r9.clear()
            el1 r9 = r8.D0()
            ir1 r2 = r9.c
            khe r3 = r2.r
            java.lang.Object r3 = r3.getValue()
            si9 r3 = (defpackage.si9) r3
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.g(r4)
            jpb r3 = r2.j
            r3.b()
            z01 r4 = r2.b
            a11 r4 = (defpackage.a11) r4
            java.util.concurrent.atomic.AtomicReference r5 = r4.c
            java.lang.Object r5 = r5.get()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager r5 = (ru.ok.android.externcalls.sdk.audio.CallsAudioManager) r5
            if (r5 == 0) goto L_0x0079
            r5.setOnAudioDeviceChangeListener(r0)
        L_0x0079:
            khe r5 = r2.u
            java.lang.Object r5 = r5.getValue()
            ru.ok.android.externcalls.sdk.AudioLevelListener r5 = (ru.ok.android.externcalls.sdk.AudioLevelListener) r5
            ru.ok.android.externcalls.sdk.audio.MicrophoneManager r4 = r4.c()     // Catch:{ Exception -> 0x008b }
            if (r4 == 0) goto L_0x00a8
            r4.removeAudioSampleCallback(r5)     // Catch:{ Exception -> 0x008b }
            goto L_0x00a8
        L_0x008b:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "CallAudioController can't unregister mic audio listener due to: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = "."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CallAudioController"
            defpackage.hm9.l0(r6, r5, r4)
        L_0x00a8:
            khe r4 = r2.x
            java.lang.Object r4 = r4.getValue()
            dr1 r4 = (defpackage.dr1) r4
            java.util.LinkedHashSet r5 = r3.h
            r5.remove(r4)
            r3.g = r0
            bc7[] r3 = defpackage.ir1.y
            r3 = r3[r1]
            w4d r4 = r2.v
            java.lang.Object r2 = r4.T0(r2, r3)
            x77 r2 = (defpackage.x77) r2
            if (r2 == 0) goto L_0x00c8
            r2.cancel(r0)
        L_0x00c8:
            khe r2 = r9.L0
            java.lang.Object r2 = r2.getValue()
            ugf r2 = (defpackage.ugf) r2
            r2.b()
            je7 r2 = r9.Q0
            java.lang.Object r2 = r2.getValue()
            en1 r2 = (defpackage.en1) r2
            java.util.LinkedHashSet r2 = r2.a
            r2.clear()
            eo1 r9 = r9.Z
            r9.getClass()
            bc7[] r2 = defpackage.eo1.k
            r1 = r2[r1]
            w4d r2 = r9.h
            java.lang.Object r9 = r2.T0(r9, r1)
            x77 r9 = (defpackage.x77) r9
            if (r9 == 0) goto L_0x00f6
            r9.cancel(r0)
        L_0x00f6:
            i1b r9 = r8.z0
            java.util.LinkedHashMap r1 = r9.b
            r1.clear()
            java.util.ArrayList r9 = r9.a
            r9.clear()
            uv3 r9 = r8.z0()
            r1 = 1
            r9.c(r1)
            od1 r9 = r8.O0
            if (r9 == 0) goto L_0x0115
            androidx.viewpager2.widget.ViewPager2 r1 = r8.E0()
            r1.g(r9)
        L_0x0115:
            r9 = r8
        L_0x0116:
            uu3 r1 = r9.getParentController()
            if (r1 == 0) goto L_0x0121
            uu3 r9 = r9.getParentController()
            goto L_0x0116
        L_0x0121:
            boolean r1 = r9 instanceof defpackage.foc
            if (r1 == 0) goto L_0x0128
            foc r9 = (defpackage.foc) r9
            goto L_0x0129
        L_0x0128:
            r9 = r0
        L_0x0129:
            if (r9 == 0) goto L_0x0130
            znc r9 = r9.T()
            goto L_0x0131
        L_0x0130:
            r9 = r0
        L_0x0131:
            if (r9 == 0) goto L_0x013e
            je7 r1 = r8.N0
            java.lang.Object r1 = r1.getValue()
            ji1 r1 = (defpackage.ji1) r1
            r9.K(r1)
        L_0x013e:
            j03 r9 = r8.u0()
            uu3 r9 = r9.b()
            boolean r1 = r9 instanceof one.me.calls.ui.ui.call.panels.CallEventsWidget
            if (r1 == 0) goto L_0x014d
            r0 = r9
            one.me.calls.ui.ui.call.panels.CallEventsWidget r0 = (one.me.calls.ui.ui.call.panels.CallEventsWidget) r0
        L_0x014d:
            if (r0 == 0) goto L_0x0158
            uv3 r8 = r8.z0()
            java.util.LinkedHashSet r8 = r8.a
            r8.remove(r0)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.CallScreen.onDestroyView(android.view.View):void");
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        uu3 uu3 = this;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        znc T = foc != null ? foc.T() : null;
        if (T != null) {
            T.a((ji1) this.N0.getValue());
        }
        dy7.D(requireActivity(), true);
        ir1 ir1 = D0().c;
        ir1.n();
        ir1.m();
        jpb jpb = ir1.j;
        jpb.a();
        jpb.h.add((dr1) ir1.x.getValue());
        jpb.g = new wmc(ir1, false);
        ir1.v.o1(ir1, ir1.y[0], od2.L(ir1.w, ir1.k));
        bc7[] bc7Arr = S0;
        j03 j03 = (j03) this.v0.T0(this, bc7Arr[1]);
        boolean f = tpa.f(j03.c(), "call_bottom_panel_widget_tag");
        String str = this.s0;
        if (!f) {
            coc coc = new coc(new CallBottomPanelWidget(str, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
            coc.d("call_bottom_panel_widget_tag");
            j03.a.R(coc);
        }
        j03 j032 = (j03) this.u0.T0(this, bc7Arr[0]);
        if (!tpa.f(j032.c(), "call_top_panel_widget_tag")) {
            coc coc2 = new coc(new CallTopPanelWidget(str, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
            coc2.d("call_top_panel_widget_tag");
            j032.a.R(coc2);
        }
        pn1 w02 = w0();
        if (w02 != null) {
            en1 en1 = (en1) D0().Q0.getValue();
            en1.a.add(w02);
            ((CallTopPanelWidget) w02).x(en1.b);
        }
        uu3 b2 = u0().b();
        CallEventsWidget callEventsWidget = b2 instanceof CallEventsWidget ? (CallEventsWidget) b2 : null;
        if (callEventsWidget != null) {
            z0().b(callEventsWidget);
        }
        i3a h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new ru3(3, (Object) this));
        }
        ViewPager2 E02 = E0();
        ViewStub B02 = B0();
        bc7 bc7 = bc7Arr[11];
        od1 od1 = new od1(E02, B02, (u21) this.M0.getValue(), (wd1) this.H0.getValue(), new di1(this, 0), new ci1(this, 9));
        E0().b(od1);
        this.O0 = od1;
        v0().setListener(new w4d(5, (Object) this));
        t0().setClickListener(new gaa((Object) this));
        od2.L(new j31(D0().N0, new qw(new qw(D0().F0, 24), 25), new c3(this, (Continuation) null, 4), 4), getViewLifecycleScope());
        w7c w7c = D0().O0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new mi1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().F0, getViewLifecycleOwner().Q(), fg7), new ni1((Continuation) null, this), 5), getViewLifecycleScope());
        if (!D0().u()) {
            od2.L(new zn5(tu0.g(D0().K0, getViewLifecycleOwner().Q(), fg7), new oi1((Continuation) null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(D0().M0, getViewLifecycleOwner().Q(), fg7), new pi1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(od2.x(new j31(D0().G0, D0().H0, new xi1(3, (Continuation) null, 0), 4)), getViewLifecycleOwner().Q(), fg7), new vi1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0(boolean z) {
        z0().c(z);
    }

    public final void r0(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.a = z0();
        z0().b(callWaitingRoomEventsWidget);
        callWaitingRoomEventsWidget.Z = new f9(this, 8, callWaitingRoomEventsWidget);
    }

    public final void s0(boolean z) {
        if (z) {
            ((wr1) D0().c.a).v();
        }
        View requireView = requireView();
        if (requireView.getMeasuredWidth() == 0 || requireView.getMeasuredHeight() == 0) {
            requireView().post(new b(22, (Object) this));
        } else {
            getRouter().B(this);
        }
    }

    public final q21 t0() {
        bc7 bc7 = S0[6];
        return (q21) this.C0.getValue();
    }

    public final j03 u0() {
        return (j03) this.w0.T0(this, S0[2]);
    }

    public final dm1 v0() {
        bc7 bc7 = S0[9];
        return (dm1) this.K0.getValue();
    }

    public final pn1 w0() {
        uu3 b2 = ((j03) this.u0.T0(this, S0[0])).b();
        if (b2 instanceof pn1) {
            return (pn1) b2;
        }
        return null;
    }

    public final j03 x0() {
        return (j03) this.y0.T0(this, S0[4]);
    }

    public final void y(int i, Bundle bundle) {
        D0().Z.b(i, bundle);
    }

    public final bt1 y0() {
        return (bt1) this.a.getValue();
    }

    public final uv3 z0() {
        return (uv3) this.A0.getValue();
    }
}
