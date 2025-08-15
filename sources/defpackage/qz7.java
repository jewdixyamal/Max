package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* renamed from: qz7  reason: default package */
public final class qz7 implements qfd, pv1, CameraVideoCapturer.CameraSwitchHandler, ej5, vg1, zpa, l3a, ke7, bqd {
    public static final xw0 o = new xw0(19);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ qz7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.qz7 g(android.content.Context r4) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            r2.<init>(r4, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.nio.channels.FileLock r0 = r4.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            qz7 r2 = new qz7     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            r3 = 14
            r2.<init>((java.lang.Object) r4, (int) r3, (java.lang.Object) r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            return r2
        L_0x0023:
            r0 = r1
            goto L_0x0027
        L_0x0025:
            r4 = r1
            r0 = r4
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.release()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r4 == 0) goto L_0x0031
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.g(android.content.Context):qz7");
    }

    public mv1 A() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        mv1 mv1 = mv1.a;
        if (num == null) {
            return mv1;
        }
        switch (num.intValue()) {
            case 0:
                return mv1.b;
            case 1:
            case 3:
                return mv1.c;
            case 2:
                return mv1.o;
            case 4:
                return mv1.Y;
            case 5:
                return mv1.Z;
            case 6:
                return mv1.X;
            default:
                return mv1;
        }
    }

    public void B(long j) {
        ((m56) this.c).invoke(Long.valueOf(j));
    }

    public void C(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.C(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void D(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.D(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void E(a aVar, boolean z) {
        c cVar = (c) this.b;
        Context context = cVar.w.u0;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.f0().o.E(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void F(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.F(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void G(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.G(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void H(a aVar, Bundle bundle, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.H(aVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void I(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.I(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void J(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.J(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void K(a aVar, View view, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.K(aVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                jo7 jo7 = c16.a;
                c cVar = (c) this.b;
                if (aVar == ((a) jo7.a)) {
                    qz7 qz7 = cVar.o;
                    synchronized (((CopyOnWriteArrayList) qz7.c)) {
                        int size = ((CopyOnWriteArrayList) qz7.c).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (((c16) ((CopyOnWriteArrayList) qz7.c).get(i)).a == jo7) {
                                ((CopyOnWriteArrayList) qz7.c).remove(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    ((vd8) jo7.c).getClass();
                    vd8.C(view, (FrameLayout) jo7.b);
                } else {
                    continue;
                }
            }
        }
    }

    public void L(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.L(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public int M() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return 2;
        }
        if (intValue == 1) {
            return 3;
        }
        if (intValue == 2) {
            return 4;
        }
        if (intValue == 3) {
            return 5;
        }
        if (intValue != 4) {
            return intValue != 5 ? 1 : 7;
        }
        return 6;
    }

    public int N() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                return 1;
            }
        }
        return 2;
    }

    public int O() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return 1;
        }
        switch (num.intValue()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 1;
        }
    }

    public f98 P() {
        MediaController.PlaybackInfo playbackInfo = ((e98) this.b).a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new f98(playbackInfo.getPlaybackType(), new j30(new i30(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    public i3b Q() {
        e98 e98 = (e98) this.b;
        pr6 a2 = e98.e.a();
        if (a2 != null) {
            try {
                return a2.getPlaybackState();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = e98.a.getPlaybackState();
        if (playbackState != null) {
            return i3b.a(playbackState);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h98, g98] */
    public h98 R() {
        return new g98(((e98) this.b).a.getTransportControls());
    }

    public fpd S(JSONObject jSONObject, zad zad) {
        eqa eqa;
        try {
            jSONObject.optBoolean("markerFound");
            jSONObject.optInt("countBefore");
            jSONObject.optInt("countAfter");
            JSONArray optJSONArray = jSONObject.optJSONArray("participants");
            if (optJSONArray != null) {
                eqa = ((die) this.c).H(optJSONArray, zad);
            } else {
                nz4 nz4 = nz4.a;
                eqa = new eqa(nz4, nz4);
            }
            return new fpd(eqa);
        } catch (JSONException e) {
            ((a4c) this.b).logException("ParticipantListChunkParser", "Can't parse participant chunk", e);
            return null;
        }
    }

    public void T(float f, float f2) {
        Context context;
        cb5 cb5 = (cb5) this.b;
        xg1 xg1 = cb5.g;
        WindowManager windowManager = null;
        ViewGroup.LayoutParams layoutParams = xg1 != null ? xg1.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.x = (int) f;
            layoutParams2.y = (int) f2;
        } else {
            layoutParams2 = null;
        }
        xg1 xg12 = (xg1) this.c;
        hm9.m("FakePipController", "update call local pip", new Object[0]);
        if (layoutParams2 == null) {
            hm9.m("FakePipController", "update call local pip was skip due to layout params are null", new Object[0]);
            return;
        }
        try {
            xg1 xg13 = cb5.g;
            if (!(xg13 == null || (context = xg13.getContext()) == null)) {
                windowManager = nd7.z(context);
            }
            if (windowManager != null) {
                windowManager.updateViewLayout(xg12, layoutParams2);
            }
        } catch (IllegalArgumentException e) {
            hm9.p("FakePipController", "can't update call local pip", e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0223, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (r5 == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r5 == true) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r0.c.put(java.lang.Integer.valueOf(r7.a), r7);
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            r11 = this;
            dj3 r0 = new dj3
            r0.<init>()
            int r1 = r13.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x023c
            java.lang.String r4 = r13.getAttributeName(r3)
            java.lang.String r5 = r13.getAttributeValue(r3)
            if (r4 == 0) goto L_0x0238
            if (r5 != 0) goto L_0x001b
            goto L_0x0238
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0238
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = 1
            r4 = -1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r12.getResources()
            java.lang.String r8 = r12.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = r4
        L_0x0046:
            if (r1 != r4) goto L_0x0056
            int r6 = r5.length()
            if (r6 <= r3) goto L_0x0056
            java.lang.String r1 = r5.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0056:
            int r5 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r6 = 0
            r7 = r6
        L_0x005c:
            if (r5 == r3) goto L_0x0230
            if (r5 == 0) goto L_0x0220
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x00c1
            if (r5 == r8) goto L_0x0068
            goto L_0x0223
        L_0x0068:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            switch(r10) {
                case -2075718416: goto L_0x009e;
                case -190376483: goto L_0x0094;
                case 426575017: goto L_0x008a;
                case 2146106725: goto L_0x007a;
                default: goto L_0x0079;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0079:
            goto L_0x00a8
        L_0x007a:
            java.lang.String r10 = "constraintset"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r2
            goto L_0x00a9
        L_0x0084:
            r12 = move-exception
            goto L_0x0229
        L_0x0087:
            r12 = move-exception
            goto L_0x022d
        L_0x008a:
            java.lang.String r10 = "constraintoverride"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r9
            goto L_0x00a9
        L_0x0094:
            java.lang.String r10 = "constraint"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r3
            goto L_0x00a9
        L_0x009e:
            java.lang.String r10 = "guideline"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x00a8
            r5 = r8
            goto L_0x00a9
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            if (r5 == 0) goto L_0x0230
            if (r5 == r3) goto L_0x00b3
            if (r5 == r9) goto L_0x00b3
            if (r5 == r8) goto L_0x00b3
            goto L_0x0223
        L_0x00b3:
            java.util.HashMap r5 = r0.c     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r8 = r7.a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r7 = r6
            goto L_0x0223
        L_0x00c1:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            switch(r10) {
                case -2025855158: goto L_0x012a;
                case -1984451626: goto L_0x0120;
                case -1962203927: goto L_0x0116;
                case -1269513683: goto L_0x010c;
                case -1238332596: goto L_0x0102;
                case -71750448: goto L_0x00f8;
                case 366511058: goto L_0x00ed;
                case 1331510167: goto L_0x00e4;
                case 1791837707: goto L_0x00d9;
                case 1803088381: goto L_0x00ce;
                default: goto L_0x00cc;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x00cc:
            goto L_0x0134
        L_0x00ce:
            java.lang.String r8 = "Constraint"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r2
            goto L_0x0135
        L_0x00d9:
            java.lang.String r8 = "CustomAttribute"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 8
            goto L_0x0135
        L_0x00e4:
            java.lang.String r9 = "Barrier"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            goto L_0x0135
        L_0x00ed:
            java.lang.String r8 = "CustomMethod"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 9
            goto L_0x0135
        L_0x00f8:
            java.lang.String r8 = "Guideline"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r9
            goto L_0x0135
        L_0x0102:
            java.lang.String r8 = "Transform"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 5
            goto L_0x0135
        L_0x010c:
            java.lang.String r8 = "PropertySet"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 4
            goto L_0x0135
        L_0x0116:
            java.lang.String r8 = "ConstraintOverride"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = r3
            goto L_0x0135
        L_0x0120:
            java.lang.String r8 = "Motion"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 7
            goto L_0x0135
        L_0x012a:
            java.lang.String r8 = "Layout"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            if (r5 == 0) goto L_0x0134
            r8 = 6
            goto L_0x0135
        L_0x0134:
            r8 = r4
        L_0x0135:
            java.lang.String r5 = "XML parser error must be within a Constraint "
            switch(r8) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020e;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01cf;
                case 5: goto L_0x01aa;
                case 6: goto L_0x0184;
                case 7: goto L_0x015e;
                case 8: goto L_0x013c;
                case 9: goto L_0x013c;
                default: goto L_0x013a;
            }
        L_0x013a:
            goto L_0x0223
        L_0x013c:
            if (r7 == 0) goto L_0x0145
            java.util.HashMap r5 = r7.f     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            defpackage.pi3.a(r12, r13, r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0145:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x015e:
            if (r7 == 0) goto L_0x016b
            aj3 r5 = r7.c     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x016b:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0184:
            if (r7 == 0) goto L_0x0191
            zi3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0191:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01aa:
            if (r7 == 0) goto L_0x01b6
            cj3 r5 = r7.e     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x01b6:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01cf:
            if (r7 == 0) goto L_0x01db
            bj3 r5 = r7.b     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x01db:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            throw r12     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x01f4:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            yi3 r7 = defpackage.dj3.f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            zi3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.h0 = r3     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0201:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            yi3 r7 = defpackage.dj3.f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            zi3 r5 = r7.d     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            r5.a = r3     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x020e:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            yi3 r7 = defpackage.dj3.f(r12, r5, r3)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0217:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            yi3 r7 = defpackage.dj3.f(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x0223
        L_0x0220:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
        L_0x0223:
            int r5 = r13.next()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0084 }
            goto L_0x005c
        L_0x0229:
            r12.printStackTrace()
            goto L_0x0230
        L_0x022d:
            r12.printStackTrace()
        L_0x0230:
            java.lang.Object r11 = r11.c
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r11.put(r1, r0)
            goto L_0x023c
        L_0x0238:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.U(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void V() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException unused) {
        }
    }

    public void W(ja8 ja8) {
        e98 e98 = (e98) this.b;
        if ((e98.a.getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mf7.a(ja8, MediaDescriptionCompat.CREATOR));
            e98.a.sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, (ResultReceiver) null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }

    public void X(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.o.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        qz7.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public yze Y(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                z04.u("Unmatched track of type: " + i);
                return new sk4();
            } else if (i == iArr[i2]) {
                return ((erc[]) this.c)[i2];
            } else {
                i2++;
            }
        }
    }

    public Object a(Uri uri, w24 w24) {
        ok5 ok5 = (ok5) ((zpa) this.b).a(uri, w24);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? ok5 : (ok5) ok5.a(list);
    }

    public void b(t55 t55) {
        CaptureResult captureResult = (CaptureResult) this.c;
        super.b(t55);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                t55.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = t55.a;
        if (l != null) {
            t55.c("ExposureTime", String.valueOf(((double) l.longValue()) / ((double) TimeUnit.SECONDS.toNanos(1))), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            t55.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (((float) num3.intValue()) / 100.0f)));
            }
            int intValue = num2.intValue();
            t55.c("SensitivityType", String.valueOf(3), arrayList);
            t55.c("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            long floatValue = (long) (f2.floatValue() * 1000.0f);
            t55.c("FocalLength", floatValue + "/1000", arrayList);
        }
        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            int s = au1.s(num4.intValue() == 0 ? 2 : 1);
            t55.c("WhiteBalance", s != 0 ? s != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    public nje c() {
        return (nje) this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.clear():void");
    }

    public void e(long j, boolean z) {
        ((a66) this.b).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    public void f(File file) {
        m94 g = o94.g((o94) this.c, file);
        if (g != null && g.b == ".cnt") {
            ((ArrayList) this.b).add(new l94(file, g.c));
        }
    }

    public Object get() {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        Object obj2 = ((lde) this.b).get();
        this.c = obj2;
        return obj2;
    }

    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public void h(Object obj, String str) {
        ((ArrayList) this.b).add(rh4.j(str, "=", String.valueOf(obj)));
    }

    public boolean isEmpty() {
        return ((le9) ((AtomicReference) this.c).get()) == ((le9) ((AtomicReference) this.b).get());
    }

    public void j(File file) {
    }

    public void l(Task task) {
        boolean h = task.h();
        Continuation continuation = (Continuation) this.c;
        xe6 xe6 = (xe6) this.b;
        if (!h) {
            hm9.p(xe6.b, "Fetching FCM registration token failed", task.e());
            continuation.resumeWith((Object) null);
            return;
        }
        Object f = task.f();
        if (f != null) {
            hm9.m(xe6.b, "FCM token fetched", new Object[0]);
            continuation.resumeWith((String) f);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public void m(File file) {
    }

    public void o(ou6 ou6, nu6 nu6, lu6 lu6) {
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        ((ArrayList) this.c).add(nu6);
        if (((HashMap) this.b) == null) {
            this.b = new HashMap();
        }
        ((HashMap) this.b).put(ou6, lu6);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [le9, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public boolean offer(Object obj) {
        if (obj != null) {
            ? atomicReference = new AtomicReference();
            atomicReference.a = obj;
            ((le9) ((AtomicReference) this.b).getAndSet(atomicReference)).lazySet(atomicReference);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public void onCameraSwitchDone(boolean z) {
        tv1 tv1 = (tv1) this.c;
        String str = (String) this.b;
        a4c a4c = tv1.e;
        a4c.log("CameraCapturerAdapter", "onCameraSwitchDone, new camera: " + str + ", is front: " + z);
        synchronized (tv1.g) {
            tv1.h = str;
            tv1.i = z;
            tv1.j = false;
        }
        Iterator it = tv1.f.iterator();
        while (it.hasNext()) {
            ((kq7) it.next()).i(tv1, true);
        }
    }

    public void onCameraSwitchError(String str) {
        tv1 tv1 = (tv1) this.c;
        tv1.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(wg0.i("onCameraSwitchError, ", str)));
        synchronized (tv1.g) {
            tv1.j = false;
        }
        Iterator it = tv1.f.iterator();
        while (it.hasNext()) {
            ((kq7) it.next()).i(tv1, false);
        }
    }

    public void p(ja8 ja8, int i) {
        e98 e98 = (e98) this.b;
        if ((e98.a.getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mf7.a(ja8, MediaDescriptionCompat.CREATOR));
            bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
            e98.a.sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, (ResultReceiver) null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }

    public Object poll() {
        le9 le9;
        AtomicReference atomicReference = (AtomicReference) this.c;
        le9 le92 = (le9) atomicReference.get();
        le9 le93 = (le9) le92.get();
        if (le93 != null) {
            Object obj = le93.a;
            le93.a = null;
            atomicReference.lazySet(le93);
            return obj;
        } else if (le92 == ((le9) ((AtomicReference) this.b).get())) {
            return null;
        } else {
            do {
                le9 = (le9) le92.get();
            } while (le9 == null);
            Object obj2 = le9.a;
            le9.a = null;
            atomicReference.lazySet(le9);
            return obj2;
        }
    }

    public void q(n54 n54) {
        synchronized (n54) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new q60(this, n54, 1));
        }
    }

    public nv1 r() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        nv1 nv1 = nv1.a;
        if (num == null) {
            return nv1;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? nv1 : nv1.X : nv1.o : nv1.c : nv1.b;
    }

    public int s() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return 2;
        }
        if (intValue != 2) {
            return (intValue == 3 || intValue == 4) ? 4 : 1;
        }
        return 3;
    }

    public void t(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.t(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(a aVar, boolean z) {
        c cVar = (c) this.b;
        Context context = cVar.w.u0;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.f0().o.u(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public lv1 v() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        lv1 lv1 = lv1.a;
        if (num == null) {
            return lv1;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return lv1.b;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return lv1.X;
            }
            if (intValue == 3) {
                return lv1.Y;
            }
            if (intValue == 4) {
                return lv1.o;
            }
            if (intValue != 5) {
                return lv1;
            }
        }
        return lv1.c;
    }

    public void w(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.w(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public void x(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.f0().o.x(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            c16 c16 = (c16) it.next();
            if (!z || c16.b) {
                c16.a.getClass();
            }
        }
    }

    public CaptureResult y() {
        return (CaptureResult) this.c;
    }

    public PointF z() {
        xg1 xg1 = ((cb5) this.b).g;
        WindowManager.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = xg1 != null ? xg1.getLayoutParams() : null;
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        }
        return layoutParams != null ? new PointF((float) layoutParams.x, (float) layoutParams.y) : dy7.y(((xg1) this.c).getContext());
    }

    public /* synthetic */ qz7(int i, boolean z) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.text.Editable$Factory, cx4] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qz7(android.widget.EditText r4, boolean r5) {
        /*
            r3 = this;
            r0 = 17
            r3.a = r0
            r0 = 0
            r3.<init>()
            r3.b = r4
            qy4 r1 = new qy4
            r1.<init>(r4, r5)
            r3.c = r1
            r4.addTextChangedListener(r1)
            cx4 r3 = defpackage.cx4.b
            if (r3 != 0) goto L_0x003b
            java.lang.Object r3 = defpackage.cx4.a
            monitor-enter(r3)
            cx4 r5 = defpackage.cx4.b     // Catch:{ all -> 0x0035 }
            if (r5 != 0) goto L_0x0037
            cx4 r5 = new cx4     // Catch:{ all -> 0x0035 }
            r5.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<cx4> r2 = defpackage.cx4.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0032 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r0, r2)     // Catch:{ all -> 0x0032 }
            defpackage.cx4.c = r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            defpackage.cx4.b = r5     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r4 = move-exception
            goto L_0x0039
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0039:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4
        L_0x003b:
            cx4 r3 = defpackage.cx4.b
            r4.setEditableFactory(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.<init>(android.widget.EditText, boolean):void");
    }

    public /* synthetic */ qz7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public qz7(tv1 tv1, String str) {
        this.a = 10;
        this.c = tv1;
        this.b = str;
    }

    public qz7(bg4 bg4, qld qld, bi biVar, kad kad) {
        this.a = 1;
        this.b = biVar;
        this.c = o;
    }

    public qz7(d4c d4c, CallAnalyticsSender callAnalyticsSender) {
        this.a = 7;
        this.b = d4c;
        this.c = callAnalyticsSender;
        callAnalyticsSender.setIdle(false);
    }

    public /* synthetic */ qz7(Object obj) {
        this.a = 28;
        fp3.n(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public qz7(String str, z04 z04, pq9 pq9) {
        this.a = 3;
        this.b = str;
        this.c = z04;
    }

    public qz7(je7 je7) {
        this.a = 0;
        this.b = qz7.class.getName();
        this.c = je7;
    }

    public qz7(c cVar) {
        this.a = 20;
        this.b = cVar;
        this.c = new CopyOnWriteArrayList();
    }

    public qz7(Context context, ai8 ai8) {
        this.a = 25;
        if (ai8 != null) {
            this.c = Collections.synchronizedSet(new HashSet());
            this.b = new e98(context, ai8);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public qz7(o94 o94) {
        this.a = 15;
        this.c = o94;
        this.b = new ArrayList();
    }

    public qz7(int i) {
        this.a = i;
        switch (i) {
            case 27:
                AtomicReference atomicReference = new AtomicReference();
                this.b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.c = atomicReference2;
                AtomicReference atomicReference3 = new AtomicReference();
                atomicReference2.lazySet(atomicReference3);
                le9 le9 = (le9) atomicReference.getAndSet(atomicReference3);
                return;
            default:
                this.b = new AtomicBoolean(false);
                return;
        }
    }

    public qz7(CardView cardView) {
        this.a = 11;
        this.c = cardView;
    }
}
