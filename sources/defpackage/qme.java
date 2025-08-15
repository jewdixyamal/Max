package defpackage;

import android.view.TextureView;
import ru.ok.messages.video.widgets.VideoView;

/* renamed from: qme  reason: default package */
public final class qme extends TextureView {
    public pme a;

    public final void onDetachedFromWindow() {
        slf slf;
        pme pme = this.a;
        if (!(pme == null || (slf = ((VideoView) ((gte) pme).b).o) == null)) {
            slf.f1();
        }
        super.onDetachedFromWindow();
    }

    public void setListener(pme pme) {
        this.a = pme;
    }
}
