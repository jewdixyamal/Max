package defpackage;

import android.content.Context;

/* renamed from: kxc  reason: default package */
public abstract class kxc extends e3 implements hp {
    public final ml0 h = ml0.z(Float.valueOf(this.g.getFloat("app.extra.text.size.sp", 0.0f)));
    public final ml0 i = ml0.z(Integer.valueOf(e("app.extra.text.size.mode", 1)));
    public final ml0 j = ml0.z(Integer.valueOf(p()));
    public final ml0 k = ml0.z(Integer.valueOf(o()));
    public final q0e l = r0e.a(Boolean.valueOf(d("app.pinLock.screenshotEnabled", true)));

    public kxc(Context context, mi5 mi5) {
        super(context, "app.prefs", mi5);
    }

    public final boolean n() {
        return this.g.getBoolean("app.media.load.roaming", false);
    }

    public final int o() {
        return e("app.notification.chats.show", 0);
    }

    public final int p() {
        return e("app.notification.dialogs.show", 0);
    }

    public final xdf q() {
        String string = this.g.getString("app.media.video.compress", (String) null);
        return string == null ? xdf.OPTIMAL : xdf.valueOf(string);
    }

    public final boolean r() {
        return this.g.getBoolean("app.privacy.safe_mode", false);
    }

    public final void s(int i2) {
        k(i2, "app.notification.chats.show");
        if (i2 != 1) {
            k(i2, "app.notification.chats.show.last");
        }
        this.k.e(Integer.valueOf(i2));
    }

    public final void t(boolean z) {
        j("app.pinLock.screenshotEnabled", z);
        this.l.m((Object) null, Boolean.valueOf(z));
    }
}
