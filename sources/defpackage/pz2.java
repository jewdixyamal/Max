package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.Map;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.DevMenuScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pz2  reason: default package */
public final /* synthetic */ class pz2 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ pz2(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        c7a c7a = c7a.c;
        z6a z6a = z6a.o;
        b7a b7a = b7a.a;
        boolean z = false;
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = ChatsTabWidget.C0;
                gy2.c.P1().b(":start-conversation", (Bundle) null);
                return e5f;
            case 1:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 2:
                String str = (String) obj;
                bc7[] bc7Arr2 = e53.k;
                return e5f;
            case 3:
                hm9.p("OneMeExecutors", "hanged threads", new ThreadExecutorStuckException((Collection) obj));
                return e5f;
            case 4:
                hm9.p("OneMeExecutors", "stucked threads", new ThreadExecutorStuckException((Collection) obj));
                return e5f;
            case 5:
                return ote.s(((TamErrorException) obj).a);
            case 6:
                fka fka = (fka) obj;
                fka.getIcon();
                return new dcf(-1, fka.getIcon().k);
            case 7:
                if (((vj3) obj) == vj3.o) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                if (((vj3) obj) == vj3.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                yq3 yq3 = (yq3) obj;
                if (yq3.b || yq3.a == 7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return Boolean.valueOf(((yq3) obj).b);
            case 11:
                ((Boolean) obj).getClass();
                return e5f;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                jx3 jx3 = (jx3) obj;
                if (jx3 instanceof nx3) {
                    return (nx3) jx3;
                }
                return null;
            case 13:
                View view2 = (View) obj;
                int i = DevMenuScreen.u0;
                hi4.c.P1().d();
                return e5f;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                View view3 = (View) obj;
                bc7[] bc7Arr3 = DialogNotificationsSettingsScreen.Y;
                sv9.c.P1().d();
                return e5f;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                if (((nu8) obj).c == mu8.Y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                Map map = ((nu8) obj).f;
                Object obj2 = map != null ? map.get("url") : null;
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                return null;
            case LangUtils.HASH_SEED /*17*/:
                return obj;
            case 18:
                mr0.X(zr6.h(m55.v0.getAndIncrement(), "service-watchdog-"), new i55((Runnable) obj, 0));
                return e5f;
            case 19:
                if (((je5) obj).f != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 21:
                return obj;
            case 22:
                return Boolean.valueOf(!(((vk6) obj) instanceof uk6));
            case 23:
                return Long.valueOf(((vk6) obj).getId());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return String.valueOf(((v8c) obj).a);
            case 25:
                izc izc = (izc) obj;
                return izc.getItemId() + "/" + z7b.k(izc.a);
            case 26:
                return String.valueOf(((nn3) obj).a);
            case 27:
                OneMeButton oneMeButton = (OneMeButton) obj;
                bc7[] bc7Arr4 = InputNameScreen.B0;
                oneMeButton.setText(v0c.oneme_login_input_name_continue_button_disabled);
                oneMeButton.setMode(b7a);
                oneMeButton.setAppearance(z6a);
                oneMeButton.setSize(c7a);
                oneMeButton.setEnabled(false);
                return e5f;
            case 28:
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                bc7[] bc7Arr5 = InputNameScreen.B0;
                oneMeButton2.setId(hwb.oneme_login_input_name_continue_btn);
                oneMeButton2.setText(v0c.oneme_login_input_name_continue_button_active);
                oneMeButton2.setMode(b7a);
                oneMeButton2.setAppearance(z6a);
                oneMeButton2.setSize(c7a);
                oneMeButton2.setEnabled(true);
                return e5f;
            default:
                return ote.s(((TamErrorException) obj).a);
        }
    }
}
