package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements ok {
    public static final pe5[] J0 = new pe5[0];
    public final int A0;
    public final String B0;
    public volatile String C0;
    public ph3 D0;
    public boolean E0;
    public volatile vig F0;
    public final AtomicInteger G0;
    public final Set H0;
    public final Account I0;
    public final vfg X;
    public final Object Y;
    public final Object Z;
    public volatile String a;
    public yx8 b;
    public final Context c;
    public final jkg o;
    public ffg s0;
    public ri0 t0;
    public IInterface u0;
    public final ArrayList v0;
    public ehg w0;
    public int x0;
    public final oof y0;
    public final gpf z0;

    public a(Context context, Looper looper, int i, kad kad, ge6 ge6, he6 he6) {
        synchronized (jkg.h) {
            try {
                if (jkg.i == null) {
                    jkg.i = new jkg(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        jkg jkg = jkg.i;
        Object obj = ee6.c;
        fp3.n(ge6);
        fp3.n(he6);
        oof oof = new oof(ge6);
        gpf gpf = new gpf(he6);
        this.a = null;
        this.Y = new Object();
        this.Z = new Object();
        this.v0 = new ArrayList();
        this.x0 = 1;
        this.D0 = null;
        this.E0 = false;
        this.F0 = null;
        this.G0 = new AtomicInteger(0);
        fp3.o(context, "Context must not be null");
        this.c = context;
        fp3.o(looper, "Looper must not be null");
        fp3.o(jkg, "Supervisor must not be null");
        this.o = jkg;
        this.X = new vfg(this, looper);
        this.A0 = i;
        this.y0 = oof;
        this.z0 = gpf;
        this.B0 = (String) kad.X;
        this.I0 = (Account) kad.a;
        Set<Scope> set = (Set) kad.c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.H0 = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.Y) {
            try {
                if (aVar.x0 != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set a() {
        return j() ? this.H0 : Collections.emptySet();
    }

    public final void b(String str) {
        this.a = str;
        disconnect();
    }

    public final boolean c() {
        boolean z;
        synchronized (this.Y) {
            int i = this.x0;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final void d() {
        if (!isConnected() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void disconnect() {
        this.G0.incrementAndGet();
        synchronized (this.v0) {
            try {
                int size = this.v0.size();
                for (int i = 0; i < size; i++) {
                    bfg bfg = (bfg) this.v0.get(i);
                    synchronized (bfg) {
                        bfg.a = null;
                    }
                }
                this.v0.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.Z) {
            this.s0 = null;
        }
        v(1, (IInterface) null);
    }

    public final void e(ri0 ri0) {
        this.t0 = ri0;
        v(2, (IInterface) null);
    }

    public final void f(y7f y7f) {
        ((kdg) y7f.b).o.x0.post(new gwe(10, (Object) y7f));
    }

    public final pe5[] h() {
        vig vig = this.F0;
        if (vig == null) {
            return null;
        }
        return vig.b;
    }

    public final String i() {
        return this.a;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.Y) {
            z = this.x0 == 4;
        }
        return z;
    }

    public boolean j() {
        return false;
    }

    public final void k(dr6 dr6, Set set) {
        Set set2 = set;
        Bundle n = n();
        String str = this.C0;
        int i = fe6.a;
        Scope[] scopeArr = qc6.z0;
        Bundle bundle = new Bundle();
        int i2 = this.A0;
        pe5[] pe5Arr = qc6.A0;
        qc6 qc6 = r3;
        qc6 qc62 = new qc6(6, i2, i, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, pe5Arr, pe5Arr, true, 0, false, str);
        qc6 qc63 = qc6;
        qc63.o = this.c.getPackageName();
        qc63.Z = n;
        if (set2 != null) {
            qc63.Y = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (j()) {
            Account account = this.I0;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            qc63.s0 = account;
            if (dr6 != null) {
                qc63.X = dr6.asBinder();
            }
        }
        qc63.t0 = J0;
        qc63.u0 = m();
        if (t()) {
            qc63.x0 = true;
        }
        try {
            synchronized (this.Z) {
                ffg ffg = this.s0;
                if (ffg != null) {
                    ffg.k(new tgg(this, this.G0.get()), qc63);
                }
            }
        } catch (DeadObjectException unused) {
            int i3 = this.G0.get();
            vfg vfg = this.X;
            vfg.sendMessage(vfg.obtainMessage(6, i3, 3));
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            int i4 = this.G0.get();
            xhg xhg = new xhg(this, 8, (IBinder) null, (Bundle) null);
            vfg vfg2 = this.X;
            vfg2.sendMessage(vfg2.obtainMessage(1, i4, -1, xhg));
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract IInterface l(IBinder iBinder);

    public pe5[] m() {
        return J0;
    }

    public Bundle n() {
        return new Bundle();
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.Y) {
            try {
                if (this.x0 == 5) {
                    throw new DeadObjectException();
                } else if (isConnected()) {
                    iInterface = this.u0;
                    fp3.o(iInterface, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String p();

    public abstract String q();

    public boolean r() {
        return g() >= 211700000;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public boolean t() {
        return this instanceof vgg;
    }

    public final void v(int i, IInterface iInterface) {
        yx8 yx8;
        boolean z = false;
        boolean z2 = i == 4;
        if (iInterface != null) {
            z = true;
        }
        if (z2 == z) {
            synchronized (this.Y) {
                try {
                    this.x0 = i;
                    this.u0 = iInterface;
                    if (i == 1) {
                        ehg ehg = this.w0;
                        if (ehg != null) {
                            jkg jkg = this.o;
                            String str = this.b.c;
                            fp3.n(str);
                            this.b.getClass();
                            if (this.B0 == null) {
                                this.c.getClass();
                            }
                            jkg.a(str, ehg, this.b.b);
                            this.w0 = null;
                        }
                    } else if (i == 2 || i == 3) {
                        ehg ehg2 = this.w0;
                        if (!(ehg2 == null || (yx8 = this.b) == null)) {
                            String str2 = yx8.c;
                            jkg jkg2 = this.o;
                            fp3.n(str2);
                            this.b.getClass();
                            if (this.B0 == null) {
                                this.c.getClass();
                            }
                            jkg2.a(str2, ehg2, this.b.b);
                            this.G0.incrementAndGet();
                        }
                        ehg ehg3 = new ehg(this, this.G0.get());
                        this.w0 = ehg3;
                        String q = q();
                        boolean r = r();
                        this.b = new yx8(q, r, 2);
                        if (r) {
                            if (g() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                            }
                        }
                        jkg jkg3 = this.o;
                        String str3 = this.b.c;
                        fp3.n(str3);
                        this.b.getClass();
                        String str4 = this.B0;
                        if (str4 == null) {
                            str4 = this.c.getClass().getName();
                        }
                        if (!jkg3.b(new rjg(str3, this.b.b), ehg3, str4)) {
                            String str5 = this.b.c;
                            int i2 = this.G0.get();
                            cig cig = new cig(this, 16);
                            vfg vfg = this.X;
                            vfg.sendMessage(vfg.obtainMessage(7, i2, -1, cig));
                        }
                    } else if (i == 4) {
                        fp3.n(iInterface);
                        System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
