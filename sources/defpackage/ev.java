package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ev  reason: default package */
public final class ev implements vp6 {
    public final /* synthetic */ int a;
    public volatile long b;
    public Object c;
    public volatile Object o;

    public ev(y8 y8Var) {
        this.a = 1;
        this.c = y8Var;
        this.b = Long.MIN_VALUE;
    }

    public synchronized void a() {
        c();
        cqc.b((zl4) this.o);
        this.o = null;
    }

    public synchronized void b() {
        f6 f6Var = (f6) this.c;
        if (f6Var != null) {
            f6Var.run();
            this.c = null;
        }
    }

    public synchronized void c() {
        this.b = -1;
    }

    public Uri p(String str) {
        long j;
        Uri p = ((vp6) this.c).p(str);
        if (!str.equals("api")) {
            return p;
        }
        Uri uri = sl.a;
        String uri2 = p.toString();
        String uri3 = uri.toString();
        if (!uri2.equals(uri3)) {
            int v0 = w9e.s0(uri2, '/') ? w9e.v0(uri2) : uri2.length();
            if (v0 != (w9e.s0(uri3, '/') ? w9e.v0(uri3) : uri3.length()) || !eae.l0(0, 0, v0, uri2, uri3, false)) {
                return p;
            }
        }
        if (SystemClock.elapsedRealtime() > this.b) {
            synchronized (this) {
                try {
                    if (SystemClock.elapsedRealtime() > this.b) {
                        j = Long.MAX_VALUE;
                        sh0 t = rq9.t();
                        String str2 = (String) t.c;
                        if (w9e.S0(str2, '\"') && w9e.s0(str2, '\"')) {
                            str2 = str2.substring(1, w9e.v0(str2));
                        }
                        if (w9e.p0(str2, "\"\"", false)) {
                            str2 = eae.n0(str2, "\"\"", "");
                        }
                        String obj = w9e.b1(str2).toString();
                        if (w9e.q0(obj, ' ')) {
                            obj = obj.substring(w9e.E0(obj, ' ', 0, 6) + 1);
                        }
                        if (w9e.s0(obj, '/')) {
                            obj = obj.substring(0, w9e.v0(obj));
                        }
                        Uri parse = Uri.parse(obj);
                        this.o = parse;
                        int s = au1.s(2);
                        if (s != 0) {
                            if (s == 1) {
                                j = SystemClock.elapsedRealtime() + ((long) (t.b * 1000));
                            } else if (s == 2) {
                                j = Long.MIN_VALUE;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        this.b = j;
                        return parse;
                    }
                } catch (Exception e) {
                    int s2 = au1.s(3);
                    if (s2 != 0) {
                        if (s2 == 1) {
                            j = Long.MIN_VALUE;
                        } else if (s2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.b = j;
                        Uri uri4 = (Uri) this.o;
                        if (uri4 != null) {
                            p = uri4;
                        }
                        return p;
                    }
                    throw e;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Uri uri5 = (Uri) this.o;
        return uri5 == null ? p : uri5;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "LoadOperation{operationTime=" + this.b + ", disposable=" + ((zl4) this.o) + ", onComplete=" + ((f6) this.c) + '}';
            default:
                return super.toString();
        }
    }

    public ev() {
        this.a = 0;
        this.b = -1;
        this.o = null;
        this.c = null;
    }
}
