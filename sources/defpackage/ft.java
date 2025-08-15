package defpackage;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Looper;
import android.text.Spannable;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;

/* renamed from: ft  reason: default package */
public abstract class ft {
    public static final Continuation[] a = new Continuation[0];
    public static final qx7 b = new qx7(11);
    public static final wdg c = new wdg(5);
    public static final r66 d = new Object();
    public static final kj6 e = new kj6(11);
    public static final oz7 f = new Object();
    public static final yb9 g = new Object();
    public static final oz7 h = new Object();

    public static final File A(Uri uri) {
        if (tpa.f(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    public static void B(Spannable spannable, uw3 uw3, int i, int i2) {
        Object obj;
        if (i < 0) {
            i = 0;
        }
        if (i < spannable.length()) {
            int length = spannable.length();
            if (i2 > length) {
                i2 = length;
            }
            try {
                obj = (uw3[]) spannable.getSpans(i, i2, uw3.getClass());
            } catch (Throwable th) {
                obj = new njc(th);
            }
            if (obj instanceof njc) {
                obj = null;
            }
            uw3[] uw3Arr = (uw3[]) obj;
            if (!(uw3Arr == null || uw3Arr.length == 0)) {
                for (uw3 v : uw3Arr) {
                    kp.v(spannable, v, i, i2);
                }
            }
            try {
                spannable.setSpan(uw3, i, i2, 33);
            } catch (Throwable th2) {
                hm9.p("Markdown", "error while try to set span", th2);
            }
        }
    }

    public static final void C(y5f y5f) {
        y5f.e(a1b.class, new uza(0));
    }

    public static final void D(y5f y5f) {
        y5f.c(b64.class, new lxc(5));
    }

    public static final void E(y5f y5f) {
        y5f.c(b64.class, new lxc(14));
    }

    public static final void a(kl7 kl7, View view, boolean z) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = z ? 0.0f : 1.0f;
        if (!z) {
            f2 = 0.0f;
        }
        float f5 = z ? -(fk4.d().getDisplayMetrics().density * 50.0f) : 0.0f;
        if (!z) {
            f3 = -(fk4.d().getDisplayMetrics().density * 50.0f);
        }
        view.setTranslationY(f5);
        kl7.add(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f4, f2}));
        kl7.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f5, f3}));
    }

    public static final void b(int i, int i2, int i3, int i4, View view, View view2) {
        if (view != null) {
            view.post(new uc3(view2, i, i2, i3, i4, view, 0));
        }
    }

    public static final ObjectAnimator c(View view, boolean z, float f2, float f3, long j) {
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2, f3});
        ofFloat.setStartDelay(z ? j - 50 : 0);
        ofFloat.setDuration(50);
        return ofFloat;
    }

    public static a34 d(lhc lhc, String str, r4c r4c, int i) {
        y24 y24 = new y24(1);
        y24.b = mr0.S(str, r4c.c);
        y24.g = r4c.a;
        y24.h = r4c.b;
        String a2 = lhc.a();
        if (a2 == null) {
            a2 = r4c.b(((mk0) lhc.b.get(0)).a).toString();
        }
        y24.e(a2);
        y24.c(i);
        y24.d();
        return y24.b();
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new AndroidRuntimeException("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }

    public static final void f(View view, boolean z, long j, m56 m56) {
        int i = y7a.m;
        Object tag = view.getTag(i);
        if (tag == null) {
            boolean z2 = false;
            if ((view.getVisibility() == 0) == z) {
                if (m56 != null) {
                    if (view.getVisibility() == 0) {
                        z2 = true;
                    }
                    m56.invoke(Boolean.valueOf(z2));
                    return;
                }
                return;
            }
        }
        boolean f2 = tpa.f(tag, "fade_in");
        boolean f3 = tpa.f(tag, "fade_out");
        if (f2 && z) {
            return;
        }
        if (!f3 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            float f4 = z ? 0.0f : 1.0f;
            float f5 = z ? 1.0f : 0.0f;
            view.animate().setDuration(j).alpha(f5).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new rg(view, i, str, f4, f5, z, m56)).start();
        }
    }

    public static /* synthetic */ void g(View view, boolean z, long j, m56 m56, int i) {
        if ((i & 2) != 0) {
            j = 150;
        }
        if ((i & 4) != 0) {
            m56 = null;
        }
        f(view, z, j, m56);
    }

    public static final vk6 h(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((vk6) obj) instanceof uk6)) {
                break;
            }
        }
        return (vk6) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0226, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03c1, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0558  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bj6 i(defpackage.xv1 r12) {
        /*
            yrb r0 = defpackage.yrb.c
            r0.getClass()
            cd6 r0 = r0.a     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            bm7 r0 = r0.j()     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            wrb r0 = (defpackage.wrb) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0569 }
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002b
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x002b
            r3 = r5
            goto L_0x002c
        L_0x002b:
            r3 = r6
        L_0x002c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x003c
            androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk
            r3.<init>(r12)
            r1.add(r3)
        L_0x003c:
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r3 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            boolean r3 = r0.a(r3, r6)
            if (r3 == 0) goto L_0x0052
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r3 = new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk
            r3.<init>()
            r1.add(r3)
        L_0x0052:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.a
            java.lang.String r7 = android.os.Build.DEVICE
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x0070
            androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk
            r3.<init>()
            r1.add(r3)
        L_0x0070:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r9 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L_0x008e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r12.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x008e
            r3 = r5
            goto L_0x008f
        L_0x008e:
            r3 = r6
        L_0x008f:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x009f
            androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk
            r3.<init>()
            r1.add(r3)
        L_0x009f:
            java.lang.Object r3 = r12.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00af
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x00af
            r3 = r5
            goto L_0x00b0
        L_0x00af:
            r3 = r6
        L_0x00b0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00c0
            androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk
            r3.<init>(r12)
            r1.add(r3)
        L_0x00c0:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r9 = "samsungexynos7420"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 != 0) goto L_0x00d2
            java.lang.String r9 = "universal7420"
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00e2
        L_0x00d2:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r12.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x00e2
            r3 = r5
            goto L_0x00e3
        L_0x00e2:
            r3 = r6
        L_0x00e3:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00f3
            androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk
            r3.<init>()
            r1.add(r3)
        L_0x00f3:
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0103
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0103
            r2 = r5
            goto L_0x0104
        L_0x0103:
            r2 = r6
        L_0x0104:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0114
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0114:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.class
            boolean r2 = r0.a(r2, r6)
            if (r2 == 0) goto L_0x0124
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0124:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0142
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0142
            r2 = r5
            goto L_0x0143
        L_0x0142:
            r2 = r6
        L_0x0143:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0153
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0153:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r3 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.a
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0171
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0171
            r2 = r5
            goto L_0x0172
        L_0x0171:
            r2 = r6
        L_0x0172:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x0182
            androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0182:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r3 = "motorola"
            boolean r8 = r3.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x0195
            java.lang.String r8 = "MotoG3"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x0195
            goto L_0x01e3
        L_0x0195:
            java.lang.String r8 = "samsung"
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01a6
            java.lang.String r9 = "SM-G532F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01a6
            goto L_0x01e3
        L_0x01a6:
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01b5
            java.lang.String r9 = "SM-J700F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01b5
            goto L_0x01e3
        L_0x01b5:
            boolean r9 = r8.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01c4
            java.lang.String r9 = "SM-A920F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01c4
            goto L_0x01e3
        L_0x01c4:
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x01d3
            java.lang.String r8 = "SM-J415F"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x01d3
            goto L_0x01e3
        L_0x01d3:
            java.lang.String r8 = "xiaomi"
            boolean r2 = r8.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01e5
            java.lang.String r2 = "Mi A1"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x01e5
        L_0x01e3:
            r2 = r5
            goto L_0x01e6
        L_0x01e5:
            r2 = r6
        L_0x01e6:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x01f6
            androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk
            r2.<init>()
            r1.add(r2)
        L_0x01f6:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.a
            java.util.Iterator r2 = r2.iterator()
        L_0x01fc:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0226
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = android.os.Build.MODEL
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r8 = r8.toUpperCase(r9)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L_0x01fc
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x0226
            r2 = r5
            goto L_0x0227
        L_0x0226:
            r2 = r6
        L_0x0227:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0237
            androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0237:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "SAMSUNG"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x0257
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r2 >= r7) goto L_0x0257
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0257
            r2 = r5
            goto L_0x0258
        L_0x0257:
            r2 = r6
        L_0x0258:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0268
            androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0268:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x027a
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x027a
            r7 = r5
            goto L_0x027b
        L_0x027a:
            r7 = r6
        L_0x027b:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x028b
            androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk
            r7.<init>()
            r1.add(r7)
        L_0x028b:
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x029b
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x029b
            r7 = r5
            goto L_0x029c
        L_0x029b:
            r7 = r6
        L_0x029c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x02ac
            androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02ac:
            java.lang.Object r7 = r12.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x02bc
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x02bc
            r7 = r5
            goto L_0x02bd
        L_0x02bc:
            r7 = r6
        L_0x02bd:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x02cd
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02cd:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = r7.toLowerCase(r8)
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.b
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x02ef
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r12.a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L_0x02ef
            r9 = r5
            goto L_0x02f0
        L_0x02ef:
            r9 = r6
        L_0x02f0:
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.a
            java.lang.String r11 = r7.toLowerCase(r8)
            boolean r10 = r10.contains(r11)
            if (r9 != 0) goto L_0x0301
            if (r10 == 0) goto L_0x02ff
            goto L_0x0301
        L_0x02ff:
            r9 = r6
            goto L_0x0302
        L_0x0301:
            r9 = r5
        L_0x0302:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L_0x0312
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk r9 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk
            r9.<init>()
            r1.add(r9)
        L_0x0312:
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            java.lang.String r9 = r7.toLowerCase(r8)
            java.util.List r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.a
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x0330
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r9 = r12.a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != r5) goto L_0x0330
            r9 = r5
            goto L_0x0331
        L_0x0330:
            r9 = r6
        L_0x0331:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class
            boolean r9 = r0.a(r10, r9)
            if (r9 == 0) goto L_0x0341
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk r9 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk
            r9.<init>()
            r1.add(r9)
        L_0x0341:
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            java.lang.String r7 = r7.toLowerCase(r8)
            java.util.List r8 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.a
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x035f
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r7 = r12.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x035f
            r7 = r5
            goto L_0x0360
        L_0x035f:
            r7 = r6
        L_0x0360:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x0370
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0370:
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0380
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0380
            r2 = r5
            goto L_0x0381
        L_0x0380:
            r2 = r6
        L_0x0381:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x0391
            androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0391:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.b
            java.util.Iterator r2 = r2.iterator()
        L_0x0397:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03c1
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r8)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0397
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r12.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x03c1
            r2 = r5
            goto L_0x03c2
        L_0x03c1:
            r2 = r6
        L_0x03c2:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x03d2
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk
            r2.<init>(r12)
            r1.add(r2)
        L_0x03d2:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "HUAWEI"
            boolean r7 = r4.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x03e7
            java.lang.String r7 = "HUAWEI ALE-L04"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x03e7
            goto L_0x043f
        L_0x03e7:
            java.lang.String r7 = "Samsung"
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x03fa
            java.lang.String r8 = "sm-j320f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x03fa
            goto L_0x043f
        L_0x03fa:
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x040b
            java.lang.String r8 = "sm-j700f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x040b
            goto L_0x043f
        L_0x040b:
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x041c
            java.lang.String r8 = "sm-j111f"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x041c
            goto L_0x043f
        L_0x041c:
            java.lang.String r8 = "OPPO"
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x042f
            java.lang.String r8 = "A37F"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x042f
            goto L_0x043f
        L_0x042f:
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0441
            java.lang.String r7 = "sm-j510fn"
            java.lang.String r8 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0441
        L_0x043f:
            r7 = r5
            goto L_0x0442
        L_0x0441:
            r7 = r6
        L_0x0442:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class
            boolean r7 = r0.a(r8, r7)
            if (r7 == 0) goto L_0x0452
            androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0452:
            java.lang.String r7 = "Huawei"
            boolean r2 = r7.equalsIgnoreCase(r2)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0468
            androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0468:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.i()
            if (r2 != 0) goto L_0x04ab
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g()
            if (r2 != 0) goto L_0x04ab
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r7 = "pixel 4 xl"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0491
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r7 != r8) goto L_0x0491
            goto L_0x04ab
        L_0x0491:
            java.lang.String r7 = android.os.Build.BRAND
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x04a2
            java.lang.String r3 = "moto e13"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x04a2
            goto L_0x04ab
        L_0x04a2:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h()
            if (r2 == 0) goto L_0x04a9
            goto L_0x04ab
        L_0x04a9:
            r2 = r6
            goto L_0x04ac
        L_0x04ab:
            r2 = r5
        L_0x04ac:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r3, r2)
            if (r2 == 0) goto L_0x04bc
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x04bc:
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r3 = "Pixel 8"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x04d6
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r12 = r12.a(r3)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != 0) goto L_0x04d6
            r12 = r5
            goto L_0x04d7
        L_0x04d6:
            r12 = r6
        L_0x04d7:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk.class
            boolean r12 = r0.a(r3, r12)
            if (r12 == 0) goto L_0x04e7
            androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk
            r12.<init>()
            r1.add(r12)
        L_0x04e7:
            java.util.HashSet r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = r2.toLowerCase(r3)
            boolean r12 = r12.contains(r7)
            if (r12 != 0) goto L_0x053c
            int r12 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r12 < r7) goto L_0x0507
            java.lang.String r12 = "Spreadtrum"
            java.lang.String r7 = android.os.Build.SOC_MANUFACTURER
            boolean r12 = r12.equalsIgnoreCase(r7)
            if (r12 != 0) goto L_0x053c
        L_0x0507:
            java.lang.String r12 = android.os.Build.HARDWARE
            java.lang.String r7 = r12.toLowerCase(r3)
            java.lang.String r8 = "ums"
            boolean r7 = r7.startsWith(r8)
            if (r7 != 0) goto L_0x053c
            java.lang.String r7 = android.os.Build.BRAND
            java.lang.String r8 = "itel"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 == 0) goto L_0x052c
            java.lang.String r12 = r12.toLowerCase(r3)
            java.lang.String r3 = "sp"
            boolean r12 = r12.startsWith(r3)
            if (r12 == 0) goto L_0x052c
            goto L_0x053c
        L_0x052c:
            boolean r12 = r4.equalsIgnoreCase(r7)
            if (r12 == 0) goto L_0x053b
            java.lang.String r12 = "FIG-LX1"
            boolean r12 = r12.equalsIgnoreCase(r2)
            if (r12 == 0) goto L_0x053b
            goto L_0x053c
        L_0x053b:
            r5 = r6
        L_0x053c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r12 = r0.a(r12, r5)
            if (r12 == 0) goto L_0x054c
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk
            r12.<init>()
            r1.add(r12)
        L_0x054c:
            boolean r12 = androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.e()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class
            boolean r12 = r0.a(r2, r12)
            if (r12 == 0) goto L_0x0560
            androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk r12 = new androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk
            r12.<init>()
            r1.add(r12)
        L_0x0560:
            bj6 r12 = new bj6
            r12.<init>(r1)
            defpackage.bj6.i(r12)
            return r12
        L_0x0569:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unexpected error in QuirkSettings StateObservable"
            r0.<init>(r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.i(xv1):bj6");
    }

    public static final Class j(nb7 nb7) {
        Class a2 = ((f23) nb7).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a2 : Double.class;
            case 104431:
                return !name.equals("int") ? a2 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a2 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a2 : Character.class;
            case 3327612:
                return !name.equals("long") ? a2 : Long.class;
            case 3625364:
                return !name.equals("void") ? a2 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a2 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a2 : Float.class;
            case 109413500:
                return !name.equals("short") ? a2 : Short.class;
            default:
                return a2;
        }
    }

    public static final boolean l(View view) {
        Object tag = view.getTag(y7a.m);
        boolean f2 = tpa.f(tag, "fade_in");
        boolean f3 = tpa.f(tag, "fade_out");
        if (tag == null) {
            if (view.getVisibility() != 0) {
                return false;
            }
        } else if (!f2 && (f3 || view.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static boolean n(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final vk6 o(List list) {
        Object obj;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (!(((vk6) obj) instanceof uk6)) {
                break;
            }
        }
        return (vk6) obj;
    }

    /* JADX INFO: finally extract failed */
    public static m13 p(t24 t24, int i, lhc lhc) {
        r4c r4c = lhc.X;
        zw6 zw6 = lhc.b;
        if (r4c == null) {
            return null;
        }
        qy5 qy5 = lhc.a;
        String str = qy5.m;
        kj6 kj6 = mbe.a0;
        xu0 xu0 = new xu0((str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm"))) ? new f26(32, kj6) : new d28(2, kj6), i, qy5);
        try {
            r4c e2 = lhc.e();
            fm9.h(e2);
            r4c d2 = lhc.d();
            if (d2 != null) {
                r4c a2 = e2.a(d2, ((mk0) zw6.get(0)).a);
                if (a2 == null) {
                    new u07(t24, d(lhc, ((mk0) zw6.get(0)).a, e2, 0), lhc.a, 0, (Object) null, xu0).load();
                } else {
                    d2 = a2;
                }
                new u07(t24, d(lhc, ((mk0) zw6.get(0)).a, d2, 0), lhc.a, 0, (Object) null, xu0).load();
            }
            xu0.c();
            return xu0.a();
        } catch (Throwable th) {
            xu0.c();
            throw th;
        }
    }

    public static final boolean q(View view, boolean z) {
        if (view != null && view.getVisibility() == 0) {
            return z || view.getAlpha() != 0.0f;
        }
        return false;
    }

    public static int r(s02 s02, int i, int i2, int i3) {
        fm9.f(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        lz7.g(lz7.g(i4, i5), 1 << i3);
        if (s02.b() < i) {
            return -1;
        }
        int i6 = s02.i(i);
        if (i6 != i4) {
            return i6;
        }
        if (s02.b() < i2) {
            return -1;
        }
        int i7 = s02.i(i2);
        int i8 = i6 + i7;
        if (i7 != i5) {
            return i8;
        }
        if (s02.b() < i3) {
            return -1;
        }
        return i8 + s02.i(i3);
    }

    public static h7b s(wpa wpa) {
        wpa.H(1);
        int x = wpa.x();
        long j = ((long) wpa.b) + ((long) x);
        int i = x / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long o = wpa.o();
            if (o == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = o;
            jArr2[i2] = wpa.o();
            wpa.H(2);
            i2++;
        }
        wpa.H((int) (j - ((long) wpa.b)));
        return new h7b(jArr, jArr2, false, 19);
    }

    public static final void t(h23 h23, Object obj, String str, Integer num) {
        try {
            Field declaredField = h23.a().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, num);
        } catch (Throwable unused) {
        }
    }

    public static void y(s02 s02) {
        s02.t(3);
        s02.t(8);
        boolean h2 = s02.h();
        boolean h3 = s02.h();
        if (h2) {
            s02.t(5);
        }
        if (h3) {
            s02.t(6);
        }
    }

    public static void z(s02 s02) {
        int i;
        int i2 = s02.i(2);
        int i3 = 6;
        if (i2 == 0) {
            s02.t(6);
            return;
        }
        int i4 = 5;
        int r = r(s02, 5, 8, 16) + 1;
        if (i2 == 1) {
            s02.t(r * 7);
        } else if (i2 == 2) {
            boolean h2 = s02.h();
            int i5 = h2 ? 1 : 5;
            if (h2) {
                i4 = 7;
            }
            if (h2) {
                i3 = 8;
            }
            int i6 = 0;
            while (i6 < r) {
                if (s02.h()) {
                    s02.t(7);
                    i = 0;
                } else {
                    if (s02.i(2) == 3 && s02.i(i4) * i5 != 0) {
                        s02.s();
                    }
                    i = s02.i(i3) * i5;
                    if (!(i == 0 || i == 180)) {
                        s02.s();
                    }
                    s02.s();
                }
                if (!(i == 0 || i == 180 || !s02.h())) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public abstract void k(int i);

    public abstract boolean m();

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract void w();

    public abstract void x(int i);
}
