package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* renamed from: tq7  reason: default package */
public final class tq7 implements dab {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ContentResolver c;

    public /* synthetic */ tq7(Executor executor, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executor;
        this.c = contentResolver;
    }

    public final void a(fi0 fi0, eab eab) {
        switch (this.a) {
            case 0:
                oj0 oj0 = (oj0) eab;
                hab hab = oj0.c;
                oj0.h("local", "thumbnail_bitmap");
                fi0 fi02 = fi0;
                hab hab2 = hab;
                eab eab2 = eab;
                eab eab3 = eab;
                sq7 sq7 = new sq7(this, fi02, hab2, eab2, hab, eab3, oj0.a, new CancellationSignal());
                oj0.a(new fp7(sq7, 2));
                this.b.execute(sq7);
                return;
            default:
                oj0 oj02 = (oj0) eab;
                hab hab3 = oj02.c;
                oj02.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                ip7 ip7 = new ip7(this, fi0, hab3, eab, hab3, eab, oj02.a);
                oj02.a(new fp7(ip7, 3));
                this.b.execute(ip7);
                return;
        }
    }
}
