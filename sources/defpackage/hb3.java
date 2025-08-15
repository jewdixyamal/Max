package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: hb3  reason: default package */
public final class hb3 extends qy9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void q(f2a f2a) {
        switch (this.a) {
            case 0:
                ((pa3) this.b).i(new i0a(f2a));
                return;
            case 1:
                ((f38) this.b).a(new i38(f2a, 0));
                return;
            case 2:
                ez9 ez9 = new ez9(f2a);
                f2a.c(ez9);
                try {
                    ((s0a) this.b).e(ez9);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    if (!ez9.e(th)) {
                        j47.Z(th);
                        return;
                    }
                    return;
                }
            case 3:
                Object[] objArr = (Object[]) this.b;
                g0a g0a = new g0a(f2a, objArr);
                f2a.c(g0a);
                if (!g0a.o) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length && !g0a.X) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            g0a.a.onError(new NullPointerException(wg0.g(i, "The element at index ", " is null")));
                            return;
                        } else {
                            g0a.a.e(obj);
                            i++;
                        }
                    }
                    if (!g0a.X) {
                        g0a.a.b();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                try {
                    Iterator it = ((Iterable) this.b).iterator();
                    try {
                        if (!it.hasNext()) {
                            iz4.a(f2a);
                            return;
                        }
                        j0a j0a = new j0a(f2a, it);
                        f2a.c(j0a);
                        if (!j0a.o) {
                            while (!j0a.c) {
                                try {
                                    Object next = j0a.b.next();
                                    Objects.requireNonNull(next, "The iterator returned a null value");
                                    j0a.a.e(next);
                                    if (!j0a.c) {
                                        try {
                                            if (!j0a.b.hasNext()) {
                                                if (!j0a.c) {
                                                    j0a.a.b();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            c37.B(th2);
                                            j0a.a.onError(th2);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    c37.B(th3);
                                    j0a.a.onError(th3);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        c37.B(th4);
                        iz4.b(th4, f2a);
                        return;
                    }
                } catch (Throwable th5) {
                    c37.B(th5);
                    iz4.b(th5, f2a);
                    return;
                }
            case 5:
                ((wq5) ((ypb) this.b)).d(new k0a(f2a));
                return;
            case 6:
                ((iqd) this.b).k(new i38(f2a, 1));
                return;
            default:
                if (!tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                    f2a.c(new w6(1, ft.c));
                    f2a.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
                    return;
                }
                View view = (View) this.b;
                imf imf = new imf(view, f2a);
                f2a.c(imf);
                view.setOnClickListener(imf);
                return;
        }
    }
}
