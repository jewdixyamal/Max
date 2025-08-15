package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;

/* renamed from: dme  reason: default package */
public final /* synthetic */ class dme implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fme b;
    public final /* synthetic */ int c;

    public /* synthetic */ dme(fme fme) {
        this.a = 4;
        this.b = fme;
        this.c = 1;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                wq5 wq5 = (wq5) obj;
                fme fme = this.b;
                fme.getClass();
                dme dme = new dme(fme, this.c, 1);
                wq5.getClass();
                int i = wq5.a;
                hm9.j0(i, "maxConcurrency");
                hm9.j0(i, "bufferSize");
                if (!(wq5 instanceof msc)) {
                    return new jr5(wq5, dme, i, i);
                }
                Object obj2 = ((msc) wq5).get();
                return obj2 == null ? fr5.b : new zr5(obj2, dme);
            case 1:
                Throwable th = (Throwable) obj;
                fme fme2 = this.b;
                fme2.getClass();
                if (fme.d(th) && !fme.a(((jbd) ((hbd) fme2.a.getValue())).h)) {
                    hm9.m("fme", "retryWhenCommonError: no connection, await for connection available", new Object[0]);
                    return new p0(new gr5(2, new oz9(fme2.b(), new m2e(27), ft.e, ft.d)));
                } else if (fme.c(th)) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int i2 = wq5.a;
                    ztc a2 = muc.a();
                    Objects.requireNonNull(timeUnit, "unit is null");
                    Objects.requireNonNull(a2, "scheduler is null");
                    return new is5(Math.max(0, (long) this.c), timeUnit, a2);
                } else {
                    int i3 = wq5.a;
                    Objects.requireNonNull(th, "throwable is null");
                    return new gr5(0, new t66(th));
                }
            case 2:
                fme fme3 = this.b;
                fme3.getClass();
                return ((qy9) obj).h(new dme(fme3, this.c, 3));
            case 3:
                Throwable th2 = (Throwable) obj;
                fme fme4 = this.b;
                fme4.getClass();
                if (fme.d(th2) && !fme.a(((jbd) ((hbd) fme4.a.getValue())).h)) {
                    hm9.m("fme", "retryWhenCommonErrorObs: no connection, await for connection available", new Object[0]);
                    return new oz9(fme4.b(), new m2e(29), ft.e, ft.d);
                } else if (!fme.c(th2)) {
                    return qy9.g(th2);
                } else {
                    hm9.l("fme", "retryWhenCommonErrorObs: common error", th2);
                    return qy9.u((long) this.c, TimeUnit.SECONDS, muc.a());
                }
            default:
                Throwable th3 = (Throwable) obj;
                if (!(th3 instanceof HttpErrorException)) {
                    return qy9.g(th3);
                }
                if (th3 instanceof HttpUrlExpiredException) {
                    hm9.p("ime", "retryWhenTamHttpError: skipped retry on TamHttpUrlExpiredException", (Throwable) null);
                    return qy9.g(th3);
                }
                HttpErrorException httpErrorException = (HttpErrorException) th3;
                if (nu0.x(httpErrorException.a)) {
                    hm9.p("ime", "retryWhenTamHttpError: critical upload error=" + httpErrorException, (Throwable) null);
                    return qy9.g(th3);
                }
                fme fme5 = this.b;
                if (!fme.a(((jbd) ((hbd) fme5.a.getValue())).h)) {
                    hm9.m("ime", "retryWhenTamHttpError: no connection, await for connection available", new Object[0]);
                    return new oz9(fme5.b(), new hme(0), ft.e, ft.d);
                }
                hm9.p("ime", "retryWhenTamHttpError: http error", httpErrorException);
                return qy9.u((long) this.c, TimeUnit.SECONDS, muc.a());
        }
    }

    public /* synthetic */ dme(fme fme, int i, int i2) {
        this.a = i2;
        this.b = fme;
        this.c = i;
    }
}
