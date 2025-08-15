package one.me.chatscreen.mediabar;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.mediabar.ActLocalMedias;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/chatscreen/mediabar/MediaBarWidget;", "Lone/me/sdk/arch/Widget;", "Lvm9;", "Lng3;", "Ldw1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", "chatId", "(Ljava/lang/String;JLz84;)V", "t58", "t9", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaBarWidget extends Widget implements vm9, ng3, dw1 {
    public static final /* synthetic */ bc7[] d1;
    public static final x27 e1 = new x27(0, new yq0(4, 3, true), 1);
    public final q7c A0;
    public final qm0 B0;
    public final ColorDrawable C0;
    public final qm0 D0;
    public float E0;
    public float F0;
    public int G0;
    public final qm0 H0;
    public final qm0 I0;
    public final qm0 J0;
    public final qm0 K0;
    public final xq0 L0;
    public final ColorDrawable M0;
    public ValueAnimator N0;
    public final qm0 O0;
    public final qm0 P0;
    public final qm0 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final je7 U0;
    public final q7c V0;
    public final qm0 W0;
    public final xp7 X;
    public final je7 X0;
    public final IntEvaluator Y;
    public final q7c Y0;
    public final q7c Z;
    public final q7c Z0;
    public final String a;
    public final tz5 a1;
    public final fs b;
    public hc8 b1;
    public final je7 c;
    public t58 c1;
    public final an9 o;
    public final q7c s0;
    public final q7c t0;
    public vha u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final je7 z0;

    static {
        Class<MediaBarWidget> cls = MediaBarWidget.class;
        d1 = new bc7[]{new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), z7b.g(nec.a, cls, "selectMediaTypeRouter", "getSelectMediaTypeRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0), new hob(cls, "closeDragView", "getCloseDragView()Landroid/widget/FrameLayout;", 0), new hob(cls, "closeDragElement", "getCloseDragElement()Landroid/widget/FrameLayout;", 0), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(cls, "primaryContainer", "getPrimaryContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0), new hob(cls, "selectedMediaAdapter", "getSelectedMediaAdapter()Lone/me/chatscreen/mediabar/SelectedMediaAdapter;", 0), new hob(cls, "selectedMediaRecycler", "getSelectedMediaRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new hob(cls, "selectedMediaContent", "getSelectedMediaContent()Landroid/widget/LinearLayout;", 0), new hob(cls, "messageContent", "getMessageContent()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new hob(cls, "draggableContainer", "getDraggableContainer()Landroid/widget/LinearLayout;", 0), new hob(cls, "selectMediaTypeContainer", "getSelectMediaTypeContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), new hob(cls, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    }

    public MediaBarWidget(String str, long j, z84 z84) {
        this(dy7.g(new kpa("scope_id", new suc(str)), new kpa("chat_id", Long.valueOf(j))));
    }

    public static final void m0(MediaBarWidget mediaBarWidget, int i, int i2) {
        vha vha = mediaBarWidget.u0;
        if (vha != null) {
            vha.a();
        }
        wha wha = new wha((FrameLayout) mediaBarWidget.x0());
        wha.c(new eia(0, 0, mediaBarWidget.r0().getHeight(), 3));
        wha.e(new kia(i));
        wha.h(mediaBarWidget.getContext().getString(i2));
        mediaBarWidget.u0 = wha.i();
    }

    public static final void n0(MediaBarWidget mediaBarWidget, int i) {
        vha vha = mediaBarWidget.u0;
        if (vha != null) {
            vha.a();
        }
        String quantityString = mediaBarWidget.getContext().getResources().getQuantityString(hga.a, i, new Object[]{Integer.valueOf(i)});
        wha wha = new wha((FrameLayout) mediaBarWidget.x0());
        wha.c(new eia(0, 0, mediaBarWidget.r0().getHeight(), 3));
        wha.h(quantityString);
        mediaBarWidget.u0 = wha.i();
    }

    public static final void o0(MediaBarWidget mediaBarWidget) {
        mediaBarWidget.getClass();
        bc7[] bc7Arr = d1;
        bc7 bc7 = bc7Arr[5];
        int measuredHeight = mediaBarWidget.A0().getMeasuredHeight() + ((FrameLayout) mediaBarWidget.w0.getValue()).getMeasuredHeight();
        bc7 bc72 = bc7Arr[9];
        float measuredHeight2 = mediaBarWidget.F0 + mediaBarWidget.E0 + ((float) (((w12) mediaBarWidget.B0.getValue()).getMeasuredHeight() + mediaBarWidget.t0().getPaddingTop() + measuredHeight));
        LinearLayout r0 = mediaBarWidget.r0();
        Rect rect = mpf.a;
        mpf.d(rect, r0);
        int height = (mediaBarWidget.s0().getHeight() + ((int) measuredHeight2)) - rect.top;
        if (height < 0) {
            height = 0;
        }
        ew1 s02 = mediaBarWidget.s0();
        int i = (-((int) mediaBarWidget.E0)) + mediaBarWidget.G0;
        s02.v0 = i;
        s02.w0 = height;
        if (!s02.z0) {
            axe axe = s02.x0;
            axe.a = i;
            axe.b = height;
            s02.invalidateOutline();
        }
        mediaBarWidget.s0().setPreviewTranslationY(measuredHeight2);
    }

    public final cla A0() {
        bc7 bc7 = d1[6];
        return (cla) this.x0.getValue();
    }

    public final p58 B0() {
        return (p58) this.T0.getValue();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [qp7, java.lang.Object] */
    public final void C0(up7 up7, int i, String str) {
        im requireActivity = requireActivity();
        boolean s = B0().s();
        ? obj = new Object();
        obj.a = true;
        obj.b = false;
        obj.c = str;
        obj.e = i;
        obj.d = up7.a();
        obj.f = 0;
        obj.g = 0;
        obj.a = true;
        obj.b = s;
        int i2 = ActLocalMedias.s1;
        Intent intent = new Intent(requireActivity, ActLocalMedias.class);
        intent.putExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false);
        intent.putExtra("ru.ok.tamtam.extra.OPTIONS", new rp7((qp7) obj));
        Pair create = Pair.create(intent, (Object) null);
        startActivityForResult((Intent) create.first, 39393, (Bundle) create.second);
    }

    public final void D0(i5d i5d) {
        int ordinal = i5d.ordinal();
        if (ordinal == 0) {
            w0().setRightOuterIconActionState(mv8.a);
        } else if (ordinal == 1) {
            w0().setRightOuterIconActionState(lv8.a);
        } else if (ordinal == 2) {
            w0().setRightOuterIconActionState(nv8.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void E0(n00 n00) {
        ska ska;
        int i;
        cla A02 = A0();
        if (B0().s()) {
            ska = nka.a;
        } else {
            int ordinal = n00.ordinal();
            if (ordinal == 0) {
                i = s8a.i;
            } else if (ordinal == 1) {
                i = s8a.h;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ska = new pka((yka) null, new vka(i, new s58(this, 0)));
        }
        A02.setRightActions(ska);
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m48getScopeIdIluPPks() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        if (i == 1) {
            p58 B02 = B0();
            B02.getClass();
            B02.t0.n(new a48(false));
        }
    }

    public final boolean handleBack() {
        if (s0().z0) {
            s0().a(false, true);
            an9.g(this.o, wuc.CHAT_ATTACH_PICKER);
            return true;
        }
        d6b scrollState = x0().getScrollState();
        scrollState.getClass();
        if (scrollState == d6b.a) {
            return false;
        }
        if (v0().n()) {
            B0().v0.z(1);
            return true;
        } else if (!B0().u()) {
            return true;
        } else {
            x0().j(true);
            return true;
        }
    }

    public final wuc o() {
        return s0().z0 ? wuc.CHAT_ATTACH_PICKER_CAMERA : wuc.CHAT_ATTACH_PICKER;
    }

    public final void onActivityPaused(Activity activity) {
        if (getView() != null) {
            p0();
        }
        super.onActivityPaused(activity);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        p58 B02 = B0();
        int i3 = B02.r().l;
        int i4 = i3 == 0 ? -1 : d58.$EnumSwitchMapping$2[au1.s(i3)];
        int i5 = 3;
        q0e q0e = B02.s0;
        if (i4 == 1 || i4 == 2) {
            q0e.m((Object) null, n00.a);
            p4d r = B02.r();
            int i6 = m00.$EnumSwitchMapping$0[0];
            if (i6 != 1) {
                if (i6 == 2) {
                    i5 = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            r.p(i5);
        } else if (i4 == 3) {
            q0e.m((Object) null, n00.b);
            p4d r2 = B02.r();
            int i7 = m00.$EnumSwitchMapping$0[1];
            if (i7 != 1) {
                if (i7 == 2) {
                    i5 = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            r2.p(i5);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (i == 39393) {
            s0().a(false, false);
            if (i2 == -1) {
                B0().t(true);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            if (x0().getScrollState() != d6b.a) {
                q0();
            }
            w0().setText(this.X.f.k);
        }
        p58 B02 = B0();
        B02.y0.h();
        B02.z0.h();
        urb urb = (urb) this.z0.getValue();
        urb.x0.h();
        urb.y0.h();
        super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f6b f6b = new f6b(getContext());
        f6b.setId(vvb.media_bar__popup_layout);
        qp4.u0.j(f6b).b();
        f6b.setBackground(new ColorDrawable(-1728053248));
        f6b.addView(t0());
        f6b.addView(r0());
        f6b.addView(s0());
        FrameLayout frameLayout = new FrameLayout(f6b.getContext());
        frameLayout.setId(t8a.y);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = vc7.a;
        frameLayout.setTranslationY((float) vc7.a(frameLayout.getContext()));
        br7.d(frameLayout, new x27(0, new yq0(5, 1, false), 1), (m56) null);
        f6b.addView(frameLayout);
        f6b.setCallback(new t9(this, 2));
        i24.s(new zn5(vc7.f, new v58(this, f6b, (Continuation) null), 5), getViewLifecycleScope());
        return f6b;
    }

    public final void onDestroyView(View view) {
        f6b x02 = x0();
        ValueAnimator valueAnimator = x02.s0;
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        x02.s0 = null;
        rrb rrb = s0().a;
        if (rrb != null) {
            if (rrb == null) {
                rrb = null;
            }
            rrb.getCameraApi().c();
        }
        hc8 hc8 = this.b1;
        if (hc8 != null) {
            hc8.a();
        }
        this.b1 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        je7 je7 = this.c;
        if (i == 159) {
            boolean unused = ((eua) je7.getValue()).getClass();
        } else if (i == 171) {
            boolean unused2 = ((eua) je7.getValue()).getClass();
        }
    }

    public final void onViewCreated(View view) {
        bc7[] bc7Arr = d1;
        j03 j03 = (j03) this.Z.T0(this, bc7Arr[1]);
        if (!tpa.f(j03.c(), "media_type_picker_widget")) {
            bc7 bc7 = bc7Arr[0];
            coc coc = new coc(new MediaTypePickerWidget(this.a, ((Number) this.b.a(this)).longValue(), (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
            coc.d("media_type_picker_widget");
            j03.a.R(coc);
        }
        q0e q0e = B0().s0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(q0e, getViewLifecycleOwner().Q(), fg7), new c68((Continuation) null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(B0().A0, new g68((Continuation) null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(od2.R(B0().t0), new h68((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().F0, getViewLifecycleOwner().Q(), fg7), new d68((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().D0, getViewLifecycleOwner().Q(), fg7), new e68((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().B0, getViewLifecycleOwner().Q(), fg7), new f68((Continuation) null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(u0().c, new a68((Continuation) null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(((bm8) this.S0.getValue()).b, new b68((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((urb) this.z0.getValue()).w0, getViewLifecycleOwner().Q(), fg7), new z58((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((q3d) this.U0.getValue()).o, getViewLifecycleOwner().Q(), fg7), new y58((Continuation) null, this), 5), getViewLifecycleScope());
        znc v02 = v0();
        w12 w12 = (w12) this.Y0.T0(this, bc7Arr[20]);
        LinearLayout r0 = r0();
        q58 q58 = new q58(this, 15);
        boolean z = tfg.s(getContext()).b && Build.VERSION.SDK_INT >= 30;
        pg7 viewLifecycleScope = getViewLifecycleScope();
        uy8 uy8 = (uy8) ((w7c) B0().v0.c).a.getValue();
        this.b1 = new hc8(v02, w12, r0, q58, z, viewLifecycleScope, (uy8 != null ? uy8.a : 0) == 2, new q58(this, 16));
        new bc8((cc8) this.X0.getValue(), w0()).a(getViewLifecycleScope());
        od2.L(new zn5(new t03((w7c) B0().v0.c, 11), new lq0(2, this, MediaBarWidget.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 19), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0() {
        /*
            r4 = this;
            ew1 r0 = r4.s0()
            rrb r0 = r0.a
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            r3 = 0
            if (r2 == 0) goto L_0x0019
            if (r0 != 0) goto L_0x0012
            r0 = r3
        L_0x0012:
            hv1 r0 = r0.getCameraApi()
            r0.h()
        L_0x0019:
            j03 r0 = r4.y0()
            uu3 r0 = r0.b()
            boolean r2 = r0 instanceof one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget
            if (r2 == 0) goto L_0x0038
            one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget r0 = (one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget) r0
            qm0 r0 = r0.o
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r0 = r0.getValue()
            hv1 r0 = (defpackage.hv1) r0
            r0.h()
        L_0x0038:
            bc7[] r0 = d1
            r2 = 18
            r0 = r0[r2]
            q7c r2 = r4.V0
            java.lang.Object r0 = r2.T0(r4, r0)
            j03 r0 = (defpackage.j03) r0
            uu3 r0 = r0.b()
            boolean r2 = r0 instanceof one.me.sdk.gallery.selectalbum.SelectAlbumWidget
            if (r2 == 0) goto L_0x0051
            r3 = r0
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r3 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r3
        L_0x0051:
            if (r3 == 0) goto L_0x005a
            f6b r0 = r3.n0()
            r0.j(r1)
        L_0x005a:
            cla r4 = r4.A0()
            r0 = 0
            r4.setDropdownRotationProgress(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.mediabar.MediaBarWidget.p0():void");
    }

    public final void q0() {
        rrb rrb = s0().a;
        if (rrb != null) {
            if (rrb == null) {
                rrb = null;
            }
            rrb.getCameraApi().e();
        }
        uu3 b2 = y0().b();
        if (b2 instanceof MediaBarPermissionWidget) {
            qm0 qm0 = ((MediaBarPermissionWidget) b2).o;
            if (qm0.a()) {
                ((hv1) qm0.getValue()).e();
            }
        }
    }

    public final LinearLayout r0() {
        bc7 bc7 = d1[17];
        return (LinearLayout) this.Q0.getValue();
    }

    public final ew1 s0() {
        bc7 bc7 = d1[10];
        return (ew1) this.D0.getValue();
    }

    public final LinearLayout t0() {
        bc7 bc7 = d1[15];
        return (LinearLayout) this.O0.getValue();
    }

    public final s86 u0() {
        return (s86) this.R0.getValue();
    }

    public final znc v0() {
        return (znc) this.Z0.T0(this, d1[21]);
    }

    public final sv8 w0() {
        bc7 bc7 = d1[14];
        return (sv8) this.K0.getValue();
    }

    public final f6b x0() {
        return (f6b) this.t0.T0(this, d1[3]);
    }

    public final j03 y0() {
        return (j03) this.s0.T0(this, d1[2]);
    }

    public final w12 z0() {
        bc7 bc7 = d1[19];
        return (w12) this.W0.getValue();
    }

    public MediaBarWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        p92.b.getClass();
        this.a = m64.a(p92.c.a);
        this.b = new fs(Long.class, "chat_id");
        this.c = fua.a.b();
        to2 to2 = to2.a;
        this.o = (an9) to2.getAccessor().c(an9.class);
        this.X = (xp7) to2.getAccessor().c(xp7.class);
        this.Y = new IntEvaluator();
        this.Z = childSlotRouter(vvb.media_bar__bottom_container);
        this.s0 = childSlotRouter(vvb.media_bar__primary_container);
        this.t0 = viewBinding(vvb.media_bar__popup_layout);
        this.v0 = binding(new q58(this, 0));
        this.w0 = binding(new q58(this, 1));
        this.x0 = binding(new q58(this, 2));
        this.y0 = binding(new q58(this, 3));
        this.z0 = createViewModelLazy(urb.class, new nj4(21, new m57(26)));
        this.A0 = childSlotRouter(vvb.media_bar__partial_media_access_container);
        this.B0 = binding(new q58(this, 4));
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.C0 = colorDrawable;
        this.D0 = binding(new q58(this, 5));
        this.H0 = binding(new q58(this, 6));
        this.I0 = binding(new q58(this, 7));
        this.J0 = binding(new q58(this, 8));
        this.K0 = binding(new q58(this, 9));
        this.L0 = new xq0(1, fk4.d().getDisplayMetrics().density * 12.0f);
        ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
        colorDrawable2.setAlpha(0);
        this.M0 = colorDrawable2;
        this.O0 = binding(new q58(this, 14));
        this.P0 = binding(new q58(this, 17));
        this.Q0 = binding(new q58(this, 18));
        tu0.r(3, new q58(this, 19));
        this.R0 = createViewModelLazy(s86.class, new nj4(22, new q58(this, 20)));
        this.S0 = createViewModelLazy(bm8.class, new nj4(23, new m57(27)));
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, "scope_id", cls);
        if (v != null) {
            this.T0 = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, p58.class, (k56) null);
            this.U0 = createViewModelLazy(q3d.class, new nj4(24, new m57(28)));
            this.V0 = childSlotRouter(t8a.A);
            this.W0 = binding(new q58(this, 21));
            Object v2 = ay7.v(bundle, "scope_id", cls);
            if (v2 != null) {
                this.X0 = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v2)).a, cc8.class, (k56) null);
                int i = t8a.y;
                this.Y0 = viewBinding(i);
                this.Z0 = Widget.childRouter$default(this, i, (m56) null, 2, (Object) null);
                this.a1 = new tz5(this, 1);
                return;
            }
            throw new IllegalArgumentException(zr6.i("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
