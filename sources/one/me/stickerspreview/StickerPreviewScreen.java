package one.me.stickerspreview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/stickerspreview/StickerPreviewScreen;", "Lone/me/sdk/arch/Widget;", "Lp3e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "stickerId", "chatId", "forwardId", "(JJJ)V", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
public final class StickerPreviewScreen extends Widget implements p3e {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final gw7 Z;
    public final fs a;
    public final fs b;
    public final x27 c;
    public final String o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final gic x0;
    public final gic y0;
    public final gic z0;

    static {
        Class<StickerPreviewScreen> cls = StickerPreviewScreen.class;
        hob hob = new hob(cls, "stickerId", "getStickerId()J", 0);
        oec oec = nec.a;
        A0 = new bc7[]{hob, zr6.e(oec, cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zr6.f(cls, "forwardId", "getForwardId()J", 0, oec), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0, oec), zr6.f(cls, "stickerContainer", "getStickerContainer()Landroid/widget/FrameLayout;", 0, oec), zr6.f(cls, "favoriteButton", "getFavoriteButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0, oec), zr6.f(cls, "stickerSetSheetRouter", "getStickerSetSheetRouter()Lcom/bluelinelabs/conductor/Router;", 0, oec)};
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [gw7, java.lang.Object] */
    public StickerPreviewScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        Class<Long> cls = Long.class;
        fs fsVar = new fs(cls, 0L, "arg_key_sticker_id");
        this.a = new fs(cls, 0L, "arg_key_chat_id");
        this.b = new fs(cls, 0L, "arg_key_forward_id");
        this.c = new x27(3, new yq0(3, 1, false));
        this.o = "StickerPreviewScreen";
        this.X = createViewModelLazy(i3e.class, new nhd(7, new b3e(this, 0)));
        this.Y = p4e.a.getAccessor().d(hw7.class);
        this.Z = new Object();
        this.s0 = viewBinding(bja.k);
        this.t0 = viewBinding(bja.d);
        this.u0 = viewBinding(bja.g);
        this.v0 = viewBinding(bja.a);
        this.w0 = Widget.childRouter$default(this, bja.h, (m56) null, 2, (Object) null);
        this.x0 = nu0.L(new b3e(this, 1));
        this.y0 = nu0.L(new b3e(this, 2));
        this.z0 = nu0.L(new b3e(this, 3));
        i3e n0 = n0();
        bc7 bc7 = A0[0];
        n0.s(((Number) fsVar.a(this)).longValue());
        i3e n02 = n0();
        if (n02.b != 0) {
            vxd S = j47.S(n02.a, ((w9a) n02.c).b(), vx3.b, new c3e(n02, (Continuation) null));
            n02.E0.o1(n02, i3e.H0[1], S);
        }
    }

    public final x27 getInsetsConfig() {
        return this.c;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m88getScopeIdIluPPks() {
        return this.o;
    }

    public final hw7 m0() {
        return (hw7) this.Y.getValue();
    }

    public final i3e n0() {
        return (i3e) this.X.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        m0().b = null;
        m0().a(this.Z);
    }

    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference;
        if (isAttached()) {
            hw7 m0 = m0();
            gw7 gw7 = this.Z;
            if (gw7 == null) {
                weakReference = null;
            } else {
                m0.getClass();
                weakReference = new WeakReference(gw7);
            }
            m0.b = weakReference;
            m0().b(gw7);
        }
    }

    public final void onAttach(View view) {
        Window window;
        View currentFocus;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            int i = vc7.a;
            if (vc7.b(vc7.c)) {
                mr0.I(currentFocus);
            }
        }
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        av3 av32 = av3.POP_ENTER;
        WeakReference weakReference = null;
        gw7 gw7 = this.Z;
        if (av3 == av32 || av3 == av3.PUSH_ENTER) {
            hw7 m0 = m0();
            if (gw7 != null) {
                m0.getClass();
                weakReference = new WeakReference(gw7);
            }
            m0.b = weakReference;
            m0().b(gw7);
        } else if (av3 == av3.PUSH_EXIT || av3 == av3.POP_EXIT) {
            m0().b = null;
            m0().a(gw7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r0 = r22
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r22.getContext()
            r1.<init>(r2)
            java.lang.String r2 = "#CC000000"
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setBackgroundColor(r2)
            a3e r2 = new a3e
            r3 = 0
            r2.<init>(r0, r3)
            defpackage.tu0.K(r1, 300, r2)
            w12 r2 = new w12
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            int r3 = defpackage.bja.h
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            r1.addView(r2)
            cla r2 = new cla
            android.content.Context r3 = r1.getContext()
            r5 = 6
            r2.<init>(r3, r5)
            int r3 = defpackage.bja.k
            r2.setId(r3)
            r3 = 52
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = defpackage.tu0.G(r3)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r4, r3)
            r6 = 48
            r5.gravity = r6
            r5.topMargin = r3
            r2.setLayoutParams(r5)
            pq9 r3 = defpackage.qp4.u0
            sba r5 = r3.p(r2)
            fka r5 = r5.c
            r2.setCustomTheme(r5)
            r5 = 0
            r2.setBackground(r5)
            uka r5 = defpackage.uka.a
            r2.setForm(r5)
            lka r5 = new lka
            rpc r6 = new rpc
            r7 = 8
            r6.<init>(r7, r0)
            r5.<init>(r6)
            r2.setLeftActions(r5)
            r1.addView(r2)
            r2 = 160(0xa0, float:2.24E-43)
            float r2 = (float) r2
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r2 = r2 * r5
            int r2 = defpackage.tu0.G(r2)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            android.content.Context r6 = r1.getContext()
            r5.<init>(r6)
            int r6 = defpackage.bja.d
            r5.setId(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r6.<init>(r4, r7)
            r8 = 17
            r6.gravity = r8
            r5.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r8 = r5.getContext()
            r6.<init>(r8)
            int r8 = defpackage.bja.g
            r6.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r4, r2)
            r6.setLayoutParams(r8)
            r5.addView(r6)
            bc7[] r4 = A0
            r6 = 1
            r8 = r4[r6]
            fs r8 = r0.a
            java.lang.Object r9 = r8.a(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x00eb
            r9 = r6
            goto L_0x00ec
        L_0x00eb:
            r9 = 0
        L_0x00ec:
            fs r13 = r0.b
            r14 = 2
            r10 = 20
            r15 = 120(0x78, float:1.68E-43)
            if (r9 == 0) goto L_0x0177
            as6 r9 = new as6
            android.content.Context r11 = r5.getContext()
            r9.<init>(r11)
            int r11 = defpackage.bja.c
            r9.setId(r11)
            float r11 = (float) r15
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = defpackage.tu0.G(r11)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r11, r7)
            r12.gravity = r6
            float r6 = (float) r10
            android.content.res.Resources r18 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r18.getDisplayMetrics()
            float r10 = r10.density
            int r6 = defpackage.rh4.c(r6, r10, r2)
            r12.topMargin = r6
            r6 = r4[r14]
            java.lang.Object r6 = r13.a(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            long r20 = r6.longValue()
            r16 = 0
            int r6 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x013e
            goto L_0x0150
        L_0x013e:
            r6 = 60
            float r10 = (float) r6
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r11 = defpackage.tu0.G(r10)
        L_0x0150:
            r12.leftMargin = r11
            r9.setLayoutParams(r12)
            int r6 = defpackage.woc.U0
            r9.setIcon(r6)
            int r6 = defpackage.cja.d
            r9.setLabel(r6)
            b7a r6 = defpackage.b7a.a
            one.me.sdk.uikit.common.button.OneMeButton r10 = r9.b
            r10.setMode(r6)
            z6a r6 = defpackage.z6a.X
            r10.setAppearance(r6)
            a3e r6 = new a3e
            r10 = 2
            r6.<init>(r0, r10)
            defpackage.tu0.K(r9, 300, r6)
            r5.addView(r9)
        L_0x0177:
            as6 r6 = new as6
            android.content.Context r9 = r5.getContext()
            r6.<init>(r9)
            int r9 = defpackage.bja.a
            r6.setId(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            float r10 = (float) r15
            android.content.res.Resources r11 = defpackage.fk4.d()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = defpackage.tu0.G(r11)
            r9.<init>(r11, r7)
            r11 = 1
            r9.gravity = r11
            r11 = 20
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r12 = defpackage.rh4.c(r11, r12, r2)
            r9.topMargin = r12
            r12 = r4[r14]
            java.lang.Object r12 = r13.a(r0)
            java.lang.Number r12 = (java.lang.Number) r12
            long r18 = r12.longValue()
            r15 = 0
            int r12 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x01c3
            goto L_0x01e7
        L_0x01c3:
            r12 = 1
            r17 = r4[r12]
            java.lang.Object r8 = r8.a(r0)
            java.lang.Number r8 = (java.lang.Number) r8
            long r17 = r8.longValue()
            int r8 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e7
            r8 = 60
            float r8 = (float) r8
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r8 = r8 * r12
            int r8 = defpackage.tu0.G(r8)
            goto L_0x01e8
        L_0x01e7:
            r8 = 0
        L_0x01e8:
            r9.rightMargin = r8
            r6.setLayoutParams(r9)
            int r8 = defpackage.woc.J
            r6.setIcon(r8)
            int r8 = defpackage.cja.a
            r6.setLabel(r8)
            sba r8 = r3.p(r6)
            fka r8 = r8.c
            one.me.sdk.uikit.common.button.OneMeButton r9 = r6.b
            r9.setCustomTheme(r8)
            a3e r8 = new a3e
            r9 = 3
            r8.<init>(r0, r9)
            defpackage.tu0.K(r6, 300, r8)
            r5.addView(r6)
            r4 = r4[r14]
            java.lang.Object r4 = r13.a(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            long r8 = r4.longValue()
            r12 = 0
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x027b
            as6 r4 = new as6
            android.content.Context r6 = r5.getContext()
            r4.<init>(r6)
            int r6 = defpackage.bja.b
            r4.setId(r6)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r6 = defpackage.tu0.G(r10)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r6, r7)
            r7 = 1
            r8.gravity = r7
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            int r2 = defpackage.rh4.c(r11, r7, r2)
            r8.topMargin = r2
            r8.rightMargin = r6
            r4.setLayoutParams(r8)
            int r2 = defpackage.woc.Z1
            r4.setIcon(r2)
            int r2 = defpackage.cja.b
            r4.setLabel(r2)
            sba r2 = r3.p(r4)
            fka r2 = r2.c
            one.me.sdk.uikit.common.button.OneMeButton r3 = r4.b
            r3.setCustomTheme(r2)
            a3e r2 = new a3e
            r3 = 1
            r2.<init>(r0, r3)
            defpackage.tu0.K(r4, 300, r2)
            r5.addView(r4)
        L_0x027b:
            r1.addView(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerspreview.StickerPreviewScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        m0().b = null;
        this.Z.b();
        c32 c32 = c32.Y;
        this.x0.b = c32;
        this.y0.b = c32;
        this.z0.b = c32;
    }

    public final void onViewCreated(View view) {
        bc7[] bc7Arr = A0;
        bc7 bc7 = bc7Arr[7];
        q7c q7c = this.w0;
        if (!((znc) q7c.T0(this, bc7)).n()) {
            StickerSetBottomSheet stickerSetBottomSheet = new StickerSetBottomSheet(this.o, (z84) null);
            stickerSetBottomSheet.u0 = this.Z;
            ((znc) q7c.T0(this, bc7Arr[7])).R(i24.e(stickerSetBottomSheet, (zu3) null, (zu3) null));
        }
        od2.L(new zn5(n0().y0, new shb(2, this, StickerPreviewScreen.class, "handleNewSticker", "handleNewSticker(Lone/me/sdk/stickers/model/StickerModel;)V", 4, 7), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().A0, new shb(2, (cla) this.s0.T0(this, bc7Arr[3]), cla.class, "setTitle", "setTitle(Ljava/lang/CharSequence;)V", 4, 8), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().v0, new shb(2, this, StickerPreviewScreen.class, "handleNavEvent", "handleNavEvent(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 9), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().w0, new shb(2, this, StickerPreviewScreen.class, "handleEvent", "handleEvent(Lone/me/sdk/arch/event/Event;)V", 4, 10), 5), getViewLifecycleScope());
    }

    public StickerPreviewScreen(long j, long j2, long j3) {
        this(dy7.g(new kpa("arg_key_sticker_id", Long.valueOf(j)), new kpa("arg_key_chat_id", Long.valueOf(j2)), new kpa("arg_key_forward_id", Long.valueOf(j3))));
    }
}
