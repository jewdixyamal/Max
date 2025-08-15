package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ux  reason: default package */
public final class ux implements ksd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ux(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void N(bt0 bt0, long j) {
        switch (this.a) {
            case 0:
                hm9.g(bt0.b, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        k2d k2d = bt0.a;
                        while (true) {
                            if (j2 < ((long) 65536)) {
                                j2 += (long) (k2d.c - k2d.b);
                                if (j2 >= j) {
                                    j2 = j;
                                } else {
                                    k2d = k2d.f;
                                }
                            }
                        }
                        wx wxVar = (wx) this.b;
                        wxVar.i();
                        try {
                            ((ksd) this.c).N(bt0, j2);
                            if (!wxVar.j()) {
                                j -= j2;
                            } else {
                                throw wxVar.k((IOException) null);
                            }
                        } catch (IOException e) {
                            e = e;
                            if (wxVar.j()) {
                                e = wxVar.k(e);
                            }
                            throw e;
                        } finally {
                            wxVar.j();
                        }
                    } else {
                        return;
                    }
                }
            default:
                hm9.g(bt0.b, 0, j);
                while (j > 0) {
                    ((oue) this.c).f();
                    k2d k2d2 = bt0.a;
                    int min = (int) Math.min(j, (long) (k2d2.c - k2d2.b));
                    ((OutputStream) this.b).write(k2d2.a, k2d2.b, min);
                    int i = k2d2.b + min;
                    k2d2.b = i;
                    long j3 = (long) min;
                    j -= j3;
                    bt0.b -= j3;
                    if (i == k2d2.c) {
                        bt0.a = k2d2.a();
                        b3d.a(k2d2);
                    }
                }
                return;
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                wx wxVar = (wx) this.b;
                wxVar.i();
                try {
                    ((ksd) this.c).close();
                    if (wxVar.j()) {
                        throw wxVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (wxVar.j()) {
                        e = wxVar.k(e);
                    }
                    throw e;
                } finally {
                    wxVar.j();
                }
            default:
                ((OutputStream) this.b).close();
                return;
        }
    }

    public final void flush() {
        switch (this.a) {
            case 0:
                wx wxVar = (wx) this.b;
                wxVar.i();
                try {
                    ((ksd) this.c).flush();
                    if (wxVar.j()) {
                        throw wxVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (wxVar.j()) {
                        e = wxVar.k(e);
                    }
                    throw e;
                } finally {
                    wxVar.j();
                }
            default:
                ((OutputStream) this.b).flush();
                return;
        }
    }

    public final oue p() {
        switch (this.a) {
            case 0:
                return (wx) this.b;
            default:
                return (oue) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((ksd) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
