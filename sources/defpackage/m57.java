package defpackage;

import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.util.Patterns;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.login.LoginScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m57  reason: default package */
public final /* synthetic */ class m57 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ m57(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<y7d> cls = y7d.class;
        Class<ad> cls2 = ad.class;
        Class<kke> cls3 = kke.class;
        Class<e5a> cls4 = e5a.class;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = InviteByPhoneScreen.B0;
                return new cn3(c57.a.getAccessor().d(cls));
            case 1:
                bc7[] bc7Arr2 = InviteByQrBottomSheet.G0;
                return new h67();
            case 2:
                bc7[] bc7Arr3 = InviteByQrBottomSheet.G0;
                return new cn3(c57.a.getAccessor().d(cls));
            case 3:
                bc7[] bc7Arr4 = InviteFriendsToMaxBottomSheet.E0;
                return new h67();
            case 4:
                return new Object();
            case 5:
                return new mcf(0);
            case 6:
                return new mcf(0);
            case 7:
                bc7[] bc7Arr5 = KeyboardEmojiWidget.s0;
                kc7 kc7 = kc7.a;
                return new az4(kc7.getAccessor().d(gj.class), (ji) kc7.getAccessor().c(ji.class), new y8((Object) (cz4) kc7.getAccessor().c(cz4.class)), (kke) kc7.getAccessor().c(cls3), (x9c) kc7.getAccessor().d(x9c.class).getValue());
            case 8:
                bc7[] bc7Arr6 = KeyboardStickersWidget.t0;
                kc7 kc72 = kc7.a;
                return new bod(kc72.getAccessor().d(o2e.class), kc72.getAccessor().d(b6e.class));
            case 9:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setShape(0);
                return gradientDrawable;
            case 10:
                return ((k24) ((c34) jyc.a.getAccessor().c(c34.class))).g;
            case 11:
                return bcf.a.c();
            case Protos.Attaches.Attach.PRESENT /*12*/:
                int i = LinkInterceptorWidget.o;
                return (wj7) y8a.a.getAccessor().c(wj7.class);
            case 13:
                return Patterns.WEB_URL;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Patterns.WEB_URL;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new MediaMetadataRetriever();
            case 16:
                lt7 lt7 = lt7.a;
                return new hu7(lt7.getAccessor().d(cls4), lt7.getAccessor().d(q33.class), lt7.getAccessor().d(f5a.class), lt7.getAccessor().d(u0b.class), lt7.getAccessor().d(cu7.class), lt7.getAccessor().d(xt7.class), lt7.getAccessor().d(ds3.class));
            case LangUtils.HASH_SEED /*17*/:
                lt7 lt72 = lt7.a;
                return new i80(lt72.getAccessor().d(cls2), lt72.getAccessor().d(cls4));
            case 18:
                lt7 lt73 = lt7.a;
                return new f80(lt73.getAccessor().d(cls2), lt73.getAccessor().d(cls4));
            case 19:
                return new b80(lt7.a.getAccessor().d(cls4));
            case 20:
                bc7[] bc7Arr7 = LoginScreen.c;
                return new iu7(lt7.a.getAccessor().d(eua.class));
            case 21:
                return new xa5(150);
            case 22:
                return new xa5(150);
            case 23:
                bc7[] bc7Arr8 = LogsViewerScreen.Y;
                tu7 tu7 = tu7.a;
                return new mv7((uca) tu7.getAccessor().c(uca.class), (kke) tu7.getAccessor().c(cls3));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                bc7[] bc7Arr9 = w38.K0;
                return e5f.a;
            case 25:
                bc7[] bc7Arr10 = MediaBarPermissionWidget.Z;
                return new l48();
            case 26:
                bc7[] bc7Arr11 = MediaBarWidget.d1;
                to2 to2 = to2.a;
                Class<uuc> cls5 = uuc.class;
                return new urb(new djb((uuc) to2.getAccessor().c(cls5), ((w9a) to2.getDispatchers()).b(), false, 3), new trc((uuc) to2.getAccessor().c(cls5), ((w9a) to2.getDispatchers()).b()), (xp7) to2.getAccessor().c(xp7.class), (zi5) to2.getAccessor().c(zi5.class), (uuc) to2.getAccessor().c(cls5), (af8) to2.getAccessor().c(af8.class), to2.getDispatchers());
            case 27:
                bc7[] bc7Arr12 = MediaBarWidget.d1;
                return new bm8();
            case 28:
                bc7[] bc7Arr13 = MediaBarWidget.d1;
                return new q3d((hq7) to2.a.getAccessor().c(hq7.class), new e3d(false, true));
            default:
                return new Matrix();
        }
    }
}
