package defpackage;

import android.view.View;
import android.widget.EditText;
import java.util.Collections;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: we1  reason: default package */
public final /* synthetic */ class we1 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ we1(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 1:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 2:
                return Long.valueOf(Long.MAX_VALUE - ((ve1) obj).Z);
            case 3:
                bc7[] bc7Arr = CallOpponentsListWidget.H0;
                ((EditText) obj).getText().clear();
                return e5f;
            case 4:
                return Integer.valueOf(((fka) obj).getIcon().e);
            case 5:
                fka fka = (fka) obj;
                fka.getIcon();
                return new dcf(-1, fka.getIcon().k);
            case 6:
                ((Long) obj).getClass();
                bc7[] bc7Arr2 = ChangeOwnerScreen.u0;
                return nz4.a;
            case 7:
                return Integer.valueOf(((fka) obj).getIcon().j);
            case 8:
                fka fka2 = (fka) obj;
                fka2.getIcon();
                return new dcf(-1, fka2.getIcon().k);
            case 9:
                return ((fs8) obj).a(true, false);
            case 10:
                return Integer.valueOf(((fka) obj).getText().h);
            case 11:
                return Integer.valueOf(((fka) obj).getText().h);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new dcf(0, ((fka) obj).getIcon().a.e);
            case 13:
                return Integer.valueOf(((fka) obj).getText().h);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Integer.valueOf(((fka) obj).getIcon().j);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return Integer.valueOf(((fka) obj).getText().h);
            case 16:
                return Integer.valueOf(((fka) obj).getText().g);
            case LangUtils.HASH_SEED /*17*/:
                View view = (View) obj;
                bc7[] bc7Arr3 = ChatMediaTabWidget.w0;
                ckb.c.f2();
                return e5f;
            case 18:
                u82 u82 = (u82) obj;
                x82 x82 = u82.r;
                if (x82 == null) {
                    x82 = x82.g;
                }
                w82 a2 = x82.a();
                a2.c = 0;
                u82.r = a2.a();
                return e5f;
            case 19:
                rw8 rw8 = (rw8) obj;
                return "p_id=" + rw8.a + ",m_id=" + rw8.e + ",sender=" + rw8.g;
            case 20:
                rw8 rw82 = (rw8) obj;
                return new sx9(rw82.c, rw82.e, rw82.i, ks4.DO_NOT_DISTURB_MODE);
            case 21:
                View view2 = (View) obj;
                bc7[] bc7Arr4 = ChatNotificationsSettingsScreen.Y;
                sv9.c.P1().d();
                return e5f;
            case 22:
                fka fka3 = (fka) obj;
                bc7[] bc7Arr5 = ChatScreen.k1;
                fka3.a().s().c.getClass();
                return new dcf(-1, fka3.a().s().c.a);
            case 23:
                return pag.x((String) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                if (((nl2) obj).B0 != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                e52 e52 = (e52) obj;
                k92 k92 = e52.b;
                if ((k92.b != j92.c && k92.a == 0 && k92.j == 0 && k92.f0 == null) || e52.F() || (k92.H.g && e52.c == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                View view3 = (View) obj;
                bc7[] bc7Arr6 = ChatsListSearchScreen.J0;
                return e5f;
            case 27:
                izc izc = (izc) obj;
                return izc.getItemId() + "/" + z7b.k(izc.a);
            case 28:
                return ((nl2) obj).C0;
            default:
                return Boolean.valueOf(((e52) obj).N());
        }
    }
}
