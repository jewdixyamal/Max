package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* renamed from: gi8  reason: default package */
public final class gi8 implements n3b {
    public final WeakReference a;
    public final WeakReference b;

    public gi8(ii8 ii8, x4b x4b) {
        this.a = new WeakReference(ii8);
        this.b = new WeakReference(x4b);
    }

    public final void G(int i, tb8 tb8) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                m4b m4b2 = r2;
                qad qad2 = qad;
                m4b m4b3 = new m4b(m4b.a, i, qad2, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, m4b.A, m4b.B, m4b.C, m4b.D, m4b.E);
                b2.r = m4b2;
                b2.c.a(true, true);
                try {
                    b2.h.h.s(tb8);
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void O(boolean z) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.k(z);
                b2.c.a(true, true);
                try {
                    b2.h.h.C(z);
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void S(zz3 zz3) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                PlaybackException playbackException = m4b.a;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                p0f p0f = m4b.D;
                j0f j0f = m4b.E;
                m4b m4b2 = r2;
                int i = m4b.b;
                m4b m4b3 = new m4b(playbackException, i, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, zz3, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, m4b.A, m4b.B, m4b.C, p0f, j0f);
                b2.r = m4b2;
                b2.c.a(true, true);
            }
        }
    }

    public final void X(p0f p0f) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.b(p0f);
                b2.c.a(true, false);
                b2.c(new wa8(7));
            }
        }
    }

    public final void a(int i) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                b2.r = m4b.d(m4b.u, i, m4b.t);
                b2.c.a(true, true);
                try {
                    b2.h.h.w();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void a0(long j) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, j, m4b.B, m4b.C, m4b.D, m4b.E);
                b2.r = m4b2;
                b2.c.a(true, true);
                try {
                    b2.h.h.getClass();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final ii8 b() {
        return (ii8) this.a.get();
    }

    public final void b0(gd8 gd8) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                long j = m4b.B;
                long j2 = m4b.C;
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, gd8, m4b.A, j, j2, m4b.D, m4b.E);
                b2.r = m4b2;
                b2.c.a(true, true);
                try {
                    b2.h.h.E();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void c(boolean z) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, z, m4b.z, m4b.A, m4b.B, m4b.C, m4b.D, m4b.E);
                ii8 ii8 = b2;
                ii8.r = m4b2;
                ii8.c.a(true, true);
                try {
                    ii8.h.h.getClass();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
                ii8.t();
            }
        }
    }

    public final void c0(gd8 gd8) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            b2.r = b2.r.g(gd8);
            b2.c.a(true, true);
            try {
                b2.h.h.z(gd8);
            } catch (RemoteException e) {
                z04.v("Exception in using media1 API", e);
            }
        }
    }

    public final void d(int i, boolean z) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                b2.r = m4b.d(i, m4b.x, z);
                b2.c.a(true, true);
                try {
                    b2.h.h.t();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void d0(long j) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, m4b.A, j, m4b.C, m4b.D, m4b.E);
                b2.r = m4b2;
                b2.c.a(true, true);
                try {
                    b2.h.h.getClass();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void f(float f) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            b2.r = b2.r.p(f);
            b2.c.a(true, true);
            try {
                b2.h.h.getClass();
            } catch (RemoteException e) {
                z04.v("Exception in using media1 API", e);
            }
        }
    }

    public final void f0(mue mue, int i) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            x4b x4b = (x4b) this.b.get();
            if (x4b != null) {
                b2.r = b2.r.n(mue, x4b.K(), i);
                b2.c.a(false, true);
                try {
                    b2.h.h.D(mue);
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void h(int i) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            x4b x4b = (x4b) this.b.get();
            if (x4b != null) {
                b2.r = b2.r.f(i, x4b.X());
                b2.c.a(true, true);
                try {
                    qi8 qi8 = b2.h.h;
                    x4b.X();
                    qi8.v();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void i(int i, boolean z) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.c(i, z);
                b2.c.a(true, true);
                try {
                    b2.h.h.q(i, z);
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void i0() {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            b2.c(new wa8(9));
        }
    }

    public final void n(boolean z) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, z, m4b.w, m4b.z, m4b.A, m4b.B, m4b.C, m4b.D, m4b.E);
                ii8 ii8 = b2;
                ii8.r = m4b2;
                ii8.c.a(true, true);
                try {
                    ii8.h.h.r();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
                ii8.t();
            }
        }
    }

    public final void onRepeatModeChanged(int i) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.i(i);
                b2.c.a(true, true);
                try {
                    b2.h.h.B(i);
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void p0(c3b c3b) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.e(c3b);
                b2.c.a(true, true);
                try {
                    b2.h.h.u();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void q(p3b p3b, p3b p3b2, int i) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.h(p3b, p3b2, i);
                b2.c.a(true, true);
                try {
                    b2.h.h.A();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void q0(k3b k3b) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.f(k3b);
            }
        }
    }

    public final void t0(ui4 ui4) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                long j = m4b.B;
                long j2 = m4b.C;
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, ui4, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, m4b.A, j, j2, m4b.D, m4b.E);
                b2.r = m4b2;
                b2.c.a(true, true);
                try {
                    b2.h.h.p();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void u(h30 h30) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.a(h30);
                b2.c.a(true, true);
                try {
                    b2.h.h.o(h30);
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void u0(long j) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                m4b m4b2 = r2;
                m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, m4b.l, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, m4b.A, m4b.B, j, m4b.D, m4b.E);
                b2.r = m4b2;
                b2.c.a(true, true);
            }
        }
    }

    public final void v(jlf jlf) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            m4b m4b = b2.r;
            mue mue = m4b.j;
            boolean q = mue.q();
            qad qad = m4b.c;
            fm9.k(q || qad.a.b < mue.p());
            long j = m4b.B;
            long j2 = m4b.C;
            m4b m4b2 = r2;
            m4b m4b3 = new m4b(m4b.a, m4b.b, qad, m4b.d, m4b.e, m4b.f, m4b.g, m4b.h, m4b.i, jlf, mue, m4b.k, m4b.m, m4b.n, m4b.o, m4b.p, m4b.q, m4b.r, m4b.s, m4b.t, m4b.u, m4b.x, m4b.y, m4b.v, m4b.w, m4b.z, m4b.A, j, j2, m4b.D, m4b.E);
            b2.r = m4b2;
            b2.c.a(true, true);
            try {
                b2.h.h.getClass();
            } catch (RemoteException e) {
                z04.v("Exception in using media1 API", e);
            }
        }
    }

    public final void x0(PlaybackException playbackException) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                m4b m4b = b2.r;
                mue mue = m4b.j;
                boolean q = mue.q();
                qad qad = m4b.c;
                fm9.k(q || qad.a.b < mue.p());
                long j = m4b.B;
                long j2 = m4b.C;
                int i = m4b.b;
                p3b p3b = m4b.d;
                p3b p3b2 = m4b.e;
                int i2 = m4b.f;
                c3b c3b = m4b.g;
                int i3 = m4b.h;
                boolean z = m4b.i;
                jlf jlf = m4b.l;
                int i4 = m4b.k;
                m4b m4b2 = r2;
                gd8 gd8 = m4b.m;
                float f = m4b.n;
                h30 h30 = m4b.o;
                zz3 zz3 = m4b.p;
                ui4 ui4 = m4b.q;
                int i5 = m4b.r;
                boolean z2 = m4b.s;
                boolean z3 = m4b.t;
                int i6 = m4b.u;
                int i7 = m4b.x;
                int i8 = m4b.y;
                boolean z4 = m4b.v;
                boolean z5 = m4b.w;
                gd8 gd82 = m4b.z;
                qad qad2 = qad;
                j0f j0f = m4b.E;
                qad qad3 = qad2;
                m4b m4b3 = new m4b(playbackException, i, qad2, p3b, p3b2, i2, c3b, i3, z, jlf, mue, i4, gd8, f, h30, zz3, ui4, i5, z2, z3, i6, i7, i8, z4, z5, gd82, m4b.A, j, j2, m4b.D, j0f);
                b2.r = m4b2;
                b2.c.a(true, true);
                try {
                    b2.h.h.y();
                } catch (RemoteException e) {
                    z04.v("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void y(j0f j0f) {
        ii8 b2 = b();
        if (b2 != null) {
            b2.u();
            if (((x4b) this.b.get()) != null) {
                b2.r = b2.r.o(j0f);
                b2.c.a(true, true);
                b2.c(new wa8(8));
            }
        }
    }
}
