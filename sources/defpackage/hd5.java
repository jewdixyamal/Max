package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: hd5  reason: default package */
public final class hd5 {
    public static final /* synthetic */ int h = 0;
    public final pk a;
    public final fme b;
    public final ztc c;
    public final ztc d;
    public final eoe e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final hc3 g = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [hc3, java.lang.Object] */
    public hd5(pk pkVar, fme fme, ztc ztc, ztc ztc2, av0 av0, eoe eoe) {
        this.a = pkVar;
        this.b = fme;
        this.c = ztc;
        this.d = ztc2;
        this.e = eoe;
        av0.d(this);
    }

    @uae
    public void onEvent(cu cuVar) {
        xrd xrd = (xrd) this.f.get(Long.valueOf(cuVar.a));
        if (xrd != null) {
            xrd.a(cuVar);
        }
    }

    @uae
    public void onEvent(pu puVar) {
        xrd xrd = (xrd) this.f.get(Long.valueOf(puVar.a));
        if (xrd != null) {
            xrd.a(puVar);
        }
    }

    @uae
    public void onEvent(ju juVar) {
        xrd xrd = (xrd) this.f.get(Long.valueOf(juVar.a));
        if (xrd != null) {
            xrd.a(juVar);
        }
    }

    @uae
    public void onEvent(mu muVar) {
        xrd xrd = (xrd) this.f.get(Long.valueOf(muVar.a));
        if (xrd != null) {
            xrd.a(muVar);
        }
    }

    @uae
    public void onEvent(oi0 oi0) {
        xrd xrd = (xrd) this.f.get(Long.valueOf(oi0.a));
        if (xrd != null) {
            xrd.onError(new TamErrorException(oi0.b));
        }
    }
}
