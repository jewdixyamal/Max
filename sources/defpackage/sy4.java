package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: sy4  reason: default package */
public final class sy4 implements lv, o11, ia, dn2, n43, ys3, co7, nq8, pic, qj3, Provider, mq1, g8b, zde {
    public static final fs4 c = new fs4(20);
    public static final yw2 o = new yw2(new yw2(new ba3(new fs4(22), 0), 1), 2);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ sy4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static boolean D(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static qy3 L(File file) {
        try {
            String name = file.getName();
            int E0 = w9e.E0(name, '_', 0, 6);
            if (E0 >= 0) {
                int o2 = z7b.o(name.substring(0, E0));
                long parseLong = Long.parseLong(name.substring(E0 + 1));
                File J = lk5.J(file, "system_info");
                if (J.exists()) {
                    File J2 = lk5.J(file, "stacktrace");
                    if (J2.exists()) {
                        File J3 = lk5.J(file, "tags");
                        File J4 = lk5.J(file, "all_stacktraces");
                        File J5 = lk5.J(file, "all_logs");
                        return new qy3(parseLong, o2, file.getPath(), J.getPath(), J3.getPath(), J2.getPath(), J4.getPath(), J5.getPath());
                    }
                    throw new IllegalStateException("No stacktrace file".toString());
                }
                throw new IllegalStateException("No system info file".toString());
            }
            throw new IllegalStateException("Malformed directory name ".concat(name).toString());
        } catch (Exception e) {
            lk5.F(file);
            throw e;
        }
    }

    public static void R(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public int A() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public String B(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void C(int i, long j) {
        c28 c28 = (c28) this.b;
        c28.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = true;
                int i2 = 3;
                switch (i) {
                    case 131:
                        c28.b(i);
                        c28.u.d = (int) j;
                        return;
                    case 136:
                        c28.b(i);
                        a28 a28 = c28.u;
                        if (j != 1) {
                            z = false;
                        }
                        a28.V = z;
                        return;
                    case 155:
                        c28.I = c28.k(j);
                        return;
                    case 159:
                        c28.b(i);
                        c28.u.O = (int) j;
                        return;
                    case 176:
                        c28.b(i);
                        c28.u.m = (int) j;
                        return;
                    case 179:
                        c28.a(i);
                        c28.C.a(c28.k(j));
                        return;
                    case 186:
                        c28.b(i);
                        c28.u.n = (int) j;
                        return;
                    case 215:
                        c28.b(i);
                        c28.u.c = (int) j;
                        return;
                    case 231:
                        c28.B = c28.k(j);
                        return;
                    case 238:
                        c28.P = (int) j;
                        return;
                    case 241:
                        if (!c28.E) {
                            c28.a(i);
                            c28.D.a(j);
                            c28.E = true;
                            return;
                        }
                        return;
                    case 251:
                        c28.Q = true;
                        return;
                    case 16871:
                        c28.b(i);
                        c28.u.g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb5.toString());
                        }
                        return;
                    case 21420:
                        c28.x = j + c28.q;
                        return;
                    case 21432:
                        int i3 = (int) j;
                        c28.b(i);
                        if (i3 == 0) {
                            c28.u.w = 0;
                            return;
                        } else if (i3 == 1) {
                            c28.u.w = 2;
                            return;
                        } else if (i3 == 3) {
                            c28.u.w = 1;
                            return;
                        } else if (i3 == 15) {
                            c28.u.w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        c28.b(i);
                        c28.u.o = (int) j;
                        return;
                    case 21682:
                        c28.b(i);
                        c28.u.q = (int) j;
                        return;
                    case 21690:
                        c28.b(i);
                        c28.u.p = (int) j;
                        return;
                    case 21930:
                        c28.b(i);
                        a28 a282 = c28.u;
                        if (j != 1) {
                            z = false;
                        }
                        a282.U = z;
                        return;
                    case 21998:
                        c28.b(i);
                        c28.u.f = (int) j;
                        return;
                    case 22186:
                        c28.b(i);
                        c28.u.R = j;
                        return;
                    case 22203:
                        c28.b(i);
                        c28.u.S = j;
                        return;
                    case 25188:
                        c28.b(i);
                        c28.u.P = (int) j;
                        return;
                    case 30321:
                        c28.b(i);
                        int i4 = (int) j;
                        if (i4 == 0) {
                            c28.u.r = 0;
                            return;
                        } else if (i4 == 1) {
                            c28.u.r = 1;
                            return;
                        } else if (i4 == 2) {
                            c28.u.r = 2;
                            return;
                        } else if (i4 == 3) {
                            c28.u.r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        c28.b(i);
                        c28.u.e = (int) j;
                        return;
                    case 2807729:
                        c28.r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                c28.b(i);
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    c28.u.A = 2;
                                    return;
                                } else if (i5 == 2) {
                                    c28.u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                c28.b(i);
                                int i6 = (int) j;
                                if (i6 != 1) {
                                    if (i6 == 16) {
                                        i2 = 6;
                                    } else if (i6 == 18) {
                                        i2 = 7;
                                    } else if (!(i6 == 6 || i6 == 7)) {
                                        i2 = -1;
                                    }
                                }
                                if (i2 != -1) {
                                    c28.u.z = i2;
                                    return;
                                }
                                return;
                            case 21947:
                                c28.b(i);
                                c28.u.x = true;
                                int a2 = h63.a((int) j);
                                if (a2 != -1) {
                                    c28.u.y = a2;
                                    return;
                                }
                                return;
                            case 21948:
                                c28.b(i);
                                c28.u.B = (int) j;
                                return;
                            case 21949:
                                c28.b(i);
                                c28.u.C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw ParserException.a((RuntimeException) null, sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw ParserException.a((RuntimeException) null, sb7.toString());
        }
    }

    public void E(fs8 fs8) {
        String str = fs8.Z;
        hm9.m("sy4", "got broken message element, text: %s, elements: %s", Integer.valueOf(str != null ? str.length() : 0), fs8.C0);
        ((ad) this.b).f("MENTION_BROKEN_RANGE");
    }

    public void F() {
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        h21 n0 = ((CallBottomPanelWidget) this.b).n0();
        ir1 r = n0.r();
        lvc lvc = r.i;
        lvc.getClass();
        kvc kvc = ((wvc) ((vvc) lvc).t0.getValue()).b;
        boolean f = tpa.f(kvc != null ? kvc.c : null, ((cra) r.d).c().a.getId());
        el1 el1 = n0.c;
        if (f) {
            pnf.o(el1.M0, fj1.D);
        } else {
            pnf.o(el1.M0, aj1.D);
        }
    }

    public void G(View view) {
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) this.b;
        if (((el1) callBottomPanelWidget.c.getValue()).u()) {
            if (callBottomPanelWidget.n0().t()) {
                qt3 s = dy7.c(1).y().Y(view).s();
                ArrayList q = callBottomPanelWidget.n0().q();
                ArrayList arrayList = new ArrayList(z53.S(q, 10));
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    a51 a51 = (a51) it.next();
                    arrayList.add(new tt3(a51.getId(), a51.getTitle(), Integer.valueOf(wfa.W), Integer.valueOf(a51.getIcon()), Integer.valueOf(wfa.Q)));
                }
                rt3 build = s.I(arrayList).build();
                callBottomPanelWidget.Y = build;
                build.q(callBottomPanelWidget);
            }
        } else if (callBottomPanelWidget.n0().t()) {
            callBottomPanelWidget.m0().e(callBottomPanelWidget.n0().q());
        }
    }

    public void H() {
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        pnf.o(((CallBottomPanelWidget) this.b).n0().c.M0, hj1.D);
    }

    public void I(boolean z) {
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        pnf.o(((CallBottomPanelWidget) this.b).n0().c.M0, new rj1(z));
    }

    public Bundle J() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public e99 K(ra4 ra4, xs6 xs6) {
        yaf yaf = (yaf) this.b;
        e99 e99 = null;
        int i = 0;
        while (true) {
            try {
                ra4.q(yaf.a, 0, 10, false);
                yaf.H(0);
                if (yaf.x() != 4801587) {
                    break;
                }
                yaf.I(3);
                int u = yaf.u();
                int i2 = u + 10;
                if (e99 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(yaf.a, 0, bArr, 0, 10);
                    ra4.q(bArr, 10, u, false);
                    e99 = new at6(xs6).u0(i2, bArr);
                } else {
                    ra4.b(u, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ra4.Y = 0;
        ra4.b(i, false);
        return e99;
    }

    public void M(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        defpackage.v3c.i(r1, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.qy3 N(int r10, java.lang.Throwable r11, defpackage.yie r12, java.util.List r13, java.util.Map r14, java.util.List r15) {
        /*
            r9 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.charset.Charset r1 = defpackage.a52.a
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r3 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r3)
            defpackage.ju0.f(r11, r1)     // Catch:{ all -> 0x0029 }
            r11 = 0
            defpackage.v3c.i(r1, r11)
            byte[] r4 = r0.toByteArray()
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            qy3 r9 = r2.O(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0029:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x002b }
        L_0x002b:
            r10 = move-exception
            defpackage.v3c.i(r1, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy4.N(int, java.lang.Throwable, yie, java.util.List, java.util.Map, java.util.List):qy3");
    }

    public qy3 O(int i, byte[] bArr, yie yie, List list, Map map, List list2) {
        String str;
        String str2;
        Throwable th;
        Throwable th2;
        int i2;
        Throwable th3;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        String q = c37.q();
        Context context = (Context) this.b;
        if (q.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(q.replace(':', '-'));
        }
        File J = lk5.J(new File(context.getCacheDir(), str), "crashes");
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str2 = "CRASH";
                break;
            case 2:
                str2 = "NON_FATAL";
                break;
            case 3:
                str2 = "FATAL";
                break;
            case 4:
                str2 = "ERROR";
                break;
            case 5:
                str2 = "WARNING";
                break;
            case 6:
                str2 = "NOTICE";
                break;
            case 7:
                str2 = "INFO";
                break;
            case 8:
                str2 = "DEBUG";
                break;
            case 9:
                str2 = "MINIDUMP";
                break;
            case 10:
                str2 = "ANR";
                break;
            default:
                throw null;
        }
        sb.append(str2);
        sb.append('_');
        sb.append(currentTimeMillis);
        File J2 = lk5.J(J, sb.toString());
        if (J2.exists()) {
            J2.getName();
            return null;
        }
        try {
            m6d.y(J2);
            File J3 = lk5.J(J2, "stacktrace");
            FileOutputStream fileOutputStream = new FileOutputStream(J3);
            try {
                fileOutputStream.write(bArr);
                v3c.i(fileOutputStream, (Throwable) null);
                File J4 = lk5.J(J2, "system_info");
                lk5.K(J4, j47.q0(yie).toString());
                File J5 = lk5.J(J2, "tags");
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((Object) (String) it.next());
                    }
                    lk5.K(J5, jSONArray.toString());
                }
                File J6 = lk5.J(J2, "all_stacktraces");
                th = 0;
                if (!map.isEmpty()) {
                    TreeMap treeMap = new TreeMap(c);
                    treeMap.putAll(map);
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(J6), a52.a), 8192));
                    try {
                        for (Map.Entry entry : treeMap.entrySet()) {
                            Thread thread = (Thread) entry.getKey();
                            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                            printWriter.append("Thread: ").append(thread.getName()).append(" (").append(thread.getState().toString()).append(")");
                            printWriter.append(10);
                            int length = stackTraceElementArr.length;
                            while (i3 < length) {
                                ju0.h(stackTraceElementArr[i3], printWriter, th, 6);
                                i3++;
                            }
                        }
                        v3c.i(printWriter, (Throwable) null);
                    } catch (Throwable th4) {
                        v3c.i(printWriter, th3);
                        throw th3;
                    } finally {
                        th3 = th4;
                    }
                }
                File J7 = lk5.J(J2, "all_logs");
                if (!list2.isEmpty()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(J7), 8192);
                    try {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int i4 = i2 + 1;
                            ((ns7) it2.next()).a(bufferedOutputStream, i2);
                            i2 = i4;
                        }
                        v3c.i(bufferedOutputStream, (Throwable) null);
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        v3c.i(bufferedOutputStream, th2);
                        throw th6;
                    }
                }
                return new qy3(currentTimeMillis, i, J2.getPath(), J4.getPath(), J5.getPath(), J3.getPath(), J6.getPath(), J7.getPath());
            } catch (Throwable th7) {
                v3c.i(fileOutputStream, th);
                throw th;
            } finally {
                th = th7;
            }
        } catch (IOException unused) {
            lk5.F(J2);
            return null;
        }
    }

    public boolean Q(List list) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((jxd) it.next()).c));
        }
        Set H0 = x53.H0(arrayList);
        boolean z = !H0.equals((Set) this.b);
        this.b = H0;
        return z;
    }

    public void S(yde yde) {
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [pu9, hre] */
    public void a(see see) {
        wee wee;
        if (!kq0.t()) {
            ot3.a(((q8b) this.b).getContext()).execute(new do9(this, 16, see));
            return;
        }
        ax1 ax1 = see.e;
        ((q8b) this.b).y0 = ax1.p();
        r8b r8b = ((q8b) this.b).w0;
        Rect e = ax1.g().e();
        r8b.getClass();
        r8b.a = new Rational(e.width(), e.height());
        synchronized (r8b) {
            r8b.c = e;
        }
        see.c(ot3.a(((q8b) this.b).getContext()), new u00((Object) this, (Object) ax1, (Object) see, 23));
        q8b q8b = (q8b) this.b;
        pu9 pu9 = q8b.b;
        n8b n8b = q8b.a;
        if (!(pu9 instanceof wee) || q8b.c(see, n8b)) {
            q8b q8b2 = (q8b) this.b;
            if (q8b.c(see, q8b2.a)) {
                q8b q8b3 = (q8b) this.b;
                ? pu92 = new pu9(q8b3, q8b3.o);
                pu92.i = false;
                pu92.k = new AtomicReference();
                wee = pu92;
            } else {
                q8b q8b4 = (q8b) this.b;
                wee = new wee(q8b4, q8b4.o);
            }
            q8b2.b = wee;
        }
        yw1 p = ax1.p();
        q8b q8b5 = (q8b) this.b;
        k8b k8b = new k8b(p, q8b5.t0, q8b5.b);
        ((q8b) this.b).u0.set(k8b);
        ax1.f().f(ot3.a(((q8b) this.b).getContext()), k8b);
        ((q8b) this.b).b.l(see, new u00((Object) this, (Object) k8b, (Object) ax1, 24));
        q8b q8b6 = (q8b) this.b;
        if (q8b6.indexOfChild(q8b6.c) == -1) {
            q8b q8b7 = (q8b) this.b;
            q8b7.addView(q8b7.c);
        }
        ((q8b) this.b).getClass();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 16: goto L_0x006c;
                case 22: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r5 = r5.b
            s8d r5 = (defpackage.s8d) r5
            java.lang.String r5 = r5.X
            java.lang.String r0 = "onSuccess"
            defpackage.hm9.p(r5, r0, r6)
            return
        L_0x0013:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x006b
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x001e
            goto L_0x006b
        L_0x001e:
            java.util.Iterator r6 = r6.iterator()
        L_0x0022:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r6.next()
            fs8 r0 = (defpackage.fs8) r0
            java.util.List r1 = r0.C0
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0039
            goto L_0x0022
        L_0x0039:
            java.lang.String r1 = r0.Z
            if (r1 == 0) goto L_0x0067
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0044
            goto L_0x0067
        L_0x0044:
            java.util.List r2 = r0.C0
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r2.next()
            lu8 r3 = (defpackage.lu8) r3
            short r4 = r3.o
            if (r4 < 0) goto L_0x0063
            short r3 = r3.X
            int r4 = r4 + r3
            int r3 = r1.length()
            if (r4 <= r3) goto L_0x004a
        L_0x0063:
            r5.E(r0)
            goto L_0x0022
        L_0x0067:
            r5.E(r0)
            goto L_0x0022
        L_0x006b:
            return
        L_0x006c:
            java.lang.String r0 = "value is null"
            java.util.Objects.requireNonNull(r6, r0)
            bt9 r0 = new bt9
            r0.<init>(r6)
            java.lang.Object r5 = r5.b
            qj3 r5 = (defpackage.qj3) r5
            r5.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy4.accept(java.lang.Object):void");
    }

    public void b(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    public bt3 build() {
        return new bt3(new wd6(((ContentInfo.Builder) this.b).build()));
    }

    public void c(gg1 gg1, boolean z) {
        bc7[] bc7Arr = CallOpponentsListWidget.H0;
        ((yz0) ((ez0) ((CallOpponentsListWidget) this.b).r0().t0.getValue())).c(gg1, z);
    }

    public void d(ClipData clipData) {
        ((ContentInfo.Builder) this.b).setClip(clipData);
    }

    public void e(Object obj) {
        ((wm5) this.b).b.e((byte[]) obj);
    }

    public void f() {
        ((yxc) this.b).getClass();
    }

    public void g() {
        je1 je1 = je1.c;
        je1.getClass();
        je1.P1().b(":call-admin-waiting-room", (Bundle) null);
    }

    public Object get() {
        return this.b;
    }

    public void h(Object obj) {
        ww0 ww0 = (ww0) obj;
        ((pq9) this.b).getClass();
    }

    public e5f h0(long j, List list) {
        boolean isEmpty = list.isEmpty();
        e5f e5f = e5f.a;
        if (isEmpty) {
            return e5f;
        }
        ((bx) this.b).B();
        ((bx) this.b).o(j, list, false, true);
        return e5f;
    }

    public void i(Object obj) {
        ww0 ww0 = (ww0) obj;
        ((pq9) this.b).getClass();
    }

    public void j(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    if (((ArrayList) this.b) == null) {
                        this.b = new ArrayList();
                    }
                    if (!((ArrayList) this.b).contains(str)) {
                        ((ArrayList) this.b).add(str);
                    }
                } else {
                    throw new IllegalArgumentException("category must not be null");
                }
            }
        }
    }

    public void k(da9... da9Arr) {
        for (da9 da9 : da9Arr) {
            int i = da9.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
            Integer valueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i2 = da9.b;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap.get(Integer.valueOf(i2)));
                da9.toString();
            }
            treeMap.put(Integer.valueOf(i2), da9);
        }
    }

    public void l(int i, int i2, ra4 ra4) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        ra4 ra42 = ra4;
        c28 c28 = (c28) this.b;
        SparseArray sparseArray = c28.c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 161 || i7 == 163) {
            int i12 = c28.G;
            yaf yaf = c28.g;
            if (i12 == 0) {
                yaf yaf2 = c28.b;
                c28.M = (int) yaf2.B(ra42, false, true, 8);
                c28.N = yaf2.c;
                c28.I = -9223372036854775807L;
                c28.G = 1;
                yaf.E(0);
            }
            a28 a28 = (a28) sparseArray.get(c28.M);
            if (a28 == null) {
                ra42.z(i8 - c28.N);
                c28.G = 0;
                return;
            }
            a28.X.getClass();
            if (c28.G == 1) {
                c28.f(ra42, 3);
                int i13 = (yaf.a[2] & 6) >> 1;
                if (i13 == 0) {
                    c28.K = 1;
                    int[] iArr = c28.L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    c28.L = iArr;
                    iArr[0] = (i8 - c28.N) - 3;
                } else {
                    c28.f(ra42, 4);
                    int i14 = (yaf.a[3] & 255) + 1;
                    c28.K = i14;
                    int[] iArr2 = c28.L;
                    if (iArr2 == null) {
                        iArr2 = new int[i14];
                    } else if (iArr2.length < i14) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i14)];
                    }
                    c28.L = iArr2;
                    if (i13 == 2) {
                        int i15 = c28.K;
                        Arrays.fill(iArr2, 0, i15, ((i8 - c28.N) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = c28.K - 1;
                            if (i16 >= i4) {
                                break;
                            }
                            c28.L[i16] = 0;
                            while (true) {
                                i5 = i9 + 1;
                                c28.f(ra42, i5);
                                byte b2 = yaf.a[i9] & 255;
                                int[] iArr3 = c28.L;
                                i6 = iArr3[i16] + b2;
                                iArr3[i16] = i6;
                                if (b2 != 255) {
                                    break;
                                }
                                i9 = i5;
                            }
                            i17 += i6;
                            i16++;
                            i9 = i5;
                        }
                        c28.L[i4] = ((i8 - c28.N) - i9) - i17;
                    } else if (i13 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = c28.K - i11;
                            if (i18 >= i20) {
                                c28.L[i20] = ((i8 - c28.N) - i9) - i19;
                                break;
                            }
                            c28.L[i18] = i10;
                            int i21 = i9 + 1;
                            c28.f(ra42, i21);
                            if (yaf.a[i9] != 0) {
                                int i22 = i10;
                                int i23 = 8;
                                while (true) {
                                    if (i22 >= i23) {
                                        j = 0;
                                        i9 = i21;
                                        break;
                                    }
                                    int i24 = i11 << (7 - i22);
                                    if ((yaf.a[i9] & i24) != 0) {
                                        int i25 = i21 + i22;
                                        c28.f(ra42, i25);
                                        j = (long) (yaf.a[i9] & 255 & (~i24));
                                        while (i21 < i25) {
                                            j = (j << 8) | ((long) (yaf.a[i21] & 255));
                                            i21++;
                                            i25 = i25;
                                        }
                                        int i26 = i25;
                                        if (i18 > 0) {
                                            j -= (1 << ((i22 * 7) + 6)) - 1;
                                        }
                                        i9 = i26;
                                    } else {
                                        i22++;
                                        i23 = 8;
                                        i11 = 1;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i27 = (int) j;
                                    int[] iArr4 = c28.L;
                                    if (i18 != 0) {
                                        i27 += iArr4[i18 - 1];
                                    }
                                    iArr4[i18] = i27;
                                    i19 += i27;
                                    i18++;
                                    i10 = 0;
                                    i11 = 1;
                                }
                            } else {
                                throw ParserException.a((RuntimeException) null, "No valid varint length mask found");
                            }
                        }
                        throw ParserException.a((RuntimeException) null, "EBML lacing sample size out of range.");
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i13);
                        throw ParserException.a((RuntimeException) null, sb.toString());
                    }
                }
                byte[] bArr = yaf.a;
                c28.H = c28.k((long) ((bArr[1] & 255) | (bArr[0] << 8))) + c28.B;
                c28.O = (a28.d == 2 || (i7 == 163 && (yaf.a[2] & 128) == 128)) ? 1 : 0;
                c28.G = 2;
                c28.J = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i7 == i3) {
                while (true) {
                    int i28 = c28.J;
                    if (i28 < c28.K) {
                        c28.c(a28, c28.H + ((long) ((c28.J * a28.e) / 1000)), c28.O, c28.l(ra42, a28, c28.L[i28]), 0);
                        c28.J++;
                    } else {
                        c28.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = c28.J;
                    if (i29 < c28.K) {
                        int[] iArr5 = c28.L;
                        iArr5[i29] = c28.l(ra42, a28, iArr5[i29]);
                        c28.J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != 165) {
            if (i7 == 16877) {
                c28.b(i7);
                a28 a282 = c28.u;
                int i30 = a282.g;
                if (i30 == 1685485123 || i30 == 1685480259) {
                    byte[] bArr2 = new byte[i8];
                    a282.N = bArr2;
                    ra42.h(bArr2, 0, i8, false);
                    return;
                }
                ra42.z(i8);
            } else if (i7 == 16981) {
                c28.b(i7);
                a28 a283 = c28.u;
                byte[] bArr3 = new byte[i8];
                a283.i = bArr3;
                ra42.h(bArr3, 0, i8, false);
            } else if (i7 == 18402) {
                byte[] bArr4 = new byte[i8];
                ra42.h(bArr4, 0, i8, false);
                c28.b(i7);
                c28.u.j = new vze(1, 0, 0, bArr4);
            } else if (i7 == 21419) {
                yaf yaf3 = c28.i;
                Arrays.fill(yaf3.a, (byte) 0);
                ra42.h(yaf3.a, 4 - i8, i8, false);
                yaf3.H(0);
                c28.w = (int) yaf3.w();
            } else if (i7 == 25506) {
                c28.b(i7);
                a28 a284 = c28.u;
                byte[] bArr5 = new byte[i8];
                a284.k = bArr5;
                ra42.h(bArr5, 0, i8, false);
            } else if (i7 == 30322) {
                c28.b(i7);
                a28 a285 = c28.u;
                byte[] bArr6 = new byte[i8];
                a285.v = bArr6;
                ra42.h(bArr6, 0, i8, false);
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i7);
                throw ParserException.a((RuntimeException) null, sb2.toString());
            }
        } else if (c28.G == 2) {
            a28 a286 = (a28) sparseArray.get(c28.M);
            if (c28.P != 4 || !"V_VP9".equals(a286.b)) {
                ra42.z(i8);
                return;
            }
            yaf yaf4 = c28.n;
            yaf4.E(i8);
            ra42.h(yaf4.a, 0, i8, false);
        }
    }

    public String m() {
        return (String) this.b;
    }

    public void n(Object obj) {
        ww0 ww0 = (ww0) obj;
        ((pq9) this.b).getClass();
    }

    public void o(fo7 fo7, long j, long j2, boolean z) {
        ((x14) this.b).r((aqa) fo7, j, j2);
    }

    public wg8 p() {
        if (((ArrayList) this.b) == null) {
            return wg8.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new wg8((ArrayList) this.b, bundle);
    }

    public String q(lq1 lq1) {
        nl7 nl7 = (nl7) this.b;
        c54.p("The result can only set once!", nl7.Y == null);
        nl7.Y = lq1;
        return "ListFuture[" + this + "]";
    }

    public void r(tld tld, Throwable th) {
        ((yxc) this.b).getClass();
        Object b2 = tld.b();
        ta5.m("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(tld)), b2 != null ? b2.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    public boolean s(String str) {
        String B = B(str);
        return "1".equals(B) || Boolean.parseBoolean(B);
    }

    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public void setFlags(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public ByteBuffer t() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public Integer u(String str) {
        String B = B(str);
        if (TextUtils.isEmpty(B)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(B));
        } catch (NumberFormatException unused) {
            R(str);
            return null;
        }
    }

    public JSONArray v(String str) {
        String B = B(str);
        if (TextUtils.isEmpty(B)) {
            return null;
        }
        try {
            return new JSONArray(B);
        } catch (JSONException unused) {
            R(str);
            return null;
        }
    }

    public int w() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public String x(Resources resources, String str, String str2) {
        String[] strArr;
        String B = B(str2);
        if (!TextUtils.isEmpty(B)) {
            return B;
        }
        String B2 = B(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(B2)) {
            return null;
        }
        int identifier = resources.getIdentifier(B2, "string", str);
        if (identifier == 0) {
            R(str2.concat("_loc_key"));
            return null;
        }
        JSONArray v = v(str2.concat("_loc_args"));
        if (v == null) {
            strArr = null;
        } else {
            int length = v.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = v.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            R(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object, ypa] */
    public void y(fo7 fo7, long j, long j2) {
        long j3 = j;
        aqa aqa = (aqa) fo7;
        x14 x14 = (x14) this.b;
        x14.getClass();
        long j4 = aqa.a;
        z24 z24 = aqa.b;
        t1e t1e = aqa.o;
        xn7 xn7 = new xn7(j4, z24, t1e.c, t1e.o, j, j2, t1e.b);
        x14.n.getClass();
        x14.q.f(xn7, aqa.c, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        h14 h14 = (h14) aqa.Y;
        h14 h142 = x14.H;
        int size = h142 == null ? 0 : h142.m.size();
        long j5 = h14.b(0).b;
        int i = 0;
        while (i < size && x14.H.b(i).b < j5) {
            i++;
        }
        if (h14.d) {
            if (size - i <= h14.m.size()) {
                long j6 = x14.N;
                if (j6 == -9223372036854775807L || h14.h * 1000 > j6) {
                    x14.M = 0;
                }
            }
            int i2 = x14.M;
            x14.M = i2 + 1;
            if (i2 < x14.n.v(aqa.c)) {
                x14.D.postDelayed(x14.v, (long) Math.min((x14.M - 1) * 1000, 5000));
                return;
            } else {
                x14.C = new DashManifestStaleException();
                return;
            }
        }
        x14.H = h14;
        x14.I = h14.d & x14.I;
        x14.J = j3 - j2;
        x14.K = j3;
        synchronized (x14.t) {
            try {
                if (aqa.b.a == x14.F) {
                    Uri uri = x14.H.k;
                    if (uri == null) {
                        uri = aqa.o.c;
                    }
                    x14.F = uri;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (size == 0) {
            h14 h143 = x14.H;
            if (h143.d) {
                m94 m94 = h143.i;
                if (m94 != null) {
                    String str = m94.b;
                    if (maf.a(str, "urn:mpeg:dash:utc:direct:2014") || maf.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        try {
                            x14.L = maf.G(m94.c) - x14.K;
                            x14.s(true);
                        } catch (ParserException e) {
                            fm9.c("Failed to resolve time offset.", e);
                            x14.s(true);
                        }
                    } else if (maf.a(str, "urn:mpeg:dash:utc:http-iso:2014") || maf.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        aqa aqa2 = new aqa(x14.z, Uri.parse(m94.c), 5, new Object());
                        x14.q.k(new xn7(aqa2.a, aqa2.b, x14.A.w(aqa2, new gaa((Object) x14), 1)), aqa2.c, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    } else if (maf.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || maf.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                        aqa aqa3 = new aqa(x14.z, Uri.parse(m94.c), 5, new qx7(9));
                        x14.q.k(new xn7(aqa3.a, aqa3.b, x14.A.w(aqa3, new gaa((Object) x14), 1)), aqa3.c, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
                    } else if (maf.a(str, "urn:mpeg:dash:utc:ntp:2014") || maf.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                        x14.q();
                    } else {
                        fm9.c("Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                        x14.s(true);
                    }
                } else {
                    x14.q();
                }
            } else {
                x14.s(true);
            }
        } else {
            x14.O += i;
            x14.s(true);
        }
    }

    public b11 z(fo7 fo7, long j, long j2, IOException iOException, int i) {
        long j3;
        IOException iOException2 = iOException;
        aqa aqa = (aqa) fo7;
        x14 x14 = (x14) this.b;
        x14.getClass();
        long j4 = aqa.a;
        t1e t1e = aqa.o;
        xn7 xn7 = new xn7(j4, aqa.b, t1e.c, t1e.o, j, j2, t1e.b);
        x14.n.getClass();
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        b11 e = j3 == -9223372036854775807L ? jo7.Y : jo7.e(j3, false);
        x14.q.i(xn7, aqa.c, iOException2, !e.a());
        return e;
    }

    public /* synthetic */ sy4(int i, boolean z) {
        this.a = i;
    }

    public sy4(Resources resources) {
        InputStream openRawResource;
        Throwable th;
        this.a = 0;
        Class<sy4> cls = sy4.class;
        hm9.m(cls.getName(), "Create emoji tree from bin. Start", new Object[0]);
        try {
            openRawResource = resources.openRawResource(dga.a);
            byte[] bArr = new byte[4];
            openRawResource.read(bArr);
            int i = 0;
            char c2 = 8;
            this.b = new long[((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8))];
            byte[] bArr2 = new byte[(openRawResource.available() & -8)];
            int i2 = 0;
            while (true) {
                int read = openRawResource.read(bArr2);
                if (read != -1) {
                    int i3 = read / 8;
                    int i4 = i;
                    while (i4 < i3) {
                        int i5 = i4 * 8;
                        ((long[]) this.b)[i2 + i4] = ((((long) bArr2[i5 + 1]) & 255) << 48) | (((long) bArr2[i5]) << 56) | ((((long) bArr2[i5 + 2]) & 255) << 40) | ((((long) bArr2[i5 + 3]) & 255) << 32) | ((((long) bArr2[i5 + 4]) & 255) << 24) | ((((long) bArr2[i5 + 5]) & 255) << 16) | ((((long) bArr2[i5 + 6]) & 255) << 8) | (((long) bArr2[i5 + 7]) & 255);
                        i4++;
                        c2 = 8;
                    }
                    char c3 = c2;
                    i2 += i3;
                    i = 0;
                } else {
                    hm9.m(cls.getName(), "Create emoji tree from bin. Finish. Size:" + ((long[]) this.b).length, new Object[0]);
                    openRawResource.close();
                    return;
                }
            }
        } catch (IOException e) {
            hm9.p(cls.getName(), "Can't create emoji tree from bin", e);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public sy4(int i) {
        this.a = i;
        switch (i) {
            case 26:
                this.b = new LinkedHashMap();
                return;
            case 29:
                this.b = wz4.a;
                return;
            default:
                this.b = new yaf(10);
                return;
        }
    }

    public sy4(Bundle bundle) {
        this.a = 23;
        this.b = new Bundle(bundle);
    }

    public sy4(ClipData clipData, int i) {
        this.a = 10;
        this.b = m30.k(clipData, i);
    }

    public sy4(bt3 bt3) {
        this.a = 10;
        xs3.m();
        ContentInfo p = bt3.a.p();
        Objects.requireNonNull(p);
        this.b = xs3.j(m30.m(p));
    }
}
