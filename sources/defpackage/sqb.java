package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: sqb  reason: default package */
public final class sqb implements e15 {
    public static final HashMap o;
    public final e15 a;
    public final yw1 b;
    public final bj6 c;

    static {
        HashMap hashMap = new HashMap();
        o = hashMap;
        hashMap.put(1, mb0.i);
        hashMap.put(8, mb0.g);
        hashMap.put(6, mb0.f);
        hashMap.put(5, mb0.e);
        hashMap.put(4, mb0.d);
        hashMap.put(0, mb0.h);
    }

    public sqb(yw1 yw1, e15 e15, bj6 bj6) {
        this.a = e15;
        this.b = yw1;
        this.c = bj6;
    }

    public final boolean m(int i) {
        if (this.a.m(i)) {
            mb0 mb0 = (mb0) o.get(Integer.valueOf(i));
            if (mb0 != null) {
                Iterator it = this.c.f(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk != null && videoQualityQuirk.a(this.b, mb0)) {
                        if ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).b()) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final f15 n(int i) {
        if (!m(i)) {
            return null;
        }
        return this.a.n(i);
    }
}
