package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: u8g  reason: default package */
public final class u8g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8g(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                v8g v8g = (v8g) this.c;
                try {
                    fm7 fm7 = (fm7) v8g.B0.get();
                    if (fm7 == null) {
                        a14 u = a14.u();
                        String str2 = v8g.D0;
                        u.q(str2, v8g.X.c + " returned a null result. Treating it as a failure.");
                    } else {
                        a14 u2 = a14.u();
                        String str3 = v8g.D0;
                        u2.n(str3, v8g.X.c + " returned a " + fm7 + ".");
                        v8g.s0 = fm7;
                    }
                } catch (CancellationException e) {
                    a14 u3 = a14.u();
                    String str4 = v8g.D0;
                    u3.y(str + " was cancelled", e);
                } catch (InterruptedException | ExecutionException e2) {
                    a14 u4 = a14.u();
                    String str5 = v8g.D0;
                    u4.r(str5, str + " failed because it threw an exception/error", e2);
                } catch (Throwable th) {
                    v8g.b();
                    throw th;
                }
                v8g.b();
                return;
            case 1:
                im7 im7 = (im7) this.c;
                Object obj = ((rw4) this.b).b;
                if (obj == null) {
                    im7.getClass();
                    return;
                }
                try {
                    im7.f(obj);
                    return;
                } catch (RuntimeException e3) {
                    im7.getClass();
                    throw e3;
                }
            case 2:
                if (((ukg) ((Task) this.b)).d) {
                    ((ogg) this.c).o.o();
                    return;
                }
                try {
                    ((ogg) this.c).o.n(((ogg) this.c).c.u((Task) this.b));
                    return;
                } catch (RuntimeExecutionException e4) {
                    if (e4.getCause() instanceof Exception) {
                        ((ogg) this.c).o.m((Exception) e4.getCause());
                        return;
                    } else {
                        ((ogg) this.c).o.m(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((ogg) this.c).o.m(e5);
                    return;
                }
            case 3:
                cjg cjg = (cjg) this.b;
                Context context = (Context) cjg.a;
                String string = cjg.i(context).getString("app_set_id", (String) null);
                long j = -1;
                long j2 = cjg.i((Context) cjg.a).getLong("app_set_id_last_used_time", -1);
                if (j2 != -1) {
                    j = 33696000000L + j2;
                }
                qne qne = (qne) this.c;
                if (string == null || System.currentTimeMillis() > j) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            if (valueOf.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(valueOf);
                            }
                            throw new Exception("Failed to store the app set ID.");
                        }
                        cjg.j(context);
                        SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
                        if (!sharedPreferences.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            if (valueOf2.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(valueOf2);
                            }
                            throw new Exception("Failed to store the app set ID creation time.");
                        }
                    } catch (wig e6) {
                        qne.a(e6);
                        return;
                    }
                } else {
                    try {
                        cjg.j(context);
                    } catch (wig e7) {
                        qne.a(e7);
                        return;
                    }
                }
                qne.b(new mp(string, 1));
                return;
            case 4:
                synchronized (((gig) this.c).c) {
                    try {
                        l3a l3a = (l3a) ((gig) this.c).o;
                        if (l3a != null) {
                            l3a.l((Task) this.b);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 5:
                synchronized (((gig) this.c).c) {
                    try {
                        x3a x3a = (x3a) ((gig) this.c).o;
                        if (x3a != null) {
                            x3a.a(((Task) this.b).f());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                gig gig = (gig) this.c;
                try {
                    ukg k = ((sbe) gig.c).k(((Task) this.b).f());
                    ok4 ok4 = xne.b;
                    k.d(ok4, gig);
                    k.c(ok4, gig);
                    k.a(ok4, gig);
                    return;
                } catch (RuntimeExecutionException e8) {
                    if (e8.getCause() instanceof Exception) {
                        gig.onFailure((Exception) e8.getCause());
                        return;
                    } else {
                        gig.onFailure(e8);
                        return;
                    }
                } catch (CancellationException unused) {
                    gig.d();
                    return;
                } catch (Exception e9) {
                    gig.onFailure(e9);
                    return;
                }
        }
    }

    public /* synthetic */ u8g(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
