package defpackage;

import java.util.Map;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: clf  reason: default package */
public final /* synthetic */ class clf implements d38, qj3 {
    public final /* synthetic */ dlf a;
    public final /* synthetic */ l20 b;
    public final /* synthetic */ k20 c;

    public /* synthetic */ clf(dlf dlf, k20 k20, l20 l20) {
        this.a = dlf;
        this.c = k20;
        this.b = l20;
    }

    public void accept(Object obj) {
        dlf dlf = this.a;
        dlf.getClass();
        String str = this.b.r;
        dlf.a.getClass();
        lff.a.put(str, new kff((ff5) obj, System.currentTimeMillis()));
        ad adVar = (ad) dlf.c.get();
        if (adVar != null) {
            k20 k20 = this.c;
            if (oag.t(k20.i)) {
                adVar.f("ACTION_VIDEO_FETCH_OK");
            } else {
                adVar.g("ACTION_VIDEO_FETCH_OK", k20.i);
            }
        }
    }

    public void d(j28 j28) {
        dlf dlf = this.a;
        dlf.getClass();
        k20 k20 = this.c;
        String str = k20.h;
        if (oag.t(str) || x9g.b(str) || !oag.t(ypf.b(str)) || !oag.t(a37.b(str))) {
            if (k20.g) {
                if (k20.k > dlf.g.a.n()) {
                    if (!j28.h()) {
                        j28.onError(new FetcherException(7, "live stream not started"));
                        return;
                    }
                    return;
                }
            }
            l20 l20 = this.b;
            String b2 = dlf.b(l20);
            if (oag.t(b2)) {
                dlf.a.getClass();
                Map map = lff.a;
                String str2 = l20.r;
                kff kff = (kff) map.get(str2);
                ff5 ff5 = null;
                if (kff != null) {
                    if (kff.b + 3600000 > System.currentTimeMillis()) {
                        ff5 = kff.a;
                    } else {
                        map.remove(str2);
                    }
                }
                if (ff5 == null) {
                    if (!j28.h()) {
                        j28.b();
                    }
                } else if (!j28.h()) {
                    j28.a(ff5);
                }
            } else {
                hm9.m("VideoRipper", "getVideoContent: local path = %s", b2);
                if (!j28.h()) {
                    j28.b();
                }
            }
        } else if (!j28.h()) {
            j28.onError(new FetcherException(5, "Video hosting in black list"));
        }
    }

    public /* synthetic */ clf(dlf dlf, l20 l20, k20 k20) {
        this.a = dlf;
        this.b = l20;
        this.c = k20;
    }
}
