package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: cdb  reason: default package */
public final /* synthetic */ class cdb implements k64 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Enum c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cdb(long j, reb reb, qeb qeb) {
        this.b = j;
        this.c = reb;
        this.o = qeb;
    }

    public final Object a() {
        ActivityWrapperWidget activityWrapperWidget;
        switch (this.a) {
            case 0:
                hdb hdb = (hdb) this.c;
                int ordinal = hdb.ordinal();
                gdb gdb = (gdb) this.o;
                long j = this.b;
                if (ordinal == 0) {
                    se5 se5 = (se5) ((qe5) gdb.b.getValue());
                    se5.getClass();
                    if (se5.n(PmsKey.f10avatarsscreenenabled, false)) {
                        return new ProfileAvatarsScreen(j, hdb);
                    }
                    String b2 = nec.a(ActProfilePhoto.class).b();
                    if (b2 != null) {
                        activityWrapperWidget = new ActivityWrapperWidget(b2, new jh2(j, 3));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (ordinal == 1) {
                    return e5f.a;
                } else {
                    if (ordinal == 2) {
                        se5 se52 = (se5) ((qe5) gdb.b.getValue());
                        se52.getClass();
                        if (se52.n(PmsKey.f10avatarsscreenenabled, false)) {
                            return new ProfileAvatarsScreen(j, hdb);
                        }
                        String b3 = nec.a(ActContactAvatars.class).b();
                        if (b3 != null) {
                            activityWrapperWidget = new ActivityWrapperWidget(b3, new jh2(j, 4));
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return activityWrapperWidget;
            default:
                return new ProfileChangeLinkScreen(this.b, (reb) this.c, (qeb) this.o);
        }
    }

    public /* synthetic */ cdb(hdb hdb, gdb gdb, long j) {
        this.c = hdb;
        this.o = gdb;
        this.b = j;
    }
}
