package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.util.LangUtils;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b9b  reason: default package */
public final class b9b implements erd, a76, CapturerObserver, y2a, lp {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b9b(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static float f(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i > 0) {
            return f / ((float) i);
        }
        return 0.0f;
    }

    public static v3c i(View view) {
        if (view instanceof AdapterView) {
            return new xwc(0);
        }
        if (view instanceof ScrollView) {
            return new xwc(3);
        }
        if (view instanceof RecyclerView) {
            return new ywc((RecyclerView) view);
        }
        if (view instanceof NestedScrollView) {
            return new xwc(2);
        }
        if (view instanceof HorizontalScrollView) {
            return new xwc(1);
        }
        if (view.getParent() instanceof View) {
            return i((View) view.getParent());
        }
        return null;
    }

    public static View j(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView) || (view instanceof RecyclerView) || (view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return j((View) view.getParent());
        }
        return null;
    }

    public static b9b k(mb0 mb0) {
        la0 la0 = la0.c;
        c54.o(mb0, "quality cannot be null");
        c54.o(la0, "fallbackStrategy cannot be null");
        boolean contains = mb0.k.contains(mb0);
        c54.j("Invalid quality: " + mb0, contains);
        return new b9b(Collections.singletonList(mb0), la0);
    }

    public static b9b l(List list, la0 la0) {
        c54.o(list, "qualities cannot be null");
        c54.j("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mb0 mb0 = (mb0) it.next();
            boolean contains = mb0.k.contains(mb0);
            c54.j("qualities contain invalid quality: " + mb0, contains);
        }
        return new b9b(list, la0);
    }

    public x6g P(View view, x6g x6g) {
        x6g f = zmf.f(view, x6g);
        if (f.a.m()) {
            return f;
        }
        int b2 = f.b();
        Rect rect = (Rect) this.b;
        rect.left = b2;
        rect.top = f.d();
        rect.right = f.c();
        rect.bottom = f.a();
        ViewPager viewPager = (ViewPager) this.c;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            x6g b3 = zmf.b(viewPager.getChildAt(i), f);
            rect.left = Math.min(b3.b(), rect.left);
            rect.top = Math.min(b3.d(), rect.top);
            rect.right = Math.min(b3.c(), rect.right);
            rect.bottom = Math.min(b3.a(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        m6g n6g = Build.VERSION.SDK_INT >= 30 ? new n6g(f) : new m6g(f);
        n6g.f(v27.b(i2, i3, i4, i5));
        return n6g.b();
    }

    public void a(Object obj) {
        switch (this.a) {
            case 6:
                erd erd = (erd) this.b;
                try {
                    ((ol0) ((ib3) this.c).c).accept(obj, (Object) null);
                    erd.a(obj);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    erd.onError(th);
                    return;
                }
            case 8:
                Void voidR = (Void) obj;
                ((tj3) this.b).accept(new bc0(0, (Surface) this.c));
                return;
            default:
                c54.p("Unexpected result from SurfaceRequest. Surface was provided twice.", ((bc0) obj).a != 3);
                ((SurfaceTexture) this.b).release();
                hre hre = ((gre) this.c).a;
                if (hre.j != null) {
                    hre.j = null;
                    return;
                }
                return;
        }
    }

    public ld9 b(gy8 gy8) {
        float f;
        int s0 = gy8.s0();
        fp1 fp1 = null;
        Long l = null;
        float f2 = 1.0f;
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < s0; i++) {
            if (i == 0) {
                int v0 = gy8.v0();
                fp1 fp12 = (fp1) ((ConcurrentHashMap) ((o9g) this.b).b).get(Integer.valueOf(v0));
                if (fp12 != null) {
                    fp1 = fp12;
                } else {
                    throw new RuntimeException(zr6.h(v0, "Can't find compact id for "));
                }
            } else if (i == 1) {
                byte readByte = gy8.readByte();
                if (readByte == -54) {
                    f = gy8.m0(4).getFloat(gy8.v0);
                } else if (readByte == -53) {
                    f = (float) gy8.m0(8).getDouble(gy8.v0);
                } else {
                    throw gy8.r0("Float", readByte);
                }
                f2 = f;
            } else if (i == 2) {
                z = gy8.u0();
            } else if (i != 3) {
                if (i != 4) {
                    gy8.z();
                } else {
                    z2 = gy8.u0();
                }
            } else if (gy8.n().a() == 3) {
                l = Long.valueOf(gy8.w0());
            }
        }
        if (fp1 != null) {
            return new ld9(fp1, f2, z, l, z2);
        }
        throw new RuntimeException("Watch together parse error");
    }

    public void c(zl4 zl4) {
        ((erd) this.b).c(zl4);
    }

    public void d(Throwable th) {
        switch (this.a) {
            case 8:
                c54.p("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof qee);
                ((tj3) this.b).accept(new bc0(1, (Surface) this.c));
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    public boolean e(String str, String str2, d4c d4c, a4c a4c) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        boolean containsKey = linkedHashMap.containsKey(str);
        String str3 = (String) linkedHashMap.put(str, str2);
        if (!containsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        a4c.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    public void g(long j, wpa wpa) {
        if (wpa.a() >= 9) {
            int g = wpa.g();
            int g2 = wpa.g();
            int u = wpa.u();
            if (g == 434 && g2 == 1195456820 && u == 3) {
                z04.r(j, wpa, (yze[]) this.c);
            }
        }
    }

    public void h(pa5 pa5, l3f l3f) {
        int i = 0;
        while (true) {
            yze[] yzeArr = (yze[]) this.c;
            if (i < yzeArr.length) {
                l3f.a();
                l3f.b();
                yze B = pa5.B(l3f.e, 3);
                qy5 qy5 = (qy5) ((List) this.b).get(i);
                String str = qy5.n;
                fm9.e("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                ny5 ny5 = new ny5();
                l3f.b();
                ny5.a = l3f.f;
                ny5.m = ia9.l(str);
                ny5.e = qy5.e;
                ny5.d = qy5.d;
                ny5.F = qy5.G;
                ny5.p = qy5.q;
                B.e(new qy5(ny5));
                yzeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void m(rde rde) {
        try {
            yig yig = (yig) this.c;
            xeg xeg = new xeg(rde);
            Parcel G0 = yig.G0();
            agg.c(G0, xeg);
            yig.H0(G0, 12);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public String n(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void o(String str) {
        ((a4c) this.b).log("OKWSSignaling", str);
    }

    public void onCapturerStarted(boolean z) {
        rkf rkf = (rkf) this.c;
        ((a4c) rkf.c).log("VideoRecord", "Capture started (success=" + z + "), notify listener");
        w5e w5e = rkf.Z;
        if (w5e != null) {
            ((kq7) w5e.a).g.execute(new scg(w5e, z, !z));
        }
    }

    public void onCapturerStopped() {
        rkf rkf = (rkf) this.c;
        ((a4c) rkf.c).log("VideoRecord", "Capture stopped, notify listener");
        w5e w5e = rkf.Z;
        if (w5e != null) {
            ((kq7) w5e.a).g.execute(new scg(w5e, false, false));
        }
    }

    public void onError(Throwable th) {
        try {
            ((ol0) ((ib3) this.c).c).accept((Object) null, th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        ((erd) this.b).onError(th);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
    }

    public trf p(gy8 gy8) {
        int s0 = gy8.s0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < s0; i++) {
            try {
                arrayList.add(b(gy8));
            } catch (Throwable th) {
                ((a4c) this.c).log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new trf(new md9(arrayList));
    }

    public void q() {
        r68 r68 = (r68) this.b;
        if (r68.a) {
            r68.d();
            for (int i = 0; i < 2; i++) {
                ((float[]) r68.d)[i] = ((float[]) r68.f)[i];
                ((float[]) r68.e)[i] = ((float[]) r68.g)[i];
            }
            if (!r68.a) {
                r68.a = true;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = "[ ";
                if (((sud) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder l = au1.l(str);
                        l.append(((sud) this.b).s0[i]);
                        l.append(" ");
                        str = l.toString();
                    }
                }
                StringBuilder o = rh4.o(str, "] ");
                o.append((sud) this.b);
                return o.toString();
            case 2:
                return "QualitySelector{preferredQualities=" + ((List) this.b) + ", fallbackStrategy=" + ((la0) this.c) + "}";
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                if (linkedHashMap.isEmpty()) {
                    return sb.toString();
                }
                sb.append(' ');
                boolean z = true;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(';');
                    }
                    sb.append((String) entry.getKey());
                    String str2 = (String) entry.getValue();
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b9b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [cjg, java.lang.Object] */
    public b9b(Context context, int i) {
        cjg cjg;
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.b = new tjg(context, fe6.b);
                synchronized (cjg.class) {
                    try {
                        if (cjg.o == null) {
                            Context applicationContext = context.getApplicationContext();
                            ? obj = new Object();
                            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                            obj.b = newSingleThreadScheduledExecutor;
                            obj.c = Executors.newSingleThreadExecutor();
                            obj.a = applicationContext;
                            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new gwe(16, (Object) obj), 0, 86400, TimeUnit.SECONDS);
                            cjg.o = obj;
                        }
                        cjg = cjg.o;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                this.c = cjg;
                return;
            default:
                fp3.n(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(h2c.common_google_play_services_unknown_issue);
                return;
        }
    }

    public b9b(a aVar, yig yig) {
        this.a = 16;
        this.c = yig;
        fp3.n(aVar);
        this.b = aVar;
    }

    public b9b(String str, LinkedHashMap linkedHashMap) {
        this.a = 15;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        this.b = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }

    public b9b(cd6 cd6, View view) {
        this.a = 4;
        this.b = view;
    }

    public b9b(List list) {
        this.a = 11;
        this.b = list;
        this.c = new yze[list.size()];
    }

    public b9b(c9b c9b) {
        this.a = 0;
        this.c = c9b;
    }

    public b9b(ExecutorService executorService) {
        this.a = 3;
        this.c = new qpd(0);
        this.b = executorService;
    }

    public b9b(r68 r68) {
        this.a = 10;
        this.c = null;
        this.b = r68;
        r68.h = this;
    }

    public b9b() {
        this.a = 1;
        this.b = new tt3(cpc.h, (jqe) new eqe(yea.r1), Integer.valueOf(gpc.Q), (Integer) null, 20);
        this.c = new tt3(cpc.d, (jqe) new eqe(yea.q1), Integer.valueOf(gpc.u), (Integer) null, 20);
    }

    public b9b(List list, la0 la0) {
        this.a = 2;
        c54.j("No preferred quality and fallback strategy.", !list.isEmpty() || la0 != la0.c);
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = la0;
    }

    public b9b(ViewPager viewPager) {
        this.a = 13;
        this.c = viewPager;
        this.b = new Rect();
    }
}
