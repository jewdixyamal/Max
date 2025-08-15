package androidx.work.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile i8g m;
    public volatile ph4 n;
    public volatile k8g o;
    public volatile die p;
    public volatile y7g q;
    public volatile a8g r;
    public volatile h7b s;

    public final v47 e() {
        return new v47(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final xde f(d34 d34) {
        return d34.c.a(new ana(d34.a, d34.b, new l0f(d34, (oy) new rfa(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    public final List g() {
        return Arrays.asList(new da9[]{new ea9(13, 14, 20), new qfa(2)});
    }

    public final Set i() {
        return new HashSet();
    }

    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(i8g.class, Collections.emptyList());
        hashMap.put(ph4.class, Collections.emptyList());
        hashMap.put(k8g.class, Collections.emptyList());
        hashMap.put(die.class, Collections.emptyList());
        hashMap.put(y7g.class, Collections.emptyList());
        hashMap.put(a8g.class, Collections.emptyList());
        hashMap.put(h7b.class, Collections.emptyList());
        hashMap.put(s5c.class, Collections.emptyList());
        return hashMap;
    }

    public final ph4 t() {
        ph4 ph4;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new ph4((ilc) this, 0);
                }
                ph4 = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph4;
    }

    public final h7b u() {
        h7b h7b;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new h7b((WorkDatabase) this);
                }
                h7b = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h7b;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [die, java.lang.Object] */
    public final die v() {
        die die;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new sh(this, 26);
                    obj.c = new zkc(this, 12);
                    obj.o = new zkc(this, 13);
                    this.p = obj;
                }
                die = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return die;
    }

    public final y7g w() {
        y7g y7g;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new y7g((ilc) this);
                }
                y7g = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y7g;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [a8g, java.lang.Object] */
    public final a8g x() {
        a8g a8g;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new x7g(this, 1);
                    obj.c = new ktf(this, 1);
                    obj.o = new ktf(this, 2);
                    this.r = obj;
                }
                a8g = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a8g;
    }

    public final i8g y() {
        i8g i8g;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new i8g(this);
                }
                i8g = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8g;
    }

    public final k8g z() {
        k8g k8g;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new k8g((ilc) this);
                }
                k8g = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k8g;
    }
}
