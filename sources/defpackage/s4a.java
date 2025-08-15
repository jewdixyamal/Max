package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.android.OneMeApplication;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: s4a  reason: default package */
public final /* synthetic */ class s4a implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ s4a(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v26, types: [j5c, java.lang.Object] */
    public final Object invoke() {
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                int i = OneMeApplication.s0;
                gj gjVar = (gj) y8a.a.getAccessor().c(gj.class);
                vxd T = j47.T(gjVar.j, (lx3) null, vx3.b, new ej(gjVar, (Continuation) null), 1);
                gjVar.k.o1(gjVar, gj.p[0], T);
                return e5f;
            case 1:
                return new y5a("", "", 2, x5a.p, (Drawable) null, (Drawable) null);
            case 2:
                return e9f.c(woc.T1).toString();
            case 3:
                jd4 jd4 = ql4.a;
                return MainDispatcherLoader.dispatcher;
            case 4:
                return new eaa(999, yoc.u0, Integer.valueOf(woc.y0), "NARNIA");
            case 5:
                je7 r = tu0.r(3, new xid(26));
                je7 r2 = tu0.r(3, new xid(27));
                return new yge((GradientDrawable) r2.getValue(), (GradientDrawable) r.getValue(), (GradientDrawable) r2.getValue(), (GradientDrawable) r.getValue());
            case 6:
                je7 r3 = tu0.r(3, new xid(22));
                return new yge((GradientDrawable) tu0.r(3, new xid(23)).getValue(), (GradientDrawable) r3.getValue(), (GradientDrawable) tu0.r(3, new xid(24)).getValue(), (GradientDrawable) tu0.r(3, new xid(25)).getValue());
            case 7:
                return new xja(tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density), fk4.d().getDisplayMetrics().density * 4.0f);
            case 8:
                return new vpe();
            case 9:
                return new LinearInterpolator();
            case 10:
                return new LinearInterpolator();
            case 11:
                ? obj = new Object();
                obj.a = new ThreadLocal();
                obj.b = new ThreadLocal();
                return obj;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr = OtherNotificationsSettingsScreen.Y;
                return new ina();
            case 13:
                bc7[] bc7Arr2 = PickChatMembers.x0;
                return wuc.CREATE_CHAT_MEMBERS_PICKER;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                bc7[] bc7Arr3 = PickSubscribersScreen.z0;
                return nyd.a.b();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new gqd(false);
            case 16:
                return new gqd(true);
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr4 = PickerChatsListWidget.C0;
                return Boolean.FALSE;
            case 18:
                bc7[] bc7Arr5 = PickerChatsListWidget.C0;
                ys2 ys2 = ys2.a;
                return new tya(ys2.getAccessor().d(q33.class), ys2.getAccessor().d(w7b.class), ys2.getAccessor().d(u7b.class));
            case 19:
                bc7[] bc7Arr6 = PickerChatsTabWidget.y0;
                je7 je7 = iyc.a;
                jyc jyc = jyc.a;
                return new mya((nba) ys2.a.getAccessor().c(nba.class), jyc.s(), (rba) jyc.getAccessor().c(rba.class));
            case 20:
                bc7[] bc7Arr7 = PickerContactsListWidget.y0;
                ys2 ys22 = ys2.a;
                return new dza((qn3) ys22.getAccessor().c(qn3.class), ys22.getAccessor().d(kke.class), ys22.getAccessor().d(b0d.class));
            case 21:
                bc7[] bc7Arr8 = PickerContactsListWidget.y0;
                return new bh0(dh0.a.getAccessor().d(os3.class), true, (po3) null, 46);
            case 22:
                int i2 = PinBarsWidget.t0;
                return new wza((j0e) null, (Long) null, 1);
            case 23:
                int i3 = m0b.N0;
                return e5f;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                int i4 = vc7.a;
                return Boolean.valueOf(vc7.b(vc7.c));
            case 25:
                return new ugf(n31.a.getAccessor().d(kr1.class));
            case 26:
                bc7[] bc7Arr9 = PipScreen.o;
                return tnd.a;
            case 27:
                return PmsKey.keys_delegate$lambda$1();
            case 28:
                int i5 = f6b.w0;
                return e5f;
            default:
                return new mv0(xcb.a.d());
        }
    }
}
