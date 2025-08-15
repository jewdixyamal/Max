package one.me.messages.list.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0015\u0016\u0017\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014¨\u0006\u0019"}, d2 = {"Lone/me/messages/list/ui/MessagesListWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "parentScope", "", "chatId", "loadMark", "", "", "highlights", "loadMessageId", "", "shouldHighlightMessage", "shouldSkipUnreadDecoration", "(Ljava/lang/String;JJLjava/util/List;JZZLz84;)V", "kc8", "s59", "t59", "r59", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MessagesListWidget extends Widget implements ng3, xt3 {
    public static final /* synthetic */ bc7[] X0;
    public final m29 A0;
    public final je7 B0;
    public dxc C0;
    public final q7c D0;
    public final q7c E0;
    public r5f F0;
    public f34 G0;
    public h8e H0;
    public gw7 I0;
    public final w4d J0;
    public final qm0 K0;
    public final qm0 L0;
    public final kc8 M0;
    public final s59 N0;
    public final t59 O0;
    public final je7 P0;
    public final je7 Q0;
    public final qm0 R0;
    public final qm0 S0;
    public final qm0 T0;
    public final qm0 U0;
    public c05 V0;
    public y6c W0;
    public final fs X;
    public final fs Y;
    public final je7 Z;
    public final String a;
    public final String b;
    public final fs c;
    public final fs o;
    public final z3b s0;
    public final je7 t0;
    public final khe u0;
    public final je7 v0;
    public final je7 w0;
    public final mk6 x0;
    public vge y0;
    public t69 z0;

    static {
        Class<MessagesListWidget> cls = MessagesListWidget.class;
        X0 = new bc7[]{new hob(cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), rh4.g(nec.a, cls, "selectedMessageIdsForAction", "getSelectedMessageIdsForAction()[J"), new oi9(cls, "currentReadMark", "getCurrentReadMark()J"), new oi9(cls, "isLastMsgCompletelyVisibleOnDetach", "isLastMsgCompletelyVisibleOnDetach()Z"), new oi9(cls, "shouldSkipUnreadDecoration", "getShouldSkipUnreadDecoration()Z"), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hob(cls, "scrollButtonsContainer", "getScrollButtonsContainer()Lone/me/messages/list/ui/view/scroll/ScrollButtonsContainer;", 0), new oi9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new hob(cls, "messagesListRecyclerViewAnalyticsListener", "getMessagesListRecyclerViewAnalyticsListener()Lone/me/messages/list/ui/recycler/MessagesListRecyclerViewAnalyticsListener;", 0), new hob(cls, "prefetchReactionsScrollListener", "getPrefetchReactionsScrollListener()Lru/ok/onechat/reactions/PrefetchReactionsScrollListener;", 0), new hob(cls, "messagesLayoutManager", "getMessagesLayoutManager()Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", 0), new hob(cls, "messagesScroller", "getMessagesScroller()Lone/me/messages/list/ui/scroll/MessagesScroller;", 0), new hob(cls, "emptyStateContainer", "getEmptyStateContainer()Landroid/widget/FrameLayout;", 0), new hob(cls, "reactionEffectsView", "getReactionEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;", 0)};
    }

    public MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("ARG_CHAT_ID", Long.valueOf(j)), new kpa("ARG_LOAD_MARK", Long.valueOf(j2)), new kpa("ARG_LOAD_MESSAGE_ID", Long.valueOf(j3)), new kpa("ARG_HIGHLIGHTS", list), new kpa("ARG_HIGHLIGHT_MESSAGE", Boolean.valueOf(z)), new kpa("ARG_SKIP_UNREAD_DECOR", Boolean.valueOf(z2))));
    }

    public static final void m0(MessagesListWidget messagesListWidget, String str, lk7 lk7, long j) {
        if (messagesListWidget.x0().A().d()) {
            messagesListWidget.x0().A().e(j);
            return;
        }
        int ordinal = lk7.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                g39 v02 = messagesListWidget.v0();
                v02.getClass();
                pnf.o(v02.t0, new c39(str));
                return;
            } else if (ordinal == 4) {
                messagesListWidget.x0().F(str);
                return;
            } else if (ordinal != 6) {
                return;
            }
        }
        messagesListWidget.x0().E(str);
    }

    public static final void n0(MessagesListWidget messagesListWidget, nu8 nu8, long j) {
        if (messagesListWidget.x0().A().d()) {
            messagesListWidget.x0().A().e(j);
            return;
        }
        if (u59.$EnumSwitchMapping$2[nu8.c.ordinal()] == 1) {
            long j2 = nu8.a;
            if (j2 <= 0) {
                messagesListWidget.x0().F(nu8.b);
            } else {
                messagesListWidget.x0().G(j2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o0(one.me.messages.list.ui.MessagesListWidget r5, defpackage.bxc r6) {
        /*
            java.lang.String r0 = r5.a
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0007
            goto L_0x0021
        L_0x0007:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0021
            us7 r2 = defpackage.us7.X
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Got new scrollState="
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x0021:
            t59 r0 = r5.O0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r5.u0()
            boolean r2 = r0.c
            r3 = 0
            if (r2 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r0.b(r1, r3, r3)
        L_0x0030:
            rwc r0 = r5.w0()
            lwc r1 = defpackage.lwc.a
            int r2 = r6.a
            iwc r0 = r0.d(r1)
            r0.setCounter(r2)
            boolean r0 = r6.b
            if (r0 == 0) goto L_0x004b
            rwc r0 = r5.w0()
            r0.c(r1)
            goto L_0x0052
        L_0x004b:
            rwc r0 = r5.w0()
            r0.b(r1)
        L_0x0052:
            boolean r0 = r6.c
            lwc r1 = defpackage.lwc.b
            if (r0 == 0) goto L_0x0072
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r5.u0()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = defpackage.z7.l(r0, r2)
            boolean r0 = defpackage.z7.H(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0072
            rwc r0 = r5.w0()
            r0.c(r1)
            goto L_0x0079
        L_0x0072:
            rwc r0 = r5.w0()
            r0.b(r1)
        L_0x0079:
            axc r0 = r6.d
            lwc r1 = defpackage.lwc.c
            if (r0 != 0) goto L_0x0087
            rwc r5 = r5.w0()
            r5.b(r1)
            goto L_0x00aa
        L_0x0087:
            s59 r0 = r5.N0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r5.u0()
            r4 = -1
            r0.a = r4
            r0.b = r4
            r0.b(r2, r3, r3)
            axc r6 = r6.d
            long r2 = r6.b
            m89 r6 = r5.s0()
            boolean r6 = r6.a(r2)
            if (r6 != 0) goto L_0x00aa
            rwc r5 = r5.w0()
            r5.c(r1)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.o0(one.me.messages.list.ui.MessagesListWidget, bxc):void");
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m67getScopeIdIluPPks() {
        return this.b;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            je7 r0 = r9.v0
            java.lang.Object r0 = r0.getValue()
            rg1 r0 = (defpackage.rg1) r0
            boolean r0 = r0.g(r10)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            if (r11 == 0) goto L_0x00a9
            java.lang.String r0 = "selected.messageIds.Action"
            long[] r0 = r11.getLongArray(r0)
            if (r0 != 0) goto L_0x001b
            goto L_0x00a9
        L_0x001b:
            int r1 = defpackage.mda.S
            if (r10 != r1) goto L_0x009e
            int r10 = r0.length
            r1 = 0
            if (r10 != 0) goto L_0x0025
            r4 = r1
            goto L_0x002d
        L_0x0025:
            r10 = 0
            r2 = r0[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r4 = r10
        L_0x002d:
            java.lang.String r10 = "bot.shareContact.confirm.keyboardId"
            java.lang.String r5 = r11.getString(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            java.lang.String r2 = "bot.shareContact.confirm.button"
            java.lang.Class<fv0> r3 = defpackage.fv0.class
            if (r10 < r0) goto L_0x0042
            java.io.Serializable r2 = defpackage.ou0.d(r11, r2, r3)
            goto L_0x004e
        L_0x0042:
            java.io.Serializable r2 = r11.getSerializable(r2)
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            r7 = r2
            fv0 r7 = (defpackage.fv0) r7
            java.lang.String r2 = "bot.shareContact.confirm.buttonPosition"
            java.lang.Class<kv0> r3 = defpackage.kv0.class
            if (r10 < r0) goto L_0x005c
            java.io.Serializable r10 = defpackage.ou0.d(r11, r2, r3)
            goto L_0x0068
        L_0x005c:
            java.io.Serializable r10 = r11.getSerializable(r2)
            boolean r11 = r3.isInstance(r10)
            if (r11 == 0) goto L_0x0067
            r1 = r10
        L_0x0067:
            r10 = r1
        L_0x0068:
            r6 = r10
            kv0 r6 = (defpackage.kv0) r6
            n59 r9 = r9.x0()
            r9.getClass()
            if (r4 == 0) goto L_0x00a9
            if (r5 == 0) goto L_0x00a9
            if (r7 == 0) goto L_0x00a9
            if (r6 != 0) goto L_0x007b
            goto L_0x00a9
        L_0x007b:
            kke r10 = r9.Y
            w9a r10 = (defpackage.w9a) r10
            nx3 r10 = r10.b()
            vx3 r11 = defpackage.vx3.b
            f49 r0 = new f49
            r8 = 0
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.internal.ContextScope r1 = r9.a
            vxd r10 = defpackage.j47.S(r1, r10, r11, r0)
            bc7[] r11 = defpackage.n59.D1
            r0 = 4
            r11 = r11[r0]
            w4d r0 = r9.m1
            r0.o1(r9, r11, r10)
            goto L_0x00a9
        L_0x009e:
            n59 r9 = r9.x0()
            java.util.List r11 = defpackage.ys.l0(r0)
            r9.J(r10, r11)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.h(int, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [uu3] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0108, code lost:
        if (((java.lang.Boolean) r8.Y.a(r8)).booleanValue() == false) goto L_0x010c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttach(android.view.View r9) {
        /*
            r8 = this;
            java.lang.String r9 = defpackage.v3c.w(r8)
            java.lang.String r0 = "lifecycle: onAttach"
            defpackage.hm9.m(r9, r0, new java.lang.Object[0])
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r9 = r8.u0()
            o59 r0 = new o59
            r1 = 0
            r0.<init>(r8, r1)
            dxc r1 = new dxc
            r1.<init>(r0)
            r1.v(r9)
            r8.C0 = r1
            n7c r9 = r8.t0()
            ru.ok.onechat.reactions.ReactionsViewModel r9 = r9.q()
            r9.getClass()
            java.lang.String r0 = "ru.ok.onechat.reactions.ReactionsViewModel"
            java.lang.String r1 = "runChatSubscribeNotifObserving"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            k43 r0 = defpackage.f46.R(r9)
            je7 r1 = r9.k
            java.lang.Object r1 = r1.getValue()
            p94 r1 = (defpackage.p94) r1
            nx3 r1 = r1.a
            i7c r2 = new i7c
            r3 = 0
            r2.<init>(r9, r3)
            r9 = 2
            defpackage.j47.T(r0, r1, r3, r2, r9)
            r9 = 9
            bc7[] r0 = X0
            r9 = r0[r9]
            qm0 r9 = r8.L0
            java.lang.Object r9 = r9.getValue()
            j7b r9 = (defpackage.j7b) r9
            m29 r1 = r8.A0
            java.util.ArrayList r2 = r1.x0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.z53.S(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0068:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r5 = r2.next()
            one.me.messages.list.loader.MessageModel r5 = (one.me.messages.list.loader.MessageModel) r5
            long r5 = r5.b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.add(r5)
            goto L_0x0068
        L_0x007e:
            r9.getClass()
            int r2 = r4.size()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = defpackage.j7b.n
            java.lang.String r6 = "setIdsForInvalidate %s"
            defpackage.hm9.m(r5, r6, r2)
            java.lang.String r2 = "clear"
            defpackage.hm9.m(r5, r2, new java.lang.Object[0])
            java.util.HashSet r2 = r9.k
            r2.clear()
            gi9 r2 = r9.f
            r2.c()
            gi9 r2 = r9.e
            r2.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x00ac:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c0
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r2.a(r5)
            goto L_0x00ac
        L_0x00c0:
            r2 = 1
            r9.g = r2
            bc7[] r4 = defpackage.j7b.m
            r5 = 0
            r4 = r4[r5]
            yj r4 = r9.l
            java.lang.Object r4 = r4.b
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 != 0) goto L_0x00d1
            goto L_0x00db
        L_0x00d1:
            do9 r6 = new do9
            r7 = 12
            r6.<init>(r9, r7, r4)
            r4.post(r6)
        L_0x00db:
            z3b r9 = r8.s0
            t50 r9 = r9.b
            r9.Y = r2
            r9.d()
            n59 r9 = r8.x0()
            r4 = 3
            r4 = r0[r4]
            fs r4 = r8.X
            java.lang.Object r4 = r4.a(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x010b
            r4 = 4
            r0 = r0[r4]
            fs r0 = r8.Y
            java.lang.Object r0 = r0.a(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r2 = r5
        L_0x010c:
            iv r0 = r1.o
            java.util.List r4 = r0.f
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0123
            java.util.List r0 = r0.f
            int r0 = defpackage.y53.L(r0)
            java.lang.Object r0 = r1.C(r0)
            ol7 r0 = (defpackage.ol7) r0
            goto L_0x0124
        L_0x0123:
            r0 = r3
        L_0x0124:
            boolean r1 = r0 instanceof one.me.messages.list.loader.MessageModel
            if (r1 == 0) goto L_0x012b
            one.me.messages.list.loader.MessageModel r0 = (one.me.messages.list.loader.MessageModel) r0
            goto L_0x012c
        L_0x012b:
            r0 = r3
        L_0x012c:
            w5f r1 = r9.D()
            h39 r4 = new h39
            r4.<init>((defpackage.n59) r9, (boolean) r2, (one.me.messages.list.loader.MessageModel) r0)
            r1.b(r5, r4)
            n59 r9 = r8.x0()
            uu3 r8 = r8.getParentController()
            boolean r0 = r8 instanceof defpackage.r59
            if (r0 == 0) goto L_0x0147
            r3 = r8
            r59 r3 = (defpackage.r59) r3
        L_0x0147:
            if (r3 == 0) goto L_0x014f
            one.me.chatscreen.ChatScreen r3 = (one.me.chatscreen.ChatScreen) r3
            int r5 = r3.A0()
        L_0x014f:
            r9.C1 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.onAttach(android.view.View):void");
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        MessageModel L;
        super.onChangeStarted(zu3, av3);
        if (!av3.a && !av3.b && getView() != null) {
            int l = z7.l(u0(), 0.3f);
            Integer valueOf = Integer.valueOf(l);
            if (l == -1) {
                valueOf = null;
            }
            if (valueOf != null && (L = this.A0.L(valueOf.intValue())) != null) {
                x0().I(L);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        o59 o59 = new o59(this, 1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        o59.invoke(frameLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        gdf p0 = p0();
        cj0 cj0 = (cj0) ((af8) this.P0.getValue());
        if (p0 != null) {
            cj0.g.remove(p0);
        } else {
            cj0.getClass();
        }
        y6c y6c = this.W0;
        if (y6c != null) {
            y6c.f.clear();
            y6c.e.clear();
            y6c.b.b();
        }
        this.W0 = null;
        this.V0 = null;
        mk6 mk6 = this.x0;
        mk6.c = false;
        mk6.d = null;
        mk6.b.clear();
        t0().q().f();
        vge vge = this.y0;
        if (vge == null) {
            vge = null;
        }
        je7 je7 = vge.B0;
        if (je7.a()) {
            ((go0) vge.u0.getValue()).e(je7.getValue());
        }
        t69 t69 = this.z0;
        if (t69 == null) {
            t69 = null;
        }
        t69.i((RecyclerView) null);
        EndlessRecyclerView2 u02 = u0();
        bc7 bc7 = X0[8];
        u02.q0((v29) this.K0.getValue());
        r0().K.b();
        fn5 fn5 = (fn5) this.B0.getValue();
        fn5.s0 = false;
        try {
            u02.p0(fn5);
        } catch (Throwable th) {
            hm9.l0(fn5.class.getName(), "fail to detach", th);
        }
        fn5.t0 = null;
        u02.setPager((t15) null);
        r5f r5f = this.F0;
        if (r5f != null) {
            u02.p0(r5f);
        }
        this.F0 = null;
        h8e h8e = this.H0;
        if (h8e != null) {
            ty2 ty2 = h8e.o;
            d8e d8e = (d8e) ty2.Z;
            if (d8e != null) {
                ((hdc) ty2.b).B(d8e);
            }
            ty2.Z = null;
            f8e f8e = h8e.u0;
            if (f8e != null) {
                h8e.b.B(f8e);
            }
            h8e.u0 = null;
        }
        h8e h8e2 = this.H0;
        if (h8e2 != null) {
            u02.p0(h8e2);
        }
        this.H0 = null;
        this.G0 = null;
        u02.setAdapter((hdc) null);
        u02.setDelegate((v15) null);
    }

    public final void onDetach(View view) {
        k92 k92;
        bc7[] bc7Arr = X0;
        bc7 bc7 = bc7Arr[4];
        this.Y.b(this, Boolean.FALSE);
        dxc dxc = this.C0;
        if (dxc != null) {
            dxc.B(u0());
        }
        gdf p0 = p0();
        p0.f = null;
        p0.s.j(-1);
        t50 t50 = this.s0.b;
        t50.Y = false;
        if (t50.X) {
            t50.X = false;
            jpb jpb = t50.b;
            jpb.b();
            jpb.h.remove(t50.Z);
        }
        EndlessRecyclerView2 u02 = u0();
        boolean H = z7.H(u02, z7.l(u02, 1.0f));
        bc7 bc72 = bc7Arr[3];
        this.X.b(this, Boolean.valueOf(H));
        n59 x02 = x0();
        e52 e52 = (e52) x02.o1.a.getValue();
        if (e52 == null || (k92 = e52.b) == null || k92.m <= 0) {
            w5f D = x02.D();
            bc7[] bc7Arr2 = w5f.j;
            D.b(true, new bse(4));
        }
    }

    public final void onDismiss() {
        bc7[] bc7Arr = X0;
        x77 x77 = (x77) this.J0.T0(this, bc7Arr[7]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        bc7 bc7 = bc7Arr[1];
        this.c.b(this, (Object) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.v0.getValue()).b(i, strArr, iArr);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        Long f0;
        super.onUpdateArgs(bundle, bundle2);
        boolean z = bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR", false);
        bc7 bc7 = X0[4];
        this.Y.b(this, Boolean.valueOf(z));
        Object obj = bundle.get("ARG_LOAD_MESSAGE_ID");
        Object obj2 = bundle2.get("ARG_LOAD_MESSAGE_ID");
        vx3 vx3 = vx3.b;
        if (obj2 == null || obj2.equals(obj)) {
            Object obj3 = bundle.get("ARG_LOAD_MARK");
            Object obj4 = bundle2.get("ARG_LOAD_MARK");
            if (obj4 != null && !tpa.f(obj3, obj4) && (f0 = dae.f0(obj4.toString())) != null) {
                long longValue = f0.longValue();
                bundle2.remove("ARG_LOAD_MARK");
                l89 B = x0().B();
                bc7[] bc7Arr = l89.p;
                B.getClass();
                B.f(j47.S(B.c, B.b, vx3, new g89(B, longValue, 4, (Continuation) null)));
                return;
            }
            return;
        }
        Long f02 = dae.f0(obj2.toString());
        if (f02 != null) {
            long longValue2 = f02.longValue();
            bundle2.remove("ARG_LOAD_MESSAGE_ID");
            l89 B2 = x0().B();
            B2.getClass();
            B2.f(j47.S(B2.c, B2.b, vx3, new f89(B2, longValue2, (Continuation) null)));
            View view = getView();
            if (view != null) {
                view.post(new r60(this, longValue2, 6));
            }
        }
    }

    public final void onViewCreated(View view) {
        w7c w7c = x0().r1;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new c69((Continuation) null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 u02 = u0();
        bc7[] bc7Arr = X0;
        bc7 bc7 = bc7Arr[13];
        this.W0 = new y6c(u02, (h6c) this.U0.getValue(), new zj7(9, view));
        od2.L(new zn5(tu0.g(x0().B1, getViewLifecycleOwner().Q(), fg7), new s69((Continuation) null, this), 5), getViewLifecycleScope());
        m29 m29 = this.A0;
        if (m29.j() > 0) {
            s0().b();
        }
        EndlessRecyclerView2 u03 = u0();
        bc7 bc72 = bc7Arr[8];
        u03.k((v29) this.K0.getValue());
        bc7 bc73 = bc7Arr[9];
        qm0 qm0 = this.L0;
        j7b j7b = (j7b) qm0.getValue();
        EndlessRecyclerView2 u04 = u0();
        j7b.getClass();
        j7b.l.o1(j7b, j7b.m[0], u04);
        EndlessRecyclerView2 u05 = u0();
        bc7 bc74 = bc7Arr[9];
        u05.m((j7b) qm0.getValue());
        EndlessRecyclerView2 u06 = u0();
        pla.a(u06, new l69(u06, this, 0));
        u0().m(p0());
        r0().t1(new q69(this));
        zn5 zn5 = new zn5(new m58(x0().z1, 9), new r69((Continuation) null, this), 5);
        o19 o19 = o19.a;
        i24.s(od2.F(zn5, ((w9a) o19.getDispatchers()).c()), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(x0().B().o, 11), getViewLifecycleOwner().Q(), fg7), new d69((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(x0().v1, new lq0(2, this, MessagesListWidget.class, "handleNavigationEvents", "handleNavigationEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 22), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(x0().B().n, getViewLifecycleOwner().Q(), fg7.X), new w59((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().c, getViewLifecycleOwner().Q(), fg7), new e69((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().X, getViewLifecycleOwner().Q(), fg7), new f69((Continuation) null, this), 5), getViewLifecycleScope());
        zn5 zn52 = new zn5(v0().s0, new p69((Continuation) null, this), 5);
        pg7 viewLifecycleScope = getViewLifecycleScope();
        j47.T(viewLifecycleScope, (lx3) null, (vx3) null, new ng7(viewLifecycleScope, new lg7(zn52, (Continuation) null), (Continuation) null), 3);
        od2.L(new zn5(tu0.g(x0().u1, getViewLifecycleOwner().Q(), fg7), new g69((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new ap8(new t03(x0().D().f, 11), this, 1), getViewLifecycleOwner().Q(), fg7), new h69((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(t0().q().v, getViewLifecycleOwner().Q(), fg7), new i69((Continuation) null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 u07 = u0();
        eg9 A = x0().A();
        kg9 kg9 = new kg9(u07, m29, A, v0());
        od2.L(new zn5(A.g, new lq0(2, kg9, kg9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 25), 5), getViewLifecycleScope());
        r0().t1(new a69(this, 1));
        od2.L(new zn5(tu0.g(((zaa) o19.getAccessor().c(zaa.class)).a, getViewLifecycleOwner().Q(), fg7), new j69((Continuation) null, this), 5), getViewLifecycleScope());
        gdf p0 = p0();
        ada ada = (ada) ((af8) this.P0.getValue());
        if (p0 != null) {
            ada.g.add(p0);
        }
        if (ada.n.get() && p0 != null) {
            ada.f.post(new b(15, (Object) p0));
        }
        od2.L(new zn5(tu0.g(x0().g1, getViewLifecycleOwner().Q(), fg7), new k69((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final gdf p0() {
        return (gdf) this.Q0.getValue();
    }

    public final FrameLayout q0() {
        bc7 bc7 = X0[12];
        return (FrameLayout) this.T0.getValue();
    }

    public final MessagesLayoutManager r0() {
        bc7 bc7 = X0[10];
        return (MessagesLayoutManager) this.R0.getValue();
    }

    public final m89 s0() {
        bc7 bc7 = X0[11];
        return (m89) this.S0.getValue();
    }

    public final n7c t0() {
        return (n7c) this.u0.getValue();
    }

    public final EndlessRecyclerView2 u0() {
        return (EndlessRecyclerView2) this.D0.T0(this, X0[5]);
    }

    public final g39 v0() {
        return (g39) this.Z.getValue();
    }

    public final rwc w0() {
        return (rwc) this.E0.T0(this, X0[6]);
    }

    public final n59 x0() {
        return (n59) this.t0.getValue();
    }

    /* JADX WARNING: type inference failed for: r11v9, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(int r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            if (r2 == 0) goto L_0x0014
            java.lang.String r4 = "messages:context_menu:message_id"
            long r4 = r2.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0015
        L_0x0014:
            r4 = r3
        L_0x0015:
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0170
            java.lang.String r7 = "messages:context_menu:link_url"
            java.lang.String r2 = r2.getString(r7)
            if (r2 != 0) goto L_0x0022
            return
        L_0x0022:
            int r7 = defpackage.cpc.b
            r8 = 3
            r9 = 2
            je7 r10 = r0.w0
            if (r1 != r7) goto L_0x0100
            android.content.Context r1 = r17.getContext()
            boolean r7 = defpackage.ju0.B(r2)
            if (r7 == 0) goto L_0x003b
            java.lang.String r7 = "mailto:"
            java.lang.String r7 = defpackage.w9e.K0(r2, r7)
            goto L_0x0049
        L_0x003b:
            boolean r7 = defpackage.ju0.C(r2)
            if (r7 == 0) goto L_0x0048
            java.lang.String r7 = "tel:"
            java.lang.String r7 = defpackage.w9e.K0(r2, r7)
            goto L_0x0049
        L_0x0048:
            r7 = r2
        L_0x0049:
            defpackage.tpa.o(r1, r7)
            boolean r1 = defpackage.tpa.s()
            if (r1 == 0) goto L_0x00bc
            boolean r1 = defpackage.ju0.B(r2)
            if (r1 == 0) goto L_0x005a
            r1 = r8
            goto L_0x0063
        L_0x005a:
            boolean r1 = defpackage.ju0.C(r2)
            if (r1 == 0) goto L_0x0062
            r1 = r9
            goto L_0x0063
        L_0x0062:
            r1 = r6
        L_0x0063:
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x0083
            if (r1 == r6) goto L_0x007b
            if (r1 != r9) goto L_0x0075
            int r1 = defpackage.dpc.l
            eqe r7 = new eqe
            r7.<init>(r1)
            goto L_0x008a
        L_0x0075:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007b:
            int r1 = defpackage.dpc.n
            eqe r7 = new eqe
            r7.<init>(r1)
            goto L_0x008a
        L_0x0083:
            int r1 = defpackage.dpc.k
            eqe r7 = new eqe
            r7.<init>(r1)
        L_0x008a:
            wha r1 = new wha
            r1.<init>((one.me.sdk.arch.Widget) r0)
            r1.g(r7)
            kia r7 = new kia
            int r11 = defpackage.woc.n
            r7.<init>(r11)
            r1.e(r7)
            eia r7 = new eia
            uu3 r11 = r17.getParentController()
            boolean r12 = r11 instanceof defpackage.r59
            if (r12 == 0) goto L_0x00a9
            r3 = r11
            r59 r3 = (defpackage.r59) r3
        L_0x00a9:
            if (r3 == 0) goto L_0x00b2
            one.me.chatscreen.ChatScreen r3 = (one.me.chatscreen.ChatScreen) r3
            int r3 = r3.A0()
            goto L_0x00b3
        L_0x00b2:
            r3 = r5
        L_0x00b3:
            r7.<init>(r5, r5, r3, r8)
            r1.c(r7)
            r1.i()
        L_0x00bc:
            n59 r0 = r17.x0()
            tx8 r15 = r0.w()
            long r12 = r4.longValue()
            if (r15 != 0) goto L_0x00cc
            goto L_0x016f
        L_0x00cc:
            java.lang.Object r0 = r10.getValue()
            r11 = r0
            it8 r11 = (defpackage.it8) r11
            boolean r0 = defpackage.ju0.B(r2)
            if (r0 == 0) goto L_0x00db
            r0 = r8
            goto L_0x00e4
        L_0x00db:
            boolean r0 = defpackage.ju0.C(r2)
            if (r0 == 0) goto L_0x00e3
            r0 = r9
            goto L_0x00e4
        L_0x00e3:
            r0 = r6
        L_0x00e4:
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00f8
            if (r0 == r6) goto L_0x00f6
            if (r0 != r9) goto L_0x00f0
            r14 = r9
            goto L_0x00f9
        L_0x00f0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f6:
            r14 = r8
            goto L_0x00f9
        L_0x00f8:
            r14 = r6
        L_0x00f9:
            r16 = 2
            r11.a(r12, r14, r15, r16)
            goto L_0x016f
        L_0x0100:
            int r3 = defpackage.cpc.f
            if (r1 != r3) goto L_0x0164
            n59 r1 = r17.x0()
            r1.E(r2)
            n59 r0 = r17.x0()
            tx8 r15 = r0.w()
            long r12 = r4.longValue()
            if (r15 != 0) goto L_0x011a
            goto L_0x016f
        L_0x011a:
            boolean r0 = defpackage.ju0.B(r2)
            if (r0 == 0) goto L_0x0121
            goto L_0x012a
        L_0x0121:
            boolean r0 = defpackage.ju0.C(r2)
            if (r0 == 0) goto L_0x0129
            r8 = r9
            goto L_0x012a
        L_0x0129:
            r8 = r6
        L_0x012a:
            int r0 = defpackage.au1.s(r8)
            if (r0 == 0) goto L_0x0156
            if (r0 == r6) goto L_0x0148
            if (r0 != r9) goto L_0x0142
            java.lang.Object r0 = r10.getValue()
            r11 = r0
            it8 r11 = (defpackage.it8) r11
            r14 = 2
            r16 = 4
            r11.a(r12, r14, r15, r16)
            goto L_0x016f
        L_0x0142:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0148:
            java.lang.Object r0 = r10.getValue()
            r11 = r0
            it8 r11 = (defpackage.it8) r11
            r14 = 3
            r16 = 5
            r11.a(r12, r14, r15, r16)
            goto L_0x016f
        L_0x0156:
            java.lang.Object r0 = r10.getValue()
            r11 = r0
            it8 r11 = (defpackage.it8) r11
            r14 = 1
            r16 = 3
            r11.a(r12, r14, r15, r16)
            goto L_0x016f
        L_0x0164:
            int r3 = defpackage.cpc.h
            if (r1 != r3) goto L_0x016f
            n59 r0 = r17.x0()
            r0.F(r2)
        L_0x016f:
            return
        L_0x0170:
            bc7[] r2 = X0
            r4 = r2[r6]
            fs r4 = r0.c
            java.lang.Object r7 = r4.a(r0)
            long[] r7 = (long[]) r7
            if (r7 == 0) goto L_0x01d2
            r2 = r2[r6]
            r4.b(r0, r3)
            int r2 = defpackage.mda.y
            java.lang.String r3 = "Array is empty."
            if (r1 != r2) goto L_0x01a9
            r17.y0()
            g39 r0 = r17.v0()
            int r1 = r7.length
            if (r1 == 0) goto L_0x01a3
            r1 = r7[r5]
            r0.getClass()
            e39 r3 = new e39
            r3.<init>(r1)
            s35 r0 = r0.t0
            defpackage.pnf.o(r0, r3)
            goto L_0x01d2
        L_0x01a3:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r3)
            throw r0
        L_0x01a9:
            int r2 = defpackage.mda.B
            if (r1 == r2) goto L_0x01b1
            int r2 = defpackage.mda.u
            if (r1 != r2) goto L_0x01b4
        L_0x01b1:
            r17.y0()
        L_0x01b4:
            n59 r0 = r17.x0()
            int r2 = r7.length
            if (r2 == 0) goto L_0x01cc
            r2 = r7[r5]
            r0.getClass()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.J(r1, r2)
            goto L_0x01d2
        L_0x01cc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r3)
            throw r0
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.y(int, android.os.Bundle):void");
    }

    public final void y0() {
        if (((Boolean) v0().c.a.getValue()).booleanValue()) {
            g39 v02 = v0();
            pnf.o(v02.t0, b39.a);
        }
    }

    public final void z0(long j, View view) {
        x77 x77;
        long j2 = j;
        n59 x02 = x0();
        q0e q0e = x02.p1;
        MessageModel d = ((l29) q0e.getValue()).d(j2);
        if (x02.A().d()) {
            x02.A().e(j2);
            return;
        }
        if ((d != null ? d.Z : null) == zof.Error) {
            int size = ((l29) q0e.getValue()).c().size();
            mg3 mg3 = hs8.a;
            List singletonList = Collections.singletonList(Long.valueOf(j));
            eqe eqe = new eqe(oda.l0);
            kl7 l = j1e.l();
            l.add(new mg3(mda.c, new eqe(oda.k0), 3, false));
            if (size > 1) {
                l.add(new mg3(mda.b, new gqe(oda.j0, ys.m0(new Object[]{Integer.valueOf(size)})), 3, false));
            }
            l.add(new mg3(mda.a, new eqe(oda.i0), 1, false));
            pnf.o(x02.u1, new fnd(singletonList, eqe, (eqe) null, j1e.d(l)));
            return;
        }
        bc7[] bc7Arr = X0;
        bc7 bc7 = bc7Arr[1];
        long[] jArr = (long[]) this.c.a(this);
        w4d w4d = this.J0;
        if (jArr == null || ((x77 = (x77) w4d.T0(this, bc7Arr[7])) != null && !x77.isActive())) {
            View view2 = view;
            pag.F(view2, ni6.LONG_PRESS);
            w4d.o1(this, bc7Arr[7], j47.T(getViewLifecycleScope(), (lx3) null, vx3.b, new u69(this, j, view2, (Continuation) null), 1));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessagesListWidget(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            r3 = 2
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r3 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r3 = r3.getName()
            r0.a = r3
            java.lang.String r3 = "MessagesList"
            r0.b = r3
            fs r3 = new fs
            java.lang.String r5 = "arg_key_scope_id"
            java.lang.Class<suc> r6 = defpackage.suc.class
            r3.<init>(r6, r5)
            fs r5 = new fs
            java.lang.Class<long[]> r6 = long[].class
            java.lang.String r7 = "selected.messageIds.Action"
            r5.<init>(r6, r4, r7)
            r0.c = r5
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            fs r6 = new fs
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            java.lang.String r8 = "messages:current.read.mark"
            r6.<init>(r7, r5, r8)
            r0.o = r6
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            fs r6 = new fs
            java.lang.String r7 = "is.last.message.completely.visible.on.detach"
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            r6.<init>(r8, r5, r7)
            r0.X = r6
            fs r6 = new fs
            java.lang.String r7 = "ARG_SKIP_UNREAD_DECOR"
            r6.<init>(r8, r5, r7)
            r0.Y = r6
            bc7[] r5 = X0
            r2 = r5[r2]
            java.lang.Object r2 = r3.a(r0)
            suc r2 = (defpackage.suc) r2
            java.lang.String r2 = r2.a
            java.lang.Class<g39> r3 = defpackage.g39.class
            je7 r2 = r0.m82getSharedViewModelcp94BC8(r2, r3, r4)
            r0.Z = r2
            o19 r2 = defpackage.o19.a
            v4 r3 = r2.getAccessor()
            java.lang.Class<z3b> r5 = defpackage.z3b.class
            java.lang.Object r3 = r3.c(r5)
            z3b r3 = (defpackage.z3b) r3
            r0.s0 = r3
            q59 r3 = new q59
            r5 = 1
            r3.<init>(r1, r0, r5)
            jp8 r5 = new jp8
            r6 = 3
            r5.<init>(r6, r3)
            java.lang.Class<n59> r3 = defpackage.n59.class
            je7 r3 = r0.createViewModelLazy(r3, r5)
            r0.t0 = r3
            q59 r3 = new q59
            r5 = 2
            r3.<init>(r1, r0, r5)
            khe r5 = new khe
            r5.<init>(r3)
            r0.u0 = r5
            p59 r3 = new p59
            r5 = 13
            r3.<init>(r0, r5)
            r5 = 3
            je7 r3 = defpackage.tu0.r(r5, r3)
            r0.v0 = r3
            v4 r3 = r2.getAccessor()
            java.lang.Class<it8> r6 = defpackage.it8.class
            khe r3 = r3.d(r6)
            r0.w0 = r3
            mk6 r10 = new mk6
            v4 r3 = r2.getAccessor()
            java.lang.Class<b0d> r6 = defpackage.b0d.class
            khe r3 = r3.d(r6)
            r10.<init>(r3)
            r0.x0 = r10
            v4 r3 = r2.getAccessor()
            java.lang.Class<iba> r6 = defpackage.iba.class
            java.lang.Object r3 = r3.c(r6)
            iba r3 = (defpackage.iba) r3
            java.util.concurrent.ExecutorService r7 = r3.a()
            om8 r9 = new om8
            n59 r13 = r19.x0()
            java.lang.Class<n59> r14 = defpackage.n59.class
            java.lang.String r15 = "onAttachClickAction"
            r12 = 1
            java.lang.String r16 = "onAttachClickAction(Lone/me/messages/list/ui/view/MessagesAttachAction;)V"
            r17 = 0
            r18 = 6
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            ey1 r11 = new ey1
            r3 = 22
            r11.<init>(r3, r0)
            b69 r8 = new b69
            r8.<init>(r0)
            yt8 r13 = new yt8
            r3 = 5
            r13.<init>((int) r3, (java.lang.Object) r0)
            m29 r3 = new m29
            vq0 r12 = new vq0
            r6 = 3
            r12.<init>(r6, r0)
            p59 r14 = new p59
            r6 = 0
            r14.<init>(r0, r6)
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A0 = r3
            p59 r3 = new p59
            r6 = 1
            r3.<init>(r0, r6)
            je7 r3 = defpackage.tu0.r(r5, r3)
            r0.B0 = r3
            int r3 = defpackage.mwb.messages_list_recycler_view
            q7c r3 = r0.viewBinding(r3)
            r0.D0 = r3
            int r3 = defpackage.mwb.messages_list_scroll_btn
            q7c r3 = r0.viewBinding(r3)
            r0.E0 = r3
            w4d r3 = defpackage.mqd.D()
            r0.J0 = r3
            p59 r3 = new p59
            r6 = 2
            r3.<init>(r0, r6)
            qm0 r3 = r0.binding(r3)
            r0.K0 = r3
            p59 r3 = new p59
            r6 = 3
            r3.<init>(r0, r6)
            qm0 r3 = r0.binding(r3)
            r0.L0 = r3
            kc8 r3 = new kc8
            r3.<init>(r0)
            r0.M0 = r3
            s59 r3 = new s59
            r3.<init>(r0)
            r0.N0 = r3
            t59 r3 = new t59
            r3.<init>(r0)
            r0.O0 = r3
            v4 r3 = r2.getAccessor()
            java.lang.Class<af8> r6 = defpackage.af8.class
            khe r3 = r3.d(r6)
            r0.P0 = r3
            q59 r3 = new q59
            r6 = 0
            r3.<init>(r1, r0, r6)
            je7 r1 = defpackage.tu0.r(r5, r3)
            r0.Q0 = r1
            p59 r1 = new p59
            r3 = 8
            r1.<init>(r0, r3)
            qm0 r1 = r0.binding(r1)
            r0.R0 = r1
            p59 r1 = new p59
            r3 = 10
            r1.<init>(r0, r3)
            qm0 r1 = r0.binding(r1)
            r0.S0 = r1
            p59 r1 = new p59
            r3 = 11
            r1.<init>(r0, r3)
            qm0 r1 = r0.binding(r1)
            r0.T0 = r1
            p59 r1 = new p59
            r3 = 12
            r1.<init>(r0, r3)
            qm0 r1 = r0.binding(r1)
            r0.U0 = r1
            v4 r0 = r2.getAccessor()
            java.lang.Class<ax7> r1 = defpackage.ax7.class
            java.lang.Object r0 = r0.c(r1)
            ax7 r0 = (defpackage.ax7) r0
            je7 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            q33 r1 = (defpackage.q33) r1
            t33 r1 = (defpackage.t33) r1
            long r1 = r1.F()
            long r6 = r0.g
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x01cc
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x01cc
            goto L_0x01ee
        L_0x01cc:
            bta r1 = new bta
            cta r2 = defpackage.cta.CHAT_INIT_TO_RENDER
            long r6 = android.os.SystemClock.elapsedRealtime()
            r1.<init>(r2, r6)
            qi9 r3 = r0.e
            r3.k(r2, r1)
            xw7 r1 = new xw7
            r1.<init>(r0, r4)
            kotlinx.coroutines.internal.ContextScope r2 = r0.d
            vxd r1 = defpackage.j47.T(r2, r4, r4, r1, r5)
            java.util.LinkedHashMap r0 = r0.f
            zsa r2 = defpackage.zsa.EVENT_OPEN_CHAT
            r0.put(r2, r1)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, int i, z84 z84) {
        this(str, j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? nz4.a : list, (i & 16) != 0 ? 0 : j3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (z84) null);
    }
}
