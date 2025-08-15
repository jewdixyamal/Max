package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: vd8  reason: default package */
public final class vd8 extends hdc implements v0e {
    public final c X;
    public final wv7 Y = new wv7((Object) null);
    public final wv7 Z = new wv7((Object) null);
    public final gh7 o;
    public final wv7 s0 = new wv7((Object) null);
    public pz7 t0;
    public final o9g u0;
    public boolean v0;
    public boolean w0;
    public final List x0;
    public final rp7 y0;
    public final HashMap z0;

    public vd8(b bVar, ArrayList arrayList, rp7 rp7) {
        n16 S = bVar.S();
        o9g o9g = new o9g(16, false);
        o9g.b = new CopyOnWriteArrayList();
        this.u0 = o9g;
        this.v0 = false;
        this.w0 = false;
        this.X = S;
        this.o = bVar.a;
        A(true);
        this.x0 = arrayList;
        this.y0 = rp7;
        this.z0 = new HashMap();
    }

    public static void C(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public final boolean D(long j) {
        return j >= 0 && j < ((long) this.x0.size());
    }

    public final void E() {
        wv7 wv7;
        wv7 wv72;
        a aVar;
        View k0;
        if (this.w0 && !this.X.Q()) {
            xs xsVar = new xs(0);
            int i = 0;
            while (true) {
                wv7 = this.Y;
                int h = wv7.h();
                wv72 = this.s0;
                if (i >= h) {
                    break;
                }
                long e = wv7.e(i);
                if (!D(e)) {
                    xsVar.add(Long.valueOf(e));
                    wv72.g(e);
                }
                i++;
            }
            if (!this.v0) {
                this.w0 = false;
                for (int i2 = 0; i2 < wv7.h(); i2++) {
                    long e2 = wv7.e(i2);
                    if (wv72.d(e2) < 0 && ((aVar = (a) wv7.c(e2)) == null || (k0 = aVar.k0()) == null || k0.getParent() == null)) {
                        xsVar.add(Long.valueOf(e2));
                    }
                }
            }
            qs qsVar = new qs(xsVar);
            while (qsVar.hasNext()) {
                I(((Long) qsVar.next()).longValue());
            }
        }
    }

    public final FrgLocalMedia F(long j) {
        WeakReference weakReference = (WeakReference) this.z0.get(Long.valueOf(j));
        if (weakReference != null) {
            return (FrgLocalMedia) weakReference.get();
        }
        return null;
    }

    public final Long G(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            wv7 wv7 = this.s0;
            if (i2 >= wv7.h()) {
                return l;
            }
            if (((Integer) wv7.i(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(wv7.e(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public final void H(w16 w16) {
        a aVar = (a) this.Y.c(w16.X);
        if (aVar != null) {
            FrameLayout frameLayout = (FrameLayout) w16.a;
            View k0 = aVar.k0();
            if (aVar.o0() || k0 == null) {
                boolean o0 = aVar.o0();
                c cVar = this.X;
                if (o0 && k0 == null) {
                    ((CopyOnWriteArrayList) cVar.o.c).add(new c16(new jo7(this, aVar, frameLayout)));
                } else if (!aVar.o0() || k0.getParent() == null) {
                    if (aVar.o0()) {
                        C(k0, frameLayout);
                    } else if (!cVar.Q()) {
                        ((CopyOnWriteArrayList) cVar.o.c).add(new c16(new jo7(this, aVar, frameLayout)));
                        o9g o9g = this.u0;
                        o9g.getClass();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((CopyOnWriteArrayList) o9g.b).iterator();
                        if (!it.hasNext()) {
                            try {
                                aVar.Z0(false);
                                he0 he0 = new he0(cVar);
                                he0.f(0, aVar, "f" + w16.X, 1);
                                he0.i(aVar, fg7.o);
                                he0.e();
                                this.t0.f(false);
                            } finally {
                                o9g.u(arrayList);
                            }
                        } else {
                            au1.r(it.next());
                            throw null;
                        }
                    } else if (!cVar.J) {
                        this.o.a(new bc4(this, w16));
                    }
                } else if (k0.getParent() != frameLayout) {
                    C(k0, frameLayout);
                }
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void I(long j) {
        ViewParent parent;
        wv7 wv7 = this.Y;
        a aVar = (a) wv7.c(j);
        if (aVar != null) {
            if (!(aVar.k0() == null || (parent = aVar.k0().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            boolean D = D(j);
            wv7 wv72 = this.Z;
            if (!D) {
                wv72.g(j);
            }
            if (!aVar.o0()) {
                wv7.g(j);
                return;
            }
            c cVar = this.X;
            if (cVar.Q()) {
                this.w0 = true;
                return;
            }
            boolean o0 = aVar.o0();
            o9g o9g = this.u0;
            if (o0 && D(j)) {
                o9g.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((CopyOnWriteArrayList) o9g.b).iterator();
                if (!it.hasNext()) {
                    x06 b0 = cVar.b0(aVar);
                    o9g.u(arrayList);
                    wv72.f(j, b0);
                } else {
                    au1.r(it.next());
                    throw null;
                }
            }
            o9g.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((CopyOnWriteArrayList) o9g.b).iterator();
            if (!it2.hasNext()) {
                try {
                    he0 he0 = new he0(cVar);
                    he0.h(aVar);
                    he0.e();
                    wv7.g(j);
                } finally {
                    o9g.u(arrayList2);
                }
            } else {
                au1.r(it2.next());
                throw null;
            }
        }
    }

    public final Parcelable a() {
        wv7 wv7 = this.Y;
        int h = wv7.h();
        wv7 wv72 = this.Z;
        Bundle bundle = new Bundle(wv72.h() + h);
        for (int i = 0; i < wv7.h(); i++) {
            long e = wv7.e(i);
            a aVar = (a) wv7.c(e);
            if (aVar != null && aVar.o0()) {
                this.X.W(bundle, ey8.h(e, "f#"), aVar);
            }
        }
        for (int i2 = 0; i2 < wv72.h(); i2++) {
            long e2 = wv72.e(i2);
            if (D(e2)) {
                bundle.putParcelable(ey8.h(e2, "s#"), (Parcelable) wv72.c(e2));
            }
        }
        return bundle;
    }

    public final void c(Parcelable parcelable) {
        String next;
        wv7 wv7 = this.Z;
        if (wv7.h() == 0) {
            wv7 wv72 = this.Y;
            if (wv72.h() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(vd8.class.getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        next = it.next();
                        if (!next.startsWith("f#") || next.length() <= 2) {
                            z = false;
                        }
                        if (z) {
                            wv72.f(Long.parseLong(next.substring(2)), this.X.H(next, bundle));
                        } else if (next.startsWith("s#") && next.length() > 2) {
                            long parseLong = Long.parseLong(next.substring(2));
                            x06 x06 = (x06) bundle.getParcelable(next);
                            if (D(parseLong)) {
                                wv7.f(parseLong, x06);
                            }
                        }
                    } else if (wv72.h() != 0) {
                        this.w0 = true;
                        this.v0 = true;
                        E();
                        Handler handler = new Handler(Looper.getMainLooper());
                        re reVar = new re(25, this);
                        this.o.a(new bc4(handler, 2, reVar));
                        handler.postDelayed(reVar, WorkRequest.MIN_BACKOFF_MILLIS);
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final int j() {
        return this.x0.size();
    }

    public final long k(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, pz7] */
    public final void q(RecyclerView recyclerView) {
        c54.k(this.t0 == null);
        ? obj = new Object();
        obj.f = this;
        obj.a = -1;
        this.t0 = obj;
        ViewPager2 e = pz7.e(recyclerView);
        obj.e = e;
        lh0 lh0 = new lh0(7, obj);
        obj.b = lh0;
        e.b(lh0);
        pz4 pz4 = new pz4(2, obj);
        obj.c = pz4;
        z(pz4);
        fdc fdc = new fdc(5, obj);
        obj.d = fdc;
        this.o.a(fdc);
    }

    public final void r(dec dec, int i) {
        a aVar;
        Bundle bundle;
        w16 w16 = (w16) dec;
        long j = w16.X;
        FrameLayout frameLayout = (FrameLayout) w16.a;
        int id = frameLayout.getId();
        Long G = G(id);
        wv7 wv7 = this.s0;
        if (!(G == null || G.longValue() == j)) {
            I(G.longValue());
            wv7.g(G.longValue());
        }
        wv7.f(j, Integer.valueOf(id));
        long j2 = (long) i;
        wv7 wv72 = this.Y;
        if (wv72.d(j2) < 0) {
            up7 up7 = (up7) this.x0.get(i);
            String a = up7.a();
            rp7 rp7 = this.y0;
            String str = rp7.Y;
            Bundle bundle2 = null;
            boolean e = kp.e(a != null ? Uri.parse(a) : null, str != null ? Uri.parse(str) : null);
            HashMap hashMap = this.z0;
            int i2 = up7.a;
            long j3 = up7.b;
            if (i2 != 1) {
                if (i2 == 3) {
                    aVar = new FrgLocalVideo();
                    aVar.X0(FrgLocalMedia.s1(up7, e, rp7));
                    hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
                } else {
                    throw new IllegalStateException(zr6.h(i2, "media type should be known, type = "));
                }
            } else if (up7.d()) {
                aVar = new FrgLocalGif();
                aVar.X0(FrgLocalMedia.s1(up7, e, rp7));
                hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
            } else {
                aVar = new FrgLocalPhoto();
                aVar.X0(FrgLocalMedia.s1(up7, e, rp7));
                hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
            }
            x06 x06 = (x06) this.Z.c(j2);
            if (aVar.F0 == null) {
                if (!(x06 == null || (bundle = x06.a) == null)) {
                    bundle2 = bundle;
                }
                aVar.b = bundle2;
                wv72.f(j2, aVar);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        if (frameLayout.isAttachedToWindow()) {
            H(w16);
        }
        E();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = w16.F0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new dec(frameLayout);
    }

    public final void u(RecyclerView recyclerView) {
        pz7 pz7 = this.t0;
        pz7.getClass();
        pz7.e(recyclerView).g((lh0) pz7.b);
        vd8 vd8 = (vd8) pz7.f;
        vd8.B((pz4) pz7.c);
        vd8.o.f((fdc) pz7.d);
        pz7.e = null;
        this.t0 = null;
    }

    public final /* bridge */ /* synthetic */ boolean v(dec dec) {
        w16 w16 = (w16) dec;
        return true;
    }

    public final void w(dec dec) {
        H((w16) dec);
        E();
    }

    public final void y(dec dec) {
        Long G = G(((FrameLayout) ((w16) dec).a).getId());
        if (G != null) {
            I(G.longValue());
            this.s0.g(G.longValue());
        }
    }
}
