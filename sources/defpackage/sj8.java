package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: sj8  reason: default package */
public final class sj8 extends Binder implements qr6 {
    public static final /* synthetic */ int i = 0;
    public final WeakReference c;
    public final xi8 d;
    public final m5d e;
    public final Set f = Collections.synchronizedSet(new HashSet());
    public efc g = efc.u0;
    public int h;

    public sj8(ii8 ii8) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.c = new WeakReference(ii8);
        this.d = xi8.a(ii8.f);
        this.e = new m5d(ii8);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, bm7] */
    public static bm7 I0(ii8 ii8, oh8 oh8, int i2, rj8 rj8, pj3 pj3) {
        if (ii8.i()) {
            return ew6.b;
        }
        bm7 bm7 = (bm7) rj8.k(ii8, oh8, i2);
        ? obj = new Object();
        bm7.d(new yg3((Object) ii8, (Object) obj, (Object) pj3, (Object) bm7, 10), nk4.a);
        return obj;
    }

    public static void M0(oh8 oh8, int i2, sad sad) {
        try {
            nh8 nh8 = oh8.d;
            fm9.l(nh8);
            nh8.j(i2, sad);
        } catch (RemoteException e2) {
            z04.d0("Failed to send result to controller " + oh8, e2);
        }
    }

    public static z16 N0(pj3 pj3) {
        return new z16(26, new z16(27, pj3));
    }

    public final void A0(kr6 kr6, int i2, int i3, int i4, int i5) {
        if (kr6 != null && i3 >= 0 && i4 >= i3 && i5 >= 0) {
            K0(kr6, i2, 20, N0(new gj8(i3, i4, i5)));
        }
    }

    public final void B(kr6 kr6, int i2, Bundle bundle) {
        if (kr6 != null && bundle != null) {
            try {
                K0(kr6, i2, 29, N0(new y98((Object) this, 5, (Object) j0f.b(bundle))));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for TrackSelectionParameters", e2);
            }
        }
    }

    public final void C(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 12, N0(new wa8(20)));
        }
    }

    public final void C0(kr6 kr6, int i2, int i3, int i4) {
        if (kr6 != null && i3 >= 0 && i4 >= 0) {
            K0(kr6, i2, 20, N0(new h75(i3, i4, 4)));
        }
    }

    public final void D0(kr6 kr6, int i2, int i3, Bundle bundle) {
        if (kr6 != null && bundle != null && i3 >= 0) {
            try {
                K0(kr6, i2, 20, new kj8(new y98((Object) new fj8(1, tb8.b(bundle)), 8, (Object) new ej8(this, i3, 2)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void E(kr6 kr6, int i2, int i3, Bundle bundle) {
        if (kr6 != null && bundle != null && i3 >= 0) {
            try {
                K0(kr6, i2, 20, new kj8(new y98((Object) new fj8(0, tb8.b(bundle)), 8, (Object) new ej8(this, i3, 1)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void E0(kr6 kr6, int i2, boolean z) {
        if (kr6 != null) {
            K0(kr6, i2, 14, N0(new l01(z, 9)));
        }
    }

    public final void F(kr6 kr6, int i2, int i3) {
        if (kr6 != null) {
            K0(kr6, i2, 34, N0(new z64(i3, 8)));
        }
    }

    public final void G(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 11, N0(new wa8(15)));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [jn, iw6] */
    public final m4b G0(m4b m4b) {
        zw6 a = m4b.D.a();
        ww6 i2 = zw6.i();
        ? jnVar = new jn(4);
        for (int i3 = 0; i3 < a.size(); i3++) {
            o0f o0f = (o0f) a.get(i3);
            rze b = o0f.b();
            String str = (String) this.g.get(b);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i4 = this.h;
                this.h = i4 + 1;
                int i5 = oaf.a;
                sb.append(Integer.toString(i4, 36));
                sb.append("-");
                sb.append(b.b);
                str = sb.toString();
            }
            jnVar.J(b, str);
            i2.d(o0f.a(str));
        }
        this.g = jnVar.j();
        m4b b2 = m4b.b(new p0f(i2.j()));
        j0f j0f = b2.E;
        if (j0f.A.isEmpty()) {
            return b2;
        }
        h0f c2 = j0f.a().c();
        m5f g2 = j0f.A.values().iterator();
        while (g2.hasNext()) {
            c0f c0f = (c0f) g2.next();
            rze rze = c0f.a;
            String str2 = (String) this.g.get(rze);
            if (str2 != null) {
                c2.a(new c0f(rze.a(str2), c0f.b));
            } else {
                c2.a(c0f);
            }
        }
        return b2.o(c2.b());
    }

    public final m5d H0() {
        return this.e;
    }

    public final void I(kr6 kr6, int i2, int i3) {
        if (kr6 != null) {
            K0(kr6, i2, 34, N0(new z64(i3, 7)));
        }
    }

    public final void J(kr6 kr6, int i2, IBinder iBinder, boolean z) {
        if (kr6 != null && iBinder != null) {
            try {
                zw6 a = pu0.a(iBinder);
                ww6 i3 = zw6.i();
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Bundle bundle = (Bundle) a.get(i4);
                    bundle.getClass();
                    i3.a(tb8.b(bundle));
                }
                K0(kr6, i2, 20, new kj8(new y98((Object) new fe4(i3.j(), z, 4), 7, (Object) new hj8(4)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final int J0(oh8 oh8, x4b x4b, int i2) {
        if (x4b.t1(17)) {
            m5d m5d = this.e;
            if (!m5d.G(oh8, 17) && m5d.G(oh8, 16)) {
                return x4b.p0() + i2;
            }
        }
        return i2;
    }

    public final void K(kr6 kr6, int i2, int i3, int i4) {
        if (kr6 != null && i3 >= 0 && i4 >= i3) {
            K0(kr6, i2, 20, new z16(26, new dj8(this, i3, i4)));
        }
    }

    public final void K0(kr6 kr6, int i2, int i3, rj8 rj8) {
        oh8 z = this.e.z(kr6.asBinder());
        if (z != null) {
            L0(z, i2, i3, rj8);
        }
    }

    public final void L(kr6 kr6, int i2, int i3) {
        if (kr6 != null && i3 >= 0) {
            K0(kr6, i2, 20, new z16(26, new ej8(this, i3, 4)));
        }
    }

    public final void L0(oh8 oh8, int i2, int i3, rj8 rj8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ii8 ii8 = (ii8) this.c.get();
            if (ii8 != null) {
                if (!ii8.i()) {
                    oaf.W(ii8.l, new jj8(this, oh8, i3, i2, ii8, rj8));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void N(kr6 kr6, int i2, int i3, int i4, IBinder iBinder) {
        if (kr6 != null && iBinder != null && i3 >= 0 && i4 >= i3) {
            try {
                zw6 a = pu0.a(iBinder);
                ww6 i5 = zw6.i();
                for (int i6 = 0; i6 < a.size(); i6++) {
                    Bundle bundle = (Bundle) a.get(i6);
                    bundle.getClass();
                    i5.a(tb8.b(bundle));
                }
                K0(kr6, i2, 20, new kj8(new y98((Object) new z16(24, i5.j()), 8, (Object) new dj8(this, i3, i4)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void O(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 9, N0(new wa8(21)));
        }
    }

    public final void P(kr6 kr6, int i2, int i3, long j) {
        if (kr6 != null && i3 >= 0) {
            K0(kr6, i2, 10, new z16(26, new e74((Object) this, i3, j, 4)));
        }
    }

    public final void Q(kr6 kr6, int i2, IBinder iBinder) {
        if (kr6 != null && iBinder != null) {
            try {
                zw6 a = pu0.a(iBinder);
                ww6 i3 = zw6.i();
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Bundle bundle = (Bundle) a.get(i4);
                    bundle.getClass();
                    i3.a(tb8.b(bundle));
                }
                K0(kr6, i2, 20, new kj8(new y98((Object) new z72(18, i3.j()), 8, (Object) new wa8(23)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void R(kr6 kr6, int i2, y9d y9d, int i3, rj8 rj8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ii8 ii8 = (ii8) this.c.get();
            if (ii8 != null) {
                if (!ii8.i()) {
                    oh8 z = this.e.z(kr6.asBinder());
                    if (z == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return;
                    }
                    oaf.W(ii8.l, new ij8(this, z, y9d, i2, i3, rj8, ii8));
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void S(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 4, N0(new hj8(0)));
        }
    }

    public final void U(kr6 kr6, int i2, int i3, IBinder iBinder) {
        if (kr6 != null && iBinder != null && i3 >= 0) {
            try {
                zw6 a = pu0.a(iBinder);
                ww6 i4 = zw6.i();
                for (int i5 = 0; i5 < a.size(); i5++) {
                    Bundle bundle = (Bundle) a.get(i5);
                    bundle.getClass();
                    i4.a(tb8.b(bundle));
                }
                K0(kr6, i2, 20, new kj8(new y98((Object) new z72(17, i4.j()), 8, (Object) new ej8(this, i3, 3)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void V(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 6, N0(new wa8(18)));
        }
    }

    public final void X(kr6 kr6, int i2, long j) {
        if (kr6 != null) {
            K0(kr6, i2, 5, N0(new c10(j, 23)));
        }
    }

    public final void Y(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 2, N0(new wa8(29)));
        }
    }

    public final void Z(kr6 kr6, int i2, int i3) {
        if (kr6 != null && i3 >= 0) {
            K0(kr6, i2, 10, new z16(26, new ej8(this, i3, 0)));
        }
    }

    public final void a(kr6 kr6, int i2, Bundle bundle) {
        cd6 cd6;
        ah3 ah3;
        if (kr6 != null && bundle != null) {
            try {
                sad a = sad.a(bundle);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    m5d m5d = this.e;
                    IBinder asBinder = kr6.asBinder();
                    synchronized (m5d.b) {
                        oh8 z = m5d.z(asBinder);
                        cd6 = null;
                        ah3 = z != null ? (ah3) ((us) m5d.o).get(z) : null;
                    }
                    if (ah3 != null) {
                        cd6 = ah3.b;
                    }
                    if (cd6 == null) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return;
                    }
                    cd6.s(i2, a);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for SessionResult", e2);
            }
        }
    }

    public final void a0(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 26, N0(new wa8(24)));
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void c0(kr6 kr6, int i2, boolean z) {
        if (kr6 != null) {
            K0(kr6, i2, 1, N0(new l01(z, 7)));
        }
    }

    public final void d(kr6 kr6, int i2, Bundle bundle, boolean z) {
        if (kr6 != null && bundle != null) {
            try {
                K0(kr6, i2, 35, N0(new fe4(h30.a(bundle), z, 3)));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for AudioAttributes", e2);
            }
        }
    }

    public final void d0(kr6 kr6, int i2, Bundle bundle) {
        l0(kr6, i2, bundle, true);
    }

    public final void e(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 1, N0(new wa8(12)));
        }
    }

    public final void e0(kr6 kr6, int i2) {
        if (kr6 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                ii8 ii8 = (ii8) this.c.get();
                if (ii8 != null) {
                    if (!ii8.i()) {
                        oaf.W(ii8.l, new vs5(this, 24, kr6));
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public final void i(kr6 kr6, int i2, Bundle bundle, long j) {
        if (kr6 != null && bundle != null) {
            try {
                K0(kr6, i2, 31, new kj8(new y98((Object) new lt1((Object) tb8.b(bundle), j, 6), 7, (Object) new hj8(4)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void i0(kr6 kr6, int i2, Surface surface) {
        if (kr6 != null) {
            K0(kr6, i2, 27, N0(new z16(25, surface)));
        }
    }

    public final void j0(kr6 kr6, int i2, Bundle bundle) {
        if (kr6 != null && bundle != null) {
            try {
                oh3 a = oh3.a(bundle);
                int callingUid = Binder.getCallingUid();
                int callingPid = Binder.getCallingPid();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = a.d;
                }
                try {
                    vi8 vi8 = new vi8(a.c, callingPid, callingUid);
                    k(kr6, new oh8(vi8, a.a, a.b, this.d.b(vi8), new oj8(kr6), a.e));
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for ConnectionRequest", e2);
            }
        }
    }

    public final void k(kr6 kr6, oh8 oh8) {
        if (kr6 != null) {
            ii8 ii8 = (ii8) this.c.get();
            if (ii8 == null || ii8.i()) {
                try {
                    kr6.c(0);
                } catch (RemoteException unused) {
                }
            } else {
                this.f.add(oh8);
                oaf.W(ii8.l, new yg3((Object) this, (Object) oh8, (Object) ii8, (Object) kr6, 9));
            }
        }
    }

    public final void l0(kr6 kr6, int i2, Bundle bundle, boolean z) {
        if (kr6 != null && bundle != null) {
            try {
                K0(kr6, i2, 31, new kj8(new y98((Object) new fe4(tb8.b(bundle), z, 2), 7, (Object) new hj8(4)), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void m0(kr6 kr6) {
        if (kr6 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                ii8 ii8 = (ii8) this.c.get();
                if (ii8 != null) {
                    if (!ii8.i()) {
                        oh8 z = this.e.z(kr6.asBinder());
                        if (z != null) {
                            oaf.W(ii8.l, new vs5(this, 25, z));
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public final void n0(kr6 kr6, int i2, int i3) {
        if (kr6 != null && i3 >= 0) {
            K0(kr6, i2, 25, N0(new z64(i3, 10)));
        }
    }

    public final void o0(kr6 kr6, int i2, Bundle bundle) {
        if (kr6 != null && bundle != null) {
            try {
                K0(kr6, i2, 13, N0(new n98(new c3b(bundle.getFloat(c3b.e, 1.0f), bundle.getFloat(c3b.f, 1.0f)), 2)));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for PlaybackParameters", e2);
            }
        }
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i2 != 1598968902) {
            boolean z = false;
            switch (i2) {
                case 3002:
                    y(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    break;
                case 3003:
                    n0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3004:
                    z(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3005:
                    a0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3006:
                    kr6 k = ga8.k(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    w0(k, readInt, z);
                    break;
                case 3007:
                    l0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR), true);
                    break;
                case 3008:
                    i(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR), parcel.readLong());
                    break;
                case 3009:
                    kr6 k2 = ga8.k(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    Bundle bundle = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    l0(k2, readInt2, bundle, z);
                    break;
                case 3010:
                    J(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                    break;
                case 3011:
                    kr6 k3 = ga8.k(parcel.readStrongBinder());
                    int readInt3 = parcel.readInt();
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    J(k3, readInt3, readStrongBinder, z);
                    break;
                case 3012:
                    v(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    break;
                case 3013:
                    kr6 k4 = ga8.k(parcel.readStrongBinder());
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    c0(k4, readInt4, z);
                    break;
                case 3014:
                    a(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3015:
                    j0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3016:
                    kr6 k5 = ga8.k(parcel.readStrongBinder());
                    int readInt5 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    p0(k5, readInt5, (Bundle) fp3.a(parcel, creator), (Bundle) fp3.a(parcel, creator));
                    break;
                case 3017:
                    z0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3018:
                    kr6 k6 = ga8.k(parcel.readStrongBinder());
                    int readInt6 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    E0(k6, readInt6, z);
                    break;
                case 3019:
                    L(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3020:
                    K(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3021:
                    r0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3022:
                    C0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3023:
                    A0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3024:
                    p(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3025:
                    e(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3026:
                    Y(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3027:
                    o0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3028:
                    x(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    break;
                case 3029:
                    kr6 k7 = ga8.k(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    Bundle bundle2 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                    if (!(k7 == null || bundle2 == null)) {
                        try {
                            K0(k7, readInt7, 20, new kj8(new y98((Object) new fj8(2, tb8.b(bundle2)), 8, (Object) new wa8(25)), 1));
                            break;
                        } catch (RuntimeException e2) {
                            z04.d0("Ignoring malformed Bundle for MediaItem", e2);
                            break;
                        }
                    }
                case 3030:
                    E(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3031:
                    Q(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3032:
                    U(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3033:
                    u0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3034:
                    x0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3035:
                    e0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3036:
                    S(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3037:
                    Z(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3038:
                    X(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    break;
                case 3039:
                    P(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    break;
                case 3040:
                    G(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3041:
                    C(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3042:
                    V(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3043:
                    w(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3044:
                    i0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Surface) fp3.a(parcel, Surface.CREATOR));
                    break;
                case 3045:
                    m0(ga8.k(parcel.readStrongBinder()));
                    break;
                case 3046:
                    v0(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3047:
                    O(ga8.k(parcel.readStrongBinder()), parcel.readInt());
                    break;
                case 3048:
                    B(ga8.k(parcel.readStrongBinder()), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3049:
                    kr6 k8 = ga8.k(parcel.readStrongBinder());
                    int readInt8 = parcel.readInt();
                    String readString = parcel.readString();
                    Bundle bundle3 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                    if (!(k8 == null || readString == null || bundle3 == null)) {
                        if (!TextUtils.isEmpty(readString)) {
                            try {
                                R(k8, readInt8, (y9d) null, 40010, new kj8(new wa8(readString, 22, e5c.a(bundle3)), 1));
                                break;
                            } catch (RuntimeException e3) {
                                z04.d0("Ignoring malformed Bundle for Rating", e3);
                                break;
                            }
                        } else {
                            z04.c0("setRatingWithMediaId(): Ignoring empty mediaId");
                            break;
                        }
                    }
                case 3050:
                    kr6 k9 = ga8.k(parcel.readStrongBinder());
                    int readInt9 = parcel.readInt();
                    Bundle bundle4 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                    if (!(k9 == null || bundle4 == null)) {
                        try {
                            e5c.a(bundle4);
                            R(k9, readInt9, (y9d) null, 40010, new kj8(new hj8(5), 1));
                            break;
                        } catch (RuntimeException e4) {
                            z04.d0("Ignoring malformed Bundle for Rating", e4);
                            break;
                        }
                    }
                case 3051:
                    s(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    break;
                case 3052:
                    F(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3053:
                    I(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    break;
                case 3054:
                    kr6 k10 = ga8.k(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    s0(k10, readInt10, z, parcel.readInt());
                    break;
                case 3055:
                    D0(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) fp3.a(parcel, Bundle.CREATOR));
                    break;
                case 3056:
                    N(ga8.k(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    break;
                case 3057:
                    kr6 k11 = ga8.k(parcel.readStrongBinder());
                    int readInt11 = parcel.readInt();
                    Bundle bundle5 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    d(k11, readInt11, bundle5, z);
                    break;
                default:
                    switch (i2) {
                        case 4001:
                            kr6 k12 = ga8.k(parcel.readStrongBinder());
                            int readInt12 = parcel.readInt();
                            Bundle bundle6 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                            if (k12 != null) {
                                if (bundle6 != null) {
                                    try {
                                        oc8.a(bundle6);
                                    } catch (RuntimeException e5) {
                                        z04.d0("Ignoring malformed Bundle for LibraryParams", e5);
                                        break;
                                    }
                                }
                                R(k12, readInt12, (y9d) null, 50000, new kj8(new wa8(28), 0));
                                break;
                            }
                            break;
                        case 4002:
                            kr6 k13 = ga8.k(parcel.readStrongBinder());
                            int readInt13 = parcel.readInt();
                            String readString2 = parcel.readString();
                            if (k13 != null) {
                                if (!TextUtils.isEmpty(readString2)) {
                                    R(k13, readInt13, (y9d) null, 50004, new kj8(new wa8(19), 0));
                                    break;
                                } else {
                                    z04.c0("getItem(): Ignoring empty mediaId");
                                    break;
                                }
                            }
                            break;
                        case 4003:
                            kr6 k14 = ga8.k(parcel.readStrongBinder());
                            int readInt14 = parcel.readInt();
                            String readString3 = parcel.readString();
                            int readInt15 = parcel.readInt();
                            int readInt16 = parcel.readInt();
                            Bundle bundle7 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                            if (k14 != null) {
                                if (!TextUtils.isEmpty(readString3)) {
                                    if (readInt15 >= 0) {
                                        if (readInt16 >= 1) {
                                            if (bundle7 != null) {
                                                try {
                                                    oc8.a(bundle7);
                                                } catch (RuntimeException e6) {
                                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e6);
                                                    break;
                                                }
                                            }
                                            R(k14, readInt14, (y9d) null, 50003, new kj8(new wa8(11), 0));
                                            break;
                                        } else {
                                            z04.c0("getChildren(): Ignoring pageSize less than 1");
                                            break;
                                        }
                                    } else {
                                        z04.c0("getChildren(): Ignoring negative page");
                                        break;
                                    }
                                } else {
                                    z04.c0("getChildren(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        case 4004:
                            kr6 k15 = ga8.k(parcel.readStrongBinder());
                            int readInt17 = parcel.readInt();
                            String readString4 = parcel.readString();
                            Bundle bundle8 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                            if (k15 != null) {
                                if (!TextUtils.isEmpty(readString4)) {
                                    if (bundle8 != null) {
                                        try {
                                            oc8.a(bundle8);
                                        } catch (RuntimeException e7) {
                                            z04.d0("Ignoring malformed Bundle for LibraryParams", e7);
                                            break;
                                        }
                                    }
                                    R(k15, readInt17, (y9d) null, 50005, new kj8(new hj8(3), 0));
                                    break;
                                } else {
                                    z04.c0("search(): Ignoring empty query");
                                    break;
                                }
                            }
                            break;
                        case 4005:
                            kr6 k16 = ga8.k(parcel.readStrongBinder());
                            int readInt18 = parcel.readInt();
                            String readString5 = parcel.readString();
                            int readInt19 = parcel.readInt();
                            int readInt20 = parcel.readInt();
                            Bundle bundle9 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                            if (k16 != null) {
                                if (!TextUtils.isEmpty(readString5)) {
                                    if (readInt19 >= 0) {
                                        if (readInt20 >= 1) {
                                            if (bundle9 != null) {
                                                try {
                                                    oc8.a(bundle9);
                                                } catch (RuntimeException e8) {
                                                    z04.d0("Ignoring malformed Bundle for LibraryParams", e8);
                                                    break;
                                                }
                                            }
                                            R(k16, readInt18, (y9d) null, 50006, new kj8(new wa8(26), 0));
                                            break;
                                        } else {
                                            z04.c0("getSearchResult(): Ignoring pageSize less than 1");
                                            break;
                                        }
                                    } else {
                                        z04.c0("getSearchResult(): Ignoring negative page");
                                        break;
                                    }
                                } else {
                                    z04.c0("getSearchResult(): Ignoring empty query");
                                    break;
                                }
                            }
                            break;
                        case 4006:
                            kr6 k17 = ga8.k(parcel.readStrongBinder());
                            int readInt21 = parcel.readInt();
                            String readString6 = parcel.readString();
                            Bundle bundle10 = (Bundle) fp3.a(parcel, Bundle.CREATOR);
                            if (k17 != null) {
                                if (!TextUtils.isEmpty(readString6)) {
                                    if (bundle10 != null) {
                                        try {
                                            oc8.a(bundle10);
                                        } catch (RuntimeException e9) {
                                            z04.d0("Ignoring malformed Bundle for LibraryParams", e9);
                                            break;
                                        }
                                    }
                                    R(k17, readInt21, (y9d) null, 50001, new kj8(new hj8(1), 0));
                                    break;
                                } else {
                                    z04.c0("subscribe(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        case 4007:
                            kr6 k18 = ga8.k(parcel.readStrongBinder());
                            int readInt22 = parcel.readInt();
                            String readString7 = parcel.readString();
                            if (k18 != null) {
                                if (!TextUtils.isEmpty(readString7)) {
                                    R(k18, readInt22, (y9d) null, 50002, new kj8(new wa8(10), 0));
                                    break;
                                } else {
                                    z04.c0("unsubscribe(): Ignoring empty parentId");
                                    break;
                                }
                            }
                            break;
                        default:
                            return super.onTransact(i2, parcel, parcel2, i3);
                    }
            }
            return true;
        }
        parcel2.writeString("androidx.media3.session.IMediaSession");
        return true;
    }

    public final void p(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 1, N0(new y98((Object) this, 6, (Object) z)));
        }
    }

    public final void p0(kr6 kr6, int i2, Bundle bundle, Bundle bundle2) {
        if (kr6 != null && bundle != null && bundle2 != null) {
            try {
                y9d a = y9d.a(bundle);
                R(kr6, i2, a, 0, new kj8(new wa8(a, 16, bundle2), 1));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for SessionCommand", e2);
            }
        }
    }

    public final void r0(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 20, N0(new hj8(2)));
        }
    }

    public final void s(kr6 kr6, int i2, int i3, int i4) {
        if (kr6 != null && i3 >= 0) {
            K0(kr6, i2, 33, N0(new h75(i3, i4, 3)));
        }
    }

    public final void s0(kr6 kr6, int i2, boolean z, int i3) {
        if (kr6 != null) {
            K0(kr6, i2, 34, N0(new cl3(z, i3)));
        }
    }

    public final void u0(kr6 kr6, int i2, Bundle bundle) {
        if (kr6 != null && bundle != null) {
            try {
                K0(kr6, i2, 19, N0(new f75(gd8.b(bundle), 2)));
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for MediaMetadata", e2);
            }
        }
    }

    public final void v(kr6 kr6, int i2, IBinder iBinder, int i3, long j) {
        if (kr6 != null && iBinder != null) {
            if (i3 == -1 || i3 >= 0) {
                try {
                    zw6 a = pu0.a(iBinder);
                    ww6 i4 = zw6.i();
                    for (int i5 = 0; i5 < a.size(); i5++) {
                        Bundle bundle = (Bundle) a.get(i5);
                        bundle.getClass();
                        i4.a(tb8.b(bundle));
                    }
                    K0(kr6, i2, 20, new kj8(new y98((Object) new e74((Object) i4.j(), i3, j, 5), 7, (Object) new hj8(4)), 1));
                } catch (RuntimeException e2) {
                    z04.d0("Ignoring malformed Bundle for MediaItem", e2);
                }
            }
        }
    }

    public final void v0(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 7, N0(new wa8(17)));
        }
    }

    public final void w(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 8, N0(new wa8(13)));
        }
    }

    public final void w0(kr6 kr6, int i2, boolean z) {
        if (kr6 != null) {
            K0(kr6, i2, 26, N0(new l01(z, 8)));
        }
    }

    public final void x(kr6 kr6, int i2, float f2) {
        if (kr6 != null && f2 > 0.0f) {
            K0(kr6, i2, 13, N0(new b75(3, f2)));
        }
    }

    public final void x0(kr6 kr6, int i2) {
        oh8 z;
        if (kr6 != null && (z = this.e.z(kr6.asBinder())) != null) {
            L0(z, i2, 3, N0(new wa8(27)));
        }
    }

    public final void y(kr6 kr6, int i2, float f2) {
        if (kr6 != null && f2 >= 0.0f && f2 <= 1.0f) {
            K0(kr6, i2, 24, N0(new b75(4, f2)));
        }
    }

    public final void z(kr6 kr6, int i2) {
        if (kr6 != null) {
            K0(kr6, i2, 26, N0(new wa8(14)));
        }
    }

    public final void z0(kr6 kr6, int i2, int i3) {
        if (kr6 != null) {
            if (i3 == 2 || i3 == 0 || i3 == 1) {
                K0(kr6, i2, 15, N0(new z64(i3, 9)));
            }
        }
    }
}
