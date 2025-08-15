package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: j46  reason: default package */
public final /* synthetic */ class j46 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ j46(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q1();
                return;
            case 1:
                this.b.G1();
                return;
            default:
                b b0 = this.b.b0();
                if (b0 != null) {
                    b0.finish();
                    b0.overridePendingTransition(0, esb.fullscreen_to_pip);
                    return;
                }
                return;
        }
    }
}
