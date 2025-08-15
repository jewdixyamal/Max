package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* renamed from: r46  reason: default package */
public final class r46 implements zu6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WeakReference o;

    public /* synthetic */ r46(long j, String str, WeakReference weakReference, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.o = weakReference;
    }

    public final void A(String str) {
        switch (this.a) {
            case 0:
                ((y8a) vl.b()).r().c(new fn4(this.b, 0, "", str, (String) null));
                return;
            default:
                ((y8a) vl.b()).r().c(new fn4(this.b, 0, "", str, (String) null));
                return;
        }
    }

    public final void k() {
        switch (this.a) {
            case 0:
                ((y8a) vl.b()).r().c(new hn4(this.c, (String) null, this.b, 0));
                return;
            default:
                ((y8a) vl.b()).r().c(new hn4(this.c, (String) null, this.b, 0));
                return;
        }
    }

    public final void w() {
        switch (this.a) {
            case 0:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.o.get();
                if (frgContactAvatar != null && frgContactAvatar.g1() != null) {
                    frgContactAvatar.q1();
                    return;
                }
                return;
            default:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) this.o.get();
                if (frgProfilePhoto != null && frgProfilePhoto.g1() != null) {
                    frgProfilePhoto.q1();
                    return;
                }
                return;
        }
    }
}
