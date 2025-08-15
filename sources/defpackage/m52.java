package defpackage;

import android.content.Context;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m52  reason: default package */
public final /* synthetic */ class m52 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ m52(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<pk> cls = pk.class;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatAdminsScreen.w0;
                return Long.valueOf(((hyc) ((q33) xcb.a.d().getValue())).t());
            case 1:
                return new dh4(xcb.a.getAccessor().d(cls));
            case 2:
                neb neb = neb.a;
                return new a03(neb.getAccessor().d(qea.class), neb.getAccessor().d(o45.class));
            case 3:
                return (dfb) neb.a.getAccessor().c(dfb.class);
            case 4:
                return new mge(0);
            case 5:
                return new mge(0);
            case 6:
                return new mg3(wea.y, new eqe(yea.X), 3, false);
            case 7:
                return new tt3(wea.d0, (jqe) new eqe(yea.v1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 8:
                return new tt3(wea.Z, (jqe) new eqe(yea.D1), Integer.valueOf(woc.l1), (Integer) null, 20);
            case 9:
                return new mge(0);
            case 10:
                return new mge(0);
            case 11:
                bc7[] bc7Arr2 = ChatMediaDownloadBottomSheet.E0;
                rkd rkd = rkd.a;
                Class<kke> cls2 = kke.class;
                return new ye2(rkd.getAccessor().d(r79.class), rkd.getAccessor().d(dfe.class), rkd.getAccessor().d(cls), rkd.getAccessor().d(zi5.class), rkd.getAccessor().d(af8.class), (Context) rkd.getAccessor().c(Context.class), (kke) rkd.getAccessor().c(cls2), new qrc((uuc) rkd.getAccessor().c(uuc.class), ((w9a) ((kke) rkd.getAccessor().c(cls2))).b(), (qra) rkd.getAccessor().c(qra.class)));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return xcb.a.h();
            case 13:
                return new fe2();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                bc7[] bc7Arr3 = ChatMediaViewerScreen.K0;
                return wuc.CHAT_MEDIA_VIEWER;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new tt3(wea.t0, (jqe) new eqe(yea.Y1), Integer.valueOf(wfa.W), Integer.valueOf(woc.q), Integer.valueOf(wfa.Q));
            case 16:
                return new tt3(wea.s0, (jqe) new eqe(yea.X1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case LangUtils.HASH_SEED /*17*/:
                return new tt3(wea.r0, (jqe) new eqe(yea.W1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 18:
                return new tt3(wea.q0, (jqe) new eqe(yea.V1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 19:
                bc7[] bc7Arr4 = ChatMembersScreen.u0;
                return wuc.CHAT_INFO_ALL_PARTICIPANTS;
            case 20:
                return new eh4(xcb.a.getAccessor().d(cls));
            case 21:
                bc7[] bc7Arr5 = ChatNotificationsSettingsScreen.Y;
                return new im2();
            case 22:
                return new eh4(xcb.a.getAccessor().d(cls));
            case 23:
                return xcb.a.getAccessor().d(xb9.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new zcb();
            case 25:
                return new gcb();
            case 26:
                bc7[] bc7Arr6 = ChatScreen.k1;
                return new g39();
            case 27:
                bc7[] bc7Arr7 = ChatScreen.k1;
                return new zz7();
            case 28:
                bc7[] bc7Arr8 = ChatScreen.k1;
                return new cc8((wc7) to2.a.getAccessor().c(wc7.class), 7);
            default:
                bc7[] bc7Arr9 = ChatScreen.k1;
                return to2.a.c();
        }
    }
}
