package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: h46  reason: default package */
public final /* synthetic */ class h46 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ h46(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FrgAttachPhoto frgAttachPhoto = this.b;
                frgAttachPhoto.J1.r(frgAttachPhoto.D1, frgAttachPhoto.C1);
                b b0 = frgAttachPhoto.b0();
                if (b0 instanceof im) {
                    b0.invalidateOptionsMenu();
                    return;
                }
                return;
            default:
                n46 u1 = this.b.r1();
                if (u1 != null) {
                    ((ActAttachesView) u1).e();
                    return;
                }
                return;
        }
    }
}
