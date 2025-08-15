package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.nano.Protos;

/* renamed from: glc  reason: default package */
public final class glc implements yk, u43, r2a, vt, bvc, tj8 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ glc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public xt B(lv4 lv4, Looper looper, wt wtVar, md3 md3) {
        va4 va4 = new va4();
        if (lv4.d) {
            synchronized (va4) {
                va4.c = 4;
            }
        }
        return new go9((Context) this.b, lv4, new oc4((Context) this.b, va4), (pkg) ((u43) this.c), md3.b, looper, wtVar, (she) this.o);
    }

    public void a() {
        wuc wuc = (wuc) ((k56) this.b).invoke();
        if (wuc != null) {
            ((an9) ((je7) this.o).getValue()).f(wuc, (spa) ((k56) this.c).invoke());
        }
    }

    public void b() {
        ((a95) this.b).b();
        ((th4) this.c).e = true;
    }

    public void c(dpd dpd) {
        ((xpb) this.c).e(dpd);
    }

    public y84 d(qy5 qy5, Surface surface, boolean z) {
        y84 d = ((u43) this.b).d(qy5, surface, z);
        this.o = d.b();
        return d;
    }

    public void e(dpd dpd) {
        ((tj8) this.b).e(dpd);
    }

    public void f(hl hlVar) {
        up6 up6 = (up6) this.o;
        if (up6 instanceof up6) {
            up6.e = hlVar;
        }
    }

    public y84 g(qy5 qy5) {
        y84 g = ((u43) this.b).g(qy5);
        this.c = g.b();
        return g;
    }

    public za7 getFailParser() {
        return (za7) this.o;
    }

    public za7 getOkParser() {
        return (za7) this.c;
    }

    public int getPriority() {
        return ((fl) this.b).getPriority();
    }

    public kl getScope() {
        return ((fl) this.b).getScope();
    }

    public Uri getUri() {
        return ((fl) this.b).getUri();
    }

    public ir3 h() {
        return (ir3) ((khe) this.c).getValue();
    }

    public long i() {
        ra4 ra4 = (ra4) this.o;
        if (ra4 != null) {
            return ra4.o;
        }
        return -1;
    }

    public void j(r24 r24, Uri uri, Map map, long j, long j2, oa5 oa5) {
        boolean z;
        boolean z2 = true;
        ra4 ra4 = new ra4(r24, j, j2);
        this.o = ra4;
        if (((ka5) this.c) == null) {
            Uri uri2 = uri;
            Map map2 = map;
            ka5[] b2 = ((qa5) this.b).b(uri, map);
            if (b2.length == 1) {
                this.c = b2[0];
            } else {
                int length = b2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ka5 ka5 = b2[i];
                    try {
                        if (ka5.h(ra4)) {
                            this.c = ka5;
                            ra4.Y = 0;
                            break;
                        }
                        z = ((ka5) this.c) != null || ra4.o == j;
                        np8.f(z);
                        ra4.Y = 0;
                        i++;
                    } catch (EOFException unused) {
                        z = ((ka5) this.c) != null || ra4.o == j;
                    } catch (Throwable th) {
                        if (((ka5) this.c) == null && ra4.o != j) {
                            z2 = false;
                        }
                        np8.f(z2);
                        ra4.Y = 0;
                        throw th;
                    }
                }
                if (((ka5) this.c) == null) {
                    int i2 = maf.a;
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < b2.length; i3++) {
                        sb.append(b2[i3].getClass().getSimpleName());
                        if (i3 < b2.length - 1) {
                            sb.append(", ");
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(rh4.e(58, sb2));
                    sb3.append("None of the available extractors (");
                    sb3.append(sb2);
                    sb3.append(") could read the stream.");
                    String sb4 = sb3.toString();
                    uri.getClass();
                    throw new ParserException(sb4, (Exception) null, false, 1);
                }
            }
            ((ka5) this.c).g(oa5);
        }
    }

    /* JADX INFO: finally extract failed */
    public long k(pl3 pl3) {
        ir3 h = h();
        long j = pl3.a;
        km3 km3 = new km3(0, j, 0, 0, pl3);
        ConcurrentHashMap concurrentHashMap = ((d56) ((khe) this.o).getValue()).a;
        ilc ilc = h.a;
        ilc.b();
        ilc.c();
        try {
            long D = h.b.D(km3);
            ilc.r();
            ilc.l();
            if (pl3.j == 0 || !pl3.a()) {
                Object obj = concurrentHashMap.get(Long.valueOf(j));
                List list = pl3.f;
                if (!(obj == null ? false : obj.equals(Integer.valueOf(list.hashCode())))) {
                    concurrentHashMap.remove(Long.valueOf(j));
                    qec qec = g56.a;
                    e56 b2 = g56.b(list);
                    if (b2 != null) {
                        String c2 = bre.c(pl3.p);
                        if (oag.t(c2)) {
                            c2 = "";
                        }
                        String k = b0d.k(c2);
                        String str = null;
                        e56 e56 = b2.c;
                        String str2 = e56 != null ? e56.a : null;
                        if (e56 != null) {
                            str = e56.b;
                        }
                        h.b(k, b2.a, b2.b, str2, str, j);
                        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                        String name = ir3.class.getName();
                        hm9.m(name, "update_fts_title_contacts2 for #" + j, new Object[0]);
                    }
                }
            }
            return D;
        } catch (Throwable th) {
            ilc.l();
            throw th;
        }
    }

    public boolean shouldGzip() {
        return ((fl) this.b).shouldGzip();
    }

    public boolean shouldPost() {
        return ((fl) this.b).shouldPost();
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                ph4 ph4 = (ph4) ((ph4) this.c).b;
                String str = "";
                while (ph4 != null) {
                    Object obj = ph4.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    ph4 = (ph4) ph4.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean willWriteParams() {
        return ((fl) this.b).willWriteParams();
    }

    public boolean willWriteSupplyParams() {
        return ((fl) this.b).willWriteSupplyParams();
    }

    public void writeParams(kb7 kb7) {
        ((fl) this.b).writeParams(kb7);
    }

    public void writeSupplyParams(kb7 kb7) {
        ((fl) this.b).writeSupplyParams(kb7);
    }

    public /* synthetic */ glc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public glc(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new h7b(23, false);
                this.c = new sy4(29);
                this.o = new h7b(23, false);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.b = Collections.emptyList();
                this.c = Collections.emptyList();
                return;
            default:
                this.b = new w4d(17, false);
                this.c = new w4d(17, false);
                this.o = wz4.a;
                return;
        }
    }

    public glc(i50 i50) {
        this.a = 12;
        this.b = i50;
        xpb xpb = new xpb();
        this.c = xpb;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc a2 = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        this.o = new o1a(xpb, 50, timeUnit, a2, false).n(ce.a()).p(new gte(0, (Object) i50));
    }

    public glc(k56 k56, k56 k562, int i) {
        this.a = 11;
        k562 = (i & 2) != 0 ? new xid(12) : k562;
        khe d = l1e.a.getAccessor().d(an9.class);
        this.b = k56;
        this.c = k562;
        this.o = d;
    }

    public glc(jlc jlc) {
        this.a = 0;
        this.b = jlc;
        this.c = new khe(new lwa(14, this));
        this.o = new khe(bv3.w0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public glc(wuc wuc) {
        this(new rzd(2, wuc), (k56) null, 6);
        this.a = 11;
    }

    public glc(wye wye, djb djb) {
        this.a = 4;
        this.b = wye;
        this.c = wye.i;
        va8 va8 = new va8(12, (byte) 0);
        va8.c = "CRASH_REPORT";
        va8.b = djb;
        this.o = new h7b(va8);
    }

    public glc(fl flVar, za7 za7) {
        this.a = 1;
        nd2 nd2 = nd2.b;
        this.b = flVar;
        this.c = za7;
        this.o = nd2;
    }

    public glc(File file) {
        this.a = 13;
        this.b = null;
        this.c = file;
        this.o = null;
    }

    public glc(Boolean bool) {
        this.a = 13;
        this.b = null;
        this.c = null;
        this.o = bool;
    }

    public glc(String str, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = str;
                this.c = null;
                this.o = null;
                return;
            default:
                Object obj = new Object();
                this.c = obj;
                this.o = obj;
                this.b = str;
                return;
        }
    }
}
