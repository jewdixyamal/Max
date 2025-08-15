package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: j81  reason: default package */
public final class j81 implements t15 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ j81(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void l() {
        String str;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                buc buc = CallHistoryPageScreen.u0;
                ks1 ks1 = ((CallHistoryPageScreen) widget).p0().X;
                ks1.getClass();
                ks1.g(new u60((Object) ks1, true, 5));
                return;
            case 1:
                bc7[] bc7Arr = ChatsListSearchScreen.J0;
                gw2 n0 = ((ChatsListSearchScreen) widget).n0();
                vxd vxd = n0.N0;
                if (vxd == null || !vxd.isActive()) {
                    q0e q0e = n0.E0;
                    q0e.m((Object) null, ov2.a((ov2) q0e.getValue(), nv2.b, (it6) null, (ArrayList) null, false, 30));
                    tv2 tv2 = new tv2(n0, (Continuation) null);
                    n0.N0 = j47.T(n0.a, n0.L0, (vx3) null, tv2, 2);
                    return;
                }
                return;
            case 2:
                bc7[] bc7Arr2 = ChatsListWidget.M0;
                ((ChatsListWidget) widget).p0().X.e();
                return;
            case 3:
                bc7[] bc7Arr3 = LogsViewerScreen.Y;
                ((LogsViewerScreen) widget).m0().q();
                return;
            case 4:
                bc7[] bc7Arr4 = MediaGalleryWidget.Z;
                z96 o0 = ((MediaGalleryWidget) widget).o0();
                o0.getClass();
                hm9.m("z96", "loadMoreItems()", new Object[0]);
                vxd vxd2 = o0.I0;
                if ((vxd2 == null || !vxd2.isActive()) && !((Boolean) o0.z0.getValue()).booleanValue()) {
                    try {
                        x77 x77 = o0.H0;
                        if (x77 != null) {
                            x77.cancel((CancellationException) null);
                        }
                    } catch (Throwable unused) {
                    }
                    o0.H0 = pnf.n(o0, ((w9a) o0.s()).e().plus(o0.o), (vx3) null, new o96(o0, (Continuation) null), 2);
                    return;
                }
                hm9.m("z96", "try to load more items when loading in process, ignore it", new Object[0]);
                return;
            case 5:
                bc7[] bc7Arr5 = MembersListWidget.D0;
                ((lp8) ((MembersListWidget) widget).p0().s0.getValue()).e();
                return;
            case 6:
                bc7[] bc7Arr6 = PickerChatsListWidget.C0;
                ((PickerChatsListWidget) widget).q0().c.e();
                return;
            case 7:
                bc7[] bc7Arr7 = ProfileScreen.D0;
                ((ProfileScreen) widget).r0().O0.s();
                return;
            case 8:
                bc7[] bc7Arr8 = StickersSearchScreen.u0;
                q5e n02 = ((StickersSearchScreen) widget).n0();
                l5e l5e = (l5e) n02.w0.get();
                vxd vxd3 = n02.y0;
                if ((vxd3 == null || !vxd3.isActive()) && (str = l5e.a) != null && str.length() != 0) {
                    n02.y0 = pnf.n(n02, ((w9a) n02.c).b(), (vx3) null, new n5e(n02, l5e, (Continuation) null), 2);
                    return;
                }
                return;
            case 9:
                bc7[] bc7Arr9 = StickersShowcaseScreen.v0;
                i7e n03 = ((StickersShowcaseScreen) widget).n0();
                g6e g6e = n03.X;
                if (g6e.a()) {
                    vxd vxd4 = g6e.h;
                    if (vxd4 == null || !vxd4.isActive()) {
                        g6e.h = j47.T(g6e.c, (lx3) null, (vx3) null, new e6e(g6e, (Continuation) null), 3);
                        return;
                    }
                    return;
                }
                b6e b6e = n03.c;
                vxd vxd5 = b6e.g;
                if (vxd5 == null || !vxd5.isActive()) {
                    b6e.g = j47.T(b6e.c, (lx3) null, (vx3) null, new z5e(b6e, (Continuation) null), 3);
                    return;
                }
                return;
            default:
                bc7[] bc7Arr10 = SuggestionsWidget.B0;
                yce B0 = ((SuggestionsWidget) widget).B0();
                B0.q(((Number) B0.H0.getValue()).intValue(), (String) B0.G0.getValue());
                return;
        }
    }

    public final boolean m() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                buc buc = CallHistoryPageScreen.u0;
                return ((CallHistoryPageScreen) widget).p0().r();
            case 1:
                bc7[] bc7Arr = ChatsListSearchScreen.J0;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) widget;
                if (((ov2) chatsListSearchScreen.n0().F0.a.getValue()).a != nv2.b && ((ov2) chatsListSearchScreen.n0().F0.a.getValue()).b.length() > 0) {
                    yx7 yx7 = chatsListSearchScreen.n0().o;
                    if ((!cqc.c(yx7.l) || yx7.s != null) && chatsListSearchScreen.A0.j() > 0) {
                        return true;
                    }
                }
                return false;
            case 2:
                bc7[] bc7Arr2 = ChatsListWidget.M0;
                return ((mt2) ((ChatsListWidget) widget).p0().G0.getValue()).b;
            case 3:
                return true;
            case 4:
                bc7[] bc7Arr3 = MediaGalleryWidget.Z;
                z96 o0 = ((MediaGalleryWidget) widget).o0();
                b86 b86 = (b86) o0.B0.getValue();
                if (b86 == null) {
                    return false;
                }
                boolean b2 = ((fz6) o0.X).b(b86);
                hm9.m("z96", "canLoadMoreItems = " + b2, new Object[0]);
                return b2;
            case 5:
                bc7[] bc7Arr4 = MembersListWidget.D0;
                return ((lp8) ((MembersListWidget) widget).p0().s0.getValue()).c();
            case 6:
                return PickerChatsListWidget.n0((PickerChatsListWidget) widget);
            case 7:
                bc7[] bc7Arr5 = ProfileScreen.D0;
                return ((ProfileScreen) widget).r0().O0.w();
            case 8:
                bc7[] bc7Arr6 = StickersSearchScreen.u0;
                return ((StickersSearchScreen) widget).n0().r();
            case 9:
                bc7[] bc7Arr7 = StickersShowcaseScreen.v0;
                return ((StickersShowcaseScreen) widget).n0().r();
            default:
                bc7[] bc7Arr8 = SuggestionsWidget.B0;
                yce B0 = ((SuggestionsWidget) widget).B0();
                if (!tpa.f(B0.B0.a, String.valueOf((String) B0.G0.getValue()))) {
                    return false;
                }
                return B0.B0.f;
        }
    }
}
