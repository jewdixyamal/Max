package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.ImageCaptureException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: ey1  reason: default package */
public final class ey1 implements i07, o99, qj3, dq3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ey1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: oz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: oz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: oz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dg1 c(defpackage.bg1 r8, org.json.JSONObject r9) {
        /*
            java.lang.String r0 = "participantState"
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            dg1 r0 = new dg1
            r0.<init>(r8)
            java.util.HashMap r8 = r0.a
            if (r9 != 0) goto L_0x001e
            cg1 r9 = new cg1
            java.lang.String r1 = "0"
            r2 = 0
            r9.<init>(r1, r2)
            java.lang.String r1 = "hand"
            r8.put(r1, r9)
            goto L_0x0084
        L_0x001e:
            java.lang.String r1 = "state"
            org.json.JSONObject r1 = r9.optJSONObject(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            java.lang.String r3 = "stateUpdateTs"
            org.json.JSONObject r9 = r9.optJSONObject(r3)
            if (r9 != 0) goto L_0x0031
            return r2
        L_0x0031:
            java.util.Iterator r2 = r1.keys()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0058
            java.util.HashMap r3 = new java.util.HashMap
            int r4 = r1.length()
            r3.<init>(r4)
        L_0x0044:
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r1.optString(r4)
            r3.put(r4, r5)
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0044
            goto L_0x005a
        L_0x0058:
            oz4 r3 = defpackage.oz4.a
        L_0x005a:
            java.util.Iterator r1 = r9.keys()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0084
        L_0x0064:
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r3.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x007e
            long r5 = r9.optLong(r2)
            cg1 r7 = new cg1
            r7.<init>(r4, r5)
            r8.put(r2, r7)
        L_0x007e:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x0064
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey1.c(bg1, org.json.JSONObject):dg1");
    }

    public InputStream a(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [long[], java.io.Serializable] */
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                Throwable th = (Throwable) obj;
                b32 b32 = (b32) this.b;
                hm9.p(b32.Z, "onUploadFailed: failed", th);
                eoe s = b32.s();
                long j = b32.b;
                s.d(j);
                long j2 = b32.o;
                if (j2 != 0) {
                    e52 C = b32.b().C(j2);
                    if (C != null) {
                        b32.b().W(j2, v82.b);
                        ((k4a) b32.a()).j(C.b.a);
                    }
                } else {
                    e8d e8d = b32.a;
                    if (e8d == null) {
                        e8d = null;
                    }
                    ((el3) e8d.i.getValue()).d(0, (String) null, (String) null);
                    long t = ((hyc) b32.i()).t();
                    if (t > 0) {
                        k4a k4a = (k4a) b32.a();
                        k4a.v(k4a, new oc2(((p7b) k4a.y()).a.o(), new long[]{t}, 1));
                    }
                }
                b32.t().c(new oi0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pke("internal-error", th.toString(), (String) null)));
                return;
            case 16:
                Throwable th2 = (Throwable) obj;
                Objects.requireNonNull(th2, "error is null");
                ((qj3) this.b).accept(new bt9(new fv9(th2)));
                return;
            case 19:
                hm9.p(((ei7) this.b).Z, "failed to store sticker set", (Throwable) obj);
                return;
            default:
                hm9.p(((s8d) this.b).X, "onServiceNotAvailable", (Throwable) obj);
                return;
        }
    }

    public mt2 b() {
        List<ma9> list = (List) ((AtomicReference) ((na9) ((eca) this.b).b.getValue()).c).get();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (ma9 ma9 : list) {
            String str = ma9.r;
            Uri parse = str != null ? Uri.parse(str) : null;
            long j = ma9.p;
            arrayList.add(new nl2(ma9.a, parse, ma9.b, ma9.c, ma9.t, ma9.f, (CharSequence) null, ma9.g, false, ma9.u, ma9.h, (ml2) ml2.Z.get(ma9.i), ma9.j, ma9.k, ma9.l, ma9.m, ma9.n, (Long) null, j, ma9.q, true, false));
        }
        return new mt2(arrayList, true);
    }

    public List d(JSONArray jSONArray) {
        dg1 dg1;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                dg1 = c(bg1.a(jSONObject.getString("id")), jSONObject);
            } catch (JSONException e) {
                ((a4c) this.b).logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                dg1 = null;
            }
            arrayList.add(dg1);
        }
        return x53.e0(arrayList);
    }

    public void e(String str, String str2, rh5 rh5) {
        ((ArrayList) this.b).add(new pq6(str, str2, (String) rh5.b, rh5));
    }

    public void f(String str, String str2) {
        ((ArrayList) this.b).add(new pq6(str, (String) null, (String) null, b46.o(HTTP.PLAIN_TEXT_TYPE, str2)));
    }

    public bw4 g() {
        n4c.a.getClass();
        return new bw4(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(n4c.b.h())}, 1)), x53.D0((ArrayList) this.b));
    }

    public el4 h(uk4 uk4) {
        ((o84) this.b).getClass();
        int i = uk4.a;
        ide ide = uk4.c;
        String str = uk4.b;
        lq9 lq9 = uk4.h;
        cu4 cu4 = new cu4(i, ide, str, lq9);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new el4(cu4, uk4.g, new l7(uk4.f, uk4.e, uk4.d), uk4.i, lq9, newSingleThreadExecutor);
    }

    public void i() {
        uu3 uu3 = (uu3) this.b;
        uu3.viewIsAttached = true;
        uu3.viewWasDetached = false;
        uu3.attach(uu3.view);
    }

    public void j(boolean z) {
        uu3 uu3 = (uu3) this.b;
        uu3.viewIsAttached = false;
        uu3.viewWasDetached = true;
        if (!uu3.isDetachFrozen) {
            uu3.detach(uu3.view, false, z);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [pw1, java.lang.Exception] */
    public void k(ImageCaptureException imageCaptureException) {
        hm9.m(ey1.class.getName(), "capture image with error", new Object[0]);
        cx1 cx1 = ((CameraxCameraApiView) this.b).s0;
        if (cx1 != null) {
            ((rxd) cx1).b0(new Exception(imageCaptureException));
        }
    }

    public void l() {
        uu3 uu3 = (uu3) this.b;
        if (!uu3.isDetachFrozen) {
            uu3.detach(uu3.view, false, false);
        }
    }

    public List m(JSONObject jSONObject) {
        try {
            return d(jSONObject.getJSONArray("participants"));
        } catch (JSONException e) {
            ((a4c) this.b).logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return nz4.a;
        }
    }

    public dg1 n(JSONObject jSONObject) {
        try {
            bg1 E = f46.E(jSONObject);
            if (E.a == 0) {
                E = f46.F(jSONObject);
            }
            return c(E, jSONObject);
        } catch (JSONException e) {
            ((a4c) this.b).logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(defpackage.dec r8, defpackage.jt r9, defpackage.jt r10) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r7.getClass()
            r0 = 0
            r8.v(r0)
            mdc r0 = r7.a1
            r1 = r0
            yb4 r1 = (defpackage.yb4) r1
            if (r9 == 0) goto L_0x002b
            r1.getClass()
            int r3 = r9.b
            int r5 = r10.b
            if (r3 != r5) goto L_0x0021
            int r0 = r9.c
            int r2 = r10.c
            if (r0 == r2) goto L_0x002b
        L_0x0021:
            int r4 = r9.c
            int r6 = r10.c
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L_0x003a
        L_0x002b:
            r1.m(r8)
            android.view.View r9 = r8.a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.i
            r9.add(r8)
            r8 = 1
        L_0x003a:
            if (r8 == 0) goto L_0x003f
            r7.i0()
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey1.o(dec, jt, jt):void");
    }

    public void p(dec dec, jt jtVar, jt jtVar2) {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.k(dec);
        recyclerView.i(dec);
        dec.v(false);
        yb4 yb4 = (yb4) recyclerView.a1;
        yb4.getClass();
        int i = jtVar.b;
        int i2 = jtVar.c;
        View view = dec.a;
        int left = jtVar2 == null ? view.getLeft() : jtVar2.b;
        int top = jtVar2 == null ? view.getTop() : jtVar2.c;
        if (dec.p() || (i == left && i2 == top)) {
            yb4.m(dec);
            yb4.h.add(dec);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = yb4.g(dec, i, i2, left, top);
        }
        if (z) {
            recyclerView.i0();
        }
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public ey1(Context context) {
        this.a = 15;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setId(tga.a);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        la6 la6 = (la6) oneMeDraweeView.getHierarchy();
        int i = sga.a;
        ssc ssc = ssc.m;
        la6.i(la6.b.getDrawable(i), 1);
        psc f = la6.f(1);
        if (!j47.B(f.X, ssc)) {
            f.X = ssc;
            f.Y = null;
            f.p();
            f.invalidateSelf();
        }
        this.b = oneMeDraweeView;
    }

    public ey1(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.b = new ArrayList();
                return;
            case 26:
                this.b = new LruCache(10);
                return;
            case 28:
                this.b = new Object();
                return;
            default:
                return;
        }
    }

    public ey1(TextView textView) {
        this.a = 14;
        c54.o(textView, "textView cannot be null");
        this.b = new ny4(textView);
    }
}
