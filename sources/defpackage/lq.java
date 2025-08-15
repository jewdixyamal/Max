package defpackage;

import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: lq  reason: default package */
public final /* synthetic */ class lq implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                se5 se5 = (se5) ((qe5) ((gdb) this.b).b.getValue());
                se5.getClass();
                return se5.n(PmsKey.f7appearancemultithemescreenenabled, false) ? new AppearanceSettingsMultiThemeScreen() : new AppearanceSettingsScreen();
            case 1:
                return new jr3((lr3) this.b);
            case 2:
                se5 se52 = (se5) ((qe5) ((jid) this.b).b.getValue());
                se52.getClass();
                if (se52.n(PmsKey.f95newsettingsstoragescreenenabled, false)) {
                    return new SettingsStorageScreen();
                }
                String b2 = nec.a(ActSettings.class).b();
                if (b2 != null) {
                    return new ActivityWrapperWidget(b2, new w8c(7));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                return new ChatTitleIconScreen((long[]) this.b, pyd.CHAT);
        }
    }
}
