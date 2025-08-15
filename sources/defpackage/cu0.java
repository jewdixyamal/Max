package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cu0  reason: default package */
public final /* synthetic */ class cu0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cu0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                if (!((AtomicBoolean) this.b).get()) {
                    du0 du0 = (du0) this.c;
                    rxd rxd = du0.g;
                    ww0 ww0 = (ww0) this.o;
                    g05 W = rxd.W((tpd) ww0);
                    Class<du0> cls = du0.class;
                    pq9 pq9 = du0.f;
                    if (W != null) {
                        ta5.d(cls, ww0.c(), "Found image for %s in staging area");
                        pq9.getClass();
                    } else {
                        ta5.d(cls, ww0.c(), "Did not find image for %s in staging area");
                        pq9.getClass();
                        W = null;
                        qq8 e = du0.e((tpd) ww0);
                        if (e == null) {
                            return W;
                        }
                        v84 o0 = o43.o0(e);
                        try {
                            g05 g05 = new g05(o0);
                            o43.S(o0);
                            W = g05;
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            o43.S(o0);
                            throw th;
                        }
                    }
                    if (Thread.interrupted()) {
                        if (ta5.a.i(2)) {
                            ta5.a.b(cls.getSimpleName());
                        }
                        W.close();
                        throw new InterruptedException();
                    }
                    return W;
                }
                throw new CancellationException();
            case 1:
                ah4 ah4 = (ah4) this.b;
                ah4.getClass();
                return ah4.a.submit(new wt1((Callable) this.c, 28, (bkg) this.o));
            default:
                WorkDatabase workDatabase = ((y9b) this.b).X;
                k8g z = workDatabase.z();
                String str = (String) this.o;
                ((ArrayList) this.c).addAll(z.r(str));
                return workDatabase.y().l(str);
        }
    }
}
