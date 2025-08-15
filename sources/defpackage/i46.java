package defpackage;

import android.content.Context;
import android.os.Handler;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: i46  reason: default package */
public final /* synthetic */ class i46 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ i46(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    public final void run() {
        FrgAttachPhoto frgAttachPhoto = this.b;
        switch (this.a) {
            case 0:
                Context d0 = frgAttachPhoto.d0();
                if (d0 != null) {
                    int i = jpc.E;
                    Handler handler = a14.i;
                    a14.N(0, d0, d0.getString(i));
                    return;
                }
                return;
            default:
                frgAttachPhoto.F1(false);
                return;
        }
    }
}
