package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkRequest;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: qqd  reason: default package */
public final class qqd implements nr8, ah9, pic, l71, a76, q78, qj3, e8, hwa, z66, do7, w2e, ebe {
    public final /* synthetic */ int a;
    public Object b;

    public qqd(int i, byte b2) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new HashMap();
                return;
            case LangUtils.HASH_SEED:
                this.b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 26:
                this.b = new Object();
                return;
            case 29:
                this.b = dp3.c;
                return;
            default:
                return;
        }
    }

    public void A(Object obj, String str) {
        HashMap hashMap = (HashMap) this.b;
        if (obj == null) {
            hashMap.put(str, (Object) null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            hashMap.put(str, obj);
            return;
        }
        int i = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            d24 d24 = d24.b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i < zArr.length) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            hashMap.put(str, boolArr);
        } else if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            d24 d242 = d24.b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            hashMap.put(str, bArr2);
        } else if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            d24 d243 = d24.b;
            Integer[] numArr = new Integer[iArr.length];
            while (i < iArr.length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            hashMap.put(str, numArr);
        } else if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            d24 d244 = d24.b;
            Long[] lArr = new Long[jArr.length];
            while (i < jArr.length) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            hashMap.put(str, lArr);
        } else if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            d24 d245 = d24.b;
            Float[] fArr2 = new Float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            hashMap.put(str, fArr2);
        } else if (cls == double[].class) {
            double[] dArr = (double[]) obj;
            d24 d246 = d24.b;
            Double[] dArr2 = new Double[dArr.length];
            while (i < dArr.length) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            hashMap.put(str, dArr2);
        } else {
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }
    }

    public void B(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A(entry.getValue(), (String) entry.getKey());
        }
    }

    public b11 C(go7 go7, long j, long j2, IOException iOException, int i) {
        bkg bkg = (bkg) this.b;
        if (bkg != null) {
            ((y14) bkg.b).x(iOException);
        }
        return vq7.Y;
    }

    public void D(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void E(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public void F(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public Iterator G() {
        return ((Iterable) this.b).iterator();
    }

    public void a(Object obj) {
        qy5 qy5;
        switch (this.a) {
            case 7:
                ys5 ys5 = (ys5) obj;
                if (ys5 != null) {
                    ((lw1) this.b).w.i(Integer.valueOf(ys5.a ? 2 : 3));
                    return;
                }
                return;
            default:
                Bitmap bitmap = (Bitmap) obj;
                ((xt6) this.b).h = 50;
                ny5 ny5 = new ny5();
                ny5.t = bitmap.getHeight();
                ny5.s = bitmap.getWidth();
                ny5.m = ia9.l("image/raw");
                ny5.z = i63.i;
                qy5 qy52 = new qy5(ny5);
                if (!((xt6) this.b).a || oaf.a < 34 || !bitmap.hasGainmap()) {
                    qy5 = qy52;
                } else {
                    ny5 a2 = qy52.a();
                    a2.m = ia9.l("image/jpeg_r");
                    qy5 = new qy5(a2);
                }
                try {
                    ((xt6) this.b).d.g(2, qy52);
                    ((xt6) this.b).e.submit(new v05((Object) this, (Object) bitmap, (Object) qy5, 8));
                    return;
                } catch (RuntimeException e) {
                    ((xt6) this.b).d.d(ExportException.a(e, 1000));
                    return;
                }
        }
    }

    public void accept(Object obj) {
        List<lp4> list = (List) obj;
        mp4 mp4 = (mp4) this.b;
        mp4.getClass();
        hm9.m(mp4.g, zr6.h(list.size(), "startUploads: count = "), new Object[0]);
        for (lp4 lp4 : list) {
            bc7 bc7 = mp4.f[1];
            dg5 dg5 = (dg5) mp4.c.get();
            dg5.getClass();
            StringBuilder sb = new StringBuilder("UploadDraftMediaWorker/");
            ep4 ep4 = lp4.a;
            sb.append(ep4.a);
            sb.append(":");
            String str = ep4.b;
            sb.append(str);
            String sb2 = sb.toString();
            qla qla = (qla) ((qla) ((qla) new qla(UploadDraftMediaWorker.class).setConstraints(new kj3(2, false, false, false, false, -1, -1, x53.H0(new LinkedHashSet())))).setExpedited(jna.a)).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
            HashMap hashMap = new HashMap();
            hashMap.put("workName", sb2);
            hashMap.put(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(ep4.a));
            hashMap.put("attachLocalId", str);
            hashMap.put("draft.path", lp4.b);
            hashMap.put("draft.lastModified", Long.valueOf(lp4.c));
            hashMap.put("draft.uploadType", h4f.r(lp4.d));
            ref ref = lp4.e;
            if (ref != null) {
                hashMap.put("draft.videoConvertOptions", true);
                hashMap.put("draft.videoConvertOptions.quality", ref.a.name());
                hashMap.put("draft.videoConvertOptions.startTrimPosition", Float.valueOf(ref.b));
                hashMap.put("draft.videoConvertOptions.endTrimPosition", Float.valueOf(ref.c));
                hashMap.put("draft.videoConvertOptions.mute", Boolean.valueOf(ref.d));
            }
            d24 d24 = new d24((Map) hashMap);
            d24.f(d24);
            h65 h65 = h65.b;
            dg5.a.b(sb2, h65, (rla) ((qla) qla.setInputData(d24)).build(), false).l();
        }
    }

    public void b() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                bc7[] bc7Arr = GifViewerWidget.u0;
                GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
                gifViewerWidget.r0().B(gifViewerWidget.n0(), gifViewerWidget.m0());
                return;
            default:
                bc7[] bc7Arr2 = PhotoViewerWidget.X;
                PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
                photoViewerWidget.p0().B(photoViewerWidget.n0(), photoViewerWidget.m0());
                return;
        }
    }

    public void c(wq8 wq8, boolean z) {
        if (wq8 instanceof qae) {
            ((qae) wq8).K0.k().c(false);
        }
        nr8 nr8 = ((e7) this.b).X;
        if (nr8 != null) {
            nr8.c(wq8, z);
        }
    }

    public void d(Throwable th) {
        switch (this.a) {
            case 7:
                if (!(th instanceof CameraControl$OperationCanceledException)) {
                    ((lw1) this.b).w.i(4);
                    return;
                }
                return;
            default:
                ((xt6) this.b).d.d(ExportException.a(th, 2000));
                return;
        }
    }

    public void e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((qn0) this.b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [uu3] */
    /* JADX WARNING: type inference failed for: r3v6, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            int r2 = r3.a
            switch(r2) {
                case 14: goto L_0x001e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r3.b
            one.me.chatmedia.viewer.photo.PhotoViewerWidget r3 = (one.me.chatmedia.viewer.photo.PhotoViewerWidget) r3
            uu3 r3 = r3.getTargetController()
            boolean r2 = r3 instanceof defpackage.jwa
            if (r2 == 0) goto L_0x0016
            r1 = r3
            jwa r1 = (defpackage.jwa) r1
        L_0x0016:
            if (r1 == 0) goto L_0x001d
            one.me.chatmedia.viewer.ChatMediaViewerScreen r1 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r1
            r1.G0(r0)
        L_0x001d:
            return
        L_0x001e:
            bc7[] r2 = one.me.chatmedia.viewer.photo.GifViewerWidget.u0
            java.lang.Object r3 = r3.b
            one.me.chatmedia.viewer.photo.GifViewerWidget r3 = (one.me.chatmedia.viewer.photo.GifViewerWidget) r3
            uu3 r3 = r3.getTargetController()
            boolean r2 = r3 instanceof defpackage.jwa
            if (r2 == 0) goto L_0x002f
            r1 = r3
            jwa r1 = (defpackage.jwa) r1
        L_0x002f:
            if (r1 == 0) goto L_0x0036
            one.me.chatmedia.viewer.ChatMediaViewerScreen r1 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r1
            r1.G0(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqd.f():void");
    }

    public void g(z2e z2e) {
    }

    public void h() {
        ((i50) this.b).h();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [yb9, java.lang.Object] */
    public s78 i(o78 o78) {
        Context context;
        int i = oaf.a;
        if (i < 23 || (i < 31 && ((context = (Context) this.b) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new Object().i(o78);
        }
        int g = ia9.g(o78.c.n);
        z04.J("Creating an asynchronous MediaCodec adapter for track type " + oaf.H(g));
        td tdVar = new td(g);
        tdVar.b = true;
        return tdVar.i(o78);
    }

    public void j() {
    }

    public void k(z2e z2e) {
        bc7[] bc7Arr = StickerSetBottomSheet.A0;
        ((i3e) ((StickerSetBottomSheet) this.b).s0.getValue()).s(z2e.a);
    }

    public void l() {
        ((i50) this.b).h();
    }

    public void m(go7 go7, long j, long j2, boolean z) {
    }

    public void n() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                bc7[] bc7Arr = GifViewerWidget.u0;
                GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
                gifViewerWidget.r0().z(gifViewerWidget.n0(), gifViewerWidget.m0());
                return;
            default:
                bc7[] bc7Arr2 = PhotoViewerWidget.X;
                PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
                photoViewerWidget.p0().z(photoViewerWidget.n0(), photoViewerWidget.m0());
                return;
        }
    }

    public boolean o(wq8 wq8) {
        e7 e7Var = (e7) this.b;
        if (wq8 == e7Var.c) {
            return false;
        }
        ((qae) wq8).L0.getClass();
        e7Var.getClass();
        nr8 nr8 = e7Var.X;
        if (nr8 != null) {
            return nr8.o(wq8);
        }
        return false;
    }

    public d24 p() {
        d24 d24 = new d24((Map) (HashMap) this.b);
        d24.f(d24);
        return d24;
    }

    public void q() {
    }

    public void r() {
        ((i50) this.b).h();
    }

    public void s() {
        i50 i50 = (i50) this.b;
        Long l = (Long) i50.Z;
        ch9 ch9 = (ch9) i50.c;
        long l2 = ((uh9) ch9).l();
        if (l == null || l.longValue() != l2) {
            if (((Long) i50.Z) == null) {
                i50.Z = Long.valueOf(((uh9) ch9).l());
            }
            if (!i50.b) {
                ((kld) i50.o).g(new g50(new eqe(oea.a)));
                i50.h();
            }
        }
    }

    public void t() {
        i50 i50 = (i50) this.b;
        i50.h();
        ((kld) i50.o).g(f50.a);
    }

    public void u(ru6 ru6, long j) {
        Bitmap underlyingBitmap;
        CloseableStaticBitmap closeableStaticBitmap = ru6 instanceof CloseableStaticBitmap ? (CloseableStaticBitmap) ru6 : null;
        if (closeableStaticBitmap != null && (underlyingBitmap = closeableStaticBitmap.getUnderlyingBitmap()) != null) {
            oo0 oo0 = new oo0(underlyingBitmap, 0);
            ((yd) ((uuc) this.b)).c(oo0, j + ".jpg");
        }
    }

    public void v(go7 go7, long j, long j2) {
        boolean z;
        bkg bkg = (bkg) this.b;
        if (bkg != null) {
            synchronized (tu0.i) {
                z = tu0.j;
            }
            if (!z) {
                ((y14) bkg.b).x(new IOException(new ConcurrentModificationException()));
                return;
            }
            bkg.p();
        }
    }

    public Pattern w(String str) {
        Object obj;
        sh0 sh0 = (sh0) this.b;
        synchronized (sh0) {
            obj = ((rec) sh0.c).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            sh0 sh02 = (sh0) this.b;
            synchronized (sh02) {
                ((rec) sh02.c).put(str, pattern);
            }
        }
        return pattern;
    }

    public void x(Object obj) {
        a c;
        d8 d8Var = (d8) obj;
        c cVar = (c) this.b;
        i16 i16 = (i16) cVar.F.pollLast();
        if (i16 != null && (c = cVar.c.c(i16.a)) != null) {
            c.s0(i16.b, d8Var.a, d8Var.b);
        }
    }

    public Object y(Object obj) {
        return ((Thread) obj).getState();
    }

    public void z(Exception exc) {
        z04.v("Audio sink error", exc);
        qz7 qz7 = ((v78) this.b).R1;
        Handler handler = (Handler) qz7.b;
        if (handler != null) {
            handler.post(new w60(qz7, exc, 1));
        }
    }

    public /* synthetic */ qqd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public qqd(int i) {
        this.a = 21;
        sh0 sh0 = new sh0(0, 16);
        sh0.b = i;
        sh0.c = new rec(sh0, ((i * 4) / 3) + 1);
        this.b = sh0;
    }

    public qqd(bj6 bj6) {
        this.a = 16;
        this.b = (IncorrectJpegMetadataQuirk) bj6.e(IncorrectJpegMetadataQuirk.class);
    }
}
