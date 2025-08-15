package defpackage;

import android.content.Intent;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: gk9  reason: default package */
public final /* synthetic */ class gk9 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk9 b;

    public /* synthetic */ gk9(hk9 hk9, int i) {
        this.a = i;
        this.b = hk9;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                hk9 hk9 = this.b;
                long f = ((bq7) hk9.Y).f();
                hk9.u0 = f;
                if (f > hk9.t0) {
                    hk9.a2();
                    return;
                } else {
                    ((nl9) ((kk9) hk9.b)).y0.setPointerPosition(f);
                    return;
                }
            default:
                hk9 hk92 = this.b;
                long j = hk92.s0;
                long j2 = hk92.t0;
                FrgTrimVideo frgTrimVideo = hk92.c;
                frgTrimVideo.getClass();
                Intent intent = new Intent();
                intent.putExtra("ru.ok.tamtam.extra.START_POSITION", j);
                intent.putExtra("ru.ok.tamtam.extra.END_POSITION", j2);
                intent.putExtra("ru.ok.tamtam.extra.THUMBNAIL_URI", (String) obj);
                frgTrimVideo.g1().setResult(-1, intent);
                frgTrimVideo.r1();
                frgTrimVideo.e1();
                return;
        }
    }
}
