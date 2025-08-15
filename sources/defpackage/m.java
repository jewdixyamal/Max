package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseLongArray;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m  reason: default package */
public final /* synthetic */ class m implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Object obj;
        Object obj2;
        Object obj3 = null;
        switch (this.a) {
            case 0:
                int i = AboutAppSettingsScreen.c;
                return new v();
            case 1:
                bc7[] bc7Arr = AddChatAdminsScreen.x0;
                return wuc.CHAT_INFO_ADD_ADMINISTRATOR;
            case 2:
                bc7[] bc7Arr2 = AddChatMembersScreen.x0;
                return wuc.CHAT_INFO_ADD_PARTICIPANTS;
            case 3:
                bc7[] bc7Arr3 = AdminWaitingRoomScreen.s0;
                return new qa(yi1.a(), zi1.a.getAccessor().d(ir1.class), new qx7(6));
            case 4:
                HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 5:
                Object obj4 = new Object();
                new SparseLongArray();
                return obj4;
            case 6:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                return paint;
            case 7:
                try {
                    obj = kye.a;
                    if (kye.b) {
                        obj = null;
                    }
                } catch (Throwable th) {
                    obj = new njc(th);
                }
                if (!(obj instanceof njc)) {
                    obj3 = obj;
                }
                return (kye) obj3;
            case 8:
                np npVar = np.a;
                try {
                    obj2 = ((kye) np.d.getValue()) != null ? pye.a : null;
                } catch (Throwable th2) {
                    obj2 = new njc(th2);
                }
                if (!(obj2 instanceof njc)) {
                    obj3 = obj2;
                }
                return (pye) obj3;
            case 9:
                bc7[] bc7Arr4 = AppearanceSettingsMultiThemeScreen.s0;
                return wuc.SETTINGS_CHAT_DECORATION;
            case 10:
                bc7[] bc7Arr5 = AppearanceSettingsMultiThemeScreen.s0;
                return new kr();
            case 11:
                bc7[] bc7Arr6 = AppearanceSettingsScreen.Z;
                return wuc.SETTINGS_CHAT_DECORATION;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr7 = AppearanceSettingsScreen.Z;
                jq jqVar = jq.a;
                return new zr(jqVar.getAccessor().d(m7b.class), (p7b) jqVar.getAccessor().c(p7b.class), jqVar.getAccessor().d(Context.class), jqVar.getAccessor().d(tme.class), jqVar.getAccessor().d(ma2.class), jqVar.getAccessor().d(zu8.class), jqVar.getAccessor().d(el3.class), jqVar.getAccessor().d(k29.class), jqVar.getAccessor().d(kke.class), jqVar.getAccessor().d(qe5.class));
            case 13:
                int i2 = AudioAttachView.w0;
                return (f40) ((y8a) vl.b()).getAccessor().c(f40.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int i3 = AudioListenView.B0;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                return gradientDrawable;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new sz6();
            case 16:
                return new Path();
            case LangUtils.HASH_SEED /*17*/:
                float f = (float) 54;
                return new jic(0.0f, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 12);
            case 18:
                return new Path();
            case 19:
                return new Path();
            case 20:
                bc7[] bc7Arr8 = bh0.u0;
                return Boolean.FALSE;
            case 21:
                return new v5b(12);
            case 22:
                return new zcb();
            case 23:
                return new byte[17408];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                bc7[] bc7Arr9 = CallAdminSettingsScreen.t0;
                je7 a2 = yi1.a();
                je7 d = yi1.d();
                zi1 zi1 = zi1.a;
                return new k01(zi1.getAccessor().d(kr1.class), zi1.b(), a2, d, yi1.c());
            case 25:
                bc7[] bc7Arr10 = CallAdminSettingsScreen.t0;
                return new zz0();
            case 26:
                bc7[] bc7Arr11 = CallAdminSettingsScreen.t0;
                return tnd.a;
            case 27:
                float f2 = fk4.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 28:
                return new Object();
            default:
                int i4 = j11.S0;
                return -231920335;
        }
    }
}
