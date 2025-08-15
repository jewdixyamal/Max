package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: m46  reason: default package */
public final class m46 implements sj3 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ FrgAttachVideo b;

    public m46(FrgAttachVideo frgAttachVideo, HashMap hashMap) {
        this.b = frgAttachVideo;
        this.a = hashMap;
    }

    public final void accept(Object obj) {
        int intValue;
        mqb mqb = (mqb) obj;
        hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onQualitySelected %s", mqb);
        for (Map.Entry entry : this.a.entrySet()) {
            if (((nqb) entry.getValue()).a == mqb) {
                mze mze = (mze) entry.getKey();
                lj9 lj9 = this.b.N1;
                if (lj9 != null) {
                    hm9.m("lj9", "selectTrackContainer %s", mze);
                    if (lj9.b2()) {
                        bq7 bq7 = (bq7) lj9.c;
                        if (bq7.f != null) {
                            u65 u65 = bq7.b;
                            u65.getClass();
                            hm9.m("u65", "selectTrackContainer: %s", mze);
                            u65.u();
                            kad kad = u65.b;
                            kad.getClass();
                            ((t33) kad.X).k(mze.a.X, "app.video.play.quality");
                            if (mze == mze.c) {
                                bf4 bf4 = (bf4) kad.a;
                                ez7 ez7 = bf4.c;
                                if (ez7 != null && (intValue = ((Integer) kad.d(ez7).first).intValue()) >= 0) {
                                    pe4 b2 = bf4.b();
                                    SparseArray sparseArray = b2.M;
                                    Map map = (Map) sparseArray.get(intValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(intValue);
                                    }
                                    bf4.h(b2);
                                }
                            } else {
                                kad.h(mze.a.X);
                            }
                        }
                        ef7 ef7 = lj9.Y;
                        if (ef7.get() != null) {
                            ((ad) ef7.get()).d(mze.a.X, "VIDEO_QUALITY_SELECTED");
                        }
                    }
                }
            }
        }
    }
}
