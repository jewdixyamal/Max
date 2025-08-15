package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.fragment.app.a;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.my.tracker.campaign.CampaignService;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import org.webrtc.DumpCallback;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f5  reason: default package */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ f5(o05 o05, int i, String str, Throwable th) {
        this.a = 28;
        this.b = o05;
        this.c = str;
        this.o = th;
    }

    /* JADX WARNING: type inference failed for: r1v81, types: [androidx.camera.video.internal.encoder.EncodeException, java.lang.Exception] */
    public final void run() {
        nv4 nv4;
        Iterator it;
        char c2;
        char c3;
        Rect rect;
        char c4;
        AbstractMap.SimpleEntry simpleEntry;
        Iterator it2;
        Iterator it3;
        Rect rect2;
        char c5 = 6;
        char c6 = 5;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                g5Var.getClass();
                HashSet hashSet = ActAttachesView.z1;
                g5Var.c.k0((a) this.c, (es8) this.o);
                return;
            case 1:
                qz7 qz7 = (qz7) this.b;
                qz7.getClass();
                int i = oaf.a;
                u75 u75 = ((o75) qz7.c).a;
                u75.getClass();
                i74 i74 = u75.D0;
                fd F = i74.F();
                i74.I(F, 1009, new x64(F, (qy5) this.c, (s54) this.o, 1));
                return;
            case 2:
                ph4 ph4 = (ph4) this.b;
                ph4.getClass();
                int i2 = maf.a;
                n75 n75 = (n75) ph4.b;
                n75.getClass();
                t75 t75 = n75.a;
                t75.getClass();
                h74 h74 = t75.C0;
                ed P = h74.P();
                h74.Q(P, 1009, new yv3(P, (oy5) this.c, (r54) this.o));
                return;
            case 3:
                e70 e70 = (e70) this.b;
                int s = au1.s(e70.g);
                if (s == 0) {
                    e70.j = (Executor) this.c;
                    e70.k = (l7b) this.o;
                    return;
                } else if (s == 1 || s == 2) {
                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                } else {
                    return;
                }
            case 4:
                ((qt0) this.b).g.a((ey1) this.c, (q6d) ((Executor) this.o));
                return;
            case 5:
                ww0 ww0 = (ww0) this.c;
                g05 g05 = (g05) this.o;
                du0 du0 = (du0) this.b;
                rxd rxd = du0.g;
                try {
                    du0.f(ww0, g05);
                    rxd.d0(ww0, g05);
                    g05.d(g05);
                    return;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    rxd.d0(ww0, g05);
                    g05.d(g05);
                    throw th2;
                }
            case 6:
                py0 py0 = (py0) this.b;
                qld qld = (qld) this.c;
                String str = (String) this.o;
                py0.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = qld.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, Integer.MAX_VALUE, (DumpCallback) null);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    py0.V0.logException("OKRTCCall", "Error starting local audio dump", th3);
                    return;
                }
            case 7:
                w51 w51 = (w51) this.c;
                Object obj = this.o;
                py0 py02 = (py0) this.b;
                Iterator it4 = py02.M0.iterator();
                while (it4.hasNext()) {
                    try {
                        ((my0) it4.next()).onEvent(py02, w51, obj);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        py02.V0.logException("OKRTCCall", "Error on dispatch event " + w51, th5);
                    }
                }
                return;
            case 8:
                bg1 bg1 = (bg1) this.c;
                JSONObject jSONObject = (JSONObject) this.o;
                ly0 ly0 = ((py0) this.b).w1;
                if (ly0 != null) {
                    ly0.onCustomData(bg1, jSONObject);
                    return;
                }
                return;
            case 9:
                me1 me1 = (me1) this.b;
                a4c a4c = me1.a;
                String str2 = me1.j;
                a4c.log(str2, "Initialize OpenGL context on openGL thread");
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    a4c.log(str2, "No default display found, will not initialize");
                    return;
                }
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    if (!EGL14.eglChooseConfig(eglGetDisplay, (int[]) this.c, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
                    } else if (iArr2[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        if (eGLConfig != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, (EGLContext) this.o, new int[]{12440, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                me1.d = eglCreateContext;
                                me1.e = eglGetDisplay;
                                me1.f = eGLConfig;
                                return;
                            }
                            throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                        }
                        throw new RuntimeException("Returned matching OpenGL context is null");
                    } else {
                        throw new RuntimeException("No valid OpenGL context present, can not continue");
                    }
                } else {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
                }
            case 10:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility((charSequence == null || w9e.C0(charSequence)) ^ true ? 0 : 8);
                ((dm1) this.o).x();
                return;
            case 11:
                CallsAudioManagerV3Impl.reportAudioDeviceOnMainThread$lambda$9((CallsAudioManagerV3Impl) this.b, (CallsAudioDeviceInfo) this.c, (CallsAudioManager.OnAudioDeviceInfoChangeListener) this.o);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                pt1 pt1 = ((st1) this.b).z;
                iv1 iv1 = (iv1) this.o;
                ((HashSet) pt1.b).add(iv1);
                ((ArrayMap) pt1.c).put(iv1, (Executor) this.c);
                return;
            case 13:
                xu1 xu1 = (xu1) this.b;
                xu1.getClass();
                xu1.d.a(TimeUnit.SECONDS.toMillis(3) + System.currentTimeMillis(), (wu1) ((AtomicReference) this.c).get());
                ((lq1) this.o).b((Object) null);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((CampaignService) this.b).a((String) this.c, (cu1) ((Runnable) this.o));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                p82 p82 = (p82) this.b;
                p82.getClass();
                mg4 mg4 = (mg4) this.c;
                String name = mg4.name();
                Collection<Long> collection = (Collection) this.o;
                hm9.m("p82", "syncMessages, itemType = %s, chatIds size = %d", name, Integer.valueOf(collection.size()));
                for (Long l : collection) {
                    hm9.m("p82", "syncMessages, itemType = %s, chatId = %d", mg4.name(), l);
                    ((eoe) p82.t.get()).g(new q9d(((p7b) p82.n).a.o(), l.longValue(), 0, mg4), 0, 0);
                }
                r9d.y((s8g) p82.w.get());
                return;
            case 16:
                bd3 bd3 = (bd3) this.b;
                bd3.getClass();
                qy5 qy5 = bd3.f;
                fm9.l(qy5);
                ((hlf) this.c).E(new VideoSink$VideoSinkException((VideoFrameProcessingException) this.o, qy5));
                return;
            case LangUtils.HASH_SEED /*17*/:
                List singletonList = Collections.singletonList((qy3) this.c);
                ((o84) ((ty2) this.b).Y).getClass();
                o84.o(singletonList);
                ((CountDownLatch) this.o).countDown();
                return;
            case 18:
                ((ViewGroup) this.b).endViewTransition((View) this.c);
                rd4 rd4 = (rd4) this.o;
                ((ovd) rd4.c.b).c(rd4);
                return;
            case 19:
                if (((ce4) this.b).u0) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 20:
                ll4 ll4 = (ll4) this.b;
                ll4.getClass();
                ((Runnable) this.c).run();
                he.d(new kl4((Object) ll4, 0, (Object) (il4) this.o));
                return;
            case 21:
                ml4 ml4 = (ml4) this.b;
                ml4.getClass();
                ((Runnable) this.c).run();
                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).execute(new kl4((Object) ml4, 1, (Object) (il4) this.o));
                return;
            case 22:
                kr4 kr4 = (kr4) this.b;
                ((mr4) this.c).g(kr4.a, kr4.b, (Exception) this.o);
                return;
            case 23:
                lr4 lr4 = (lr4) this.b;
                ((nr4) this.c).s(lr4.a, lr4.b, (Exception) this.o);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                if (((vs4) this.b).Y) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 25:
                qv4 qv4 = (qv4) this.b;
                qv4.getClass();
                Rect rect3 = new Rect();
                ov4 ov4 = (ov4) this.c;
                te0 te0 = (te0) this.o;
                uv4 uv4 = qv4.a;
                if (ov4 != null && ov4.o) {
                    int width = uv4.getWidth();
                    int height = uv4.getHeight();
                    te0.c = width;
                    te0.d = height;
                } else if (te0.c == -1 && te0.d == -1) {
                    if (ov4 != null) {
                        Rect rect4 = ov4.c;
                        int width2 = rect4.width();
                        int height2 = rect4.height();
                        te0.c = width2;
                        te0.d = height2;
                    } else {
                        int width3 = uv4.getWidth();
                        int measuredHeight = uv4.getMeasuredHeight();
                        te0.c = width3;
                        te0.d = measuredHeight;
                    }
                }
                te0.a(te0, uv4.getMeasuredWidth(), uv4.getMeasuredHeight(), rect3);
                uv4.setBounds(rect3);
                if (ov4 != null) {
                    Rect bounds = uv4.getBounds();
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    Iterator it5 = ov4.a.iterator();
                    while (it5.hasNext()) {
                        ee7 ee7 = (ee7) it5.next();
                        if (au1.s(ee7.b) != 0) {
                            rect = bounds;
                            c3 = c5;
                            c2 = c6;
                            it = it5;
                            simpleEntry = null;
                            c4 = 7;
                        } else {
                            Rect rect5 = ov4.c;
                            float width4 = ((float) bounds.width()) / ((float) rect5.width());
                            float height3 = ((float) bounds.height()) / ((float) rect5.height());
                            List<yq4> list = ee7.X;
                            for (yq4 yq4 : list) {
                                float[] fArr = yq4.b;
                                if (fArr != null) {
                                    for (int i3 = 0; i3 < fArr.length; i3++) {
                                        if (i3 % 2 == 0) {
                                            float f = fArr[i3] - ((float) rect5.left);
                                            fArr[i3] = f;
                                            float f2 = f * width4;
                                            fArr[i3] = f2;
                                            fArr[i3] = f2 + ((float) bounds.left);
                                        } else {
                                            float f3 = fArr[i3] - ((float) rect5.top);
                                            fArr[i3] = f3;
                                            float f4 = f3 * height3;
                                            fArr[i3] = f4;
                                            fArr[i3] = f4 + ((float) bounds.top);
                                        }
                                    }
                                }
                            }
                            xq4 xq4 = new xq4(ee7.c, (((float) bounds.width()) / ((float) rect5.width())) * ee7.o);
                            for (Iterator it6 = list.iterator(); it6.hasNext(); it6 = it2) {
                                yq4 yq42 = (yq4) it6.next();
                                float[] fArr2 = yq42.b;
                                int s2 = au1.s(yq42.a);
                                Path path = xq4.b;
                                ArrayList arrayList2 = xq4.a;
                                if (s2 == 0) {
                                    rect2 = bounds;
                                    float f5 = fArr2[0];
                                    float f6 = fArr2[1];
                                    float f7 = fArr2[2];
                                    float f8 = fArr2[3];
                                    it2 = it6;
                                    it3 = it5;
                                    arrayList2.add(new yq4(1, new float[]{f5, f6, f7, f8}));
                                    path.moveTo(f5, f6);
                                    path.lineTo(f7, f8);
                                } else if (s2 != 1) {
                                    rect2 = bounds;
                                    it2 = it6;
                                    it3 = it5;
                                } else {
                                    float f9 = fArr2[0];
                                    float f10 = fArr2[1];
                                    float f11 = fArr2[2];
                                    float f12 = fArr2[3];
                                    float f13 = fArr2[4];
                                    float f14 = fArr2[5];
                                    float f15 = fArr2[6];
                                    float f16 = fArr2[7];
                                    rect2 = bounds;
                                    arrayList2.add(new yq4(2, new float[]{f9, f10, f11, f12, f13, f14, f15, f16}));
                                    path.moveTo(f9, f10);
                                    path.cubicTo(f11, f12, f13, f14, f15, f16);
                                    it2 = it6;
                                    it3 = it5;
                                }
                                bounds = rect2;
                                it5 = it3;
                            }
                            rect = bounds;
                            it = it5;
                            c4 = 7;
                            c3 = 6;
                            c2 = 5;
                            simpleEntry = new AbstractMap.SimpleEntry(Integer.valueOf(ee7.a), xq4);
                        }
                        if (simpleEntry != null) {
                            arrayList.add((nv4) simpleEntry.getValue());
                            hashMap.put((Integer) simpleEntry.getKey(), (nv4) simpleEntry.getValue());
                        }
                        char c7 = c4;
                        bounds = rect;
                        c5 = c3;
                        c6 = c2;
                        it5 = it;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (e73 e73 : ov4.b) {
                        s9 s9Var = (au1.s(e73.a) == 0 && (nv4 = (nv4) hashMap.get(Integer.valueOf(e73.b))) != null) ? new s9(nv4) : null;
                        if (s9Var != null) {
                            arrayList3.add(s9Var);
                        }
                    }
                    Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        uv4.a.add((nv4) it7.next());
                        uv4.invalidate();
                    }
                    qv4.d.addAll(arrayList3);
                    uv4.setDrawStickerEnabled(ov4.o);
                }
                qv4.b();
                return;
            case 26:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.o);
                return;
            case 27:
                p9g p9g = (p9g) this.b;
                tu0 tu0 = (tu0) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.o;
                p9g.getClass();
                try {
                    mx5 i4 = s36.i(p9g.a);
                    if (i4 != null) {
                        lx5 lx5 = (lx5) i4.a;
                        synchronized (lx5.o) {
                            lx5.Y = threadPoolExecutor;
                        }
                        i4.a.a(new yw4(tu0, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th6) {
                    tu0.v(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 28:
                ((o05) this.b).b(new Exception((String) this.c, (Throwable) this.o));
                return;
            default:
                d15 d15 = (d15) this.b;
                List list2 = (List) this.c;
                Runnable runnable = (Runnable) this.o;
                if (d15.D != 8) {
                    list2.isEmpty();
                    if (!(d15.f instanceof c15) || d15.A || xi4.a.e(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null) {
                        d15.e.stop();
                    } else {
                        d15.e.flush();
                        d15.z = true;
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
                int i5 = d15.D;
                if (i5 == 7) {
                    d15.f();
                    return;
                }
                if (!d15.z) {
                    d15.h();
                }
                d15.i(1);
                if (i5 == 5 || i5 == 6) {
                    d15.k();
                    if (i5 == 6) {
                        d15.e();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }
}
