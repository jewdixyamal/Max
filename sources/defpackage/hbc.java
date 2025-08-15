package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.SettingsListScreen;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hbc  reason: default package */
public final /* synthetic */ class hbc implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ hbc(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<kke> cls = kke.class;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                return gradientDrawable;
            case 1:
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                return gradientDrawable2;
            case 2:
                bc7[] bc7Arr3 = RecordControlsWidget.b1;
                return new wb5();
            case 3:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(704595023);
                return shapeDrawable;
            case 4:
                return new RenderNode("blur");
            case 5:
                kkc kkc = kkc.END;
                kkc kkc2 = kkc.INCOMING;
                kkc kkc3 = kkc.BEEP;
                kkc kkc4 = kkc.CONNECTING;
                kkc kkc5 = kkc.CONNECTED;
                kkc kkc6 = kkc.BUSY;
                int i = kkc3.a;
                int i2 = kkc4.a;
                return new wh1(kkc.a, kkc2.a, i, i2, kkc5.a, kkc6.a);
            case 6:
                float c = fk4.c() * 24.0f;
                return new float[]{c, c, c, c, c, c, c, c};
            case 7:
                return new ShapeDrawable(new OvalShape());
            case 8:
                return new mtc();
            case 9:
                bc7[] bc7Arr4 = ScheduledSendPickerViewModel.p;
                return ngg.w(0);
            case 10:
                bc7[] bc7Arr5 = ScheduledSendPickerViewModel.p;
                return ngg.A(0);
            case 11:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = rwc.x0;
                return e5f.a;
            case 13:
                return Pattern.compile("^([0-9]+)X([0-9]+)");
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new mib(yea.H, (kqe) null, 6);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                bc7[] bc7Arr6 = ServerHostBottomSheet.G0;
                return new oo6();
            case 16:
                bc7[] bc7Arr7 = ServerPortBottomSheet.B0;
                return new l6b();
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr8 = SettingMediaScreen.Y;
                return wuc.SETTINGS_MEDIA;
            case 18:
                bc7[] bc7Arr9 = SettingMediaScreen.Y;
                mgd mgd = mgd.a;
                return new ndd(mgd.getAccessor().d(cls), mgd.getAccessor().d(kxc.class), mgd.getAccessor().d(rj.class));
            case 19:
                bc7[] bc7Arr10 = SettingsBlacklistScreen.Z;
                ehd ehd = ehd.a;
                return new ped(new ep0(ehd.getAccessor().d(av0.class), ehd.b()));
            case 20:
                return new Matrix();
            case 21:
                return Collections.singletonList(hcd.DEV_MENU);
            case 22:
                return Collections.singletonList(hcd.APPEARANCE);
            case 23:
                return Collections.singletonList(hcd.ESIA_CONNECT);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return Collections.singletonList(hcd.INVITE_FRIENDS);
            case 25:
                return y53.M(hcd.NOTIFICATIONS, hcd.PRIVACY, hcd.MESSAGES, hcd.SAVED_MESSAGES, hcd.FOLDERS);
            case 26:
                kl7 l = j1e.l();
                l.add(hcd.SUPPORT);
                l.add(hcd.ABOUT);
                return j1e.d(l);
            case 27:
                kl7 l2 = j1e.l();
                l2.add(hcd.BATTERY);
                l2.add(hcd.STORAGE);
                return j1e.d(l2);
            case 28:
                bc7[] bc7Arr11 = SettingsListScreen.B0;
                return new cn3(yfd.a.getAccessor().d(y7d.class));
            default:
                bc7[] bc7Arr12 = SettingsStorageScreen.X;
                iid iid = iid.a;
                return new vid(iid.getAccessor().d(cls), iid.getAccessor().d(jp.class), iid.getAccessor().d(ng5.class), iid.getAccessor().d(ch9.class), (Context) iid.getAccessor().c(Context.class));
        }
    }

    public /* synthetic */ hbc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = 8;
    }
}
