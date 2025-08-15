package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import org.webrtc.EglBase;
import org.webrtc.NativeDoubleArrayConsumer;

/* renamed from: bg4  reason: default package */
public final class bg4 implements zb3, Provider {
    public static bg4 Z;
    public Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object o;

    public bg4() {
        this.a = 0;
        this.b = new Object();
        this.Y = new re(13, this);
        this.o = new ArrayList();
        this.X = new ArrayList();
        this.c = new Handler(Looper.getMainLooper());
    }

    public static synchronized bg4 h() {
        bg4 bg4;
        synchronized (bg4.class) {
            try {
                if (Z == null) {
                    Z = new bg4();
                }
                bg4 = Z;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return bg4;
    }

    public Object a(Class cls) {
        if (((Set) this.b).contains(lqb.a(cls))) {
            Object a2 = ((zb3) this.Y).a(cls);
            if (!cls.equals(zpb.class)) {
                return a2;
            }
            zpb zpb = (zpb) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public Set b(lqb lqb) {
        if (((Set) this.o).contains(lqb)) {
            return ((zb3) this.Y).b(lqb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + lqb + ">.");
    }

    public gpb c(Class cls) {
        return e(lqb.a(cls));
    }

    public gpb d(lqb lqb) {
        if (((Set) this.X).contains(lqb)) {
            return ((zb3) this.Y).d(lqb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + lqb + ">>.");
    }

    public gpb e(lqb lqb) {
        if (((Set) this.c).contains(lqb)) {
            return ((zb3) this.Y).e(lqb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + lqb + ">.");
    }

    public Object f(lqb lqb) {
        if (((Set) this.b).contains(lqb)) {
            return ((zb3) this.Y).f(lqb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + lqb + ".");
    }

    public void g(ag4 ag4) {
        synchronized (this.b) {
            ((ArrayList) this.o).remove(ag4);
        }
    }

    public Object get() {
        return new o2f((d9f) ((Provider) this.b).get(), (d9f) ((Provider) this.c).get(), (ytc) ((Provider) this.o).get(), (t8f) ((Provider) this.X).get(), (o7g) ((Provider) this.Y).get());
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.b) + ", mProviderPackage: " + ((String) this.c) + ", mQuery: " + ((String) this.o) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.X;
                    if (i < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i);
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [qq9, java.lang.Object] */
    public bg4(py0 py0, qld qld, a4c a4c, o9g o9g, bi biVar, ji9 ji9, EglBase eglBase) {
        this.a = 1;
        this.b = a4c;
        this.c = biVar;
        kad kad = new kad(1);
        this.o = kad;
        qz7 qz7 = new qz7(this, qld, biVar, kad);
        this.X = qz7;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.Y = new pi(this, new Object(), biVar, eglBase, kad);
        ync ync = new ync(1, this);
        if (!tpa.f((NativeDoubleArrayConsumer.Consumer) qz7.c, ync)) {
            qz7.c = ync;
            ((AtomicInteger) kad.Z).set(0);
        }
        copyOnWriteArraySet.add(new lq9(this));
    }

    public bg4(x3c x3c, qp4 qp4, die die) {
        this.a = 6;
        c32 c32 = z04.c;
        nd2 nd2 = a14.g;
        this.b = c32;
        this.c = nd2;
        this.o = x3c;
        this.X = qp4;
        this.Y = die;
    }

    public bg4(nb3 nb3, zb3 zb3) {
        this.a = 5;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (nh4 nh4 : nb3.c) {
            int i = nh4.c;
            boolean z = i == 0;
            int i2 = nh4.b;
            lqb lqb = nh4.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(lqb);
                } else {
                    hashSet.add(lqb);
                }
            } else if (i == 2) {
                hashSet3.add(lqb);
            } else if (i2 == 2) {
                hashSet5.add(lqb);
            } else {
                hashSet2.add(lqb);
            }
        }
        if (!nb3.g.isEmpty()) {
            hashSet.add(lqb.a(zpb.class));
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.o = Collections.unmodifiableSet(hashSet4);
        this.X = Collections.unmodifiableSet(hashSet5);
        this.Y = zb3;
    }

    public bg4(String str, String str2, String str3, List list) {
        this.a = 3;
        str.getClass();
        this.b = str;
        str2.getClass();
        this.c = str2;
        this.o = str3;
        list.getClass();
        this.X = list;
        this.Y = str + "-" + str2 + "-" + str3;
    }

    public bg4(String str) {
        this.a = 2;
        this.b = nz4.a;
        this.o = new ArrayList();
        new HashSet();
        this.X = new ArrayList();
        this.c = new ArrayList();
        this.Y = new ArrayList();
    }

    public bg4(v4 v4Var, je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = 4;
        this.b = v4Var;
        this.c = je7;
        this.o = je72;
        this.X = je73;
        this.Y = je74;
    }
}
