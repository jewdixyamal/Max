package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaCodec;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.camera.core.CameraUnavailableException;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CapturerObserver;
import org.webrtc.Size;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.tamtam.nano.Protos;

/* renamed from: va8  reason: default package */
public class va8 implements p78, mde, a76, sya, xx4, ry9, erd, f2a, CapturerObserver {
    public static final int[] o = {16843067, 16843068};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ va8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void B(Throwable th) {
    }

    private final void D(EGLDisplay eGLDisplay) {
    }

    public void A(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = (ProgressBar) this.b;
        k8g x = k8g.x(progressBar.getContext(), attributeSet, o, i, 0);
        Drawable o2 = x.o(0);
        if (o2 != null) {
            if (o2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) o2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable F = F(animationDrawable.getFrame(i2), true);
                    F.setLevel(10000);
                    animationDrawable2.addFrame(F, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                o2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(o2);
        }
        Drawable o3 = x.o(1);
        if (o3 != null) {
            progressBar.setProgressDrawable(F(o3, false));
        }
        x.z();
    }

    public void C(EGLDisplay eGLDisplay) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.c;
                    if (i < arrayList.size()) {
                        mr0.s((EGLContext) arrayList.get(i), eGLDisplay);
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    public void E(ConversationEndReason conversationEndReason) {
        if (conversationEndReason != null) {
            ConversationEndReason conversationEndReason2 = (ConversationEndReason) this.c;
            a4c a4c = (a4c) this.b;
            if (conversationEndReason2 == null) {
                this.c = conversationEndReason;
                a4c.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
                return;
            }
            a4c.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
        }
    }

    public Drawable F(Drawable drawable, boolean z) {
        if (drawable instanceof y8g) {
            ((z8g) ((y8g) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = F(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 9:
                Void voidR = (Void) obj;
                ((fu1) this.c).x0.remove((sz1) this.b);
                int s = au1.s(((fu1) this.c).S0);
                if (!(s == 1 || s == 4)) {
                    if (s == 5 || (s == 6 && ((fu1) this.c).v0 != 0)) {
                        ((fu1) this.c).toString();
                    } else {
                        return;
                    }
                }
                if (((fu1) this.c).x0.isEmpty()) {
                    fu1 fu1 = (fu1) this.c;
                    if (fu1.u0 != null) {
                        fu1.toString();
                        ((fu1) this.c).u0.close();
                        ((fu1) this.c).u0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                lq1 lq1 = (lq1) this.b;
                try {
                    lq1.b(((l66) this.c).apply(obj));
                    return;
                } catch (Throwable th) {
                    lq1.d(th);
                    return;
                }
            default:
                ((b38) this.c).a(obj);
                return;
        }
    }

    public void b() {
        ((f2a) this.b).b();
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case 23:
                dm4.c((AtomicReference) this.b, zl4);
                return;
            default:
                dm4.c((AtomicReference) this.c, zl4);
                return;
        }
    }

    public void d(Throwable th) {
        switch (this.a) {
            case 9:
                return;
            default:
                ((lq1) this.b).d(th);
                return;
        }
    }

    public void e(Object obj) {
        ((f2a) this.b).e(obj);
    }

    public void f(Executor executor, py9 py9) {
        synchronized (((HashMap) this.c)) {
            zm7 zm7 = (zm7) ((HashMap) this.c).get(py9);
            if (zm7 != null) {
                zm7.a.set(false);
            }
            zm7 zm72 = new zm7(executor, py9);
            ((HashMap) this.c).put(py9, zm72);
            ju0.D().execute(new v05((Object) this, (Object) zm7, (Object) zm72, 10));
        }
    }

    public mn5 g(long j) {
        Object obj;
        Iterator it = ((Set) ((AtomicReference) ((x3c) this.b).Y).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gza) obj).a == j) {
                break;
            }
        }
        gza gza = (gza) obj;
        return gza == null ? lz4.a : od2.M(new t03(od2.M(new t03(((qn3) ((je7) this.c).getValue()).a(), 4), new dr3(gza, j, (Continuation) null)), 11), new er3(j, (Continuation) null));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [a8g, java.lang.Object] */
    public Object get() {
        o90 o90 = (o90) this.b;
        int i = o90.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = o90.b;
        if (i2 == -1) {
            i2 = 2;
        }
        fa0 fa0 = (fa0) this.c;
        int i3 = fa0.e;
        int i4 = o90.e;
        if (i4 != -1) {
            i3 = i4;
        }
        int F = wmd.F(o90.d, i3, i2, fa0.d);
        List list = n90.e;
        ? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        obj.c = -1;
        obj.o = -1;
        obj.a = Integer.valueOf(i);
        obj.o = Integer.valueOf(i2);
        obj.c = Integer.valueOf(i3);
        obj.b = Integer.valueOf(F);
        return obj.c();
    }

    public Object h() {
        return (q5f) this.b;
    }

    public bm7 j() {
        return f8.g(new z16(10, this));
    }

    public boolean k(CharSequence charSequence, int i, int i2, b4f b4f) {
        if ((b4f.c & 4) > 0) {
            return true;
        }
        if (((q5f) this.b) == null) {
            this.b = new q5f(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((kj6) this.c).getClass();
        ((q5f) this.b).setSpan(new c4f(b4f), i, i2, 33);
        return true;
    }

    public void l(py9 py9) {
        synchronized (((HashMap) this.c)) {
            try {
                zm7 zm7 = (zm7) ((HashMap) this.c).remove(py9);
                if (zm7 != null) {
                    zm7.a.set(false);
                    ju0.D().execute(new vs5(this, 11, zm7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public kl1 m(x30 x30) {
        kl1 kl1;
        Object obj;
        List list;
        HashMap hashMap = (HashMap) this.c;
        kl1 kl12 = (kl1) hashMap.get((yad) x30.b);
        if (kl12 != null || !x30.a) {
            if (kl12 == null || (obj = kl12.b) == null) {
                obj = "";
            }
            rpa rpa = (rpa) x30.c;
            if (rpa.l()) {
                obj = rpa.i();
            }
            String str = (String) obj;
            int i = 0;
            Object valueOf = Boolean.valueOf(kl12 != null ? kl12.c : false);
            rpa rpa2 = (rpa) x30.o;
            if (rpa2.l()) {
                valueOf = rpa2.i();
            }
            boolean booleanValue = ((Boolean) valueOf).booleanValue();
            List list2 = kl12 != null ? kl12.d : null;
            List list3 = (List) ((rpa) x30.X).n();
            Iterable iterable = (List) ((rpa) x30.Y).n();
            List list4 = (List) ((rpa) x30.Z).n();
            if (list3 != null) {
                list = list3;
            } else {
                Set H0 = list4 != null ? x53.H0(list4) : wz4.a;
                if (iterable == null) {
                    iterable = nz4.a;
                }
                list = list2 != null ? x53.t0(x53.s0(list2, H0), iterable) : x53.s0(iterable, H0);
            }
            if (kl12 != null) {
                i = kl12.e;
            }
            Object valueOf2 = Integer.valueOf(i);
            rpa rpa3 = (rpa) x30.s0;
            if (rpa3.l()) {
                valueOf2 = rpa3.i();
            }
            int intValue = ((Number) valueOf2).intValue();
            Object obj2 = kl12 != null ? kl12.f : null;
            rpa rpa4 = (rpa) x30.t0;
            if (rpa4.l()) {
                obj2 = rpa4.i();
            }
            bg1 bg1 = (bg1) obj2;
            Object obj3 = kl12 != null ? kl12.g : null;
            rpa rpa5 = (rpa) x30.u0;
            if (rpa5.l()) {
                obj3 = rpa5.i();
            }
            yad yad = (yad) x30.b;
            kl1 = new kl1(intValue, bg1, yad, (Long) obj3, str, list, booleanValue);
            hashMap.put(yad, kl1);
        } else {
            kl1 = null;
        }
        if (kl1 == null) {
            return null;
        }
        ((id1) this.b).f.onRoomUpdated(new ql1(kl1.a, mqd.I(kl1)));
        return kl1;
    }

    public int n() {
        s23 s23 = (s23) this.c;
        if (s23 == null) {
            return 1;
        }
        Context context = s23.a;
        FingerprintManager c2 = yk5.c(context);
        if (c2 == null || !yk5.e(c2)) {
            return 12;
        }
        FingerprintManager c3 = yk5.c(context);
        return (c3 == null || !yk5.d(c3)) ? 11 : 0;
    }

    public void o() {
        HashMap hashMap = (HashMap) this.c;
        List<yad> D0 = x53.D0(hashMap.keySet());
        hashMap.clear();
        for (yad pl1 : D0) {
            ((id1) this.b).f.onRoomRemoved(new pl1(pl1));
        }
    }

    public void onCapturerStarted(boolean z) {
        jra jra = (jra) this.c;
        jra.c.log("PatchedVideoCapturer", "onCapturerStarted");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(z);
        }
        jra.getClass();
    }

    public void onCapturerStopped() {
        jra jra = (jra) this.c;
        jra.c.log("PatchedVideoCapturer", "onCapturerStopped");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
        jra.getClass();
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 23:
                ((b38) this.c).onError(th);
                return;
            default:
                ((f2a) this.b).onError(th);
                return;
        }
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        qx1 qx1 = ((jra) this.c).b;
        qx1.b.a();
        qx1.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - qx1.d >= WorkRequest.MIN_BACKOFF_MILLIS) {
            qx1.a.log("CameraStatCollector", qx1.toString());
            qx1.d = SystemClock.elapsedRealtime();
        }
        if (((CapturerObserver) this.b) != null) {
            VideoSink videoSink = ((jra) this.c).Y;
            ((jra) this.c).getClass();
            if (eae.k0(Build.MANUFACTURER, "xiaomi", true) || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                if (videoSink != null) {
                    videoSink.onFrame(videoFrame);
                }
                ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
                return;
            }
            VideoFrame videoFrame2 = new VideoFrame(new ymc((VideoFrame.TextureBuffer) videoFrame.getBuffer(), videoFrame.getRotation(), ((jra) this.c).X.getHandler(), ((jra) this.c).o), 0, videoFrame.getTimestampNs());
            if (videoSink != null) {
                videoSink.onFrame(videoFrame2);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zx i(defpackage.n78 r10) {
        /*
            r9 = this;
            x78 r0 = r10.a
            java.lang.String r0 = r0.a
            r1 = 0
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0016 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x0019
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            r9 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0019:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0016 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r2 = r3
        L_0x001f:
            defpackage.j47.k(r2)     // Catch:{ Exception -> 0x0016 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0016 }
            zx r2 = new zx     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r3 = r9.b     // Catch:{ Exception -> 0x0055 }
            jde r3 = (defpackage.jde) r3     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0055 }
            r5 = r3
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r9 = r9.c     // Catch:{ Exception -> 0x0055 }
            jde r9 = (defpackage.jde) r9     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r9 = r9.get()     // Catch:{ Exception -> 0x0055 }
            r6 = r9
            android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0055 }
            r7 = 0
            r8 = 1
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0055 }
            defpackage.j47.A()     // Catch:{ Exception -> 0x0052 }
            android.media.MediaFormat r9 = r10.b     // Catch:{ Exception -> 0x0052 }
            android.view.Surface r1 = r10.d     // Catch:{ Exception -> 0x0052 }
            android.media.MediaCrypto r10 = r10.e     // Catch:{ Exception -> 0x0052 }
            defpackage.zx.b(r2, r9, r1, r10)     // Catch:{ Exception -> 0x0052 }
            return r2
        L_0x0052:
            r9 = move-exception
            r1 = r2
            goto L_0x0056
        L_0x0055:
            r9 = move-exception
        L_0x0056:
            if (r1 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x0061
            r0.release()
            goto L_0x0061
        L_0x005e:
            r1.release()
        L_0x0061:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va8.i(n78):zx");
    }

    public hd6 q(int i, int i2, int i3) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                mr0.f();
                GLES20.glBindFramebuffer(36160, iArr[0]);
                mr0.f();
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                mr0.f();
                return new hd6(i, iArr[0], i2, i3);
            default:
                return ((va8) this.b).q(i, i2, i3);
        }
    }

    public EGLContext r(EGLDisplay eGLDisplay, int i, int[] iArr) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                EGLContext m = mr0.m((EGLContext) this.b, eGLDisplay, i, iArr);
                ((ArrayList) this.c).add(m);
                return m;
            default:
                if (((EGLContext) this.c) == null) {
                    this.c = ((va8) this.b).r(eGLDisplay, i, iArr);
                }
                return (EGLContext) this.c;
        }
    }

    public EGLSurface s(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        int[] iArr;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                int[] iArr2 = mr0.k;
                if (i == 3 || i == 10) {
                    iArr = mr0.g;
                } else if (i == 7 || i == 6) {
                    iArr = mr0.h;
                    if (!z) {
                        if (i == 6) {
                            if (oaf.a < 33 || !mr0.L("EGL_EXT_gl_colorspace_bt2020_pq")) {
                                throw new Exception("BT.2020 PQ OpenGL output isn't supported.");
                            }
                            iArr2 = mr0.i;
                        } else if (mr0.L("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                            iArr2 = mr0.j;
                        } else {
                            throw new Exception("BT.2020 HLG OpenGL output isn't supported.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException(zr6.h(i, "Unsupported color transfer: "));
                }
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, mr0.B(eGLDisplay, iArr), obj, iArr2, 0);
                mr0.e("Error creating a new EGL surface");
                return eglCreateWindowSurface;
            default:
                return ((va8) this.b).s(eGLDisplay, obj, i, z);
        }
    }

    public ta8 t(Uri uri) {
        la5 la5;
        boolean z;
        sa8 sa8 = new sa8((Context) this.b, uri);
        va4 va4 = new va4();
        synchronized (va4) {
            va4.b = 1;
        }
        synchronized (va4) {
            va4.c = 6;
        }
        Uri uri2 = sa8.a.getUri();
        if (uri2 != null) {
            la5[] b2 = va4.b(uri2, oz4.a);
            if (b2.length == 1) {
                return new ta8(b2[0], sa8);
            }
            int length = b2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    la5 = null;
                    break;
                }
                la5 = b2[i];
                try {
                    sa4 sa4 = sa8.b;
                    if (sa4 != null) {
                        z = la5.n(sa4);
                        sa4 sa42 = sa8.b;
                        if (sa42 != null) {
                            sa42.Y = 0;
                        }
                        if (z) {
                            break;
                        }
                        i++;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Throwable unused) {
                    sa4 sa43 = sa8.b;
                    if (sa43 != null) {
                        sa43.Y = 0;
                    }
                    z = false;
                }
            }
            for (la5 la52 : b2) {
                if (!tpa.f(la52, la5)) {
                    la52.release();
                }
            }
            if (la5 != null) {
                return new ta8(la5, sa8);
            }
            sa8.close();
            return null;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public EGLSurface u(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return mr0.o(eGLContext, eGLDisplay);
            default:
                ((va8) this.b).getClass();
                return mr0.o(eGLContext, eGLDisplay);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.CctBackendFactory v(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.Object r2 = r12.c
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            if (r2 != 0) goto L_0x0082
            java.lang.Object r2 = r12.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r4 != 0) goto L_0x0017
        L_0x0015:
            r2 = r3
            goto L_0x0029
        L_0x0017:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0015 }
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r6 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r5.<init>(r2, r6)     // Catch:{ NameNotFoundException -> 0x0015 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r2 != 0) goto L_0x0027
            goto L_0x0015
        L_0x0027:
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
        L_0x0029:
            if (r2 != 0) goto L_0x0030
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0080
        L_0x0030:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.get(r6)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x003d
            java.lang.String r8 = "backend:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x003d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ","
            r9 = -1
            java.lang.String[] r7 = r7.split(r8, r9)
            int r8 = r7.length
            r9 = 0
        L_0x0064:
            if (r9 >= r8) goto L_0x003d
            r10 = r7[r9]
            java.lang.String r10 = r10.trim()
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0073
            goto L_0x007c
        L_0x0073:
            r11 = 8
            java.lang.String r11 = r6.substring(r11)
            r4.put(r10, r11)
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x007f:
            r2 = r4
        L_0x0080:
            r12.c = r2
        L_0x0082:
            java.lang.Object r12 = r12.c
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x008f
            return r3
        L_0x008f:
            java.lang.Class r13 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r2 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r13 = r13.asSubclass(r2)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.reflect.Constructor r13 = r13.getDeclaredConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.Object r13 = r13.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            com.google.android.datatransport.cct.CctBackendFactory r13 = (com.google.android.datatransport.cct.CctBackendFactory) r13     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            return r13
        L_0x00a4:
            r1.concat(r12)
            goto L_0x00d3
        L_0x00a8:
            r1.concat(r12)
            goto L_0x00d3
        L_0x00ac:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto L_0x00d3
        L_0x00b8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto L_0x00d3
        L_0x00c4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Class "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = " is not found."
            r13.append(r12)
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va8.v(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public LinkedHashSet w() {
        LinkedHashSet linkedHashSet;
        synchronized (this.b) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.c).values());
        }
        return linkedHashSet;
    }

    public tad x(yad yad) {
        kl1 kl1 = (kl1) ((HashMap) this.c).get(yad);
        if (kl1 != null) {
            return mqd.I(kl1);
        }
        return null;
    }

    public void y(JSONObject jSONObject) {
        jz6 jz6;
        w4d w4d = (w4d) this.c;
        w4d.getClass();
        try {
            jz6 = new jz6(f46.E(jSONObject), jSONObject.getString("message"), jSONObject.getBoolean("direct"));
        } catch (JSONException e) {
            ((a4c) w4d.b).logException("ChatParser", "Can't parse chat message", e);
            jz6 = null;
        }
        if (jz6 != null) {
            ((md2) this.b).onNewMessage(jz6);
        }
    }

    public void z(yg2 yg2) {
        synchronized (this.b) {
            try {
                yg2.getClass();
                for (String str : new LinkedHashSet((ArrayList) yg2.g)) {
                    ((LinkedHashMap) this.c).put(str, yg2.e(str));
                }
            } catch (CameraUnavailableException e) {
                throw new Exception(e);
            }
        }
    }

    public /* synthetic */ va8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ va8(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public va8(id1 id1) {
        this.a = 8;
        this.b = id1;
        this.c = new HashMap();
    }

    public va8(il ilVar, Object obj) {
        this.a = 3;
        this.b = obj;
        this.c = ilVar.a;
    }

    public va8(qz7 qz7) {
        this.a = 21;
        this.b = (HashMap) qz7.b;
        this.c = (ArrayList) qz7.c;
    }

    public va8(Context context, int i) {
        this.a = i;
        switch (i) {
            case 25:
                this.c = null;
                this.b = context;
                return;
            default:
                this.b = context.getApplicationContext();
                this.c = va8.class.getName();
                return;
        }
    }

    public va8(int i, byte b2) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.PRESENT:
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                this.b = EGL14.EGL_NO_CONTEXT;
                this.c = new ArrayList();
                return;
            case 22:
                this.b = new xm7();
                this.c = new HashMap();
                return;
            case 26:
                this.b = new va8(15, (byte) 0);
                return;
            default:
                this.b = new Object();
                this.c = new LinkedHashMap();
                new HashSet();
                return;
        }
    }

    public va8(int i) {
        this.a = 4;
        yx yxVar = new yx(i, 0);
        yx yxVar2 = new yx(i, 2);
        this.b = yxVar;
        this.c = yxVar2;
    }

    public va8(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 14;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public va8(x8f x8f) {
        this.a = 17;
        nz4 nz4 = nz4.a;
        this.b = x8f;
        this.c = nz4;
    }

    public va8(lq1 lq1) {
        this.a = 19;
        g76 g76 = kq0.g;
        this.b = lq1;
        this.c = g76;
    }

    public va8(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 20;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public va8(int i, int i2) {
        this.a = 20;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public va8(int i, int i2, int i3) {
        this.a = 20;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public va8(bn0 bn0) {
        this.a = 6;
        int i = Build.VERSION.SDK_INT;
        Context context = bn0.a;
        this.b = zm0.b(context);
        this.c = i <= 29 ? new s23(context) : null;
    }

    public va8(w98 w98, Looper looper) {
        this.a = 24;
        this.c = w98;
        this.b = new Handler(looper, new hl4(4, this));
    }
}
