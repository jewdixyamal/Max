package ru.ok.tamtam.android.db.room;

import androidx.work.impl.model.WorkersQueueDao;
import androidx.work.impl.model.WorkersQueueDao_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class OneMeRoomDatabase_Impl extends OneMeRoomDatabase {
    public volatile le5 A;
    public volatile tp4 B;
    public volatile w4d C;
    public volatile alc D;
    public volatile WorkersQueueDao_Impl E;
    public volatile hoe F;
    public volatile ir3 G;
    public volatile rva H;
    public volatile s1e I;
    public volatile n4e J;
    public volatile dt2 K;
    public volatile t19 L;
    public volatile wh M;
    public volatile oj N;
    public volatile a7c O;
    public volatile xrc P;
    public volatile mtf Q;
    public volatile adb R;
    public volatile w8f n;
    public volatile oy8 o;
    public volatile qef p;
    public volatile ed1 q;
    public volatile b4e r;
    public volatile fd5 s;
    public volatile od5 t;
    public volatile d9c u;
    public volatile ja4 v;
    public volatile ew9 w;
    public volatile kw9 x;
    public volatile yx9 y;
    public volatile ud5 z;

    public final fd5 A() {
        fd5 fd5;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new fd5(this);
                }
                fd5 = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fd5;
    }

    public final od5 B() {
        od5 od5;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new od5(this);
                }
                od5 = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return od5;
    }

    public final ud5 C() {
        ud5 ud5;
        if (this.z != null) {
            return this.z;
        }
        synchronized (this) {
            try {
                if (this.z == null) {
                    this.z = new ud5(this);
                }
                ud5 = this.z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ud5;
    }

    public final le5 D() {
        le5 le5;
        if (this.A != null) {
            return this.A;
        }
        synchronized (this) {
            try {
                if (this.A == null) {
                    this.A = new le5(this);
                }
                le5 = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return le5;
    }

    public final oy8 E() {
        oy8 oy8;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new oy8(this);
                }
                oy8 = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oy8;
    }

    public final t19 F() {
        t19 t19;
        if (this.L != null) {
            return this.L;
        }
        synchronized (this) {
            try {
                if (this.L == null) {
                    this.L = new t19(this);
                }
                t19 = this.L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t19;
    }

    public final ew9 G() {
        ew9 ew9;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new ew9(this);
                }
                ew9 = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ew9;
    }

    public final kw9 H() {
        kw9 kw9;
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            try {
                if (this.x == null) {
                    this.x = new kw9(this);
                }
                kw9 = this.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kw9;
    }

    public final yx9 I() {
        yx9 yx9;
        if (this.y != null) {
            return this.y;
        }
        synchronized (this) {
            try {
                if (this.y == null) {
                    this.y = new yx9(this);
                }
                yx9 = this.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yx9;
    }

    public final rva J() {
        rva rva;
        if (this.H != null) {
            return this.H;
        }
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = new rva(this);
                }
                rva = this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rva;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, adb] */
    public final adb K() {
        adb adb;
        if (this.R != null) {
            return this.R;
        }
        synchronized (this) {
            try {
                if (this.R == null) {
                    ? obj = new Object();
                    obj.a = this;
                    obj.b = new sh(this, 17);
                    obj.c = new p19(this, 22);
                    this.R = obj;
                }
                adb = this.R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return adb;
    }

    public final a7c L() {
        a7c a7c;
        if (this.O != null) {
            return this.O;
        }
        synchronized (this) {
            try {
                if (this.O == null) {
                    this.O = new a7c(this);
                }
                a7c = this.O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a7c;
    }

    public final d9c M() {
        d9c d9c;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new d9c(this);
                }
                d9c = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d9c;
    }

    public final alc N() {
        alc alc;
        if (this.D != null) {
            return this.D;
        }
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = new alc(this);
                }
                alc = this.D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return alc;
    }

    public final xrc O() {
        xrc xrc;
        if (this.P != null) {
            return this.P;
        }
        synchronized (this) {
            try {
                if (this.P == null) {
                    this.P = new xrc(this);
                }
                xrc = this.P;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xrc;
    }

    public final w4d P() {
        w4d w4d;
        if (this.C != null) {
            return this.C;
        }
        synchronized (this) {
            try {
                if (this.C == null) {
                    this.C = new w4d((OneMeRoomDatabase) this);
                }
                w4d = this.C;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w4d;
    }

    public final s1e Q() {
        s1e s1e;
        if (this.I != null) {
            return this.I;
        }
        synchronized (this) {
            try {
                if (this.I == null) {
                    this.I = new s1e(this);
                }
                s1e = this.I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s1e;
    }

    public final b4e R() {
        b4e b4e;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new b4e(this);
                }
                b4e = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b4e;
    }

    public final n4e S() {
        n4e n4e;
        if (this.J != null) {
            return this.J;
        }
        synchronized (this) {
            try {
                if (this.J == null) {
                    this.J = new n4e(this);
                }
                n4e = this.J;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n4e;
    }

    public final hoe T() {
        hoe hoe;
        if (this.F != null) {
            return this.F;
        }
        synchronized (this) {
            try {
                if (this.F == null) {
                    this.F = new hoe(this);
                }
                hoe = this.F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hoe;
    }

    public final w8f U() {
        w8f w8f;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new w8f(this);
                }
                w8f = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w8f;
    }

    public final qef V() {
        qef qef;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new qef(this);
                }
                qef = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qef;
    }

    public final mtf W() {
        mtf mtf;
        if (this.Q != null) {
            return this.Q;
        }
        synchronized (this) {
            try {
                if (this.Q == null) {
                    this.Q = new mtf(this);
                }
                mtf = this.Q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mtf;
    }

    public final WorkersQueueDao X() {
        WorkersQueueDao_Impl workersQueueDao_Impl;
        if (this.E != null) {
            return this.E;
        }
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = new WorkersQueueDao_Impl(this);
                }
                workersQueueDao_Impl = this.E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workersQueueDao_Impl;
    }

    public final v47 e() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("chat_title", "chat_title_content");
        hashMap.put("contact_title", "contact_title_content");
        return new v47(this, hashMap, new HashMap(0), "uploads", "message_uploads", "video_conversions", "contact_location", "chat_location", "call_links", "sticker_sets", "favorite_sticker_sets", "favorite_stickers", "recent", "default_emoji", "fcm_notifications", "fcm_notifications_history", "fcm_notifications_analytics", "notifications_read_marks", "notifications_tracker_messages", "draft_uploads", "chat_folder", "folder_and_chats", "selected_mentions", "chat_title", "contact_title", "WorkerQueueItem", "tasks", "contacts", "phones", "events", "stickers", "chats", "messages", "animoji", "animoji_set", "reactions_section", "saved_msg_chat", "webapp_biometry", "profile");
    }

    public final xde f(d34 d34) {
        return d34.c.a(new ana(d34.a, d34.b, new l0f(d34, (oy) new rfa(this), "f23a258b18fc08c44a6e0c456b946baa", "5161dd42e4d943bd0a1a2ee9b29f8077"), false, false));
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qfa(0));
        arrayList.add(new qfa(1));
        arrayList.add(new ea9(5, 6, 16));
        arrayList.add(new ea9(6, 7, 17));
        arrayList.add(new ea9(8, 9, 18));
        arrayList.add(new ea9(9, 10, 19));
        arrayList.add(new ea9(10, 11, 12));
        arrayList.add(new ea9(11, 12, 13));
        arrayList.add(new ea9(12, 13, 14));
        arrayList.add(new ea9(13, 14, 15));
        return arrayList;
    }

    public final Set i() {
        return new HashSet();
    }

    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(w8f.class, Collections.emptyList());
        hashMap.put(oy8.class, Collections.emptyList());
        hashMap.put(qef.class, Collections.emptyList());
        hashMap.put(fp3.class, Collections.emptyList());
        hashMap.put(od2.class, Collections.emptyList());
        hashMap.put(ed1.class, Collections.emptyList());
        hashMap.put(b4e.class, Collections.emptyList());
        hashMap.put(fd5.class, Collections.emptyList());
        hashMap.put(od5.class, Collections.emptyList());
        hashMap.put(d9c.class, Collections.emptyList());
        hashMap.put(ja4.class, Collections.emptyList());
        hashMap.put(ew9.class, Collections.emptyList());
        hashMap.put(kw9.class, Collections.emptyList());
        hashMap.put(yx9.class, Collections.emptyList());
        hashMap.put(ud5.class, Collections.emptyList());
        hashMap.put(le5.class, Collections.emptyList());
        hashMap.put(tp4.class, Collections.emptyList());
        hashMap.put(w4d.class, Collections.emptyList());
        hashMap.put(alc.class, Collections.emptyList());
        hashMap.put(WorkersQueueDao.class, WorkersQueueDao_Impl.getRequiredConverters());
        hashMap.put(hoe.class, Collections.emptyList());
        hashMap.put(ir3.class, Collections.emptyList());
        hashMap.put(rva.class, Collections.emptyList());
        hashMap.put(s1e.class, Collections.emptyList());
        hashMap.put(n4e.class, Collections.emptyList());
        hashMap.put(dt2.class, Arrays.asList(new Class[]{uz2.class}));
        hashMap.put(t19.class, Arrays.asList(new Class[]{v89.class}));
        hashMap.put(wh.class, Collections.emptyList());
        hashMap.put(oj.class, Collections.emptyList());
        hashMap.put(a7c.class, Collections.emptyList());
        hashMap.put(xrc.class, Collections.emptyList());
        hashMap.put(mtf.class, Collections.emptyList());
        hashMap.put(adb.class, Collections.emptyList());
        return hashMap;
    }

    public final wh t() {
        wh whVar;
        if (this.M != null) {
            return this.M;
        }
        synchronized (this) {
            try {
                if (this.M == null) {
                    this.M = new wh(this);
                }
                whVar = this.M;
            } catch (Throwable th) {
                throw th;
            }
        }
        return whVar;
    }

    public final oj u() {
        oj ojVar;
        if (this.N != null) {
            return this.N;
        }
        synchronized (this) {
            try {
                if (this.N == null) {
                    this.N = new oj(this);
                }
                ojVar = this.N;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ojVar;
    }

    public final ed1 v() {
        ed1 ed1;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new ed1(this);
                }
                ed1 = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ed1;
    }

    public final dt2 w() {
        dt2 dt2;
        if (this.K != null) {
            return this.K;
        }
        synchronized (this) {
            try {
                if (this.K == null) {
                    this.K = new dt2(this);
                }
                dt2 = this.K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dt2;
    }

    public final ir3 x() {
        ir3 ir3;
        if (this.G != null) {
            return this.G;
        }
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = new ir3(this);
                }
                ir3 = this.G;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir3;
    }

    public final ja4 y() {
        ja4 ja4;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new ja4(this);
                }
                ja4 = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ja4;
    }

    public final tp4 z() {
        tp4 tp4;
        if (this.B != null) {
            return this.B;
        }
        synchronized (this) {
            try {
                if (this.B == null) {
                    this.B = new tp4(this);
                }
                tp4 = this.B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tp4;
    }
}
