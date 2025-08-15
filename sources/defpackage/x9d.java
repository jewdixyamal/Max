package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import one.me.net.client.api.AddressUnreachableException;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.api.SessionSendLimitException;

/* renamed from: x9d  reason: default package */
public final class x9d {
    public static final AtomicInteger F = new AtomicInteger(0);
    public static final AtomicInteger G = new AtomicInteger(0);
    public final AtomicInteger A = new AtomicInteger();
    public final int B;
    public boolean C;
    public final o6a D;
    public final mbd E;
    public final String a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicLong i = new AtomicLong(0);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final int k;
    public final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final k33 n;
    public final uxc o;
    public final e6a p;
    public Socket q;
    public DataOutputStream r;
    public DataInputStream s;
    public final mh3 t;
    public final bs9 u;
    public final ConcurrentHashMap v = new ConcurrentHashMap();
    public final List w;
    public final Object x = new Object();
    public final aqb y;
    public final aqb z;

    public x9d(yk8 yk8) {
        G.incrementAndGet();
        int incrementAndGet = F.incrementAndGet();
        this.k = incrementAndGet;
        this.o = (uxc) yk8.d;
        this.p = (e6a) yk8.g;
        String h2 = zr6.h(incrementAndGet, "TTSession#");
        this.a = h2;
        this.n = (k33) yk8.b;
        this.t = (mh3) yk8.f;
        this.u = (bs9) yk8.e;
        this.D = (o6a) yk8.h;
        int max = Math.max(0, yk8.a);
        this.B = max;
        hm9.m(h2, "init, sendLimitIfNoSession=%d", Integer.valueOf(max));
        this.y = new aqb();
        this.z = new aqb();
        mbd mbd = (mbd) yk8.c;
        this.E = mbd;
        x9d x9d = (x9d) yk8.i;
        if (x9d != null) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, h2, "init, has parent_session=" + x9d + ", take its sender_tasks ...", (Throwable) null);
            }
            synchronized (x9d.x) {
                this.w = x9d.w;
                x9d.w = new ArrayList();
            }
        } else {
            this.w = new ArrayList();
        }
        mbd.a("session-conn-handler", new u9d(this)).start();
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us72 = us7.X;
            ir62.d(us72, h2, "init, completed=" + this, (Throwable) null);
        }
    }

    public static void a(x9d x9d) {
        if (x9d.m.get() && x9d.f.get() != 1) {
            hm9.k0(x9d.a, (Exception) null, "closeSessionIfMarkedToDestroy, closing " + x9d, Arrays.copyOf(new Object[0], 0));
            x9d.f(true);
        }
    }

    public static boolean b(x9d x9d, bpa bpa, Class cls) {
        x9d.getClass();
        apa apa = bpa.b;
        if (apa == null || !cls.isInstance(apa.a)) {
            throw new IllegalStateException("wrong usage of method 'containsInPacketReader'");
        }
        for (Map.Entry value : x9d.v.entrySet()) {
            apa apa2 = ((zoa) value.getValue()).b.b;
            if (apa2 != null && cls.isInstance(apa2.a)) {
                return true;
            }
        }
        return false;
    }

    public static void c(x9d x9d, yoa yoa) {
        synchronized (x9d.x) {
            List list = x9d.w;
            int i2 = dc7.a;
            int i3 = ft4.o;
            list.add(new bpa(2, (apa) null, z7.S(System.currentTimeMillis(), kt4.MILLISECONDS), yoa));
        }
        x9d.z.a();
    }

    public static void d(x9d x9d) {
        x9d.getClass();
        String name = Thread.currentThread().getName();
        hm9.k(x9d.a, x9d + ", " + name + " finished");
    }

    public static String j(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "<UNKNOWN>" : "LOGGED_IN" : "CONNECTED" : "DISCONNECTED";
    }

    public static long t() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public final void e(long j2) {
        hm9.m(this.a, "cancel: %d", Long.valueOf(j2));
        synchronized (this.x) {
            try {
                Iterator it = this.w.iterator();
                while (true) {
                    if (it.hasNext()) {
                        bpa bpa = (bpa) it.next();
                        apa apa = bpa.b;
                        if (apa != null && apa.c.i() == j2) {
                            this.w.remove(bpa);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        for (Map.Entry entry : this.v.entrySet()) {
            if (((zoa) entry.getValue()).a.i() == j2) {
                this.v.remove(entry.getKey());
                return;
            }
        }
    }

    public final void f(boolean z2) {
        if (!this.f.compareAndSet(0, 1)) {
            String str = this.a;
            hm9.k0(str, (Exception) null, "close, " + this + " has ALREADY been CLOSED, skip re-closing", Arrays.copyOf(new Object[0], 0));
            return;
        }
        String str2 = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str2, "close, closing the " + this, (Throwable) null);
        }
        q(false);
        this.y.a();
        this.z.a();
        if (g()) {
            h(true, z2);
        }
        this.n.close();
        G.decrementAndGet();
        String str3 = this.a;
        hm9.m(str3, "close, " + this + " closed", new Object[0]);
    }

    public final boolean g() {
        Socket socket = this.q;
        if (socket == null || socket.isClosed()) {
            return false;
        }
        String str = this.a;
        hm9.m(str, "closeSocket", new Object[0]);
        try {
            this.q.close();
        } catch (Exception e2) {
            hm9.p(str, "failed to close socket", e2);
            o(e2);
        }
        try {
            this.n.c(this.q);
        } catch (Exception e3) {
            hm9.p(str, "failed to remove traffic stat from closed socket", e3);
        }
        DataInputStream dataInputStream = this.s;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (SocketException unused) {
            } catch (Throwable th) {
                hm9.l0(str, "fail to close " + dataInputStream, th);
            }
        }
        DataOutputStream dataOutputStream = this.r;
        if (dataOutputStream == null) {
            return true;
        }
        try {
            dataOutputStream.close();
            return true;
        } catch (SocketException unused2) {
            return true;
        } catch (Throwable th2) {
            hm9.l0(str, "fail to close " + dataOutputStream, th2);
            return true;
        }
    }

    public final void h(boolean z2, boolean z3) {
        ArrayList<bpa> arrayList;
        hm9.m(this.a, "disconnect: clearSenderTasks %b", Boolean.valueOf(z2));
        p(0);
        this.g.set(false);
        if (!this.m.get()) {
            n();
        }
        gke gke = new gke();
        for (Map.Entry value : this.v.entrySet()) {
            ((zoa) value.getValue()).a.g(gke);
        }
        this.v.clear();
        if (!z2) {
            return;
        }
        if (z3) {
            synchronized (this.x) {
                this.w.clear();
            }
            return;
        }
        synchronized (this.x) {
            try {
                arrayList = null;
                for (bpa bpa : this.w) {
                    if (bpa.b != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>(1);
                        }
                        arrayList.add(bpa);
                    }
                }
                this.w.clear();
            } finally {
                while (true) {
                }
            }
        }
        if (arrayList != null) {
            for (bpa bpa2 : arrayList) {
                bpa2.b.c.g(gke);
            }
        }
    }

    public final void i(dle dle, boolean z2, long j2, dke dke) {
        dle dle2;
        m(ds7.QUEUE, dke.i(), 0, dle.N(), true, s5c.T((HashMap) dle.b));
        if (dle instanceof lu7) {
            this.v.clear();
            synchronized (this.x) {
                this.w.clear();
            }
        }
        if (dle.w()) {
            synchronized (this.x) {
                try {
                    ArrayList<Long> arrayList = null;
                    for (bpa bpa : this.w) {
                        apa apa = bpa.b;
                        if (apa != null && (dle2 = apa.a) != null && dle2.N() == dle.N() && bpa.b.a.O() == dle.O()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(Long.valueOf(bpa.b.c.i()));
                            hm9.m(this.a, "cancel duplicated task: %s", sla.b(bpa.b.a.N()));
                        }
                    }
                    if (arrayList != null) {
                        for (Long longValue : arrayList) {
                            e(longValue.longValue());
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.x) {
            List list = this.w;
            apa apa2 = new apa(dle, z2, dke);
            int i2 = ft4.o;
            list.add(new bpa(1, apa2, z7.S(j2, kt4.MILLISECONDS), (yoa) null));
        }
        this.z.a();
    }

    public final boolean k() {
        return this.c.get() == 0;
    }

    public final boolean l() {
        return this.f.get() == 0 && !this.m.get();
    }

    public final void m(ds7 ds7, long j2, short s2, short s3, boolean z2, String str) {
        sla.c.getClass();
        String c2 = yb9.c(s3);
        String str2 = sla.b(s3) + "(" + c2 + ")";
        StringBuilder sb = new StringBuilder();
        sb.append(z2 ? "->" : "<-");
        sb.append(' ');
        sb.append(ds7.b);
        sb.append(" [");
        sb.append(j2);
        sb.append(',');
        sb.append(s2);
        sb.append("] ");
        sb.append(str2);
        sb.append(' ');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        hm9.N(ds7.a, this.a, sb2, new Object[0]);
        if (ds7 == ds7.ERROR) {
            o(new IllegalStateException(rh4.j(str2, ": ", sb2)));
        }
    }

    public final void n() {
        if (l()) {
            jbd jbd = (jbd) this.t;
            jbd.i = 0;
            jbd.b();
        }
    }

    public final void o(Exception exc) {
        String message;
        if (l()) {
            jbd jbd = (jbd) this.t;
            jbd.getClass();
            boolean z2 = exc instanceof SessionSendLimitException;
            o45 o45 = jbd.b;
            if (z2) {
                o45.a(new ExceptionHandler$HandledException((String) null, ((SessionSendLimitException) exc).c, exc));
            } else if (exc instanceof AddressUnreachableException) {
                o45.a(new ExceptionHandler$HandledException((String) null, ((AddressUnreachableException) exc).c, exc));
            } else {
                boolean z3 = exc instanceof IOException;
                je7 je7 = jbd.c;
                if (!z3 && !(exc instanceof SecurityException)) {
                    ((cba) o45).c(exc, true);
                    ((ri4) je7.getValue()).getClass();
                }
                if ((exc instanceof SSLHandshakeException) && ((ri4) je7.getValue()).d() && (message = exc.getMessage()) != null) {
                    if ((message.contains("current time") && message.contains("validation time")) || message.contains("not valid until")) {
                        ((ri4) je7.getValue()).getClass();
                    }
                }
            }
        }
    }

    public final void p(int i2) {
        int andSet = this.c.getAndSet(i2);
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, rh4.k("setConnectionsStatus, status=", j(i2), ", old=", j(andSet)), (Throwable) null);
        }
        this.y.a();
        if (andSet != i2 && !k()) {
            this.z.a();
        }
    }

    public final void q(boolean z2) {
        String str = this.a;
        hm9.m(str, "setTryToConnect, tryToConnect=%b", Boolean.valueOf(z2));
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.compareAndSet(!z2, z2) && z2) {
            this.A.set(0);
            hm9.m(str, "setTryToConnect, reset counter of failed attempts to connect", new Object[0]);
        }
        atomicBoolean.set(z2);
        this.n.g(z2);
        this.y.a();
    }

    public final void r() {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "startTimeoutHandler", (Throwable) null);
        }
        this.E.a("session-timeout-handler", new v9d(this, 2)).start();
    }

    public final void s(Exception exc) {
        long j2;
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            Locale locale = Locale.US;
            int i2 = this.h.get();
            long j3 = this.i.get();
            ir6.d(us7, str, "updateConnTimeoutAfterFail, curr_conn_errors=" + i2 + ", curr_next_conn_epoch=" + j3 + "ms", (Throwable) null);
        }
        AtomicInteger atomicInteger = this.A;
        atomicInteger.incrementAndGet();
        AtomicBoolean atomicBoolean = this.e;
        boolean z2 = atomicBoolean.get();
        AtomicInteger atomicInteger2 = this.h;
        if (!z2 || atomicInteger.get() >= 10) {
            atomicInteger2.incrementAndGet();
            j2 = this.n.h(atomicInteger2.get());
        } else {
            j2 = 1000;
        }
        AtomicLong atomicLong = this.i;
        atomicLong.set(t() + j2);
        hm9.r(str, exc, "updateConnTimeoutAfterFail, try_to_connect=%b, fa=%d, conn_errors=%d, next_conn_epoch=%d, delay=%dms", Boolean.valueOf(atomicBoolean.get()), Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()), Long.valueOf(atomicLong.get()), Long.valueOf(j2));
    }

    public final String toString() {
        int size = this.w.size();
        StringBuilder sb = new StringBuilder(96);
        sb.append("Session@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(");
        sb.append(G.get());
        sb.append('|');
        int i2 = this.f.get();
        sb.append(i2 != 0 ? i2 != 1 ? "<UNKNOWN>" : "CLOSED" : "OPEN");
        sb.append('|');
        sb.append(j(this.c.get()));
        long j2 = this.l.get();
        long max = j2 != Long.MIN_VALUE ? Math.max(t() - j2, 0) : Long.MIN_VALUE;
        if (max != Long.MIN_VALUE) {
            au1.q(max, "|connecting~", "ms", sb);
        }
        sb.append("|destroy=");
        sb.append(this.m.get());
        sb.append("|send_tasks=");
        sb.append(size);
        sb.append(')');
        return sb.toString();
    }
}
