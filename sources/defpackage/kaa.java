package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: kaa  reason: default package */
public final class kaa {
    public final Context a;
    public final xs b = ay7.d("ru.oneme.app.dialogs", "ru.oneme.app.chats", "ru.oneme.app.inapp.2");
    public final xs c = ay7.d("ru.oneme.app.new.incomingCalls.", "ru.oneme.app.new.activeCalls");
    public final xs d = ay7.d("ru.oneme.app.misc", "ru.oneme.app.fileUpload", "ru.oneme.app.media");
    public final khe e = new khe(new zj7(17, this));

    public kaa(Context context, p84 p84) {
        this.a = context;
        p84.getClass();
    }

    public final void a(int i, String str) {
        ((NotificationManager) this.e.getValue()).createNotificationChannelGroup(new NotificationChannelGroup(str, this.a.getString(i)));
    }

    public final String b(String str) {
        if (this.b.contains(str)) {
            return "ru.oneme.app.notifications.group.chats";
        }
        if (this.d.contains(str)) {
            return "ru.oneme.app.notifications.group.other";
        }
        if (this.c.contains(str)) {
            return "ru.oneme.app.notifications.group.calls";
        }
        return null;
    }
}
