package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rpc  reason: default package */
public final /* synthetic */ class rpc implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rpc() {
        this.a = 11;
        this.b = np3.b;
    }

    public final Object invoke(Object obj) {
        long j;
        boolean z = false;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((zl4) this.b).g();
                return e5f.a;
            case 1:
                View view = (View) obj;
                int i = SafeModeOnboardingScreen.c;
                i3a onBackPressedDispatcher = ((SafeModeOnboardingScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f.a;
            case 2:
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                t6d t6d = (t6d) this.b;
                sb.append(t6d.f[intValue]);
                sb.append(": ");
                sb.append(t6d.g[intValue].a());
                return sb.toString();
            case 3:
                View view2 = (View) obj;
                bc7[] bc7Arr = SettingMediaScreen.Y;
                ((SettingMediaScreen) this.b).getRouter().C();
                return e5f.a;
            case 4:
                View view3 = (View) obj;
                bc7[] bc7Arr2 = SettingsBlacklistScreen.Z;
                ((SettingsBlacklistScreen) this.b).getRouter().C();
                return e5f.a;
            case 5:
                View view4 = (View) obj;
                bc7[] bc7Arr3 = SettingsPrivacyScreen.Z;
                ((SettingsPrivacyScreen) this.b).getRouter().C();
                return e5f.a;
            case 6:
                View view5 = (View) obj;
                bc7[] bc7Arr4 = SettingsStorageScreen.X;
                ((SettingsStorageScreen) this.b).getRouter().C();
                return e5f.a;
            case 7:
                View view6 = (View) obj;
                bc7[] bc7Arr5 = ShareDataPickerScreen.D0;
                i3a onBackPressedDispatcher2 = ((ShareDataPickerScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return e5f.a;
            case 8:
                View view7 = (View) obj;
                bc7[] bc7Arr6 = StickerPreviewScreen.A0;
                ((StickerPreviewScreen) this.b).getRouter().C();
                return e5f.a;
            case 9:
                View view8 = (View) obj;
                bc7[] bc7Arr7 = StickersScreen.v0;
                ((StickersScreen) this.b).getRouter().C();
                return e5f.a;
            case 10:
                View view9 = (View) obj;
                bc7[] bc7Arr8 = StickersShowcaseScreen.v0;
                ((StickersShowcaseScreen) this.b).getRouter().C();
                return e5f.a;
            case 11:
                if (((op3) obj).b == ((np3) this.b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (!((dk2) obj).a.u0.contains(vm3.BOT)) {
                    ((qi8) this.b).getClass();
                }
                return true;
            case 13:
                fs8 fs8 = (fs8) obj;
                int i2 = raf.$EnumSwitchMapping$0[((saf) this.b).b.ordinal()];
                if (i2 == 1) {
                    j = fs8.b;
                } else if (i2 == 2) {
                    ng4 ng4 = fs8.D0;
                    j = ng4 != null ? ng4.a : 0;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Long.valueOf(j);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ejf ejf = (ejf) this.b;
                byte[] bArr = (byte[]) obj;
                String name = ejf.class.getName();
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, name, "Capture first frame to have a preview", (Throwable) null);
                }
                j47.T(ejf.t0, ((w9a) ((kke) ejf.o.getValue())).a(), (vx3) null, new djf(bArr, ejf, (Continuation) null), 2);
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                p8b p8b = (p8b) obj;
                bc7[] bc7Arr9 = VideoMessageWidget.y0;
                ygf o0 = ((VideoMessageWidget) this.b).o0();
                if (p8b == p8b.b) {
                    z = true;
                }
                ((ejf) o0).G0.m((Object) null, Boolean.valueOf(z));
                return e5f.a;
            case 16:
                View view10 = (View) obj;
                bc7[] bc7Arr10 = WebAppSettingsScreen.s0;
                ((WebAppSettingsScreen) this.b).getRouter().C();
                return e5f.a;
            case LangUtils.HASH_SEED /*17*/:
                View view11 = (View) obj;
                bc7[] bc7Arr11 = WebAppsSettingScreen.X;
                ((WebAppsSettingScreen) this.b).getRouter().C();
                return e5f.a;
            default:
                return Widget.binding$lambda$8((k56) this.b, obj);
        }
    }

    public /* synthetic */ rpc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
