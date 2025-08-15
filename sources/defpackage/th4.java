package defpackage;

import android.net.Uri;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* renamed from: th4  reason: default package */
public final class th4 implements uk {
    public final /* synthetic */ int a;
    public final vk b;
    public final a95 c;
    public final Provider d;
    public volatile boolean e;
    public final Object f;
    public final Object g;

    public th4(up6 up6, ax axVar, rl rlVar, Provider provider) {
        this.a = 1;
        this.b = up6;
        this.c = axVar;
        this.f = rlVar;
        this.d = provider;
        this.g = new ReentrantLock();
    }

    public final Object a(yk ykVar) {
        ReentrantLock reentrantLock;
        switch (this.a) {
            case 0:
                jxc c2 = this.c.c();
                String str = c2.a.d;
                try {
                    if (this.e || str == null) {
                        synchronized (this.g) {
                            if (this.e || str == null) {
                                c(c2, str);
                            }
                        }
                    }
                    return ((up6) this.b).a(ykVar, this.c.c().a);
                } catch (ApiInvocationException e2) {
                    if (ykVar.getScopeAfter() != ll.a || !a14.A(e2)) {
                        throw e2;
                    }
                    a95 a95 = this.c;
                    jxc c3 = a95.c();
                    c(c3, c3.a.d);
                    return ((up6) this.b).a(ykVar, a95.c().a);
                } catch (ApiScopeException unused) {
                    a95 a952 = this.c;
                    jxc c4 = a952.c();
                    c(c4, c4.a.d);
                    return ((up6) this.b).a(ykVar, a952.c().a);
                }
            default:
                jxc c5 = this.c.c();
                String str2 = c5.a.d;
                try {
                    reentrantLock = (ReentrantLock) this.g;
                    reentrantLock.lock();
                    if (this.e || str2 == null) {
                        b(c5, str2);
                    }
                    reentrantLock.unlock();
                    return ((up6) this.b).a(ykVar, this.c.c().a);
                } catch (ApiInvocationException e3) {
                    if (ykVar.getScopeAfter() != ll.a || !a14.A(e3)) {
                        throw e3;
                    }
                    a95 a953 = this.c;
                    jxc c6 = a953.c();
                    b(c6, c6.a.d);
                    return ((up6) this.b).a(ykVar, a953.c().a);
                } catch (ApiScopeException unused2) {
                    a95 a954 = this.c;
                    jxc c7 = a954.c();
                    b(c7, c7.a.d);
                    return ((up6) this.b).a(ykVar, a954.c().a);
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    public void b(jxc jxc, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            if (!tpa.f(str, this.c.c().a.d)) {
                if (this.e) {
                }
                reentrantLock.unlock();
            }
            ql d2 = ((rl) this.f).d();
            jxc d3 = jxc.d(Uri.parse(d2.b));
            this.c.d(d3);
            d(d3, d2.a);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void c(jxc jxc, String str) {
        synchronized (this.g) {
            try {
                if (Objects.equals(str, this.c.c().a.d)) {
                    glc glc = new glc((fl) new j80(((dwe) this.f).c(), (String) this.d.get()), (za7) eu7.g);
                    eu7 eu7 = (eu7) ((up6) this.b).a(glc, jxc.a);
                    this.c.d(jxc.c(eu7.b, eu7.c));
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(jxc jxc, String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.g;
        reentrantLock.lock();
        try {
            glc glc = new glc((fl) new j80(str, (String) this.d.get()), (za7) eu7.g);
            eu7 eu7 = (eu7) ((up6) this.b).a(glc, jxc.a);
            this.c.d(jxc.c(eu7.b, eu7.c));
            this.e = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public th4(up6 up6, jt3 jt3, dwe dwe, Provider provider) {
        this.a = 0;
        this.g = new Object();
        this.e = false;
        this.b = up6;
        this.c = jt3;
        this.f = dwe;
        this.d = provider;
    }
}
