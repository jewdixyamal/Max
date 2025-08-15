package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import androidx.work.WorkRequest;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pl8  reason: default package */
public final class pl8 implements e15, ab3, r78 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public Object o;

    public /* synthetic */ pl8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, w36] */
    /* JADX WARNING: type inference failed for: r11v0, types: [huc, java.lang.Object] */
    public static ba4 s(eb8 eb8) {
        jb4 jb4 = new jb4();
        byte[] bArr = null;
        jb4.b = null;
        Uri uri = eb8.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z = eb8.f;
        ? obj = new Object();
        fm9.f(!z || !TextUtils.isEmpty(uri2));
        obj.b = jb4;
        obj.c = uri2;
        obj.a = z;
        obj.o = new HashMap();
        m5f g = eb8.c.entrySet().iterator();
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) obj.o)) {
                ((HashMap) obj.o).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = ew0.a;
        ? obj2 = new Object();
        UUID uuid2 = eb8.a;
        uuid2.getClass();
        boolean z2 = eb8.d;
        boolean z3 = eb8.e;
        int[] c0 = s5c.c0(eb8.g);
        int length = c0.length;
        for (int i = 0; i < length; i++) {
            int i2 = c0[i];
            fm9.f(i2 == 2 || i2 == 1);
        }
        ba4 ba4 = new ba4(uuid2, obj, hashMap, z2, (int[]) c0.clone(), z3, obj2, 300000);
        byte[] bArr2 = eb8.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        fm9.k(ba4.m.isEmpty());
        ba4.v = 0;
        ba4.w = bArr;
        return ba4;
    }

    public f15 A(int i) {
        HashMap hashMap = (HashMap) this.o;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (f15) hashMap.get(Integer.valueOf(i));
        }
        e15 e15 = (e15) this.c;
        ga0 ga0 = null;
        if (e15.m(i)) {
            f15 n = e15.n(i);
            if (n != null) {
                ArrayList arrayList = new ArrayList();
                for (ha0 ha0 : n.d()) {
                    if (hu4.a(ha0, (eu4) this.b)) {
                        arrayList.add(ha0);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ga0 = ga0.e(n.a(), n.b(), n.c(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), ga0);
        }
        return ga0;
    }

    public boolean B() {
        String trim;
        if (((String) this.b) != null) {
            return true;
        }
        Queue queue = (Queue) this.o;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.b = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.c).readLine();
            this.b = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.b = trim;
        } while (trim.isEmpty());
        return true;
    }

    public void C(Object obj) {
        wb3 wb3 = (wb3) this.c;
        LinkedHashMap linkedHashMap = wb3.b;
        String str = (String) this.b;
        Object obj2 = linkedHashMap.get(str);
        f8 f8Var = (f8) this.o;
        if (obj2 != null) {
            int intValue = ((Number) obj2).intValue();
            ArrayList arrayList = wb3.d;
            arrayList.add(str);
            try {
                wb3.b(intValue, f8Var, obj);
            } catch (Exception e) {
                arrayList.remove(str);
                throw e;
            }
        } else {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + f8Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    public String D() {
        if (B()) {
            String str = (String) this.b;
            this.b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public ipd E(JSONObject jSONObject) {
        List list;
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("rooms");
            if (optJSONArray == null) {
                list = nz4.a;
            } else {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    hpd l = optJSONObject != null ? ((bwf) this.o).l(optJSONObject) : null;
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                list = arrayList;
            }
            ((yb9) this.b).getClass();
            return new ipd(yb9.e(jSONObject), list);
        } catch (JSONException e) {
            ((a4c) this.c).logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }

    public void F() {
        Integer num;
        wb3 wb3 = (wb3) this.c;
        ArrayList arrayList = wb3.d;
        String str = (String) this.b;
        if (!arrayList.contains(str) && (num = (Integer) wb3.b.remove(str)) != null) {
            wb3.a.remove(num);
        }
        wb3.e.remove(str);
        LinkedHashMap linkedHashMap = wb3.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = wb3.g;
        if (bundle.containsKey(str)) {
            Objects.toString((d8) ay7.v(bundle, str, d8.class));
            bundle.remove(str);
        }
        au1.r(wb3.c.get(str));
    }

    public void a(long j, int i, int i2, int i3) {
        ((MediaCodec) this.c).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void b() {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((hc3) this.c).g();
            ((ab3) this.o).b();
        }
    }

    public void c(zl4 zl4) {
        ((hc3) this.c).a(zl4);
    }

    public void d(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    public int e() {
        return ((MediaCodec) this.c).dequeueInputBuffer(0);
    }

    public void f(h1f h1f) {
        String str = (String) this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "Transformer.abortSafely, cancel transformer", (Throwable) null);
        }
        try {
            h1f.c();
        } catch (Throwable th) {
            hm9.l0((String) this.b, "Transformer.abortSafely, failed to cancel transformer", th);
        }
    }

    public void flush() {
        ((MediaCodec) this.c).flush();
    }

    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.c;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && maf.a < 21) {
                this.o = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public ByteBuffer getInputBuffer(int i) {
        return maf.a >= 21 ? ((MediaCodec) this.c).getInputBuffer(i) : ((ByteBuffer[]) this.b)[i];
    }

    public ByteBuffer getOutputBuffer(int i) {
        return maf.a >= 21 ? ((MediaCodec) this.c).getOutputBuffer(i) : ((ByteBuffer[]) this.o)[i];
    }

    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.c).getOutputFormat();
    }

    public void h(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    public String i(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            int size = list.size();
            List list2 = (List) this.c;
            if (i2 < size) {
                sb.append((String) list2.get(i2));
                if (((Integer) list.get(i2)).intValue() == 1) {
                    sb.append(str);
                } else {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    List list3 = (List) this.o;
                    if (intValue == 2) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Long.valueOf(j)}));
                    } else if (((Integer) list.get(i2)).intValue() == 3) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Integer.valueOf(i)}));
                    } else if (((Integer) list.get(i2)).intValue() == 4) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Long.valueOf(j2)}));
                    }
                }
                i2++;
            } else {
                sb.append((String) list2.get(list.size()));
                return sb.toString();
            }
        }
    }

    public void j(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    public void k(int i, rz3 rz3, long j) {
        ((MediaCodec) this.c).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) rz3.i, j, 0);
    }

    public void l(r88 r88, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new xx(this, r88, 2), handler);
    }

    public boolean m(int i) {
        switch (this.a) {
            case 2:
                return ((e15) this.c).m(i) && z(i) != null;
            default:
                return ((e15) this.c).m(i) && A(i) != null;
        }
    }

    public f15 n(int i) {
        switch (this.a) {
            case 2:
                return z(i);
            default:
                return A(i);
        }
    }

    public void o(h1f h1f) {
        try {
            h1f.g();
            pm7 pm7 = h1f.f;
            pm7.g();
            pm7.d.clear();
        } catch (Throwable th) {
            hm9.l0((String) this.b, "Transformer.cleanupSafely, failed to cleanup transformer", th);
        }
    }

    public void onError(Throwable th) {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((hc3) this.c).g();
            ((ab3) this.o).onError(th);
            return;
        }
        j47.Z(th);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ww6, pw6] */
    public dd3 p(ml8 ml8, mv4 mv4) {
        int i = 0;
        ? pw6 = new pw6(4);
        pw6.a(mv4);
        pw6.b(new mv4[0]);
        ffc j = pw6.j();
        fm9.e("The composition must contain at least one EditedMediaItemSequence.", !j.isEmpty());
        zw6 j2 = zw6.j(j);
        crd crd = crd.u0;
        vv4 vv4 = vv4.c;
        el8 el8 = (el8) this.c;
        if (!el8.j || !el8.k) {
            i = 2;
            ml8.e = 2;
        } else {
            ml8.e = 0;
        }
        return new dd3(j2, crd, vv4, false, false, false, i, false);
    }

    public lv4 q(tb8 tb8) {
        vv4 vv4 = vv4.c;
        el8 el8 = (el8) this.c;
        boolean z = el8.i;
        wmd.i(4, "initialCapacity");
        Object[] objArr = new Object[4];
        objArr[0] = b8b.e(el8.d, el8.e);
        return new lv4(tb8, z, false, false, -9223372036854775807L, -2147483647, new vv4(nz4.a, zw6.h(1, objArr)));
    }

    public na4 r(ml8 ml8) {
        ml8.d = 1;
        int i = ((el8) this.c).f;
        iff iff = new iff(i > 0 ? i : -1, 1, -1, -1, 1.0f, -1, -1, false);
        na4 na4 = new na4((Context) this.o);
        na4.c = iff;
        na4.o = false;
        return new na4(na4);
    }

    public void release() {
        this.b = null;
        this.o = null;
        ((MediaCodec) this.c).release();
    }

    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, z);
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.c).setParameters(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: bb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: db8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tb8 t(defpackage.ra8 r23) {
        /*
            r22 = this;
            r0 = r23
            za8 r1 = new za8
            r1.<init>()
            s74 r2 = new s74
            r2.<init>()
            java.util.List r8 = java.util.Collections.emptyList()
            ffc r10 = defpackage.ffc.X
            fb8 r14 = new fb8
            r14.<init>()
            lb8 r21 = defpackage.lb8.d
            r3 = r22
            java.lang.Object r3 = r3.c
            el8 r3 = (defpackage.el8) r3
            android.net.Uri r4 = r3.b
            if (r0 == 0) goto L_0x0059
            long r5 = r0.a
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            float r0 = r3.g
            r7 = 0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x003e
            float r7 = r3.h
            r9 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x003e
            goto L_0x0059
        L_0x003e:
            float r1 = (float) r5
            float r0 = r0 * r1
            float r3 = r3.h
            float r1 = r1 * r3
            za8 r3 = new za8
            r3.<init>()
            long r5 = (long) r0
            r3.f(r5)
            long r0 = (long) r1
            r3.d(r0)
            bb8 r0 = new bb8
            r0.<init>(r3)
            za8 r1 = r0.a()
        L_0x0059:
            java.lang.Object r0 = r2.e
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.d
            java.util.UUID r0 = (java.util.UUID) r0
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = 0
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            defpackage.fm9.k(r0)
            r0 = 0
            if (r4 == 0) goto L_0x008d
            ib8 r15 = new ib8
            java.lang.Object r3 = r2.d
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L_0x007c
            eb8 r0 = new eb8
            r0.<init>(r2)
        L_0x007c:
            r6 = r0
            r11 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r7 = 0
            r9 = 0
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r18 = r15
            goto L_0x008f
        L_0x008d:
            r18 = r0
        L_0x008f:
            tb8 r0 = new tb8
            db8 r2 = new db8
            r2.<init>(r1)
            hb8 r1 = new hb8
            r1.<init>(r14)
            gd8 r20 = defpackage.gd8.J
            java.lang.String r16 = ""
            r15 = r0
            r17 = r2
            r19 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl8.t(ra8):tb8");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [yb9, java.lang.Object] */
    public h1f u(na4 na4, ol8 ol8) {
        String str;
        String str2;
        Context applicationContext = ((Context) this.o).getApplicationContext();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        ? obj = new Object();
        qf4 build = new DefaultVideoFrameProcessor$Factory$Builder().build();
        applicationContext.getApplicationContext();
        rxd rxd = new rxd(13);
        Looper w = oaf.w();
        pm7 pm7 = new pm7(w, she.a, new hme(23));
        pm7.g();
        pm7.d.clear();
        pm7.a(ol8);
        if (!((el8) this.c).k) {
            str = ia9.l("video/avc");
            fm9.e("Not a video MIME type: " + str, ia9.k(str));
        } else {
            str = null;
        }
        if (str != null) {
            str2 = ia9.l(str);
            fm9.e("Not a video MIME type: " + str2, str2 == null || ia9.k(str2));
        } else {
            str2 = null;
        }
        f1f f1f = new f1f((String) null, -1, 0, str2);
        lh4 lh4 = (lh4) rxd.b;
        String str3 = f1f.b;
        if (str3 != null) {
            fm9.j("Unsupported sample MIME type ".concat(str3), lh4.w(ia9.g(str3)).contains(str3));
        }
        String str4 = f1f.c;
        if (str4 != null) {
            fm9.j("Unsupported sample MIME type ".concat(str4), lh4.w(ia9.g(str4)).contains(str4));
        }
        return new h1f(applicationContext, f1f, WorkRequest.MIN_BACKOFF_MILLIS, pm7, obj, build, na4, rxd, w);
    }

    public void v(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.c;
        qob qob = new qob(byteArrayOutputStream, map, (Map) this.b, (my9) this.o);
        my9 my9 = (my9) map.get(obj.getClass());
        if (my9 != null) {
            my9.a(obj, qob);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v22, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    public void w(ml8 ml8, dd3 dd3) {
        ml8 ml82 = ml8;
        String str = (String) this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "executeWithMainLooper", (Throwable) null);
        }
        String str2 = ((el8) this.c).c;
        Handler handler = new Handler(Looper.getMainLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ol8 ol8 = new ol8(ml82, this, countDownLatch, 1);
        h1f u = u(r(ml8), ol8);
        if (!handler.post(new vq1(this, u, dd3, str2, ol8, 6))) {
            ml82.a(new RuntimeException("Failed to start media transform on main loop", (Throwable) null));
            if (!handler.post(new nl8(this, u, 0))) {
                String str3 = (String) this.b;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.Z, str3, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                    return;
                }
                return;
            }
            return;
        }
        el8 el8 = (el8) this.c;
        el8.getClass();
        Handler handler2 = handler;
        h1f h1f = u;
        hl8 hl8 = new hl8(handler, u, 500, 300000, (wz7) el8.l);
        hl8.b();
        String str4 = (String) this.b;
        ir6 ir63 = hm9.m;
        if (ir63 != null && ir63.c()) {
            ir63.d(us7.X, str4, "executeWithMainLooper, waiting for completion ...", (Throwable) null);
        }
        try {
            countDownLatch.await();
            String str5 = (String) this.b;
            ir6 ir64 = hm9.m;
            if (ir64 != null) {
                if (ir64.c()) {
                    ir64.d(us7.X, str5, "executeWithMainLooper, completed", (Throwable) null);
                }
            }
            hl8.a();
            if (!handler2.post(new nl8(this, h1f, 1))) {
                String str6 = (String) this.b;
                ir6 ir65 = hm9.m;
                if (ir65 != null && ir65.c()) {
                    ir65.d(us7.Z, str6, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
        } catch (InterruptedException e) {
            ml82.a(new RuntimeException("Waiting for media transform completion interrupted", e));
            if (!handler2.post(new nl8(this, h1f, 2))) {
                String str7 = (String) this.b;
                ir6 ir66 = hm9.m;
                if (ir66 != null) {
                    if (ir66.c()) {
                        ir66.d(us7.Z, str7, "executeWithMainLooper, failed to abort media transformer on main loop", (Throwable) null);
                    }
                }
            }
            hl8.a();
            if (!handler2.post(new nl8(this, h1f, 1))) {
                String str8 = (String) this.b;
                ir6 ir67 = hm9.m;
                if (ir67 != null && ir67.c()) {
                    ir67.d(us7.Z, str8, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
        } catch (Throwable th) {
            hl8.a();
            if (!handler2.post(new nl8(this, h1f, 1))) {
                String str9 = (String) this.b;
                ir6 ir68 = hm9.m;
                if (ir68 != null && ir68.c()) {
                    ir68.d(us7.Z, str9, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
            throw th;
        }
    }

    public tr4 x(tb8 tb8) {
        ba4 ba4;
        tb8.b.getClass();
        eb8 eb8 = tb8.b.c;
        if (eb8 == null) {
            return tr4.a;
        }
        synchronized (this.c) {
            try {
                if (!eb8.equals((eb8) this.b)) {
                    this.b = eb8;
                    this.o = s(eb8);
                }
                ba4 = (ba4) this.o;
                ba4.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ba4;
    }

    public gq9 y() {
        yb9 yb9 = gq9.a;
        String string = ((SharedPreferences) ((je7) this.c).getValue()).getString("nightmode", "");
        yb9.getClass();
        List P0 = w9e.P0(string, new char[]{','});
        boolean isEmpty = P0.isEmpty();
        fq9 fq9 = fq9.b;
        if (isEmpty) {
            return fq9;
        }
        String str = (String) x53.g0(P0);
        switch (str.hashCode()) {
            case -1609594047:
                return !str.equals("enabled") ? fq9 : dq9.b;
            case -887328209:
                boolean equals = str.equals("system");
                return fq9;
            case -697920873:
                if (!str.equals("schedule")) {
                    return fq9;
                }
                int i = ft4.o;
                int parseInt = Integer.parseInt((String) P0.get(1));
                kt4 kt4 = kt4.MINUTES;
                return new eq9(z7.R(parseInt, kt4), z7.R(Integer.parseInt((String) P0.get(2)), kt4));
            case 3005871:
                return !str.equals("auto") ? fq9 : new bq9(Integer.parseInt((String) P0.get(1)));
            case 270940796:
                return !str.equals("disabled") ? fq9 : cq9.b;
            default:
                return fq9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.f15 z(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Object r2 = r0.o
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            java.lang.Object r0 = r2.get(r0)
            f15 r0 = (defpackage.f15) r0
            return r0
        L_0x001d:
            java.lang.Object r3 = r0.c
            e15 r3 = (defpackage.e15) r3
            boolean r4 = r3.m(r1)
            if (r4 == 0) goto L_0x013e
            f15 r3 = r3.n(r1)
            if (r3 != 0) goto L_0x0030
        L_0x002d:
            r5 = 0
            goto L_0x0136
        L_0x0030:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r6 = r3.d()
            r4.<init>(r6)
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0041:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0052
            java.lang.Object r7 = r6.next()
            ha0 r7 = (defpackage.ha0) r7
            int r8 = r7.j
            if (r8 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 != 0) goto L_0x0058
            r5 = 0
            goto L_0x00c6
        L_0x0058:
            int r6 = r7.j
            r15 = 1
            if (r15 == r6) goto L_0x0068
            r6 = 5
            java.lang.String r8 = "video/hevc"
            r9 = 2
        L_0x0061:
            r10 = r8
            r19 = r9
            r9 = r6
            r6 = r19
            goto L_0x006f
        L_0x0068:
            int r6 = r7.a
            java.lang.String r8 = r7.b
            int r9 = r7.g
            goto L_0x0061
        L_0x006f:
            r14 = 10
            int r8 = r7.c
            int r11 = r7.h
            if (r14 != r11) goto L_0x007b
            r16 = r6
            r11 = r8
            goto L_0x00ac
        L_0x007b:
            android.util.Rational r12 = new android.util.Rational
            r12.<init>(r14, r11)
            r16 = r6
            double r5 = (double) r8
            double r12 = r12.doubleValue()
            double r12 = r12 * r5
            int r5 = (int) r12
            java.lang.String r6 = "BackupHdrProfileEncoderProfilesProvider"
            r12 = 3
            boolean r6 = defpackage.mqd.u(r12, r6)
            if (r6 == 0) goto L_0x00ab
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r8, r11, r12}
            java.lang.String r8 = "Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d"
            java.lang.String.format(r8, r6)
        L_0x00ab:
            r11 = r5
        L_0x00ac:
            ha0 r5 = new ha0
            int r6 = r7.f
            int r13 = r7.i
            int r12 = r7.d
            int r7 = r7.e
            r8 = r5
            r17 = r13
            r13 = r7
            r7 = r14
            r14 = r6
            r6 = r15
            r15 = r16
            r16 = r7
            r18 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00c6:
            if (r5 != 0) goto L_0x00ca
        L_0x00c8:
            r5 = 0
            goto L_0x0119
        L_0x00ca:
            ic0 r6 = defpackage.eef.d(r5)
            java.lang.Object r0 = r0.b
            l66 r0 = (defpackage.l66) r0
            java.lang.Object r0 = r0.apply(r6)
            dff r0 = (defpackage.dff) r0
            if (r0 == 0) goto L_0x00c8
            int r7 = r5.e
            int r8 = r5.f
            boolean r7 = r0.Q0(r7, r8)
            if (r7 != 0) goto L_0x00e5
            goto L_0x00c8
        L_0x00e5:
            android.util.Range r0 = r0.b1()
            int r6 = r6.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Comparable r0 = r0.clamp(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            if (r10 != r6) goto L_0x00fc
            goto L_0x0119
        L_0x00fc:
            ha0 r0 = new ha0
            int r14 = r5.g
            int r15 = r5.h
            int r8 = r5.a
            java.lang.String r9 = r5.b
            int r11 = r5.d
            int r12 = r5.e
            int r13 = r5.f
            int r6 = r5.i
            int r5 = r5.j
            r7 = r0
            r16 = r6
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = r0
        L_0x0119:
            if (r5 == 0) goto L_0x011e
            r4.add(r5)
        L_0x011e:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0126
            goto L_0x002d
        L_0x0126:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            ga0 r5 = defpackage.ga0.e(r0, r5, r3, r4)
        L_0x0136:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2.put(r0, r5)
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl8.z(int):f15");
    }

    public pl8(khe khe) {
        this.a = 8;
        this.c = khe;
        kld b2 = lld.b(0, 1, 2, 1);
        this.b = b2;
        this.o = new v7c(b2);
    }

    public pl8(el8 el8) {
        this.a = 0;
        this.c = el8;
        this.b = pl8.class.getName();
        this.o = el8.a.getApplicationContext();
    }

    public pl8(e15 e15, eu4 eu4) {
        this.a = 5;
        this.o = new HashMap();
        this.c = e15;
        this.b = eu4;
    }

    public pl8() {
        this.a = 4;
        this.c = new Object();
    }

    public pl8(Runnable runnable) {
        this.a = 7;
        this.b = new CopyOnWriteArrayList();
        this.o = new HashMap();
        this.c = runnable;
    }

    public pl8(adb adb) {
        this.a = 2;
        mu1 mu1 = eff.o;
        this.o = new HashMap();
        this.c = adb;
        this.b = mu1;
    }

    public pl8(MediaCodec mediaCodec) {
        this.a = 11;
        this.c = mediaCodec;
        if (maf.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.o = mediaCodec.getOutputBuffers();
        }
    }

    public pl8(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 6;
        this.o = arrayDeque;
        this.c = bufferedReader;
    }
}
