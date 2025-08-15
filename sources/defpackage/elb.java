package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.SettingsAvatarBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.stickers.widgets.StickerView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: elb  reason: default package */
public final /* synthetic */ class elb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ elb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        boolean z = false;
        String str = null;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) obj;
                tpa.o(profileScreen.getContext(), profileScreen.r0().r());
                return;
            case 1:
                hnc hnc = ((knc) obj).L0;
                if (hnc != null) {
                    hnc.b();
                    return;
                }
                return;
            case 2:
                e4d e4d = (e4d) obj;
                c86 c86 = e4d.I0;
                if (c86 != null) {
                    bqc bqc = e4d.F0;
                    bqc.getClass();
                    bc7[] bc7Arr2 = SelectAlbumWidget.Y;
                    q3d o0 = ((SelectAlbumWidget) bqc.b).o0();
                    q0e q0e = o0.Y;
                    b86 b86 = c86.a;
                    q0e.setValue(b86);
                    pnf.o(o0.o, new g3d(b86));
                    pnf.o(o0.X, new d3d());
                    return;
                }
                return;
            case 3:
                bc7[] bc7Arr3 = ServerHostBottomSheet.G0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                CharSequence text = ((cka) serverHostBottomSheet.E0.T0(serverHostBottomSheet, ServerHostBottomSheet.G0[3])).getText();
                if (text == null || text.length() == 0) {
                    z = true;
                }
                if (!z) {
                    oo6 oo6 = (oo6) serverHostBottomSheet.y0.getValue();
                    String obj2 = text.toString();
                    SharedPreferences.Editor edit = oo6.Y.edit();
                    edit.putString("Custom", obj2);
                    edit.apply();
                    oo6.s(obj2);
                    return;
                }
                return;
            case 4:
                jcd jcd = (jcd) obj;
                FrgBaseSettings frgBaseSettings = jcd.N0;
                if (frgBaseSettings != null) {
                    frgBaseSettings.t1(jcd.M0.a);
                    return;
                }
                return;
            case 5:
                bc7[] bc7Arr4 = SettingsAvatarBottomSheet.C0;
                bc7 bc7 = bc7Arr4[4];
                SettingsAvatarBottomSheet settingsAvatarBottomSheet = (SettingsAvatarBottomSheet) obj;
                fs fsVar = settingsAvatarBottomSheet.B0;
                if (!((Boolean) fsVar.a(settingsAvatarBottomSheet)).booleanValue()) {
                    bc7 bc72 = bc7Arr4[4];
                    fsVar.b(settingsAvatarBottomSheet, Boolean.TRUE);
                    settingsAvatarBottomSheet.getTargetController();
                }
                settingsAvatarBottomSheet.s0(true);
                return;
            case 6:
                Editable text2 = ((tmd) obj).H0.getText();
                if (text2 != null) {
                    text2.clear();
                    return;
                }
                return;
            case 7:
                int i = StickerView.x0;
                ((StickerView) obj).getClass();
                return;
            case 8:
                bc7[] bc7Arr5 = StickersScreen.v0;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                StickersScreen stickersScreen = (StickersScreen) obj;
                m7e m7e = (m7e) stickersScreen.o0().z0.a.getValue();
                intent.putExtra("android.intent.extra.TEXT", m7e != null ? m7e.c : null);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                coc coc = (coc) x53.q0(stickersScreen.getRouter().e());
                if (coc != null) {
                    str = coc.b;
                }
                l6e.c.Z1(intent, str);
                return;
            case 9:
                bc7[] bc7Arr6 = SuggestionsWidget.B0;
                ((SuggestionsWidget) obj).C0();
                return;
            case 10:
                ((vka) ((yka) obj)).b.invoke(view);
                return;
            case 11:
                ((wka) obj).e.invoke(view);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((ywe) obj).dismiss();
                return;
            case 13:
                zef zef = (zef) obj;
                o00 o00 = zef.Y;
                Long l = zef.Z;
                if (o00 != null && l != null) {
                    long longValue = l.longValue();
                    a66 a66 = zef.o;
                    if (a66 != null) {
                        a66.invoke(o00, Long.valueOf(longValue));
                        return;
                    }
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                dif.b((dif) obj);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((drf) ((VpnPanelWidget) obj).b.getValue()).b.o(u9f.c);
                return;
            case 16:
                isf isf = ((lsf) obj).o;
                if (isf != null) {
                    bc7[] bc7Arr7 = RecordControlsWidget.b1;
                    ((RecordControlsWidget) ((y8) isf).a).I0().u().e();
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr8 = WebAppRootScreen.G0;
                zzf z0 = ((WebAppRootScreen) obj).z0();
                z0.getClass();
                z0.C0.o1(z0, zzf.T0[0], pnf.n(z0, (lx3) null, vx3.b, new qzf(z0, (Continuation) null), 1));
                return;
            default:
                x37 x37 = (x37) ((WelcomeScreen) obj).X.getValue();
                x37.getClass();
                x37.a(i24.e(new InputPhoneScreen(), (zu3) null, (zu3) null), "InputPhoneScreen");
                return;
        }
    }

    public /* synthetic */ elb(SettingsAvatarBottomSheet settingsAvatarBottomSheet, int i) {
        this.a = 5;
        this.b = settingsAvatarBottomSheet;
    }
}
