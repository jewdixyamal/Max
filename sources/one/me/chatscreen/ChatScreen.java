package one.me.chatscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/ChatScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lxt3;", "Lng3;", "Ly16;", "La0b;", "Lt58;", "Lr59;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatScreen extends SwipeWidget implements xt3, ng3, y16, a0b, t58, r59 {
    public static final /* synthetic */ bc7[] k1;
    public boolean A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final fn2 F0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final String L0;
    public final q7c M0;
    public final q7c N0;
    public final q7c O0;
    public final q7c P0;
    public final q7c Q0;
    public final q7c R0;
    public final q7c S0;
    public final q7c T0;
    public hc8 U0;
    public final q7c V0;
    public final q7c W0;
    public final an9 X;
    public final q7c X0;
    public final bt1 Y;
    public final je7 Y0;
    public final je7 Z;
    public final gw7 Z0;
    public final q7c a1;
    public final q7c b1;
    public final q7c c1;
    public final q7c d1;
    public final q7c e1;
    public final q7c f1;
    public final je7 g1;
    public final je7 h1;
    public vha i1;
    public Bundle j1;
    public final glc o = new glc(new fn2(this, 0), new fn2(this, 13), 4);
    public final no2 s0;
    public final fs t0;
    public final fs u0;
    public final fs v0;
    public final fs w0;
    public final fs x0;
    public final fs y0;
    public final fs z0;

    static {
        Class<ChatScreen> cls = ChatScreen.class;
        k1 = new bc7[]{new hob(cls, "unspecifiedChatId", "getUnspecifiedChatId()J", 0), z7b.g(nec.a, cls, "type", "getType()Lone/me/chatscreen/deeplink/ChatDeepLinkRoutes$Type;", 0), new hob(cls, "openSearchField", "getOpenSearchField()Z", 0), new hob(cls, "startPayload", "getStartPayload()Ljava/lang/String;", 0), new oi9(cls, "forwardMessageIds", "getForwardMessageIds()[J"), new oi9(cls, "forwardAttachId", "getForwardAttachId()Ljava/lang/Long;"), new oi9(cls, "isForwardAttach", "isForwardAttach()Z"), new hob(cls, "messagesContainer", "getMessagesContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "messagesRouter", "getMessagesRouter()Lcom/bluelinelabs/conductor/Router;", 0), new hob(cls, "bottomContainer", "getBottomContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "bottomRouter", "getBottomRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "mediaBarContainer", "getMediaBarContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "mediaBarRouter", "getMediaBarRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), new hob(cls, "chatMainContainer", "getChatMainContainer()Landroid/widget/LinearLayout;", 0), new hob(cls, "videoMsgContainer", "getVideoMsgContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "videoMsgRouter", "getVideoMsgRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(cls, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0), new hob(cls, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new hob(cls, "chatBackground", "getChatBackground()Landroid/view/View;", 0), new hob(cls, "suggestionsContainer", "getSuggestionsContainer()Landroid/view/ViewGroup;", 0), new hob(cls, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [gw7, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatScreen(Bundle bundle) {
        super(bundle);
        to2 to2 = to2.a;
        this.X = (an9) to2.getAccessor().c(an9.class);
        this.Y = (bt1) to2.getAccessor().c(bt1.class);
        je7 je7 = so2.a;
        this.Z = to2.getAccessor().d(qe5.class);
        this.s0 = new no2(this, 0);
        Class<Long> cls = Long.class;
        this.t0 = new fs(cls, "id");
        this.u0 = new fs(o92.class, "type");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.v0 = new fs(cls2, bool, "open_search_field");
        this.w0 = new fs(String.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.x0 = new fs(long[].class, (Object) null, "forward_msg_ids");
        this.y0 = new fs(cls, (Object) null, "forward_attach_id");
        this.z0 = new fs(cls2, bool, "is_forward_attach");
        this.A0 = true;
        this.B0 = createViewModelLazy(rq2.class, new ti2(7, new fn2(this, 14)));
        this.C0 = createViewModelLazy(xz8.class, new ti2(8, new fn2(this, 15)));
        this.D0 = createViewModelLazy(p58.class, new ti2(9, new fn2(this, 16)));
        this.E0 = createViewModelLazy(g39.class, new ti2(10, new m52(26)));
        this.F0 = new fn2(this, 1);
        this.G0 = createViewModelLazy(yce.class, new ti2(11, new fn2(this, 2)));
        this.H0 = createViewModelLazy(zz7.class, new ti2(12, new m52(27)));
        this.I0 = createViewModelLazy(cc8.class, new ti2(13, new m52(28)));
        this.J0 = createViewModelLazy(hzc.class, new ti2(14, new fn2(this, 4)));
        createViewModelLazy(wza.class, new ti2(15, new fn2(this, 9)));
        this.K0 = createViewModelLazy(jac.class, new ti2(6, new hn2(1)));
        this.L0 = "ChatScreen";
        int i = t8a.k;
        this.M0 = viewBinding(i);
        this.N0 = Widget.childRouter$default(this, i, (m56) null, 2, (Object) null);
        int i2 = t8a.b;
        this.O0 = viewBinding(i2);
        this.P0 = childSlotRouter(i2);
        int i3 = t8a.i;
        this.Q0 = viewBinding(i3);
        this.R0 = childSlotRouter(i3);
        int i4 = t8a.j;
        this.S0 = viewBinding(i4);
        this.T0 = Widget.childRouter$default(this, i4, (m56) null, 2, (Object) null);
        this.V0 = viewBinding(t8a.h);
        int i5 = t8a.p;
        this.W0 = viewBinding(i5);
        this.X0 = childSlotRouter(i5);
        this.Y0 = to2.getAccessor().d(hw7.class);
        this.Z0 = new Object();
        this.a1 = viewBinding(t8a.o);
        this.b1 = viewBinding(t8a.m);
        this.c1 = viewBinding(t8a.l);
        this.d1 = viewBinding(t8a.a);
        int i6 = t8a.n;
        this.e1 = viewBinding(i6);
        this.f1 = childSlotRouter(i6);
        this.g1 = tu0.r(3, new fn2(this, 12));
        this.h1 = tu0.r(3, new hn2(2));
    }

    public static void U0(ChatScreen chatScreen, Integer num, String str, Integer num2, Integer num3, int i) {
        String str2 = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        chatScreen.getClass();
        if (r4 == null) {
            if (num != null) {
                r4 = z7.B(chatScreen.getContext(), num.intValue());
            } else {
                r4 = null;
            }
            if (r4 == null) {
                return;
            }
        }
        if (num2 != null) {
            str2 = z7.B(chatScreen.getContext(), num2.intValue());
        }
        vha vha = chatScreen.i1;
        if (vha != null) {
            vha.a();
        }
        wha wha = new wha((Widget) chatScreen);
        wha.h(r4);
        wha.b(str2);
        wha.c(new eia(0, 0, chatScreen.A0(), 3));
        if (num3 != null) {
            wha.e(new kia(num3.intValue()));
        }
        chatScreen.i1 = wha.i();
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v0(one.me.chatscreen.ChatScreen r10, defpackage.sy8 r11) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            r10.getClass()
            boolean r3 = r11.a
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r5 = 200(0xc8, double:9.9E-322)
            r7 = 0
            if (r3 == 0) goto L_0x00ea
            hc8 r11 = r10.U0
            if (r11 == 0) goto L_0x01ca
            r3 = r10
        L_0x0014:
            uu3 r8 = r3.getParentController()
            if (r8 == 0) goto L_0x001f
            uu3 r3 = r3.getParentController()
            goto L_0x0014
        L_0x001f:
            boolean r8 = r3 instanceof defpackage.foc
            if (r8 == 0) goto L_0x0026
            foc r3 = (defpackage.foc) r3
            goto L_0x0027
        L_0x0026:
            r3 = r7
        L_0x0027:
            if (r3 == 0) goto L_0x002e
            int r3 = r3.s()
            goto L_0x002f
        L_0x002e:
            r3 = r2
        L_0x002f:
            cla r10 = r10.N0()
            int r10 = r10.getBottom()
            int r10 = r10 + r3
            boolean r3 = r11.e
            android.view.View r8 = r11.b
            int r9 = r11.k
            if (r3 == 0) goto L_0x0099
            int r9 = r9 + r10
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            int r10 = r10 - r9
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x005b
            r7 = r3
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x005b:
            if (r7 == 0) goto L_0x0060
            int r3 = r7.bottomMargin
            goto L_0x0061
        L_0x0060:
            r3 = r2
        L_0x0061:
            int r3 = r3 + r10
            android.animation.AnimatorSet r4 = r11.i
            if (r4 == 0) goto L_0x0069
            r4.cancel()
        L_0x0069:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.ValueAnimator r3 = r11.b(r3)
            int r7 = r11.c()
            int[] r10 = new int[]{r7, r10}
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r10)
            ec8 r7 = new ec8
            r7.<init>(r11, r1)
            r10.addUpdateListener(r7)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r3
            r0[r1] = r10
            r4.playTogether(r0)
            r4.setDuration(r5)
            r4.start()
            r11.i = r4
            goto L_0x01ca
        L_0x0099:
            int r9 = r9 + r10
            android.content.Context r10 = r8.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            int r10 = r10 - r9
            one.me.keyboardmedia.MediaKeyboardWidget r0 = r11.d()
            if (r0 == 0) goto L_0x00c7
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x00c7
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00c1
            r1.height = r10
            r0.setLayoutParams(r1)
            goto L_0x00c7
        L_0x00c1:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x00c7:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x00d2
            r7 = r0
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x00d2:
            if (r7 == 0) goto L_0x00d6
            int r2 = r7.bottomMargin
        L_0x00d6:
            int r10 = r10 + r2
            android.view.View r11 = r11.c
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r2 = r11.getPaddingRight()
            r11.setPadding(r0, r1, r2, r10)
            goto L_0x01ca
        L_0x00ea:
            hc8 r3 = r10.U0
            if (r3 == 0) goto L_0x01ca
            one.me.keyboardmedia.MediaKeyboardWidget r8 = r3.d()
            if (r8 == 0) goto L_0x00ff
            android.view.View r8 = r8.getView()
            if (r8 == 0) goto L_0x00ff
            int r8 = r8.getHeight()
            goto L_0x0100
        L_0x00ff:
            r8 = r2
        L_0x0100:
            int r3 = r3.c()
            if (r8 <= r3) goto L_0x01ca
            hc8 r3 = r10.U0
            if (r3 == 0) goto L_0x01ca
            x2 r8 = new x2
            r9 = 24
            r8.<init>((java.lang.Object) r11, (int) r9, (java.lang.Object) r10)
            boolean r10 = r3.e
            android.view.View r11 = r3.b
            if (r10 == 0) goto L_0x0184
            int r10 = r3.c()
            int r4 = r3.c()
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r9 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x012a
            r7 = r11
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            int r11 = r7.bottomMargin
            goto L_0x0130
        L_0x012f:
            r11 = r2
        L_0x0130:
            int r4 = r4 + r11
            android.animation.AnimatorSet r11 = r3.i
            if (r11 == 0) goto L_0x0138
            r11.cancel()
        L_0x0138:
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            android.animation.ValueAnimator r4 = r3.b(r4)
            one.me.keyboardmedia.MediaKeyboardWidget r7 = r3.d()
            if (r7 == 0) goto L_0x0152
            android.view.View r7 = r7.getView()
            if (r7 == 0) goto L_0x0152
            int r7 = r7.getHeight()
            goto L_0x0153
        L_0x0152:
            r7 = r2
        L_0x0153:
            int[] r10 = new int[]{r7, r10}
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r10)
            ec8 r7 = new ec8
            r7.<init>(r3, r1)
            r10.addUpdateListener(r7)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r4
            r0[r1] = r10
            r11.playTogether(r0)
            r11.setDuration(r5)
            yf3 r10 = new yf3
            r0 = 16
            r10.<init>(r3, r0, r8)
            fh r0 = new fh
            r0.<init>(r11, r10, r2)
            r11.addListener(r0)
            r11.start()
            r3.i = r11
            goto L_0x01ca
        L_0x0184:
            int r10 = r3.c()
            one.me.keyboardmedia.MediaKeyboardWidget r0 = r3.d()
            if (r0 == 0) goto L_0x01a6
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x01a6
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x01a0
            r1.height = r10
            r0.setLayoutParams(r1)
            goto L_0x01a6
        L_0x01a0:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x01a6:
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x01b1
            r7 = r11
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
        L_0x01b1:
            if (r7 == 0) goto L_0x01b5
            int r2 = r7.bottomMargin
        L_0x01b5:
            int r10 = r10 + r2
            android.view.View r11 = r3.c
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r2 = r11.getPaddingRight()
            r11.setPadding(r0, r1, r2, r10)
            r8.invoke()
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.v0(one.me.chatscreen.ChatScreen, sy8):void");
    }

    public static final void w0(ChatScreen chatScreen, cla cla, boolean z) {
        ecf ecf;
        chatScreen.getClass();
        int I = i24.I(qqe.e(cla.getTitle()));
        int i = 0;
        if (z) {
            ecf a = qqe.a(cla.getTitle());
            if ((a != null ? a.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a2 = qqe.a(cla.getTitle());
            if (a2 != null) {
                i = a2.a;
            }
            if (i != I) {
                ecf = new ecf(cla.getContext(), I, new we1(22));
                qqe.d(cla.getTitle(), ecf);
            }
        }
        ecf = null;
        qqe.d(cla.getTitle(), ecf);
    }

    public static final void x0(ChatScreen chatScreen, lr0 lr0) {
        chatScreen.getClass();
        int ordinal = lr0.ordinal();
        String str = chatScreen.L0;
        if (ordinal == 0) {
            j03 B02 = chatScreen.B0();
            if (!tpa.f(B02.c(), "write_controller")) {
                coc coc = new coc(new MessageWriteWidget(str, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("write_controller");
                B02.a.R(coc);
            }
        } else if (ordinal == 1) {
            j03 B03 = chatScreen.B0();
            if (!tpa.f(B03.c(), "search_bar_controller")) {
                coc coc2 = new coc(new SearchMessageBottomWidget(str, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc2.d("search_bar_controller");
                B03.a.R(coc2);
            }
        } else if (ordinal == 2) {
            yq2 yq2 = (yq2) chatScreen.P0().d1.a.getValue();
            if (yq2 != null) {
                if (yq2 == yq2.Y) {
                    chatScreen.B0().a();
                    return;
                }
                j03 B04 = chatScreen.B0();
                if (!tpa.f(B04.c(), "unblock_contact_controller_tag")) {
                    coc coc3 = new coc(new ChatStatusBottomWidget(str, yq2, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                    coc3.d("unblock_contact_controller_tag");
                    B04.a.R(coc3);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final int A0() {
        hc8 hc8 = this.U0;
        if (hc8 != null && hc8.l) {
            return z0().getMeasuredHeight();
        }
        int measuredHeight = z0().getMeasuredHeight() - z0().getPaddingBottom();
        Integer x = br7.x(z0());
        return (x != null ? x.intValue() : 0) + measuredHeight;
    }

    public final j03 B0() {
        return (j03) this.P0.T0(this, k1[10]);
    }

    public final rg1 C0() {
        return (rg1) this.g1.getValue();
    }

    public final wuc D0() {
        coc coc = (coc) x53.q0(getRouter().e());
        uu3 uu3 = coc != null ? coc.a : null;
        uu3 b = ((j03) this.R0.T0(this, k1[12])).b();
        if (!tpa.f(uu3, this) && (uu3 instanceof vm9)) {
            return ((vm9) uu3).o();
        }
        if (b instanceof MediaBarWidget) {
            MediaBarWidget mediaBarWidget = (MediaBarWidget) b;
            if (mediaBarWidget.x0().getScrollState() != d6b.a) {
                return mediaBarWidget.o();
            }
        }
        return wuc.CHAT;
    }

    public final w12 E0() {
        return (w12) this.Q0.T0(this, k1[11]);
    }

    public final xz8 F0() {
        return (xz8) this.C0.getValue();
    }

    public final MessageWriteWidget G0() {
        uu3 b = B0().b();
        if (b instanceof MessageWriteWidget) {
            return (MessageWriteWidget) b;
        }
        return null;
    }

    public final g39 H0() {
        return (g39) this.E0.getValue();
    }

    public final znc I0() {
        return (znc) this.N0.T0(this, k1[8]);
    }

    public final hzc J0() {
        return (hzc) this.J0.getValue();
    }

    public final eha K0() {
        return (eha) this.b1.T0(this, k1[19]);
    }

    public final ViewGroup L0() {
        return (ViewGroup) this.e1.T0(this, k1[22]);
    }

    public final j03 M0() {
        return (j03) this.f1.T0(this, k1[23]);
    }

    public final cla N0() {
        return (cla) this.a1.T0(this, k1[18]);
    }

    public final w12 O0() {
        return (w12) this.W0.T0(this, k1[16]);
    }

    public final rq2 P0() {
        return (rq2) this.B0.getValue();
    }

    public final boolean Q0() {
        return tfg.s(getContext()).b && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: one.me.chatscreen.mediabar.MediaBarWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: one.me.chatscreen.mediabar.MediaBarWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: one.me.chatscreen.mediabar.MediaBarWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: cz5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: one.me.chatscreen.mediabar.MediaBarWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: one.me.chatscreen.mediabar.MediaBarWidget} */
    /* JADX WARNING: type inference failed for: r0v3, types: [uu3] */
    /* JADX WARNING: type inference failed for: r5v5, types: [cz5] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r3.isInstance(r1) != false) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 372(0x174, float:5.21E-43)
            r4 = 34
            r5 = 0
            if (r1 == r3) goto L_0x008c
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r1 == r3) goto L_0x0035
            r2 = 1010(0x3f2, float:1.415E-42)
            if (r1 == r2) goto L_0x0017
            goto L_0x0131
        L_0x0017:
            r1 = -1
            r2 = r18
            if (r2 == r1) goto L_0x001d
            return
        L_0x001d:
            je7 r0 = r0.D0
            java.lang.Object r0 = r0.getValue()
            p58 r0 = (defpackage.p58) r0
            r0.getClass()
            a48 r1 = new a48
            r2 = 0
            r1.<init>(r2)
            zt0 r0 = r0.t0
            r0.n(r1)
            goto L_0x0131
        L_0x0035:
            if (r2 != 0) goto L_0x0039
        L_0x0037:
            r1 = r5
            goto L_0x0050
        L_0x0039:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<er7> r3 = defpackage.er7.class
            java.lang.String r6 = "location_data"
            if (r1 < r4) goto L_0x0046
            java.io.Serializable r1 = defpackage.m37.d(r2, r6, r3)
            goto L_0x0050
        L_0x0046:
            java.io.Serializable r1 = r2.getSerializableExtra(r6)
            boolean r3 = r3.isInstance(r1)
            if (r3 == 0) goto L_0x0037
        L_0x0050:
            r7 = r1
            er7 r7 = (defpackage.er7) r7
            if (r2 == 0) goto L_0x0061
            java.lang.String r1 = "zoom"
            r3 = 0
            float r1 = r2.getFloatExtra(r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0062
        L_0x0061:
            r1 = r5
        L_0x0062:
            if (r7 == 0) goto L_0x0131
            if (r1 == 0) goto L_0x0131
            rq2 r6 = r16.P0()
            float r8 = r1.floatValue()
            xz8 r1 = r16.F0()
            java.lang.Long r11 = r1.w()
            xz8 r0 = r16.F0()
            zy8 r0 = r0.v()
            if (r0 == 0) goto L_0x0084
            cz5 r5 = r0.a()
        L_0x0084:
            r12 = r5
            r9 = 0
            r6.A(r7, r8, r9, r11, r12)
            goto L_0x0131
        L_0x008c:
            if (r2 == 0) goto L_0x00aa
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "contacts.picker.result.key"
            java.lang.Class<qp3> r6 = defpackage.qp3.class
            if (r1 < r4) goto L_0x009b
            java.io.Serializable r1 = defpackage.m37.d(r2, r3, r6)
            goto L_0x00a7
        L_0x009b:
            java.io.Serializable r1 = r2.getSerializableExtra(r3)
            boolean r2 = r6.isInstance(r1)
            if (r2 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = r5
        L_0x00a7:
            qp3 r1 = (defpackage.qp3) r1
            goto L_0x00ab
        L_0x00aa:
            r1 = r5
        L_0x00ab:
            if (r1 == 0) goto L_0x0131
            rq2 r2 = r16.P0()
            xz8 r3 = r16.F0()
            java.lang.Long r10 = r3.w()
            xz8 r3 = r16.F0()
            zy8 r3 = r3.v()
            if (r3 == 0) goto L_0x00c9
            cz5 r3 = r3.a()
            r13 = r3
            goto L_0x00ca
        L_0x00c9:
            r13 = r5
        L_0x00ca:
            w7c r3 = r2.Y0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            e52 r3 = (defpackage.e52) r3
            if (r3 == 0) goto L_0x0108
            kke r4 = r2.u()
            w9a r4 = (defpackage.w9a) r4
            nx3 r4 = r4.b()
            vx3 r15 = defpackage.vx3.b
            wp2 r14 = new wp2
            java.util.List r6 = r1.a
            r11 = r6
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.List r1 = r1.b
            r12 = r1
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            long r8 = r3.a
            r1 = 0
            r6 = r14
            r7 = r2
            r3 = r14
            r14 = r1
            r6.<init>(r7, r8, r10, r11, r12, r13, r14)
            kotlinx.coroutines.internal.ContextScope r1 = r2.a
            vxd r1 = defpackage.j47.S(r1, r4, r15, r3)
            bc7[] r3 = defpackage.rq2.f1
            r4 = 3
            r3 = r3[r4]
            w4d r4 = r2.O0
            r4.o1(r2, r3, r1)
        L_0x0108:
            bc7[] r1 = k1
            r2 = 12
            r1 = r1[r2]
            q7c r2 = r0.R0
            java.lang.Object r0 = r2.T0(r0, r1)
            j03 r0 = (defpackage.j03) r0
            uu3 r0 = r0.b()
            boolean r1 = r0 instanceof one.me.chatscreen.mediabar.MediaBarWidget
            if (r1 == 0) goto L_0x0121
            r5 = r0
            one.me.chatscreen.mediabar.MediaBarWidget r5 = (one.me.chatscreen.mediabar.MediaBarWidget) r5
        L_0x0121:
            if (r5 == 0) goto L_0x0131
            android.view.View r0 = r5.getView()
            if (r0 == 0) goto L_0x0131
            f6b r0 = r5.x0()
            r1 = 1
            r0.j(r1)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.R(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R0(java.lang.CharSequence r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0017
            android.view.View r1 = r9.getView()
            if (r1 == 0) goto L_0x0096
            one.me.sdk.messagewrite.MessageWriteWidget r1 = r9.G0()
            if (r1 == 0) goto L_0x0014
            android.view.View r1 = r1.getView()
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            if (r1 == 0) goto L_0x0096
        L_0x0017:
            rq2 r1 = r9.P0()
            if (r10 != 0) goto L_0x002b
            one.me.sdk.messagewrite.MessageWriteWidget r10 = r9.G0()
            if (r10 == 0) goto L_0x002d
            sv8 r10 = r10.q0()
            java.lang.CharSequence r10 = r10.getText()
        L_0x002b:
            r4 = r10
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            xz8 r10 = r9.F0()
            java.lang.Long r5 = r10.w()
            xz8 r9 = r9.F0()
            java.lang.Long r6 = r9.u()
            java.lang.Class<rq2> r9 = defpackage.rq2.class
            java.lang.String r9 = r9.getName()
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x0049
            goto L_0x0071
        L_0x0049:
            r1.getClass()
            boolean r2 = r10.c()
            if (r2 == 0) goto L_0x0071
            us7 r2 = defpackage.us7.X
            if (r4 == 0) goto L_0x005f
            int r3 = r4.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0060
        L_0x005f:
            r3 = r0
        L_0x0060:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "save draft, textLength:"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r10.d(r2, r9, r3, r0)
        L_0x0071:
            kke r9 = r1.u()
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.b()
            vx3 r10 = defpackage.vx3.b
            up2 r0 = new up2
            r7 = 0
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            kotlinx.coroutines.internal.ContextScope r2 = r1.a
            vxd r9 = defpackage.j47.S(r2, r9, r10, r0)
            w4d r10 = r1.U0
            bc7[] r0 = defpackage.rq2.f1
            r2 = 9
            r0 = r0[r2]
            r10.o1(r1, r0, r9)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.R0(java.lang.CharSequence):void");
    }

    public final boolean S() {
        return ((se5) ((qe5) this.Z.getValue())).u() && this.A0;
    }

    public final void S0(boolean z) {
        bc7[] bc7Arr = BottomSheetWidget.x0;
        eqe eqe = new eqe(yoc.m0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("forward_cancel_stay_on_screen", z);
        lg3 a = od2.a(eqe, bundle, 4);
        a.b(xoc.r0, new eqe(yoc.l0));
        a.c(xoc.q0, new eqe(yoc.k0));
        ConfirmationBottomSheet e = a.e();
        e.setTargetController(this);
        uu3 uu3 = this;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        znc znc = null;
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        e.z0(this);
        if (znc != null) {
            coc coc = new coc(e, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    public final void T0() {
        e52 e52 = (e52) P0().Y0.a.getValue();
        if (e52 != null) {
            MessageWriteWidget G02 = G0();
            if (G02 != null) {
                G02.m();
            }
            E0().setVisibility(0);
            boolean Q02 = Q0();
            bc7[] bc7Arr = k1;
            if (Q02) {
                zmf.l(L0(), (q42) null);
                zmf.l(z0(), (q42) null);
                zmf.l((w12) this.M0.T0(this, bc7Arr[7]), (q42) null);
                zmf.l(O0(), (q42) null);
            }
            hc8 hc8 = this.U0;
            if (hc8 != null && hc8.l) {
                xz8.y(F0(), true, false, 2);
            }
            j03 j03 = (j03) this.R0.T0(this, bc7Arr[12]);
            if (!tpa.f(j03.c(), "media_bar_controller")) {
                MediaBarWidget mediaBarWidget = new MediaBarWidget(this.L0, e52.a, (z84) null);
                mediaBarWidget.c1 = this;
                coc coc = new coc(mediaBarWidget, (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("media_bar_controller");
                j03.a.R(coc);
            }
            p58 p58 = (p58) this.D0.getValue();
            Long l = (Long) p58.b.invoke();
            if (l == null) {
                p58.t0.n(d48.a);
                return;
            }
            vxd S = j47.S(p58.a, ((w9a) ((kke) p58.Y.getValue())).b(), vx3.b, new f58(p58, l, (Continuation) null));
            p58.G0.o1(p58, p58.I0[0], S);
        }
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m47getScopeIdIluPPks() {
        return this.L0;
    }

    public final bvc getScreenDelegate() {
        return this.o;
    }

    public final void h(int i, Bundle bundle) {
        if (!C0().g(i)) {
            rq2 P02 = P0();
            P02.getClass();
            if (i == t8a.r || i == t8a.s) {
                e52 e52 = (e52) P02.Y0.a.getValue();
                if (e52 != null) {
                    pnf.n(P02, ((w9a) P02.u()).b(), (vx3) null, new np2(P02, e52.a, (Continuation) null), 2);
                }
            } else if (i == xoc.n0 || i == xoc.o0 || i == xoc.m0 || i == xoc.p0) {
                j47.T(P02.a, (lx3) null, (vx3) null, new jp2(P02, i, (Continuation) null), 3);
            } else if (i == xoc.r0) {
                pnf.o(P02.b1, new xo2(bundle != null ? bundle.getBoolean("forward_cancel_stay_on_screen") : false));
            }
        }
    }

    public final boolean handleBack() {
        if (getView() == null || !N0().b()) {
            jac jac = (jac) this.K0.getValue();
            if (((Boolean) jac.Y.getValue()).booleanValue()) {
                pnf.o(jac.c, cac.a);
                return true;
            } else if (F0().v() != null) {
                S0(false);
                return true;
            } else {
                MessageWriteWidget G02 = G0();
                CharSequence charSequence = null;
                if (!(G02 == null || G02.getView() == null)) {
                    charSequence = G02.q0().getText();
                }
                boolean handleBack = super.handleBack();
                if (!handleBack) {
                    R0(charSequence);
                }
                View view = getView();
                if (view != null) {
                    view.requestApplyInsets();
                }
                return handleBack;
            }
        } else {
            g39 H02 = H0();
            pnf.o(H02.s0, w29.a);
            return true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        ((hw7) this.Y0.getValue()).a(this.Z0);
    }

    public final void onActivityResumed(Activity activity) {
        if (isAttached()) {
            ((hw7) this.Y0.getValue()).b(this.Z0);
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new qq0(4, this));
        } else if (qqe.c(N0().getTitle())) {
            w0(this, N0(), true);
        }
        getRouter().a(this.s0);
        Bundle bundle = this.j1;
        if (bundle != null) {
            this.j1 = null;
            onUpdateArgs(getArgs().deepCopy(), bundle);
        }
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        av3 av32 = av3.POP_ENTER;
        je7 je7 = this.Y0;
        gw7 gw7 = this.Z0;
        if (av3 == av32 || av3 == av3.PUSH_ENTER) {
            ((hw7) je7.getValue()).b(gw7);
        } else if (av3 == av3.PUSH_EXIT) {
            if (getView() != null) {
                int i = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.H(requireActivity());
                }
            }
            J0().q();
            ((hw7) je7.getValue()).a(gw7);
        }
    }

    public final void onContextAvailable(Context context) {
        od2.L(new zn5(P0().e1, new un2((Continuation) null, this), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gn2 gn2 = new gn2(this, 0);
        pge pge = new pge(getContext());
        pge.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        gn2.invoke(pge);
        return pge;
    }

    public final void onDestroy() {
        ((xp7) to2.a.getAccessor().c(xp7.class)).f.k = null;
        super.onDestroy();
    }

    public final void onDestroyView(View view) {
        Drawable background = ((View) this.d1.T0(this, k1[21])).getBackground();
        if (background != null) {
            background.setCallback((Drawable.Callback) null);
        }
        this.i1 = null;
        hc8 hc8 = this.U0;
        if (hc8 != null) {
            hc8.a();
        }
        this.U0 = null;
        this.Z0.b();
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        R0((CharSequence) null);
        getRouter().K(this.s0);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C0().b(i, strArr, iArr);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        yy8 yy8;
        super.onUpdateArgs(bundle, bundle2);
        if (isAttached()) {
            long[] w = i24.w("forward_msg_ids", bundle2);
            bc7[] bc7Arr = k1;
            bc7 bc7 = bc7Arr[4];
            fs fsVar = this.x0;
            fsVar.b(this, w);
            Long v = i24.v("forward_attach_id", bundle2);
            bc7 bc72 = bc7Arr[5];
            fs fsVar2 = this.y0;
            fsVar2.b(this, v);
            Boolean u = i24.u("is_forward_attach", bundle2);
            boolean booleanValue = u != null ? u.booleanValue() : false;
            bc7 bc73 = bc7Arr[6];
            Boolean valueOf = Boolean.valueOf(booleanValue);
            fs fsVar3 = this.z0;
            fsVar3.b(this, valueOf);
            bc7 bc74 = bc7Arr[4];
            long[] jArr = (long[]) fsVar.a(this);
            String str = null;
            if (jArr != null) {
                Set n0 = ys.n0(jArr);
                bc7 bc75 = bc7Arr[5];
                bc7 bc76 = bc7Arr[6];
                yy8 = new yy8(n0, (Long) fsVar2.a(this), ((Boolean) fsVar3.a(this)).booleanValue());
            } else {
                yy8 = null;
            }
            F0().Q0.setValue(yy8);
            String string = bundle2.getString(ApiProtocol.PARAM_PAYLOAD);
            if (string != null) {
                rq2 P02 = P0();
                P02.b = string;
                P02.z();
            }
            coc coc = (coc) x53.q0(I0().e());
            uu3 uu3 = coc != null ? coc.a : null;
            MessagesListWidget messagesListWidget = uu3 instanceof MessagesListWidget ? (MessagesListWidget) uu3 : null;
            if (messagesListWidget != null) {
                Bundle deepCopy = messagesListWidget.getArgs().deepCopy();
                if (bundle2.containsKey("from_forward")) {
                    messagesListWidget.getArgs().putBoolean("ARG_SKIP_UNREAD_DECOR", i24.A("from_forward", bundle2));
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                }
                if (bundle2.containsKey("message_id")) {
                    Bundle args = messagesListWidget.getArgs();
                    Object obj = bundle2.get("message_id");
                    if (obj != null) {
                        str = obj.toString();
                    }
                    args.putString("ARG_LOAD_MESSAGE_ID", str);
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                } else if (bundle2.containsKey("load_mark")) {
                    Bundle args2 = messagesListWidget.getArgs();
                    Object obj2 = bundle2.get("load_mark");
                    if (obj2 != null) {
                        str = obj2.toString();
                    }
                    args2.putString("ARG_LOAD_MARK", str);
                    messagesListWidget.onUpdateArgs(deepCopy, messagesListWidget.getArgs());
                }
            }
        } else if (!bundle.equals(bundle2)) {
            this.j1 = bundle2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0051, code lost:
        r1 = (defpackage.uy8) r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22) {
        /*
            r21 = this;
            r8 = r21
            pg7 r0 = r21.getViewLifecycleScope()
            rn2 r1 = new rn2
            r9 = 0
            r1.<init>(r9, r8)
            r10 = 3
            defpackage.j47.T(r0, r9, r9, r1, r10)
            hc8 r0 = new hc8
            r1 = 14
            bc7[] r20 = k1
            r1 = r20[r1]
            q7c r2 = r8.T0
            java.lang.Object r1 = r2.T0(r8, r1)
            r12 = r1
            znc r12 = (defpackage.znc) r12
            r1 = 13
            r1 = r20[r1]
            q7c r2 = r8.S0
            java.lang.Object r1 = r2.T0(r8, r1)
            r13 = r1
            w12 r13 = (defpackage.w12) r13
            w12 r14 = r21.z0()
            fn2 r15 = new fn2
            r1 = 6
            r15.<init>(r8, r1)
            boolean r16 = r21.Q0()
            pg7 r17 = r21.getViewLifecycleScope()
            xz8 r1 = r21.F0()
            w7c r1 = r1.B0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            p35 r1 = (defpackage.p35) r1
            r7 = 0
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r1.a
            uy8 r1 = (defpackage.uy8) r1
            if (r1 == 0) goto L_0x005a
            int r1 = r1.a
            goto L_0x005b
        L_0x005a:
            r1 = r7
        L_0x005b:
            r6 = 1
            r5 = 2
            if (r1 != r5) goto L_0x0062
            r18 = r6
            goto L_0x0064
        L_0x0062:
            r18 = r7
        L_0x0064:
            fn2 r1 = new fn2
            r2 = 7
            r1.<init>(r8, r2)
            r11 = r0
            r19 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.U0 = r0
            je7 r0 = r8.I0
            java.lang.Object r1 = r0.getValue()
            cc8 r1 = (defpackage.cc8) r1
            w7c r1 = r1.Z
            t03 r2 = new t03
            r3 = 11
            r2.<init>(r1, r3)
            mn2 r3 = new mn2
            r3.<init>(r1, r9, r8)
            zn5 r1 = new zn5
            r4 = 5
            r1.<init>(r2, r3, r4)
            xk1 r2 = new xk1
            r3 = 13
            r2.<init>(r1, r3)
            pg7 r1 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r1)
            java.lang.Object r0 = r0.getValue()
            cc8 r0 = (defpackage.cc8) r0
            s35 r11 = r0.X
            lq0 r12 = new lq0
            java.lang.Class<one.me.chatscreen.ChatScreen> r3 = one.me.chatscreen.ChatScreen.class
            java.lang.String r4 = "handleMediaKeyboardEvents"
            r1 = 2
            java.lang.String r13 = "handleMediaKeyboardEvents(Lone/me/sdk/arch/event/Event;)V"
            r14 = 4
            r15 = 9
            r0 = r12
            r2 = r21
            r16 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            r14 = r7
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            zn5 r0 = new zn5
            r1 = 5
            r0.<init>(r11, r12, r1)
            pg7 r1 = r21.getViewLifecycleScope()
            defpackage.od2.L(r0, r1)
            xz8 r0 = r21.F0()
            w7c r0 = r0.D0
            t03 r1 = new t03
            r2 = 11
            r1.<init>(r0, r2)
            on2 r2 = new on2
            r2.<init>(r0, r9, r8)
            zn5 r0 = new zn5
            r3 = 5
            r0.<init>(r1, r2, r3)
            xk1 r1 = new xk1
            r2 = 14
            r1.<init>(r0, r2)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r1, r0)
            xz8 r0 = r21.F0()
            w7c r0 = r0.B0
            eh7 r1 = r8.lifecycleOwner
            gh7 r1 = r1.Q()
            fg7 r11 = defpackage.fg7.o
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            t03 r1 = new t03
            r2 = 11
            r1.<init>(r0, r2)
            qn2 r0 = new qn2
            r0.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r1, r0, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            hzc r0 = r21.J0()
            w7c r0 = r0.Z
            jn2 r1 = new jn2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            pg7 r0 = r21.getViewLifecycleScope()
            ln2 r1 = new ln2
            r1.<init>(r9, r8)
            defpackage.j47.T(r0, r9, r9, r1, r10)
            r0 = r20[r16]
            fs r0 = r8.v0
            java.lang.Object r1 = r0.a(r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x016b
            hzc r1 = r21.J0()
            r2 = r20[r16]
            java.lang.Object r0 = r0.a(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.r(r0)
            android.os.Bundle r0 = r21.getArgs()
            java.lang.String r1 = "open_search_field"
            r0.remove(r1)
        L_0x016b:
            rq2 r0 = r21.P0()
            ac r0 = r0.c1
            hzc r1 = r21.J0()
            w7c r1 = r1.Y
            xh0 r2 = new xh0
            r3 = 3
            r2.<init>((int) r10, (kotlin.coroutines.Continuation) r9, (int) r3)
            j31 r3 = new j31
            r4 = 4
            r3.<init>(r0, r1, r2, r4)
            mn5 r0 = defpackage.od2.x(r3)
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            tn2 r1 = new tn2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            java.lang.String r0 = defpackage.v3c.w(r21)
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            fg7 r1 = r1.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onViewCreated: viewstate="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            rq2 r0 = r21.P0()
            w7c r0 = r0.X0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            bo2 r1 = new bo2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            rq2 r0 = r21.P0()
            w7c r0 = r0.Z0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            co2 r1 = new co2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            rq2 r0 = r21.P0()
            s35 r0 = r0.b1
            fg7 r1 = defpackage.fg7.c
            eh7 r2 = r21.getViewLifecycleOwner()
            gh7 r2 = r2.Q()
            kq1 r0 = defpackage.tu0.g(r0, r2, r1)
            xn2 r1 = new xn2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            rq2 r0 = r21.P0()
            kld r0 = r0.a1
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            do2 r1 = new do2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            xz8 r0 = r21.F0()
            w7c r0 = r0.H0
            t03 r1 = new t03
            r2 = 11
            r1.<init>(r0, r2)
            ko2 r2 = new ko2
            r2.<init>(r0, r9, r8)
            zn5 r0 = new zn5
            r3 = 5
            r0.<init>(r1, r2, r3)
            xk1 r1 = new xk1
            r2 = 16
            r1.<init>(r0, r2)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r1, r0)
            xz8 r0 = r21.F0()
            s35 r0 = r0.T0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            eo2 r1 = new eo2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            je7 r0 = r8.D0
            java.lang.Object r0 = r0.getValue()
            p58 r0 = (defpackage.p58) r0
            s35 r0 = r0.w0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            fo2 r1 = new fo2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            rq2 r0 = r21.P0()
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x02f6
            xz8 r0 = r21.F0()
            w7c r0 = r0.L0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            go2 r1 = new go2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
        L_0x02f6:
            g39 r0 = r21.H0()
            s35 r0 = r0.t0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            ho2 r1 = new ho2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            xz8 r0 = r21.F0()
            s35 r0 = r0.z0
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            io2 r1 = new io2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            r0 = 20
            r0 = r20[r0]
            q7c r1 = r8.c1
            java.lang.Object r0 = r1.T0(r8, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            znc r0 = r8.getChildRouter(r0)
            r0.e = r13
            r0.Q(r14)
            boolean r1 = r0.n()
            if (r1 != 0) goto L_0x0367
            one.me.pinbars.PinBarsWidget r1 = new one.me.pinbars.PinBarsWidget
            java.lang.String r2 = r8.L0
            r1.<init>(r2, r9)
            coc r1 = defpackage.i24.e(r1, r9, r9)
            r0.R(r1)
        L_0x0367:
            g39 r0 = r21.H0()
            w7c r0 = r0.Z
            t03 r1 = new t03
            r2 = 11
            r1.<init>(r0, r2)
            eh7 r0 = r21.getViewLifecycleOwner()
            gh7 r0 = r0.Q()
            kq1 r0 = defpackage.tu0.g(r1, r0, r11)
            jo2 r1 = new jo2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            je7 r0 = r8.H0
            java.lang.Object r0 = r0.getValue()
            zz7 r0 = (defpackage.zz7) r0
            s35 r0 = r0.c
            t03 r10 = new t03
            r1 = 11
            r10.<init>(r0, r1)
            lq0 r12 = new lq0
            java.lang.String r5 = "showAddLinkBottomsheet(Lone/me/sdk/messagewrite/markdown/AddLinkState;)V"
            r6 = 4
            r1 = 2
            java.lang.Class<one.me.chatscreen.ChatScreen> r3 = one.me.chatscreen.ChatScreen.class
            java.lang.String r4 = "showAddLinkBottomsheet"
            r7 = 10
            r0 = r12
            r2 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            zn5 r0 = new zn5
            r1 = 5
            r0.<init>(r10, r12, r1)
            pg7 r1 = r21.getViewLifecycleScope()
            defpackage.od2.L(r0, r1)
            je7 r0 = r8.K0
            java.lang.Object r1 = r0.getValue()
            jac r1 = (defpackage.jac) r1
            s35 r1 = r1.b
            eh7 r2 = r21.getViewLifecycleOwner()
            gh7 r2 = r2.Q()
            kq1 r1 = defpackage.tu0.g(r1, r2, r11)
            yn2 r2 = new yn2
            r2.<init>(r9, r8)
            zn5 r3 = new zn5
            r4 = 5
            r3.<init>(r1, r2, r4)
            pg7 r1 = r21.getViewLifecycleScope()
            defpackage.od2.L(r3, r1)
            java.lang.Object r1 = r0.getValue()
            jac r1 = (defpackage.jac) r1
            w7c r1 = r1.t0
            eh7 r2 = r21.getViewLifecycleOwner()
            gh7 r2 = r2.Q()
            kq1 r1 = defpackage.tu0.g(r1, r2, r11)
            zn2 r2 = new zn2
            r2.<init>(r9, r8)
            zn5 r3 = new zn5
            r4 = 5
            r3.<init>(r1, r2, r4)
            pg7 r1 = r21.getViewLifecycleScope()
            defpackage.od2.L(r3, r1)
            java.lang.Object r0 = r0.getValue()
            jac r0 = (defpackage.jac) r0
            w7c r0 = r0.Z
            eh7 r1 = r21.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r11)
            ao2 r1 = new ao2
            r1.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r0, r1, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            je7 r0 = r8.G0
            java.lang.Object r0 = r0.getValue()
            yce r0 = (defpackage.yce) r0
            w7c r0 = r0.D0
            t03 r1 = new t03
            r2 = 11
            r1.<init>(r0, r2)
            sn2 r0 = new sn2
            r0.<init>(r9, r8)
            zn5 r2 = new zn5
            r3 = 5
            r2.<init>(r1, r0, r3)
            pg7 r0 = r21.getViewLifecycleScope()
            defpackage.od2.L(r2, r0)
            rq2 r0 = r21.P0()
            r0.getClass()
            java.lang.Class<rq2> r1 = defpackage.rq2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "restore draft"
            defpackage.hm9.m(r1, r2, new java.lang.Object[0])
            kke r1 = r0.u()
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            vx3 r2 = defpackage.vx3.b
            tp2 r3 = new tp2
            r3.<init>(r0, r9)
            kotlinx.coroutines.internal.ContextScope r4 = r0.a
            vxd r1 = defpackage.j47.S(r4, r1, r2, r3)
            bc7[] r2 = defpackage.rq2.f1
            r3 = 10
            r2 = r2[r3]
            w4d r3 = r0.V0
            r3.o1(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.onViewCreated(android.view.View):void");
    }

    public final void p0() {
        R0((CharSequence) null);
    }

    public final void r0() {
        mr0.G(this);
    }

    public final Long t0() {
        return 400L;
    }

    public final void y(int i, Bundle bundle) {
        e52 e52;
        if (i == xoc.J0) {
            if (bundle != null) {
                long j = bundle.getLong("contact_id");
                C0().l(j, true, new w21(j, 3));
            }
        } else if (i == xoc.H0) {
            K0().d();
        } else if (i == xoc.G0) {
            P0().x();
        } else if (i == xoc.F0) {
            rq2 P02 = P0();
            P02.getClass();
            pnf.n(P02, (lx3) null, (vx3) null, new qq2(P02, (Continuation) null), 3);
        } else if (i == xoc.E0) {
            if (bundle != null) {
                long j2 = bundle.getLong("chat_server_id");
                f64 P1 = vo2.c.P1();
                P1.b(":settings/folder/by-chat?id=" + j2, (Bundle) null);
            }
        } else if (i == xoc.I0 && (e52 = (e52) P0().Y0.a.getValue()) != null) {
            f64 P12 = vo2.c.P1();
            P12.b(":profile/invite?id=" + e52.a, (Bundle) null);
        }
    }

    public final void y0() {
        ViewGroup L02 = L0();
        if (Q0()) {
            br7.d(L02, new x27(0, new yq0(4, 2, true), 1), (m56) null);
        }
        w12 z02 = z0();
        if (Q0()) {
            br7.d(z02, new x27(0, new yq0(4, 2, true), 1), (m56) null);
        }
        w12 w12 = (w12) this.M0.T0(this, k1[7]);
        if (Q0()) {
            br7.d(w12, new x27(0, new yq0(1, 2, true), 1), (m56) null);
        }
        w12 O02 = O0();
        if (Q0()) {
            br7.d(O02, new x27(0, new yq0(4, 2, true), 1), (m56) null);
        }
    }

    public final w12 z0() {
        return (w12) this.O0.T0(this, k1[9]);
    }
}
